package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.m5.components.C2272c;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: InboxErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxErrorScreenKt {
    public static final void InboxErrorScreen(ErrorState state, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.i.e(state, "state");
        C1086g c1086gP = interfaceC1084f.p(-659234710);
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
        androidx.compose.ui.h hVar2 = hVar;
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.home.ui.e(state, hVar2, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InboxErrorScreen$lambda$0(ErrorState state, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        InboxErrorScreen(state, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    @IntercomPreviews
    public static final void InboxErrorScreenWithCTAPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1274028182);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxErrorScreenKt.INSTANCE.m332getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InboxErrorScreenWithCTAPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InboxErrorScreenWithCTAPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    public static final void InboxErrorScreenWithoutCTAPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1186679776);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxErrorScreenKt.INSTANCE.m333getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2272c(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InboxErrorScreenWithoutCTAPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InboxErrorScreenWithoutCTAPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
