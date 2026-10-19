package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: PreviewBottomBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$2$2", f = "PreviewBottomBar.kt", l = {131}, m = "invokeSuspend")
public final class PreviewBottomBarKt$ThumbnailList$2$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ int $currentPage;
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewBottomBarKt$ThumbnailList$2$2(LazyListState lazyListState, int i10, kotlin.coroutines.c<? super PreviewBottomBarKt$ThumbnailList$2$2> cVar) {
        super(2, cVar);
        this.$listState = lazyListState;
        this.$currentPage = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PreviewBottomBarKt$ThumbnailList$2$2(this.$listState, this.$currentPage, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            LazyListState lazyListState = this.$listState;
            int i11 = this.$currentPage;
            this.label = 1;
            W.f fVar = LazyListState.f10350w;
            if (lazyListState.f(i11, 0, this) == coroutineSingletons) {
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
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PreviewBottomBarKt$ThumbnailList$2$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
