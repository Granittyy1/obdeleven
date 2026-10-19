package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.pager.PagerState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: PreviewRootScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$1$5$1", f = "PreviewRootScreen.kt", l = {136}, m = "invokeSuspend")
public final class PreviewRootScreenKt$PreviewRootScreen$2$1$5$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ int $it;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(PagerState pagerState, int i10, kotlin.coroutines.c<? super PreviewRootScreenKt$PreviewRootScreen$2$1$5$1> cVar) {
        super(2, cVar);
        this.$pagerState = pagerState;
        this.$it = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(this.$pagerState, this.$it, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            PagerState pagerState = this.$pagerState;
            int i11 = this.$it;
            this.label = 1;
            if (pagerState.f(i11, 0.0f, C0907g.c(0.0f, 0.0f, null, 7), this) == coroutineSingletons) {
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
        return ((PreviewRootScreenKt$PreviewRootScreen$2$1$5$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
