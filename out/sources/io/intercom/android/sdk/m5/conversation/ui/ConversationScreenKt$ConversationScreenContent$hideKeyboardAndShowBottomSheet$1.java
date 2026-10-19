package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.runtime.N0;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ConversationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1", f = "ConversationScreen.kt", l = {410}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ N0<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $openBottomSheet;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(androidx.compose.runtime.X<Boolean> x10, N0<KeyboardState> n10, kotlin.coroutines.c<? super ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1> cVar) {
        super(2, cVar);
        this.$openBottomSheet = x10;
        this.$keyboardAsState$delegate = n10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(this.$openBottomSheet, this.$keyboardAsState$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (ConversationScreenKt.ConversationScreenContent$lambda$72(this.$keyboardAsState$delegate).isVisible()) {
                this.label = 1;
                if (kotlinx.coroutines.I.b(200L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$openBottomSheet.setValue(Boolean.TRUE);
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
