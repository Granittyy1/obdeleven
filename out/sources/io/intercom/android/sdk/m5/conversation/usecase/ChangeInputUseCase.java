package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.q;

/* JADX INFO: compiled from: ChangeInputUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ChangeInputUseCase {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: ChangeInputUseCase.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerInputType.values().length];
            try {
                iArr[ComposerInputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerInputType.VOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void invoke(q<ConversationClientState> clientState, ComposerInputType inputType) {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        ConversationClientState value2;
        ConversationClientState conversationClientState2;
        i.e(clientState, "clientState");
        i.e(inputType, "inputType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value2 = clientState.getValue();
                conversationClientState2 = value2;
            } while (!clientState.d(value2, conversationClientState2.copy((1048574 & 1) != 0 ? conversationClientState2.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState2.conversation : null, (1048574 & 4) != 0 ? conversationClientState2.conversationId : null, (1048574 & 8) != 0 ? conversationClientState2.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState2.composerState : ComposerState.VoiceInput.INSTANCE, (1048574 & 32) != 0 ? conversationClientState2.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState2.launchMode : null, (1048574 & 128) != 0 ? conversationClientState2.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState2.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState2.networkState : null, (1048574 & 1024) != 0 ? conversationClientState2.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState2.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState2.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState2.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState2.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState2.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState2.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState2.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState2.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState2.dismissedPrivacyNotice : false)));
            return;
        }
        do {
            value = clientState.getValue();
            conversationClientState = value;
        } while (!clientState.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : null, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, 4, null), (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
    }
}
