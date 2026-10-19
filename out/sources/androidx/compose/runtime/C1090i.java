package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Pair;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: androidx.compose.runtime.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1090i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1077b0 f13038a = new C1077b0("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1077b0 f13039b = new C1077b0("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1077b0 f13040c = new C1077b0("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1077b0 f13041d = new C1077b0("providers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1077b0 f13042e = new C1077b0(Name.REFER);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D6.a f13043f = new D6.a(1);

    public static final void a(ArrayList arrayList, int i10, int i11) {
        int iG = g(i10, arrayList);
        if (iG < 0) {
            iG = -(iG + 1);
        }
        while (iG < arrayList.size() && ((I) arrayList.get(iG)).f12850b < i11) {
            arrayList.remove(iG);
        }
    }

    public static final void b(z0 z0Var, ArrayList arrayList, int i10) {
        if (z0Var.j(i10)) {
            arrayList.add(z0Var.l(i10));
            return;
        }
        int[] iArr = z0Var.f13260b;
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            b(z0Var, arrayList, i12);
        }
    }

    public static final void c(String str) {
        throw new ComposeRuntimeError(androidx.compose.foundation.gestures.d.b("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new ComposeRuntimeError(androidx.compose.foundation.gestures.d.b("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(D0 d10, androidx.compose.runtime.internal.e eVar) {
        int iO;
        int[] iArr = d10.f12800b;
        int i10 = d10.f12817t;
        int iF = d10.f(iArr, d10.q(d10.s(i10) + i10));
        for (int iF2 = d10.f(d10.f12800b, d10.q(d10.f12817t)); iF2 < iF; iF2++) {
            Object obj = d10.f12801c[d10.g(iF2)];
            int iC = -1;
            if (obj instanceof InterfaceC1082e) {
                eVar.d((InterfaceC1082e) obj, d10.o() - iF2, -1, -1);
            } else if (obj instanceof u0) {
                u0 u0Var = (u0) obj;
                if (!(u0Var.f13247a instanceof w0)) {
                    i(d10, iF2, obj);
                    int iO2 = d10.o() - iF2;
                    C1074a c1074a = u0Var.f13248b;
                    if (c1074a == null || !c1074a.a()) {
                        iO = -1;
                    } else {
                        iC = d10.c(c1074a);
                        iO = d10.o() - d10.O(iC);
                    }
                    eVar.d(u0Var, iO2, iC, iO);
                }
            } else if (obj instanceof C1105p0) {
                i(d10, iF2, obj);
                ((C1105p0) obj).d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final S f(InterfaceC1115w interfaceC1115w, T t8, D0 d10, InterfaceC1078c<?> interfaceC1078c) {
        boolean z10 = true;
        int i10 = 1;
        int i11 = 1;
        boolean z11 = true;
        int i12 = 1;
        boolean z12 = true;
        A0 a10 = new A0();
        if (d10.f12803e != null) {
            a10.k();
        }
        if (d10.f12804f != null) {
            a10.f12779l = new androidx.collection.B<>();
        }
        int i13 = d10.f12817t;
        boolean z13 = false;
        if (interfaceC1078c != null && d10.D(i13) > 0) {
            int iE = d10.f12819v;
            while (iE > 0 && !d10.w(iE)) {
                iE = d10.E(d10.f12800b, iE);
            }
            if (iE >= 0 && d10.w(iE)) {
                Object objC = d10.C(iE);
                int i14 = iE + 1;
                int iS = d10.s(iE) + iE;
                int iD = z13;
                while (i14 < iS) {
                    int iS2 = d10.s(i14) + i14;
                    if (iS2 > i13) {
                        break;
                    }
                    iD += d10.w(i14) ? i10 : d10.D(i14);
                    i14 = iS2;
                }
                int iD2 = d10.w(i13) ? i11 : d10.D(i13);
                interfaceC1078c.b(objC);
                interfaceC1078c.e(iD, iD2);
                interfaceC1078c.f();
            }
        }
        D0 d0V = a10.v();
        try {
            d0V.d();
            Q<Object> q10 = t8.f12924a;
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            d0V.R(126665345, q10, c0153a, z13);
            D0.x(d0V);
            d0V.T(t8.f12925b);
            ?? B10 = d10.B(t8.f12928e, d0V);
            d0V.K();
            d0V.i();
            d0V.j();
            d0V.e(z10);
            S s10 = new S(a10);
            Collection collection = (Collection) B10;
            if (!collection.isEmpty()) {
                int size = collection.size();
                for (?? r10 = z13; r10 < size; r10 += z12 ? 1 : 0) {
                    C1074a c1074a = (C1074a) B10.get(r10);
                    if (a10.A(c1074a)) {
                        int iE2 = a10.e(c1074a);
                        int iC = C0.c(a10.f12770b, iE2);
                        int i15 = iE2 + i12;
                        if (((i15 < a10.f12771c ? a10.f12770b[(i15 * 5) + 4] : a10.f12772d.length) - iC > 0 ? a10.f12772d[iC] : c0153a) instanceof C1105p0) {
                            a aVar = new a(interfaceC1115w, t8);
                            D0 d0V2 = a10.v();
                            try {
                                C1105p0.a.a(d0V2, B10, aVar);
                                p293xa.r rVar = p293xa.r.f47939a;
                                break;
                            } finally {
                                d0V2.e(z13);
                            }
                        }
                    }
                }
            }
            return s10;
        } catch (Throwable th) {
            d0V.e(z13);
            throw th;
        }
    }

    public static final int g(int i10, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iG = kotlin.jvm.internal.i.g(((I) arrayList.get(i12)).f12850b, i10);
            if (iG < 0) {
                i11 = i12 + 1;
            } else {
                if (iG <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void h(D0 d10, androidx.compose.runtime.internal.e eVar) {
        int iO;
        int[] iArr = d10.f12800b;
        int i10 = d10.f12817t;
        int iF = d10.f(iArr, d10.q(d10.s(i10) + i10));
        for (int iF2 = d10.f(d10.f12800b, d10.q(d10.f12817t)); iF2 < iF; iF2++) {
            Object obj = d10.f12801c[d10.g(iF2)];
            int iC = -1;
            if (obj instanceof InterfaceC1082e) {
                int iO2 = d10.o() - iF2;
                InterfaceC1082e interfaceC1082e = (InterfaceC1082e) obj;
                androidx.collection.L<InterfaceC1082e> lA = eVar.f13060f;
                if (lA == null) {
                    lA = androidx.collection.V.a();
                    eVar.f13060f = lA;
                }
                lA.k(interfaceC1082e);
                eVar.d(interfaceC1082e, iO2, -1, -1);
            }
            if (obj instanceof u0) {
                int iO3 = d10.o() - iF2;
                u0 u0Var = (u0) obj;
                C1074a c1074a = u0Var.f13248b;
                if (c1074a == null || !c1074a.a()) {
                    iO = -1;
                } else {
                    iC = d10.c(c1074a);
                    iO = d10.o() - d10.O(iC);
                }
                eVar.d(u0Var, iO3, iC, iO);
            }
            if (obj instanceof C1105p0) {
                ((C1105p0) obj).d();
            }
        }
        d10.H();
    }

    public static final void i(D0 d10, int i10, Object obj) {
        int iG = d10.g(i10);
        Object[] objArr = d10.f12801c;
        Object obj2 = objArr[iG];
        objArr[iG] = InterfaceC1084f.a.f12980a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.i$a */
    /* JADX INFO: compiled from: Composer.kt */
    public static final class a implements InterfaceC1107q0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1115w f13044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f13045c;

        public a(InterfaceC1115w interfaceC1115w, T t8) {
            this.f13044b = interfaceC1115w;
            this.f13045c = t8;
        }

        @Override // androidx.compose.runtime.InterfaceC1107q0
        public final InvalidationResult c(C1105p0 c1105p0, Object obj) {
            InvalidationResult invalidationResultC;
            InterfaceC1115w interfaceC1115w = this.f13044b;
            InterfaceC1107q0 interfaceC1107q0 = interfaceC1115w instanceof InterfaceC1107q0 ? (InterfaceC1107q0) interfaceC1115w : null;
            if (interfaceC1107q0 == null || (invalidationResultC = interfaceC1107q0.c(c1105p0, obj)) == null) {
                invalidationResultC = InvalidationResult.f12852b;
            }
            if (invalidationResultC != InvalidationResult.f12852b) {
                return invalidationResultC;
            }
            T t8 = this.f13045c;
            t8.f12929f = kotlin.collections.q.d0((Collection) t8.f12929f, new Pair(c1105p0, obj));
            return InvalidationResult.f12853c;
        }

        @Override // androidx.compose.runtime.InterfaceC1107q0
        public final void b() {
        }

        @Override // androidx.compose.runtime.InterfaceC1107q0
        public final void a(Object obj) {
        }
    }
}
