package io.intercom.android.sdk.tickets.list.ui;

import Ia.p;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: TicketsScreenViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class TicketsScreenViewModel$pagerFlow$1$1 extends AdaptedFunctionReference implements p<Ticket, kotlin.coroutines.c<? super TicketRowData>, Object> {
    public static final TicketsScreenViewModel$pagerFlow$1$1 INSTANCE = new TicketsScreenViewModel$pagerFlow$1$1();

    public TicketsScreenViewModel$pagerFlow$1$1() {
        super(2, TicketRowReducerKt.class, "reduceTicketRowData", "reduceTicketRowData(Lio/intercom/android/sdk/models/Ticket;)Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", 5);
    }

    @Override // Ia.p
    public final Object invoke(Ticket ticket, kotlin.coroutines.c<? super TicketRowData> cVar) {
        return TicketsScreenViewModel.pagerFlow$lambda$1$reduceTicketRowData(ticket, cVar);
    }
}
