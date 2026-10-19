package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.C1081d0;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", l = {}, m = "invokeSuspend")
final class LazyStaggeredGridState$scrollToItem$2 extends SuspendLambda implements Ia.p<androidx.compose.foundation.gestures.s, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ LazyStaggeredGridState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i10, int i11, kotlin.coroutines.c<? super LazyStaggeredGridState$scrollToItem$2> cVar) {
        super(2, cVar);
        this.this$0 = lazyStaggeredGridState;
        this.$index = i10;
        this.$scrollOffset = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LazyStaggeredGridState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, cVar);
    }

    @Override // Ia.p
    public final Object invoke(androidx.compose.foundation.gestures.s sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LazyStaggeredGridState$scrollToItem$2) create(sVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
        final int i10 = this.$index;
        int i11 = this.$scrollOffset;
        r rVar = lazyStaggeredGridState.f10791c;
        int iO = rVar.f10889c.o();
        int i12 = 0;
        C1081d0 c1081d0 = rVar.f10891e;
        boolean z10 = (iO == i10 && c1081d0.o() == i11) ? false : true;
        if (z10) {
            LazyLayoutItemAnimator<p> lazyLayoutItemAnimator = lazyStaggeredGridState.f10807t;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f10627b = null;
            lazyLayoutItemAnimator.f10628c = -1;
        }
        n nVar = (n) lazyStaggeredGridState.f10792d.getValue();
        n nVar2 = o.f10866a;
        if (nVar.f().isEmpty()) {
            eVar = null;
        } else {
            int index = ((e) kotlin.collections.q.O(nVar.f())).getIndex();
            if (i10 > ((e) kotlin.collections.q.V(nVar.f())).getIndex() || index > i10) {
                eVar = null;
            } else {
                List<p> listF = nVar.f();
                eVar = (e) kotlin.collections.q.Q(kotlin.collections.l.o(0, listF.size(), new Ia.l<e, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final Integer invoke(e eVar2) {
                        return Integer.valueOf(eVar2.getIndex() - i10);
                    }
                }, listF), nVar.f());
            }
        }
        if (eVar == null || !z10) {
            int[] iArr = (int[]) ((LazyStaggeredGridState$scrollPosition$1) rVar.f10887a).invoke(Integer.valueOf(i10), Integer.valueOf(rVar.f10888b.length));
            int length = iArr.length;
            int[] iArr2 = new int[length];
            while (i12 < length) {
                iArr2[i12] = i11;
                i12++;
            }
            rVar.f10888b = iArr;
            rVar.f10889c.m(r.a(iArr));
            rVar.f10890d = iArr2;
            c1081d0.m(r.b(iArr, iArr2));
            rVar.f10894h.e(i10);
            rVar.f10893g = null;
        } else {
            int iE = ((int) (nVar.f10865u == Orientation.f9957b ? eVar.e() & 4294967295L : eVar.e() >> 32)) + i11;
            int[] iArr3 = nVar.f10847b;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            while (i12 < length2) {
                iArr4[i12] = iArr3[i12] + iE;
                i12++;
            }
            rVar.f10890d = iArr4;
            c1081d0.m(r.b(rVar.f10888b, iArr4));
        }
        LayoutNode layoutNode = lazyStaggeredGridState.f10796h;
        if (layoutNode != null) {
            layoutNode.j();
        }
        return p293xa.r.f47939a;
    }
}
