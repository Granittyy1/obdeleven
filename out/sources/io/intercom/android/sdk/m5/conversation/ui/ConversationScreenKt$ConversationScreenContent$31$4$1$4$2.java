package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.InterfaceC0950j;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ConversationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$4$1$4$2", f = "ConversationScreen.kt", l = {722, 727}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$31$4$1$4$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ p013b0.c $density;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ InterfaceC0950j $this_BoxWithConstraints;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreenContent$31$4$1$4$2(ConversationUiState conversationUiState, ScrollState scrollState, InterfaceC0950j interfaceC0950j, p013b0.c cVar, kotlin.coroutines.c<? super ConversationScreenKt$ConversationScreenContent$31$4$1$4$2> cVar2) {
        super(2, cVar2);
        this.$uiState = conversationUiState;
        this.$scrollState = scrollState;
        this.$this_BoxWithConstraints = interfaceC0950j;
        this.$density = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$4$1$4$2(this.$uiState, this.$scrollState, this.$this_BoxWithConstraints, this.$density, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            int scrollToPosition = ((FloatingIndicatorState.JumpToBottomIndicator) ((ConversationUiState.Content) this.$uiState).getFloatingIndicatorState()).getJumpToBottomButtonState().getScrollToPosition();
            ScrollState scrollState = this.$scrollState;
            InterfaceC0950j interfaceC0950j = this.$this_BoxWithConstraints;
            p013b0.c cVar = this.$density;
            if (scrollToPosition == -1) {
                int iO = scrollState.f9827d.o();
                this.label = 1;
                obj = scrollState.f(iO, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ((Number) obj).floatValue();
            } else {
                int iE1 = cVar.e1((interfaceC0950j.i() - MessageComposerKt.getComposerHalfSize()) - ConversationScreenKt.JumpToBottomNewMessagesTopOffset) + scrollToPosition;
                this.label = 2;
                obj = scrollState.f(iE1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ((Number) obj).floatValue();
            }
        } else if (i10 == 1) {
            kotlin.b.b(obj);
            ((Number) obj).floatValue();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            ((Number) obj).floatValue();
        }
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ConversationScreenKt$ConversationScreenContent$31$4$1$4$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
