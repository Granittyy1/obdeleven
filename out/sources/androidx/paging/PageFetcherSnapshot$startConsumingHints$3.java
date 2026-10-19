package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", l = {646, 238}, m = "invokeSuspend")
final class PageFetcherSnapshot$startConsumingHints$3 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ r<Object, Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$3(r<Object, Object> rVar, kotlin.coroutines.c<? super PageFetcherSnapshot$startConsumingHints$3> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PageFetcherSnapshot$startConsumingHints$3(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PageFetcherSnapshot$startConsumingHints$3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r<Object, Object> rVar;
        t.a<Object, Object> aVar;
        kotlinx.coroutines.sync.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    rVar = (r) this.L$2;
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
            rVar = this.this$0;
            aVar = rVar.f19406k;
            MutexImpl mutexImpl = aVar.f19423a;
            this.L$0 = aVar;
            this.L$1 = mutexImpl;
            this.L$2 = rVar;
            this.label = 1;
            if (mutexImpl.f(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar2 = mutexImpl;
            t<Object, Object> tVar = aVar.f19424b;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(tVar, null), C2688e.f(tVar.j));
            aVar2.g(null);
            LoadType loadType = LoadType.f19254d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (r.a(rVar, flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, loadType, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            aVar2.g(null);
            throw th;
        }
    }
}
