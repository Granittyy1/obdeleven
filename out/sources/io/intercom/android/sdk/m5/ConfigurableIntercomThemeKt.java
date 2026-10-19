package io.intercom.android.sdk.m5;

import Ia.p;
import L4.b;
import O.e;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.CustomizationColorsModel;
import io.intercom.android.sdk.models.CustomizationModel;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ConfigurableIntercomTheme.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConfigurableIntercomThemeKt {
    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    public static final void ConfigurableIntercomTheme(final AppConfig appConfig, final p<? super InterfaceC1084f, ? super Integer, r> content, InterfaceC1084f interfaceC1084f, final int i10) {
        boolean z10;
        CustomizationColorsModel actionContrastDark;
        boolean z11;
        i.e(appConfig, "appConfig");
        i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(180143044);
        ConfigModules configModules = appConfig.getConfigModules();
        IntercomColors intercomColorsM655getIntercomColorshIzCY_Q = null;
        CustomizationModel customization = configModules != null ? configModules.getCustomization() : null;
        c1086gP.L(-1126606345);
        if (customization == null) {
            z11 = false;
        } else {
            ThemeMode currentThemeMode = ThemeManager.INSTANCE.getCurrentThemeMode();
            c1086gP.L(-1126607475);
            if (currentThemeMode != ThemeMode.DARK) {
                if (currentThemeMode != ThemeMode.LIGHT) {
                    if (currentThemeMode != ThemeMode.SYSTEM) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e.w(c1086gP)) {
                        z10 = false;
                    }
                }
                z10 = true;
            } else {
                z10 = false;
            }
            c1086gP.T(false);
            ThemeUtils themeUtils = ThemeUtils.INSTANCE;
            long composeColor$default = ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getBackgroundColor(), customization.getAction().getBackgroundColorDark(), c1086gP, 384), 0.0f, 1, null);
            long composeColor$default2 = ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getAction().getForegroundColor(), customization.getAction().getForegroundColorDark(), c1086gP, 384), 0.0f, 1, null);
            if (z10 || (actionContrastDark = customization.getActionContrastDark()) == null) {
                actionContrastDark = customization.getActionContrastWhite();
            }
            c1086gP.L(-1126577992);
            H h8 = actionContrastDark == null ? null : new H(ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(actionContrastDark.getBackgroundColor(), actionContrastDark.getBackgroundColorDark(), c1086gP, 384), 0.0f, 1, null));
            c1086gP.T(false);
            long j = h8 != null ? h8.f13506a : composeColor$default;
            c1086gP.L(-1126568904);
            H h10 = actionContrastDark == null ? null : new H(ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(actionContrastDark.getForegroundColor(), actionContrastDark.getForegroundColorDark(), c1086gP, 384), 0.0f, 1, null));
            c1086gP.T(false);
            intercomColorsM655getIntercomColorshIzCY_Q = IntercomColorsKt.m655getIntercomColorshIzCY_Q(composeColor$default, composeColor$default2, j, h10 != null ? h10.f13506a : composeColor$default2, ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getHeader().getBackgroundColor(), customization.getHeader().getBackgroundColorDark(), c1086gP, 384), 0.0f, 1, null), ColorExtensionsKt.toComposeColor$default(themeUtils.selectColorForThemeCompose$intercom_sdk_base_release(customization.getHeader().getForegroundColor(), customization.getHeader().getForegroundColorDark(), c1086gP, 384), 0.0f, 1, null), z10, (128 & 128) != 0 ? null : null);
            z11 = false;
        }
        c1086gP.T(z11);
        c1086gP.L(-1126607561);
        IntercomColors colors = intercomColorsM655getIntercomColorshIzCY_Q == null ? IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable) : intercomColorsM655getIntercomColorshIzCY_Q;
        c1086gP.T(z11);
        IntercomThemeKt.IntercomTheme(colors, null, null, content, c1086gP, (i10 << 6) & 7168, 6);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConfigurableIntercomThemeKt.ConfigurableIntercomTheme$lambda$3(appConfig, content, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ConfigurableIntercomTheme$lambda$3(AppConfig appConfig, p content, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        i.e(appConfig, "$appConfig");
        i.e(content, "$content");
        ConfigurableIntercomTheme(appConfig, content, interfaceC1084f, b.l(i10 | 1));
        return r.f47939a;
    }
}
