package kotlinx.coroutines.channels;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(n nVar, Ia.a aVar, ContinuationImpl continuationImpl) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (continuationImpl instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuationImpl;
            int i10 = produceKt$awaitClose$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.label = i10 - Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuationImpl);
            }
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuationImpl);
        }
        Object obj = produceKt$awaitClose$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = produceKt$awaitClose$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                if (produceKt$awaitClose$1.getContext().get(InterfaceC2694i0.b.f43449b) != nVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                produceKt$awaitClose$1.L$0 = nVar;
                produceKt$awaitClose$1.L$1 = aVar;
                produceKt$awaitClose$1.label = 1;
                C2693i c2693i = new C2693i(1, A8.p.y(produceKt$awaitClose$1));
                c2693i.s();
                nVar.u(new ProduceKt$awaitClose$4$1(c2693i));
                if (c2693i.p() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (Ia.a) produceKt$awaitClose$1.L$1;
                kotlin.b.b(obj);
            }
            aVar.invoke();
            return p293xa.r.f47939a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
    }

    public static m b(A a10, int i10, Ia.p pVar, int i11) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f43032b;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        BufferOverflow bufferOverflow = BufferOverflow.f43243b;
        CoroutineStart coroutineStart = CoroutineStart.f43166b;
        m mVar = new m(CoroutineContextKt.c(a10, emptyCoroutineContext), g.a(i10, 4, bufferOverflow), true, true);
        mVar.v0(coroutineStart, mVar, pVar);
        return mVar;
    }
}
