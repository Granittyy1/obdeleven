package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2277e0;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import p293xa.r;

/* JADX INFO: compiled from: TicketsLoadingScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsLoadingScreenKt {
    public static final void TicketsLoadingScreen(h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(2079268510);
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
                hVar = h.a.f13984b;
            }
            LoadingScreenKt.LoadingScreen(hVar, R.drawable.intercom_inbox_loading_state, c1086gP, i12 & 14, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.avatar.e(hVar, i10, i11, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsLoadingScreen$lambda$0(h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        TicketsLoadingScreen(hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void TicketsLoadingScreenPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-880557955);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketsLoadingScreenKt.INSTANCE.m496getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2277e0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsLoadingScreenPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketsLoadingScreenPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
