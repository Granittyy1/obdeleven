package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0909i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LazyLayoutScrollDeltaBetweenPasses.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
public final class LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ LazyLayoutScrollDeltaBetweenPasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2(LazyLayoutScrollDeltaBetweenPasses lazyLayoutScrollDeltaBetweenPasses, kotlin.coroutines.c<? super LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2> cVar) {
        super(2, cVar);
        this.this$0 = lazyLayoutScrollDeltaBetweenPasses;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C0908h<Float, C0909i> c0908h = this.this$0.f10646a;
            Float f10 = new Float(0.0f);
            androidx.compose.animation.core.P pC = C0907g.c(0.0f, 400.0f, new Float(0.5f), 1);
            this.label = 1;
            if (androidx.compose.animation.core.T.f(c0908h, f10, pC, true, null, this, 8) == coroutineSingletons) {
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
}
