package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.lazy.LazyListState;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyMessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14$2$2$1", f = "LazyMessageList.kt", l = {266}, m = "invokeSuspend")
public final class LazyMessageListKt$LazyMessageList$14$2$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.V $firstVisibleItemIndex$delegate;
    final /* synthetic */ int $index;
    final /* synthetic */ androidx.compose.runtime.X<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$14$2$2$1(int i10, LazyListState lazyListState, androidx.compose.runtime.X<Boolean> x10, androidx.compose.runtime.V v10, kotlin.coroutines.c<? super LazyMessageListKt$LazyMessageList$14$2$2$1> cVar) {
        super(2, cVar);
        this.$index = i10;
        this.$lazyListState = lazyListState;
        this.$isListAtTheBottom$delegate = x10;
        this.$firstVisibleItemIndex$delegate = v10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyMessageListKt$LazyMessageList$14$2$2$1(this.$index, this.$lazyListState, this.$isListAtTheBottom$delegate, this.$firstVisibleItemIndex$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (LazyMessageListKt.LazyMessageList$lambda$17(this.$isListAtTheBottom$delegate) && this.$firstVisibleItemIndex$delegate.o() < this.$index) {
                LazyListState lazyListState = this.$lazyListState;
                this.label = 1;
                W.f fVar = LazyListState.f10350w;
                if (lazyListState.f(BrazeLogger.SUPPRESS, 0, this) == coroutineSingletons) {
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
        return ((LazyMessageListKt$LazyMessageList$14$2$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
