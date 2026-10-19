package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: MessageComposer.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$6$1", f = "MessageComposer.kt", l = {}, m = "invokeSuspend")
public final class MessageComposerKt$MessageComposer$6$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $shouldRequestFocus$delegate;
    final /* synthetic */ FocusRequester $textInputFocus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComposerKt$MessageComposer$6$1(FocusRequester focusRequester, androidx.compose.runtime.X<Boolean> x10, kotlin.coroutines.c<? super MessageComposerKt$MessageComposer$6$1> cVar) {
        super(2, cVar);
        this.$textInputFocus = focusRequester;
        this.$shouldRequestFocus$delegate = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MessageComposerKt$MessageComposer$6$1(this.$textInputFocus, this.$shouldRequestFocus$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        if (MessageComposerKt.MessageComposer$lambda$13(this.$shouldRequestFocus$delegate)) {
            this.$textInputFocus.b(7);
            MessageComposerKt.MessageComposer$lambda$14(this.$shouldRequestFocus$delegate, false);
        }
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MessageComposerKt$MessageComposer$6$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
