package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: ConversationEndedCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationEndedCardKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$ConversationEndedCardKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationEndedCardKt$lambda2$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            ConversationEndedCardKt.ConversationEndedCard(null, new C2290l(), new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString("Send a message"), R.drawable.intercom_send_message_icon, null, 4, null)), interfaceC1084f, (StringProvider.$stable << 6) | 48, 1);
        }
    }
}
