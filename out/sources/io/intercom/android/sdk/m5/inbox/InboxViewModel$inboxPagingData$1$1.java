package io.intercom.android.sdk.m5.inbox;

import Aa.c;
import Ia.p;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: InboxViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$inboxPagingData$1$1", f = "InboxViewModel.kt", l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
public final class InboxViewModel$inboxPagingData$1$1 extends SuspendLambda implements p<EmptyState, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InboxViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxViewModel$inboxPagingData$1$1(InboxViewModel inboxViewModel, kotlin.coroutines.c<? super InboxViewModel$inboxPagingData$1$1> cVar) {
        super(2, cVar);
        this.this$0 = inboxViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        InboxViewModel$inboxPagingData$1$1 inboxViewModel$inboxPagingData$1$1 = new InboxViewModel$inboxPagingData$1$1(this.this$0, cVar);
        inboxViewModel$inboxPagingData$1$1.L$0 = obj;
        return inboxViewModel$inboxPagingData$1$1;
    }

    @Override // Ia.p
    public final Object invoke(EmptyState emptyState, kotlin.coroutines.c<? super r> cVar) {
        return ((InboxViewModel$inboxPagingData$1$1) create(emptyState, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EmptyState emptyStateCopy$default;
        InboxViewModel inboxViewModel;
        InboxViewModel inboxViewModel2;
        EmptyState emptyState;
        OpenMessengerResponse.NewConversationData newConversationData;
        OpenMessengerResponse.NewConversationData.Cta cta;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            emptyStateCopy$default = (EmptyState) this.L$0;
            inboxViewModel = this.this$0;
            if (!i.a(emptyStateCopy$default, EmptyState.Companion.getNULL())) {
                CommonRepository commonRepository = this.this$0.commonRepository;
                this.L$0 = emptyStateCopy$default;
                this.L$1 = inboxViewModel;
                this.label = 1;
                Object objOpenMessenger = commonRepository.openMessenger(this);
                if (objOpenMessenger == coroutineSingletons) {
                    return coroutineSingletons;
                }
                inboxViewModel2 = inboxViewModel;
                emptyState = emptyStateCopy$default;
                obj = objOpenMessenger;
            }
            inboxViewModel.emptyState = emptyStateCopy$default;
            return r.f47939a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        inboxViewModel2 = (InboxViewModel) this.L$1;
        EmptyState emptyState2 = (EmptyState) this.L$0;
        b.b(obj);
        emptyState = emptyState2;
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        String text = (openMessengerResponse == null || (newConversationData = openMessengerResponse.getNewConversationData()) == null || (cta = newConversationData.getCta()) == null) ? null : cta.getText();
        if (text != null) {
            emptyStateCopy$default = EmptyState.copy$default(emptyState, null, null, EmptyState.Action.copy$default(emptyState.getAction(), null, text, null, 5, null), 3, null);
            if (emptyStateCopy$default == null) {
                inboxViewModel = inboxViewModel2;
                emptyStateCopy$default = emptyState;
            } else {
                inboxViewModel = inboxViewModel2;
            }
        } else {
            inboxViewModel = inboxViewModel2;
            emptyStateCopy$default = emptyState;
        }
        inboxViewModel.emptyState = emptyStateCopy$default;
        return r.f47939a;
    }
}
