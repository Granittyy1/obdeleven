package p078g1;

import com.braze.support.BrazeLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: TrackSelectionParameters.java */
/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final A f35180u = new A(new b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f35187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f35188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImmutableList<String> f35189i;
    public final ImmutableList<String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImmutableList<String> f35190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f35191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f35192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImmutableList<String> f35193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f35194o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ImmutableList<String> f35195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f35196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f35197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImmutableMap<y, z> f35198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImmutableSet<Integer> f35199t;

    /* JADX INFO: compiled from: TrackSelectionParameters.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35200a = new a();

        static {
            p114j1.A.B(1);
            p114j1.A.B(2);
            p114j1.A.B(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 29791;
        }
    }

    /* JADX INFO: compiled from: TrackSelectionParameters.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35201a = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35202b = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f35203c = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35204d = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f35205e = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f35206f = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f35207g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f35208h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ImmutableList<String> f35209i = ImmutableList.K();
        public ImmutableList<String> j = ImmutableList.K();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ImmutableList<String> f35210k = ImmutableList.K();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f35211l = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f35212m = BrazeLogger.SUPPRESS;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImmutableList<String> f35213n = ImmutableList.K();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public a f35214o = a.f35200a;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ImmutableList<String> f35215p = ImmutableList.K();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f35216q = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f35217r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public HashMap<y, z> f35218s = new HashMap<>();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public HashSet<Integer> f35219t = new HashSet<>();

        public A a() {
            return new A(this);
        }

        public b b(int i10) {
            Iterator<z> it = this.f35218s.values().iterator();
            while (it.hasNext()) {
                if (it.next().f35496a.f35493c == i10) {
                    it.remove();
                }
            }
            return this;
        }

        public final void c(A a10) {
            this.f35201a = a10.f35181a;
            this.f35202b = a10.f35182b;
            this.f35203c = a10.f35183c;
            this.f35204d = a10.f35184d;
            this.f35205e = a10.f35185e;
            this.f35206f = a10.f35186f;
            this.f35207g = a10.f35187g;
            this.f35208h = a10.f35188h;
            this.f35209i = a10.f35189i;
            this.j = a10.j;
            this.f35210k = a10.f35190k;
            this.f35211l = a10.f35191l;
            this.f35212m = a10.f35192m;
            this.f35213n = a10.f35193n;
            this.f35214o = a10.f35194o;
            this.f35215p = a10.f35195p;
            this.f35216q = a10.f35196q;
            this.f35217r = a10.f35197r;
            this.f35219t = new HashSet<>(a10.f35199t);
            this.f35218s = new HashMap<>(a10.f35198s);
        }

        public b d() {
            this.f35217r = -3;
            return this;
        }

        public b e(z zVar) {
            y yVar = zVar.f35496a;
            b(yVar.f35493c);
            this.f35218s.put(yVar, zVar);
            return this;
        }

        public b f() {
            return g(new String[0]);
        }

        public b g(String... strArr) {
            ImmutableList.b bVar = ImmutableList.f27874c;
            ImmutableList.a aVar = new ImmutableList.a();
            for (String str : strArr) {
                str.getClass();
                aVar.c(p114j1.A.G(str));
            }
            this.f35215p = aVar.h();
            this.f35216q = false;
            return this;
        }

        public b h() {
            this.f35216q = false;
            return this;
        }

        public b i(int i10) {
            this.f35219t.remove(Integer.valueOf(i10));
            return this;
        }
    }

    static {
        com.obdeleven.service.core.b.b(1, 2, 3, 4, 5);
        com.obdeleven.service.core.b.b(6, 7, 8, 9, 10);
        com.obdeleven.service.core.b.b(11, 12, 13, 14, 15);
        com.obdeleven.service.core.b.b(16, 17, 18, 19, 20);
        com.obdeleven.service.core.b.b(21, 22, 23, 24, 25);
        com.obdeleven.service.core.b.b(26, 27, 28, 29, 30);
        p114j1.A.B(31);
        p114j1.A.B(32);
        p114j1.A.B(33);
        p114j1.A.B(34);
    }

    public A(b bVar) {
        this.f35181a = bVar.f35201a;
        this.f35182b = bVar.f35202b;
        this.f35183c = bVar.f35203c;
        this.f35184d = bVar.f35204d;
        this.f35185e = bVar.f35205e;
        this.f35186f = bVar.f35206f;
        this.f35187g = bVar.f35207g;
        this.f35188h = bVar.f35208h;
        this.f35189i = bVar.f35209i;
        this.j = bVar.j;
        this.f35190k = bVar.f35210k;
        this.f35191l = bVar.f35211l;
        this.f35192m = bVar.f35212m;
        this.f35193n = bVar.f35213n;
        this.f35194o = bVar.f35214o;
        this.f35195p = bVar.f35215p;
        this.f35196q = bVar.f35216q;
        this.f35197r = bVar.f35217r;
        this.f35198s = ImmutableMap.a(bVar.f35218s);
        this.f35199t = ImmutableSet.C(bVar.f35219t);
    }

    public b a() {
        b bVar = new b();
        bVar.c(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        A a10 = (A) obj;
        if (this.f35181a == a10.f35181a && this.f35182b == a10.f35182b && this.f35183c == a10.f35183c && this.f35184d == a10.f35184d && this.f35188h == a10.f35188h && this.f35185e == a10.f35185e && this.f35186f == a10.f35186f && this.f35187g == a10.f35187g && this.f35189i.equals(a10.f35189i) && this.j.equals(a10.j) && this.f35190k.equals(a10.f35190k) && this.f35191l == a10.f35191l && this.f35192m == a10.f35192m && this.f35193n.equals(a10.f35193n) && this.f35194o.equals(a10.f35194o) && this.f35195p.equals(a10.f35195p) && this.f35196q == a10.f35196q && this.f35197r == a10.f35197r) {
            ImmutableMap<y, z> immutableMap = this.f35198s;
            immutableMap.getClass();
            if (q.a(a10.f35198s, immutableMap) && this.f35199t.equals(a10.f35199t)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f35193n.hashCode() + ((((((this.f35190k.hashCode() + ((this.j.hashCode() + ((this.f35189i.hashCode() + ((((((((((((((((this.f35181a + 31) * 31) + this.f35182b) * 31) + this.f35183c) * 31) + this.f35184d) * 28629151) + (this.f35188h ? 1 : 0)) * 31) + this.f35185e) * 31) + this.f35186f) * 31) + (this.f35187g ? 1 : 0)) * 31)) * 31)) * 961)) * 961) + this.f35191l) * 31) + this.f35192m) * 31)) * 31;
        this.f35194o.getClass();
        return this.f35199t.hashCode() + ((this.f35198s.hashCode() + ((((((this.f35195p.hashCode() + ((iHashCode + 29791) * 31)) * 961) + (this.f35196q ? 1 : 0)) * 31) + this.f35197r) * 28629151)) * 31);
    }
}
