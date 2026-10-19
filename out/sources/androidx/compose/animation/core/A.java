package androidx.compose.animation.core;

import com.braze.Constants;

/* JADX INFO: compiled from: FloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC0925z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9335b;

    public A(float f10, float f11) {
        this.f9334a = Math.max(1.0E-7f, Math.abs(f11));
        this.f9335b = Math.max(1.0E-4f, f10) * (-4.2f);
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final float a() {
        return this.f9334a;
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final float b(float f10, long j) {
        return f10 * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f9335b));
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final float c(float f10, float f11, long j) {
        float f12 = this.f9335b;
        return ((f11 / f12) * ((float) Math.exp((f12 * (j / 1000000)) / 1000.0f))) + (f10 - (f11 / f12));
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final long d(float f10) {
        return ((long) ((((float) Math.log(this.f9334a / Math.abs(f10))) * 1000.0f) / this.f9335b)) * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC0925z
    public final float e(float f10, float f11) {
        float fAbs = Math.abs(f11);
        float f12 = this.f9334a;
        if (fAbs <= f12) {
            return f10;
        }
        double dLog = Math.log(Math.abs(f12 / f11));
        float f13 = this.f9335b;
        return ((f11 / f13) * ((float) Math.exp((((double) f13) * ((dLog / ((double) f13)) * ((double) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS))) / ((double) 1000.0f)))) + (f10 - (f11 / f13));
    }
}
