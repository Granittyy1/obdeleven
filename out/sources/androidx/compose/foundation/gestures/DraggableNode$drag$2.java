package androidx.compose.foundation.gestures;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS}, m = "invokeSuspend")
public final class DraggableNode$drag$2 extends SuspendLambda implements Ia.p<h, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<Ia.l<? super f.b, p293xa.r>, kotlin.coroutines.c<? super p293xa.r>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableNode$drag$2(Ia.p<? super Ia.l<? super f.b, p293xa.r>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, DraggableNode draggableNode, kotlin.coroutines.c<? super DraggableNode$drag$2> cVar) {
        super(2, cVar);
        this.$forEachDelta = pVar;
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.$forEachDelta, this.this$0, cVar);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    @Override // Ia.p
    public final Object invoke(h hVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DraggableNode$drag$2) create(hVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final h hVar = (h) this.L$0;
            Ia.p<Ia.l<? super f.b, p293xa.r>, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$forEachDelta;
            final DraggableNode draggableNode = this.this$0;
            Ia.l<f.b, p293xa.r> lVar = new Ia.l<f.b, p293xa.r>() { // from class: androidx.compose.foundation.gestures.DraggableNode$drag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(f.b bVar) {
                    h hVar2 = hVar;
                    DraggableNode draggableNode2 = draggableNode;
                    long jH = I.d.h(draggableNode2.f9954E ? -1.0f : 1.0f, bVar.f10011a);
                    Orientation orientation = draggableNode.f9950A;
                    Ia.q<A, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> qVar = DraggableKt.f9948a;
                    hVar2.a(Float.intBitsToFloat((int) (orientation == Orientation.f9957b ? jH & 4294967295L : jH >> 32)));
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (pVar.invoke(lVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
