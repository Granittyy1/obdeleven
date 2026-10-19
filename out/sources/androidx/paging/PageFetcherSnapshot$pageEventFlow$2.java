package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {646, 179}, m = "invokeSuspend")
final class PageFetcherSnapshot$pageEventFlow$2 extends SuspendLambda implements Ia.p<InterfaceC2687d<? super PageEvent<Object>>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ r<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$2(r<Object, Object> rVar, kotlin.coroutines.c<? super PageFetcherSnapshot$pageEventFlow$2> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new PageFetcherSnapshot$pageEventFlow$2(this.this$0, cVar);
        pageFetcherSnapshot$pageEventFlow$2.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$2;
    }

    @Override // Ia.p
    public final Object invoke(InterfaceC2687d<? super PageEvent<Object>> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcherSnapshot$pageEventFlow$2) create(interfaceC2687d, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2687d interfaceC2687d;
        t.a<Object, Object> aVar;
        kotlinx.coroutines.sync.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC2687d = (InterfaceC2687d) this.L$2;
                    aVar2 = (kotlinx.coroutines.sync.a) this.L$1;
                    aVar = (t.a) this.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            interfaceC2687d = (InterfaceC2687d) this.L$0;
            aVar = this.this$0.f19406k;
            MutexImpl mutexImpl = aVar.f19423a;
            this.L$0 = aVar;
            this.L$1 = mutexImpl;
            this.L$2 = interfaceC2687d;
            this.label = 1;
            if (mutexImpl.f(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar2 = mutexImpl;
            n nVarD = aVar.f19424b.f19422l.d();
            aVar2.g(null);
            PageEvent.b bVar = new PageEvent.b(nVarD, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (interfaceC2687d.emit(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            aVar2.g(null);
            throw th;
        }
    }
}
