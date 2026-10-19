package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.L;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: HelpCenterLoadingScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterLoadingScreenKt {
    public static final void HelpCenterLoadingScreen(final androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(581033983);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            final long jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
            androidx.compose.ui.h hVarI = hVar.i(W.f10226c);
            c1086gP.L(1093772715);
            boolean zI = c1086gP.i(jM645getPrimaryText0d7_KjU);
            Object objF = c1086gP.f();
            if (zI || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.h
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return HelpCenterLoadingScreenKt.HelpCenterLoadingScreen$lambda$2$lambda$1(jM645getPrimaryText0d7_KjU, (Context) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            AndroidView_androidKt.b((Ia.l) objF, hVarI, null, c1086gP, 0, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.i
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterLoadingScreenKt.HelpCenterLoadingScreen$lambda$3(hVar, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p300y4.d HelpCenterLoadingScreen$lambda$2$lambda$1(long j, Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        p300y4.d dVarBuildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        dVarBuildLoadingContainer.addView(LoadingComponentKt.m402buildLoadingContentbw27NRU(context, j, R.drawable.intercom_help_center_loading_state));
        return dVarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HelpCenterLoadingScreen$lambda$3(androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        HelpCenterLoadingScreen(hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void HomeLoadingContentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-192893266);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m271getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new L(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeLoadingContentPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeLoadingContentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
