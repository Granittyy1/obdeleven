package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import androidx.compose.runtime.InterfaceC1106q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: BringIntoViewSpec.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewSpec_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComputedProvidableCompositionLocal f9905a = new ComputedProvidableCompositionLocal(new Ia.l<InterfaceC1106q, c>() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1
        @Override // Ia.l
        public final c invoke(InterfaceC1106q interfaceC1106q) {
            if (((Context) interfaceC1106q.d(AndroidCompositionLocals_androidKt.f14793b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                return BringIntoViewSpec_androidKt.f9906b;
            }
            c.f10004a.getClass();
            return c.a.f10007c;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9906b = new a();

    /* JADX INFO: compiled from: BringIntoViewSpec.android.kt */
    public static final class a implements c {
        @Override // androidx.compose.foundation.gestures.c
        public final float a(float f10, float f11, float f12) {
            float fAbs = Math.abs((f11 + f10) - f10);
            float f13 = (0.3f * f12) - (0.0f * fAbs);
            float f14 = f12 - f13;
            if ((fAbs <= f12) && f14 < fAbs) {
                f13 = f12 - fAbs;
            }
            return f10 - f13;
        }
    }
}
