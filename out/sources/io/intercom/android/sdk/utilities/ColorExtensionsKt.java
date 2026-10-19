package io.intercom.android.sdk.utilities;

import Q3.d;
import androidx.compose.ui.graphics.H;
import kotlin.Pair;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ColorExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ColorExtensionsKt {
    private static final float BRIGHTNESS_CUTOFF = 0.6f;
    private static final float WHITENESS_CUTOFF = 0.9411765f;

    /* JADX INFO: renamed from: darken-8_81llA, reason: not valid java name */
    public static final long m657darken8_81llA(long j) {
        return d.d(ColorUtils.darkenColor(d.K(j)));
    }

    /* JADX INFO: renamed from: generateTextColor-8_81llA, reason: not valid java name */
    public static final long m658generateTextColor8_81llA(long j) {
        if (m664isDarkColor8_81llA(j)) {
            int i10 = H.f13505m;
            return H.f13499f;
        }
        int i11 = H.f13505m;
        return H.f13495b;
    }

    /* JADX INFO: renamed from: getAccessibleBorderColor-8_81llA, reason: not valid java name */
    public static final long m659getAccessibleBorderColor8_81llA(long j) {
        return m664isDarkColor8_81llA(j) ? m667lighten8_81llA(j) : m657darken8_81llA(j);
    }

    /* JADX INFO: renamed from: getAccessibleColorOnDarkBackground-8_81llA, reason: not valid java name */
    public static final long m660getAccessibleColorOnDarkBackground8_81llA(long j) {
        return m664isDarkColor8_81llA(j) ? m667lighten8_81llA(j) : j;
    }

    /* JADX INFO: renamed from: getAccessibleColorOnWhiteBackground-8_81llA, reason: not valid java name */
    public static final long m661getAccessibleColorOnWhiteBackground8_81llA(long j) {
        if (!m663isColorTooWhite8_81llA(j)) {
            return j;
        }
        int i10 = H.f13505m;
        return H.f13495b;
    }

    public static final Pair<String, Float> getGreetingTextColor(String str) {
        if (i.a(str, "dark")) {
            return new Pair<>("#000000", Float.valueOf(BRIGHTNESS_CUTOFF));
        }
        return i.a(str, "light") ? new Pair<>("#FFFFFF", Float.valueOf(0.7f)) : new Pair<>("#000000", Float.valueOf(1.0f));
    }

    /* JADX INFO: renamed from: isBlack-8_81llA, reason: not valid java name */
    public static final boolean m662isBlack8_81llA(long j) {
        int i10 = H.f13505m;
        return H.c(j, H.f13495b);
    }

    /* JADX INFO: renamed from: isColorTooWhite-8_81llA, reason: not valid java name */
    private static final boolean m663isColorTooWhite8_81llA(long j) {
        return H.h(j) >= WHITENESS_CUTOFF && H.g(j) >= WHITENESS_CUTOFF && H.e(j) >= WHITENESS_CUTOFF;
    }

    /* JADX INFO: renamed from: isDarkColor-8_81llA, reason: not valid java name */
    public static final boolean m664isDarkColor8_81llA(long j) {
        return d.D(j) < BRIGHTNESS_CUTOFF;
    }

    /* JADX INFO: renamed from: isLightColor-8_81llA, reason: not valid java name */
    public static final boolean m665isLightColor8_81llA(long j) {
        return !m664isDarkColor8_81llA(j);
    }

    /* JADX INFO: renamed from: isWhite-8_81llA, reason: not valid java name */
    public static final boolean m666isWhite8_81llA(long j) {
        int i10 = H.f13505m;
        return H.c(j, H.f13499f);
    }

    /* JADX INFO: renamed from: lighten-8_81llA, reason: not valid java name */
    public static final long m667lighten8_81llA(long j) {
        return d.d(ColorUtils.lightenColor(d.K(j)));
    }

    public static final long toComposeColor(String str, float f10) {
        i.e(str, "<this>");
        return H.b(f10, d.d(ColorUtils.parseColor(str)));
    }

    public static /* synthetic */ long toComposeColor$default(String str, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return toComposeColor(str, f10);
    }
}
