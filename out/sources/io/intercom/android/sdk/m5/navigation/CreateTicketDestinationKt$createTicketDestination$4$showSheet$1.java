package io.intercom.android.sdk.m5.navigation;

import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: CreateTicketDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$showSheet$1", f = "CreateTicketDestination.kt", l = {}, m = "invokeSuspend")
public final class CreateTicketDestinationKt$createTicketDestination$4$showSheet$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.X<AnswerClickData> $answerClickedData;
    final /* synthetic */ AnswerClickData $data;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTicketDestinationKt$createTicketDestination$4$showSheet$1(androidx.compose.runtime.X<AnswerClickData> x10, AnswerClickData answerClickData, kotlin.coroutines.c<? super CreateTicketDestinationKt$createTicketDestination$4$showSheet$1> cVar) {
        super(2, cVar);
        this.$answerClickedData = x10;
        this.$data = answerClickData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CreateTicketDestinationKt$createTicketDestination$4$showSheet$1(this.$answerClickedData, this.$data, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$answerClickedData.setValue(this.$data);
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CreateTicketDestinationKt$createTicketDestination$4$showSheet$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
