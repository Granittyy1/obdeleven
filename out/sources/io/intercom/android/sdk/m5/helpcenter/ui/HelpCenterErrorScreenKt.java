package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.C2295n0;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.J;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HelpCenterErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterErrorScreenKt {
    public static final void HelpCenterErrorScreen(final ErrorState state, final androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.i.e(state, "state");
        C1086g c1086gP = interfaceC1084f.p(-1476576134);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(hVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            IntercomErrorScreenKt.IntercomErrorScreen(state, hVar, c1086gP, i12 & R.styleable.AppCompatTheme_windowNoTitle, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.f
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterErrorScreenKt.HelpCenterErrorScreen$lambda$0(state, hVar, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterErrorScreen$lambda$0(ErrorState state, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        HelpCenterErrorScreen(state, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void HelpCenterErrorScreenWithCTAPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1313793298);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterErrorScreenKt.INSTANCE.m268getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new J(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterErrorScreenWithCTAPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HelpCenterErrorScreenWithCTAPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void HelpCenterErrorScreenWithoutCTAPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1385533872);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterErrorScreenKt.INSTANCE.m269getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2295n0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterErrorScreenWithoutCTAPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HelpCenterErrorScreenWithoutCTAPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
