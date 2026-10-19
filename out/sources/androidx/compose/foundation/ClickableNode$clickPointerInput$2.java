package androidx.compose.foundation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {696}, m = "invokeSuspend")
final class ClickableNode$clickPointerInput$2 extends SuspendLambda implements Ia.q<androidx.compose.foundation.gestures.p, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> {
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0938j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableNode$clickPointerInput$2(C0938j c0938j, kotlin.coroutines.c<? super ClickableNode$clickPointerInput$2> cVar) {
        super(3, cVar);
        this.this$0 = c0938j;
    }

    @Override // Ia.q
    public final Object invoke(androidx.compose.foundation.gestures.p pVar, I.d dVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        long j = dVar.f3754a;
        ClickableNode$clickPointerInput$2 clickableNode$clickPointerInput$2 = new ClickableNode$clickPointerInput$2(this.this$0, cVar);
        clickableNode$clickPointerInput$2.L$0 = pVar;
        clickableNode$clickPointerInput$2.J$0 = j;
        return clickableNode$clickPointerInput$2.invokeSuspend(p293xa.r.f47939a);
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
            C0938j c0938j = this.this$0;
            if (c0938j.f9690v) {
                this.label = 1;
                androidx.compose.foundation.interaction.k kVar = c0938j.f9686r;
                if (kVar == null || (objD = kotlinx.coroutines.B.d(new AbstractClickableNode$handlePressInteraction$2$1(pVar, j, kVar, c0938j, null), this)) != obj2) {
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
