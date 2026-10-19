package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LoadingScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadingScreenKt {
    public static final void LoadingScreen(final androidx.compose.ui.h hVar, final int i10, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        C1086g c1086gP = interfaceC1084f.p(-1767045234);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i14 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            final long jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
            androidx.compose.ui.h hVarI = hVar.i(androidx.compose.foundation.layout.W.f10226c);
            c1086gP.L(1035114321);
            boolean zI = c1086gP.i(jM645getPrimaryText0d7_KjU) | ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objF = c1086gP.f();
            if (zI || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.components.B0
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return LoadingScreenKt.LoadingScreen$lambda$2$lambda$1(jM645getPrimaryText0d7_KjU, i10, (Context) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            AndroidView_androidKt.b((Ia.l) objF, hVarI, null, c1086gP, 0, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.C0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LoadingScreenKt.LoadingScreen$lambda$3(hVar, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p300y4.d LoadingScreen$lambda$2$lambda$1(long j, int i10, Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        p300y4.d dVarBuildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        dVarBuildLoadingContainer.addView(LoadingComponentKt.m402buildLoadingContentbw27NRU(context, j, i10));
        return dVarBuildLoadingContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LoadingScreen$lambda$3(androidx.compose.ui.h hVar, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        LoadingScreen(hVar, i10, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void LoadingScreenPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1596356708);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LoadingScreenKt.INSTANCE.m105getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LoadingScreenPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        LoadingScreenPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
