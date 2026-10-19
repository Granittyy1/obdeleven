package androidx.compose.ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidBlendMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1137m {
    public static final BlendMode a(int i10) {
        if (C1149z.a(i10, 0)) {
            return BlendMode.CLEAR;
        }
        if (C1149z.a(i10, 1)) {
            return BlendMode.SRC;
        }
        if (C1149z.a(i10, 2)) {
            return BlendMode.DST;
        }
        if (C1149z.a(i10, 3)) {
            return BlendMode.SRC_OVER;
        }
        if (C1149z.a(i10, 4)) {
            return BlendMode.DST_OVER;
        }
        if (C1149z.a(i10, 5)) {
            return BlendMode.SRC_IN;
        }
        if (C1149z.a(i10, 6)) {
            return BlendMode.DST_IN;
        }
        if (C1149z.a(i10, 7)) {
            return BlendMode.SRC_OUT;
        }
        if (C1149z.a(i10, 8)) {
            return BlendMode.DST_OUT;
        }
        if (C1149z.a(i10, 9)) {
            return BlendMode.SRC_ATOP;
        }
        if (C1149z.a(i10, 10)) {
            return BlendMode.DST_ATOP;
        }
        if (C1149z.a(i10, 11)) {
            return BlendMode.XOR;
        }
        if (C1149z.a(i10, 12)) {
            return BlendMode.PLUS;
        }
        if (C1149z.a(i10, 13)) {
            return BlendMode.MODULATE;
        }
        if (C1149z.a(i10, 14)) {
            return BlendMode.SCREEN;
        }
        if (C1149z.a(i10, 15)) {
            return BlendMode.OVERLAY;
        }
        if (C1149z.a(i10, 16)) {
            return BlendMode.DARKEN;
        }
        if (C1149z.a(i10, 17)) {
            return BlendMode.LIGHTEN;
        }
        if (C1149z.a(i10, 18)) {
            return BlendMode.COLOR_DODGE;
        }
        if (C1149z.a(i10, 19)) {
            return BlendMode.COLOR_BURN;
        }
        if (C1149z.a(i10, 20)) {
            return BlendMode.HARD_LIGHT;
        }
        if (C1149z.a(i10, 21)) {
            return BlendMode.SOFT_LIGHT;
        }
        if (C1149z.a(i10, 22)) {
            return BlendMode.DIFFERENCE;
        }
        if (C1149z.a(i10, 23)) {
            return BlendMode.EXCLUSION;
        }
        if (C1149z.a(i10, 24)) {
            return BlendMode.MULTIPLY;
        }
        if (C1149z.a(i10, 25)) {
            return BlendMode.HUE;
        }
        if (C1149z.a(i10, 26)) {
            return BlendMode.SATURATION;
        }
        if (C1149z.a(i10, 27)) {
            return BlendMode.COLOR;
        }
        return C1149z.a(i10, 28) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i10) {
        if (C1149z.a(i10, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if (C1149z.a(i10, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if (C1149z.a(i10, 2)) {
            return PorterDuff.Mode.DST;
        }
        if (C1149z.a(i10, 3)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (C1149z.a(i10, 4)) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (C1149z.a(i10, 5)) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (C1149z.a(i10, 6)) {
            return PorterDuff.Mode.DST_IN;
        }
        if (C1149z.a(i10, 7)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (C1149z.a(i10, 8)) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (C1149z.a(i10, 9)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (C1149z.a(i10, 10)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (C1149z.a(i10, 11)) {
            return PorterDuff.Mode.XOR;
        }
        if (C1149z.a(i10, 12)) {
            return PorterDuff.Mode.ADD;
        }
        if (C1149z.a(i10, 14)) {
            return PorterDuff.Mode.SCREEN;
        }
        if (C1149z.a(i10, 15)) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (C1149z.a(i10, 16)) {
            return PorterDuff.Mode.DARKEN;
        }
        if (C1149z.a(i10, 17)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return C1149z.a(i10, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
