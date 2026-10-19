package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements Ia.q<InterfaceC2687d<Object>, Object[], kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.q<Object, Object, kotlin.coroutines.c<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(Ia.q<Object, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, kotlin.coroutines.c<? super FlowKt__ZipKt$combine$1$1> cVar) {
        super(3, cVar);
        this.$transform = qVar;
    }

    @Override // Ia.q
    public final Object invoke(InterfaceC2687d<Object> interfaceC2687d, Object[] objArr, kotlin.coroutines.c<? super p293xa.r> cVar) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, cVar);
        flowKt__ZipKt$combine$1$1.L$0 = interfaceC2687d;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2687d interfaceC2687d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2687d = (InterfaceC2687d) this.L$0;
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
        Object[] objArr = (Object[]) this.L$1;
        Ia.q<Object, Object, kotlin.coroutines.c<Object>, Object> qVar = this.$transform;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        this.L$0 = interfaceC2687d;
        this.label = 1;
        obj = qVar.invoke(obj2, obj3, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.L$0 = null;
        this.label = 2;
        if (interfaceC2687d.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
