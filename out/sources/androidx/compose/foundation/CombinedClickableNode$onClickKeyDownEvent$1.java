package androidx.compose.foundation;

import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.Y0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", l = {852}, m = "invokeSuspend")
public final class CombinedClickableNode$onClickKeyDownEvent$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyDownEvent$1(CombinedClickableNode combinedClickableNode, kotlin.coroutines.c<? super CombinedClickableNode$onClickKeyDownEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = combinedClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CombinedClickableNode$onClickKeyDownEvent$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CombinedClickableNode$onClickKeyDownEvent$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            long jB = ((Y0) C1183d.a(this.this$0, CompositionLocalsKt.f14857s)).b();
            this.label = 1;
            if (kotlinx.coroutines.I.b(jB, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        Ia.a<p293xa.r> aVar = this.this$0.f9740J;
        if (aVar != null) {
            aVar.invoke();
        }
        return p293xa.r.f47939a;
    }
}
