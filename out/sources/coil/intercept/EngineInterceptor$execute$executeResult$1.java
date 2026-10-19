package coil.intercept;

import Ia.p;
import coil.fetch.g;
import coil.fetch.l;
import coil.request.k;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: EngineInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super b.a>, Object> {
    final /* synthetic */ Ref$ObjectRef<coil.a> $components;
    final /* synthetic */ coil.b $eventListener;
    final /* synthetic */ Ref$ObjectRef<g> $fetchResult;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ Ref$ObjectRef<k> $options;
    final /* synthetic */ coil.request.g $request;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(b bVar, Ref$ObjectRef<g> ref$ObjectRef, Ref$ObjectRef<coil.a> ref$ObjectRef2, coil.request.g gVar, Object obj, Ref$ObjectRef<k> ref$ObjectRef3, coil.b bVar2, kotlin.coroutines.c<? super EngineInterceptor$execute$executeResult$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$fetchResult = ref$ObjectRef;
        this.$components = ref$ObjectRef2;
        this.$request = gVar;
        this.$mappedData = obj;
        this.$options = ref$ObjectRef3;
        this.$eventListener = bVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super b.a> cVar) {
        return ((EngineInterceptor$execute$executeResult$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            l lVar = (l) this.$fetchResult.element;
            coil.a aVar = this.$components.element;
            coil.request.g gVar = this.$request;
            Object obj2 = this.$mappedData;
            k kVar = this.$options.element;
            coil.b bVar2 = this.$eventListener;
            this.label = 1;
            obj = b.b(bVar, lVar, aVar, gVar, obj2, kVar, bVar2, this);
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
