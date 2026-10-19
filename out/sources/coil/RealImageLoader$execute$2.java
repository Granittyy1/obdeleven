package coil;

import Ia.p;
import coil.request.h;
import coil.util.k;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N;
import kotlinx.coroutines.internal.q;
import p293xa.r;

/* JADX INFO: compiled from: RealImageLoader.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {138}, m = "invokeSuspend")
final class RealImageLoader$execute$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super h>, Object> {
    final /* synthetic */ coil.request.g $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RealImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2(RealImageLoader realImageLoader, coil.request.g gVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$request = gVar;
        this.this$0 = realImageLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.this$0, this.$request, cVar);
        realImageLoader$execute$2.L$0 = obj;
        return realImageLoader$execute$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super h> cVar) {
        return ((RealImageLoader$execute$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            A a10 = (A) this.L$0;
            Sa.b bVar = N.f43198a;
            G gA = C2680e.a(a10, q.f43500a.d1(), new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2);
            k.c(((p004a3.c) this.$request.f23048c).a()).a(gA);
            this.label = 1;
            obj = gA.D(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
