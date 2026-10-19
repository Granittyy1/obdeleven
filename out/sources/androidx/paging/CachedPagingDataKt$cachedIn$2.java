package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "invokeSuspend")
final class CachedPagingDataKt$cachedIn$2 extends SuspendLambda implements Ia.q<o<Object>, o<Object>, kotlin.coroutines.c<? super o<Object>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // Ia.q
    public final Object invoke(o<Object> oVar, o<Object> oVar2, kotlin.coroutines.c<? super o<Object>> cVar) {
        CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2(3, cVar);
        cachedPagingDataKt$cachedIn$2.L$0 = oVar;
        cachedPagingDataKt$cachedIn$2.L$1 = oVar2;
        return cachedPagingDataKt$cachedIn$2.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o oVar = (o) this.L$0;
            kotlin.b.b(obj);
            return oVar;
        }
        kotlin.b.b(obj);
        o oVar2 = (o) this.L$0;
        o oVar3 = (o) this.L$1;
        this.L$0 = oVar3;
        this.label = 1;
        oVar2.f19381c.f19215d.i(null);
        return p293xa.r.f47939a == coroutineSingletons ? coroutineSingletons : oVar3;
    }
}
