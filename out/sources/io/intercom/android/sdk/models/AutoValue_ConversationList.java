package io.intercom.android.sdk.models;

import C4.v;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ConversationList extends ConversationList {
    private final List<Conversation> getConversations;
    private final EmptyState getEmptyState;
    private final Set<String> getUnreadConversationIds;
    private final int getUnreadConversationsCount;
    private final boolean hasMorePages;

    public AutoValue_ConversationList(List<Conversation> list, Set<String> set, int i10, EmptyState emptyState, boolean z10) {
        if (list == null) {
            throw new NullPointerException("Null getConversations");
        }
        this.getConversations = list;
        if (set == null) {
            throw new NullPointerException("Null getUnreadConversationIds");
        }
        this.getUnreadConversationIds = set;
        this.getUnreadConversationsCount = i10;
        if (emptyState == null) {
            throw new NullPointerException("Null getEmptyState");
        }
        this.getEmptyState = emptyState;
        this.hasMorePages = z10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationList)) {
            return false;
        }
        ConversationList conversationList = (ConversationList) obj;
        return this.getConversations.equals(conversationList.getConversations()) && this.getUnreadConversationIds.equals(conversationList.getUnreadConversationIds()) && this.getUnreadConversationsCount == conversationList.getUnreadConversationsCount() && this.getEmptyState.equals(conversationList.getEmptyState()) && this.hasMorePages == conversationList.hasMorePages();
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public List<Conversation> getConversations() {
        return this.getConversations;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public EmptyState getEmptyState() {
        return this.getEmptyState;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public Set<String> getUnreadConversationIds() {
        return this.getUnreadConversationIds;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public int getUnreadConversationsCount() {
        return this.getUnreadConversationsCount;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public boolean hasMorePages() {
        return this.hasMorePages;
    }

    public int hashCode() {
        return ((((((((this.getConversations.hashCode() ^ 1000003) * 1000003) ^ this.getUnreadConversationIds.hashCode()) * 1000003) ^ this.getUnreadConversationsCount) * 1000003) ^ this.getEmptyState.hashCode()) * 1000003) ^ (this.hasMorePages ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConversationList{getConversations=");
        sb2.append(this.getConversations);
        sb2.append(", getUnreadConversationIds=");
        sb2.append(this.getUnreadConversationIds);
        sb2.append(", getUnreadConversationsCount=");
        sb2.append(this.getUnreadConversationsCount);
        sb2.append(", getEmptyState=");
        sb2.append(this.getEmptyState);
        sb2.append(", hasMorePages=");
        return v.f(sb2, this.hasMorePages, "}");
    }
}
