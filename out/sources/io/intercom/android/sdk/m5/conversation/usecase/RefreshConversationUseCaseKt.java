package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.q;

/* JADX INFO: compiled from: RefreshConversationUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RefreshConversationUseCaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<FloatingIndicatorState, String> calculateJumpToBottomButtonState(ConversationClientState conversationClientState, Conversation conversation, List<? extends Part> list) {
        String id = null;
        if (!(conversationClientState.getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator)) {
            Conversation conversation2 = conversationClientState.getConversation();
            List<Part> listParts = conversation2 != null ? conversation2.parts() : null;
            if (listParts == null) {
                listParts = EmptyList.f42983b;
            }
            return new Pair<>(conversationClientState.getFloatingIndicatorState(), listParts.size() == conversation.parts().size() ? conversationClientState.getNewMessageId() : null);
        }
        String newMessageId = conversationClientState.getNewMessageId();
        if (newMessageId == null) {
            Part part = (Part) q.P(list);
            if (part != null) {
                id = part.getId();
            }
        } else {
            id = newMessageId;
        }
        return new Pair<>(new FloatingIndicatorState.JumpToBottomIndicator(JumpToBottomButtonState.copy$default(((FloatingIndicatorState.JumpToBottomIndicator) conversationClientState.getFloatingIndicatorState()).getJumpToBottomButtonState(), list.size() + ((FloatingIndicatorState.JumpToBottomIndicator) conversationClientState.getFloatingIndicatorState()).getJumpToBottomButtonState().getUnreadMessages(), 0, 0, 6, null)), id);
    }
}
