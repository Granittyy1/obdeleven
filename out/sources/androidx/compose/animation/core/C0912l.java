package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0912l extends AbstractC0913m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9570e = 4;

    public C0912l(float f10, float f11, float f12, float f13) {
        this.f9566a = f10;
        this.f9567b = f11;
        this.f9568c = f12;
        this.f9569d = f13;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f9566a;
        }
        if (i10 == 1) {
            return this.f9567b;
        }
        if (i10 == 2) {
            return this.f9568c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f9569d;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final int b() {
        return this.f9570e;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final AbstractC0913m c() {
        return new C0912l(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final void d() {
        this.f9566a = 0.0f;
        this.f9567b = 0.0f;
        this.f9568c = 0.0f;
        this.f9569d = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC0913m
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f9566a = f10;
            return;
        }
        if (i10 == 1) {
            this.f9567b = f10;
        } else if (i10 == 2) {
            this.f9568c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f9569d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0912l) {
            C0912l c0912l = (C0912l) obj;
            if (c0912l.f9566a == this.f9566a && c0912l.f9567b == this.f9567b && c0912l.f9568c == this.f9568c && c0912l.f9569d == this.f9569d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9569d) + O.a.d(this.f9568c, O.a.d(this.f9567b, Float.hashCode(this.f9566a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f9566a + ", v2 = " + this.f9567b + ", v3 = " + this.f9568c + ", v4 = " + this.f9569d;
    }
}
