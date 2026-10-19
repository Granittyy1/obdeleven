package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.C0897z;
import androidx.collection.MutableSetWrapper;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.runtime.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1086g implements InterfaceC1084f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12981A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f12982B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1088h f12983C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f12984D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f12985E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public z0 f12986F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public A0 f12987G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public D0 f12988H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f12989I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public InterfaceC1089h0 f12990J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C.a f12991K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C.b f12992L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1074a f12993M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C.c f12994N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f12995O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f12996P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C1098m f12997Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.node.f0 f12998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1094k f12999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0 f13000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSetWrapper f13001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C.a f13002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C.a f13003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1100n f13004g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1087g0 f13006i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13008l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f13010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0897z f13011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13013q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.collection.B<InterfaceC1089h0> f13017u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13018v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13020x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13022z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f13005h = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final T4.o0 f13009m = new T4.o0(1, false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f13014r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final T4.o0 f13015s = new T4.o0(1, false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC1089h0 f13016t = androidx.compose.runtime.internal.d.f13053e;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final T4.o0 f13019w = new T4.o0(1, false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13021y = -1;

    /* JADX INFO: renamed from: androidx.compose.runtime.g$b */
    /* JADX INFO: compiled from: Composer.kt */
    public final class b extends AbstractC1094k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f13025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f13026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public HashSet f13027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LinkedHashSet f13028e = new LinkedHashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C1085f0 f13029f = new C1085f0(androidx.compose.runtime.internal.d.f13053e, C1108r0.f13116a);

        public b(int i10, boolean z10, boolean z11, C1112t c1112t) {
            this.f13024a = i10;
            this.f13025b = z10;
            this.f13026c = z11;
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void a(C1100n c1100n, ComposableLambdaImpl composableLambdaImpl) {
            C1086g.this.f12999b.a(c1100n, composableLambdaImpl);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void b(T t8) {
            C1086g.this.f12999b.b(t8);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void c() {
            C1086g.this.f13022z--;
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final boolean d() {
            return C1086g.this.f12999b.d();
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final boolean e() {
            return this.f13025b;
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final boolean f() {
            return this.f13026c;
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final InterfaceC1089h0 g() {
            return (InterfaceC1089h0) this.f13029f.getValue();
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final int h() {
            return this.f13024a;
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final kotlin.coroutines.e i() {
            return C1086g.this.f12999b.i();
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void j(C1100n c1100n) {
            C1086g c1086g = C1086g.this;
            c1086g.f12999b.j(c1086g.f13004g);
            c1086g.f12999b.j(c1100n);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void k(T t8, S s10, InterfaceC1078c<?> interfaceC1078c) {
            C1086g.this.f12999b.k(t8, s10, interfaceC1078c);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final S l(T t8) {
            return C1086g.this.f12999b.l(t8);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void m(Set<H.a> set) {
            HashSet hashSet = this.f13027d;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f13027d = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void n(C1086g c1086g) {
            this.f13028e.add(c1086g);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void o(C1100n c1100n) {
            C1086g.this.f12999b.o(c1100n);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void p() {
            C1086g.this.f13022z++;
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void q(InterfaceC1084f interfaceC1084f) {
            HashSet<Set> hashSet = this.f13027d;
            if (hashSet != null) {
                for (Set set : hashSet) {
                    kotlin.jvm.internal.i.c(interfaceC1084f, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set.remove(((C1086g) interfaceC1084f).f13000c);
                }
            }
            kotlin.jvm.internal.o.a(this.f13028e).remove(interfaceC1084f);
        }

        @Override // androidx.compose.runtime.AbstractC1094k
        public final void r(C1100n c1100n) {
            C1086g.this.f12999b.r(c1100n);
        }

        public final void s() {
            LinkedHashSet<C1086g> linkedHashSet = this.f13028e;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            HashSet hashSet = this.f13027d;
            if (hashSet != null) {
                for (C1086g c1086g : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(c1086g.f13000c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }

    public C1086g(androidx.compose.ui.node.f0 f0Var, AbstractC1094k abstractC1094k, A0 a10, MutableSetWrapper mutableSetWrapper, C.a aVar, C.a aVar2, C1100n c1100n) {
        this.f12998a = f0Var;
        this.f12999b = abstractC1094k;
        this.f13000c = a10;
        this.f13001d = mutableSetWrapper;
        this.f13002e = aVar;
        this.f13003f = aVar2;
        this.f13004g = c1100n;
        this.f12982B = abstractC1094k.f() || abstractC1094k.d();
        this.f12983C = new C1088h(this);
        this.f12984D = new ArrayList();
        z0 z0VarQ = a10.q();
        z0VarQ.c();
        this.f12986F = z0VarQ;
        A0 a11 = new A0();
        if (abstractC1094k.f()) {
            a11.k();
        }
        if (abstractC1094k.d()) {
            a11.f12779l = new androidx.collection.B<>();
        }
        this.f12987G = a11;
        D0 d0V = a11.v();
        d0V.e(true);
        this.f12988H = d0V;
        this.f12992L = new C.b(this, aVar);
        z0 z0VarQ2 = this.f12987G.q();
        try {
            C1074a c1074aA = z0VarQ2.a(0);
            z0VarQ2.c();
            this.f12993M = c1074aA;
            this.f12994N = new C.c();
        } catch (Throwable th) {
            z0VarQ2.c();
            throw th;
        }
    }

    public static final void N(C1086g c1086g, final Q q10, InterfaceC1089h0 interfaceC1089h0, final Object obj) {
        c1086g.q(126665345, q10);
        c1086g.c0();
        c1086g.z0(obj);
        int i10 = c1086g.f12996P;
        try {
            c1086g.f12996P = 126665345;
            if (c1086g.f12995O) {
                D0.x(c1086g.f12988H);
            }
            boolean z10 = (c1086g.f12995O || kotlin.jvm.internal.i.a(c1086g.f12986F.f(), interfaceC1089h0)) ? false : true;
            if (z10) {
                c1086g.i0(interfaceC1089h0);
            }
            c1086g.q0(202, 0, C1090i.f13040c, interfaceC1089h0);
            c1086g.f12990J = null;
            boolean z11 = c1086g.f13018v;
            c1086g.f13018v = z10;
            Fa.d.d(c1086g, new ComposableLambdaImpl(true, 316014703, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                    InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        q10.getClass();
                        throw null;
                    }
                    interfaceC1084f2.w();
                    return p293xa.r.f47939a;
                }
            }));
            c1086g.f13018v = z11;
        } finally {
            c1086g.T(false);
            c1086g.f12990J = null;
            c1086g.f12996P = i10;
            c1086g.T(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    public static final T l0(C1086g c1086g, int i10) {
        ArrayList arrayList;
        z0 z0Var = c1086g.f12986F;
        int i11 = i10 * 5;
        int[] iArr = z0Var.f13260b;
        int i12 = iArr[i11];
        Object objN = z0Var.n(iArr, i10);
        if (i12 != 126665345 || !(objN instanceof Q)) {
            return null;
        }
        if (c1086g.f12986F.d(i10)) {
            ArrayList arrayList2 = new ArrayList();
            m0(c1086g, arrayList2, i10);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        z0 z0Var2 = c1086g.f12986F;
        Object objN2 = z0Var2.n(z0Var2.f13260b, i10);
        kotlin.jvm.internal.i.c(objN2, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        Q q10 = (Q) objN2;
        Object objH = c1086g.f12986F.h(i10, 0);
        C1074a c1074aA = c1086g.f12986F.a(i10);
        int i13 = c1086g.f12986F.f13260b[i11 + 3] + i10;
        ArrayList arrayList3 = c1086g.f13014r;
        ArrayList arrayList4 = new ArrayList();
        int iG = C1090i.g(i10, arrayList3);
        if (iG < 0) {
            iG = -(iG + 1);
        }
        while (iG < arrayList3.size()) {
            I i14 = (I) arrayList3.get(iG);
            if (i14.f12850b >= i13) {
                break;
            }
            arrayList4.add(i14);
            iG++;
        }
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int size = arrayList4.size();
        for (int i15 = 0; i15 < size; i15++) {
            I i16 = (I) arrayList4.get(i15);
            arrayList5.add(new Pair(i16.f12849a, i16.f12851c));
        }
        return new T(q10, objH, c1086g.f13004g, c1086g.f13000c, c1074aA, arrayList5, c1086g.Q(i10), arrayList);
    }

    public static final void m0(C1086g c1086g, ArrayList arrayList, int i10) {
        int i11 = c1086g.f12986F.f13260b[(i10 * 5) + 3] + i10;
        int i12 = i10 + 1;
        while (i12 < i11) {
            z0 z0Var = c1086g.f12986F;
            int i13 = i12 * 5;
            if ((z0Var.f13260b[i13 + 1] & 134217728) != 0) {
                T tL0 = l0(c1086g, i12);
                if (tL0 != null) {
                    arrayList.add(tL0);
                }
            } else if (z0Var.d(i12)) {
                m0(c1086g, arrayList, i12);
            }
            i12 += c1086g.f12986F.f13260b[i13 + 3];
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0115 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int n0(androidx.compose.runtime.C1086g r11, int r12, int r13, boolean r14, int r15) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1086g.n0(androidx.compose.runtime.g, int, int, boolean, int):int");
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void A() {
        if (!this.f13013q) {
            C1090i.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f13013q = false;
        if (this.f12995O) {
            C1090i.c("useNode() called while inserting");
        }
        z0 z0Var = this.f12986F;
        Object objL = z0Var.l(z0Var.f13267i);
        C.b bVar = this.f12992L;
        bVar.d();
        bVar.f2227h.add(objL);
        if (this.f13020x && (objL instanceof InterfaceC1082e)) {
            bVar.c();
            C.a aVar = bVar.f2221b;
            aVar.getClass();
            if (objL instanceof InterfaceC1082e) {
                aVar.f2219c.m0(C.d.I.f2243c);
            }
        }
    }

    public final int A0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f13010n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? this.f12986F.m(i10) : i11;
        }
        C0897z c0897z = this.f13011o;
        if (c0897z == null || c0897z.a(i10) < 0) {
            return 0;
        }
        int iA = c0897z.a(i10);
        if (iA >= 0) {
            return c0897z.f9179c[iA];
        }
        D9.o.s("Cannot find value for key " + i10);
        throw null;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void B(InterfaceC1103o0 interfaceC1103o0) {
        C1105p0 c1105p0 = interfaceC1103o0 instanceof C1105p0 ? (C1105p0) interfaceC1103o0 : null;
        if (c1105p0 == null) {
            return;
        }
        c1105p0.f13106a |= 1;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean C(int i10, boolean z10) {
        return ((i10 & 1) == 0 && (this.f12995O || this.f13020x)) || z10 || !s();
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void D() {
        T(false);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void E(Object obj) {
        int i10;
        z0 z0Var;
        int i11;
        D0 d10;
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            C1074a c1074aA = null;
            if (this.f12995O) {
                D0 d11 = this.f12988H;
                int i12 = d11.f12817t;
                if (i12 > d11.f12819v + 1) {
                    int i13 = i12 - 1;
                    int iE = d11.E(d11.f12800b, i13);
                    while (true) {
                        i11 = i13;
                        i13 = iE;
                        d10 = this.f12988H;
                        if (i13 == d10.f12819v || i13 < 0) {
                            break;
                        } else {
                            iE = d10.E(d10.f12800b, i13);
                        }
                    }
                    c1074aA = d10.b(i11);
                }
            } else {
                z0 z0Var2 = this.f12986F;
                int i14 = z0Var2.f13265g;
                if (i14 > z0Var2.f13267i + 1) {
                    int i15 = i14 - 1;
                    int iO = z0Var2.o(i15);
                    while (true) {
                        i10 = i15;
                        i15 = iO;
                        z0Var = this.f12986F;
                        if (i15 == z0Var.f13267i || i15 < 0) {
                            break;
                        } else {
                            iO = z0Var.o(i15);
                        }
                    }
                    c1074aA = z0Var.a(i10);
                }
            }
            u0 u0Var = new u0(t0Var, c1074aA);
            if (this.f12995O) {
                C.a aVar = this.f12992L.f2221b;
                aVar.getClass();
                C.d.v vVar = C.d.v.f2265c;
                C.f fVar = aVar.f2219c;
                fVar.m0(vVar);
                C.f.b.a(fVar, 0, u0Var);
            }
            this.f13001d.add(obj);
            obj = u0Var;
        }
        z0(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final int F() {
        return this.f12996P;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final b G() {
        s0(206, C1090i.f13042e);
        if (this.f12995O) {
            D0.x(this.f12988H);
        }
        Object objC0 = c0();
        a aVar = objC0 instanceof a ? (a) objC0 : null;
        if (aVar == null) {
            aVar = new a(new b(this.f12996P, this.f13012p, this.f12982B, this.f13004g.f13094s));
            z0(aVar);
        }
        InterfaceC1089h0 interfaceC1089h0P = P();
        b bVar = aVar.f13023b;
        bVar.f13029f.setValue(interfaceC1089h0P);
        T(false);
        return bVar;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void H() {
        T(false);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void I() {
        T(false);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void J() {
        T(true);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean K(Object obj) {
        if (kotlin.jvm.internal.i.a(c0(), obj)) {
            return false;
        }
        z0(obj);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if ((r0.f13260b[(r4 * 5) + 1] & 536870912) != 0) goto L22;
     */
    @Override // androidx.compose.runtime.InterfaceC1084f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r10) {
        /*
            r9 = this;
            androidx.compose.runtime.g0 r0 = r9.f13006i
            r1 = 0
            r2 = 0
            if (r0 == 0) goto La
            r9.q0(r10, r1, r2, r2)
            return
        La:
            boolean r0 = r9.f13013q
            if (r0 == 0) goto L13
            java.lang.String r0 = "A call to createNode(), emitNode() or useNode() expected"
            androidx.compose.runtime.C1090i.c(r0)
        L13:
            int r0 = r9.f13008l
            int r3 = r9.f12996P
            r4 = 3
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            r3 = r3 ^ r10
            int r3 = java.lang.Integer.rotateLeft(r3, r4)
            r0 = r0 ^ r3
            r9.f12996P = r0
            int r0 = r9.f13008l
            r3 = 1
            int r0 = r0 + r3
            r9.f13008l = r0
            androidx.compose.runtime.z0 r0 = r9.f12986F
            boolean r4 = r9.f12995O
            androidx.compose.runtime.f$a$a r5 = androidx.compose.runtime.InterfaceC1084f.a.f12980a
            if (r4 == 0) goto L40
            int r4 = r0.f13268k
            int r4 = r4 + r3
            r0.f13268k = r4
            androidx.compose.runtime.D0 r0 = r9.f12988H
            r0.R(r10, r5, r5, r1)
            r9.X(r1, r2)
            return
        L40:
            int r4 = r0.g()
            if (r4 != r10) goto L60
            int r4 = r0.f13265g
            int r6 = r0.f13266h
            if (r4 >= r6) goto L59
            int r4 = r4 * 5
            int r4 = r4 + r3
            int[] r6 = r0.f13260b
            r4 = r6[r4]
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r6
            if (r4 == 0) goto L59
            goto L60
        L59:
            r0.s()
            r9.X(r1, r2)
            return
        L60:
            int r4 = r0.f13268k
            if (r4 <= 0) goto L65
            goto L81
        L65:
            int r4 = r0.f13265g
            int r6 = r0.f13266h
            if (r4 != r6) goto L6c
            goto L81
        L6c:
            int r6 = r9.j
            r9.h0()
            int r7 = r0.q()
            C.b r8 = r9.f12992L
            r8.g(r6, r7)
            java.util.ArrayList r6 = r9.f13014r
            int r7 = r0.f13265g
            androidx.compose.runtime.C1090i.a(r6, r4, r7)
        L81:
            int r4 = r0.f13268k
            int r4 = r4 + r3
            r0.f13268k = r4
            r9.f12995O = r3
            r9.f12990J = r2
            androidx.compose.runtime.D0 r0 = r9.f12988H
            boolean r0 = r0.f12820w
            if (r0 == 0) goto L9f
            androidx.compose.runtime.A0 r0 = r9.f12987G
            androidx.compose.runtime.D0 r0 = r0.v()
            r9.f12988H = r0
            r0.L()
            r9.f12989I = r1
            r9.f12990J = r2
        L9f:
            androidx.compose.runtime.D0 r0 = r9.f12988H
            r0.d()
            int r3 = r0.f12817t
            r0.R(r10, r5, r5, r1)
            androidx.compose.runtime.a r10 = r0.b(r3)
            r9.f12993M = r10
            r9.X(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1086g.L(int):void");
    }

    public final void M() {
        O();
        this.f13005h.clear();
        this.f13009m.f5989a = 0;
        this.f13015s.f5989a = 0;
        this.f13019w.f5989a = 0;
        this.f13017u = null;
        C.c cVar = this.f12994N;
        cVar.f2232d.i0();
        cVar.f2231c.i0();
        this.f12996P = 0;
        this.f13022z = 0;
        this.f13013q = false;
        this.f12995O = false;
        this.f13020x = false;
        this.f12985E = false;
        this.f13021y = -1;
        z0 z0Var = this.f12986F;
        if (!z0Var.f13264f) {
            z0Var.c();
        }
        if (this.f12988H.f12820w) {
            return;
        }
        Y();
    }

    public final void O() {
        this.f13006i = null;
        this.j = 0;
        this.f13007k = 0;
        this.f12996P = 0;
        this.f13013q = false;
        C.b bVar = this.f12992L;
        bVar.f2222c = false;
        bVar.f2223d.f5989a = 0;
        bVar.f2225f = 0;
        this.f12984D.clear();
        this.f13010n = null;
        this.f13011o = null;
    }

    public final InterfaceC1089h0 P() {
        InterfaceC1089h0 interfaceC1089h0 = this.f12990J;
        return interfaceC1089h0 != null ? interfaceC1089h0 : Q(this.f12986F.f13267i);
    }

    public final InterfaceC1089h0 Q(int i10) {
        InterfaceC1089h0 interfaceC1089h0B;
        boolean z10 = this.f12995O;
        C1077b0 c1077b0 = C1090i.f13040c;
        if (z10 && this.f12989I) {
            int iE = this.f12988H.f12819v;
            while (iE > 0) {
                D0 d10 = this.f12988H;
                if (d10.f12800b[d10.q(iE) * 5] == 202 && kotlin.jvm.internal.i.a(this.f12988H.r(iE), c1077b0)) {
                    Object objP = this.f12988H.p(iE);
                    kotlin.jvm.internal.i.c(objP, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC1089h0 interfaceC1089h0 = (InterfaceC1089h0) objP;
                    this.f12990J = interfaceC1089h0;
                    return interfaceC1089h0;
                }
                D0 d11 = this.f12988H;
                iE = d11.E(d11.f12800b, iE);
            }
        }
        if (this.f12986F.f13261c > 0) {
            while (i10 > 0) {
                z0 z0Var = this.f12986F;
                int[] iArr = z0Var.f13260b;
                if (iArr[i10 * 5] == 202 && kotlin.jvm.internal.i.a(z0Var.n(iArr, i10), c1077b0)) {
                    androidx.collection.B<InterfaceC1089h0> b10 = this.f13017u;
                    if (b10 == null || (interfaceC1089h0B = b10.b(i10)) == null) {
                        z0 z0Var2 = this.f12986F;
                        Object objB = z0Var2.b(z0Var2.f13260b, i10);
                        kotlin.jvm.internal.i.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC1089h0B = (InterfaceC1089h0) objB;
                    }
                    this.f12990J = interfaceC1089h0B;
                    return interfaceC1089h0B;
                }
                i10 = this.f12986F.o(i10);
            }
        }
        InterfaceC1089h0 interfaceC1089h1 = this.f13016t;
        this.f12990J = interfaceC1089h1;
        return interfaceC1089h1;
    }

    public final void R(androidx.collection.K k10, ComposableLambdaImpl composableLambdaImpl) {
        ArrayList arrayList = this.f13014r;
        if (this.f12985E) {
            C1090i.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f12981A = Long.hashCode(SnapshotKt.k().g());
            this.f13017u = null;
            w0(k10);
            this.j = 0;
            this.f12985E = true;
            try {
                u0();
                Object objC0 = c0();
                if (objC0 != composableLambdaImpl && composableLambdaImpl != null) {
                    z0(composableLambdaImpl);
                }
                C1088h c1088h = this.f12983C;
                androidx.compose.runtime.collection.c<InterfaceC1117y> cVarC = J0.c();
                try {
                    cVarC.b(c1088h);
                    C1077b0 c1077b0 = C1090i.f13038a;
                    if (composableLambdaImpl != null) {
                        s0(androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION, c1077b0);
                        Fa.d.d(this, composableLambdaImpl);
                        T(false);
                    } else if (!this.f13018v || objC0 == null || objC0.equals(InterfaceC1084f.a.f12980a)) {
                        o0();
                    } else {
                        s0(androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION, c1077b0);
                        kotlin.jvm.internal.o.d(2, objC0);
                        Fa.d.d(this, (Ia.p) objC0);
                        T(false);
                    }
                    cVarC.p(cVarC.f12945d - 1);
                    W();
                    this.f12985E = false;
                    arrayList.clear();
                    if (!this.f12988H.f12820w) {
                        C1090i.c("Check failed");
                    }
                    Y();
                    p293xa.r rVar = p293xa.r.f47939a;
                    Trace.endSection();
                } catch (Throwable th) {
                    cVarC.p(cVarC.f12945d - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f12985E = false;
                arrayList.clear();
                M();
                if (!this.f12988H.f12820w) {
                    C1090i.c("Check failed");
                }
                Y();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void S(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        S(this.f12986F.o(i10), i11);
        if (this.f12986F.j(i10)) {
            Object objL = this.f12986F.l(i10);
            C.b bVar = this.f12992L;
            bVar.d();
            bVar.f2227h.add(objL);
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x03ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v15 */
    public final void T(boolean z10) {
        int iHashCode;
        T4.o0 o0Var;
        int i10;
        ArrayList arrayList;
        C.b bVar;
        int i11;
        ?? r10;
        int i12;
        int i13;
        char c10;
        T4.o0 o0Var2;
        int i14;
        int i15;
        C1087g0 c1087g0;
        ArrayList arrayList2;
        C.b bVar2;
        ArrayList arrayList3;
        LinkedHashSet linkedHashSet;
        int i16;
        int i17;
        ArrayList arrayList4;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        long[] jArr3;
        Object[] objArr3;
        long[] jArr4;
        Object[] objArr4;
        int iHashCode2;
        T4.o0 o0Var3 = this.f13009m;
        int i18 = ((int[]) o0Var3.f5990b)[o0Var3.f5989a - 2] - 1;
        boolean z11 = this.f12995O;
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (z11) {
            D0 d10 = this.f12988H;
            int i19 = d10.f12819v;
            int i20 = d10.f12800b[d10.q(i19) * 5];
            Object objR = this.f12988H.r(i19);
            Object objP = this.f12988H.p(i19);
            if (objR != null) {
                iHashCode2 = Integer.hashCode(objR instanceof Enum ? ((Enum) objR).ordinal() : objR.hashCode()) ^ Integer.rotateRight(this.f12996P, 3);
            } else if (objP == null || i20 != 207 || objP.equals(c0153a)) {
                iHashCode2 = Integer.rotateRight(i18 ^ this.f12996P, 3) ^ Integer.hashCode(i20);
            } else {
                this.f12996P = Integer.rotateRight(Integer.rotateRight(i18 ^ this.f12996P, 3) ^ Integer.hashCode(objP.hashCode()), 3);
            }
            this.f12996P = Integer.rotateRight(iHashCode2, 3);
        } else {
            z0 z0Var = this.f12986F;
            int i21 = z0Var.f13267i;
            int[] iArr = z0Var.f13260b;
            int i22 = iArr[i21 * 5];
            Object objN = z0Var.n(iArr, i21);
            z0 z0Var2 = this.f12986F;
            Object objB = z0Var2.b(z0Var2.f13260b, i21);
            if (objN != null) {
                iHashCode = Integer.hashCode(objN instanceof Enum ? ((Enum) objN).ordinal() : objN.hashCode()) ^ Integer.rotateRight(this.f12996P, 3);
            } else if (objB == null || i22 != 207 || objB.equals(c0153a)) {
                iHashCode = Integer.rotateRight(i18 ^ this.f12996P, 3) ^ Integer.hashCode(i22);
            } else {
                this.f12996P = Integer.rotateRight(Integer.rotateRight(i18 ^ this.f12996P, 3) ^ Integer.hashCode(objB.hashCode()), 3);
            }
            this.f12996P = Integer.rotateRight(iHashCode, 3);
        }
        int i23 = this.f13007k;
        C1087g0 c1087g1 = this.f13006i;
        ArrayList arrayList5 = this.f13014r;
        C.b bVar3 = this.f12992L;
        if (c1087g1 != null) {
            ArrayList arrayList6 = c1087g1.f13031a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = c1087g1.f13034d;
                HashSet hashSet = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i24 = 0; i24 < size; i24++) {
                    hashSet.add(arrayList7.get(i24));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i26 < size3) {
                    K k10 = (K) arrayList6.get(i26);
                    boolean zContains = hashSet.contains(k10);
                    androidx.collection.B<F> b10 = c1087g1.f13035e;
                    hashSet = hashSet;
                    int i28 = c1087g1.f13032b;
                    if (zContains) {
                        i13 = size3;
                        c10 = 3;
                        if (!linkedHashSet2.contains(k10)) {
                            if (i25 < size2) {
                                K k11 = (K) arrayList7.get(i25);
                                if (k11 != k10) {
                                    F fB = b10.b(k11.f12861c);
                                    int i29 = fB != null ? fB.f12835b : -1;
                                    linkedHashSet2.add(k11);
                                    c1087g0 = c1087g1;
                                    i17 = i27;
                                    if (i29 != i17) {
                                        arrayList4 = arrayList7;
                                        F fB2 = b10.b(k11.f12861c);
                                        int i30 = fB2 != null ? fB2.f12836c : k11.f12862d;
                                        linkedHashSet = linkedHashSet2;
                                        int i31 = i29 + i28;
                                        int i32 = i28 + i17;
                                        if (i30 > 0) {
                                            i16 = size2;
                                            int i33 = bVar3.f2230l;
                                            if (i33 > 0) {
                                                arrayList2 = arrayList5;
                                                o0Var2 = o0Var3;
                                                if (bVar3.j == i31 - i33 && bVar3.f2229k == i32 - i33) {
                                                    bVar3.f2230l = i33 + i30;
                                                }
                                            } else {
                                                o0Var2 = o0Var3;
                                                arrayList2 = arrayList5;
                                            }
                                            bVar3.d();
                                            bVar3.j = i31;
                                            bVar3.f2229k = i32;
                                            bVar3.f2230l = i30;
                                        } else {
                                            o0Var2 = o0Var3;
                                            arrayList2 = arrayList5;
                                            i16 = size2;
                                            bVar3.getClass();
                                        }
                                        char c11 = 7;
                                        if (i29 <= i17) {
                                            i14 = i23;
                                            i15 = i25;
                                            bVar2 = bVar3;
                                            arrayList3 = arrayList6;
                                            if (i17 > i29) {
                                                Object[] objArr5 = b10.f9188c;
                                                long[] jArr5 = b10.f9186a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i34 = 0;
                                                    while (true) {
                                                        long j = jArr5[i34];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i35 = 8 - ((~(i34 - length)) >>> 31);
                                                            int i36 = 0;
                                                            while (i36 < i35) {
                                                                if ((j & 255) < 128) {
                                                                    F f10 = (F) objArr5[(i34 << 3) + i36];
                                                                    objArr2 = objArr5;
                                                                    int i37 = f10.f12835b;
                                                                    jArr2 = jArr5;
                                                                    if (i29 <= i37 && i37 < i29 + i30) {
                                                                        f10.f12835b = (i37 - i29) + i17;
                                                                    } else if (i29 + 1 <= i37 && i37 < i17) {
                                                                        f10.f12835b = i37 - i30;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                }
                                                                j >>= 8;
                                                                i36++;
                                                                objArr5 = objArr2;
                                                                jArr5 = jArr2;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            if (i35 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                        }
                                                        if (i34 == length) {
                                                            break;
                                                        }
                                                        i34++;
                                                        objArr5 = objArr;
                                                        jArr5 = jArr;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = b10.f9188c;
                                            long[] jArr6 = b10.f9186a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                bVar2 = bVar3;
                                                arrayList3 = arrayList6;
                                                int i38 = 0;
                                                while (true) {
                                                    long j10 = jArr6[i38];
                                                    i14 = i23;
                                                    i15 = i25;
                                                    if ((((~j10) << c11) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i39 = 8 - ((~(i38 - length2)) >>> 31);
                                                        int i40 = 0;
                                                        while (i40 < i39) {
                                                            if ((j10 & 255) < 128) {
                                                                F f11 = (F) objArr6[(i38 << 3) + i40];
                                                                jArr4 = jArr6;
                                                                int i41 = f11.f12835b;
                                                                objArr4 = objArr6;
                                                                if (i29 <= i41 && i41 < i29 + i30) {
                                                                    f11.f12835b = (i41 - i29) + i17;
                                                                } else if (i17 <= i41 && i41 < i29) {
                                                                    f11.f12835b = i41 + i30;
                                                                }
                                                            } else {
                                                                jArr4 = jArr6;
                                                                objArr4 = objArr6;
                                                            }
                                                            j10 >>= 8;
                                                            i40++;
                                                            jArr6 = jArr4;
                                                            objArr6 = objArr4;
                                                        }
                                                        jArr3 = jArr6;
                                                        objArr3 = objArr6;
                                                        if (i39 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr3 = jArr6;
                                                        objArr3 = objArr6;
                                                    }
                                                    if (i38 == length2) {
                                                        break;
                                                    }
                                                    i38++;
                                                    i23 = i14;
                                                    i25 = i15;
                                                    jArr6 = jArr3;
                                                    objArr6 = objArr3;
                                                    c11 = 7;
                                                }
                                            } else {
                                                i14 = i23;
                                                i15 = i25;
                                                bVar2 = bVar3;
                                                arrayList3 = arrayList6;
                                            }
                                        }
                                    } else {
                                        o0Var2 = o0Var3;
                                        i14 = i23;
                                        i15 = i25;
                                        arrayList2 = arrayList5;
                                        bVar2 = bVar3;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList7;
                                        linkedHashSet = linkedHashSet2;
                                        i16 = size2;
                                    }
                                } else {
                                    o0Var2 = o0Var3;
                                    i14 = i23;
                                    i15 = i25;
                                    c1087g0 = c1087g1;
                                    arrayList2 = arrayList5;
                                    bVar2 = bVar3;
                                    arrayList3 = arrayList6;
                                    linkedHashSet = linkedHashSet2;
                                    i16 = size2;
                                    i17 = i27;
                                    arrayList4 = arrayList7;
                                    i26++;
                                }
                                i25 = i15 + 1;
                                F fB3 = b10.b(k11.f12861c);
                                int i42 = (fB3 != null ? fB3.f12836c : k11.f12862d) + i17;
                                arrayList7 = arrayList4;
                                size3 = i13;
                                c1087g1 = c1087g0;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i16;
                                arrayList5 = arrayList2;
                                bVar3 = bVar2;
                                arrayList6 = arrayList3;
                                i23 = i14;
                                i27 = i42;
                                o0Var3 = o0Var2;
                            } else {
                                size3 = i13;
                                c1087g1 = c1087g1;
                            }
                        }
                    } else {
                        i13 = size3;
                        F fB4 = b10.b(k10.f12861c);
                        bVar3.g((fB4 != null ? fB4.f12835b : -1) + i28, k10.f12862d);
                        int i43 = k10.f12861c;
                        c1087g1.a(i43, 0);
                        bVar3.f2225f = (i43 - bVar3.f2220a.f12986F.f13265g) + bVar3.f2225f;
                        this.f12986F.p(i43);
                        h0();
                        this.f12986F.q();
                        c10 = 3;
                        C1090i.a(arrayList5, i43, this.f12986F.f13260b[(i43 * 5) + 3] + i43);
                    }
                    i26++;
                    size3 = i13;
                }
                o0Var = o0Var3;
                i10 = i23;
                arrayList = arrayList5;
                C.b bVar4 = bVar3;
                bVar4.d();
                if (arrayList6.size() > 0) {
                    z0 z0Var3 = this.f12986F;
                    bVar = bVar4;
                    bVar.f2225f = (z0Var3.f13266h - bVar.f2220a.f12986F.f13265g) + bVar.f2225f;
                    z0Var3.r();
                } else {
                    bVar = bVar4;
                }
            } else {
                o0Var = o0Var3;
                i10 = i23;
                arrayList = arrayList5;
                bVar = bVar3;
            }
        } else {
            o0Var = o0Var3;
            i10 = i23;
            arrayList = arrayList5;
            bVar = bVar3;
        }
        boolean z12 = this.f12995O;
        if (!z12) {
            z0 z0Var4 = this.f12986F;
            int i44 = z0Var4.f13270m - z0Var4.f13269l;
            if (i44 > 0) {
                if (i44 > 0) {
                    bVar.e(false);
                    bVar.f();
                    C.a aVar = bVar.f2221b;
                    aVar.getClass();
                    C.d.C c12 = C.d.C.f2237c;
                    C.f fVar = aVar.f2219c;
                    fVar.m0(c12);
                    fVar.f2272e[fVar.f2273f - fVar.f2270c[fVar.f2271d - 1].f2233a] = i44;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i45 = this.j;
        while (true) {
            z0 z0Var5 = this.f12986F;
            if (z0Var5.f13268k > 0 || (i12 = z0Var5.f13265g) == z0Var5.f13266h) {
                break;
            }
            h0();
            bVar.g(i45, this.f12986F.q());
            ArrayList arrayList8 = arrayList;
            C1090i.a(arrayList8, i12, this.f12986F.f13265g);
            i10 = i10;
            arrayList = arrayList8;
        }
        if (z12) {
            if (z10) {
                C.c cVar = this.f12994N;
                C.f fVar2 = cVar.f2232d;
                if (!fVar2.l0()) {
                    C1090i.c("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                C.d[] dVarArr = fVar2.f2270c;
                int i46 = fVar2.f2271d - 1;
                fVar2.f2271d = i46;
                C.d dVar = dVarArr[i46];
                dVarArr[i46] = null;
                C.f fVar3 = cVar.f2231c;
                fVar3.m0(dVar);
                Object[] objArr7 = fVar2.f2274g;
                Object[] objArr8 = fVar3.f2274g;
                int i47 = fVar3.f2275h;
                int i48 = dVar.f2234b;
                int i49 = fVar2.f2275h;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = fVar2.f2274g;
                int i51 = fVar2.f2275h;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr2 = fVar2.f2272e;
                int[] iArr3 = fVar3.f2272e;
                int i52 = fVar3.f2273f;
                int i53 = dVar.f2233a;
                int i54 = fVar2.f2273f;
                Q3.d.m(i52 - i53, i54 - i53, i54, iArr2, iArr3);
                fVar2.f2275h -= i48;
                fVar2.f2273f -= i53;
                i11 = 1;
            } else {
                i11 = i10;
            }
            z0 z0Var6 = this.f12986F;
            if (z0Var6.f13268k <= 0) {
                C1091i0.a("Unbalanced begin/end empty");
            }
            z0Var6.f13268k--;
            D0 d11 = this.f12988H;
            int i55 = d11.f12819v;
            d11.i();
            if (this.f12986F.f13268k <= 0) {
                int i56 = (-2) - i55;
                this.f12988H.j();
                this.f12988H.e(true);
                C1074a c1074a = this.f12993M;
                if (this.f12994N.f2231c.k0()) {
                    A0 a10 = this.f12987G;
                    bVar.c();
                    bVar.e(false);
                    bVar.f();
                    bVar.d();
                    C.a aVar2 = bVar.f2221b;
                    aVar2.getClass();
                    C.d.p pVar = C.d.p.f2259c;
                    C.f fVar4 = aVar2.f2219c;
                    fVar4.m0(pVar);
                    C.f.b.b(fVar4, 0, c1074a, 1, a10);
                    r10 = 0;
                } else {
                    A0 a11 = this.f12987G;
                    C.c cVar2 = this.f12994N;
                    bVar.c();
                    bVar.e(false);
                    bVar.f();
                    bVar.d();
                    C.a aVar3 = bVar.f2221b;
                    aVar3.getClass();
                    C.d.q qVar = C.d.q.f2260c;
                    C.f fVar5 = aVar3.f2219c;
                    fVar5.m0(qVar);
                    C.f.b.c(fVar5, c1074a, a11, cVar2);
                    this.f12994N = new C.c();
                    r10 = 0;
                }
                this.f12995O = r10;
                if (this.f13000c.f12771c != 0) {
                    x0(i56, r10);
                    y0(i56, i11);
                }
            }
        } else {
            if (z10) {
                bVar.b();
            }
            int i57 = bVar.f2220a.f12986F.f13267i;
            T4.o0 o0Var4 = bVar.f2223d;
            if (o0Var4.d(-1) > i57) {
                C1090i.c("Missed recording an endGroup");
            }
            if (o0Var4.d(-1) == i57) {
                bVar.e(false);
                o0Var4.e();
                C.a aVar4 = bVar.f2221b;
                aVar4.getClass();
                aVar4.f2219c.m0(C.d.j.f2253c);
            }
            int i58 = this.f12986F.f13267i;
            int i59 = i10;
            if (i59 != A0(i58)) {
                y0(i58, i59);
            }
            i11 = z10 ? 1 : i59;
            this.f12986F.e();
            bVar.d();
        }
        ArrayList arrayList9 = this.f13005h;
        C1087g0 c1087g2 = (C1087g0) arrayList9.remove(arrayList9.size() - 1);
        if (c1087g2 != null && !z12) {
            c1087g2.f13033c++;
        }
        this.f13006i = c1087g2;
        this.j = o0Var.e() + i11;
        this.f13008l = o0Var.e();
        this.f13007k = o0Var.e() + i11;
    }

    public final void U() {
        T(false);
        C1105p0 c1105p0Z = Z();
        if (c1105p0Z != null) {
            int i10 = c1105p0Z.f13106a;
            if ((i10 & 1) != 0) {
                c1105p0Z.f13106a = i10 | 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[LOOP:0: B:15:0x0037->B:27:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b A[EDGE_INSN: B:28:0x007b->B:29:0x007c BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x007b A[SYNTHETIC] */
    public final C1105p0 V() {
        boolean z10;
        C1105p0 c1105p0;
        C1074a c1074aA;
        Ia.l<InterfaceC1092j, p293xa.r> lVar;
        ArrayList arrayList = this.f12984D;
        final C1105p0 c1105p1 = !arrayList.isEmpty() ? (C1105p0) arrayList.remove(arrayList.size() - 1) : null;
        if (c1105p1 != null) {
            int i10 = c1105p1.f13106a;
            c1105p1.f13106a = i10 & (-9);
            final int i11 = this.f12981A;
            final androidx.collection.H<Object> h8 = c1105p1.f13111f;
            if (h8 == null || (i10 & 16) != 0) {
                lVar = null;
                break;
            }
            Object[] objArr = h8.f9104b;
            int[] iArr = h8.f9105c;
            long[] jArr = h8.f9103a;
            int length = jArr.length - 2;
            if (length < 0) {
                lVar = null;
                break;
            }
            int i12 = 0;
            loop0: while (true) {
                long j = jArr[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j & 255) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr[i15];
                            if (iArr[i15] != i11) {
                                lVar = new Ia.l<InterfaceC1092j, p293xa.r>() { // from class: androidx.compose.runtime.RecomposeScopeImpl$end$1$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
                                    @Override // Ia.l
                                    public final p293xa.r invoke(InterfaceC1092j interfaceC1092j) {
                                        InterfaceC1092j interfaceC1092j2;
                                        InterfaceC1092j interfaceC1092j3;
                                        int i16;
                                        InterfaceC1092j interfaceC1092j4 = interfaceC1092j;
                                        C1105p0 c1105p2 = c1105p1;
                                        if (c1105p2.f13110e == i11 && kotlin.jvm.internal.i.a(h8, c1105p2.f13111f) && (interfaceC1092j4 instanceof C1100n)) {
                                            androidx.collection.H<Object> h10 = h8;
                                            int i17 = i11;
                                            C1105p0 c1105p3 = c1105p1;
                                            long[] jArr2 = h10.f9103a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i18 = 0;
                                                while (true) {
                                                    long j10 = jArr2[i18];
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i19 = 8;
                                                        int i20 = 8 - ((~(i18 - length2)) >>> 31);
                                                        int i21 = 0;
                                                        while (i21 < i20) {
                                                            if ((255 & j10) < 128) {
                                                                int i22 = (i18 << 3) + i21;
                                                                Object obj2 = h10.f9104b[i22];
                                                                boolean z11 = h10.f9105c[i22] != i17;
                                                                if (z11) {
                                                                    C1100n c1100n = (C1100n) interfaceC1092j4;
                                                                    androidx.compose.runtime.collection.e.b(c1100n.f13084h, obj2, c1105p3);
                                                                    if (obj2 instanceof InterfaceC1116x) {
                                                                        InterfaceC1116x interfaceC1116x = (InterfaceC1116x) obj2;
                                                                        interfaceC1092j3 = interfaceC1092j4;
                                                                        if (!c1100n.f13084h.b(interfaceC1116x)) {
                                                                            androidx.compose.runtime.collection.e.c(c1100n.f13086k, interfaceC1116x);
                                                                        }
                                                                        androidx.collection.K<InterfaceC1116x<?>, Object> k10 = c1105p3.f13112g;
                                                                        if (k10 != null) {
                                                                            k10.j((InterfaceC1116x<?>) obj2);
                                                                        }
                                                                    } else {
                                                                        interfaceC1092j3 = interfaceC1092j4;
                                                                    }
                                                                } else {
                                                                    interfaceC1092j3 = interfaceC1092j4;
                                                                }
                                                                if (z11) {
                                                                    h10.f(i22);
                                                                }
                                                                i16 = 8;
                                                            } else {
                                                                interfaceC1092j3 = interfaceC1092j4;
                                                                i16 = i19;
                                                            }
                                                            j10 >>= i16;
                                                            i21++;
                                                            i19 = i16;
                                                            interfaceC1092j4 = interfaceC1092j3;
                                                        }
                                                        interfaceC1092j2 = interfaceC1092j4;
                                                        if (i20 != i19) {
                                                            break;
                                                        }
                                                    } else {
                                                        interfaceC1092j2 = interfaceC1092j4;
                                                    }
                                                    if (i18 == length2) {
                                                        break;
                                                    }
                                                    i18++;
                                                    interfaceC1092j4 = interfaceC1092j2;
                                                }
                                            }
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i13 == 8) {
                        if (i12 == length) {
                            i12++;
                        }
                    }
                    lVar = null;
                    break;
                }
                if (i12 == length) {
                    lVar = null;
                    break;
                }
                i12++;
            }
            C.b bVar = this.f12992L;
            if (lVar != null) {
                C.a aVar = bVar.f2221b;
                aVar.getClass();
                C.d.C0673i c0673i = C.d.C0673i.f2252c;
                C.f fVar = aVar.f2219c;
                fVar.m0(c0673i);
                C.f.b.b(fVar, 0, lVar, 1, this.f13004g);
            }
            int i16 = c1105p1.f13106a;
            if ((i16 & 512) != 0) {
                c1105p1.f13106a = i16 & (-513);
                C.a aVar2 = bVar.f2221b;
                aVar2.getClass();
                C.d.l lVar2 = C.d.l.f2255c;
                C.f fVar2 = aVar2.f2219c;
                fVar2.m0(lVar2);
                C.f.b.a(fVar2, 0, c1105p1);
            }
        }
        if (c1105p1 != null) {
            int i17 = c1105p1.f13106a;
            if ((i17 & 16) == 0 && ((i17 & 1) != 0 || this.f13012p)) {
                if (c1105p1.f13108c == null) {
                    if (this.f12995O) {
                        D0 d10 = this.f12988H;
                        c1074aA = d10.b(d10.f12819v);
                    } else {
                        z0 z0Var = this.f12986F;
                        c1074aA = z0Var.a(z0Var.f13267i);
                    }
                    c1105p1.f13108c = c1074aA;
                }
                c1105p1.f13106a &= -5;
                c1105p0 = c1105p1;
                z10 = false;
            } else {
                z10 = false;
                c1105p0 = null;
            }
        } else {
            z10 = false;
            c1105p0 = null;
        }
        T(z10);
        return c1105p0;
    }

    public final void W() {
        T(false);
        this.f12999b.c();
        T(false);
        C.b bVar = this.f12992L;
        if (bVar.f2222c) {
            bVar.e(false);
            bVar.e(false);
            C.a aVar = bVar.f2221b;
            aVar.getClass();
            aVar.f2219c.m0(C.d.j.f2253c);
            bVar.f2222c = false;
        }
        bVar.c();
        if (bVar.f2223d.f5989a != 0) {
            C1090i.c("Missed recording an endGroup()");
        }
        if (!this.f13005h.isEmpty()) {
            C1090i.c("Start/end imbalance");
        }
        O();
        this.f12986F.c();
        this.f13018v = this.f13019w.e() != 0;
    }

    public final void X(boolean z10, C1087g0 c1087g0) {
        this.f13005h.add(this.f13006i);
        this.f13006i = c1087g0;
        int i10 = this.f13007k;
        T4.o0 o0Var = this.f13009m;
        o0Var.f(i10);
        o0Var.f(this.f13008l);
        o0Var.f(this.j);
        if (z10) {
            this.j = 0;
        }
        this.f13007k = 0;
        this.f13008l = 0;
    }

    public final void Y() {
        A0 a10 = new A0();
        if (this.f12982B) {
            a10.k();
        }
        if (this.f12999b.d()) {
            a10.f12779l = new androidx.collection.B<>();
        }
        this.f12987G = a10;
        D0 d0V = a10.v();
        d0V.e(true);
        this.f12988H = d0V;
    }

    public final C1105p0 Z() {
        if (this.f13022z == 0) {
            ArrayList arrayList = this.f12984D;
            if (!arrayList.isEmpty()) {
                return (C1105p0) Z3.n.f(1, arrayList);
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void a() {
        this.f13012p = true;
        this.f12982B = true;
        this.f13000c.k();
        this.f12987G.k();
        D0 d10 = this.f12988H;
        A0 a10 = d10.f12799a;
        d10.f12803e = a10.f12778k;
        d10.f12804f = a10.f12779l;
    }

    public final boolean a0() {
        C1105p0 c1105p0Z;
        return (s() && !this.f13018v && ((c1105p0Z = Z()) == null || (c1105p0Z.f13106a & 4) == 0)) ? false : true;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final C1105p0 b() {
        return Z();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0129 A[Catch: all -> 0x015c, TryCatch #12 {all -> 0x015c, blocks: (B:85:0x01d8, B:46:0x00ee, B:52:0x010c, B:53:0x010e, B:55:0x0120, B:57:0x0129, B:59:0x0134, B:61:0x0145, B:63:0x014b, B:67:0x0160, B:84:0x01d5, B:110:0x0218, B:111:0x021b, B:113:0x021d, B:114:0x0220, B:47:0x00fa, B:117:0x0226, B:68:0x0167, B:83:0x01cf, B:107:0x0210, B:108:0x0216, B:54:0x0117), top: B:146:0x01d8, inners: #7, #11 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0134 A[Catch: all -> 0x015c, TryCatch #12 {all -> 0x015c, blocks: (B:85:0x01d8, B:46:0x00ee, B:52:0x010c, B:53:0x010e, B:55:0x0120, B:57:0x0129, B:59:0x0134, B:61:0x0145, B:63:0x014b, B:67:0x0160, B:84:0x01d5, B:110:0x0218, B:111:0x021b, B:113:0x021d, B:114:0x0220, B:47:0x00fa, B:117:0x0226, B:68:0x0167, B:83:0x01cf, B:107:0x0210, B:108:0x0216, B:54:0x0117), top: B:146:0x01d8, inners: #7, #11 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b A[Catch: all -> 0x015c, TryCatch #12 {all -> 0x015c, blocks: (B:85:0x01d8, B:46:0x00ee, B:52:0x010c, B:53:0x010e, B:55:0x0120, B:57:0x0129, B:59:0x0134, B:61:0x0145, B:63:0x014b, B:67:0x0160, B:84:0x01d5, B:110:0x0218, B:111:0x021b, B:113:0x021d, B:114:0x0220, B:47:0x00fa, B:117:0x0226, B:68:0x0167, B:83:0x01cf, B:107:0x0210, B:108:0x0216, B:54:0x0117), top: B:146:0x01d8, inners: #7, #11 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c3 A[Catch: all -> 0x020c, TRY_LEAVE, TryCatch #3 {all -> 0x020c, blocks: (B:80:0x01b6, B:82:0x01c3, B:101:0x0209, B:102:0x020b), top: B:128:0x01b6 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    public final void b0(ArrayList arrayList) throws Throwable {
        C.a aVar;
        C1074a c1074a;
        ArrayList arrayList2;
        z0 z0VarQ;
        z0 z0VarQ2;
        z0 z0Var;
        int[] iArr;
        androidx.collection.B<InterfaceC1089h0> b10;
        androidx.collection.B<InterfaceC1089h0> b11;
        C.a aVar2;
        C.a aVar3;
        boolean z10;
        boolean z11;
        C.a aVar4;
        A0 a10 = this.f13000c;
        AbstractC1094k abstractC1094k = this.f12999b;
        C.a aVar5 = this.f13003f;
        C.b bVar = this.f12992L;
        C.a aVar6 = bVar.f2221b;
        try {
            bVar.f2221b = aVar5;
            aVar5.f2219c.m0(C.d.y.f2268c);
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                try {
                    Pair pair = (Pair) arrayList.get(i11);
                    final T t8 = (T) pair.a();
                    T t10 = (T) pair.b();
                    C1074a c1074a2 = t8.f12928e;
                    A0 a11 = t8.f12927d;
                    int iE = a11.e(c1074a2);
                    androidx.compose.runtime.internal.b bVar2 = new androidx.compose.runtime.internal.b(i10);
                    bVar.c();
                    C.a aVar7 = bVar.f2221b;
                    aVar7.getClass();
                    C.d.C0671g c0671g = C.d.C0671g.f2250c;
                    C.f fVar = aVar7.f2219c;
                    fVar.m0(c0671g);
                    int i12 = size;
                    C.f.b.b(fVar, 0, bVar2, 1, c1074a2);
                    if (t10 == null) {
                        if (a11.equals(this.f12987G)) {
                            if (!this.f12988H.f12820w) {
                                C1090i.c("Check failed");
                            }
                            Y();
                        }
                        final z0 z0VarQ3 = a11.q();
                        try {
                            z0VarQ3.p(iE);
                            bVar.f2225f = iE;
                            final C.a aVar8 = new C.a();
                            f0(null, null, null, EmptyList.f42983b, new Ia.a<p293xa.r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    C1086g c1086g = this.this$0;
                                    C.b bVar3 = c1086g.f12992L;
                                    C.a aVar9 = aVar8;
                                    z0 z0Var2 = z0VarQ3;
                                    T t11 = t8;
                                    C.a aVar10 = bVar3.f2221b;
                                    try {
                                        bVar3.f2221b = aVar9;
                                        z0 z0Var3 = c1086g.f12986F;
                                        int[] iArr2 = c1086g.f13010n;
                                        androidx.collection.B<InterfaceC1089h0> b12 = c1086g.f13017u;
                                        c1086g.f13010n = null;
                                        c1086g.f13017u = null;
                                        try {
                                            c1086g.f12986F = z0Var2;
                                            boolean z12 = bVar3.f2224e;
                                            try {
                                                bVar3.f2224e = false;
                                                C1086g.N(c1086g, t11.f12924a, t11.f12930g, t11.f12925b);
                                                bVar3.f2224e = z12;
                                                p293xa.r rVar = p293xa.r.f47939a;
                                                c1086g.f12986F = z0Var3;
                                                c1086g.f13010n = iArr2;
                                                c1086g.f13017u = b12;
                                                bVar3.f2221b = aVar10;
                                                return p293xa.r.f47939a;
                                            } catch (Throwable th) {
                                                bVar3.f2224e = z12;
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            c1086g.f12986F = z0Var3;
                                            c1086g.f13010n = iArr2;
                                            c1086g.f13017u = b12;
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        bVar3.f2221b = aVar10;
                                        throw th3;
                                    }
                                }
                            });
                            C.a aVar9 = bVar.f2221b;
                            aVar9.getClass();
                            if (aVar8.f2219c.l0()) {
                                C.d.C0668c c0668c = C.d.C0668c.f2246c;
                                C.f fVar2 = aVar9.f2219c;
                                fVar2.m0(c0668c);
                                C.f.b.b(fVar2, 0, aVar8, 1, bVar2);
                            }
                            p293xa.r rVar = p293xa.r.f47939a;
                            z0VarQ3.c();
                            aVar6 = aVar6;
                            i11 = i11;
                        } catch (Throwable th) {
                            z0VarQ3.c();
                            throw th;
                        }
                    } else {
                        S sL = abstractC1094k.l(t10);
                        A0 a12 = sL != null ? sL.f12921a : t10.f12927d;
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (sL != null) {
                                                                    A0 a13 = sL.f12921a;
                                                                    if (a13.f12776h) {
                                                                        C1090i.c("use active SlotWriter to create an anchor location instead");
                                                                    }
                                                                    if (a13.f12771c <= 0) {
                                                                        C1091i0.a("Parameter index is out of range");
                                                                    }
                                                                    ArrayList<C1074a> arrayList3 = a13.j;
                                                                    int iE2 = C0.e(arrayList3, 0, a13.f12771c);
                                                                    if (iE2 < 0) {
                                                                        c1074a = new C1074a(0);
                                                                        arrayList3.add(-(iE2 + 1), c1074a);
                                                                    } else {
                                                                        c1074a = arrayList3.get(iE2);
                                                                    }
                                                                    if (c1074a != null) {
                                                                        arrayList2 = new ArrayList();
                                                                        z0VarQ = a12.q();
                                                                        C1090i.b(z0VarQ, arrayList2, a12.e(c1074a));
                                                                        p293xa.r rVar2 = p293xa.r.f47939a;
                                                                        z0VarQ.c();
                                                                        if (arrayList2.isEmpty()) {
                                                                            i11 = i11;
                                                                        } else {
                                                                            aVar4 = bVar.f2221b;
                                                                            aVar4.getClass();
                                                                            if (!arrayList2.isEmpty()) {
                                                                                C.d.C0020d c0020d = C.d.C0020d.f2247c;
                                                                                C.f fVar3 = aVar4.f2219c;
                                                                                fVar3.m0(c0020d);
                                                                                C.f.b.b(fVar3, 1, arrayList2, 0, bVar2);
                                                                            }
                                                                            if (a11.equals(a10)) {
                                                                                int iE3 = a10.e(c1074a2);
                                                                                x0(iE3, A0(iE3) + arrayList2.size());
                                                                            }
                                                                        }
                                                                        bVar.a(sL, abstractC1094k, t10, t8);
                                                                        z0VarQ2 = a12.q();
                                                                        z0Var = this.f12986F;
                                                                        iArr = this.f13010n;
                                                                        b10 = this.f13017u;
                                                                        this.f13010n = null;
                                                                        this.f13017u = null;
                                                                        this.f12986F = z0VarQ2;
                                                                        int iE4 = a12.e(c1074a);
                                                                        z0VarQ2.p(iE4);
                                                                        bVar.f2225f = iE4;
                                                                        aVar2 = new C.a();
                                                                        aVar3 = bVar.f2221b;
                                                                        bVar.f2221b = aVar2;
                                                                        z10 = bVar.f2224e;
                                                                        bVar.f2224e = false;
                                                                        z11 = z10;
                                                                        b11 = b10;
                                                                        f0(t10.f12926c, t8.f12926c, Integer.valueOf(z0VarQ2.f13265g), t10.f12929f, new Ia.a<p293xa.r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            @Override // Ia.a
                                                                            public final p293xa.r invoke() {
                                                                                C1086g c1086g = this.this$0;
                                                                                T t11 = t8;
                                                                                C1086g.N(c1086g, t11.f12924a, t11.f12930g, t11.f12925b);
                                                                                return p293xa.r.f47939a;
                                                                            }
                                                                        });
                                                                        bVar.f2224e = z11;
                                                                        bVar.f2221b = aVar3;
                                                                        aVar3.getClass();
                                                                        if (aVar2.f2219c.l0()) {
                                                                            C.d.C0668c c0668c2 = C.d.C0668c.f2246c;
                                                                            C.f fVar4 = aVar3.f2219c;
                                                                            fVar4.m0(c0668c2);
                                                                            C.f.b.b(fVar4, 0, aVar2, 1, bVar2);
                                                                        }
                                                                        this.f12986F = z0Var;
                                                                        this.f13010n = iArr;
                                                                        this.f13017u = b11;
                                                                        z0VarQ2.c();
                                                                    }
                                                                    th = th;
                                                                    aVar = aVar6;
                                                                    bVar.f2221b = aVar;
                                                                    throw th;
                                                                }
                                                                aVar6 = aVar6;
                                                                bVar.f2221b = aVar3;
                                                                aVar3.getClass();
                                                                if (aVar2.f2219c.l0()) {
                                                                    C.d.C0668c c0668c3 = C.d.C0668c.f2246c;
                                                                    C.f fVar5 = aVar3.f2219c;
                                                                    fVar5.m0(c0668c3);
                                                                    C.f.b.b(fVar5, 0, aVar2, 1, bVar2);
                                                                }
                                                                this.f12986F = z0Var;
                                                                this.f13010n = iArr;
                                                                this.f13017u = b11;
                                                                z0VarQ2.c();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                this.f12986F = z0Var;
                                                                this.f13010n = iArr;
                                                                this.f13017u = b11;
                                                                throw th;
                                                            }
                                                            bVar.f2224e = z11;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            bVar.f2221b = aVar3;
                                                            throw th;
                                                        }
                                                        f0(t10.f12926c, t8.f12926c, Integer.valueOf(z0VarQ2.f13265g), t10.f12929f, new Ia.a<p293xa.r>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }

                                                            @Override // Ia.a
                                                            public final p293xa.r invoke() {
                                                                C1086g c1086g = this.this$0;
                                                                T t11 = t8;
                                                                C1086g.N(c1086g, t11.f12924a, t11.f12930g, t11.f12925b);
                                                                return p293xa.r.f47939a;
                                                            }
                                                        });
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        bVar.f2224e = z11;
                                                        throw th;
                                                    }
                                                    z11 = z10;
                                                    b11 = b10;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    z11 = z10;
                                                    b11 = b10;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                b11 = b10;
                                                z11 = z10;
                                            }
                                            bVar.f2224e = false;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z11 = z10;
                                            b11 = b10;
                                        }
                                        bVar.f2221b = aVar2;
                                        z10 = bVar.f2224e;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        b11 = b10;
                                    }
                                    this.f12986F = z0VarQ2;
                                    int iE5 = a12.e(c1074a);
                                    z0VarQ2.p(iE5);
                                    bVar.f2225f = iE5;
                                    aVar2 = new C.a();
                                    aVar3 = bVar.f2221b;
                                } catch (Throwable th9) {
                                    th = th9;
                                    b11 = b10;
                                }
                                z0Var = this.f12986F;
                                iArr = this.f13010n;
                                b10 = this.f13017u;
                                this.f13010n = null;
                                this.f13017u = null;
                            } catch (Throwable th10) {
                                z0VarQ2.c();
                                throw th10;
                            }
                            C1090i.b(z0VarQ, arrayList2, a12.e(c1074a));
                            p293xa.r rVar3 = p293xa.r.f47939a;
                            z0VarQ.c();
                            if (arrayList2.isEmpty()) {
                                aVar4 = bVar.f2221b;
                                aVar4.getClass();
                                if (!arrayList2.isEmpty()) {
                                    C.d.C0020d c0020d2 = C.d.C0020d.f2247c;
                                    C.f fVar6 = aVar4.f2219c;
                                    fVar6.m0(c0020d2);
                                    C.f.b.b(fVar6, 1, arrayList2, 0, bVar2);
                                }
                                if (a11.equals(a10)) {
                                    int iE6 = a10.e(c1074a2);
                                    x0(iE6, A0(iE6) + arrayList2.size());
                                }
                            } else {
                                i11 = i11;
                            }
                            bVar.a(sL, abstractC1094k, t10, t8);
                            z0VarQ2 = a12.q();
                        } catch (Throwable th11) {
                            z0VarQ.c();
                            throw th11;
                        }
                        c1074a = t10.f12928e;
                        arrayList2 = new ArrayList();
                        z0VarQ = a12.q();
                    }
                    try {
                        C.a aVar10 = bVar.f2221b;
                        aVar10.getClass();
                        aVar10.f2219c.m0(C.d.A.f2235c);
                        i11++;
                        size = i12;
                        aVar6 = aVar6;
                        abstractC1094k = abstractC1094k;
                        a10 = a10;
                        i10 = 0;
                    } catch (Throwable th12) {
                        th = th12;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    aVar6 = aVar6;
                }
            }
            C.a aVar11 = aVar6;
            C.a aVar12 = bVar.f2221b;
            aVar12.getClass();
            aVar12.f2219c.m0(C.d.k.f2254c);
            bVar.f2225f = 0;
            bVar.f2221b = aVar11;
        } catch (Throwable th14) {
            th = th14;
            aVar = aVar6;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean c(boolean z10) {
        Object objC0 = c0();
        if ((objC0 instanceof Boolean) && z10 == ((Boolean) objC0).booleanValue()) {
            return false;
        }
        z0(Boolean.valueOf(z10));
        return true;
    }

    public final Object c0() {
        boolean z10 = this.f12995O;
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (!z10) {
            Object objK = this.f12986F.k();
            return (!this.f13020x || (objK instanceof w0)) ? objK : c0153a;
        }
        if (!this.f13013q) {
            return c0153a;
        }
        C1090i.c("A call to createNode(), emitNode() or useNode() expected");
        return c0153a;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void d() {
        if (this.f13020x && this.f12986F.f13267i == this.f13021y) {
            this.f13021y = -1;
            this.f13020x = false;
        }
        T(false);
    }

    public final int d0(int i10) {
        int iO = this.f12986F.o(i10) + 1;
        int i11 = 0;
        while (iO < i10) {
            if (!this.f12986F.i(iO)) {
                i11++;
            }
            iO += C0.a(this.f12986F.f13260b, iO);
        }
        return i11;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void e(int i10) {
        q0(i10, 0, null, null);
    }

    public final boolean e0(androidx.collection.K k10) {
        C.f fVar = this.f13002e.f2219c;
        if (!fVar.k0()) {
            C1090i.c("Expected applyChanges() to have been called");
        }
        if (k10.f9131e <= 0 && this.f13014r.isEmpty()) {
            return false;
        }
        R(k10, null);
        return fVar.l0();
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final Object f() {
        boolean z10 = this.f12995O;
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (z10) {
            if (!this.f13013q) {
                return c0153a;
            }
            C1090i.c("A call to createNode(), emitNode() or useNode() expected");
            return c0153a;
        }
        Object objK = this.f12986F.k();
        if (!this.f13020x || (objK instanceof w0)) {
            return objK instanceof u0 ? ((u0) objK).f13247a : objK;
        }
        return c0153a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0025, B:11:0x002f, B:10:0x002b, B:14:0x0036, B:16:0x003c, B:18:0x0042), top: B:23:0x0005 }] */
    public final <R> R f0(InterfaceC1115w interfaceC1115w, InterfaceC1115w interfaceC1115w2, Integer num, List<? extends Pair<C1105p0, ? extends Object>> list, Ia.a<? extends R> aVar) {
        R rInvoke;
        boolean z10 = this.f12985E;
        int i10 = this.j;
        try {
            this.f12985E = true;
            this.j = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair<C1105p0, ? extends Object> pair = list.get(i11);
                C1105p0 c1105p0A = pair.a();
                Object objB = pair.b();
                if (objB != null) {
                    v0(c1105p0A, objB);
                } else {
                    v0(c1105p0A, null);
                }
            }
            if (interfaceC1115w == null) {
                rInvoke = aVar.invoke();
            } else {
                rInvoke = (R) interfaceC1115w.q(interfaceC1115w2, num != null ? num.intValue() : -1, aVar);
                if (rInvoke == null) {
                    rInvoke = aVar.invoke();
                }
            }
            return rInvoke;
        } finally {
            this.f12985E = z10;
            this.j = i10;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean g(float f10) {
        Object objC0 = c0();
        if ((objC0 instanceof Float) && f10 == ((Number) objC0).floatValue()) {
            return false;
        }
        z0(Float.valueOf(f10));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0230  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:72:0x0165
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void g0() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1086g.g0():void");
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean h(int i10) {
        Object objC0 = c0();
        if ((objC0 instanceof Integer) && i10 == ((Number) objC0).intValue()) {
            return false;
        }
        z0(Integer.valueOf(i10));
        return true;
    }

    public final void h0() {
        k0(this.f12986F.f13265g);
        C.b bVar = this.f12992L;
        bVar.e(false);
        bVar.f();
        C.a aVar = bVar.f2221b;
        aVar.getClass();
        aVar.f2219c.m0(C.d.w.f2266c);
        int i10 = bVar.f2225f;
        z0 z0Var = bVar.f2220a.f12986F;
        bVar.f2225f = z0Var.f13260b[(z0Var.f13265g * 5) + 3] + i10;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean i(long j) {
        Object objC0 = c0();
        if ((objC0 instanceof Long) && j == ((Number) objC0).longValue()) {
            return false;
        }
        z0(Long.valueOf(j));
        return true;
    }

    public final void i0(InterfaceC1089h0 interfaceC1089h0) {
        androidx.collection.B<InterfaceC1089h0> b10 = this.f13017u;
        if (b10 == null) {
            b10 = new androidx.collection.B<>();
            this.f13017u = b10;
        }
        b10.h(this.f12986F.f13265g, interfaceC1089h0);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final H.a j() {
        C1098m c1098m = this.f12997Q;
        if (c1098m != null) {
            return c1098m;
        }
        C1098m c1098m2 = new C1098m(this.f13004g);
        this.f12997Q = c1098m2;
        return c1098m2;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004  */
    public final void j0(int i10, int i11, int i12) {
        z0 z0Var = this.f12986F;
        if (i10 == i11) {
            i12 = i10;
        } else if (i10 != i12 && i11 != i12) {
            if (z0Var.o(i10) == i11) {
                i12 = i11;
            } else if (z0Var.o(i11) == i10) {
                i12 = i10;
            } else if (z0Var.o(i10) == z0Var.o(i11)) {
                i12 = z0Var.o(i10);
            } else {
                int iO = i10;
                int i13 = 0;
                while (iO > 0 && iO != i12) {
                    iO = z0Var.o(iO);
                    i13++;
                }
                int iO2 = i11;
                int i14 = 0;
                while (iO2 > 0 && iO2 != i12) {
                    iO2 = z0Var.o(iO2);
                    i14++;
                }
                int i15 = i13 - i14;
                int iO3 = i10;
                for (int i16 = 0; i16 < i15; i16++) {
                    iO3 = z0Var.o(iO3);
                }
                int i17 = i14 - i13;
                int iO4 = i11;
                for (int i18 = 0; i18 < i17; i18++) {
                    iO4 = z0Var.o(iO4);
                }
                i12 = iO3;
                for (int iO5 = iO4; i12 != iO5; iO5 = z0Var.o(iO5)) {
                    i12 = z0Var.o(i12);
                }
            }
        }
        while (i10 > 0 && i10 != i12) {
            if (z0Var.j(i10)) {
                this.f12992L.b();
            }
            i10 = z0Var.o(i10);
        }
        S(i11, i12);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean k(Object obj) {
        if (c0() == obj) {
            return false;
        }
        z0(obj);
        return true;
    }

    public final void k0(int i10) {
        boolean zJ = this.f12986F.j(i10);
        C.b bVar = this.f12992L;
        if (zJ) {
            bVar.d();
            Object objL = this.f12986F.l(i10);
            bVar.d();
            bVar.f2227h.add(objL);
        }
        n0(this, i10, i10, zJ, 0);
        bVar.d();
        if (zJ) {
            bVar.b();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void l(Ia.a<p293xa.r> aVar) {
        C.a aVar2 = this.f12992L.f2221b;
        aVar2.getClass();
        C.d.z zVar = C.d.z.f2269c;
        C.f fVar = aVar2.f2219c;
        fVar.m0(zVar);
        C.f.b.a(fVar, 0, aVar);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean m() {
        return this.f12995O;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void n(Object obj) {
        if (!this.f12995O && this.f12986F.g() == 207 && !kotlin.jvm.internal.i.a(this.f12986F.f(), obj) && this.f13021y < 0) {
            this.f13021y = this.f12986F.f13265g;
            this.f13020x = true;
        }
        q0(207, 0, null, obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void o(boolean z10) {
        if (this.f13007k != 0) {
            C1090i.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.f12995O) {
            return;
        }
        if (!z10) {
            p0();
            return;
        }
        z0 z0Var = this.f12986F;
        int i10 = z0Var.f13265g;
        int i11 = z0Var.f13266h;
        C.b bVar = this.f12992L;
        bVar.getClass();
        bVar.e(false);
        C.a aVar = bVar.f2221b;
        aVar.getClass();
        aVar.f2219c.m0(C.d.C0670f.f2249c);
        C1090i.a(this.f13014r, i10, i11);
        this.f12986F.r();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    public final void o0() throws Throwable {
        int iRotateLeft;
        int iHashCode;
        int iHashCode2;
        if (this.f13014r.isEmpty()) {
            this.f13007k = this.f12986F.q() + this.f13007k;
            return;
        }
        z0 z0Var = this.f12986F;
        int iG = z0Var.g();
        int i10 = z0Var.f13265g;
        int i11 = z0Var.f13266h;
        int[] iArr = z0Var.f13260b;
        Object objN = i10 < i11 ? z0Var.n(iArr, i10) : null;
        Object objF = z0Var.f();
        int i12 = this.f13008l;
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objN == null) {
            if (objF == null || iG != 207 || objF.equals(c0153a)) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f12996P, 3) ^ iG, 3) ^ i12;
            } else {
                this.f12996P = Integer.rotateLeft(objF.hashCode() ^ Integer.rotateLeft(this.f12996P, 3), 3) ^ i12;
            }
            t0(null, (iArr[(z0Var.f13265g * 5) + 1] & 1073741824) != 0);
            g0();
            z0Var.e();
            if (objN != null) {
                if (objN instanceof Enum) {
                    iHashCode = ((Enum) objN).ordinal();
                } else {
                    iHashCode = objN.hashCode();
                }
                iHashCode2 = Integer.hashCode(iHashCode) ^ Integer.rotateRight(this.f12996P, 3);
            } else {
                if (objF == null && iG == 207 && !objF.equals(c0153a)) {
                    this.f12996P = Integer.rotateRight(Integer.hashCode(objF.hashCode()) ^ Integer.rotateRight(this.f12996P ^ i12, 3), 3);
                    return;
                }
                iHashCode2 = Integer.rotateRight(this.f12996P ^ i12, 3) ^ Integer.hashCode(iG);
            }
            this.f12996P = Integer.rotateRight(iHashCode2, 3);
        }
        iRotateLeft = Integer.rotateLeft((objN instanceof Enum ? ((Enum) objN).ordinal() : objN.hashCode()) ^ Integer.rotateLeft(this.f12996P, 3), 3);
        this.f12996P = iRotateLeft;
        t0(null, (iArr[(z0Var.f13265g * 5) + 1] & 1073741824) != 0);
        g0();
        z0Var.e();
        if (objN != null) {
            if (objF == null) {
            }
            iHashCode2 = Integer.rotateRight(this.f12996P ^ i12, 3) ^ Integer.hashCode(iG);
        } else {
            if (objN instanceof Enum) {
                iHashCode = ((Enum) objN).ordinal();
            } else {
                iHashCode = objN.hashCode();
            }
            iHashCode2 = Integer.hashCode(iHashCode) ^ Integer.rotateRight(this.f12996P, 3);
        }
        this.f12996P = Integer.rotateRight(iHashCode2, 3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    @Override // androidx.compose.runtime.InterfaceC1084f
    public final C1086g p(int i10) {
        C1105p0 c1105p0;
        L(i10);
        boolean z10 = this.f12995O;
        C1100n c1100n = this.f13004g;
        ArrayList arrayList = this.f12984D;
        if (z10) {
            C1105p0 c1105p1 = new C1105p0(c1100n);
            arrayList.add(c1105p1);
            z0(c1105p1);
            c1105p1.f13110e = this.f12981A;
            c1105p1.f13106a &= -17;
        } else {
            ArrayList arrayList2 = this.f13014r;
            int iG = C1090i.g(this.f12986F.f13267i, arrayList2);
            I i11 = iG >= 0 ? (I) arrayList2.remove(iG) : null;
            Object objK = this.f12986F.k();
            if (kotlin.jvm.internal.i.a(objK, InterfaceC1084f.a.f12980a)) {
                c1105p0 = new C1105p0(c1100n);
                z0(c1105p0);
            } else {
                kotlin.jvm.internal.i.c(objK, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c1105p0 = (C1105p0) objK;
            }
            if (i11 == null) {
                int i12 = c1105p0.f13106a;
                boolean z11 = (i12 & 64) != 0;
                if (z11) {
                    c1105p0.f13106a = i12 & (-65);
                }
                if (z11) {
                    c1105p0.f13106a |= 8;
                } else {
                    c1105p0.f13106a &= -9;
                }
            } else {
                c1105p0.f13106a |= 8;
            }
            arrayList.add(c1105p0);
            c1105p0.f13110e = this.f12981A;
            int i13 = c1105p0.f13106a;
            c1105p0.f13106a = i13 & (-17);
            if ((i13 & 256) != 0) {
                c1105p0.f13106a = (i13 & (-273)) | 512;
                C.a aVar = this.f12992L.f2221b;
                aVar.getClass();
                C.d.B b10 = C.d.B.f2236c;
                C.f fVar = aVar.f2219c;
                fVar.m0(b10);
                C.f.b.a(fVar, 0, c1105p0);
            }
        }
        return this;
    }

    public final void p0() {
        int i10;
        z0 z0Var = this.f12986F;
        int i11 = z0Var.f13267i;
        if (i11 >= 0) {
            i10 = z0Var.f13260b[(i11 * 5) + 1] & 67108863;
        } else {
            i10 = 0;
        }
        this.f13007k = i10;
        z0Var.r();
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void q(int i10, Object obj) {
        q0(i10, 0, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:163:0x030b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0327  */
    /* JADX WARN: Code duplicated, block: B:167:0x032c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x032e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0330  */
    /* JADX WARN: Code duplicated, block: B:171:0x0336  */
    /* JADX WARN: Code duplicated, block: B:173:0x0339  */
    /* JADX WARN: Code duplicated, block: B:177:0x0369  */
    /* JADX WARN: Code duplicated, block: B:178:0x036b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x014e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0162  */
    /* JADX WARN: Code duplicated, block: B:82:0x0164  */
    /* JADX WARN: Code duplicated, block: B:84:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x0175  */
    /* JADX WARN: Code duplicated, block: B:89:0x017d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0185  */
    public final void q0(int i10, int i11, Object obj, Object obj2) {
        int iRotateLeft;
        boolean z10;
        boolean z11;
        C1087g0 c1087g0;
        C1087g0 c1087g1;
        Object objValueOf;
        androidx.collection.K<Object, Object> k10;
        Object objD;
        Object objK;
        androidx.collection.I i12;
        ArrayList arrayList;
        androidx.collection.B<F> b10;
        int i13;
        D0 d10;
        int i14;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        int i15;
        Object[] objArr4;
        int i16;
        z0 z0Var;
        ArrayList arrayList2;
        int i17;
        int i18;
        int i19;
        D0 d11;
        int i20;
        C1087g0 c1087g2;
        Object obj3 = obj;
        if (this.f13013q) {
            C1090i.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i21 = this.f13008l;
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (obj3 == null) {
            if (obj2 == null || i10 != 207 || obj2.equals(c0153a)) {
                iRotateLeft = i21 ^ Integer.rotateLeft(Integer.rotateLeft(this.f12996P, 3) ^ i10, 3);
            } else {
                this.f12996P = i21 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(this.f12996P, 3), 3);
            }
            if (obj3 == null) {
                this.f13008l++;
            }
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f12995O) {
                this.f12986F.f13268k++;
                d11 = this.f12988H;
                i20 = d11.f12817t;
                if (z10) {
                    d11.R(i10, c0153a, c0153a, true);
                } else if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = c0153a;
                    }
                    d11.R(i10, obj3, obj2, false);
                } else {
                    if (obj3 == null) {
                        obj3 = c0153a;
                    }
                    d11.R(i10, obj3, c0153a, false);
                }
                c1087g2 = this.f13006i;
                if (c1087g2 != null) {
                    int i22 = (-2) - i20;
                    K k11 = new K(-1, i10, i22, -1);
                    c1087g2.f13035e.h(i22, new F(-1, this.j - c1087g2.f13032b, 0));
                    c1087g2.f13034d.add(k11);
                }
                X(z10, null);
                return;
            }
            if (i11 != 1 && this.f13020x) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f13006i == null) {
                int iG = this.f12986F.g();
                if (z11 && iG == i10) {
                    z0 z0Var2 = this.f12986F;
                    int i23 = z0Var2.f13265g;
                    if (kotlin.jvm.internal.i.a(obj3, i23 < z0Var2.f13266h ? z0Var2.n(z0Var2.f13260b, i23) : null)) {
                        t0(obj2, z10);
                    } else {
                        z0Var = this.f12986F;
                        z0Var.getClass();
                        arrayList2 = new ArrayList();
                        if (z0Var.f13268k <= 0) {
                            i17 = z0Var.f13265g;
                            while (i17 < z0Var.f13266h) {
                                int i24 = i17 * 5;
                                int[] iArr = z0Var.f13260b;
                                int i25 = iArr[i24];
                                Object objN = z0Var.n(iArr, i17);
                                i18 = iArr[i24 + 1];
                                if ((i18 & 1073741824) != 0) {
                                    i19 = 1;
                                } else {
                                    i19 = i18 & 67108863;
                                }
                                arrayList2.add(new K(objN, i25, i17, i19));
                                i17 += iArr[i24 + 3];
                            }
                        }
                        this.f13006i = new C1087g0(this.j, arrayList2);
                    }
                } else {
                    z0Var = this.f12986F;
                    z0Var.getClass();
                    arrayList2 = new ArrayList();
                    if (z0Var.f13268k <= 0) {
                        i17 = z0Var.f13265g;
                        while (i17 < z0Var.f13266h) {
                            int i26 = i17 * 5;
                            int[] iArr2 = z0Var.f13260b;
                            int i27 = iArr2[i26];
                            Object objN2 = z0Var.n(iArr2, i17);
                            i18 = iArr2[i26 + 1];
                            if ((i18 & 1073741824) != 0) {
                                i19 = 1;
                            } else {
                                i19 = i18 & 67108863;
                            }
                            arrayList2.add(new K(objN2, i27, i17, i19));
                            i17 += iArr2[i26 + 3];
                        }
                    }
                    this.f13006i = new C1087g0(this.j, arrayList2);
                }
            }
            c1087g0 = this.f13006i;
            if (c1087g0 == null) {
                c1087g1 = null;
            } else {
                if (obj3 != null) {
                    objValueOf = new J(Integer.valueOf(i10), obj3);
                } else {
                    objValueOf = Integer.valueOf(i10);
                }
                k10 = ((androidx.compose.runtime.collection.b) c1087g0.f13036f.getValue()).f12942a;
                objD = k10.d(objValueOf);
                if (objD == null) {
                    objK = null;
                } else if (objD instanceof androidx.collection.I) {
                    i12 = (androidx.collection.I) objD;
                    objK = i12.k(0);
                    if (i12.d()) {
                        k10.j(objValueOf);
                    }
                    if (i12.f9109b == 1) {
                        k10.l(objValueOf, i12.a());
                    }
                } else {
                    k10.j(objValueOf);
                    objK = objD;
                }
                K k12 = (K) objK;
                arrayList = c1087g0.f13034d;
                b10 = c1087g0.f13035e;
                i13 = c1087g0.f13032b;
                if (!z11 || k12 == null) {
                    this.f12986F.f13268k++;
                    this.f12995O = true;
                    this.f12990J = null;
                    if (this.f12988H.f12820w) {
                        D0 d0V = this.f12987G.v();
                        this.f12988H = d0V;
                        d0V.L();
                        this.f12989I = false;
                        this.f12990J = null;
                    }
                    this.f12988H.d();
                    d10 = this.f12988H;
                    int i28 = d10.f12817t;
                    if (z10) {
                        d10.R(i10, c0153a, c0153a, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = c0153a;
                        }
                        d10.R(i10, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = c0153a;
                        }
                        d10.R(i10, obj3, c0153a, false);
                    }
                    this.f12993M = this.f12988H.b(i28);
                    int i29 = (-2) - i28;
                    K k13 = new K(-1, i10, i29, -1);
                    b10.h(i29, new F(-1, this.j - i13, 0));
                    arrayList.add(k13);
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i14 = 0;
                    } else {
                        i14 = this.j;
                    }
                    c1087g1 = new C1087g0(i14, arrayList3);
                } else {
                    arrayList.add(k12);
                    int i30 = k12.f12861c;
                    F fB = b10.b(i30);
                    this.j = (fB != null ? fB.f12835b : -1) + i13;
                    F fB2 = b10.b(i30);
                    int i31 = fB2 != null ? fB2.f12834a : -1;
                    int i32 = c1087g0.f13033c;
                    int i33 = i31 - i32;
                    char c10 = 7;
                    if (i31 <= i32) {
                        int i34 = i31;
                        if (i32 > i34) {
                            Object[] objArr5 = b10.f9188c;
                            long[] jArr3 = b10.f9186a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i35 = 0;
                                while (true) {
                                    long j = jArr3[i35];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i36 = 8 - ((~(i35 - length)) >>> 31);
                                        int i37 = 0;
                                        while (i37 < i36) {
                                            if ((j & 255) < 128) {
                                                F f10 = (F) objArr5[(i35 << 3) + i37];
                                                objArr2 = objArr5;
                                                int i38 = f10.f12834a;
                                                if (i38 == i34) {
                                                    f10.f12834a = i32;
                                                } else {
                                                    jArr2 = jArr3;
                                                    if (i34 + 1 <= i38 && i38 < i32) {
                                                        f10.f12834a = i38 - 1;
                                                    }
                                                }
                                                j >>= 8;
                                                i37++;
                                                objArr5 = objArr2;
                                                jArr3 = jArr2;
                                            } else {
                                                objArr2 = objArr5;
                                            }
                                            jArr2 = jArr3;
                                            j >>= 8;
                                            i37++;
                                            objArr5 = objArr2;
                                            jArr3 = jArr2;
                                        }
                                        objArr = objArr5;
                                        jArr = jArr3;
                                        if (i36 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr5;
                                        jArr = jArr3;
                                    }
                                    if (i35 == length) {
                                        break;
                                    }
                                    i35++;
                                    objArr5 = objArr;
                                    jArr3 = jArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr6 = b10.f9188c;
                        long[] jArr4 = b10.f9186a;
                        int length2 = jArr4.length - 2;
                        if (length2 >= 0) {
                            int i39 = i31;
                            int i40 = 0;
                            while (true) {
                                long j10 = jArr4[i40];
                                if ((((~j10) << c10) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i41 = 8 - ((~(i40 - length2)) >>> 31);
                                    int i42 = 0;
                                    while (i42 < i41) {
                                        if ((j10 & 255) < 128) {
                                            F f11 = (F) objArr6[(i40 << 3) + i42];
                                            int i43 = f11.f12834a;
                                            objArr4 = objArr6;
                                            i16 = i39;
                                            if (i43 == i16) {
                                                f11.f12834a = i32;
                                            } else if (i32 <= i43 && i43 < i16) {
                                                f11.f12834a = i43 + 1;
                                            }
                                        } else {
                                            objArr4 = objArr6;
                                            i16 = i39;
                                        }
                                        j10 >>= 8;
                                        i42++;
                                        i39 = i16;
                                        objArr6 = objArr4;
                                    }
                                    objArr3 = objArr6;
                                    i15 = i39;
                                    if (i41 != 8) {
                                        break;
                                    }
                                } else {
                                    objArr3 = objArr6;
                                    i15 = i39;
                                }
                                if (i40 == length2) {
                                    break;
                                }
                                i40++;
                                i39 = i15;
                                objArr6 = objArr3;
                                c10 = 7;
                            }
                        }
                    }
                    C.b bVar = this.f12992L;
                    bVar.f2225f = (i30 - bVar.f2220a.f12986F.f13265g) + bVar.f2225f;
                    this.f12986F.p(i30);
                    if (i33 > 0) {
                        bVar.e(false);
                        bVar.f();
                        C.a aVar = bVar.f2221b;
                        aVar.getClass();
                        C.d.r rVar = C.d.r.f2261c;
                        C.f fVar = aVar.f2219c;
                        fVar.m0(rVar);
                        fVar.f2272e[fVar.f2273f - fVar.f2270c[fVar.f2271d - 1].f2233a] = i33;
                    }
                    t0(obj2, z10);
                    c1087g1 = null;
                }
            }
            X(z10, c1087g1);
        }
        iRotateLeft = Integer.rotateLeft((obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(this.f12996P, 3), 3);
        this.f12996P = iRotateLeft;
        if (obj3 == null) {
            this.f13008l++;
        }
        if (i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f12995O) {
            this.f12986F.f13268k++;
            d11 = this.f12988H;
            i20 = d11.f12817t;
            if (z10) {
                d11.R(i10, c0153a, c0153a, true);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = c0153a;
                }
                d11.R(i10, obj3, obj2, false);
            } else {
                if (obj3 == null) {
                    obj3 = c0153a;
                }
                d11.R(i10, obj3, c0153a, false);
            }
            c1087g2 = this.f13006i;
            if (c1087g2 != null) {
                int i210 = (-2) - i20;
                K k14 = new K(-1, i10, i210, -1);
                c1087g2.f13035e.h(i210, new F(-1, this.j - c1087g2.f13032b, 0));
                c1087g2.f13034d.add(k14);
            }
            X(z10, null);
            return;
        }
        if (i11 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f13006i == null) {
            int iG2 = this.f12986F.g();
            if (z11) {
                z0Var = this.f12986F;
                z0Var.getClass();
                arrayList2 = new ArrayList();
                if (z0Var.f13268k <= 0) {
                    i17 = z0Var.f13265g;
                    while (i17 < z0Var.f13266h) {
                        int i211 = i17 * 5;
                        int[] iArr3 = z0Var.f13260b;
                        int i212 = iArr3[i211];
                        Object objN3 = z0Var.n(iArr3, i17);
                        i18 = iArr3[i211 + 1];
                        if ((i18 & 1073741824) != 0) {
                            i19 = 1;
                        } else {
                            i19 = i18 & 67108863;
                        }
                        arrayList2.add(new K(objN3, i212, i17, i19));
                        i17 += iArr3[i211 + 3];
                    }
                }
                this.f13006i = new C1087g0(this.j, arrayList2);
            } else {
                z0Var = this.f12986F;
                z0Var.getClass();
                arrayList2 = new ArrayList();
                if (z0Var.f13268k <= 0) {
                    i17 = z0Var.f13265g;
                    while (i17 < z0Var.f13266h) {
                        int i213 = i17 * 5;
                        int[] iArr4 = z0Var.f13260b;
                        int i214 = iArr4[i213];
                        Object objN4 = z0Var.n(iArr4, i17);
                        i18 = iArr4[i213 + 1];
                        if ((i18 & 1073741824) != 0) {
                            i19 = 1;
                        } else {
                            i19 = i18 & 67108863;
                        }
                        arrayList2.add(new K(objN4, i214, i17, i19));
                        i17 += iArr4[i213 + 3];
                    }
                }
                this.f13006i = new C1087g0(this.j, arrayList2);
            }
        }
        c1087g0 = this.f13006i;
        if (c1087g0 == null) {
            c1087g1 = null;
        } else {
            if (obj3 != null) {
                objValueOf = new J(Integer.valueOf(i10), obj3);
            } else {
                objValueOf = Integer.valueOf(i10);
            }
            k10 = ((androidx.compose.runtime.collection.b) c1087g0.f13036f.getValue()).f12942a;
            objD = k10.d(objValueOf);
            if (objD == null) {
                objK = null;
            } else if (objD instanceof androidx.collection.I) {
                i12 = (androidx.collection.I) objD;
                objK = i12.k(0);
                if (i12.d()) {
                    k10.j(objValueOf);
                }
                if (i12.f9109b == 1) {
                    k10.l(objValueOf, i12.a());
                }
            } else {
                k10.j(objValueOf);
                objK = objD;
            }
            K k15 = (K) objK;
            arrayList = c1087g0.f13034d;
            b10 = c1087g0.f13035e;
            i13 = c1087g0.f13032b;
            if (z11) {
            }
            this.f12986F.f13268k++;
            this.f12995O = true;
            this.f12990J = null;
            if (this.f12988H.f12820w) {
                D0 d0V2 = this.f12987G.v();
                this.f12988H = d0V2;
                d0V2.L();
                this.f12989I = false;
                this.f12990J = null;
            }
            this.f12988H.d();
            d10 = this.f12988H;
            int i215 = d10.f12817t;
            if (z10) {
                d10.R(i10, c0153a, c0153a, true);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = c0153a;
                }
                d10.R(i10, obj3, obj2, false);
            } else {
                if (obj3 == null) {
                    obj3 = c0153a;
                }
                d10.R(i10, obj3, c0153a, false);
            }
            this.f12993M = this.f12988H.b(i215);
            int i216 = (-2) - i215;
            K k16 = new K(-1, i10, i216, -1);
            b10.h(i216, new F(-1, this.j - i13, 0));
            arrayList.add(k16);
            ArrayList arrayList4 = new ArrayList();
            if (z10) {
                i14 = 0;
            } else {
                i14 = this.j;
            }
            c1087g1 = new C1087g0(i14, arrayList4);
        }
        X(z10, c1087g1);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void r() {
        q0(R.styleable.AppCompatTheme_windowMinWidthMinor, 2, null, null);
        this.f13013q = true;
    }

    public final void r0() {
        q0(-127, 0, null, null);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final boolean s() {
        C1105p0 c1105p0Z;
        return (this.f12995O || this.f13020x || this.f13018v || (c1105p0Z = Z()) == null || (c1105p0Z.f13106a & 8) != 0) ? false : true;
    }

    public final void s0(int i10, C1077b0 c1077b0) {
        q0(i10, 0, c1077b0, null);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final <V, T> void t(V v10, Ia.p<? super T, ? super V, p293xa.r> pVar) {
        if (this.f12995O) {
            C.c cVar = this.f12994N;
            cVar.getClass();
            C.d.F f10 = C.d.F.f2240c;
            C.f fVar = cVar.f2231c;
            fVar.m0(f10);
            C.f.b.a(fVar, 0, v10);
            kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.o.d(2, pVar);
            C.f.b.a(fVar, 1, pVar);
            return;
        }
        C.b bVar = this.f12992L;
        bVar.c();
        C.a aVar = bVar.f2221b;
        aVar.getClass();
        C.d.F f11 = C.d.F.f2240c;
        C.f fVar2 = aVar.f2219c;
        fVar2.m0(f11);
        kotlin.jvm.internal.i.c(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.o.d(2, pVar);
        C.f.b.b(fVar2, 0, v10, 1, pVar);
    }

    public final void t0(Object obj, boolean z10) {
        if (z10) {
            z0 z0Var = this.f12986F;
            if (z0Var.f13268k <= 0) {
                if ((z0Var.f13260b[(z0Var.f13265g * 5) + 1] & 1073741824) == 0) {
                    C1091i0.a("Expected a node group");
                }
                z0Var.s();
                return;
            }
            return;
        }
        if (obj != null && this.f12986F.f() != obj) {
            C.b bVar = this.f12992L;
            bVar.getClass();
            bVar.e(false);
            C.a aVar = bVar.f2221b;
            aVar.getClass();
            C.d.E e10 = C.d.E.f2239c;
            C.f fVar = aVar.f2219c;
            fVar.m0(e10);
            C.f.b.a(fVar, 0, obj);
        }
        this.f12986F.s();
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final InterfaceC1078c<?> u() {
        return this.f12998a;
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
    public final void u0() {
        this.f13008l = 0;
        this.f12986F = this.f13000c.q();
        q0(100, 0, null, null);
        AbstractC1094k abstractC1094k = this.f12999b;
        abstractC1094k.p();
        this.f13016t = abstractC1094k.g();
        this.f13019w.f(this.f13018v ? 1 : 0);
        this.f13018v = K(this.f13016t);
        this.f12990J = null;
        if (!this.f13012p) {
            this.f13012p = abstractC1094k.e();
        }
        if (!this.f12982B) {
            this.f12982B = abstractC1094k.f();
        }
        Set<H.a> set = (Set) C1109s.a(this.f13016t, InspectionTablesKt.f13244a);
        if (set != null) {
            set.add(j());
            abstractC1094k.m(set);
        }
        q0(abstractC1094k.h(), 0, null, null);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final <T> void v(Ia.a<? extends T> aVar) {
        if (!this.f13013q) {
            C1090i.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f13013q = false;
        if (!this.f12995O) {
            C1090i.c("createNode() can only be called when inserting");
        }
        T4.o0 o0Var = this.f13009m;
        int i10 = ((int[]) o0Var.f5990b)[o0Var.f5989a - 1];
        D0 d10 = this.f12988H;
        C1074a c1074aB = d10.b(d10.f12819v);
        this.f13007k++;
        C.c cVar = this.f12994N;
        C.d.o oVar = C.d.o.f2258c;
        C.f fVar = cVar.f2231c;
        fVar.m0(oVar);
        C.f.b.a(fVar, 0, aVar);
        fVar.f2272e[fVar.f2273f - fVar.f2270c[fVar.f2271d - 1].f2233a] = i10;
        C.f.b.a(fVar, 1, c1074aB);
        C.d.t tVar = C.d.t.f2263c;
        C.f fVar2 = cVar.f2232d;
        fVar2.m0(tVar);
        fVar2.f2272e[fVar2.f2273f - fVar2.f2270c[fVar2.f2271d - 1].f2233a] = i10;
        C.f.b.a(fVar2, 0, c1074aB);
    }

    public final boolean v0(C1105p0 c1105p0, Object obj) {
        C1074a c1074a = c1105p0.f13108c;
        if (c1074a == null) {
            return false;
        }
        int iE = this.f12986F.f13259a.e(c1074a);
        if (!this.f12985E || iE < this.f12986F.f13265g) {
            return false;
        }
        ArrayList arrayList = this.f13014r;
        int iG = C1090i.g(iE, arrayList);
        if (iG < 0) {
            int i10 = -(iG + 1);
            if (!(obj instanceof InterfaceC1116x)) {
                obj = null;
            }
            arrayList.add(i10, new I(c1105p0, iE, obj));
        } else {
            I i11 = (I) arrayList.get(iG);
            if (obj instanceof InterfaceC1116x) {
                Object obj2 = i11.f12851c;
                if (obj2 == null) {
                    i11.f12851c = obj;
                } else if (obj2 instanceof androidx.collection.L) {
                    ((androidx.collection.L) obj2).d(obj);
                } else {
                    int i12 = androidx.collection.V.f9134a;
                    androidx.collection.L l10 = new androidx.collection.L(2);
                    l10.k(obj2);
                    l10.k(obj);
                    i11.f12851c = l10;
                }
            } else {
                i11.f12851c = null;
            }
        }
        return true;
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final void w() {
        if (this.f13007k != 0) {
            C1090i.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f12995O) {
            return;
        }
        C1105p0 c1105p0Z = Z();
        if (c1105p0Z != null) {
            int i10 = c1105p0Z.f13106a;
            if ((i10 & 128) == 0) {
                c1105p0Z.f13106a = i10 | 16;
            }
        }
        if (this.f13014r.isEmpty()) {
            p0();
        } else {
            g0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060 A[LOOP:0: B:5:0x0012->B:20:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[EDGE_INSN: B:24:0x0063->B:21:0x0063 BREAK  A[LOOP:0: B:5:0x0012->B:20:0x0060], SYNTHETIC] */
    public final void w0(androidx.collection.K<Object, Object> k10) {
        Object[] objArr = k10.f9128b;
        Object[] objArr2 = k10.f9129c;
        long[] jArr = k10.f9127a;
        int length = jArr.length - 2;
        ArrayList arrayList = this.f13014r;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            C1105p0 c1105p0 = (C1105p0) obj;
                            C1074a c1074a = c1105p0.f13108c;
                            if (c1074a != null) {
                                int i14 = c1074a.f12935a;
                                if (obj2 == x0.f13255a) {
                                    obj2 = null;
                                }
                                arrayList.add(new I(c1105p0, i14, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        kotlin.collections.p.G(arrayList, C1090i.f13043f);
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final <T> T x(AbstractC1104p<T> abstractC1104p) {
        return (T) C1109s.a(P(), abstractC1104p);
    }

    public final void x0(int i10, int i11) {
        if (A0(i10) != i11) {
            if (i10 < 0) {
                C0897z c0897z = this.f13011o;
                if (c0897z == null) {
                    c0897z = new C0897z();
                    this.f13011o = c0897z;
                }
                c0897z.f(i10, i11);
                return;
            }
            int[] iArr = this.f13010n;
            if (iArr == null) {
                iArr = new int[this.f12986F.f13261c];
                Q3.d.x(-1, 0, 6, iArr);
                this.f13010n = iArr;
            }
            iArr[i10] = i11;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final kotlin.coroutines.e y() {
        return this.f12999b.i();
    }

    public final void y0(int i10, int i11) {
        int iA0 = A0(i10);
        if (iA0 != i11) {
            int i12 = i11 - iA0;
            ArrayList arrayList = this.f13005h;
            int size = arrayList.size() - 1;
            while (i10 != -1) {
                int iA1 = A0(i10) + i12;
                x0(i10, iA1);
                for (int i13 = size; -1 < i13; i13--) {
                    C1087g0 c1087g0 = (C1087g0) arrayList.get(i13);
                    if (c1087g0 != null && c1087g0.a(i10, iA1)) {
                        size = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f12986F.f13267i;
                } else if (this.f12986F.j(i10)) {
                    return;
                } else {
                    i10 = this.f12986F.o(i10);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1084f
    public final InterfaceC1089h0 z() {
        return P();
    }

    public final void z0(Object obj) {
        if (this.f12995O) {
            this.f12988H.T(obj);
            return;
        }
        z0 z0Var = this.f12986F;
        boolean z10 = z0Var.f13271n;
        C.b bVar = this.f12992L;
        if (!z10) {
            C1074a c1074aA = z0Var.a(z0Var.f13267i);
            C.a aVar = bVar.f2221b;
            aVar.getClass();
            C.d.C0667b c0667b = C.d.C0667b.f2245c;
            C.f fVar = aVar.f2219c;
            fVar.m0(c0667b);
            C.f.b.b(fVar, 0, c1074aA, 1, obj);
            return;
        }
        int iC = (z0Var.f13269l - C0.c(z0Var.f13260b, z0Var.f13267i)) - 1;
        if (bVar.f2220a.f12986F.f13267i - bVar.f2225f >= 0) {
            bVar.e(true);
            C.a aVar2 = bVar.f2221b;
            C.d.G g10 = C.d.G.f2241c;
            C.f fVar2 = aVar2.f2219c;
            fVar2.m0(g10);
            C.f.b.a(fVar2, 0, obj);
            fVar2.f2272e[fVar2.f2273f - fVar2.f2270c[fVar2.f2271d - 1].f2233a] = iC;
            return;
        }
        z0 z0Var2 = this.f12986F;
        C1074a c1074aA2 = z0Var2.a(z0Var2.f13267i);
        C.a aVar3 = bVar.f2221b;
        C.d.D d10 = C.d.D.f2238c;
        C.f fVar3 = aVar3.f2219c;
        fVar3.m0(d10);
        C.f.b.b(fVar3, 0, obj, 1, c1074aA2);
        fVar3.f2272e[fVar3.f2273f - fVar3.f2270c[fVar3.f2271d - 1].f2233a] = iC;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.g$a */
    /* JADX INFO: compiled from: Composer.kt */
    public static final class a implements w0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f13023b;

        public a(b bVar) {
            this.f13023b = bVar;
        }

        @Override // androidx.compose.runtime.t0
        public final void b() {
            this.f13023b.s();
        }

        @Override // androidx.compose.runtime.t0
        public final void c() {
            this.f13023b.s();
        }

        @Override // androidx.compose.runtime.t0
        public final void d() {
        }
    }
}
