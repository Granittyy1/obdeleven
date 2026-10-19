package io.intercom.android.sdk.m5.conversation.states;

import B1.a;
import B7.b;
import androidx.compose.animation.D;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HeaderMenuItem {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Help extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Help(boolean z10, StringProvider label) {
            super(null);
            i.e(label, "label");
            this.enabled = z10;
            this.label = label;
        }

        public static /* synthetic */ Help copy$default(Help help, boolean z10, StringProvider stringProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = help.enabled;
            }
            if ((i10 & 2) != 0) {
                stringProvider = help.label;
            }
            return help.copy(z10, stringProvider);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final StringProvider component2() {
            return this.label;
        }

        public final Help copy(boolean z10, StringProvider label) {
            i.e(label, "label");
            return new Help(z10, label);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Help)) {
                return false;
            }
            Help help = (Help) obj;
            return this.enabled == help.enabled && i.a(this.label, help.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        public String toString() {
            return "Help(enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Messages extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final StringProvider label;
        private final TotalCountIndicator totalCountIndicator;
        private final String unreadMessagesCount;

        public /* synthetic */ Messages(TotalCountIndicator totalCountIndicator, String str, boolean z10, StringProvider stringProvider, int i10, e eVar) {
            this(totalCountIndicator, str, (i10 & 4) != 0 ? true : z10, stringProvider);
        }

        public static /* synthetic */ Messages copy$default(Messages messages, TotalCountIndicator totalCountIndicator, String str, boolean z10, StringProvider stringProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                totalCountIndicator = messages.totalCountIndicator;
            }
            if ((i10 & 2) != 0) {
                str = messages.unreadMessagesCount;
            }
            if ((i10 & 4) != 0) {
                z10 = messages.enabled;
            }
            if ((i10 & 8) != 0) {
                stringProvider = messages.label;
            }
            return messages.copy(totalCountIndicator, str, z10, stringProvider);
        }

        public final TotalCountIndicator component1() {
            return this.totalCountIndicator;
        }

        public final String component2() {
            return this.unreadMessagesCount;
        }

        public final boolean component3() {
            return this.enabled;
        }

        public final StringProvider component4() {
            return this.label;
        }

        public final Messages copy(TotalCountIndicator totalCountIndicator, String unreadMessagesCount, boolean z10, StringProvider label) {
            i.e(totalCountIndicator, "totalCountIndicator");
            i.e(unreadMessagesCount, "unreadMessagesCount");
            i.e(label, "label");
            return new Messages(totalCountIndicator, unreadMessagesCount, z10, label);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Messages)) {
                return false;
            }
            Messages messages = (Messages) obj;
            return i.a(this.totalCountIndicator, messages.totalCountIndicator) && i.a(this.unreadMessagesCount, messages.unreadMessagesCount) && this.enabled == messages.enabled && i.a(this.label, messages.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public StringProvider getLabel() {
            return this.label;
        }

        public final TotalCountIndicator getTotalCountIndicator() {
            return this.totalCountIndicator;
        }

        public final String getUnreadMessagesCount() {
            return this.unreadMessagesCount;
        }

        public int hashCode() {
            return this.label.hashCode() + D.b(a.b(this.unreadMessagesCount, this.totalCountIndicator.hashCode() * 31, 31), 31, this.enabled);
        }

        public String toString() {
            return "Messages(totalCountIndicator=" + this.totalCountIndicator + ", unreadMessagesCount=" + this.unreadMessagesCount + ", enabled=" + this.enabled + ", label=" + this.label + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Messages(TotalCountIndicator totalCountIndicator, String unreadMessagesCount, boolean z10, StringProvider label) {
            super(null);
            i.e(totalCountIndicator, "totalCountIndicator");
            i.e(unreadMessagesCount, "unreadMessagesCount");
            i.e(label, "label");
            this.totalCountIndicator = totalCountIndicator;
            this.unreadMessagesCount = unreadMessagesCount;
            this.enabled = z10;
            this.label = label;
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class StartNewConversation extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartNewConversation(boolean z10, StringProvider label) {
            super(null);
            i.e(label, "label");
            this.enabled = z10;
            this.label = label;
        }

        public static /* synthetic */ StartNewConversation copy$default(StartNewConversation startNewConversation, boolean z10, StringProvider stringProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = startNewConversation.enabled;
            }
            if ((i10 & 2) != 0) {
                stringProvider = startNewConversation.label;
            }
            return startNewConversation.copy(z10, stringProvider);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final StringProvider component2() {
            return this.label;
        }

        public final StartNewConversation copy(boolean z10, StringProvider label) {
            i.e(label, "label");
            return new StartNewConversation(z10, label);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartNewConversation)) {
                return false;
            }
            StartNewConversation startNewConversation = (StartNewConversation) obj;
            return this.enabled == startNewConversation.enabled && i.a(this.label, startNewConversation.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        public String toString() {
            return "StartNewConversation(enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public static final class Tickets extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final boolean hasUnreadTickets;
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tickets(boolean z10, boolean z11, StringProvider label) {
            super(null);
            i.e(label, "label");
            this.hasUnreadTickets = z10;
            this.enabled = z11;
            this.label = label;
        }

        public static /* synthetic */ Tickets copy$default(Tickets tickets, boolean z10, boolean z11, StringProvider stringProvider, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = tickets.hasUnreadTickets;
            }
            if ((i10 & 2) != 0) {
                z11 = tickets.enabled;
            }
            if ((i10 & 4) != 0) {
                stringProvider = tickets.label;
            }
            return tickets.copy(z10, z11, stringProvider);
        }

        public final boolean component1() {
            return this.hasUnreadTickets;
        }

        public final boolean component2() {
            return this.enabled;
        }

        public final StringProvider component3() {
            return this.label;
        }

        public final Tickets copy(boolean z10, boolean z11, StringProvider label) {
            i.e(label, "label");
            return new Tickets(z10, z11, label);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tickets)) {
                return false;
            }
            Tickets tickets = (Tickets) obj;
            return this.hasUnreadTickets == tickets.hasUnreadTickets && this.enabled == tickets.enabled && i.a(this.label, tickets.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getHasUnreadTickets() {
            return this.hasUnreadTickets;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + D.b(Boolean.hashCode(this.hasUnreadTickets) * 31, 31, this.enabled);
        }

        public String toString() {
            return "Tickets(hasUnreadTickets=" + this.hasUnreadTickets + ", enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: ConversationUiState.kt */
    public interface TotalCountIndicator {

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class NoIndicator implements TotalCountIndicator {
            public static final int $stable = 0;
            public static final NoIndicator INSTANCE = new NoIndicator();

            private NoIndicator() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NoIndicator);
            }

            public int hashCode() {
                return -94121592;
            }

            public String toString() {
                return "NoIndicator";
            }
        }

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class UnreadCountIndicator implements TotalCountIndicator {
            public static final int $stable = 0;
            private final String unreadMessagesCount;

            public UnreadCountIndicator(String unreadMessagesCount) {
                i.e(unreadMessagesCount, "unreadMessagesCount");
                this.unreadMessagesCount = unreadMessagesCount;
            }

            public static /* synthetic */ UnreadCountIndicator copy$default(UnreadCountIndicator unreadCountIndicator, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unreadCountIndicator.unreadMessagesCount;
                }
                return unreadCountIndicator.copy(str);
            }

            public final String component1() {
                return this.unreadMessagesCount;
            }

            public final UnreadCountIndicator copy(String unreadMessagesCount) {
                i.e(unreadMessagesCount, "unreadMessagesCount");
                return new UnreadCountIndicator(unreadMessagesCount);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnreadCountIndicator) && i.a(this.unreadMessagesCount, ((UnreadCountIndicator) obj).unreadMessagesCount);
            }

            public final String getUnreadMessagesCount() {
                return this.unreadMessagesCount;
            }

            public int hashCode() {
                return this.unreadMessagesCount.hashCode();
            }

            public String toString() {
                return b.g(new StringBuilder("UnreadCountIndicator(unreadMessagesCount="), this.unreadMessagesCount, ')');
            }
        }

        /* JADX INFO: compiled from: ConversationUiState.kt */
        public static final class UnreadDotIndicator implements TotalCountIndicator {
            public static final int $stable = 0;
            public static final UnreadDotIndicator INSTANCE = new UnreadDotIndicator();

            private UnreadDotIndicator() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UnreadDotIndicator);
            }

            public int hashCode() {
                return -715258213;
            }

            public String toString() {
                return "UnreadDotIndicator";
            }
        }
    }

    public /* synthetic */ HeaderMenuItem(e eVar) {
        this();
    }

    public abstract boolean getEnabled();

    public abstract StringProvider getLabel();

    private HeaderMenuItem() {
    }
}
