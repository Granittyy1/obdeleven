package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {R.styleable.AppCompatTheme_textColorSearchUrl}, m = "invokeSuspend")
final class CachedPagingDataKt$cachedIn$5 extends SuspendLambda implements Ia.q<InterfaceC2687d<? super PagingData<Object>>, Throwable, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC1425a $tracker;
    int label;

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super PagingData<Object>> interfaceC2687d, Throwable th, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return new CachedPagingDataKt$cachedIn$5(3, cVar).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return p293xa.r.f47939a;
    }
}
