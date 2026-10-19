package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: EdgeEffectCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11022b;

    public r(Context context) {
        super(context);
        this.f11021a = I.e.b(context).f20478b * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f11022b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f11022b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f11022b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f11022b = 0.0f;
        super.onPull(f10);
    }
}
