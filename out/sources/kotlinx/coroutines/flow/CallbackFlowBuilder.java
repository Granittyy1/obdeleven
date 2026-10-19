package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CallbackFlowBuilder<T> extends C2685b<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SuspendLambda f43306f;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackFlowBuilder(Ia.p<? super kotlinx.coroutines.channels.n<? super T>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        super(pVar, eVar, i10, bufferOverflow);
        this.f43306f = (SuspendLambda) pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [Ia.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.internal.d
    public final Object g(kotlinx.coroutines.channels.n<? super T> nVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        if (cVar instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) cVar;
            int i10 = callbackFlowBuilder$collectTo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) cVar);
            }
        } else {
            callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) cVar);
        }
        Object obj = callbackFlowBuilder$collectTo$1.result;
        Object obj2 = CoroutineSingletons.f43038b;
        int i11 = callbackFlowBuilder$collectTo$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            callbackFlowBuilder$collectTo$1.L$0 = nVar;
            callbackFlowBuilder$collectTo$1.label = 1;
            Object objInvoke = this.f43369e.invoke(nVar, callbackFlowBuilder$collectTo$1);
            if (objInvoke != obj2) {
                objInvoke = p293xa.r.f47939a;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (kotlinx.coroutines.channels.n) callbackFlowBuilder$collectTo$1.L$0;
            kotlin.b.b(obj);
        }
        if (nVar.v()) {
            return p293xa.r.f47939a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ia.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlinx.coroutines.flow.internal.d
    public final kotlinx.coroutines.flow.internal.d<T> i(kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f43306f, eVar, i10, bufferOverflow);
    }
}
