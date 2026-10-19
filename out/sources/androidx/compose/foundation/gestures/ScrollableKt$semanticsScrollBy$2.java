package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.T;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1024}, m = "invokeSuspend")
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements Ia.p<o, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j, Ref$FloatRef ref$FloatRef, kotlin.coroutines.c<? super ScrollableKt$semanticsScrollBy$2> cVar) {
        super(2, cVar);
        this.$this_semanticsScrollBy = scrollingLogic;
        this.$offset = j;
        this.$previousValue = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, cVar);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // Ia.p
    public final Object invoke(o oVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ScrollableKt$semanticsScrollBy$2) create(oVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final o oVar = (o) this.L$0;
            float fG = this.$this_semanticsScrollBy.g(this.$offset);
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            final ScrollingLogic scrollingLogic = this.$this_semanticsScrollBy;
            Ia.p<Float, Float, p293xa.r> pVar = new Ia.p<Float, Float, p293xa.r>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(Float f10, Float f11) {
                    float fFloatValue = f10.floatValue();
                    f11.floatValue();
                    float f12 = fFloatValue - ref$FloatRef.element;
                    ScrollingLogic scrollingLogic2 = scrollingLogic;
                    ref$FloatRef.element += scrollingLogic2.d(scrollingLogic2.g(oVar.a(scrollingLogic2.h(scrollingLogic2.d(f12)))));
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (T.c(0.0f, fG, null, pVar, this, 12) == coroutineSingletons) {
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
