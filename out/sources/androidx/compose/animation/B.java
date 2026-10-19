package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0925z;

/* JADX INFO: compiled from: SplineBasedFloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0925z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9263a;

    public B(p013b0.c cVar) {
        this.f9263a = new r(C.f9264a, cVar);
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final float a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final float b(float f10, long j) {
        long j10 = j / 1000000;
        r.a aVarA = this.f9263a.a(f10);
        long j11 = aVarA.f9669c;
        return (((Math.signum(aVarA.f9667a) * C0898a.a(j11 > 0 ? j10 / j11 : 1.0f).f9330b) * aVarA.f9668b) / j11) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final float c(float f10, float f11, long j) {
        long j10 = j / 1000000;
        r.a aVarA = this.f9263a.a(f11);
        long j11 = aVarA.f9669c;
        return (Math.signum(aVarA.f9667a) * aVarA.f9668b * C0898a.a(j11 > 0 ? j10 / j11 : 1.0f).f9329a) + f10;
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final long d(float f10) {
        return ((long) (Math.exp(this.f9263a.b(f10) / (((double) s.f9670a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final float e(float f10, float f11) {
        r rVar = this.f9263a;
        double dB = rVar.b(f11);
        double d10 = s.f9670a;
        return (Math.signum(f11) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dB) * ((double) (rVar.f9664a * rVar.f9666c))))) + f10;
    }
}
