package io.intercom.android.nexus;

import com.intercom.twig.Twig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import okhttp3.t;
import p172nb.b;

/* JADX INFO: loaded from: classes3.dex */
public class NexusClient implements NexusTopicProvider {
    private ScheduledExecutorService backgroundTaskExecutor;
    private final t client;
    private final NexusEventPropagator eventPropagator;
    private ScheduledFuture future;
    private long heartbeatInterval;
    private final List<NexusSocket> sockets;
    private final List<String> topics;
    private final Twig twig;

    public static class NexusThreadFactory implements ThreadFactory {
        private final ThreadFactory defaultFactory;
        private int threadCount;

        private NexusThreadFactory() {
            this.defaultFactory = Executors.defaultThreadFactory();
            this.threadCount = 0;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.defaultFactory.newThread(runnable);
            this.threadCount++;
            threadNewThread.setName("IntercomNexus-" + this.threadCount);
            return threadNewThread;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NexusClient(Twig twig) {
        t.a aVarDefaultOkHttpClientBuilder = defaultOkHttpClientBuilder();
        aVarDefaultOkHttpClientBuilder.getClass();
        this(twig, new t(aVarDefaultOkHttpClientBuilder));
    }

    public static t.a defaultOkHttpClientBuilder() {
        t.a aVar = new t.a();
        TimeUnit unit = TimeUnit.SECONDS;
        i.e(unit, "unit");
        aVar.f45658x = b.b(130L, unit);
        aVar.f45659y = b.b(130L, unit);
        aVar.f45657w = b.b(20L, unit);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void schedulePing() {
        if (this.heartbeatInterval > 0) {
            this.future = this.backgroundTaskExecutor.schedule(new Runnable() { // from class: io.intercom.android.nexus.NexusClient.1
                @Override // java.lang.Runnable
                public void run() {
                    NexusClient.this.fire(NexusEvent.getPingEvent());
                    NexusClient.this.schedulePing();
                }
            }, this.heartbeatInterval, TimeUnit.SECONDS);
        }
    }

    private void subscribeToTopics(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        fire(NexusEvent.getSubscribeEvent(list));
    }

    private void unSubscribeFromTopics(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        fire(NexusEvent.getUnsubscribeEvent(list));
    }

    public void addEventListener(NexusListener nexusListener) {
        this.eventPropagator.addListener(nexusListener);
    }

    public synchronized void addTopics(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        subscribeToTopics(arrayList);
        this.topics.addAll(arrayList);
    }

    public synchronized void clearTopics() {
        unSubscribeFromTopics(this.topics);
        this.topics.clear();
    }

    public void connect(NexusConfig nexusConfig, boolean z10) {
        if (nexusConfig.getEndpoints().isEmpty()) {
            this.twig.e("No endpoints present", new Object[0]);
            return;
        }
        if (this.backgroundTaskExecutor == null) {
            this.backgroundTaskExecutor = Executors.newScheduledThreadPool(nexusConfig.getEndpoints().size() + 1, new NexusThreadFactory());
        }
        for (String str : nexusConfig.getEndpoints()) {
            this.twig.i("Adding socket", new Object[0]);
            NexusSocket nexusSocket = new NexusSocket(str, nexusConfig.getConnectionTimeout(), z10, this.twig, this.backgroundTaskExecutor, this.client, this.eventPropagator, this);
            nexusSocket.connect();
            this.sockets.add(nexusSocket);
        }
        this.heartbeatInterval = nexusConfig.getPresenceHeartbeatInterval();
        if (z10) {
            schedulePing();
        }
    }

    public synchronized void disconnect() {
        try {
            if (!this.sockets.isEmpty()) {
                for (NexusSocket nexusSocket : this.sockets) {
                    this.twig.i("disconnecting socket", new Object[0]);
                    nexusSocket.disconnect();
                }
                this.sockets.clear();
                this.twig.i("client disconnected", new Object[0]);
            }
            ScheduledFuture scheduledFuture = this.future;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void fire(NexusEvent nexusEvent) {
        this.eventPropagator.cacheEvent(nexusEvent);
        String stringEncodedJsonObject = nexusEvent.toStringEncodedJsonObject();
        if (!stringEncodedJsonObject.isEmpty()) {
            Iterator<NexusSocket> it = this.sockets.iterator();
            while (it.hasNext()) {
                it.next().fire(stringEncodedJsonObject);
            }
        }
    }

    @Override // io.intercom.android.nexus.NexusTopicProvider
    public synchronized List<String> getTopics() {
        return this.topics;
    }

    public synchronized boolean isConnected() {
        Iterator<NexusSocket> it = this.sockets.iterator();
        while (it.hasNext()) {
            if (it.next().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public synchronized void localUpdate(NexusEvent nexusEvent) {
        this.eventPropagator.notifyEvent(nexusEvent);
    }

    public void removeEventListener(NexusListener nexusListener) {
        this.eventPropagator.removeListener(nexusListener);
    }

    public synchronized void removeTopics(List<String> list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (this.topics.contains(str)) {
                    arrayList.add(str);
                }
            }
            unSubscribeFromTopics(arrayList);
            this.topics.removeAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setTopics(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.removeAll(this.topics);
        ArrayList arrayList2 = new ArrayList(this.topics);
        arrayList2.removeAll(list);
        subscribeToTopics(arrayList);
        unSubscribeFromTopics(arrayList2);
        this.topics.clear();
        this.topics.addAll(list);
    }

    public NexusClient(Twig twig, t tVar) {
        this(twig, tVar, new NexusEventPropagator(twig));
    }

    public NexusClient(Twig twig, t tVar, NexusEventPropagator nexusEventPropagator) {
        this.sockets = new ArrayList();
        this.topics = new ArrayList();
        this.twig = twig;
        this.eventPropagator = nexusEventPropagator;
        this.client = tVar;
    }
}
