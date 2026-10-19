package io.intercom.android.sdk.tickets.create.model;

import Ia.l;
import Ia.p;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: CreateTicketViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1", f = "CreateTicketViewModel.kt", l = {160, 167}, m = "invokeSuspend")
public final class CreateTicketViewModel$createTicket$1$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ A $compositionAwareScope;
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTicketViewModel$createTicket$1$1(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, A a10, kotlin.coroutines.c<? super CreateTicketViewModel$createTicket$1$1> cVar) {
        super(2, cVar);
        this.$content = content;
        this.this$0 = createTicketViewModel;
        this.$compositionAwareScope = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invokeSuspend$lambda$5(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, null, null, true, false, 11, null));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invokeSuspend$lambda$6(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, null, null, false, false, 11, null));
        return r.f47939a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CreateTicketViewModel$createTicket$1$1(this.$content, this.this$0, this.$compositionAwareScope, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        Iterator<T> it = this.$content.getQuestions().iterator();
        while (it.hasNext()) {
            ((QuestionState) it.next()).validate();
        }
        List<QuestionState> questions = this.$content.getQuestions();
        if (!(questions instanceof Collection) || !questions.isEmpty()) {
            Iterator<T> it2 = questions.iterator();
            while (it2.hasNext()) {
                if (!(((QuestionState) it2.next()).getValidationError() instanceof ValidationError.NoValidationError)) {
                    for (QuestionState questionState : this.$content.getQuestions()) {
                        if (!(questionState.getValidationError() instanceof ValidationError.NoValidationError)) {
                            A a10 = this.$compositionAwareScope;
                            if (a10 != null) {
                                questionState.bringIntoView(a10);
                            }
                            return r.f47939a;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        final CreateTicketViewModel createTicketViewModel = this.this$0;
        createTicketViewModel.withState(new l() { // from class: io.intercom.android.sdk.tickets.create.model.f
            @Override // Ia.l
            public final Object invoke(Object obj2) {
                return CreateTicketViewModel$createTicket$1$1.invokeSuspend$lambda$5(createTicketViewModel, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj2);
            }
        });
        TicketRepository ticketRepository = this.this$0.ticketRepository;
        String str = this.this$0.conversationId;
        int i11 = this.this$0.ticketTypeId;
        List<TicketAttributeRequest> attributeRequest = this.this$0.getAttributeRequest();
        this.label = 1;
        obj = ticketRepository.createTicket(str, i11, attributeRequest, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((NetworkResponse) obj) instanceof NetworkResponse.Success) {
            kotlinx.coroutines.flow.p pVar = this.this$0._effect;
            CreateTicketViewModel.TicketSideEffect.Finish finish = CreateTicketViewModel.TicketSideEffect.Finish.INSTANCE;
            this.label = 2;
            if (pVar.emit(finish, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            final CreateTicketViewModel createTicketViewModel2 = this.this$0;
            createTicketViewModel2.withState(new l() { // from class: io.intercom.android.sdk.tickets.create.model.g
                @Override // Ia.l
                public final Object invoke(Object obj2) {
                    return CreateTicketViewModel$createTicket$1$1.invokeSuspend$lambda$6(createTicketViewModel2, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj2);
                }
            });
        }
        return r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((CreateTicketViewModel$createTicket$1$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
