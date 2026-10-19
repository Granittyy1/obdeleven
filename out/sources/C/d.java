package C;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.runtime.C0;
import androidx.compose.runtime.C1074a;
import androidx.compose.runtime.C1075a0;
import androidx.compose.runtime.C1090i;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC1078c;
import androidx.compose.runtime.InterfaceC1092j;
import androidx.compose.runtime.InterfaceC1115w;
import androidx.compose.runtime.S;
import androidx.compose.runtime.T;
import androidx.compose.runtime.u0;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2234b;

    /* JADX INFO: compiled from: Operation.kt */
    public static final class A extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final A f2235c;

        static {
            int i10 = 0;
            f2235c = new A(i10, i10, 3);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            d10.L();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class B extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final B f2236c;

        static {
            int i10 = 1;
            f2236c = new B(0, i10, i10);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            eVar.getClass();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class C extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C f2237c = new C(1, 0, 2);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            int iC;
            int iO;
            int iA = aVar.a(0);
            int iO2 = d10.o();
            int i10 = d10.f12819v;
            int iM = d10.M(d10.f12800b, d10.q(i10));
            int iF = d10.f(d10.f12800b, d10.q(i10 + 1));
            for (int iMax = Math.max(iM, iF - iA); iMax < iF; iMax++) {
                Object obj = d10.f12801c[d10.g(iMax)];
                if (obj instanceof u0) {
                    int i11 = iO2 - iMax;
                    u0 u0Var = (u0) obj;
                    C1074a c1074a = u0Var.f13248b;
                    if (c1074a == null || !c1074a.a()) {
                        iC = -1;
                        iO = -1;
                    } else {
                        iC = d10.c(c1074a);
                        iO = d10.o() - d10.O(iC);
                    }
                    eVar.d(u0Var, i11, iC, iO);
                } else if (obj instanceof C1105p0) {
                    ((C1105p0) obj).d();
                }
            }
            if (!(iA > 0)) {
                C1090i.c("Check failed");
            }
            int i12 = d10.f12819v;
            int iM2 = d10.M(d10.f12800b, d10.q(i12));
            int iF2 = d10.f(d10.f12800b, d10.q(i12 + 1)) - iA;
            if (iF2 < iM2) {
                C1090i.c("Check failed");
            }
            d10.J(iF2, iA, i12);
            int i13 = d10.f12807i;
            if (i13 >= iM2) {
                d10.f12807i = i13 - iA;
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class D extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final D f2238c = new D(1, 2);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            int iC;
            int iO;
            Object objB = aVar.b(0);
            C1074a c1074a = (C1074a) aVar.b(1);
            int iA = aVar.a(0);
            if (objB instanceof u0) {
                eVar.e((u0) objB);
            }
            int iC2 = d10.c(c1074a);
            int iG = d10.g(d10.N(iC2, iA));
            Object[] objArr = d10.f12801c;
            Object obj = objArr[iG];
            objArr[iG] = objB;
            if (!(obj instanceof u0)) {
                if (obj instanceof C1105p0) {
                    ((C1105p0) obj).d();
                    return;
                }
                return;
            }
            int iO2 = d10.o() - d10.N(iC2, iA);
            u0 u0Var = (u0) obj;
            C1074a c1074a2 = u0Var.f13248b;
            if (c1074a2 == null || !c1074a2.a()) {
                iC = -1;
                iO = -1;
            } else {
                iC = d10.c(c1074a2);
                iO = d10.o() - d10.O(iC);
            }
            eVar.d(u0Var, iO2, iC, iO);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class E extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final E f2239c;

        static {
            int i10 = 1;
            f2239c = new E(0, i10, i10);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            d10.U(aVar.b(0));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class F extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final F f2240c = new F(0, 2, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            ((Ia.p) aVar.b(1)).invoke(interfaceC1078c.h(), aVar.b(0));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class G extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final G f2241c = new G(1, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            Object objB = aVar.b(0);
            int iA = aVar.a(0);
            if (objB instanceof u0) {
                eVar.e((u0) objB);
            }
            int iG = d10.g(d10.N(d10.f12817t, iA));
            Object[] objArr = d10.f12801c;
            Object obj = objArr[iG];
            objArr[iG] = objB;
            if (obj instanceof u0) {
                eVar.d((u0) obj, d10.o() - d10.N(d10.f12817t, iA), -1, -1);
            } else if (obj instanceof C1105p0) {
                ((C1105p0) obj).d();
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class H extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H f2242c = new H(1, 0, 2);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            int iA = aVar.a(0);
            for (int i10 = 0; i10 < iA; i10++) {
                interfaceC1078c.f();
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class I extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final I f2243c;

        static {
            int i10 = 0;
            f2243c = new I(i10, i10, 3);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            interfaceC1078c.c();
        }
    }

    /* JADX INFO: renamed from: C.d$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0666a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0666a f2244c = new C0666a(1, 0, 2);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            d10.a(aVar.a(0));
        }
    }

    /* JADX INFO: renamed from: C.d$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0667b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0667b f2245c = new C0667b(0, 2, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            C1074a c1074a = (C1074a) aVar.b(0);
            Object objB = aVar.b(1);
            if (objB instanceof u0) {
                eVar.e((u0) objB);
            }
            if (d10.f12811n != 0) {
                C1090i.c("Can only append a slot if not current inserting");
            }
            int i10 = d10.f12807i;
            int i11 = d10.j;
            int iC = d10.c(c1074a);
            int iF = d10.f(d10.f12800b, d10.q(iC + 1));
            d10.f12807i = iF;
            d10.j = iF;
            d10.v(1, iC);
            if (i10 >= iF) {
                i10++;
                i11++;
            }
            d10.f12801c[iF] = objB;
            d10.f12807i = i10;
            d10.j = i11;
        }
    }

    /* JADX INFO: renamed from: C.d$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0668c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0668c f2246c = new C0668c(0, 2, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            androidx.compose.runtime.internal.b bVar = (androidx.compose.runtime.internal.b) aVar.b(1);
            int i10 = bVar != null ? bVar.f13052a : 0;
            a aVar2 = (a) aVar.b(0);
            if (i10 > 0) {
                interfaceC1078c = new C1075a0(interfaceC1078c, i10);
            }
            aVar2.i0(interfaceC1078c, d10, eVar);
        }
    }

    /* JADX INFO: renamed from: C.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0020d extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0020d f2247c = new C0020d(0, 2, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            int i10 = ((androidx.compose.runtime.internal.b) aVar.b(0)).f13052a;
            List list = (List) aVar.b(1);
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                i.c(interfaceC1078c, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i12 = i10 + i11;
                interfaceC1078c.a(i12, obj);
                interfaceC1078c.g(i12, obj);
            }
        }
    }

    /* JADX INFO: renamed from: C.d$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0669e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0669e f2248c = new C0669e(0, 4, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            T t8 = (T) aVar.b(2);
            T t10 = (T) aVar.b(3);
            AbstractC1094k abstractC1094k = (AbstractC1094k) aVar.b(1);
            S sL = (S) aVar.b(0);
            if (sL == null && (sL = abstractC1094k.l(t8)) == null) {
                C1090i.d("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            if (d10.f12811n > 0 || d10.s(d10.f12817t + 1) != 1) {
                C1090i.c("Check failed");
            }
            int i10 = d10.f12817t;
            int i11 = d10.f12807i;
            int i12 = d10.j;
            d10.a(1);
            d10.Q();
            d10.d();
            D0 d0V = sL.f12921a.v();
            try {
                List listA = D0.a.a(d0V, 2, d10, false, true, true);
                d0V.e(true);
                d10.j();
                d10.i();
                d10.f12817t = i10;
                d10.f12807i = i11;
                d10.j = i12;
                C1105p0.a.a(d10, listA, t10.f12926c);
            } catch (Throwable th) {
                d0V.e(false);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C.d$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0670f extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0670f f2249c;

        static {
            int i10 = 0;
            f2249c = new C0670f(i10, i10, 3);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            C1090i.e(d10, eVar);
        }
    }

    /* JADX INFO: renamed from: C.d$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0671g extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0671g f2250c = new C0671g(0, 2, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            int i10;
            androidx.compose.runtime.internal.b bVar = (androidx.compose.runtime.internal.b) aVar.b(0);
            C1074a c1074a = (C1074a) aVar.b(1);
            i.c(interfaceC1078c, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int iC = d10.c(c1074a);
            if (!(d10.f12817t < iC)) {
                C1090i.c("Check failed");
            }
            e.k(d10, interfaceC1078c, iC);
            int i11 = d10.f12817t;
            int iE = d10.f12819v;
            while (iE >= 0 && !d10.w(iE)) {
                iE = d10.E(d10.f12800b, iE);
            }
            int iS = iE + 1;
            int iK = 0;
            while (iS < i11) {
                if (d10.t(i11, iS)) {
                    if (d10.w(iS)) {
                        iK = 0;
                    }
                    iS++;
                } else {
                    iK += d10.w(iS) ? 1 : d10.D(iS);
                    iS += d10.s(iS);
                }
            }
            while (true) {
                i10 = d10.f12817t;
                if (i10 >= iC) {
                    break;
                }
                if (d10.t(iC, i10)) {
                    int i12 = d10.f12817t;
                    if (i12 < d10.f12818u && (d10.f12800b[(d10.q(i12) * 5) + 1] & 1073741824) != 0) {
                        interfaceC1078c.b(d10.C(d10.f12817t));
                        iK = 0;
                    }
                    d10.Q();
                } else {
                    iK += d10.K();
                }
            }
            if (i10 != iC) {
                C1090i.c("Check failed");
            }
            bVar.f13052a = iK;
        }
    }

    /* JADX INFO: renamed from: C.d$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0672h extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0672h f2251c;

        static {
            int i10 = 1;
            f2251c = new C0672h(0, i10, i10);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            i.c(interfaceC1078c, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) aVar.b(0)) {
                interfaceC1078c.b(obj);
            }
        }
    }

    /* JADX INFO: renamed from: C.d$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: Operation.kt */
    public static final class C0673i extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0673i f2252c = new C0673i(0, 2, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            ((Ia.l) aVar.b(0)).invoke((InterfaceC1092j) aVar.b(1));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class j extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f2253c;

        static {
            int i10 = 0;
            f2253c = new j(i10, i10, 3);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            d10.i();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class k extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f2254c;

        static {
            int i10 = 0;
            f2254c = new k(i10, i10, 3);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            i.c(interfaceC1078c, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            e.k(d10, interfaceC1078c, 0);
            d10.i();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class l extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f2255c;

        static {
            int i10 = 1;
            f2255c = new l(0, i10, i10);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            eVar.getClass();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class m extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f2256c;

        static {
            int i10 = 1;
            f2256c = new m(0, i10, i10);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            C1074a c1074a = (C1074a) aVar.b(0);
            c1074a.getClass();
            d10.k(d10.c(c1074a));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class n extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f2257c;

        static {
            int i10 = 0;
            f2257c = new n(i10, i10, 3);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            d10.k(0);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class o extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f2258c = new o(1, 2);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            Object objInvoke = ((Ia.a) aVar.b(0)).invoke();
            C1074a c1074a = (C1074a) aVar.b(1);
            int iA = aVar.a(0);
            i.c(interfaceC1078c, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            c1074a.getClass();
            d10.W(d10.c(c1074a), objInvoke);
            interfaceC1078c.g(iA, objInvoke);
            interfaceC1078c.b(objInvoke);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class p extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f2259c = new p(0, 2, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            A0 a10 = (A0) aVar.b(1);
            C1074a c1074a = (C1074a) aVar.b(0);
            d10.d();
            c1074a.getClass();
            d10.y(a10, a10.e(c1074a));
            d10.j();
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class q extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f2260c = new q(0, 3, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            A0 a10 = (A0) aVar.b(1);
            C1074a c1074a = (C1074a) aVar.b(0);
            c cVar = (c) aVar.b(2);
            D0 d0V = a10.v();
            try {
                if (!cVar.f2232d.k0()) {
                    C1090i.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                }
                cVar.f2231c.j0(interfaceC1078c, d0V, eVar);
                p293xa.r rVar = p293xa.r.f47939a;
                d0V.e(true);
                d10.d();
                c1074a.getClass();
                d10.y(a10, a10.e(c1074a));
                d10.j();
            } catch (Throwable th) {
                d0V.e(false);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class r extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f2261c = new r(1, 0, 2);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            C1074a c1074a;
            int iC;
            int iA = aVar.a(0);
            if (d10.f12811n != 0) {
                C1090i.c("Cannot move a group while inserting");
            }
            if (!(iA >= 0)) {
                C1090i.c("Parameter offset is out of bounds");
            }
            if (iA == 0) {
                return;
            }
            int i10 = d10.f12817t;
            int i11 = d10.f12819v;
            int i12 = d10.f12818u;
            int i13 = i10;
            while (iA > 0) {
                i13 += d10.f12800b[(d10.q(i13) * 5) + 3];
                if (i13 > i12) {
                    C1090i.c("Parameter offset is out of bounds");
                }
                iA--;
            }
            int i14 = d10.f12800b[(d10.q(i13) * 5) + 3];
            int iF = d10.f(d10.f12800b, d10.q(d10.f12817t));
            int iF2 = d10.f(d10.f12800b, d10.q(i13));
            int i15 = i13 + i14;
            int iF3 = d10.f(d10.f12800b, d10.q(i15));
            int i16 = iF3 - iF2;
            d10.v(i16, Math.max(d10.f12817t - 1, 0));
            d10.u(i14);
            int[] iArr = d10.f12800b;
            int iQ = d10.q(i15) * 5;
            Q3.d.m(d10.q(i10) * 5, iQ, (i14 * 5) + iQ, iArr, iArr);
            if (i16 > 0) {
                Object[] objArr = d10.f12801c;
                int iG = d10.g(iF2 + i16);
                System.arraycopy(objArr, iG, objArr, iF, d10.g(iF3 + i16) - iG);
            }
            int i17 = iF2 + i16;
            int i18 = i17 - iF;
            int i19 = d10.f12808k;
            int i20 = d10.f12809l;
            int length = d10.f12801c.length;
            int i21 = d10.f12810m;
            int i22 = i10 + i14;
            int i23 = i10;
            while (i23 < i22) {
                int iQ2 = d10.q(i23);
                int i24 = i19;
                int i25 = i18;
                iArr[(iQ2 * 5) + 4] = D0.h(D0.h(d10.f(iArr, iQ2) - i18, i21 < iQ2 ? 0 : i24, i20, length), d10.f12808k, d10.f12809l, d10.f12801c.length);
                i23++;
                i19 = i24;
                i18 = i25;
                i20 = i20;
                length = length;
            }
            int i26 = i15 + i14;
            int iN = d10.n();
            int iB = C0.b(d10.f12802d, i15, iN);
            ArrayList arrayList = new ArrayList();
            if (iB >= 0) {
                while (iB < d10.f12802d.size() && (iC = d10.c((c1074a = d10.f12802d.get(iB)))) >= i15 && iC < i26) {
                    arrayList.add(c1074a);
                    d10.f12802d.remove(iB);
                }
            }
            int i27 = i10 - i15;
            int size = arrayList.size();
            for (int i28 = 0; i28 < size; i28++) {
                C1074a c1074a2 = (C1074a) arrayList.get(i28);
                int iC2 = d10.c(c1074a2) + i27;
                if (iC2 >= d10.f12805g) {
                    c1074a2.f12935a = -(iN - iC2);
                } else {
                    c1074a2.f12935a = iC2;
                }
                d10.f12802d.add(C0.b(d10.f12802d, iC2, iN), c1074a2);
            }
            if (d10.I(i15, i14)) {
                C1090i.c("Unexpectedly removed anchors");
            }
            d10.l(i11, d10.f12818u, i10);
            if (i16 > 0) {
                d10.J(i17, i16, i15 - 1);
            }
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class s extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f2262c = new s(3, 0, 2);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            interfaceC1078c.d(aVar.a(0), aVar.a(1), aVar.a(2));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class t extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f2263c = new t(1, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            C1074a c1074a = (C1074a) aVar.b(0);
            int iA = aVar.a(0);
            interfaceC1078c.f();
            c1074a.getClass();
            interfaceC1078c.a(iA, d10.C(d10.c(c1074a)));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class u extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f2264c = new u(0, 3, 1);

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            InterfaceC1115w interfaceC1115w = (InterfaceC1115w) aVar.b(0);
            T t8 = (T) aVar.b(2);
            ((AbstractC1094k) aVar.b(1)).k(t8, C1090i.f(interfaceC1115w, t8, d10, null), interfaceC1078c);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class v extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f2265c;

        static {
            int i10 = 1;
            f2265c = new v(0, i10, i10);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            eVar.e((u0) aVar.b(0));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class w extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f2266c;

        static {
            int i10 = 0;
            f2266c = new w(i10, i10, 3);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            C1090i.h(d10, eVar);
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class x extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f2267c;

        static {
            int i10 = 2;
            f2267c = new x(i10, 0, i10);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            interfaceC1078c.e(aVar.a(0), aVar.a(1));
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class y extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f2268c;

        static {
            int i10 = 0;
            f2268c = new y(i10, i10, 3);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            if (d10.f12811n != 0) {
                C1090i.c("Cannot reset when inserting");
            }
            d10.G();
            d10.f12817t = 0;
            d10.f12818u = d10.m() - d10.f12806h;
            d10.f12807i = 0;
            d10.j = 0;
            d10.f12812o = 0;
        }
    }

    /* JADX INFO: compiled from: Operation.kt */
    public static final class z extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f2269c;

        static {
            int i10 = 1;
            f2269c = new z(0, i10, i10);
        }

        @Override // C.d
        public final void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar) {
            eVar.f13059e.b((Ia.a) aVar.b(0));
        }
    }

    public d(int i10, int i11) {
        this.f2233a = i10;
        this.f2234b = i11;
    }

    public abstract void a(f.a aVar, InterfaceC1078c interfaceC1078c, D0 d10, androidx.compose.runtime.internal.e eVar);

    public final String toString() {
        String strA = kotlin.jvm.internal.l.a(getClass()).a();
        return strA == null ? "" : strA;
    }

    public /* synthetic */ d(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
