package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.N0;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyMessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$10$1", f = "LazyMessageList.kt", l = {128}, m = "invokeSuspend")
public final class LazyMessageListKt$LazyMessageList$10$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ N0<KeyboardState> $keyboardAsState$delegate;
    final /* synthetic */ androidx.compose.runtime.U $keyboardScrollOffset$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$10$1(LazyListState lazyListState, N0<KeyboardState> n10, androidx.compose.runtime.X<Boolean> x10, androidx.compose.runtime.U u10, kotlin.coroutines.c<? super LazyMessageListKt$LazyMessageList$10$1> cVar) {
        super(2, cVar);
        this.$lazyListState = lazyListState;
        this.$keyboardAsState$delegate = n10;
        this.$isListAtTheBottom$delegate = x10;
        this.$keyboardScrollOffset$delegate = u10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyMessageListKt$LazyMessageList$10$1(this.$lazyListState, this.$keyboardAsState$delegate, this.$isListAtTheBottom$delegate, this.$keyboardScrollOffset$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (LazyMessageListKt.LazyMessageList$lambda$8(this.$keyboardAsState$delegate).isDismissed() && !LazyMessageListKt.LazyMessageList$lambda$17(this.$isListAtTheBottom$delegate) && this.$keyboardScrollOffset$delegate.j() > 0.0f) {
                LazyListState lazyListState = this.$lazyListState;
                float f10 = -this.$keyboardScrollOffset$delegate.j();
                this.label = 1;
                if (androidx.compose.foundation.gestures.r.a(lazyListState, f10, C0907g.c(0.0f, 0.0f, null, 7), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
        return ((LazyMessageListKt$LazyMessageList$10$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
