package io.intercom.android.sdk.tickets.create.data;

import gc.a;
import gc.o;
import gc.s;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import kotlin.coroutines.c;
import okhttp3.y;
import p293xa.r;

/* JADX INFO: compiled from: TicketApi.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface TicketApi {
    @o("tickets/create")
    Object createTicket(@a y yVar, c<? super NetworkResponse<Ticket>> cVar);

    @o("tickets/{ticketId}")
    Object fetchTicketDetail(@s("ticketId") String str, @a y yVar, c<? super NetworkResponse<Ticket>> cVar);

    @o("tickets/ticket_form")
    Object fetchTicketType(@a y yVar, c<? super NetworkResponse<TicketTypeV2>> cVar);

    @o("tickets")
    Object fetchTickets(@a y yVar, c<? super NetworkResponse<TicketsResponse>> cVar);

    @o("tickets/{ticketId}/read")
    Object markAsRead(@s("ticketId") String str, @a y yVar, c<? super NetworkResponse<r>> cVar);
}
