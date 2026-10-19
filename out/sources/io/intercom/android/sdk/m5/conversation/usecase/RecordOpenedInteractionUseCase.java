package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.models.Conversation;
import kotlin.collections.l;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: RecordOpenedInteractionUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class RecordOpenedInteractionUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    public RecordOpenedInteractionUseCase(ConversationRepository conversationRepository) {
        i.e(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    private final boolean shouldRecordOpenedInteraction(Conversation conversation) {
        return l.s(NotificationStatuses.DELIVERED_STATUS, NotificationStatuses.RENOTIFYING_STATUS).contains(conversation.getNotificationStatus());
    }

    public final void invoke(Conversation conversation) {
        i.e(conversation, "conversation");
        if (shouldRecordOpenedInteraction(conversation)) {
            this.conversationRepository.recordInteractions(conversation.getId(), new String[]{"opened"});
        }
    }
}
