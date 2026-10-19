package io.intercom.android.sdk.ui.theme;

import androidx.compose.runtime.X;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ThemeManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ThemeManager {
    private static ThemeMode sessionOverride;
    public static final ThemeManager INSTANCE = new ThemeManager();
    private static ThemeMode serverTheme = ThemeMode.LIGHT;
    public static final int $stable = 8;

    private ThemeManager() {
    }

    private final void updateCurrentTheme() {
        IntercomColorsKt.getCurrentThemeMode().setValue(getCurrentThemeMode());
    }

    public final void clearSessionOverride() {
        sessionOverride = null;
        updateCurrentTheme();
    }

    public final ThemeMode getCurrentThemeMode() {
        ThemeMode themeMode = sessionOverride;
        return themeMode == null ? serverTheme : themeMode;
    }

    public final X<ThemeMode> getThemeModeState() {
        return IntercomColorsKt.getCurrentThemeMode();
    }

    public final void initialize() {
        sessionOverride = null;
        updateCurrentTheme();
    }

    public final void setSessionOverride(ThemeMode themeMode) {
        i.e(themeMode, "themeMode");
        sessionOverride = themeMode;
        updateCurrentTheme();
    }

    public final void setThemeModeForTesting(ThemeMode themeMode) {
        i.e(themeMode, "themeMode");
        setSessionOverride(themeMode);
    }

    public final void updateServerTheme(ThemeMode themeMode) {
        i.e(themeMode, "themeMode");
        serverTheme = themeMode;
        updateCurrentTheme();
    }
}
