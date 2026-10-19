package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.C2293m0;
import io.intercom.android.sdk.m5.components.C2295n0;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: ConversationBottomBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationBottomBarKt {
    /* JADX INFO: renamed from: ConversationBottomBar-wn8IZOc, reason: not valid java name */
    public static final void m204ConversationBottomBarwn8IZOc(androidx.compose.ui.h hVar, final BottomBarUiState bottomBarUiState, final Ia.p<? super String, ? super TextInputSource, p293xa.r> onSendMessage, final Ia.l<? super ComposerInputType, p293xa.r> onInputChange, final Ia.a<p293xa.r> onGifInputSelected, final Ia.a<p293xa.r> onNewConversationClicked, final Ia.a<p293xa.r> onMediaInputSelected, Ia.l<? super MetricData, p293xa.r> lVar, float f10, final Ia.l<? super String, p293xa.r> navigateToAnotherConversation, final Ia.a<p293xa.r> onPrivacyNoticeDismissed, Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        kotlin.jvm.internal.i.e(bottomBarUiState, "bottomBarUiState");
        kotlin.jvm.internal.i.e(onSendMessage, "onSendMessage");
        kotlin.jvm.internal.i.e(onInputChange, "onInputChange");
        kotlin.jvm.internal.i.e(onGifInputSelected, "onGifInputSelected");
        kotlin.jvm.internal.i.e(onNewConversationClicked, "onNewConversationClicked");
        kotlin.jvm.internal.i.e(onMediaInputSelected, "onMediaInputSelected");
        kotlin.jvm.internal.i.e(navigateToAnotherConversation, "navigateToAnotherConversation");
        kotlin.jvm.internal.i.e(onPrivacyNoticeDismissed, "onPrivacyNoticeDismissed");
        C1086g c1086gP = interfaceC1084f.p(-975908602);
        androidx.compose.ui.h hVar2 = (i12 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        Ia.l<? super MetricData, p293xa.r> u10 = (i12 & 128) != 0 ? new io.intercom.android.sdk.m5.conversation.ui.U(1) : lVar;
        float f11 = (i12 & 256) != 0 ? 0 : f10;
        Ia.a<p293xa.r> aVar2 = (i12 & 2048) != 0 ? new O9.a(3) : aVar;
        BoxWithConstraintsKt.a(hVar2, null, false, androidx.compose.runtime.internal.a.b(188868976, new ConversationBottomBarKt$ConversationBottomBar$3(f11, bottomBarUiState, onSendMessage, onGifInputSelected, onMediaInputSelected, onInputChange, u10, aVar2, onNewConversationClicked, navigateToAnotherConversation, onPrivacyNoticeDismissed), c1086gP), c1086gP, (i10 & 14) | 3072, 6);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final Ia.l<? super MetricData, p293xa.r> lVar2 = u10;
            final float f12 = f11;
            final Ia.a<p293xa.r> aVar3 = aVar2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.z
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationBottomBarKt.ConversationBottomBar_wn8IZOc$lambda$2(hVar3, bottomBarUiState, onSendMessage, onInputChange, onGifInputSelected, onNewConversationClicked, onMediaInputSelected, lVar2, f12, navigateToAnotherConversation, onPrivacyNoticeDismissed, aVar3, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationBottomBar_wn8IZOc$lambda$0(MetricData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationBottomBar_wn8IZOc$lambda$2(androidx.compose.ui.h hVar, BottomBarUiState bottomBarUiState, Ia.p onSendMessage, Ia.l onInputChange, Ia.a onGifInputSelected, Ia.a onNewConversationClicked, Ia.a onMediaInputSelected, Ia.l lVar, float f10, Ia.l navigateToAnotherConversation, Ia.a onPrivacyNoticeDismissed, Ia.a aVar, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(bottomBarUiState, "$bottomBarUiState");
        kotlin.jvm.internal.i.e(onSendMessage, "$onSendMessage");
        kotlin.jvm.internal.i.e(onInputChange, "$onInputChange");
        kotlin.jvm.internal.i.e(onGifInputSelected, "$onGifInputSelected");
        kotlin.jvm.internal.i.e(onNewConversationClicked, "$onNewConversationClicked");
        kotlin.jvm.internal.i.e(onMediaInputSelected, "$onMediaInputSelected");
        kotlin.jvm.internal.i.e(navigateToAnotherConversation, "$navigateToAnotherConversation");
        kotlin.jvm.internal.i.e(onPrivacyNoticeDismissed, "$onPrivacyNoticeDismissed");
        m204ConversationBottomBarwn8IZOc(hVar, bottomBarUiState, onSendMessage, onInputChange, onGifInputSelected, onNewConversationClicked, onMediaInputSelected, lVar, f10, navigateToAnotherConversation, onPrivacyNoticeDismissed, aVar, interfaceC1084f, L4.b.l(i10 | 1), L4.b.l(i11), i12);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void MessageComposerLongTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1582182192);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m197getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2293m0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageComposerLongTextPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MessageComposerLongTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void MessageComposerPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-961451097);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m195getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2295n0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageComposerPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MessageComposerPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
