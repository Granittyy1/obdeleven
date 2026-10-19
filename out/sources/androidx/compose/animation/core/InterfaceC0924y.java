package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0924y extends InterfaceC0906f<Float> {
    @Override // androidx.compose.animation.core.InterfaceC0906f
    default f0 a(d0 d0Var) {
        return new k0(this);
    }

    float c(long j, float f10, float f11, float f12);

    long d(float f10, float f11, float f12);

    default float e(float f10, float f11, float f12) {
        return c(d(f10, f11, f12), f10, f11, f12);
    }

    float f(long j, float f10, float f11, float f12);
}
