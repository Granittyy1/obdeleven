package io.intercom.android.nexus;

import J4.n;
import androidx.compose.ui.graphics.colorspace.s;
import com.intercom.twig.Twig;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import okhttp3.D;
import okhttp3.E;
import okhttp3.Protocol;
import okhttp3.internal.connection.e;
import okhttp3.m;
import okhttp3.t;
import okhttp3.u;
import okhttp3.z;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;
import p294xb.d;

/* JADX INFO: loaded from: classes3.dex */
class NexusSocket {
    private static final D CLOSED_SOCKET = new D() { // from class: io.intercom.android.nexus.NexusSocket.4
        @Override // okhttp3.D
        public boolean close(int i10, String str) {
            return false;
        }

        public long queueSize() {
            return 0L;
        }

        public u request() {
            throw new NullPointerException("ClosedSocket has no request");
        }

        @Override // okhttp3.D
        public boolean send(String str) {
            return false;
        }

        public boolean send(ByteString byteString) {
            return false;
        }

        public void cancel() {
        }
    };
    private static final String HEADER = "?X-Nexus-Version=android.1.3.0";
    private static final int MAX_RECONNECT_TIME_SECONDS = 900;
    private static final int N_TIMEOUT_DISCONNECT = 4001;
    private static final int OK_CLIENT_DISCONNECT = 4000;
    private final t client;
    private final long connectionTimeoutSeconds;
    private final NexusListener listener;
    private ScheduledFuture reconnectFuture;
    private final boolean shouldSendPing;
    private final ScheduledExecutorService timeoutExecutor;
    private ScheduledFuture timeoutFuture;
    private final NexusTopicProvider topicProvider;
    private final Twig twig;
    private final String url;
    private D socket = CLOSED_SOCKET;
    private final Runnable timeoutRunnable = new Runnable() { // from class: io.intercom.android.nexus.NexusSocket.1
        @Override // java.lang.Runnable
        public void run() {
            NexusSocket.this.timedOut();
        }
    };
    private long lastReconnectAt = 0;
    private int reconnectAttempts = 0;
    private final E webSocketListener = new E() { // from class: io.intercom.android.nexus.NexusSocket.3
        private void parseJsonString(String str) {
            if (str.isEmpty() || str.equals(" ") || str.endsWith("|")) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("eventName");
                if (strOptString.isEmpty() || strOptString.equals("ACK")) {
                    NexusSocket.this.twig.internal("onMessage ACK: ".concat(str));
                } else {
                    NexusSocket.this.twig.internal("onMessage TEXT: ".concat(str));
                    NexusSocket.this.listener.notifyEvent(new NexusEvent(jSONObject));
                }
            } catch (JSONException e10) {
                NexusSocket.this.twig.internal("onMessage: json parse exception for message: '" + str + " " + e10);
            }
        }

        @Override // okhttp3.E
        public void onClosed(D d10, int i10, String str) {
            if (i10 != NexusSocket.OK_CLIENT_DISCONNECT) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            NexusSocket.this.twig.internal("onClose code: " + i10 + " reason: " + str);
        }

        @Override // okhttp3.E
        public void onClosing(D d10, int i10, String str) {
            NexusSocket.this.twig.internal("Server requested close:  " + i10 + " - '" + str + "'");
            d10.close(i10, str);
        }

        @Override // okhttp3.E
        public void onFailure(D d10, Throwable th, z zVar) {
            if (NexusSocket.shouldReconnectFromFailure(zVar)) {
                NexusSocket.this.scheduleReconnect();
            } else {
                NexusSocket.this.shutdown();
            }
            NexusSocket.this.twig.internal("onFailure: " + th.getMessage());
            NexusSocket.this.listener.onConnectFailed();
        }

        @Override // okhttp3.E
        public void onMessage(D d10, String str) {
            NexusSocket.this.resetTimeout();
            parseJsonString(str);
        }

        @Override // okhttp3.E
        public void onOpen(D d10, z zVar) {
            NexusSocket.this.twig.internal("onOpen: " + zVar.f45682d);
            NexusSocket.this.socket = d10;
            NexusSocket.this.resetTimeout();
            List<String> topics = NexusSocket.this.topicProvider.getTopics();
            if (!topics.isEmpty()) {
                NexusSocket.this.fire(NexusEvent.getSubscribeEvent(topics).toStringEncodedJsonObject());
            }
            if (NexusSocket.this.shouldSendPing) {
                NexusSocket.this.fire(NexusEvent.getPingEvent().toStringEncodedJsonObject());
            }
            NexusSocket.this.listener.onConnect();
        }

        @Override // okhttp3.E
        public void onMessage(D d10, ByteString byteString) {
            NexusSocket.this.twig.internal("Received bytes message " + byteString + ", resetting timeout");
            NexusSocket.this.resetTimeout();
        }
    };

    public NexusSocket(String str, int i10, boolean z10, Twig twig, ScheduledExecutorService scheduledExecutorService, t tVar, NexusListener nexusListener, NexusTopicProvider nexusTopicProvider) {
        this.url = str;
        this.connectionTimeoutSeconds = i10;
        this.shouldSendPing = z10;
        this.twig = twig;
        this.listener = nexusListener;
        this.topicProvider = nexusTopicProvider;
        this.client = tVar;
        this.timeoutExecutor = scheduledExecutorService;
    }

    public static long calculateReconnectTimerInSeconds(int i10) {
        int iMin = (int) Math.min(Math.pow(2.0d, i10), 900.0d);
        return new Random().nextInt(iMin + 1) + iMin;
    }

    private void modifyReconnectAttempts() {
        if (System.currentTimeMillis() - this.lastReconnectAt > TimeUnit.SECONDS.toMillis(900L) * 2) {
            this.twig.d("resetting reconnection attempts", new Object[0]);
            this.reconnectAttempts = 1;
        } else {
            this.twig.d("incrementing reconnection attempts", new Object[0]);
            this.reconnectAttempts++;
        }
        this.lastReconnectAt = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetTimeout() {
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleReconnect() {
        if (this.reconnectFuture != null) {
            return;
        }
        modifyReconnectAttempts();
        long jCalculateReconnectTimerInSeconds = calculateReconnectTimerInSeconds(this.reconnectAttempts);
        Twig twig = this.twig;
        StringBuilder sbF = n.f("Scheduling reconnect in: ", " for attempt: ", jCalculateReconnectTimerInSeconds);
        sbF.append(this.reconnectAttempts);
        twig.internal(sbF.toString());
        this.reconnectFuture = this.timeoutExecutor.schedule(new Runnable() { // from class: io.intercom.android.nexus.NexusSocket.2
            @Override // java.lang.Runnable
            public void run() {
                NexusSocket.this.connect();
                NexusSocket.this.reconnectFuture = null;
            }
        }, jCalculateReconnectTimerInSeconds, TimeUnit.SECONDS);
    }

    public static boolean shouldReconnectFromFailure(z zVar) {
        if (zVar == null) {
            return true;
        }
        int i10 = zVar.f45683e;
        return i10 >= 500 && i10 <= 599;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void shutdown() {
        this.socket = CLOSED_SOCKET;
        ScheduledFuture scheduledFuture = this.timeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.listener.onShutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void timedOut() {
        if (this.socket == CLOSED_SOCKET) {
            scheduleReconnect();
        } else {
            disconnect(N_TIMEOUT_DISCONNECT, "Socket timed out");
        }
        this.listener.onConnectFailed();
    }

    public void connect() {
        this.twig.d("connecting to a socket...", new Object[0]);
        u.a aVar = new u.a();
        aVar.g(this.url + HEADER);
        u request = aVar.a();
        t tVar = this.client;
        E listener = this.webSocketListener;
        tVar.getClass();
        i.e(request, "request");
        i.e(listener, "listener");
        d dVar = new d(p184ob.d.f45260h, request, listener, new Random(), 0, tVar.f45609A);
        if (request.f45663c.e("Sec-WebSocket-Extensions") != null) {
            dVar.b(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            t.a aVarB = tVar.b();
            m.a eventListener = m.f45561a;
            i.e(eventListener, "eventListener");
            aVarB.f45640e = new s(4, eventListener);
            List<Protocol> protocols = d.f47949w;
            i.e(protocols, "protocols");
            ArrayList arrayListP0 = q.p0(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayListP0.contains(protocol) && !arrayListP0.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListP0).toString());
            }
            if (arrayListP0.contains(protocol) && arrayListP0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListP0).toString());
            }
            if (arrayListP0.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListP0).toString());
            }
            if (arrayListP0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayListP0.remove(Protocol.SPDY_3);
            if (!arrayListP0.equals(aVarB.f45653s)) {
                aVarB.f45635A = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(arrayListP0);
            i.d(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            aVarB.f45653s = listUnmodifiableList;
            t tVar2 = new t(aVarB);
            u.a aVarB2 = request.b();
            aVarB2.c("Upgrade", "websocket");
            aVarB2.c("Connection", "Upgrade");
            aVarB2.c("Sec-WebSocket-Key", dVar.f47955f);
            aVarB2.c("Sec-WebSocket-Version", "13");
            aVarB2.c("Sec-WebSocket-Extensions", "permessage-deflate");
            u uVarA = aVarB2.a();
            e eVar = new e(tVar2, uVarA, true);
            dVar.f47956g = eVar;
            eVar.C(new p294xb.e(dVar, uVarA));
        }
        this.timeoutFuture = this.timeoutExecutor.schedule(this.timeoutRunnable, this.connectionTimeoutSeconds, TimeUnit.SECONDS);
    }

    public void disconnect() {
        disconnect(OK_CLIENT_DISCONNECT, "Disconnect called by client");
    }

    public void fire(String str) {
        if (str.isEmpty()) {
            return;
        }
        try {
            this.twig.internal("firing: ".concat(str));
            this.socket.send(str);
        } catch (IllegalStateException e10) {
            this.twig.internal("Error when firing '" + str + "': " + e10);
        }
    }

    public boolean isConnected() {
        return this.socket != CLOSED_SOCKET;
    }

    private void disconnect(int i10, String str) {
        if (this.socket.close(i10, str)) {
            return;
        }
        this.twig.internal("Could not close socket while disconnecting, it may be already closed");
    }
}
