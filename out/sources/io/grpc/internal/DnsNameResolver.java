package io.grpc.internal;

import com.braze.ui.actions.brazeactions.steps.StepData;
import com.google.common.base.VerifyException;
import io.grpc.ProxiedSocketAddress;
import io.grpc.Status;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class DnsNameResolver extends io.grpc.n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f37140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set<String> f37141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f37142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f37143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f37144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f37145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String f37146y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f37147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f37148b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a f37149c = JdkAddressResolver.f37164b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<d> f37150d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f37152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GrpcUtil.b f37154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f37155i;
    public final D9.w j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.common.base.i f37156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Executor f37159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f37160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final H0 f37161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f37162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public io.grpc.n.d f37163r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class JdkAddressResolver implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final JdkAddressResolver f37164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ JdkAddressResolver[] f37165c;

        static {
            JdkAddressResolver jdkAddressResolver = new JdkAddressResolver("INSTANCE", 0);
            f37164b = jdkAddressResolver;
            f37165c = new JdkAddressResolver[]{jdkAddressResolver};
        }

        public JdkAddressResolver() {
            throw null;
        }

        public static JdkAddressResolver valueOf(String str) {
            return (JdkAddressResolver) Enum.valueOf(JdkAddressResolver.class, str);
        }

        public static JdkAddressResolver[] values() {
            return (JdkAddressResolver[]) f37165c.clone();
        }
    }

    public interface a {
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Status f37166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<io.grpc.d> f37167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.grpc.n.b f37168c;
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.grpc.n.d f37169b;

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f37171b;

            public a(boolean z10) {
                this.f37171b = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = this.f37171b;
                c cVar = c.this;
                if (z10) {
                    DnsNameResolver dnsNameResolver = DnsNameResolver.this;
                    dnsNameResolver.f37157l = true;
                    if (dnsNameResolver.f37155i > 0) {
                        com.google.common.base.i iVar = dnsNameResolver.f37156k;
                        iVar.f27807a = false;
                        iVar.b();
                    }
                }
                DnsNameResolver.this.f37162q = false;
            }
        }

        public c(io.grpc.n.d dVar) {
            A8.p.j(dVar, "savedListener");
            this.f37169b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            io.grpc.n.b bVar;
            List<io.grpc.d> listSingletonList;
            io.grpc.n.d dVar = this.f37169b;
            Logger logger = DnsNameResolver.f37140s;
            Level level = Level.FINER;
            boolean zIsLoggable = logger.isLoggable(level);
            DnsNameResolver dnsNameResolver = DnsNameResolver.this;
            if (zIsLoggable) {
                logger.finer("Attempting DNS resolution of " + dnsNameResolver.f37152f);
            }
            b bVar2 = null;
            bVar2 = null;
            bVar2 = null;
            try {
                try {
                    ProxiedSocketAddress proxiedSocketAddressA = dnsNameResolver.f37147a.a(InetSocketAddress.createUnresolved(dnsNameResolver.f37152f, dnsNameResolver.f37153g));
                    io.grpc.d dVar2 = proxiedSocketAddressA != null ? new io.grpc.d(proxiedSocketAddressA) : null;
                    List<io.grpc.d> listEmptyList = Collections.emptyList();
                    io.grpc.a aVar = io.grpc.a.f36932b;
                    D9.w wVar = dnsNameResolver.j;
                    if (dVar2 != null) {
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + dVar2);
                        }
                        listSingletonList = Collections.singletonList(dVar2);
                        bVar = null;
                    } else {
                        b bVarE = dnsNameResolver.e();
                        try {
                            Status status = bVarE.f37166a;
                            if (status != null) {
                                dVar.a(status);
                                wVar.execute(new a(bVarE.f37166a == null));
                                return;
                            }
                            List<io.grpc.d> list = bVarE.f37167b;
                            if (list != null) {
                                listEmptyList = list;
                            }
                            io.grpc.n.b bVar3 = bVarE.f37168c;
                            bVar = bVar3 != null ? bVar3 : null;
                            bVar2 = bVarE;
                            listSingletonList = listEmptyList;
                        } catch (IOException e10) {
                            bVar2 = bVarE;
                            e = e10;
                            dVar.a(Status.f36905l.h("Unable to resolve host " + dnsNameResolver.f37152f).g(e));
                            dnsNameResolver.j.execute(new a(bVar2 != null && bVar2.f37166a == null));
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bVar2 = bVarE;
                            dnsNameResolver.j.execute(new a(bVar2 != null && bVar2.f37166a == null));
                            throw th;
                        }
                    }
                    dVar.b(new io.grpc.n.f(listSingletonList, aVar, bVar));
                    wVar.execute(new a(bVar2 != null && bVar2.f37166a == null));
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public interface d {
        List<String> a(String str) throws Exception;
    }

    public interface e {
        C2213c0.b a();

        Throwable b();
    }

    static {
        Logger logger = Logger.getLogger(DnsNameResolver.class.getName());
        f37140s = logger;
        f37141t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f37142u = Boolean.parseBoolean(property);
        f37143v = Boolean.parseBoolean(property2);
        f37144w = Boolean.parseBoolean(property3);
        e eVar = null;
        try {
            try {
                try {
                    e eVar2 = (e) Class.forName("io.grpc.internal.c0", true, DnsNameResolver.class.getClassLoader()).asSubclass(e.class).getConstructor(null).newInstance(null);
                    if (eVar2.b() != null) {
                        logger.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", eVar2.b());
                    } else {
                        eVar = eVar2;
                    }
                } catch (Exception e10) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e10);
                }
            } catch (Exception e11) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e11);
            }
        } catch (ClassCastException e12) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e12);
        } catch (ClassNotFoundException e13) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e13);
        }
        f37145x = eVar;
    }

    public DnsNameResolver(String str, io.grpc.n.a aVar, GrpcUtil.b bVar, com.google.common.base.i iVar, boolean z10) {
        A8.p.j(aVar, StepData.ARGS);
        this.f37154h = bVar;
        A8.p.j(str, "name");
        URI uriCreate = URI.create("//".concat(str));
        A8.p.e(str, "Invalid DNS name: %s", uriCreate.getHost() != null);
        String authority = uriCreate.getAuthority();
        if (authority == null) {
            throw new NullPointerException(A8.A.h("nameUri (%s) doesn't have an authority", uriCreate));
        }
        this.f37151e = authority;
        this.f37152f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f37153g = aVar.f37791a;
        } else {
            this.f37153g = uriCreate.getPort();
        }
        w0 w0Var = aVar.f37792b;
        A8.p.j(w0Var, "proxyDetector");
        this.f37147a = w0Var;
        long nanos = 0;
        if (!z10) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f37140s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.f37155i = nanos;
        this.f37156k = iVar;
        D9.w wVar = aVar.f37793c;
        A8.p.j(wVar, "syncContext");
        this.j = wVar;
        ManagedChannelImpl.g gVar = aVar.f37797g;
        this.f37159n = gVar;
        this.f37160o = gVar == null;
        H0 h8 = aVar.f37794d;
        A8.p.j(h8, "serviceConfigParser");
        this.f37161p = h8;
    }

    public static Map<String, ?> f(Map<String, ?> map, Random random, String str) {
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            I2.e.s(entry, "Bad key: %s", f37141t.contains(entry.getKey()));
        }
        List listD = C2217e0.d("clientLanguage", map);
        if (listD != null && !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dE = C2217e0.e("percentage", map);
        if (dE != null) {
            int iIntValue = dE.intValue();
            I2.e.s(dE, "Bad percentage: %s", iIntValue >= 0 && iIntValue <= 100);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listD2 = C2217e0.d("clientHostname", map);
        if (listD2 != null && !listD2.isEmpty()) {
            Iterator it2 = listD2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map<String, ?> mapG = C2217e0.g("serviceConfig", map);
        if (mapG != null) {
            return mapG;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList g(List list) throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = C2215d0.f37530a;
                M7.a aVar = new M7.a(new StringReader(strSubstring));
                try {
                    Object objA = C2215d0.a(aVar);
                    try {
                        aVar.close();
                    } catch (IOException e10) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e10);
                    }
                    if (!(objA instanceof List)) {
                        throw new ClassCastException(coil.intercept.a.a(objA, "wrong type "));
                    }
                    List list2 = (List) objA;
                    C2217e0.a(list2);
                    arrayList.addAll(list2);
                } catch (Throwable th) {
                    try {
                        aVar.close();
                    } catch (IOException e11) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e11);
                    }
                    throw th;
                }
            } else {
                f37140s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // io.grpc.n
    public final String a() {
        return this.f37151e;
    }

    @Override // io.grpc.n
    public final void b() {
        A8.p.p("not started", this.f37163r != null);
        h();
    }

    @Override // io.grpc.n
    public final void c() {
        if (this.f37158m) {
            return;
        }
        this.f37158m = true;
        Executor executor = this.f37159n;
        if (executor == null || !this.f37160o) {
            return;
        }
        L0.b(this.f37154h, executor);
        this.f37159n = null;
    }

    @Override // io.grpc.n
    public final void d(io.grpc.n.d dVar) {
        A8.p.p("already started", this.f37163r == null);
        if (this.f37160o) {
            this.f37159n = (Executor) L0.a(this.f37154h);
        }
        this.f37163r = dVar;
        h();
    }

    public final b e() {
        d dVarA;
        e eVar;
        io.grpc.n.b bVar;
        io.grpc.n.b bVar2;
        List<K0.a> listD;
        io.grpc.n.b bVar3;
        String str = this.f37152f;
        b bVar4 = new b();
        try {
            bVar4.f37167b = i();
            if (f37144w) {
                List<String> listEmptyList = Collections.emptyList();
                boolean z10 = false;
                if (f37142u) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z10 = f37143v;
                    } else if (!str.contains(":")) {
                        boolean z11 = true;
                        for (int i10 = 0; i10 < str.length(); i10++) {
                            char cCharAt = str.charAt(i10);
                            if (cCharAt != '.') {
                                z11 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z10 = !z11;
                    }
                }
                io.grpc.n.b bVar5 = null;
                Object obj = null;
                bVar5 = null;
                if (z10) {
                    dVarA = this.f37150d.get();
                    if (dVarA == null && (eVar = f37145x) != null) {
                        dVarA = eVar.a();
                    }
                } else {
                    dVarA = null;
                }
                Logger logger = f37140s;
                if (dVarA != null) {
                    try {
                        listEmptyList = dVarA.a("_grpc_config." + str);
                    } catch (Exception e10) {
                        logger.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e10);
                    }
                }
                if (listEmptyList.isEmpty()) {
                    logger.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.f37148b;
                    if (f37146y == null) {
                        try {
                            f37146y = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e11) {
                            throw new RuntimeException(e11);
                        }
                    }
                    String str2 = f37146y;
                    try {
                        Iterator it = g(listEmptyList).iterator();
                        Map<String, ?> mapF = null;
                        while (it.hasNext()) {
                            try {
                                mapF = f((Map) it.next(), random, str2);
                                if (mapF != null) {
                                    break;
                                }
                            } catch (RuntimeException e12) {
                                bVar = new io.grpc.n.b(Status.f36901g.h("failed to pick service config choice").g(e12));
                            }
                        }
                        bVar = mapF == null ? null : new io.grpc.n.b(mapF);
                    } catch (IOException | RuntimeException e13) {
                        bVar = new io.grpc.n.b(Status.f36901g.h("failed to parse TXT records").g(e13));
                    }
                    if (bVar != null) {
                        Status status = bVar.f37798a;
                        if (status != null) {
                            bVar5 = new io.grpc.n.b(status);
                        } else {
                            Map map = (Map) bVar.f37799b;
                            H0 h8 = this.f37161p;
                            h8.getClass();
                            try {
                                AutoConfiguredLoadBalancerFactory autoConfiguredLoadBalancerFactory = h8.f37229d;
                                autoConfiguredLoadBalancerFactory.getClass();
                                if (map != null) {
                                    try {
                                        listD = K0.d(K0.b(map));
                                    } catch (RuntimeException e14) {
                                        bVar3 = new io.grpc.n.b(Status.f36901g.h("can't parse load balancer configuration").g(e14));
                                    }
                                } else {
                                    listD = null;
                                }
                                bVar3 = (listD == null || listD.isEmpty()) ? null : K0.c(listD, autoConfiguredLoadBalancerFactory.f36996a);
                                if (bVar3 != null) {
                                    Status status2 = bVar3.f37798a;
                                    if (status2 != null) {
                                        bVar5 = new io.grpc.n.b(status2);
                                    } else {
                                        obj = bVar3.f37799b;
                                    }
                                }
                                bVar2 = new io.grpc.n.b(C2237o0.a(map, h8.f37226a, h8.f37227b, h8.f37228c, obj));
                            } catch (RuntimeException e15) {
                                bVar2 = new io.grpc.n.b(Status.f36901g.h("failed to parse service config").g(e15));
                            }
                            bVar5 = bVar2;
                        }
                    }
                }
                bVar4.f37168c = bVar5;
            }
            return bVar4;
        } catch (Exception e16) {
            bVar4.f37166a = Status.f36905l.h("Unable to resolve host " + str).g(e16);
            return bVar4;
        }
    }

    public final void h() {
        if (this.f37162q || this.f37158m) {
            return;
        }
        if (this.f37157l) {
            long j = this.f37155i;
            if (j != 0 && (j <= 0 || this.f37156k.a(TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.f37162q = true;
        this.f37159n.execute(new c(this.f37163r));
    }

    public final List<io.grpc.d> i() {
        try {
            try {
                a aVar = this.f37149c;
                String str = this.f37152f;
                ((JdkAddressResolver) aVar).getClass();
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new io.grpc.d(new InetSocketAddress((InetAddress) it.next(), this.f37153g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e10) {
                Object obj = com.google.common.base.l.f27810a;
                if (e10 instanceof RuntimeException) {
                    throw ((RuntimeException) e10);
                }
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f37140s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
