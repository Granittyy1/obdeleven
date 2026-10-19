package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2274d;
import io.intercom.android.sdk.m5.components.L;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import p293xa.r;

/* JADX INFO: compiled from: InboxLoadingScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxLoadingScreenKt {
    @IntercomPreviews
    public static final void HomeLoadingContentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1591477138);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            InboxLoadingScreen(c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2274d(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeLoadingContentPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeLoadingContentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void InboxLoadingScreen(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1280547936);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            LoadingScreenKt.LoadingScreen(null, R.drawable.intercom_inbox_loading_state, c1086gP, 0, 1);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new L(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InboxLoadingScreen$lambda$0(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InboxLoadingScreen(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
