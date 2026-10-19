package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.MulticastedPagingData$asPagingData$1", f = "CachedPagingData.kt", l = {R.styleable.AppCompatTheme_colorBackgroundFloating}, m = "invokeSuspend")
final class MulticastedPagingData$asPagingData$1 extends SuspendLambda implements Ia.p<InterfaceC2687d<? super PageEvent<Object>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ o<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastedPagingData$asPagingData$1(o<Object> oVar, kotlin.coroutines.c<? super MulticastedPagingData$asPagingData$1> cVar) {
        super(2, cVar);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MulticastedPagingData$asPagingData$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<? super PageEvent<Object>> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MulticastedPagingData$asPagingData$1) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.getClass();
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
