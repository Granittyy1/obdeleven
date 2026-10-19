package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0910j extends AbstractC0913m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9556c = 2;

    public C0910j(float f10, float f11) {
        this.f9554a = f10;
        this.f9555b = f11;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f9554a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f9555b;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final int b() {
        return this.f9556c;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final AbstractC0913m c() {
        return new C0910j(0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final void d() {
        this.f9554a = 0.0f;
        this.f9555b = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f9554a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f9555b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0910j) {
            C0910j c0910j = (C0910j) obj;
            if (c0910j.f9554a == this.f9554a && c0910j.f9555b == this.f9555b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9555b) + (Float.hashCode(this.f9554a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f9554a + ", v2 = " + this.f9555b;
    }
}
