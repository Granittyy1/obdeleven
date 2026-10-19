package androidx.compose.animation.core;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC0924y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0921v f9352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9354d;

    public C(int i10, int i11, InterfaceC0921v interfaceC0921v) {
        this.f9351a = i10;
        this.f9352b = interfaceC0921v;
        this.f9353c = ((long) i10) * 1000000;
        this.f9354d = ((long) i11) * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC0924y
    public final float c(long j, float f10, float f11, float f12) {
        long j10 = j - this.f9354d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f9353c;
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 == 0) {
            return f12;
        }
        return (f(j12, f10, f11, f12) - f(j12 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.InterfaceC0924y
    public final long d(float f10, float f11, float f12) {
        return this.f9354d + this.f9353c;
    }

    @Override // androidx.compose.animation.core.InterfaceC0924y
    public final float f(long j, float f10, float f11, float f12) {
        long j10 = j - this.f9354d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f9353c;
        if (j10 > j11) {
            j10 = j11;
        }
        float fB = this.f9352b.b(this.f9351a == 0 ? 1.0f : j10 / j11);
        return (f11 * fB) + ((1 - fB) * f10);
    }
}
