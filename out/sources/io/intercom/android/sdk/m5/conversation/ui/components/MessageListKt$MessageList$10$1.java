package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ScrollState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: MessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1", f = "MessageList.kt", l = {140}, m = "invokeSuspend")
public final class MessageListKt$MessageList$10$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $hasUserScrolled$delegate;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListKt$MessageList$10$1(ScrollState scrollState, androidx.compose.runtime.X<Boolean> x10, kotlin.coroutines.c<? super MessageListKt$MessageList$10$1> cVar) {
        super(2, cVar);
        this.$scrollState = scrollState;
        this.$hasUserScrolled$delegate = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MessageListKt$MessageList$10$1(this.$scrollState, this.$hasUserScrolled$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        final ScrollState scrollState = this.$scrollState;
        kotlinx.coroutines.flow.v vVar = scrollState.f9826c.f10073a;
        final androidx.compose.runtime.X<Boolean> x10 = this.$hasUserScrolled$delegate;
        InterfaceC2687d interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1.1
            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                return emit((androidx.compose.foundation.interaction.i) obj2, (kotlin.coroutines.c<? super p293xa.r>) cVar);
            }

            public final Object emit(androidx.compose.foundation.interaction.i iVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
                if (iVar instanceof androidx.compose.foundation.interaction.b) {
                    MessageListKt.MessageList$lambda$20(x10, true);
                } else if ((iVar instanceof androidx.compose.foundation.interaction.c) && MessageListKt.isAtBottom(scrollState)) {
                    MessageListKt.MessageList$lambda$20(x10, false);
                }
                return p293xa.r.f47939a;
            }
        };
        this.label = 1;
        vVar.collect(interfaceC2687d, this);
        return coroutineSingletons;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MessageListKt$MessageList$10$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
