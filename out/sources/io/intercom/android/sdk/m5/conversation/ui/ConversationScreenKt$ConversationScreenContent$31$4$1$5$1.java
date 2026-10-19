package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.lazy.LazyListState;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ConversationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$4$1$5$1", f = "ConversationScreen.kt", l = {766}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$31$4$1$5$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreenContent$31$4$1$5$1(LazyListState lazyListState, kotlin.coroutines.c<? super ConversationScreenKt$ConversationScreenContent$31$4$1$5$1> cVar) {
        super(2, cVar);
        this.$lazyListState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$4$1$5$1(this.$lazyListState, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            LazyListState lazyListState = this.$lazyListState;
            this.label = 1;
            W.f fVar = LazyListState.f10350w;
            if (lazyListState.f(BrazeLogger.SUPPRESS, 0, this) == coroutineSingletons) {
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
        return ((ConversationScreenKt$ConversationScreenContent$31$4$1$5$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
