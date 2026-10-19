package io.intercom.android.sdk.tickets.list.data;

import Aa.c;
import androidx.paging.PagingSource;
import androidx.paging.y;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TicketsPagingSource.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsPagingSource extends PagingSource<Long, Ticket> {
    public static final int PAGE_SIZE = 10;
    private final TicketRepository repository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: TicketsPagingSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.data.TicketsPagingSource$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: TicketsPagingSource.kt */
    @c(c = "io.intercom.android.sdk.tickets.list.data.TicketsPagingSource", f = "TicketsPagingSource.kt", l = {14}, m = "load")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TicketsPagingSource.this.load(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsPagingSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Long getRefreshKey(y<Long, Ticket> state) {
        i.e(state, "state");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.a<Long> aVar, kotlin.coroutines.c<? super PagingSource.b<Long, Ticket>> cVar) {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objFetchTickets = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(objFetchTickets);
            TicketRepository ticketRepository = this.repository;
            Long lA = aVar.a();
            long jLongValue = lA != null ? lA.longValue() : 1L;
            anonymousClass1.L$0 = aVar;
            anonymousClass1.label = 1;
            objFetchTickets = ticketRepository.fetchTickets(jLongValue, 10, anonymousClass1);
            if (objFetchTickets == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (PagingSource.a) anonymousClass1.L$0;
            b.b(objFetchTickets);
        }
        NetworkResponse networkResponse = (NetworkResponse) objFetchTickets;
        if (networkResponse instanceof NetworkResponse.Success) {
            NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
            List<Ticket> tickets = ((TicketsResponse) success.getBody()).getTickets();
            Long lA2 = aVar.a();
            return new PagingSource.b.C0195b(tickets, lA2 != null ? new Long(lA2.longValue() - 1) : null, ((TicketsResponse) success.getBody()).getNextPage());
        }
        if (networkResponse instanceof NetworkResponse.NetworkError) {
            return new PagingSource.b.a(((NetworkResponse.NetworkError) networkResponse).getError());
        }
        if (networkResponse instanceof NetworkResponse.ClientError) {
            return new PagingSource.b.a(((NetworkResponse.ClientError) networkResponse).getError());
        }
        if (!(networkResponse instanceof NetworkResponse.ServerError)) {
            throw new NoWhenBranchMatchedException();
        }
        return new PagingSource.b.a(new Error("Server error : code " + ((NetworkResponse.ServerError) networkResponse).getCode()));
    }

    public /* synthetic */ TicketsPagingSource(TicketRepository ticketRepository, int i10, e eVar) {
        this((i10 & 1) != 0 ? new TicketRepository(null, null, null, null, 15, null) : ticketRepository);
    }

    public TicketsPagingSource(TicketRepository repository) {
        i.e(repository, "repository");
        this.repository = repository;
    }
}
