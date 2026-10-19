package io.grpc.okhttp;

import A8.p;
import com.braze.support.BrazeLogger;
import io.grpc.TlsChannelCredentials$Feature;
import io.grpc.internal.AbstractC2210b;
import io.grpc.internal.C2220g;
import io.grpc.internal.C2220g.a;
import io.grpc.internal.C2233m0;
import io.grpc.internal.GrpcUtil;
import io.grpc.internal.InterfaceC2240q;
import io.grpc.internal.InterfaceC2243s;
import io.grpc.internal.L0;
import io.grpc.internal.N0;
import io.grpc.internal.U;
import io.grpc.internal.U0;
import io.grpc.okhttp.internal.CipherSuite;
import io.grpc.okhttp.internal.TlsVersion;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class OkHttpChannelBuilder extends AbstractC2210b<OkHttpChannelBuilder> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.a f37803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final N0 f37804m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2233m0 f37805a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SSLSocketFactory f37809e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U0.a f37806b = U0.f37487c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N0 f37807c = f37804m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N0 f37808d = new N0(GrpcUtil.f37214q);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final io.grpc.okhttp.internal.a f37810f = f37803l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NegotiationType f37811g = NegotiationType.f37815b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f37812h = Long.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f37813i = GrpcUtil.f37209l;
    public final int j = 65535;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f37814k = BrazeLogger.SUPPRESS;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NegotiationType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NegotiationType f37815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ NegotiationType[] f37816c;

        static {
            NegotiationType negotiationType = new NegotiationType("TLS", 0);
            f37815b = negotiationType;
            f37816c = new NegotiationType[]{negotiationType, new NegotiationType("PLAINTEXT", 1)};
        }

        public NegotiationType() {
            throw null;
        }

        public static NegotiationType valueOf(String str) {
            return (NegotiationType) Enum.valueOf(NegotiationType.class, str);
        }

        public static NegotiationType[] values() {
            return (NegotiationType[]) f37816c.clone();
        }
    }

    public class a implements L0.c<Executor> {
        @Override // io.grpc.internal.L0.c
        public final Executor a() {
            return Executors.newCachedThreadPool(GrpcUtil.e("grpc-okhttp-%d"));
        }

        @Override // io.grpc.internal.L0.c
        public final void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }
    }

    public final class b implements C2233m0.a {
        public b() {
        }

        @Override // io.grpc.internal.C2233m0.a
        public final int a() {
            NegotiationType negotiationType = OkHttpChannelBuilder.this.f37811g;
            int iOrdinal = negotiationType.ordinal();
            if (iOrdinal == 0) {
                return 443;
            }
            if (iOrdinal == 1) {
                return 80;
            }
            throw new AssertionError(negotiationType + " not handled");
        }
    }

    public final class c {
        public c() {
        }
    }

    public static final class d implements InterfaceC2240q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final N0 f37819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f37820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final N0 f37821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f37822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final U0.a f37823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SSLSocketFactory f37824g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final io.grpc.okhttp.internal.a f37825h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f37826i = 4194304;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C2220g f37827k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f37828l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f37829m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f37830n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f37831o;

        public d(N0 n10, N0 n11, SSLSocketFactory sSLSocketFactory, io.grpc.okhttp.internal.a aVar, boolean z10, long j, long j10, int i10, int i11, U0.a aVar2) {
            this.f37819b = n10;
            this.f37820c = (Executor) L0.a(n10.f37425a);
            this.f37821d = n11;
            this.f37822e = (ScheduledExecutorService) L0.a(n11.f37425a);
            this.f37824g = sSLSocketFactory;
            this.f37825h = aVar;
            this.j = z10;
            this.f37827k = new C2220g(j);
            this.f37828l = j10;
            this.f37829m = i10;
            this.f37830n = i11;
            p.j(aVar2, "transportTracerFactory");
            this.f37823f = aVar2;
        }

        @Override // io.grpc.internal.InterfaceC2240q
        public final ScheduledExecutorService G0() {
            return this.f37822e;
        }

        @Override // io.grpc.internal.InterfaceC2240q
        public final InterfaceC2243s Y(SocketAddress socketAddress, InterfaceC2240q.a aVar, U.f fVar) {
            if (this.f37831o) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            C2220g c2220g = this.f37827k;
            long j = c2220g.f37542b.get();
            io.grpc.okhttp.d dVar = new io.grpc.okhttp.d(this, (InetSocketAddress) socketAddress, aVar.f37659a, aVar.f37660b, aVar.f37661c, new io.grpc.okhttp.b(c2220g.new a(j)));
            if (this.j) {
                dVar.f37877G = true;
                dVar.f37878H = j;
                dVar.f37879I = this.f37828l;
            }
            return dVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f37831o) {
                return;
            }
            this.f37831o = true;
            this.f37819b.a(this.f37820c);
            this.f37821d.a(this.f37822e);
        }
    }

    static {
        Logger.getLogger(OkHttpChannelBuilder.class.getName());
        io.grpc.okhttp.internal.a.C0397a c0397a = new io.grpc.okhttp.internal.a.C0397a(io.grpc.okhttp.internal.a.f37982e);
        c0397a.a(CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.f37943n, CipherSuite.f37942m);
        c0397a.b(TlsVersion.TLS_1_2);
        if (!c0397a.f37987a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0397a.f37990d = true;
        f37803l = new io.grpc.okhttp.internal.a(c0397a);
        TimeUnit.DAYS.toNanos(1000L);
        f37804m = new N0(new a());
        EnumSet.of(TlsChannelCredentials$Feature.f36929b, TlsChannelCredentials$Feature.f36930c);
    }

    public OkHttpChannelBuilder(String str) {
        this.f37805a = new C2233m0(str, new c(), new b());
    }
}
