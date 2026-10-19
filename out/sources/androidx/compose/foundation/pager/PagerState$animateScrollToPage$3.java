package androidx.compose.foundation.pager;

import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.animation.core.T;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {619}, m = "invokeSuspend")
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements Ia.p<androidx.compose.foundation.gestures.s, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC0906f<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$3(PagerState pagerState, int i10, float f10, InterfaceC0906f<Float> interfaceC0906f, kotlin.coroutines.c<? super PagerState$animateScrollToPage$3> cVar) {
        super(2, cVar);
        this.this$0 = pagerState;
        this.$targetPage = i10;
        this.$targetPageOffsetToSnappedPosition = f10;
        this.$animationSpec = interfaceC0906f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, cVar);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.foundation.gestures.s sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PagerState$animateScrollToPage$3) create(sVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c A[PHI: r1
      0x006c: PHI (r1v3 int) = (r1v2 int), (r1v4 int) binds: [B:26:0x0071, B:23:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i10;
        int i11;
        Object obj2 = CoroutineSingletons.f43038b;
        int i12 = this.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.gestures.s sVar = (androidx.compose.foundation.gestures.s) this.L$0;
            final PagerState pagerState = this.this$0;
            final q qVar = new q(sVar, pagerState);
            int i13 = this.$targetPage;
            float f10 = this.$targetPageOffsetToSnappedPosition;
            InterfaceC0906f<Float> interfaceC0906f = this.$animationSpec;
            Ia.p<androidx.compose.foundation.gestures.s, Integer, p293xa.r> pVar = new Ia.p<androidx.compose.foundation.gestures.s, Integer, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerState$animateScrollToPage$3.1
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(androidx.compose.foundation.gestures.s sVar2, Integer num) {
                    int iIntValue = num.intValue();
                    PagerState pagerState2 = pagerState;
                    pagerState2.f10946s.m(pagerState2.i(iIntValue));
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            float f11 = s.f11012a;
            pVar.invoke(qVar, new Integer(i13));
            boolean z10 = i13 > pagerState.f10933e;
            int iA = (qVar.a() - pagerState.f10933e) + 1;
            if (((z10 && i13 > qVar.a()) || (!z10 && i13 < pagerState.f10933e)) && Math.abs(i13 - pagerState.f10933e) >= 3) {
                if (z10) {
                    i11 = i13 - iA;
                    i10 = pagerState.f10933e;
                    if (i11 < i10) {
                        i11 = i10;
                    }
                } else {
                    int i14 = iA + i13;
                    i10 = pagerState.f10933e;
                    if (i14 > i10) {
                        i11 = i10;
                    } else {
                        i11 = i14;
                    }
                }
                qVar.d(i11, 0);
            }
            float fC = qVar.c(i13, 0) + f10;
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            Object objC = T.c(0.0f, fC, interfaceC0906f, new Ia.p<Float, Float, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(Float f12, Float f13) {
                    float fFloatValue = f12.floatValue();
                    f13.floatValue();
                    ref$FloatRef.element += qVar.f(fFloatValue - ref$FloatRef.element);
                    return p293xa.r.f47939a;
                }
            }, this, 4);
            if (objC != obj2) {
                objC = p293xa.r.f47939a;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
