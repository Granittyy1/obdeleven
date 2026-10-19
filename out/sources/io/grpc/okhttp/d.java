package io.grpc.okhttp;

import A8.A;
import A8.p;
import C.g;
import D9.r;
import E9.a.d;
import J4.i;
import com.braze.support.BrazeLogger;
import io.grpc.ChannelLogger;
import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.MethodDescriptor;
import io.grpc.SecurityLevel;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.InterfaceC2236o;
import io.grpc.internal.InterfaceC2238p;
import io.grpc.internal.InterfaceC2239p0;
import io.grpc.internal.InterfaceC2243s;
import io.grpc.internal.J0;
import io.grpc.internal.KeepAliveManager;
import io.grpc.internal.N;
import io.grpc.internal.O0;
import io.grpc.internal.Q;
import io.grpc.internal.RunnableC2211b0;
import io.grpc.internal.S;
import io.grpc.internal.T;
import io.grpc.internal.U;
import io.grpc.internal.U0;
import io.grpc.m;
import io.grpc.okhttp.e.b;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okio.ByteString;
import p237t3.x;
import p318zb.B;
import p318zb.C;
import p318zb.C2837d;
import p318zb.C2839f;
import p318zb.H;
import p318zb.I;
import p318zb.v;

/* JADX INFO: compiled from: OkHttpClientTransport.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC2243s {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Map<ErrorCode, Status> f37869P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Logger f37870Q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final SocketFactory f37871A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final SSLSocketFactory f37872B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f37873C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final LinkedList f37874D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final io.grpc.okhttp.internal.a f37875E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public KeepAliveManager f37876F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f37877G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f37878H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f37879I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final io.grpc.okhttp.b f37880J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f37881K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final U0 f37882L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final a f37883M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final HttpConnectProxiedSocketAddress f37884N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f37885O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f37886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f37889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GrpcUtil.d f37890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F9.e f37892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U.e f37893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.grpc.okhttp.a f37894i;
    public e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f37895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f37896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f37898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Executor f37899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J0 f37900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f37901q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f37902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f37903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RunnableC0396d f37904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public io.grpc.a f37905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Status f37906v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f37907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public T f37908x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f37909y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f37910z;

    /* JADX INFO: compiled from: OkHttpClientTransport.java */
    public class a extends E3.b {
        public a() {
            super(4);
        }

        @Override // E3.b
        public final void A() {
            d.this.f37893h.a(true);
        }

        @Override // E3.b
        public final void C() {
            d.this.f37893h.a(false);
        }
    }

    /* JADX INFO: compiled from: OkHttpClientTransport.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.getClass();
            d dVar = d.this;
            dVar.f37899o.execute(dVar.f37904t);
            synchronized (d.this.f37895k) {
                d dVar2 = d.this;
                dVar2.f37873C = BrazeLogger.SUPPRESS;
                dVar2.s();
            }
            d.this.getClass();
        }
    }

    /* JADX INFO: renamed from: io.grpc.okhttp.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OkHttpClientTransport.java */
    public class RunnableC0396d implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final F9.a f37917c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OkHttpFrameLogger f37916b = new OkHttpFrameLogger(Level.FINE);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f37918d = true;

        public RunnableC0396d(F9.a aVar) {
            this.f37917c = aVar;
        }

        public final void a(boolean z10, int i10, C c10, int i11) throws IOException {
            io.grpc.okhttp.c cVar;
            this.f37916b.b(OkHttpFrameLogger.Direction.f37834b, i10, c10.f49038c, i11, z10);
            d dVar = d.this;
            synchronized (dVar.f37895k) {
                cVar = (io.grpc.okhttp.c) dVar.f37898n.get(Integer.valueOf(i10));
            }
            if (cVar != null) {
                long j = i11;
                c10.N0(j);
                C2839f c2839f = new C2839f();
                c2839f.t0(c10.f49038c, j);
                p111ia.c cVar2 = cVar.f37847l.f37860I;
                p111ia.b.f36850a.getClass();
                synchronized (d.this.f37895k) {
                    cVar.f37847l.p(c2839f, z10);
                }
            } else {
                if (!d.this.l(i10)) {
                    d.a(d.this, "Received data for unknown stream: " + i10);
                    return;
                }
                synchronized (d.this.f37895k) {
                    d.this.f37894i.Y0(i10, ErrorCode.STREAM_CLOSED);
                }
                c10.skip(i11);
            }
            d dVar2 = d.this;
            int i12 = dVar2.f37903s + i11;
            dVar2.f37903s = i12;
            if (i12 >= dVar2.f37891f * 0.5f) {
                synchronized (dVar2.f37895k) {
                    d dVar3 = d.this;
                    dVar3.f37894i.Q(0, dVar3.f37903s);
                }
                d.this.f37903s = 0;
            }
        }

        public final void b(int i10, ErrorCode errorCode, ByteString byteString) {
            this.f37916b.c(OkHttpFrameLogger.Direction.f37834b, i10, errorCode, byteString);
            ErrorCode errorCode2 = ErrorCode.ENHANCE_YOUR_CALM;
            d dVar = d.this;
            if (errorCode == errorCode2) {
                String strV = byteString.v();
                d.f37870Q.log(Level.WARNING, this + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strV);
                if ("too_many_pings".equals(strV)) {
                    dVar.f37880J.run();
                }
            }
            Status statusB = GrpcUtil.Http2Error.a(errorCode.httpCode).b("Received Goaway");
            if (byteString.e() > 0) {
                statusB = statusB.b(byteString.v());
            }
            Map<ErrorCode, Status> map = d.f37869P;
            dVar.r(i10, null, statusB);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x009e  */
        public final void c(boolean z10, int i10, ArrayList arrayList) {
            Status statusH;
            OkHttpFrameLogger okHttpFrameLogger = this.f37916b;
            OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.f37834b;
            if (okHttpFrameLogger.a()) {
                okHttpFrameLogger.f37832a.log(okHttpFrameLogger.f37833b, direction + " HEADERS: streamId=" + i10 + " headers=" + arrayList + " endStream=" + z10);
            }
            boolean z11 = false;
            if (d.this.f37881K != Integer.MAX_VALUE) {
                long jE = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    F9.c cVar = (F9.c) arrayList.get(i11);
                    jE += (long) (cVar.f3289b.e() + cVar.f3288a.e() + 32);
                }
                int iMin = (int) Math.min(jE, 2147483647L);
                int i12 = d.this.f37881K;
                if (iMin > i12) {
                    Status status = Status.j;
                    Locale locale = Locale.US;
                    statusH = status.h("Response " + (z10 ? "trailer" : "header") + " metadata larger than " + i12 + ": " + iMin);
                } else {
                    statusH = null;
                }
            } else {
                statusH = null;
            }
            synchronized (d.this.f37895k) {
                try {
                    io.grpc.okhttp.c cVar2 = (io.grpc.okhttp.c) d.this.f37898n.get(Integer.valueOf(i10));
                    if (cVar2 == null) {
                        if (d.this.l(i10)) {
                            d.this.f37894i.Y0(i10, ErrorCode.STREAM_CLOSED);
                        } else {
                            z11 = true;
                        }
                    } else if (statusH == null) {
                        p111ia.c cVar3 = cVar2.f37847l.f37860I;
                        p111ia.b.f36850a.getClass();
                        cVar2.f37847l.q(arrayList, z10);
                    } else {
                        if (!z10) {
                            d.this.f37894i.Y0(i10, ErrorCode.CANCEL);
                        }
                        cVar2.f37847l.h(statusH, ClientStreamListener.RpcProgress.f37134b, false, new m());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z11) {
                d.a(d.this, "Received header for unknown stream: " + i10);
            }
        }

        public final void d(int i10, int i11, boolean z10) {
            T t8;
            long j = (((long) i10) << 32) | (((long) i11) & 4294967295L);
            this.f37916b.d(OkHttpFrameLogger.Direction.f37834b, j);
            if (!z10) {
                synchronized (d.this.f37895k) {
                    d.this.f37894i.W(i10, i11, true);
                }
                return;
            }
            synchronized (d.this.f37895k) {
                try {
                    d dVar = d.this;
                    t8 = dVar.f37908x;
                    if (t8 != null) {
                        long j10 = t8.f37442a;
                        if (j10 == j) {
                            dVar.f37908x = null;
                        } else {
                            Logger logger = d.f37870Q;
                            Level level = Level.WARNING;
                            Locale locale = Locale.US;
                            logger.log(level, "Received unexpected ping ack. Expecting " + j10 + ", got " + j);
                        }
                    } else {
                        d.f37870Q.warning("Received unexpected ping ack. No ping outstanding");
                    }
                    t8 = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (t8 != null) {
                synchronized (t8) {
                    try {
                        if (!t8.f37445d) {
                            t8.f37445d = true;
                            long jA = t8.f37443b.a(TimeUnit.NANOSECONDS);
                            t8.f37447f = jA;
                            LinkedHashMap linkedHashMap = t8.f37444c;
                            t8.f37444c = null;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                try {
                                    ((Executor) entry.getValue()).execute(new Q((InterfaceC2238p.a) entry.getKey(), jA));
                                } catch (Throwable th2) {
                                    T.f37441g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }

        public final void e(ArrayList arrayList, int i10, int i11) throws IOException {
            OkHttpFrameLogger okHttpFrameLogger = this.f37916b;
            OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.f37834b;
            if (okHttpFrameLogger.a()) {
                okHttpFrameLogger.f37832a.log(okHttpFrameLogger.f37833b, direction + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + arrayList);
            }
            synchronized (d.this.f37895k) {
                d.this.f37894i.Y0(i10, ErrorCode.PROTOCOL_ERROR);
            }
        }

        public final void f(int i10, ErrorCode errorCode) {
            this.f37916b.e(OkHttpFrameLogger.Direction.f37834b, i10, errorCode);
            Status statusB = d.v(errorCode).b("Rst Stream");
            Status.Code code = statusB.f36908a;
            boolean z10 = code == Status.Code.CANCELLED || code == Status.Code.DEADLINE_EXCEEDED;
            synchronized (d.this.f37895k) {
                try {
                    io.grpc.okhttp.c cVar = (io.grpc.okhttp.c) d.this.f37898n.get(Integer.valueOf(i10));
                    if (cVar != null) {
                        p111ia.c cVar2 = cVar.f37847l.f37860I;
                        p111ia.b.f36850a.getClass();
                        d.this.h(i10, statusB, errorCode == ErrorCode.REFUSED_STREAM ? ClientStreamListener.RpcProgress.f37135c : ClientStreamListener.RpcProgress.f37134b, z10, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void g(x xVar) {
            boolean z10;
            this.f37916b.f(OkHttpFrameLogger.Direction.f37834b, xVar);
            synchronized (d.this.f37895k) {
                try {
                    if (xVar.a(4)) {
                        d.this.f37873C = ((int[]) xVar.f47256b)[4];
                    }
                    if (xVar.a(7)) {
                        int i10 = ((int[]) xVar.f47256b)[7];
                        e eVar = d.this.j;
                        if (i10 < 0) {
                            eVar.getClass();
                            throw new IllegalArgumentException(i.b(i10, "Invalid initial window size: "));
                        }
                        int i11 = i10 - eVar.f37922c;
                        eVar.f37922c = i10;
                        z10 = false;
                        for (e.b bVar : eVar.f37920a.i()) {
                            bVar.a(i11);
                        }
                        if (i11 > 0) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (this.f37918d) {
                        U.e eVar2 = d.this.f37893h;
                        U u10 = U.this;
                        u10.f37456i.a(ChannelLogger.ChannelLogLevel.f36863c, "READY");
                        u10.j.execute(new RunnableC2211b0(eVar2));
                        this.f37918d = false;
                    }
                    d.this.f37894i.D(xVar);
                    if (z10) {
                        d.this.j.c();
                    }
                    d.this.s();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0070  */
        /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:35:0x0070, please report this as an issue */
        public final void h(int i10, long j) {
            boolean z10;
            e.b bVar;
            this.f37916b.g(OkHttpFrameLogger.Direction.f37834b, i10, j);
            if (j == 0) {
                if (i10 == 0) {
                    d.a(d.this, "Received 0 flow control window increment.");
                    return;
                } else {
                    d.this.h(i10, Status.f36904k.h("Received 0 flow control window increment."), ClientStreamListener.RpcProgress.f37134b, false, ErrorCode.PROTOCOL_ERROR, null);
                    return;
                }
            }
            synchronized (d.this.f37895k) {
                try {
                    if (i10 == 0) {
                        d.this.j.b(null, (int) j);
                        return;
                    }
                    io.grpc.okhttp.c cVar = (io.grpc.okhttp.c) d.this.f37898n.get(Integer.valueOf(i10));
                    if (cVar == null) {
                        z10 = d.this.l(i10) ? false : true;
                        if (z10) {
                            d.a(d.this, "Received window_update for unknown stream: " + i10);
                        }
                    }
                    e eVar = d.this.j;
                    io.grpc.okhttp.c.b bVar2 = cVar.f37847l;
                    synchronized (bVar2.f37865w) {
                        bVar = bVar2.f37861J;
                    }
                    eVar.b(bVar, (int) j);
                    if (z10) {
                        d.a(d.this, "Received window_update for unknown stream: " + i10);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            Status statusH;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (((F9.e.c) this.f37917c).b(this)) {
                try {
                    KeepAliveManager keepAliveManager = d.this.f37876F;
                    if (keepAliveManager != null) {
                        keepAliveManager.a();
                    }
                } catch (Throwable th) {
                    try {
                        d dVar2 = d.this;
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        Status statusG = Status.f36904k.h("error in frame handler").g(th);
                        Map<ErrorCode, Status> map = d.f37869P;
                        dVar2.r(0, errorCode, statusG);
                        try {
                            ((F9.e.c) this.f37917c).close();
                        } catch (IOException e10) {
                            d.f37870Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e10);
                        }
                        dVar = d.this;
                    } finally {
                        try {
                            ((F9.e.c) this.f37917c).close();
                        } catch (IOException e11) {
                            d.f37870Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e11);
                        }
                        d.this.f37893h.c();
                        Thread.currentThread().setName(name);
                    }
                }
            }
            synchronized (d.this.f37895k) {
                statusH = d.this.f37906v;
            }
            if (statusH == null) {
                statusH = Status.f36905l.h("End of stream or IOException");
            }
            d.this.r(0, ErrorCode.INTERNAL_ERROR, statusH);
            try {
                ((F9.e.c) this.f37917c).close();
            } catch (IOException e12) {
                d.f37870Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e12);
            }
            dVar = d.this;
            U.e eVar = dVar.f37893h;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(ErrorCode.class);
        ErrorCode errorCode = ErrorCode.NO_ERROR;
        Status status = Status.f36904k;
        enumMap.put(errorCode, status.h("No error: A GRPC status of OK should have been sent"));
        enumMap.put(ErrorCode.PROTOCOL_ERROR, status.h("Protocol error"));
        enumMap.put(ErrorCode.INTERNAL_ERROR, status.h("Internal error"));
        enumMap.put(ErrorCode.FLOW_CONTROL_ERROR, status.h("Flow control error"));
        enumMap.put(ErrorCode.STREAM_CLOSED, status.h("Stream closed"));
        enumMap.put(ErrorCode.FRAME_TOO_LARGE, status.h("Frame too large"));
        enumMap.put(ErrorCode.REFUSED_STREAM, Status.f36905l.h("Refused stream"));
        enumMap.put(ErrorCode.CANCEL, Status.f36900f.h("Cancelled"));
        enumMap.put(ErrorCode.COMPRESSION_ERROR, status.h("Compression error"));
        enumMap.put(ErrorCode.CONNECT_ERROR, status.h("Connect error"));
        enumMap.put(ErrorCode.ENHANCE_YOUR_CALM, Status.j.h("Enhance your calm"));
        enumMap.put(ErrorCode.INADEQUATE_SECURITY, Status.f36903i.h("Inadequate security"));
        f37869P = Collections.unmodifiableMap(enumMap);
        f37870Q = Logger.getLogger(d.class.getName());
    }

    public d() {
        throw null;
    }

    public d(OkHttpChannelBuilder.d dVar, InetSocketAddress inetSocketAddress, String str, io.grpc.a aVar, HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress, io.grpc.okhttp.b bVar) {
        GrpcUtil.d dVar2 = GrpcUtil.f37215r;
        F9.e eVar = new F9.e();
        this.f37889d = new Random();
        Object obj = new Object();
        this.f37895k = obj;
        this.f37898n = new HashMap();
        this.f37873C = 0;
        this.f37874D = new LinkedList();
        this.f37883M = new a();
        this.f37885O = 30000;
        p.j(inetSocketAddress, "address");
        this.f37886a = inetSocketAddress;
        this.f37887b = str;
        this.f37902r = dVar.f37826i;
        this.f37891f = dVar.f37829m;
        Executor executor = dVar.f37820c;
        p.j(executor, "executor");
        this.f37899o = executor;
        this.f37900p = new J0(dVar.f37820c);
        ScheduledExecutorService scheduledExecutorService = dVar.f37822e;
        p.j(scheduledExecutorService, "scheduledExecutorService");
        this.f37901q = scheduledExecutorService;
        this.f37897m = 3;
        this.f37871A = SocketFactory.getDefault();
        this.f37872B = dVar.f37824g;
        io.grpc.okhttp.internal.a aVar2 = dVar.f37825h;
        p.j(aVar2, "connectionSpec");
        this.f37875E = aVar2;
        p.j(dVar2, "stopwatchFactory");
        this.f37890e = dVar2;
        this.f37892g = eVar;
        this.f37888c = "grpc-java-okhttp/1.57.2";
        this.f37884N = httpConnectProxiedSocketAddress;
        this.f37880J = bVar;
        this.f37881K = dVar.f37830n;
        dVar.f37823f.getClass();
        this.f37882L = new U0(0);
        this.f37896l = r.a(d.class, inetSocketAddress.toString());
        io.grpc.a aVar3 = io.grpc.a.f36932b;
        io.grpc.a.b<io.grpc.a> bVar2 = N.f37424b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(bVar2, aVar);
        for (Map.Entry<io.grpc.a.b<?>, Object> entry : aVar3.f36933a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f37905u = new io.grpc.a(identityHashMap);
        synchronized (obj) {
        }
    }

    public static void a(d dVar, String str) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        dVar.getClass();
        dVar.r(0, errorCode, v(errorCode).b(str));
    }

    public static Socket f(d dVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException {
        dVar.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = dVar.f37871A;
            Socket socketCreateSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(dVar.f37885O);
                C2837d c2837dE = v.e(socketCreateSocket);
                B bA = v.a(v.d(socketCreateSocket));
                G9.b bVarG = dVar.g(inetSocketAddress, str, str2);
                io.grpc.okhttp.internal.c cVar = bVarG.f3586b;
                G9.a aVar = bVarG.f3585a;
                Locale locale = Locale.US;
                bA.Z("CONNECT " + aVar.f3579a + ":" + aVar.f3580b + " HTTP/1.1");
                bA.Z("\r\n");
                int length = cVar.f37998a.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    String[] strArr = cVar.f37998a;
                    bA.Z((i11 < 0 || i11 >= strArr.length) ? null : strArr[i11]);
                    bA.Z(": ");
                    int i12 = i11 + 1;
                    bA.Z((i12 < 0 || i12 >= strArr.length) ? null : strArr[i12]);
                    bA.Z("\r\n");
                }
                bA.Z("\r\n");
                bA.flush();
                io.grpc.okhttp.internal.i iVarA = io.grpc.okhttp.internal.i.a(o(c2837dE));
                while (!o(c2837dE).equals("")) {
                }
                int i13 = iVarA.f38018b;
                if (i13 >= 200 && i13 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                C2839f c2839f = new C2839f();
                try {
                    socketCreateSocket.shutdownOutput();
                    c2837dE.l0(c2839f, 1024L);
                } catch (IOException e10) {
                    c2839f.f1("Unable to read body: " + e10.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new StatusException(Status.f36905l.h("Response returned from proxy was not successful (expected 2xx, got " + i13 + " " + iVarA.f38019c + "). Response body:\n" + c2839f.r0()));
            } catch (IOException e11) {
                e = e11;
                socket = socketCreateSocket;
                if (socket != null) {
                    GrpcUtil.b(socket);
                }
                throw new StatusException(Status.f36905l.h("Failed trying to connect with proxy").g(e));
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    public static String o(C2837d c2837d) throws IOException {
        C2839f c2839f = new C2839f();
        while (c2837d.l0(c2839f, 1L) != -1) {
            if (c2839f.p(c2839f.f49074c - 1) == 10) {
                if (Long.MAX_VALUE < 0) {
                    throw new IllegalArgumentException(com.google.gson.internal.b.b(Long.MAX_VALUE, "limit < 0: ").toString());
                }
                long j = Long.MAX_VALUE != Long.MAX_VALUE ? Long.MAX_VALUE + 1 : Long.MAX_VALUE;
                long jS = c2839f.s((byte) 10, 0L, j);
                if (jS != -1) {
                    return okio.internal.a.a(c2839f, jS);
                }
                if (j < c2839f.f49074c && c2839f.p(j - 1) == 13 && c2839f.p(j) == 10) {
                    return okio.internal.a.a(c2839f, j);
                }
                C2839f c2839f2 = new C2839f();
                c2839f.i(c2839f2, 0L, Math.min(32, c2839f.f49074c));
                throw new EOFException("\\n not found: limit=" + Math.min(c2839f.f49074c, Long.MAX_VALUE) + " content=" + c2839f2.R(c2839f2.f49074c).f() + (char) 8230);
            }
        }
        throw new EOFException("\\n not found: " + c2839f.R(c2839f.f49074c).f());
    }

    public static Status v(ErrorCode errorCode) {
        Status status = f37869P.get(errorCode);
        if (status != null) {
            return status;
        }
        return Status.f36901g.h("Unknown http2 error code: " + errorCode.httpCode);
    }

    @Override // io.grpc.internal.InterfaceC2238p
    public final InterfaceC2236o b(MethodDescriptor methodDescriptor, m mVar, io.grpc.b bVar, io.grpc.c[] cVarArr) throws Throwable {
        p.j(methodDescriptor, "method");
        p.j(mVar, "headers");
        io.grpc.a aVar = this.f37905u;
        O0 o10 = new O0(cVarArr);
        for (io.grpc.c cVar : cVarArr) {
            cVar.m0(aVar, mVar);
        }
        synchronized (this.f37895k) {
            try {
                try {
                    return new io.grpc.okhttp.c(methodDescriptor, mVar, this.f37894i, this, this.j, this.f37895k, this.f37902r, this.f37891f, this.f37887b, this.f37888c, o10, this.f37882L, bVar);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC2239p0
    public final void c(Status status) {
        synchronized (this.f37895k) {
            try {
                if (this.f37906v != null) {
                    return;
                }
                this.f37906v = status;
                this.f37893h.b(status);
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC2239p0
    public final Runnable d(InterfaceC2239p0.a aVar) {
        this.f37893h = (U.e) aVar;
        if (this.f37877G) {
            KeepAliveManager keepAliveManager = new KeepAliveManager(new KeepAliveManager.c(this), this.f37901q, this.f37878H, this.f37879I);
            this.f37876F = keepAliveManager;
            synchronized (keepAliveManager) {
            }
        }
        E9.a aVar2 = new E9.a(this.f37900p, this);
        F9.e eVar = this.f37892g;
        B bA = v.a(aVar2);
        eVar.getClass();
        E9.a.d dVar = aVar2.new d(new F9.e.d(bA));
        synchronized (this.f37895k) {
            io.grpc.okhttp.a aVar3 = new io.grpc.okhttp.a(this, dVar);
            this.f37894i = aVar3;
            this.j = new e(this, aVar3);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f37900p.execute(new b(countDownLatch, aVar2));
        try {
            p();
            countDownLatch.countDown();
            this.f37900p.execute(new c());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // D9.q
    public final r e() {
        return this.f37896l;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0194 A[EDGE_INSN: B:107:0x0194->B:159:0x023e BREAK  A[LOOP:9: B:146:0x021b->B:157:0x023a]] */
    /* JADX WARN: Code duplicated, block: B:108:0x0197  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:127:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x01df  */
    /* JADX WARN: Code duplicated, block: B:137:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:205:0x012b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0150 A[EDGE_INSN: B:212:0x0150->B:92:0x0150 BREAK  A[LOOP:3: B:87:0x013a->B:91:0x0148], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0118 A[LOOP:7: B:52:0x00d1->B:80:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x013c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0148 A[LOOP:3: B:87:0x013a->B:91:0x0148, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0154  */
    public final G9.b g(InetSocketAddress inetSocketAddress, String str, String str2) {
        String strSubstring;
        String strR0;
        int i10;
        int i11;
        InetAddress byAddress;
        byte[] address;
        int i12;
        int i13;
        int i14;
        int i15;
        C2839f c2839f;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        char cCharAt;
        int i22;
        int i23;
        int i24;
        int iA;
        int i25;
        G9.a.C0041a c0041a = new G9.a.C0041a();
        c0041a.f3584c = -1;
        c0041a.f3582a = "https";
        String hostName = inetSocketAddress.getHostName();
        if (hostName == null) {
            throw new IllegalArgumentException("host == null");
        }
        int length = hostName.length();
        int i26 = 0;
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strSubstring = hostName.substring(0, length);
                break;
            }
            if (hostName.charAt(iCharCount) == '%') {
                C2839f c2839f2 = new C2839f();
                c2839f2.g1(hostName, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt = hostName.codePointAt(iCharCount);
                    if (iCodePointAt != 37 || (i25 = iCharCount + 2) >= length) {
                        c2839f2.h1(iCodePointAt);
                    } else {
                        int iA2 = G9.a.a(hostName.charAt(iCharCount + 1));
                        int iA3 = G9.a.a(hostName.charAt(i25));
                        if (iA2 == -1 || iA3 == -1) {
                            c2839f2.h1(iCodePointAt);
                        } else {
                            c2839f2.Z0((iA2 << 4) + iA3);
                            iCharCount = i25;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = c2839f2.r0();
                break;
            }
            iCharCount++;
        }
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    int i27 = 0;
                    while (true) {
                        if (i27 >= lowerCase.length()) {
                            strR0 = lowerCase;
                            break;
                        }
                        char cCharAt2 = lowerCase.charAt(i27);
                        if (cCharAt2 > 31 && cCharAt2 < 127 && " #%/:?@[\\]".indexOf(cCharAt2) == -1) {
                            i27++;
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            strR0 = null;
            break;
        }
        int length2 = strSubstring.length() - 1;
        int i28 = 16;
        byte[] bArr = new byte[16];
        int i29 = -1;
        int i30 = -1;
        int i31 = 0;
        int i32 = 1;
        while (true) {
            try {
                if (i32 < length2) {
                    if (i31 != i28) {
                        int i33 = i32 + 2;
                        if (i33 > length2 || !strSubstring.regionMatches(i32, "::", i26, 2)) {
                            if (i31 == 0) {
                                i22 = i32;
                                i23 = 0;
                                while (i22 < length2) {
                                    iA = G9.a.a(strSubstring.charAt(i22));
                                    if (iA == -1) {
                                        break;
                                        break;
                                    }
                                    i23 = (i23 << 4) + iA;
                                    i22++;
                                }
                                i24 = i22 - i32;
                                if (i24 == 0) {
                                }
                            } else if (strSubstring.regionMatches(i32, ":", i26, 1)) {
                                i32++;
                                i22 = i32;
                                i23 = 0;
                                while (i22 < length2) {
                                    iA = G9.a.a(strSubstring.charAt(i22));
                                    if (iA == -1) {
                                        break;
                                    }
                                    i23 = (i23 << 4) + iA;
                                    i22++;
                                }
                                i24 = i22 - i32;
                                if (i24 == 0 && i24 <= 4) {
                                    int i34 = i31 + 1;
                                    bArr[i31] = (byte) (255 & (i23 >>> 8));
                                    i31 += 2;
                                    bArr[i34] = (byte) (i23 & 255);
                                    i30 = i32;
                                    i32 = i22;
                                    i26 = 0;
                                    i28 = 16;
                                }
                            } else {
                                if (strSubstring.regionMatches(i32, ".", i26, 1)) {
                                    int i35 = i31 - 2;
                                    int i36 = i35;
                                    int i37 = i30;
                                    while (true) {
                                        if (i37 >= length2) {
                                            int i38 = i29;
                                            if (i36 == i31 + 2) {
                                                i31 += 2;
                                                i29 = i38;
                                                i10 = 16;
                                            }
                                        } else if (i36 != 16) {
                                            if (i36 == i35) {
                                                i18 = i37;
                                                i19 = 0;
                                                while (true) {
                                                    i20 = i35;
                                                    if (i18 < length2) {
                                                        cCharAt = strSubstring.charAt(i18);
                                                        i21 = i29;
                                                        if (cCharAt < '0' && cCharAt <= '9') {
                                                            if ((i19 != 0 || i37 == i18) && (i19 = ((i19 * 10) + cCharAt) - 48) <= 255) {
                                                                i18++;
                                                                i35 = i20;
                                                                i29 = i21;
                                                            }
                                                        }
                                                    } else {
                                                        i21 = i29;
                                                    }
                                                    if (i18 - i37 == 0) {
                                                        bArr[i36] = (byte) i19;
                                                        i36++;
                                                        i37 = i18;
                                                        i35 = i20;
                                                        i29 = i21;
                                                    }
                                                }
                                            } else if (strSubstring.charAt(i37) == '.') {
                                                i37++;
                                                i18 = i37;
                                                i19 = 0;
                                                while (true) {
                                                    i20 = i35;
                                                    if (i18 < length2) {
                                                        cCharAt = strSubstring.charAt(i18);
                                                        i21 = i29;
                                                        if (cCharAt < '0') {
                                                        }
                                                    } else {
                                                        i21 = i29;
                                                    }
                                                    if (i18 - i37 == 0) {
                                                        bArr[i36] = (byte) i19;
                                                        i36++;
                                                        i37 = i18;
                                                        i35 = i20;
                                                        i29 = i21;
                                                    }
                                                    i18++;
                                                    i35 = i20;
                                                    i29 = i21;
                                                }
                                            }
                                        }
                                    }
                                }
                                byAddress = null;
                                if (byAddress == null) {
                                    strR0 = null;
                                    break;
                                }
                                address = byAddress.getAddress();
                                i12 = 16;
                                if (address.length == 16) {
                                    throw new AssertionError();
                                }
                                i13 = i11;
                                i14 = i13;
                                i15 = -1;
                                while (i13 < address.length) {
                                    i16 = i13;
                                    while (i16 < i12 && address[i16] == 0 && address[i16 + 1] == 0) {
                                        i16 += 2;
                                        i12 = 16;
                                    }
                                    i17 = i16 - i13;
                                    if (i17 > i14) {
                                        i14 = i17;
                                        i15 = i13;
                                    }
                                    i13 = i16 + 2;
                                    i12 = 16;
                                }
                                c2839f = new C2839f();
                                while (i11 < address.length) {
                                    if (i11 == i15) {
                                        c2839f.Z0(58);
                                        i11 += i14;
                                        if (i11 == 16) {
                                            c2839f.Z0(58);
                                        }
                                    } else {
                                        if (i11 > 0) {
                                            c2839f.Z0(58);
                                        }
                                        c2839f.b1(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                                        i11 += 2;
                                    }
                                }
                                strR0 = c2839f.r0();
                            }
                            i11 = 0;
                            byAddress = null;
                            if (byAddress == null) {
                                strR0 = null;
                                break;
                            }
                            address = byAddress.getAddress();
                            i12 = 16;
                            if (address.length == 16) {
                                throw new AssertionError();
                            }
                            i13 = i11;
                            i14 = i13;
                            i15 = -1;
                            while (i13 < address.length) {
                                i16 = i13;
                                while (i16 < i12) {
                                    i16 += 2;
                                    i12 = 16;
                                }
                                i17 = i16 - i13;
                                if (i17 > i14) {
                                    i14 = i17;
                                    i15 = i13;
                                }
                                i13 = i16 + 2;
                                i12 = 16;
                            }
                            c2839f = new C2839f();
                            while (i11 < address.length) {
                                if (i11 == i15) {
                                    c2839f.Z0(58);
                                    i11 += i14;
                                    if (i11 == 16) {
                                        c2839f.Z0(58);
                                    }
                                } else {
                                    if (i11 > 0) {
                                        c2839f.Z0(58);
                                    }
                                    c2839f.b1(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                                    i11 += 2;
                                }
                            }
                            strR0 = c2839f.r0();
                        } else if (i29 == -1) {
                            i31 += 2;
                            if (i33 == length2) {
                                i29 = i31;
                                i10 = 16;
                            } else {
                                i32 = i33;
                                i29 = i31;
                                i22 = i32;
                                i23 = 0;
                                while (i22 < length2) {
                                    iA = G9.a.a(strSubstring.charAt(i22));
                                    if (iA == -1) {
                                        break;
                                        break;
                                    }
                                    i23 = (i23 << 4) + iA;
                                    i22++;
                                }
                                i24 = i22 - i32;
                                if (i24 == 0) {
                                }
                                i11 = 0;
                                byAddress = null;
                                if (byAddress == null) {
                                    strR0 = null;
                                    break;
                                }
                                address = byAddress.getAddress();
                                i12 = 16;
                                if (address.length == 16) {
                                    throw new AssertionError();
                                }
                                i13 = i11;
                                i14 = i13;
                                i15 = -1;
                                while (i13 < address.length) {
                                    i16 = i13;
                                    while (i16 < i12) {
                                        i16 += 2;
                                        i12 = 16;
                                    }
                                    i17 = i16 - i13;
                                    if (i17 > i14) {
                                        i14 = i17;
                                        i15 = i13;
                                    }
                                    i13 = i16 + 2;
                                    i12 = 16;
                                }
                                c2839f = new C2839f();
                                while (i11 < address.length) {
                                    if (i11 == i15) {
                                        c2839f.Z0(58);
                                        i11 += i14;
                                        if (i11 == 16) {
                                            c2839f.Z0(58);
                                        }
                                    } else {
                                        if (i11 > 0) {
                                            c2839f.Z0(58);
                                        }
                                        c2839f.b1(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                                        i11 += 2;
                                    }
                                }
                                strR0 = c2839f.r0();
                            }
                        }
                    }
                    i11 = i26;
                    byAddress = null;
                    if (byAddress == null) {
                        strR0 = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i12 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i13 = i11;
                    i14 = i13;
                    i15 = -1;
                    while (i13 < address.length) {
                        i16 = i13;
                        while (i16 < i12) {
                            i16 += 2;
                            i12 = 16;
                        }
                        i17 = i16 - i13;
                        if (i17 > i14) {
                            i14 = i17;
                            i15 = i13;
                        }
                        i13 = i16 + 2;
                        i12 = 16;
                    }
                    c2839f = new C2839f();
                    while (i11 < address.length) {
                        if (i11 == i15) {
                            c2839f.Z0(58);
                            i11 += i14;
                            if (i11 == 16) {
                                c2839f.Z0(58);
                            }
                        } else {
                            if (i11 > 0) {
                                c2839f.Z0(58);
                            }
                            c2839f.b1(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                            i11 += 2;
                        }
                    }
                    strR0 = c2839f.r0();
                } else {
                    i10 = i28;
                }
                if (i31 != i10) {
                    if (i29 != -1) {
                        int i39 = i31 - i29;
                        System.arraycopy(bArr, i29, bArr, 16 - i39, i39);
                        i11 = 0;
                        Arrays.fill(bArr, i29, (16 - i31) + i29, (byte) 0);
                    }
                    i11 = 0;
                    byAddress = null;
                    if (byAddress == null) {
                        strR0 = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i12 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i13 = i11;
                    i14 = i13;
                    i15 = -1;
                    while (i13 < address.length) {
                        i16 = i13;
                        while (i16 < i12) {
                            i16 += 2;
                            i12 = 16;
                        }
                        i17 = i16 - i13;
                        if (i17 > i14) {
                            i14 = i17;
                            i15 = i13;
                        }
                        i13 = i16 + 2;
                        i12 = 16;
                    }
                    c2839f = new C2839f();
                    while (i11 < address.length) {
                        if (i11 == i15) {
                            c2839f.Z0(58);
                            i11 += i14;
                            if (i11 == 16) {
                                c2839f.Z0(58);
                            }
                        } else {
                            if (i11 > 0) {
                                c2839f.Z0(58);
                            }
                            c2839f.b1(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                            i11 += 2;
                        }
                    }
                    strR0 = c2839f.r0();
                } else {
                    i11 = 0;
                }
                byAddress = InetAddress.getByAddress(bArr);
                if (byAddress == null) {
                    strR0 = null;
                    break;
                }
                address = byAddress.getAddress();
                i12 = 16;
                if (address.length == 16) {
                    throw new AssertionError();
                }
                i13 = i11;
                i14 = i13;
                i15 = -1;
                while (i13 < address.length) {
                    i16 = i13;
                    while (i16 < i12) {
                        i16 += 2;
                        i12 = 16;
                    }
                    i17 = i16 - i13;
                    if (i17 > i14) {
                        i14 = i17;
                        i15 = i13;
                    }
                    i13 = i16 + 2;
                    i12 = 16;
                }
                c2839f = new C2839f();
                while (i11 < address.length) {
                    if (i11 == i15) {
                        c2839f.Z0(58);
                        i11 += i14;
                        if (i11 == 16) {
                            c2839f.Z0(58);
                        }
                    } else {
                        if (i11 > 0) {
                            c2839f.Z0(58);
                        }
                        c2839f.b1(((address[i11] & 255) << 8) | (address[i11 + 1] & 255));
                        i11 += 2;
                    }
                }
                strR0 = c2839f.r0();
            } catch (UnknownHostException unused2) {
                throw new AssertionError();
            }
        }
        if (strR0 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(hostName));
        }
        c0041a.f3583b = strR0;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException(i.b(port, "unexpected port: "));
        }
        c0041a.f3584c = port;
        if (c0041a.f3582a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (c0041a.f3583b == null) {
            throw new IllegalStateException("host == null");
        }
        G9.a aVar = new G9.a(c0041a);
        G9.b.a aVar2 = new G9.b.a();
        aVar2.f3588b = new io.grpc.okhttp.internal.c.a();
        aVar2.f3587a = aVar;
        aVar2.a("Host", aVar.f3579a + ":" + aVar.f3580b);
        aVar2.a("User-Agent", this.f37888c);
        if (str != null && str2 != null) {
            try {
                aVar2.a("Proxy-Authorization", "Basic " + ByteString.n((str + ":" + str2).getBytes("ISO-8859-1")).a());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (aVar2.f3587a != null) {
            return new G9.b(aVar2);
        }
        throw new IllegalStateException("url == null");
    }

    public final void h(int i10, Status status, ClientStreamListener.RpcProgress rpcProgress, boolean z10, ErrorCode errorCode, m mVar) {
        synchronized (this.f37895k) {
            try {
                io.grpc.okhttp.c cVar = (io.grpc.okhttp.c) this.f37898n.remove(Integer.valueOf(i10));
                if (cVar != null) {
                    if (errorCode != null) {
                        this.f37894i.Y0(i10, ErrorCode.CANCEL);
                    }
                    if (status != null) {
                        io.grpc.okhttp.c.b bVar = cVar.f37847l;
                        if (mVar == null) {
                            mVar = new m();
                        }
                        bVar.h(status, rpcProgress, z10, mVar);
                    }
                    if (!s()) {
                        u();
                        m(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e.b[] i() {
        e.b[] bVarArr;
        e.b bVar;
        synchronized (this.f37895k) {
            bVarArr = new e.b[this.f37898n.size()];
            Iterator it = this.f37898n.values().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                io.grpc.okhttp.c.b bVar2 = ((io.grpc.okhttp.c) it.next()).f37847l;
                synchronized (bVar2.f37865w) {
                    bVar = bVar2.f37861J;
                }
                bVarArr[i10] = bVar;
                i10 = i11;
            }
        }
        return bVarArr;
    }

    public final int j() {
        URI uriA = GrpcUtil.a(this.f37887b);
        return uriA.getPort() != -1 ? uriA.getPort() : this.f37886a.getPort();
    }

    public final StatusException k() {
        synchronized (this.f37895k) {
            try {
                Status status = this.f37906v;
                if (status != null) {
                    return new StatusException(status);
                }
                return new StatusException(Status.f36905l.h("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    public final boolean l(int i10) {
        boolean z10;
        synchronized (this.f37895k) {
            if (i10 < this.f37897m) {
                z10 = true;
                if ((i10 & 1) != 1) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void m(io.grpc.okhttp.c cVar) {
        if (this.f37910z && this.f37874D.isEmpty() && this.f37898n.isEmpty()) {
            this.f37910z = false;
            KeepAliveManager keepAliveManager = this.f37876F;
            if (keepAliveManager != null) {
                keepAliveManager.c();
            }
        }
        if (cVar.f37501c) {
            this.f37883M.G(cVar, false);
        }
    }

    public final void n(Exception exc) {
        r(0, ErrorCode.INTERNAL_ERROR, Status.f36905l.g(exc));
    }

    public final void p() {
        synchronized (this.f37895k) {
            try {
                this.f37894i.F();
                x xVar = new x();
                xVar.b(7, this.f37891f);
                this.f37894i.n(xVar);
                int i10 = this.f37891f;
                if (i10 > 65535) {
                    this.f37894i.Q(0, i10 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(Status status) {
        c(status);
        synchronized (this.f37895k) {
            try {
                Iterator it = this.f37898n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((io.grpc.okhttp.c) entry.getValue()).f37847l.i(status, false, new m());
                    m((io.grpc.okhttp.c) entry.getValue());
                }
                for (io.grpc.okhttp.c cVar : this.f37874D) {
                    cVar.f37847l.h(status, ClientStreamListener.RpcProgress.f37137e, true, new m());
                    m(cVar);
                }
                this.f37874D.clear();
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(int i10, ErrorCode errorCode, Status status) {
        synchronized (this.f37895k) {
            try {
                if (this.f37906v == null) {
                    this.f37906v = status;
                    this.f37893h.b(status);
                }
                if (errorCode != null && !this.f37907w) {
                    this.f37907w = true;
                    this.f37894i.K(errorCode, new byte[0]);
                }
                Iterator it = this.f37898n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i10) {
                        it.remove();
                        ((io.grpc.okhttp.c) entry.getValue()).f37847l.h(status, ClientStreamListener.RpcProgress.f37135c, false, new m());
                        m((io.grpc.okhttp.c) entry.getValue());
                    }
                }
                for (io.grpc.okhttp.c cVar : this.f37874D) {
                    cVar.f37847l.h(status, ClientStreamListener.RpcProgress.f37137e, true, new m());
                    m(cVar);
                }
                this.f37874D.clear();
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s() {
        boolean z10 = false;
        while (true) {
            LinkedList linkedList = this.f37874D;
            if (linkedList.isEmpty() || this.f37898n.size() >= this.f37873C) {
                break;
            }
            t((io.grpc.okhttp.c) linkedList.poll());
            z10 = true;
        }
        return z10;
    }

    public final void t(io.grpc.okhttp.c cVar) {
        boolean zE;
        p.p("StreamId already assigned", cVar.f37847l.f37862K == -1);
        this.f37898n.put(Integer.valueOf(this.f37897m), cVar);
        if (!this.f37910z) {
            this.f37910z = true;
            KeepAliveManager keepAliveManager = this.f37876F;
            if (keepAliveManager != null) {
                keepAliveManager.b();
            }
        }
        if (cVar.f37501c) {
            this.f37883M.G(cVar, true);
        }
        io.grpc.okhttp.c.b bVar = cVar.f37847l;
        int i10 = this.f37897m;
        if (!(bVar.f37862K == -1)) {
            throw new IllegalStateException(A.h("the stream has been started with id %s", Integer.valueOf(i10)));
        }
        bVar.f37862K = i10;
        e eVar = bVar.f37857F;
        bVar.f37861J = eVar.new b(i10, eVar.f37922c, bVar);
        io.grpc.okhttp.c.b bVar2 = io.grpc.okhttp.c.this.f37847l;
        p.q(bVar2.j != null);
        synchronized (bVar2.f37532b) {
            p.p("Already allocated", !bVar2.f37536f);
            bVar2.f37536f = true;
        }
        synchronized (bVar2.f37532b) {
            zE = bVar2.e();
        }
        if (zE) {
            bVar2.j.c();
        }
        U0 u10 = bVar2.f37533c;
        u10.getClass();
        u10.f37488a.a();
        if (bVar.f37859H) {
            bVar.f37856E.W0(io.grpc.okhttp.c.this.f37850o, bVar.f37862K, bVar.f37866x);
            for (g gVar : io.grpc.okhttp.c.this.j.f37429a) {
                ((io.grpc.c) gVar).l0();
            }
            bVar.f37866x = null;
            C2839f c2839f = bVar.f37867y;
            if (c2839f.f49074c > 0) {
                bVar.f37857F.a(bVar.f37868z, bVar.f37861J, c2839f, bVar.f37852A);
            }
            bVar.f37859H = false;
        }
        MethodDescriptor.MethodType methodType = cVar.f37844h.f36886a;
        if ((methodType != MethodDescriptor.MethodType.f36892b && methodType != MethodDescriptor.MethodType.f36893c) || cVar.f37850o) {
            this.f37894i.flush();
        }
        int i11 = this.f37897m;
        if (i11 < 2147483645) {
            this.f37897m = i11 + 2;
        } else {
            this.f37897m = BrazeLogger.SUPPRESS;
            r(BrazeLogger.SUPPRESS, ErrorCode.NO_ERROR, Status.f36905l.h("Stream ids exhausted"));
        }
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.b(this.f37896l.f2910c, "logId");
        aVarB.c(this.f37886a, "address");
        return aVarB.toString();
    }

    public final void u() {
        if (this.f37906v == null || !this.f37898n.isEmpty() || !this.f37874D.isEmpty() || this.f37909y) {
            return;
        }
        this.f37909y = true;
        KeepAliveManager keepAliveManager = this.f37876F;
        if (keepAliveManager != null) {
            keepAliveManager.d();
        }
        T t8 = this.f37908x;
        if (t8 != null) {
            StatusException statusExceptionK = k();
            synchronized (t8) {
                try {
                    if (!t8.f37445d) {
                        t8.f37445d = true;
                        t8.f37446e = statusExceptionK;
                        LinkedHashMap linkedHashMap = t8.f37444c;
                        t8.f37444c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new S((InterfaceC2238p.a) entry.getKey(), statusExceptionK));
                            } catch (Throwable th) {
                                T.f37441g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f37908x = null;
        }
        if (!this.f37907w) {
            this.f37907w = true;
            this.f37894i.K(ErrorCode.NO_ERROR, new byte[0]);
        }
        this.f37894i.close();
    }

    /* JADX INFO: compiled from: OkHttpClientTransport.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f37912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E9.a f37913c;

        public b(CountDownLatch countDownLatch, E9.a aVar) {
            this.f37912b = countDownLatch;
            this.f37913c = aVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public final void run() {
            Socket socketF;
            SSLSession session;
            Socket socket;
            try {
                this.f37912b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            C cB = v.b(new a());
            try {
                try {
                    try {
                        d dVar = d.this;
                        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress = dVar.f37884N;
                        if (httpConnectProxiedSocketAddress == null) {
                            socketF = dVar.f37871A.createSocket(dVar.f37886a.getAddress(), d.this.f37886a.getPort());
                        } else {
                            if (!(httpConnectProxiedSocketAddress.b() instanceof InetSocketAddress)) {
                                throw new StatusException(Status.f36904k.h("Unsupported SocketAddress implementation " + d.this.f37884N.b().getClass()));
                            }
                            d dVar2 = d.this;
                            socketF = d.f(dVar2, dVar2.f37884N.c(), (InetSocketAddress) d.this.f37884N.b(), d.this.f37884N.d(), d.this.f37884N.a());
                        }
                        d dVar3 = d.this;
                        SSLSocketFactory sSLSocketFactory = dVar3.f37872B;
                        if (sSLSocketFactory != null) {
                            String host = dVar3.f37887b;
                            URI uriA = GrpcUtil.a(host);
                            if (uriA.getHost() != null) {
                                host = uriA.getHost();
                            }
                            SSLSocket sSLSocketA = E9.g.a(sSLSocketFactory, socketF, host, d.this.j(), d.this.f37875E);
                            session = sSLSocketA.getSession();
                            socket = sSLSocketA;
                        } else {
                            session = null;
                            socket = socketF;
                        }
                        socket.setTcpNoDelay(true);
                        C cB2 = v.b(v.e(socket));
                        this.f37913c.b(v.d(socket), socket);
                        d dVar4 = d.this;
                        io.grpc.a aVar = dVar4.f37905u;
                        aVar.getClass();
                        io.grpc.a.C0387a c0387a = new io.grpc.a.C0387a(aVar);
                        c0387a.b(io.grpc.e.f36962a, socket.getRemoteSocketAddress());
                        c0387a.b(io.grpc.e.f36963b, socket.getLocalSocketAddress());
                        c0387a.b(io.grpc.e.f36964c, session);
                        c0387a.b(N.f37423a, session == null ? SecurityLevel.f36895b : SecurityLevel.f36896c);
                        dVar4.f37905u = c0387a.a();
                        d dVar5 = d.this;
                        dVar5.f37892g.getClass();
                        dVar5.f37904t = dVar5.new RunnableC0396d(new F9.e.c(cB2));
                        synchronized (d.this.f37895k) {
                            try {
                                d.this.getClass();
                                if (session != null) {
                                    d dVar6 = d.this;
                                    new D9.p.a(session);
                                    dVar6.getClass();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        d dVar7 = d.this;
                        dVar7.f37892g.getClass();
                        dVar7.f37904t = dVar7.new RunnableC0396d(new F9.e.c(cB));
                        throw th2;
                    }
                } catch (StatusException e10) {
                    d.this.r(0, ErrorCode.INTERNAL_ERROR, e10.a());
                    d dVar8 = d.this;
                    dVar8.f37892g.getClass();
                    dVar8.f37904t = dVar8.new RunnableC0396d(new F9.e.c(cB));
                }
            } catch (Exception e11) {
                d.this.n(e11);
                d dVar9 = d.this;
                dVar9.f37892g.getClass();
                dVar9.f37904t = dVar9.new RunnableC0396d(new F9.e.c(cB));
            }
        }

        /* JADX INFO: compiled from: OkHttpClientTransport.java */
        public class a implements H {
            @Override // p318zb.H
            public final long l0(C2839f c2839f, long j) {
                return -1L;
            }

            @Override // p318zb.H
            public final I timeout() {
                return I.f49052d;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }
    }
}
