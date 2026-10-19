package io.grpc.internal;

import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.okhttp.internal.Platform;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: io.grpc.internal.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ManagedChannelImplBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2233m0 extends io.grpc.l<C2233m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N0 f37610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N0 f37611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f37612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.grpc.p.a f37613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D9.l f37616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D9.g f37617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f37618i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f37619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f37620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f37621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f37622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D9.p f37623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f37624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f37625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f37626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f37627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f37628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f37629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final OkHttpChannelBuilder.c f37630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f37631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f37607x = Logger.getLogger(C2233m0.class.getName());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f37608y = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f37609z = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final N0 f37604A = new N0(GrpcUtil.f37213p);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final D9.l f37605B = D9.l.f2895d;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final D9.g f37606C = D9.g.f2880b;

    /* JADX INFO: renamed from: io.grpc.internal.m0$a */
    /* JADX INFO: compiled from: ManagedChannelImplBuilder.java */
    public interface a {
        int a();
    }

    public C2233m0(String str, OkHttpChannelBuilder.c cVar, OkHttpChannelBuilder.b bVar) {
        io.grpc.p pVar;
        N0 n10 = f37604A;
        this.f37610a = n10;
        this.f37611b = n10;
        this.f37612c = new ArrayList();
        Logger logger = io.grpc.p.f38022e;
        synchronized (io.grpc.p.class) {
            try {
                if (io.grpc.p.f38023f == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z10 = D.f37139a;
                        arrayList.add(D.class);
                    } catch (ClassNotFoundException e10) {
                        io.grpc.p.f38022e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
                    }
                    List<io.grpc.o> listA = io.grpc.r.a(io.grpc.o.class, Collections.unmodifiableList(arrayList), io.grpc.o.class.getClassLoader(), new io.grpc.p.b());
                    if (listA.isEmpty()) {
                        io.grpc.p.f38022e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    io.grpc.p.f38023f = new io.grpc.p();
                    for (io.grpc.o oVar : listA) {
                        io.grpc.p.f38022e.fine("Service loader found " + oVar);
                        io.grpc.p pVar2 = io.grpc.p.f38023f;
                        synchronized (pVar2) {
                            A8.p.f("isAvailable() returned false", oVar.c());
                            pVar2.f38026c.add(oVar);
                        }
                    }
                    io.grpc.p.f38023f.a();
                }
                pVar = io.grpc.p.f38023f;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f37613d = pVar.f38024a;
        this.f37615f = "pick_first";
        this.f37616g = f37605B;
        this.f37617h = f37606C;
        this.f37618i = f37608y;
        this.j = 5;
        this.f37619k = 5;
        this.f37620l = 16777216L;
        this.f37621m = 1048576L;
        this.f37622n = true;
        this.f37623o = D9.p.f2903e;
        this.f37624p = true;
        this.f37625q = true;
        this.f37626r = true;
        this.f37627s = true;
        this.f37628t = true;
        this.f37629u = true;
        A8.p.j(str, "target");
        this.f37614e = str;
        this.f37630v = cVar;
        this.f37631w = bVar;
    }

    @Override // io.grpc.l
    public final D9.t a() {
        SSLSocketFactory sSLSocketFactory;
        D9.c cVar;
        D9.c cVar2;
        D9.c cVar3;
        OkHttpChannelBuilder okHttpChannelBuilder = OkHttpChannelBuilder.this;
        boolean z10 = okHttpChannelBuilder.f37812h != Long.MAX_VALUE;
        N0 n10 = okHttpChannelBuilder.f37807c;
        N0 n11 = okHttpChannelBuilder.f37808d;
        OkHttpChannelBuilder.NegotiationType negotiationType = okHttpChannelBuilder.f37811g;
        int iOrdinal = negotiationType.ordinal();
        if (iOrdinal == 0) {
            try {
                if (okHttpChannelBuilder.f37809e == null) {
                    okHttpChannelBuilder.f37809e = SSLContext.getInstance("Default", Platform.f37950d.f37951a).getSocketFactory();
                }
                sSLSocketFactory = okHttpChannelBuilder.f37809e;
            } catch (GeneralSecurityException e10) {
                throw new RuntimeException("TLS Provider failure", e10);
            }
        } else {
            if (iOrdinal != 1) {
                throw new RuntimeException("Unknown negotiation type: " + negotiationType);
            }
            sSLSocketFactory = null;
        }
        OkHttpChannelBuilder.d dVar = new OkHttpChannelBuilder.d(n10, n11, sSLSocketFactory, okHttpChannelBuilder.f37810f, z10, okHttpChannelBuilder.f37812h, okHttpChannelBuilder.f37813i, okHttpChannelBuilder.j, okHttpChannelBuilder.f37814k, okHttpChannelBuilder.f37806b);
        E.a aVar = new E.a();
        N0 n12 = new N0(GrpcUtil.f37213p);
        GrpcUtil.d dVar2 = GrpcUtil.f37215r;
        ArrayList arrayList = new ArrayList(this.f37612c);
        synchronized (D9.o.class) {
        }
        if (this.f37625q) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class cls2 = Boolean.TYPE;
                cVar = (D9.c) cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.f37626r), Boolean.valueOf(this.f37627s), Boolean.FALSE, Boolean.valueOf(this.f37628t));
            } catch (ClassNotFoundException e11) {
                f37607x.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
                cVar = null;
            } catch (IllegalAccessException e12) {
                f37607x.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
                cVar = null;
            } catch (NoSuchMethodException e13) {
                f37607x.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
                cVar = null;
            } catch (InvocationTargetException e14) {
                f37607x.log(Level.FINE, "Unable to apply census stats", (Throwable) e14);
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(0, cVar);
            }
        }
        if (this.f37629u) {
            try {
                cVar2 = null;
                try {
                    cVar3 = (D9.c) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e15) {
                    e = e15;
                    f37607x.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    cVar3 = cVar2;
                } catch (IllegalAccessException e16) {
                    e = e16;
                    f37607x.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    cVar3 = cVar2;
                } catch (NoSuchMethodException e17) {
                    e = e17;
                    f37607x.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    cVar3 = cVar2;
                } catch (InvocationTargetException e18) {
                    e = e18;
                    f37607x.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
                    cVar3 = cVar2;
                }
            } catch (ClassNotFoundException e19) {
                e = e19;
                cVar2 = null;
            } catch (IllegalAccessException e20) {
                e = e20;
                cVar2 = null;
            } catch (NoSuchMethodException e21) {
                e = e21;
                cVar2 = null;
            } catch (InvocationTargetException e22) {
                e = e22;
                cVar2 = null;
            }
            if (cVar3 != null) {
                arrayList.add(0, cVar3);
            }
        }
        ManagedChannelImpl managedChannelImpl = new ManagedChannelImpl(this, dVar, aVar, n12, dVar2, arrayList);
        ReferenceQueue<C2235n0> referenceQueue = C2235n0.f37635b;
        ConcurrentHashMap concurrentHashMap = C2235n0.f37636c;
        C2235n0 c2235n0 = new C2235n0(managedChannelImpl);
        new C2235n0.a(c2235n0, managedChannelImpl, referenceQueue, concurrentHashMap);
        return c2235n0;
    }
}
