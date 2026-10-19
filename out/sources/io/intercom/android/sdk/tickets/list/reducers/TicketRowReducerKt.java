package io.intercom.android.sdk.tickets.list.reducers;

import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import kotlin.collections.k;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketRowReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketRowReducerKt {
    public static final TicketRowData reduceTicketRowData(Ticket ticket) {
        i.e(ticket, "ticket");
        String publicId = ticket.getPublicId();
        String strU = q.U(k.O(new String[]{publicId != null ? "#".concat(publicId) : null, ticket.getCurrentStatus().getTitle()}), " • ", null, null, null, 62);
        TicketStatus ticketStatus = TicketDetailReducerKt.toTicketStatus(ticket.getCurrentStatus());
        String id = ticket.getId();
        String title = ticket.getTitle();
        Boolean boolIsRead = ticket.isRead();
        return new TicketRowData(id, title, strU, ticketStatus, boolIsRead != null ? boolIsRead.booleanValue() : true);
    }
}
