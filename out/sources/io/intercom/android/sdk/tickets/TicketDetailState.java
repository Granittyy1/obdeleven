package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;

/* JADX INFO: compiled from: TicketDetailState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TicketDetailState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: TicketDetailState.kt */
    public static final class Error extends TicketDetailState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ErrorState errorState) {
            super(null);
            kotlin.jvm.internal.i.e(errorState, "errorState");
            this.errorState = errorState;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final Error copy(ErrorState errorState) {
            kotlin.jvm.internal.i.e(errorState, "errorState");
            return new Error(errorState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && kotlin.jvm.internal.i.a(this.errorState, ((Error) obj).errorState);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }
    }

    /* JADX INFO: compiled from: TicketDetailState.kt */
    public static final class Initial extends TicketDetailState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: TicketDetailState.kt */
    public static final class Loading extends TicketDetailState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: TicketDetailState.kt */
    public static final class TicketDetailContentState extends TicketDetailState {
        public static final int $stable = 8;
        private final ConversationButtonState conversationButtonState;
        private final String conversationId;
        private final List<Ticket.TicketAttribute> ticketAttributes;
        private final String ticketName;
        private final TicketTimelineCardState ticketTimelineCardState;
        private final String userEmail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TicketDetailContentState(String ticketName, TicketTimelineCardState ticketTimelineCardState, List<? extends Ticket.TicketAttribute> ticketAttributes, String userEmail, String str, ConversationButtonState conversationButtonState) {
            super(null);
            kotlin.jvm.internal.i.e(ticketName, "ticketName");
            kotlin.jvm.internal.i.e(ticketTimelineCardState, "ticketTimelineCardState");
            kotlin.jvm.internal.i.e(ticketAttributes, "ticketAttributes");
            kotlin.jvm.internal.i.e(userEmail, "userEmail");
            kotlin.jvm.internal.i.e(conversationButtonState, "conversationButtonState");
            this.ticketName = ticketName;
            this.ticketTimelineCardState = ticketTimelineCardState;
            this.ticketAttributes = ticketAttributes;
            this.userEmail = userEmail;
            this.conversationId = str;
            this.conversationButtonState = conversationButtonState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TicketDetailContentState copy$default(TicketDetailContentState ticketDetailContentState, String str, TicketTimelineCardState ticketTimelineCardState, List list, String str2, String str3, ConversationButtonState conversationButtonState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ticketDetailContentState.ticketName;
            }
            if ((i10 & 2) != 0) {
                ticketTimelineCardState = ticketDetailContentState.ticketTimelineCardState;
            }
            TicketTimelineCardState ticketTimelineCardState2 = ticketTimelineCardState;
            if ((i10 & 4) != 0) {
                list = ticketDetailContentState.ticketAttributes;
            }
            List list2 = list;
            if ((i10 & 8) != 0) {
                str2 = ticketDetailContentState.userEmail;
            }
            String str4 = str2;
            if ((i10 & 16) != 0) {
                str3 = ticketDetailContentState.conversationId;
            }
            String str5 = str3;
            if ((i10 & 32) != 0) {
                conversationButtonState = ticketDetailContentState.conversationButtonState;
            }
            return ticketDetailContentState.copy(str, ticketTimelineCardState2, list2, str4, str5, conversationButtonState);
        }

        public final String component1() {
            return this.ticketName;
        }

        public final TicketTimelineCardState component2() {
            return this.ticketTimelineCardState;
        }

        public final List<Ticket.TicketAttribute> component3() {
            return this.ticketAttributes;
        }

        public final String component4() {
            return this.userEmail;
        }

        public final String component5() {
            return this.conversationId;
        }

        public final ConversationButtonState component6() {
            return this.conversationButtonState;
        }

        public final TicketDetailContentState copy(String ticketName, TicketTimelineCardState ticketTimelineCardState, List<? extends Ticket.TicketAttribute> ticketAttributes, String userEmail, String str, ConversationButtonState conversationButtonState) {
            kotlin.jvm.internal.i.e(ticketName, "ticketName");
            kotlin.jvm.internal.i.e(ticketTimelineCardState, "ticketTimelineCardState");
            kotlin.jvm.internal.i.e(ticketAttributes, "ticketAttributes");
            kotlin.jvm.internal.i.e(userEmail, "userEmail");
            kotlin.jvm.internal.i.e(conversationButtonState, "conversationButtonState");
            return new TicketDetailContentState(ticketName, ticketTimelineCardState, ticketAttributes, userEmail, str, conversationButtonState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketDetailContentState)) {
                return false;
            }
            TicketDetailContentState ticketDetailContentState = (TicketDetailContentState) obj;
            return kotlin.jvm.internal.i.a(this.ticketName, ticketDetailContentState.ticketName) && kotlin.jvm.internal.i.a(this.ticketTimelineCardState, ticketDetailContentState.ticketTimelineCardState) && kotlin.jvm.internal.i.a(this.ticketAttributes, ticketDetailContentState.ticketAttributes) && kotlin.jvm.internal.i.a(this.userEmail, ticketDetailContentState.userEmail) && kotlin.jvm.internal.i.a(this.conversationId, ticketDetailContentState.conversationId) && kotlin.jvm.internal.i.a(this.conversationButtonState, ticketDetailContentState.conversationButtonState);
        }

        public final ConversationButtonState getConversationButtonState() {
            return this.conversationButtonState;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final List<Ticket.TicketAttribute> getTicketAttributes() {
            return this.ticketAttributes;
        }

        public final String getTicketName() {
            return this.ticketName;
        }

        public final TicketTimelineCardState getTicketTimelineCardState() {
            return this.ticketTimelineCardState;
        }

        public final String getUserEmail() {
            return this.userEmail;
        }

        public int hashCode() {
            int iB = B1.a.b(this.userEmail, p005a4.p.d((this.ticketTimelineCardState.hashCode() + (this.ticketName.hashCode() * 31)) * 31, 31, this.ticketAttributes), 31);
            String str = this.conversationId;
            return this.conversationButtonState.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            return "TicketDetailContentState(ticketName=" + this.ticketName + ", ticketTimelineCardState=" + this.ticketTimelineCardState + ", ticketAttributes=" + this.ticketAttributes + ", userEmail=" + this.userEmail + ", conversationId=" + this.conversationId + ", conversationButtonState=" + this.conversationButtonState + ')';
        }
    }

    public /* synthetic */ TicketDetailState(kotlin.jvm.internal.e eVar) {
        this();
    }

    private TicketDetailState() {
    }
}
