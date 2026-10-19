package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", l = {R.styleable.AppCompatTheme_colorControlActivated}, m = "invokeSuspend")
final class MulticastedPagingData$asPagingData$2 extends SuspendLambda implements Ia.q<InterfaceC2687d<? super PageEvent<Object>>, Throwable, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ o<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastedPagingData$asPagingData$2(o<Object> oVar, kotlin.coroutines.c<? super MulticastedPagingData$asPagingData$2> cVar) {
        super(3, cVar);
        this.this$0 = oVar;
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super PageEvent<Object>> interfaceC2687d, Throwable th, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return new MulticastedPagingData$asPagingData$2(this.this$0, cVar).invokeSuspend(p293xa.r.f47939a);
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
