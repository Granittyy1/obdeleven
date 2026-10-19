package coil;

import Ia.p;
import coil.request.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ImageLoaders.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.ImageLoaders$executeBlocking$1", f = "ImageLoaders.kt", l = {26}, m = "invokeSuspend")
public final class ImageLoaders$executeBlocking$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super h>, Object> {
    final /* synthetic */ coil.request.g $request;
    final /* synthetic */ f $this_executeBlocking;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaders$executeBlocking$1(f fVar, coil.request.g gVar, kotlin.coroutines.c<? super ImageLoaders$executeBlocking$1> cVar) {
        super(2, cVar);
        this.$this_executeBlocking = fVar;
        this.$request = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageLoaders$executeBlocking$1(this.$this_executeBlocking, this.$request, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super h> cVar) {
        return ((ImageLoaders$executeBlocking$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            f fVar = this.$this_executeBlocking;
            coil.request.g gVar = this.$request;
            this.label = 1;
            obj = fVar.c(gVar, this);
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
