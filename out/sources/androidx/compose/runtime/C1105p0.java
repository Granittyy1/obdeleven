package androidx.compose.runtime;

import java.util.List;

/* JADX INFO: renamed from: androidx.compose.runtime.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1105p0 implements InterfaceC1103o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1107q0 f13107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1074a f13108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> f13109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.collection.H<Object> f13111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.collection.K<InterfaceC1116x<?>, Object> f13112g;

    /* JADX INFO: renamed from: androidx.compose.runtime.p0$a */
    /* JADX INFO: compiled from: RecomposeScopeImpl.kt */
    public static final class a {
        public static void a(D0 d10, List list, InterfaceC1107q0 interfaceC1107q0) {
            List list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iC = d10.c((C1074a) list.get(i10));
                int iM = d10.M(d10.f12800b, d10.q(iC));
                Object obj = iM < d10.f(d10.f12800b, d10.q(iC + 1)) ? d10.f12801c[d10.g(iM)] : InterfaceC1084f.a.f12980a;
                C1105p0 c1105p0 = obj instanceof C1105p0 ? (C1105p0) obj : null;
                if (c1105p0 != null) {
                    c1105p0.f13107b = interfaceC1107q0;
                }
            }
        }
    }

    public C1105p0(C1100n c1100n) {
        this.f13107b = c1100n;
    }

    public static boolean a(InterfaceC1116x interfaceC1116x, androidx.collection.K k10) {
        kotlin.jvm.internal.i.c(interfaceC1116x, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        I0 i0A = interfaceC1116x.a();
        if (i0A == null) {
            i0A = Q0.f12888a;
        }
        return !i0A.a(interfaceC1116x.x().f12829f, k10.d(interfaceC1116x));
    }

    public final boolean b() {
        if (this.f13107b == null) {
            return false;
        }
        C1074a c1074a = this.f13108c;
        return c1074a != null ? c1074a.a() : false;
    }

    public final InvalidationResult c(Object obj) {
        InvalidationResult invalidationResultC;
        InterfaceC1107q0 interfaceC1107q0 = this.f13107b;
        return (interfaceC1107q0 == null || (invalidationResultC = interfaceC1107q0.c(this, obj)) == null) ? InvalidationResult.f12852b : invalidationResultC;
    }

    public final void d() {
        InterfaceC1107q0 interfaceC1107q0 = this.f13107b;
        if (interfaceC1107q0 != null) {
            interfaceC1107q0.b();
        }
        this.f13107b = null;
        this.f13111f = null;
        this.f13112g = null;
    }

    public final void e(boolean z10) {
        if (z10) {
            this.f13106a |= 32;
        } else {
            this.f13106a &= -33;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1103o0
    public final void invalidate() {
        InterfaceC1107q0 interfaceC1107q0 = this.f13107b;
        if (interfaceC1107q0 != null) {
            interfaceC1107q0.c(this, null);
        }
    }
}
