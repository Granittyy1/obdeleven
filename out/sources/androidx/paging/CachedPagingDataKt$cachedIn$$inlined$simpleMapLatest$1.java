package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {105}, m = "invokeSuspend")
public final class CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 extends SuspendLambda implements Ia.q<InterfaceC2687d<? super o<Object>>, PagingData<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ kotlinx.coroutines.A $scope$inlined;
    final /* synthetic */ InterfaceC1425a $tracker$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.$scope$inlined = a10;
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<? super o<Object>> interfaceC2687d, PagingData<Object> pagingData, kotlin.coroutines.c<? super p293xa.r> cVar) {
        CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 = new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(this.$scope$inlined, cVar);
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$0 = interfaceC2687d;
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$1 = pagingData;
        return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2687d interfaceC2687d = (InterfaceC2687d) this.L$0;
            o oVar = new o(this.$scope$inlined, (PagingData) this.L$1);
            this.label = 1;
            if (interfaceC2687d.emit(oVar, this) == coroutineSingletons) {
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
