package androidx.compose.foundation.gestures;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {330}, m = "invokeSuspend")
public final class ScrollableNode$drag$2$1 extends SuspendLambda implements Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<Ia.l<? super f.b, p293xa.r>, kotlin.coroutines.c<? super p293xa.r>, Object> $forEachDelta;
    final /* synthetic */ ScrollingLogic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollableNode$drag$2$1(Ia.p<? super Ia.l<? super f.b, p293xa.r>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, ScrollingLogic scrollingLogic, kotlin.coroutines.c<? super ScrollableNode$drag$2$1> cVar) {
        super(2, cVar);
        this.$forEachDelta = pVar;
        this.$this_with = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, cVar);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // Ia.p
    public final Object invoke(o oVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ScrollableNode$drag$2$1) create(oVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final o oVar = (o) this.L$0;
            Ia.p<Ia.l<? super f.b, p293xa.r>, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$forEachDelta;
            final ScrollingLogic scrollingLogic = this.$this_with;
            Ia.l<f.b, p293xa.r> lVar = new Ia.l<f.b, p293xa.r>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$drag$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(f.b bVar) {
                    o oVar2 = oVar;
                    ScrollingLogic scrollingLogic2 = scrollingLogic;
                    long j = bVar.f10011a;
                    oVar2.b(1, scrollingLogic2.f9988d == Orientation.f9958c ? I.d.a(0.0f, 1, j) : I.d.a(0.0f, 2, j));
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
