package kotlinx.coroutines;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class I {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(ContinuationImpl continuationImpl) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        if (continuationImpl instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuationImpl;
            int i10 = delayKt$awaitCancellation$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label = i10 - Integer.MIN_VALUE;
            } else {
                delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuationImpl);
            }
        } else {
            delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuationImpl);
        }
        Object obj = delayKt$awaitCancellation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = delayKt$awaitCancellation$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            delayKt$awaitCancellation$1.label = 1;
            C2693i c2693i = new C2693i(1, A8.p.y(delayKt$awaitCancellation$1));
            c2693i.s();
            if (c2693i.p() == coroutineSingletons) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final Object b(long j, kotlin.coroutines.c<? super p293xa.r> cVar) {
        if (j <= 0) {
            return p293xa.r.f47939a;
        }
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        if (j < Long.MAX_VALUE) {
            c(c2693i.f43448f).N(j, c2693i);
        }
        Object objP = c2693i.p();
        return objP == CoroutineSingletons.f43038b ? objP : p293xa.r.f47939a;
    }

    public static final H c(kotlin.coroutines.e eVar) {
        kotlin.coroutines.e.a aVar = eVar.get(kotlin.coroutines.d.a.f43035b);
        H h8 = aVar instanceof H ? (H) aVar : null;
        return h8 == null ? E.f43173a : h8;
    }
}
