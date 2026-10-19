package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.models.Ticket;

/* JADX INFO: compiled from: TicketDetailViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface TicketLaunchedFrom {

    /* JADX INFO: compiled from: TicketDetailViewModel.kt */
    public static final class Conversation implements TicketLaunchedFrom {
        public static final int $stable = 8;
        private final String from;
        private final Ticket ticket;

        /* JADX WARN: Multi-variable type inference failed */
        public Conversation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, Ticket ticket, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ticket = conversation.ticket;
            }
            return conversation.copy(ticket);
        }

        public final Ticket component1() {
            return this.ticket;
        }

        public final Conversation copy(Ticket ticket) {
            kotlin.jvm.internal.i.e(ticket, "ticket");
            return new Conversation(ticket);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conversation) && kotlin.jvm.internal.i.a(this.ticket, ((Conversation) obj).ticket);
        }

        @Override // io.intercom.android.sdk.tickets.TicketLaunchedFrom
        public String getFrom() {
            return this.from;
        }

        public final Ticket getTicket() {
            return this.ticket;
        }

        public int hashCode() {
            return this.ticket.hashCode();
        }

        public String toString() {
            return "Conversation(ticket=" + this.ticket + ')';
        }

        public Conversation(Ticket ticket) {
            kotlin.jvm.internal.i.e(ticket, "ticket");
            this.ticket = ticket;
            this.from = "conversation";
        }

        public /* synthetic */ Conversation(Ticket ticket, int i10, kotlin.jvm.internal.e eVar) {
            this((i10 & 1) != 0 ? Injector.get().getDataLayer().getTicket().getValue() : ticket);
        }
    }

    /* JADX INFO: compiled from: TicketDetailViewModel.kt */
    public static final class Other implements TicketLaunchedFrom {
        public static final int $stable = 0;
        private final String from;
        private final String ticketId;

        public Other(String ticketId, String from) {
            kotlin.jvm.internal.i.e(ticketId, "ticketId");
            kotlin.jvm.internal.i.e(from, "from");
            this.ticketId = ticketId;
            this.from = from;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = other.ticketId;
            }
            if ((i10 & 2) != 0) {
                str2 = other.from;
            }
            return other.copy(str, str2);
        }

        public final String component1() {
            return this.ticketId;
        }

        public final String component2() {
            return this.from;
        }

        public final Other copy(String ticketId, String from) {
            kotlin.jvm.internal.i.e(ticketId, "ticketId");
            kotlin.jvm.internal.i.e(from, "from");
            return new Other(ticketId, from);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Other)) {
                return false;
            }
            Other other = (Other) obj;
            return kotlin.jvm.internal.i.a(this.ticketId, other.ticketId) && kotlin.jvm.internal.i.a(this.from, other.from);
        }

        @Override // io.intercom.android.sdk.tickets.TicketLaunchedFrom
        public String getFrom() {
            return this.from;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return this.from.hashCode() + (this.ticketId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Other(ticketId=");
            sb2.append(this.ticketId);
            sb2.append(", from=");
            return B7.b.g(sb2, this.from, ')');
        }
    }

    String getFrom();

    /* JADX INFO: compiled from: TicketDetailViewModel.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void getFrom$annotations() {
        }
    }
}
