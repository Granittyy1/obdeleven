package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: LazyMessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$11$1", f = "LazyMessageList.kt", l = {134}, m = "invokeSuspend")
public final class LazyMessageListKt$LazyMessageList$11$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.runtime.V $firstVisibleItemIndex$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$11$1(LazyListState lazyListState, androidx.compose.runtime.V v10, kotlin.coroutines.c<? super LazyMessageListKt$LazyMessageList$11$1> cVar) {
        super(2, cVar);
        this.$lazyListState = lazyListState;
        this.$firstVisibleItemIndex$delegate = v10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyMessageListKt$LazyMessageList$11$1(this.$lazyListState, this.$firstVisibleItemIndex$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final LazyListState lazyListState = this.$lazyListState;
            kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.E
                @Override // Ia.a
                public final Object invoke() {
                    return Integer.valueOf(lazyListState.h());
                }
            });
            final androidx.compose.runtime.V v10 = this.$firstVisibleItemIndex$delegate;
            InterfaceC2687d interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$11$1.2
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                    return emit(((Number) obj2).intValue(), (kotlin.coroutines.c<? super p293xa.r>) cVar);
                }

                public final Object emit(int i11, kotlin.coroutines.c<? super p293xa.r> cVar) {
                    v10.m(i11);
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
        return ((LazyMessageListKt$LazyMessageList$11$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
