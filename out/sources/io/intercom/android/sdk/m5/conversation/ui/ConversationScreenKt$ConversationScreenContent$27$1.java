package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.ScrollState;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ConversationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$27$1", f = "ConversationScreen.kt", l = {}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$27$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $jumToBottomScrollOffset;
    final /* synthetic */ Ia.l<ConversationScrolledState, p293xa.r> $onConversationScrolled;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$27$1(ScrollState scrollState, float f10, Ia.l<? super ConversationScrolledState, p293xa.r> lVar, boolean z10, boolean z11, kotlin.coroutines.c<? super ConversationScreenKt$ConversationScreenContent$27$1> cVar) {
        super(2, cVar);
        this.$scrollState = scrollState;
        this.$jumToBottomScrollOffset = f10;
        this.$onConversationScrolled = lVar;
        this.$isLandscape = z10;
        this.$isLargeFont = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConversationScreenKt$ConversationScreenContent$27$1(this.$scrollState, this.$jumToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        if (this.$scrollState.f9827d.o() - this.$scrollState.f9824a.o() > this.$jumToBottomScrollOffset) {
            this.$onConversationScrolled.invoke(new ConversationScrolledState(true, this.$scrollState.f9827d.o(), this.$isLandscape, this.$isLargeFont, 0));
        } else {
            this.$onConversationScrolled.invoke(new ConversationScrolledState(false, this.$scrollState.f9827d.o(), this.$isLandscape, this.$isLargeFont, 0));
        }
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ConversationScreenKt$ConversationScreenContent$27$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
