package androidx.compose.foundation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", f = "Clickable.kt", l = {770}, m = "invokeSuspend")
public final class CombinedClickableNode$clickPointerInput$4 extends SuspendLambda implements Ia.q<androidx.compose.foundation.gestures.p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$clickPointerInput$4(CombinedClickableNode combinedClickableNode, kotlin.coroutines.c<? super CombinedClickableNode$clickPointerInput$4> cVar) {
        super(3, cVar);
        this.this$0 = combinedClickableNode;
    }

    @Override // Ia.q
    public final Object invoke(androidx.compose.foundation.gestures.p pVar, I.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        long j = dVar.f3754a;
        CombinedClickableNode$clickPointerInput$4 combinedClickableNode$clickPointerInput$4 = new CombinedClickableNode$clickPointerInput$4(this.this$0, cVar);
        combinedClickableNode$clickPointerInput$4.L$0 = pVar;
        combinedClickableNode$clickPointerInput$4.J$0 = j;
        return combinedClickableNode$clickPointerInput$4.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object obj2 = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.gestures.p pVar = (androidx.compose.foundation.gestures.p) this.L$0;
            long j = this.J$0;
            CombinedClickableNode combinedClickableNode = this.this$0;
            if (combinedClickableNode.f9690v) {
                this.label = 1;
                androidx.compose.foundation.interaction.k kVar = combinedClickableNode.f9686r;
                if (kVar == null || (objD = kotlinx.coroutines.B.d(new AbstractClickableNode$handlePressInteraction$2$1(pVar, j, kVar, combinedClickableNode, null), this)) != obj2) {
                    objD = p293xa.r.f47939a;
                }
                if (objD == obj2) {
                    return obj2;
                }
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
