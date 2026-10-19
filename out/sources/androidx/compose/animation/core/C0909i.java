package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0909i extends AbstractC0913m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9553b = 1;

    public C0909i(float f10) {
        this.f9552a = f10;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f9552a;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final int b() {
        return this.f9553b;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final AbstractC0913m c() {
        return new C0909i(0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final void d() {
        this.f9552a = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f9552a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0909i) && ((C0909i) obj).f9552a == this.f9552a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9552a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f9552a;
    }
}
