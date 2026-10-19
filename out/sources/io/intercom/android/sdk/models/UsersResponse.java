package io.intercom.android.sdk.models;

/* JADX INFO: loaded from: classes3.dex */
public class UsersResponse extends BaseResponse {
    private final ConversationList unreadConversations;
    private final UnreadTickets unreadTickets;

    public static class Builder extends BaseResponse.Builder {
        ConversationList.Builder unread_conversations;
        UnreadTickets unread_tickets;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public UsersResponse build() {
            return new UsersResponse(this);
        }
    }

    public UsersResponse(Builder builder) {
        super(builder);
        ConversationList.Builder builder2 = builder.unread_conversations;
        this.unreadConversations = builder2 == null ? new ConversationList.Builder().build() : builder2.build();
        UnreadTickets unreadTickets = builder.unread_tickets;
        this.unreadTickets = unreadTickets == null ? UnreadTickets.Companion.getNULL() : unreadTickets;
    }

    public ConversationList getUnreadConversations() {
        return this.unreadConversations;
    }

    public UnreadTickets getUnreadTickets() {
        return this.unreadTickets;
    }
}
