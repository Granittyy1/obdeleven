package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", l = {R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu}, m = "invokeSuspend")
final class CachedPagingDataKt$cachedIn$4 extends SuspendLambda implements Ia.p<InterfaceC2687d<? super PagingData<Object>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC1425a $tracker;
    int label;

    public CachedPagingDataKt$cachedIn$4() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CachedPagingDataKt$cachedIn$4(2, cVar);
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<? super PagingData<Object>> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CachedPagingDataKt$cachedIn$4) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
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
