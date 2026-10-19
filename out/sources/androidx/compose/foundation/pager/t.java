package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2;
import androidx.compose.foundation.gestures.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t implements androidx.compose.foundation.gestures.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f11016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PagerState f11017b;

    public t(x xVar, PagerState pagerState) {
        this.f11016a = xVar;
        this.f11017b = pagerState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.j
    public final Object a(final ScrollingLogic$doFlingAnimation$2.a aVar, float f10, kotlin.coroutines.c cVar) {
        PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        t tVar;
        if (cVar instanceof PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (PagerWrapperFlingBehavior$performFling$1) cVar;
            int i10 = pagerWrapperFlingBehavior$performFling$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pagerWrapperFlingBehavior$performFling$1.label = i10 - Integer.MIN_VALUE;
            } else {
                pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, (ContinuationImpl) cVar);
            }
        } else {
            pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, (ContinuationImpl) cVar);
        }
        Object objB = pagerWrapperFlingBehavior$performFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = pagerWrapperFlingBehavior$performFling$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            Ia.l<Float, p293xa.r> lVar = new Ia.l<Float, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Float f11) {
                    int iJ = this.this$0.f11017b.j() + Ka.a.b(this.this$0.f11017b.o() != 0 ? f11.floatValue() / this.this$0.f11017b.o() : 0.0f);
                    PagerState pagerState = this.this$0.f11017b;
                    pagerState.f10946s.m(pagerState.i(iJ));
                    return p293xa.r.f47939a;
                }
            };
            pagerWrapperFlingBehavior$performFling$1.L$0 = this;
            pagerWrapperFlingBehavior$performFling$1.label = 1;
            objB = this.f11016a.b(aVar, f10, lVar, pagerWrapperFlingBehavior$performFling$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            tVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (t) pagerWrapperFlingBehavior$performFling$1.L$0;
            kotlin.b.b(objB);
        }
        float fFloatValue = ((Number) objB).floatValue();
        float fK = tVar.f11017b.k();
        PagerState pagerState = tVar.f11017b;
        if (fK != 0.0f && Math.abs(pagerState.k()) < 0.001d) {
            int iJ = pagerState.j();
            if (pagerState.f10938k.a()) {
                C2680e.c(((m) pagerState.f10943p.getValue()).f11002t, null, null, new PagerState$requestScrollToPage$1(pagerState, null), 3);
            }
            pagerState.u(0.0f, iJ, false);
        } else {
            pagerState.k();
        }
        return new Float(fFloatValue);
    }
}
