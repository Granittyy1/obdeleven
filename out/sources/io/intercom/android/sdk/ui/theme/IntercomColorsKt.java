package io.intercom.android.sdk.ui.theme;

import B.C0607b;
import Q3.d;
import androidx.compose.material3.C1061m;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.AbstractC1099m0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.X;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.C2331b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomColors.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomColorsKt {
    private static final AbstractC1099m0<IntercomColors> LocalIntercomColors = new O0(new C2331b(2));
    private static X<ThemeMode> currentThemeMode = J0.f(ThemeMode.LIGHT);

    public static final X<ThemeMode> getCurrentThemeMode() {
        return currentThemeMode;
    }

    /* JADX INFO: renamed from: getIntercomColors-hIzCY_Q, reason: not valid java name */
    public static final IntercomColors m655getIntercomColorshIzCY_Q(long j, long j10, long j11, long j12, long j13, long j14, boolean z10, H h8) {
        if (z10) {
            IntercomColors intercomColorsIntercomLightColors = intercomLightColors();
            return intercomColorsIntercomLightColors.m614copy0EgJgxk(((-64) & 1) != 0 ? intercomColorsIntercomLightColors.action : j, ((-64) & 2) != 0 ? intercomColorsIntercomLightColors.onAction : j10, ((-64) & 4) != 0 ? intercomColorsIntercomLightColors.actionContrastWhite : j11, ((-64) & 8) != 0 ? intercomColorsIntercomLightColors.onActionContrastWhite : j12, ((-64) & 16) != 0 ? intercomColorsIntercomLightColors.header : j13, ((-64) & 32) != 0 ? intercomColorsIntercomLightColors.onHeader : j14, ((-64) & 64) != 0 ? intercomColorsIntercomLightColors.background : 0L, ((-64) & 128) != 0 ? intercomColorsIntercomLightColors.primaryText : 0L, ((-64) & 256) != 0 ? intercomColorsIntercomLightColors.primaryIcon : 0L, ((-64) & 512) != 0 ? intercomColorsIntercomLightColors.descriptionText : 0L, ((-64) & 1024) != 0 ? intercomColorsIntercomLightColors.captionText : 0L, ((-64) & 2048) != 0 ? intercomColorsIntercomLightColors.bubbleBackground : 0L, ((-64) & 4096) != 0 ? intercomColorsIntercomLightColors.adminBackground : 0L, ((-64) & 8192) != 0 ? intercomColorsIntercomLightColors.adminBorder : 0L, ((-64) & 16384) != 0 ? intercomColorsIntercomLightColors.timestampBackground : 0L, (32768 & (-64)) != 0 ? intercomColorsIntercomLightColors.onDisabled : 0L, (65536 & (-64)) != 0 ? intercomColorsIntercomLightColors.cardBorder : 0L, (131072 & (-64)) != 0 ? intercomColorsIntercomLightColors.composerBorder : 0L, (262144 & (-64)) != 0 ? intercomColorsIntercomLightColors.collectorBorder : 0L, (524288 & (-64)) != 0 ? intercomColorsIntercomLightColors.collectorSelected : 0L, (1048576 & (-64)) != 0 ? intercomColorsIntercomLightColors.border : 0L, (2097152 & (-64)) != 0 ? intercomColorsIntercomLightColors.shadow : 0L, (4194304 & (-64)) != 0 ? intercomColorsIntercomLightColors.specialNoticeBackground : 0L, (8388608 & (-64)) != 0 ? intercomColorsIntercomLightColors.specialNoticeBorder : 0L, (16777216 & (-64)) != 0 ? intercomColorsIntercomLightColors.poweredByBackgroundColor : 0L, (33554432 & (-64)) != 0 ? intercomColorsIntercomLightColors.divider : 0L, (67108864 & (-64)) != 0 ? intercomColorsIntercomLightColors.disabled : 0L, (134217728 & (-64)) != 0 ? intercomColorsIntercomLightColors.greetingText : 0L, (268435456 & (-64)) != 0 ? intercomColorsIntercomLightColors.introText : 0L, (536870912 & (-64)) != 0 ? intercomColorsIntercomLightColors.isTyping : 0L, (1073741824 & (-64)) != 0 ? intercomColorsIntercomLightColors.hintText : 0L, ((-64) & Integer.MIN_VALUE) != 0 ? intercomColorsIntercomLightColors.sourceBackground : 0L, (510 & 1) != 0 ? intercomColorsIntercomLightColors.inputAlt : h8 != null ? h8.f13506a : intercomLightColors().m637getInputAlt0d7_KjU(), (510 & 2) != 0 ? intercomColorsIntercomLightColors.badge : 0L, (510 & 4) != 0 ? intercomColorsIntercomLightColors.waiting : 0L, (510 & 8) != 0 ? intercomColorsIntercomLightColors.submitted : 0L, (510 & 16) != 0 ? intercomColorsIntercomLightColors.resolved : 0L, (510 & 32) != 0 ? intercomColorsIntercomLightColors.away : 0L, (510 & 64) != 0 ? intercomColorsIntercomLightColors.active : 0L, (510 & 128) != 0 ? intercomColorsIntercomLightColors.error : 0L, (510 & 256) != 0 ? intercomColorsIntercomLightColors.isLight : false);
        }
        IntercomColors intercomColorsIntercomDarkColors = intercomDarkColors();
        return intercomColorsIntercomDarkColors.m614copy0EgJgxk(((-64) & 1) != 0 ? intercomColorsIntercomDarkColors.action : j, ((-64) & 2) != 0 ? intercomColorsIntercomDarkColors.onAction : j10, ((-64) & 4) != 0 ? intercomColorsIntercomDarkColors.actionContrastWhite : j11, ((-64) & 8) != 0 ? intercomColorsIntercomDarkColors.onActionContrastWhite : j12, ((-64) & 16) != 0 ? intercomColorsIntercomDarkColors.header : j13, ((-64) & 32) != 0 ? intercomColorsIntercomDarkColors.onHeader : j14, ((-64) & 64) != 0 ? intercomColorsIntercomDarkColors.background : 0L, ((-64) & 128) != 0 ? intercomColorsIntercomDarkColors.primaryText : 0L, ((-64) & 256) != 0 ? intercomColorsIntercomDarkColors.primaryIcon : 0L, ((-64) & 512) != 0 ? intercomColorsIntercomDarkColors.descriptionText : 0L, ((-64) & 1024) != 0 ? intercomColorsIntercomDarkColors.captionText : 0L, ((-64) & 2048) != 0 ? intercomColorsIntercomDarkColors.bubbleBackground : 0L, ((-64) & 4096) != 0 ? intercomColorsIntercomDarkColors.adminBackground : 0L, ((-64) & 8192) != 0 ? intercomColorsIntercomDarkColors.adminBorder : 0L, ((-64) & 16384) != 0 ? intercomColorsIntercomDarkColors.timestampBackground : 0L, (32768 & (-64)) != 0 ? intercomColorsIntercomDarkColors.onDisabled : 0L, (65536 & (-64)) != 0 ? intercomColorsIntercomDarkColors.cardBorder : 0L, (131072 & (-64)) != 0 ? intercomColorsIntercomDarkColors.composerBorder : 0L, (262144 & (-64)) != 0 ? intercomColorsIntercomDarkColors.collectorBorder : 0L, (524288 & (-64)) != 0 ? intercomColorsIntercomDarkColors.collectorSelected : 0L, (1048576 & (-64)) != 0 ? intercomColorsIntercomDarkColors.border : 0L, (2097152 & (-64)) != 0 ? intercomColorsIntercomDarkColors.shadow : 0L, (4194304 & (-64)) != 0 ? intercomColorsIntercomDarkColors.specialNoticeBackground : 0L, (8388608 & (-64)) != 0 ? intercomColorsIntercomDarkColors.specialNoticeBorder : 0L, (16777216 & (-64)) != 0 ? intercomColorsIntercomDarkColors.poweredByBackgroundColor : 0L, (33554432 & (-64)) != 0 ? intercomColorsIntercomDarkColors.divider : 0L, (67108864 & (-64)) != 0 ? intercomColorsIntercomDarkColors.disabled : 0L, (134217728 & (-64)) != 0 ? intercomColorsIntercomDarkColors.greetingText : 0L, (268435456 & (-64)) != 0 ? intercomColorsIntercomDarkColors.introText : 0L, (536870912 & (-64)) != 0 ? intercomColorsIntercomDarkColors.isTyping : 0L, (1073741824 & (-64)) != 0 ? intercomColorsIntercomDarkColors.hintText : 0L, ((-64) & Integer.MIN_VALUE) != 0 ? intercomColorsIntercomDarkColors.sourceBackground : 0L, (510 & 1) != 0 ? intercomColorsIntercomDarkColors.inputAlt : h8 != null ? h8.f13506a : intercomDarkColors().m637getInputAlt0d7_KjU(), (510 & 2) != 0 ? intercomColorsIntercomDarkColors.badge : 0L, (510 & 4) != 0 ? intercomColorsIntercomDarkColors.waiting : 0L, (510 & 8) != 0 ? intercomColorsIntercomDarkColors.submitted : 0L, (510 & 16) != 0 ? intercomColorsIntercomDarkColors.resolved : 0L, (510 & 32) != 0 ? intercomColorsIntercomDarkColors.away : 0L, (510 & 64) != 0 ? intercomColorsIntercomDarkColors.active : 0L, (510 & 128) != 0 ? intercomColorsIntercomDarkColors.error : 0L, (510 & 256) != 0 ? intercomColorsIntercomDarkColors.isLight : false);
    }

    public static final AbstractC1099m0<IntercomColors> getLocalIntercomColors() {
        return LocalIntercomColors;
    }

    public static final IntercomColors intercomDarkColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long jM562getFallback0d7_KjU = baseColors.m562getFallback0d7_KjU();
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(jM562getFallback0d7_KjU, newColorScheme.m570getGray250d7_KjU(), newColorScheme.m570getGray250d7_KjU(), newColorScheme.m572getGray9000d7_KjU(), newColorScheme.m572getGray9000d7_KjU(), newColorScheme.m570getGray250d7_KjU(), newColorScheme.m572getGray9000d7_KjU(), newColorScheme.m570getGray250d7_KjU(), newColorScheme.m570getGray250d7_KjU(), baseColors.m556getBlack450d7_KjU(), baseColors.m560getBlack950d7_KjU(), baseColors.m554getBlack100d7_KjU(), newColorScheme.m571getGray8500d7_KjU(), H.b(0.02f, newColorScheme.m571getGray8500d7_KjU()), baseColors.m554getBlack100d7_KjU(), H.b(0.15f, newColorScheme.m570getGray250d7_KjU()), H.b(0.1f, newColorScheme.m571getGray8500d7_KjU()), baseColors.m555getBlack200d7_KjU(), newColorScheme.m571getGray8500d7_KjU(), H.b(0.7f, newColorScheme.m571getGray8500d7_KjU()), newColorScheme.m571getGray8500d7_KjU(), d.e(4279176975L), newColorScheme.m571getGray8500d7_KjU(), baseColors.m554getBlack100d7_KjU(), baseColors.m554getBlack100d7_KjU(), H.b(0.9f, newColorScheme.m571getGray8500d7_KjU()), baseColors.m559getBlack900d7_KjU(), baseColors.m556getBlack450d7_KjU(), newColorScheme.m570getGray250d7_KjU(), baseColors.m557getBlack700d7_KjU(), baseColors.m557getBlack700d7_KjU(), d.e(4293256677L), d.e(4281216558L), baseColors.m566getRed0d7_KjU(), baseColors.m565getOrange0d7_KjU(), baseColors.m561getBlue0d7_KjU(), baseColors.m563getGreen0d7_KjU(), baseColors.m568getYellow0d7_KjU(), baseColors.m564getGreenLighter200d7_KjU(), baseColors.m566getRed0d7_KjU(), false, null);
    }

    public static final IntercomColors intercomLightColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        return new IntercomColors(baseColors.m562getFallback0d7_KjU(), baseColors.m567getWhite0d7_KjU(), baseColors.m553getBlack0d7_KjU(), baseColors.m567getWhite0d7_KjU(), baseColors.m567getWhite0d7_KjU(), baseColors.m553getBlack0d7_KjU(), baseColors.m567getWhite0d7_KjU(), baseColors.m554getBlack100d7_KjU(), baseColors.m553getBlack0d7_KjU(), baseColors.m556getBlack450d7_KjU(), baseColors.m555getBlack200d7_KjU(), baseColors.m560getBlack950d7_KjU(), H.b(0.04f, baseColors.m553getBlack0d7_KjU()), H.b(0.02f, baseColors.m553getBlack0d7_KjU()), baseColors.m560getBlack950d7_KjU(), H.b(0.2f, baseColors.m554getBlack100d7_KjU()), H.b(0.1f, baseColors.m553getBlack0d7_KjU()), H.b(0.1f, baseColors.m553getBlack0d7_KjU()), d.e(4292993505L), d.e(4294375158L), BaseColors.NewColorScheme.INSTANCE.m569getGray1000d7_KjU(), d.e(4279176975L), baseColors.m567getWhite0d7_KjU(), baseColors.m560getBlack950d7_KjU(), d.e(4294440951L), H.b(0.05f, baseColors.m553getBlack0d7_KjU()), baseColors.m559getBlack900d7_KjU(), baseColors.m556getBlack450d7_KjU(), baseColors.m553getBlack0d7_KjU(), baseColors.m557getBlack700d7_KjU(), baseColors.m557getBlack700d7_KjU(), d.e(4293256677L), baseColors.m567getWhite0d7_KjU(), baseColors.m566getRed0d7_KjU(), baseColors.m565getOrange0d7_KjU(), baseColors.m561getBlue0d7_KjU(), baseColors.m563getGreen0d7_KjU(), baseColors.m568getYellow0d7_KjU(), baseColors.m564getGreenLighter200d7_KjU(), baseColors.m566getRed0d7_KjU(), true, null);
    }

    public static final void setCurrentThemeMode(X<ThemeMode> x10) {
        i.e(x10, "<set-?>");
        currentThemeMode = x10;
    }

    public static final C1061m toMaterialColors(IntercomColors intercomColors) {
        i.e(intercomColors, "<this>");
        if (intercomColors.isLight()) {
            return ColorSchemeKt.e(intercomColors.m615getAction0d7_KjU(), intercomColors.m639getOnAction0d7_KjU(), intercomColors.m621getBackground0d7_KjU(), intercomColors.m645getPrimaryText0d7_KjU(), intercomColors.m621getBackground0d7_KjU(), intercomColors.m645getPrimaryText0d7_KjU(), intercomColors.m621getBackground0d7_KjU(), intercomColors.m645getPrimaryText0d7_KjU(), intercomColors.m621getBackground0d7_KjU(), intercomColors.m633getError0d7_KjU(), -5234692);
        }
        long jM615getAction0d7_KjU = intercomColors.m615getAction0d7_KjU();
        long jM639getOnAction0d7_KjU = intercomColors.m639getOnAction0d7_KjU();
        long jM621getBackground0d7_KjU = intercomColors.m621getBackground0d7_KjU();
        long jM645getPrimaryText0d7_KjU = intercomColors.m645getPrimaryText0d7_KjU();
        long jM621getBackground0d7_KjU2 = intercomColors.m621getBackground0d7_KjU();
        long jM645getPrimaryText0d7_KjU2 = intercomColors.m645getPrimaryText0d7_KjU();
        long jM621getBackground0d7_KjU3 = intercomColors.m621getBackground0d7_KjU();
        long jM621getBackground0d7_KjU4 = intercomColors.m621getBackground0d7_KjU();
        long jM645getPrimaryText0d7_KjU3 = intercomColors.m645getPrimaryText0d7_KjU();
        long jM633getError0d7_KjU = intercomColors.m633getError0d7_KjU();
        O0 o10 = ColorSchemeKt.f12087a;
        return new C1061m(jM615getAction0d7_KjU, jM639getOnAction0d7_KjU, C0607b.f1182n, C0607b.f1176g, C0607b.f1172c, C0607b.f1184p, C0607b.f1177h, C0607b.f1185q, C0607b.f1178i, C0607b.f1193y, C0607b.j, C0607b.f1194z, C0607b.f1179k, jM621getBackground0d7_KjU4, jM645getPrimaryText0d7_KjU3, jM621getBackground0d7_KjU, jM645getPrimaryText0d7_KjU, jM621getBackground0d7_KjU2, jM645getPrimaryText0d7_KjU2, jM621getBackground0d7_KjU3, C0607b.f1173d, C0607b.f1171b, jM633getError0d7_KjU, C0607b.f1174e, C0607b.f1170a, C0607b.f1175f, C0607b.f1180l, C0607b.f1181m, C0607b.f1183o, C0607b.f1186r, C0607b.f1192x, C0607b.f1187s, C0607b.f1188t, C0607b.f1189u, C0607b.f1190v, C0607b.f1191w);
    }
}
