package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RippleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.runtime.C f11791a = CompositionLocalKt.c(new Ia.a<J>() { // from class: androidx.compose.material.RippleKt$LocalRippleConfiguration$1
        @Override // Ia.a
        public final J invoke() {
            return new J();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K f11792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K f11793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final androidx.compose.material.ripple.f f11794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.compose.material.ripple.f f11795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.compose.material.ripple.f f11796f;

    static {
        long j = androidx.compose.ui.graphics.H.f13504l;
        f11792b = new K(true, Float.NaN, j);
        f11793c = new K(false, Float.NaN, j);
        f11794d = new androidx.compose.material.ripple.f(0.16f, 0.24f, 0.08f, 0.24f);
        f11795e = new androidx.compose.material.ripple.f(0.08f, 0.12f, 0.04f, 0.12f);
        f11796f = new androidx.compose.material.ripple.f(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static K a(float f10, int i10, long j) {
        boolean z10 = (i10 & 1) != 0;
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            j = androidx.compose.ui.graphics.H.f13504l;
        }
        if (p013b0.f.a(f10, Float.NaN) && androidx.compose.ui.graphics.H.c(j, androidx.compose.ui.graphics.H.f13504l)) {
            return z10 ? f11792b : f11793c;
        }
        return new K(z10, f10, j);
    }
}
