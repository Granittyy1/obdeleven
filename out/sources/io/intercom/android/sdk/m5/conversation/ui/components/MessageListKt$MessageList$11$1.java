package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.N0;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: MessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$11$1", f = "MessageList.kt", l = {162, 164, 170}, m = "invokeSuspend")
public final class MessageListKt$MessageList$11$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $autoScrollEnabled$delegate;
    final /* synthetic */ androidx.compose.runtime.X<MessageListCoordinates> $currentBounds$delegate;
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $hasUserScrolled$delegate;
    final /* synthetic */ N0<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ androidx.compose.runtime.X<MessageListCoordinates> $oldBounds$delegate;
    final /* synthetic */ ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListKt$MessageList$11$1(ScrollState scrollState, androidx.compose.runtime.X<MessageListCoordinates> x10, androidx.compose.runtime.X<MessageListCoordinates> x11, N0<KeyboardState> n10, androidx.compose.runtime.X<Boolean> x12, androidx.compose.runtime.X<Boolean> x13, kotlin.coroutines.c<? super MessageListKt$MessageList$11$1> cVar) {
        super(2, cVar);
        this.$scrollState = scrollState;
        this.$oldBounds$delegate = x10;
        this.$currentBounds$delegate = x11;
        this.$keyboardAsState$delegate = n10;
        this.$hasUserScrolled$delegate = x12;
        this.$autoScrollEnabled$delegate = x13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MessageListKt$MessageList$11$1(this.$scrollState, this.$oldBounds$delegate, this.$currentBounds$delegate, this.$keyboardAsState$delegate, this.$hasUserScrolled$delegate, this.$autoScrollEnabled$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (!MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).isZero() && !MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).isZero() && !kotlin.jvm.internal.i.a(MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).getBoundsInParent(), MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).getBoundsInParent())) {
                float f10 = MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).getBoundsInParent().f3760d - MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).getBoundsInParent().f3760d;
                if (f10 > 0.0f) {
                    ScrollState scrollState = this.$scrollState;
                    this.label = 1;
                    if (androidx.compose.foundation.gestures.r.b(scrollState, f10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (MessageListKt.MessageList$lambda$8(this.$keyboardAsState$delegate).isAnimating() && MessageListKt.MessageList$lambda$19(this.$hasUserScrolled$delegate)) {
                    ScrollState scrollState2 = this.$scrollState;
                    this.label = 2;
                    if (androidx.compose.foundation.gestures.r.b(scrollState2, f10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (!I.h.a(MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).m187getSizeNHjbRc(), MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).m187getSizeNHjbRc()) && MessageListKt.MessageList$lambda$16(this.$autoScrollEnabled$delegate) && !MessageListKt.MessageList$lambda$19(this.$hasUserScrolled$delegate)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate).m187getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat((int) (MessageListKt.MessageList$lambda$10(this.$oldBounds$delegate).m187getSizeNHjbRc() & 4294967295L));
                if (fIntBitsToFloat > 0.0f) {
                    ScrollState scrollState3 = this.$scrollState;
                    this.label = 3;
                    if (androidx.compose.foundation.gestures.r.b(scrollState3, fIntBitsToFloat, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else {
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$oldBounds$delegate.setValue(MessageListKt.MessageList$lambda$13(this.$currentBounds$delegate));
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MessageListKt$MessageList$11$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
