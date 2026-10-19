package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.ScrollState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ConversationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$2$1$1", f = "ConversationScreen.kt", l = {593}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$31$2$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $message;
    final /* synthetic */ Ia.p<String, TextInputSource, p293xa.r> $onSendMessage;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ TextInputSource $textInputSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$31$2$1$1(ScrollState scrollState, Ia.p<? super String, ? super TextInputSource, p293xa.r> pVar, String str, TextInputSource textInputSource, kotlin.coroutines.c<? super ConversationScreenKt$ConversationScreenContent$31$2$1$1> cVar) {
        super(2, cVar);
        this.$scrollState = scrollState;
        this.$onSendMessage = pVar;
        this.$message = str;
        this.$textInputSource = textInputSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConversationScreenKt$ConversationScreenContent$31$2$1$1(this.$scrollState, this.$onSendMessage, this.$message, this.$textInputSource, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            ScrollState scrollState = this.$scrollState;
            this.label = 1;
            if (androidx.compose.foundation.gestures.r.b(scrollState, Float.MAX_VALUE, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$onSendMessage.invoke(this.$message, this.$textInputSource);
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ConversationScreenKt$ConversationScreenContent$31$2$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
