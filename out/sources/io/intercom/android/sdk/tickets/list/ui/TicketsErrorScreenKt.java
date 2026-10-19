package io.intercom.android.sdk.tickets.list.ui;

import Ia.p;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.h;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.m5.components.E0;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: TicketsErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsErrorScreenKt {
    public static final void TicketsErrorScreen(final ErrorState state, final h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        i.e(state, "state");
        C1086g c1086gP = interfaceC1084f.p(1763181519);
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
                hVar = h.a.f13984b;
            }
            IntercomErrorScreenKt.IntercomErrorScreen(state, hVar, c1086gP, i12 & R.styleable.AppCompatTheme_windowNoTitle, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.tickets.list.ui.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketsErrorScreenKt.TicketsErrorScreen$lambda$0(state, hVar, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsErrorScreen$lambda$0(ErrorState state, h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(state, "$state");
        TicketsErrorScreen(state, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void TicketsErrorScreenWithCTAPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1833782159);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsErrorScreenKt.INSTANCE.m493getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsErrorScreenWithCTAPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketsErrorScreenWithCTAPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void TicketsErrorScreenWithoutCTAPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1606879941);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsErrorScreenKt.INSTANCE.m494getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsErrorScreenWithoutCTAPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketsErrorScreenWithoutCTAPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
