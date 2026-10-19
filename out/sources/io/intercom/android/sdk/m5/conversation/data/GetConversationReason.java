package io.intercom.android.sdk.m5.conversation.data;

/* JADX INFO: compiled from: ConversationRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum GetConversationReason {
    NEW_COMMENT,
    NEXUS_CONNECTED,
    NETWORK_CONNECTED,
    OPEN_CONVERSATION,
    POLLING;

    private static final /* synthetic */ Ba.a $ENTRIES = kotlin.enums.a.a(values());

    public static Ba.a<GetConversationReason> getEntries() {
        return $ENTRIES;
    }
}
