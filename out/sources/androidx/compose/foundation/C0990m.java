package androidx.compose.foundation;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: androidx.compose.foundation.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: EdgeEffectCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0990m {
    public static float a(EdgeEffect edgeEffect, float f10, float f11, p013b0.c cVar) {
        float f12 = C0991n.f10903a;
        double density = cVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f10) * 0.35f;
        double d10 = ((double) C0991n.f10903a) * density;
        float fExp = (float) (Math.exp((C0991n.f10904b / C0991n.f10905c) * Math.log(dAbs / d10)) * d10);
        int i10 = Build.VERSION.SDK_INT;
        if (fExp > (i10 >= 31 ? C0931c.b(edgeEffect) : 0.0f) * f11) {
            return 0.0f;
        }
        int iB = Ka.a.b(f10);
        if (i10 >= 31) {
            edgeEffect.onAbsorb(iB);
            return f10;
        }
        if (!edgeEffect.isFinished()) {
            return f10;
        }
        edgeEffect.onAbsorb(iB);
        return f10;
    }
}
