package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TicketDetailViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$fetchTicketDetail$1", f = "TicketDetailViewModel.kt", l = {R.styleable.AppCompatTheme_textColorSearchUrl}, m = "invokeSuspend")
public final class TicketDetailViewModel$fetchTicketDetail$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $ticketId;
    Object L$0;
    int label;
    final /* synthetic */ TicketDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketDetailViewModel$fetchTicketDetail$1(TicketDetailViewModel ticketDetailViewModel, String str, kotlin.coroutines.c<? super TicketDetailViewModel$fetchTicketDetail$1> cVar) {
        super(2, cVar);
        this.this$0 = ticketDetailViewModel;
        this.$ticketId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invokeSuspend$lambda$0(TicketDetailViewModel ticketDetailViewModel, String str) {
        ticketDetailViewModel.fetchTicketDetail$intercom_sdk_base_release(str);
        return p293xa.r.f47939a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TicketDetailViewModel$fetchTicketDetail$1(this.this$0, this.$ticketId, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.q qVar;
        Object error;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.q qVar2 = this.this$0._stateFlow;
            TicketRepository ticketRepository = this.this$0.repository;
            String str = this.$ticketId;
            this.L$0 = qVar2;
            this.label = 1;
            Object objFetchTicketDetail = ticketRepository.fetchTicketDetail(str, this);
            if (objFetchTicketDetail == coroutineSingletons) {
                return coroutineSingletons;
            }
            qVar = qVar2;
            obj = objFetchTicketDetail;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (kotlinx.coroutines.flow.q) this.L$0;
            kotlin.b.b(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            error = new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, new Integer(io.intercom.android.sdk.R.string.intercom_error_loading_ticket), 3, null));
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            Integer num = new Integer(io.intercom.android.sdk.R.string.intercom_error_loading_ticket);
            final TicketDetailViewModel ticketDetailViewModel = this.this$0;
            final String str2 = this.$ticketId;
            error = new TicketDetailState.Error(new ErrorState.WithCTA(0, 0, num, 0, new Ia.a() { // from class: io.intercom.android.sdk.tickets.n
                @Override // Ia.a
                public final Object invoke() {
                    return TicketDetailViewModel$fetchTicketDetail$1.invokeSuspend$lambda$0(ticketDetailViewModel, str2);
                }
            }, 11, null));
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Ticket ticket = (Ticket) ((NetworkResponse.Success) networkResponse).getBody();
            this.this$0.fireMetricIfNecessary(ticket);
            this.this$0.markAsReadIfNecessary(ticket);
            this.this$0.ticketId = ticket.getId();
            error = TicketDetailReducerKt.computeTicketViewState(ticket, this.this$0.user, this.this$0.getActiveAdminsAvatars(), this.this$0.launchedFrom);
        }
        qVar.setValue(error);
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TicketDetailViewModel$fetchTicketDetail$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
