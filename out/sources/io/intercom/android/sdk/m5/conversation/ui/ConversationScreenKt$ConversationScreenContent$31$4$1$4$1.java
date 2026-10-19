package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.lazy.LazyListState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ConversationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$4$1$4$1", f = "ConversationScreen.kt", l = {709, 712}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$31$4$1$4$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ p013b0.c $density;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Ia.p<Integer, Integer, p293xa.r> $onJumpToBottomButtonClicked;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$31$4$1$4$1(ConversationUiState conversationUiState, LazyListState lazyListState, p013b0.c cVar, Ia.p<? super Integer, ? super Integer, p293xa.r> pVar, kotlin.coroutines.c<? super ConversationScreenKt$ConversationScreenContent$31$4$1$4$1> cVar2) {
        super(2, cVar2);
        this.$uiState = conversationUiState;
        this.$lazyListState = lazyListState;
        this.$density = cVar;
        this.$onJumpToBottomButtonClicked = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$4$1$4$1(this.$uiState, this.$lazyListState, this.$density, this.$onJumpToBottomButtonClicked, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Iterator<ContentRow> it = ((ConversationUiState.Content) this.$uiState).getContentRows().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (kotlin.text.m.I(it.next().getKey(), ConversationUiStateKt.NewMessagesRowKey, false)) {
                    break;
                }
                i11++;
            }
            int lastSeenItemIndex = ((FloatingIndicatorState.JumpToBottomIndicator) ((ConversationUiState.Content) this.$uiState).getFloatingIndicatorState()).getJumpToBottomButtonState().getLastSeenItemIndex();
            androidx.compose.foundation.lazy.g gVar = (androidx.compose.foundation.lazy.g) kotlin.collections.q.W(this.$lazyListState.j().f());
            int index = gVar != null ? gVar.getIndex() : 0;
            int iE1 = this.$density.e1(ConversationScreenKt.JumpToBottomNewMessagesTopOffset);
            if (i11 > lastSeenItemIndex) {
                this.label = 1;
                if (this.$lazyListState.f(i11, -iE1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                int iMax = Math.max(lastSeenItemIndex, index);
                this.label = 2;
                if (this.$lazyListState.f(iMax + 1, -iE1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        androidx.compose.foundation.lazy.g gVar2 = (androidx.compose.foundation.lazy.g) kotlin.collections.q.W(this.$lazyListState.j().f());
        this.$onJumpToBottomButtonClicked.invoke(new Integer(0), new Integer(gVar2 != null ? gVar2.getIndex() : 0));
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ConversationScreenKt$ConversationScreenContent$31$4$1$4$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
