package io.intercom.android.sdk.utilities;

import O.e;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.X;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ThemeUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ThemeUtils {
    public static final int $stable = 0;
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    /* JADX INFO: compiled from: ThemeUtils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ThemeUtils() {
    }

    public static final String appendInterfaceStyleToUrl(Context context, String url) {
        i.e(context, "context");
        i.e(url, "url");
        String string = Uri.parse(url).buildUpon().appendQueryParameter("theme", isDarkMode$intercom_sdk_base_release(context) ? "dark" : "light").build().toString();
        i.d(string, "toString(...)");
        return string;
    }

    public static final boolean isDarkMode$intercom_sdk_base_release(Context context) {
        i.e(context, "context");
        int i10 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
                return true;
            }
        }
        return false;
    }

    private static final ThemeMode isDarkModeCompose$lambda$0(X<ThemeMode> x10) {
        return x10.getValue();
    }

    public static final String selectColorForTheme(Context context, String lightColor, String str) {
        i.e(context, "context");
        i.e(lightColor, "lightColor");
        return (!isDarkMode$intercom_sdk_base_release(context) || str == null || str.length() == 0) ? lightColor : str;
    }

    public static final String selectHeaderBackgroundImageUrl$intercom_sdk_base_release(Context context, String str, String str2) {
        i.e(context, "context");
        return selectUrlForTheme(context, str, str2);
    }

    public static final String selectHeaderLogoUrl$intercom_sdk_base_release(Context context, String str, String str2) {
        i.e(context, "context");
        return (!isDarkMode$intercom_sdk_base_release(context) || str2 == null) ? str : str2;
    }

    public static final String selectLauncherLogoUrl(Context context, String str, String str2) {
        i.e(context, "context");
        return selectLauncherLogoUrl$default(context, str, str2, null, 8, null);
    }

    public static /* synthetic */ String selectLauncherLogoUrl$default(Context context, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        return selectLauncherLogoUrl(context, str, str2, str3);
    }

    public static final String selectUrlForTheme(Context context, String str, String str2) {
        i.e(context, "context");
        return (!isDarkMode$intercom_sdk_base_release(context) || str2 == null || str2.length() == 0) ? str : str2;
    }

    public final boolean isDarkModeCompose$intercom_sdk_base_release(InterfaceC1084f interfaceC1084f, int i10) {
        boolean zW;
        interfaceC1084f.L(121228161);
        ThemeMode themeModeIsDarkModeCompose$lambda$0 = isDarkModeCompose$lambda$0(ThemeManager.INSTANCE.getThemeModeState());
        if (themeModeIsDarkModeCompose$lambda$0 == ThemeMode.DARK) {
            zW = true;
        } else if (themeModeIsDarkModeCompose$lambda$0 == ThemeMode.LIGHT) {
            zW = false;
        } else {
            if (themeModeIsDarkModeCompose$lambda$0 != ThemeMode.SYSTEM) {
                throw new NoWhenBranchMatchedException();
            }
            zW = e.w(interfaceC1084f);
        }
        interfaceC1084f.D();
        return zW;
    }

    public final String selectColorForThemeCompose$intercom_sdk_base_release(String lightColor, String str, InterfaceC1084f interfaceC1084f, int i10) {
        i.e(lightColor, "lightColor");
        interfaceC1084f.L(-1398327784);
        if (isDarkModeCompose$intercom_sdk_base_release(interfaceC1084f, (i10 >> 6) & 14) && str != null && str.length() != 0) {
            lightColor = str;
        }
        interfaceC1084f.D();
        return lightColor;
    }

    public final String selectUrlForThemeCompose$intercom_sdk_base_release(String str, String str2, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(1242850468);
        if (isDarkModeCompose$intercom_sdk_base_release(interfaceC1084f, (i10 >> 6) & 14) && str2 != null && str2.length() != 0) {
            str = str2;
        }
        interfaceC1084f.D();
        return str;
    }

    public static final String selectLauncherLogoUrl(Context context, String str, String str2, String str3) {
        i.e(context, "context");
        if (!isDarkMode$intercom_sdk_base_release(context) || str2 == null || str2.length() == 0) {
            return (str == null || str.length() == 0) ? str3 : str;
        }
        return str2;
    }
}
