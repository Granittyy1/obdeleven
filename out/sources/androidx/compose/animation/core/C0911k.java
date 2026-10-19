package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0911k extends AbstractC0913m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9560d = 3;

    public C0911k(float f10, float f11, float f12) {
        this.f9557a = f10;
        this.f9558b = f11;
        this.f9559c = f12;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f9557a;
        }
        if (i10 == 1) {
            return this.f9558b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f9559c;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final int b() {
        return this.f9560d;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final AbstractC0913m c() {
        return new C0911k(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final void d() {
        this.f9557a = 0.0f;
        this.f9558b = 0.0f;
        this.f9559c = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f9557a = f10;
        } else if (i10 == 1) {
            this.f9558b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f9559c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0911k) {
            C0911k c0911k = (C0911k) obj;
            if (c0911k.f9557a == this.f9557a && c0911k.f9558b == this.f9558b && c0911k.f9559c == this.f9559c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9559c) + O.a.d(this.f9558b, Float.hashCode(this.f9557a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f9557a + ", v2 = " + this.f9558b + ", v3 = " + this.f9559c;
    }
}
