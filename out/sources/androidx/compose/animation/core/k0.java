package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k0<V extends AbstractC0913m> implements j0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0914n f9561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f9562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f9563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f9564d;

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    public static final class a implements InterfaceC0914n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0924y f9565a;

        public a(InterfaceC0924y interfaceC0924y) {
            this.f9565a = interfaceC0924y;
        }

        @Override // androidx.compose.animation.core.InterfaceC0914n
        public final InterfaceC0924y get(int i10) {
            return this.f9565a;
        }
    }

    public k0(InterfaceC0914n interfaceC0914n) {
        this.f9561a = interfaceC0914n;
    }

    @Override // androidx.compose.animation.core.f0
    public final long b(V v10, V v11, V v12) {
        int iB = v10.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f9561a.get(i10).d(v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.f0
    public final V c(long j, V v10, V v11, V v12) {
        if (this.f9563c == null) {
            this.f9563c = (V) v12.c();
        }
        V v13 = this.f9563c;
        if (v13 == null) {
            kotlin.jvm.internal.i.m("velocityVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f9563c;
            if (v14 == null) {
                kotlin.jvm.internal.i.m("velocityVector");
                throw null;
            }
            v14.e(this.f9561a.get(i10).c(j, v10.a(i10), v11.a(i10), v12.a(i10)), i10);
        }
        V v15 = this.f9563c;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.i.m("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.f0
    public final V e(V v10, V v11, V v12) {
        if (this.f9564d == null) {
            this.f9564d = (V) v12.c();
        }
        V v13 = this.f9564d;
        if (v13 == null) {
            kotlin.jvm.internal.i.m("endVelocityVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f9564d;
            if (v14 == null) {
                kotlin.jvm.internal.i.m("endVelocityVector");
                throw null;
            }
            v14.e(this.f9561a.get(i10).e(v10.a(i10), v11.a(i10), v12.a(i10)), i10);
        }
        V v15 = this.f9564d;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.i.m("endVelocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.f0
    public final V f(long j, V v10, V v11, V v12) {
        if (this.f9562b == null) {
            this.f9562b = (V) v10.c();
        }
        V v13 = this.f9562b;
        if (v13 == null) {
            kotlin.jvm.internal.i.m("valueVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f9562b;
            if (v14 == null) {
                kotlin.jvm.internal.i.m("valueVector");
                throw null;
            }
            v14.e(this.f9561a.get(i10).f(j, v10.a(i10), v11.a(i10), v12.a(i10)), i10);
        }
        V v15 = this.f9562b;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.i.m("valueVector");
        throw null;
    }

    public k0(InterfaceC0924y interfaceC0924y) {
        this(new a(interfaceC0924y));
    }
}
