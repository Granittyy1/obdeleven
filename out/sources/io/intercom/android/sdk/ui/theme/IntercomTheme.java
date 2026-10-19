package io.intercom.android.sdk.ui.theme;

import androidx.compose.material3.c0;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: IntercomTheme.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomTheme {
    public static final int $stable = 0;
    public static final IntercomTheme INSTANCE = new IntercomTheme();

    private IntercomTheme() {
    }

    public final IntercomColors getColors(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(159743073);
        IntercomColors intercomColors = (IntercomColors) interfaceC1084f.x(IntercomColorsKt.getLocalIntercomColors());
        interfaceC1084f.D();
        return intercomColors;
    }

    public final c0 getShapes(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-474718694);
        c0 c0Var = (c0) interfaceC1084f.x(IntercomThemeKt.getLocalShapes());
        interfaceC1084f.D();
        return c0Var;
    }

    public final IntercomTypography getTypography(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-989585502);
        IntercomTypography intercomTypography = (IntercomTypography) interfaceC1084f.x(IntercomTypographyKt.getLocalIntercomTypography());
        interfaceC1084f.D();
        return intercomTypography;
    }
}
