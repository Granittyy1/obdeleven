package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "invokeSuspend")
final class MouseWheelScrollingLogic$userScroll$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    final /* synthetic */ ScrollingLogic $this_userScroll;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$userScroll$2(Ia.p pVar, ScrollingLogic scrollingLogic, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_userScroll = scrollingLogic;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MouseWheelScrollingLogic$userScroll$2(this.$block, this.$this_userScroll, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MouseWheelScrollingLogic$userScroll$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            ScrollingLogic scrollingLogic = this.$this_userScroll;
            MutatePriority mutatePriority = MutatePriority.f9811c;
            Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$block;
            this.label = 1;
            if (scrollingLogic.f(mutatePriority, pVar, this) == coroutineSingletons) {
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
