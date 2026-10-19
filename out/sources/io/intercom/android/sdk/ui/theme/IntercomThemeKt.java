package io.intercom.android.sdk.ui.theme;

import Ia.p;
import O.e;
import android.view.View;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.c0;
import androidx.compose.runtime.AbstractC1099m0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: IntercomTheme.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomThemeKt {
    private static final AbstractC1099m0<c0> LocalShapes = new O0(new a());

    public static final void IntercomTheme(IntercomColors intercomColors, IntercomTypography intercomTypography, c0 c0Var, final p<? super InterfaceC1084f, ? super Integer, r> content, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        IntercomTypography intercomTypography2;
        final c0 shapes;
        final IntercomColors intercomColors2;
        final IntercomTypography typography;
        final IntercomColors intercomColorsIntercomDarkColors;
        ThemeMode currentThemeMode;
        i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(163228735);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(intercomColors) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            if ((i11 & 2) == 0) {
                intercomTypography2 = intercomTypography;
                int i14 = c1086gP.K(intercomTypography) ? 32 : 16;
                i12 |= i14;
            } else {
                intercomTypography2 = intercomTypography;
            }
            i12 |= i14;
        } else {
            intercomTypography2 = intercomTypography;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                shapes = c0Var;
                int i15 = c1086gP.K(c0Var) ? 256 : 128;
                i12 |= i15;
            } else {
                shapes = c0Var;
            }
            i12 |= i15;
        } else {
            shapes = c0Var;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c1086gP.k(content) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
            intercomColors2 = intercomColors;
            typography = intercomTypography2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                intercomColors2 = i13 != 0 ? null : intercomColors;
                typography = (i11 & 2) != 0 ? IntercomTheme.INSTANCE.getTypography(c1086gP, 6) : intercomTypography2;
                if ((i11 & 4) != 0) {
                    shapes = IntercomTheme.INSTANCE.getShapes(c1086gP, 6);
                }
            } else {
                c1086gP.w();
                intercomColors2 = intercomColors;
                typography = intercomTypography2;
            }
            c1086gP.U();
            c1086gP.L(-541037209);
            if (intercomColors2 != null) {
                intercomColorsIntercomDarkColors = intercomColors2;
            } else if (isDarkThemeInEditMode(c1086gP, 0) || (currentThemeMode = ThemeManager.INSTANCE.getCurrentThemeMode()) == ThemeMode.DARK) {
                intercomColorsIntercomDarkColors = IntercomColorsKt.intercomDarkColors();
            } else if (currentThemeMode == ThemeMode.LIGHT) {
                intercomColorsIntercomDarkColors = IntercomColorsKt.intercomLightColors();
            } else {
                if (currentThemeMode != ThemeMode.SYSTEM) {
                    throw new NoWhenBranchMatchedException();
                }
                intercomColorsIntercomDarkColors = e.w(c1086gP) ? IntercomColorsKt.intercomDarkColors() : IntercomColorsKt.intercomLightColors();
            }
            c1086gP.T(false);
            CompositionLocalKt.b(new C1101n0[]{IntercomColorsKt.getLocalIntercomColors().b(intercomColorsIntercomDarkColors), IntercomTypographyKt.getLocalIntercomTypography().b(typography), B7.b.b(intercomColorsIntercomDarkColors.m645getPrimaryText0d7_KjU(), ContentColorKt.f12125a)}, androidx.compose.runtime.internal.a.b(1689661311, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.ui.theme.IntercomThemeKt.IntercomTheme.1
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i16) {
                    if ((i16 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    MaterialThemeKt.a(IntercomColorsKt.toMaterialColors(intercomColorsIntercomDarkColors), shapes, IntercomTypographyKt.toMaterialTypography(typography), content, interfaceC1084f2, 0, 0);
                }
            }, c1086gP), c1086gP, 56);
        }
        final c0 c0Var2 = shapes;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.ui.theme.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomThemeKt.IntercomTheme$lambda$0(intercomColors2, typography, c0Var2, content, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r IntercomTheme$lambda$0(IntercomColors intercomColors, IntercomTypography intercomTypography, c0 c0Var, p content, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(content, "$content");
        IntercomTheme(intercomColors, intercomTypography, c0Var, content, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 LocalShapes$lambda$1() {
        return new c0(0);
    }

    public static final AbstractC1099m0<c0> getLocalShapes() {
        return LocalShapes;
    }

    private static final boolean isDarkThemeInEditMode(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-320047698);
        boolean z10 = e.w(interfaceC1084f) && ((View) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14797f)).isInEditMode();
        interfaceC1084f.D();
        return z10;
    }
}
