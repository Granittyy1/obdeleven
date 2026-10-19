package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: ConversationEndedCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationEndedCardKt$lambda4$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$ConversationEndedCardKt$lambda4$1 INSTANCE = new ComposableSingletons$ConversationEndedCardKt$lambda4$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            ConversationEndedCardKt.ConversationEndedCard(null, new C2294n(), new ComposerState.ConversationEnded(new StringProvider.ActualString("You have another conversation about this issue"), new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString("Continue the conversation"), R.drawable.intercom_send_message_icon, "123")), interfaceC1084f, (StringProvider.$stable << 6) | 48, 1);
        }
    }
}
