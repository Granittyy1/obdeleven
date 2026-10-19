package androidx.compose.material3;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.O0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RippleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f12283a = new O0(new Ia.a<Boolean>() { // from class: androidx.compose.material3.RippleKt$LocalUseFallbackRippleImplementation$1
        @Override // Ia.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.runtime.C f12284b = CompositionLocalKt.c(new Ia.a<V>() { // from class: androidx.compose.material3.RippleKt$LocalRippleConfiguration$1
        @Override // Ia.a
        public final V invoke() {
            return new V();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X f12285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X f12286d;

    static {
        long j = androidx.compose.ui.graphics.H.f13504l;
        f12285c = new X(true, Float.NaN, j);
        f12286d = new X(false, Float.NaN, j);
    }

    public static final X a(boolean z10, float f10, long j) {
        if (p013b0.f.a(f10, Float.NaN) && androidx.compose.ui.graphics.H.c(j, androidx.compose.ui.graphics.H.f13504l)) {
            return z10 ? f12285c : f12286d;
        }
        return new X(z10, f10, j);
    }

    public static X b(float f10, int i10, boolean z10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return a(z10, f10, androidx.compose.ui.graphics.H.f13504l);
    }

    public static final androidx.compose.foundation.v c(boolean z10, float f10, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.foundation.v vVarA;
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = Float.NaN;
        }
        long j = androidx.compose.ui.graphics.H.f13504l;
        interfaceC1084f.L(-1280632857);
        if (((Boolean) interfaceC1084f.x(f12283a)).booleanValue()) {
            androidx.compose.animation.core.c0<Float> c0Var = androidx.compose.material.ripple.n.f12016a;
            androidx.compose.runtime.X xI = J0.i(new androidx.compose.ui.graphics.H(j), interfaceC1084f);
            boolean z12 = (((i10 & 14) ^ 6) > 4 && interfaceC1084f.c(z10)) || (i10 & 6) == 4;
            if ((((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 || !interfaceC1084f.g(f10)) && (i10 & 48) != 32) {
                z11 = false;
            }
            boolean z13 = z12 | z11;
            Object objF = interfaceC1084f.f();
            if (z13 || objF == InterfaceC1084f.a.f12980a) {
                objF = new androidx.compose.material.ripple.d(z10, f10, xI);
                interfaceC1084f.E(objF);
            }
            vVarA = (androidx.compose.material.ripple.d) objF;
        } else {
            vVarA = a(z10, f10, j);
        }
        interfaceC1084f.D();
        return vVarA;
    }
}
