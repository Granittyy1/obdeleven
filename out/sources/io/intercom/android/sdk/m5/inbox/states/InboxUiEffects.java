package io.intercom.android.sdk.m5.inbox.states;

import io.intercom.android.sdk.models.Conversation;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InboxUiEffects.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class InboxUiEffects {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: InboxUiEffects.kt */
    public static final class NavigateToConversation extends InboxUiEffects {
        public static final int $stable = 8;
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(Conversation conversation) {
            super(null);
            i.e(conversation, "conversation");
            this.conversation = conversation;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, Conversation conversation, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                conversation = navigateToConversation.conversation;
            }
            return navigateToConversation.copy(conversation);
        }

        public final Conversation component1() {
            return this.conversation;
        }

        public final NavigateToConversation copy(Conversation conversation) {
            i.e(conversation, "conversation");
            return new NavigateToConversation(conversation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToConversation) && i.a(this.conversation, ((NavigateToConversation) obj).conversation);
        }

        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        public String toString() {
            return "NavigateToConversation(conversation=" + this.conversation + ')';
        }
    }

    /* JADX INFO: compiled from: InboxUiEffects.kt */
    public static final class RefreshInbox extends InboxUiEffects {
        public static final int $stable = 0;
        public static final RefreshInbox INSTANCE = new RefreshInbox();

        private RefreshInbox() {
            super(null);
        }
    }

    public /* synthetic */ InboxUiEffects(e eVar) {
        this();
    }

    private InboxUiEffects() {
    }
}
