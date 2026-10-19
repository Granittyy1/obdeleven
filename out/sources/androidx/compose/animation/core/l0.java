package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l0<V extends AbstractC0913m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0925z f9571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f9572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f9573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f9574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9575e;

    public l0(InterfaceC0925z interfaceC0925z) {
        this.f9571a = interfaceC0925z;
        this.f9575e = interfaceC0925z.a();
    }

    public final float a() {
        return this.f9575e;
    }

    public final V b(V v10, V v11) {
        if (this.f9574d == null) {
            this.f9574d = (V) v10.c();
        }
        V v12 = this.f9574d;
        if (v12 == null) {
            kotlin.jvm.internal.i.m("targetVector");
            throw null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f9574d;
            if (v13 == null) {
                kotlin.jvm.internal.i.m("targetVector");
                throw null;
            }
            v13.e(this.f9571a.e(v10.a(i10), v11.a(i10)), i10);
        }
        V v14 = this.f9574d;
        if (v14 != null) {
            return v14;
        }
        kotlin.jvm.internal.i.m("targetVector");
        throw null;
    }

    public final V c(long j, V v10, V v11) {
        if (this.f9573c == null) {
            this.f9573c = (V) v10.c();
        }
        V v12 = this.f9573c;
        if (v12 == null) {
            kotlin.jvm.internal.i.m("velocityVector");
            throw null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f9573c;
            if (v13 == null) {
                kotlin.jvm.internal.i.m("velocityVector");
                throw null;
            }
            v10.getClass();
            v13.e(this.f9571a.b(v11.a(i10), j), i10);
        }
        V v14 = this.f9573c;
        if (v14 != null) {
            return v14;
        }
        kotlin.jvm.internal.i.m("velocityVector");
        throw null;
    }
}
