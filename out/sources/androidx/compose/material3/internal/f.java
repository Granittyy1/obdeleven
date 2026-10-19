package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Ia.a aVar, Ia.p pVar, ContinuationImpl continuationImpl) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        if (continuationImpl instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuationImpl;
            int i10 = anchoredDraggableKt$restartable$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.label = i10 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
            }
        } else {
            anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
        }
        Object obj = anchoredDraggableKt$restartable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anchoredDraggableKt$restartable$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(aVar, pVar, null);
                anchoredDraggableKt$restartable$1.label = 1;
                if (kotlinx.coroutines.B.d(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return p293xa.r.f47939a;
    }

    public static final Object b(i iVar, Object obj, float f10, SuspendLambda suspendLambda) throws Throwable {
        Object objB = iVar.b(obj, MutatePriority.f9810b, new AnchoredDraggableKt$animateTo$2(iVar, f10, null), suspendLambda);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    public static final androidx.compose.ui.h c(androidx.compose.ui.h hVar, i iVar, Ia.p pVar) {
        Orientation orientation = Orientation.f9957b;
        return hVar.i(new DraggableAnchorsElement(iVar, pVar));
    }
}
