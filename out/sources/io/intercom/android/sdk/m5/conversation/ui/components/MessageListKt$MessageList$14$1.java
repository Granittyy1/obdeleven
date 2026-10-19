package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ScrollState;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: MessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$14$1", f = "MessageList.kt", l = {427}, m = "invokeSuspend")
public final class MessageListKt$MessageList$14$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListKt$MessageList$14$1(ScrollState scrollState, kotlin.coroutines.c<? super MessageListKt$MessageList$14$1> cVar) {
        super(2, cVar);
        this.$scrollState = scrollState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MessageListKt$MessageList$14$1(this.$scrollState, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            ScrollState scrollState = this.$scrollState;
            this.label = 1;
            if (scrollState.f(BrazeLogger.SUPPRESS, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MessageListKt$MessageList$14$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
