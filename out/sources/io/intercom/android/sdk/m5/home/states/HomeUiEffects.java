package io.intercom.android.sdk.m5.home.states;

import B7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeUiEffects.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HomeUiEffects {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: HomeUiEffects.kt */
    public static final class NavigateToConversation extends HomeUiEffects {
        public static final int $stable = 0;
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(String conversationId) {
            super(null);
            i.e(conversationId, "conversationId");
            this.conversationId = conversationId;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = navigateToConversation.conversationId;
            }
            return navigateToConversation.copy(str);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final NavigateToConversation copy(String conversationId) {
            i.e(conversationId, "conversationId");
            return new NavigateToConversation(conversationId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToConversation) && i.a(this.conversationId, ((NavigateToConversation) obj).conversationId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        public String toString() {
            return b.g(new StringBuilder("NavigateToConversation(conversationId="), this.conversationId, ')');
        }
    }

    /* JADX INFO: compiled from: HomeUiEffects.kt */
    public static final class NavigateToMessages extends HomeUiEffects {
        public static final int $stable = 0;
        public static final NavigateToMessages INSTANCE = new NavigateToMessages();

        private NavigateToMessages() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToMessages);
        }

        public int hashCode() {
            return 982177798;
        }

        public String toString() {
            return "NavigateToMessages";
        }
    }

    /* JADX INFO: compiled from: HomeUiEffects.kt */
    public static final class NavigateToNewConversation extends HomeUiEffects {
        public static final int $stable = 0;
        public static final NavigateToNewConversation INSTANCE = new NavigateToNewConversation();

        private NavigateToNewConversation() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToNewConversation);
        }

        public int hashCode() {
            return 453078601;
        }

        public String toString() {
            return "NavigateToNewConversation";
        }
    }

    public /* synthetic */ HomeUiEffects(e eVar) {
        this();
    }

    private HomeUiEffects() {
    }
}
