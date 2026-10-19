package androidx.compose.foundation;

import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.Y0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {908, 912}, m = "invokeSuspend")
final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j, kotlin.coroutines.c<? super CombinedClickableNode$onClickKeyUpEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = combinedClickableNode;
        this.$keyCode = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jA;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                jA = this.J$1;
                j = this.J$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.this$0.f9691w.invoke();
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        Y0 y10 = (Y0) C1183d.a(this.this$0, CompositionLocalsKt.f14857s);
        y10.getClass();
        jA = y10.a();
        j = 40;
        this.J$0 = 40L;
        this.J$1 = jA;
        this.label = 1;
        if (kotlinx.coroutines.I.b(40L, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        CombinedClickableNode.a aVarB = this.this$0.f9744N.b(this.$keyCode);
        if (aVarB != null) {
            aVarB.f9746b = true;
        }
        this.label = 2;
        if (kotlinx.coroutines.I.b(jA - j, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.this$0.f9691w.invoke();
        return p293xa.r.f47939a;
    }
}
