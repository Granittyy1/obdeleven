package io.intercom.android.sdk.tickets.list.data;

import I7.b;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketsResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsResponse {
    public static final int $stable = 8;

    @b("next_page")
    private final Long nextPage;

    @b("tickets")
    private final List<Ticket> tickets;

    public TicketsResponse(List<Ticket> tickets, Long l10) {
        i.e(tickets, "tickets");
        this.tickets = tickets;
        this.nextPage = l10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketsResponse copy$default(TicketsResponse ticketsResponse, List list, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ticketsResponse.tickets;
        }
        if ((i10 & 2) != 0) {
            l10 = ticketsResponse.nextPage;
        }
        return ticketsResponse.copy(list, l10);
    }

    public final List<Ticket> component1() {
        return this.tickets;
    }

    public final Long component2() {
        return this.nextPage;
    }

    public final TicketsResponse copy(List<Ticket> tickets, Long l10) {
        i.e(tickets, "tickets");
        return new TicketsResponse(tickets, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketsResponse)) {
            return false;
        }
        TicketsResponse ticketsResponse = (TicketsResponse) obj;
        return i.a(this.tickets, ticketsResponse.tickets) && i.a(this.nextPage, ticketsResponse.nextPage);
    }

    public final Long getNextPage() {
        return this.nextPage;
    }

    public final List<Ticket> getTickets() {
        return this.tickets;
    }

    public int hashCode() {
        int iHashCode = this.tickets.hashCode() * 31;
        Long l10 = this.nextPage;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "TicketsResponse(tickets=" + this.tickets + ", nextPage=" + this.nextPage + ')';
    }
}
