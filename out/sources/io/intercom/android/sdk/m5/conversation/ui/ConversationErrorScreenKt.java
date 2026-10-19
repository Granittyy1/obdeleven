package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.C2297o0;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.L0;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConversationErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationErrorScreenKt {
    public static final void ConversationErrorScreen(ConversationUiState.Error state, Ia.a<p293xa.r> onRetryClick, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        ErrorState withoutCTA;
        kotlin.jvm.internal.i.e(state, "state");
        kotlin.jvm.internal.i.e(onRetryClick, "onRetryClick");
        C1086g c1086gP = interfaceC1084f.p(-1804211412);
        androidx.compose.ui.h hVar2 = (i11 & 4) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        if (state.getShowCta()) {
            withoutCTA = new ErrorState.WithCTA(0, 0, null, 0, onRetryClick, 15, null);
        } else {
            withoutCTA = new ErrorState.WithoutCTA(0, 0, null, 7, null);
        }
        IntercomErrorScreenKt.IntercomErrorScreen(withoutCTA, hVar2, c1086gP, (i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new L0(state, onRetryClick, hVar2, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationErrorScreen$lambda$0(ConversationUiState.Error state, Ia.a onRetryClick, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        kotlin.jvm.internal.i.e(onRetryClick, "$onRetryClick");
        ConversationErrorScreen(state, onRetryClick, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void ConversationErrorScreenPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1551706949);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationErrorScreenKt.INSTANCE.m153getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2297o0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationErrorScreenPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ConversationErrorScreenPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
