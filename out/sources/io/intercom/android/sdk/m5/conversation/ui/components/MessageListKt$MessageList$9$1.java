package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$9$1", f = "MessageList.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMinor}, m = "invokeSuspend")
public final class MessageListKt$MessageList$9$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $autoScrollEnabled$delegate;
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $hasUserScrolled$delegate;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListKt$MessageList$9$1(ScrollState scrollState, androidx.compose.runtime.X<Boolean> x10, androidx.compose.runtime.X<Boolean> x11, kotlin.coroutines.c<? super MessageListKt$MessageList$9$1> cVar) {
        super(2, cVar);
        this.$scrollState = scrollState;
        this.$autoScrollEnabled$delegate = x10;
        this.$hasUserScrolled$delegate = x11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0(ScrollState scrollState) {
        return scrollState.f9824a.o();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MessageListKt$MessageList$9$1(this.$scrollState, this.$autoScrollEnabled$delegate, this.$hasUserScrolled$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final ScrollState scrollState = this.$scrollState;
            kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.U
                @Override // Ia.a
                public final Object invoke() {
                    return Integer.valueOf(MessageListKt$MessageList$9$1.invokeSuspend$lambda$0(scrollState));
                }
            });
            final ScrollState scrollState2 = this.$scrollState;
            final androidx.compose.runtime.X<Boolean> x10 = this.$autoScrollEnabled$delegate;
            final androidx.compose.runtime.X<Boolean> x11 = this.$hasUserScrolled$delegate;
            InterfaceC2687d interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$9$1.2
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                    return emit(((Number) obj2).intValue(), (kotlin.coroutines.c<? super p293xa.r>) cVar);
                }

                public final Object emit(int i11, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    MessageListKt.MessageList$lambda$17(x10, i11 == scrollState2.f9827d.o());
                    if (MessageListKt.MessageList$lambda$19(x11) && i11 == scrollState2.f9827d.o()) {
                        MessageListKt.MessageList$lambda$20(x11, false);
                    }
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (tVarJ.collect(interfaceC2687d, this) == coroutineSingletons) {
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
        return ((MessageListKt$MessageList$9$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
