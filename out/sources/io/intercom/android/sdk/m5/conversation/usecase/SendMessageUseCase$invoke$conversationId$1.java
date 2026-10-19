package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import Ia.p;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: SendMessageUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$conversationId$1", f = "SendMessageUseCase.kt", l = {}, m = "invokeSuspend")
public final class SendMessageUseCase$invoke$conversationId$1 extends SuspendLambda implements p<ConversationClientState, kotlin.coroutines.c<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public SendMessageUseCase$invoke$conversationId$1(kotlin.coroutines.c<? super SendMessageUseCase$invoke$conversationId$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SendMessageUseCase$invoke$conversationId$1 sendMessageUseCase$invoke$conversationId$1 = new SendMessageUseCase$invoke$conversationId$1(cVar);
        sendMessageUseCase$invoke$conversationId$1.L$0 = obj;
        return sendMessageUseCase$invoke$conversationId$1;
    }

    @Override // Ia.p
    public final Object invoke(ConversationClientState conversationClientState, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((SendMessageUseCase$invoke$conversationId$1) create(conversationClientState, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        return Boolean.valueOf(((ConversationClientState) this.L$0).getConversationId() != null);
    }
}
