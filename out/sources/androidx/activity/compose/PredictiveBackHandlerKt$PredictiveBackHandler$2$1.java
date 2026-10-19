package androidx.activity.compose;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
public final class PredictiveBackHandlerKt$PredictiveBackHandler$2$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ g $backCallBack;
    final /* synthetic */ boolean $enabled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$2$1(g gVar, boolean z10, kotlin.coroutines.c<? super PredictiveBackHandlerKt$PredictiveBackHandler$2$1> cVar) {
        super(2, cVar);
        this.$backCallBack = gVar;
        this.$enabled = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(this.$backCallBack, this.$enabled, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((PredictiveBackHandlerKt$PredictiveBackHandler$2$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [Ia.a, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        g gVar = this.$backCallBack;
        boolean z10 = this.$enabled;
        if (!z10 && !gVar.f8223g && gVar.f8270a && (fVar = gVar.f8222f) != null) {
            fVar.a();
        }
        gVar.f8270a = z10;
        ?? r10 = gVar.f8272c;
        if (r10 != 0) {
            r10.invoke();
        }
        return r.f47939a;
    }
}
