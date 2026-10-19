package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.G;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.Y;
import androidx.compose.ui.platform.Z;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.E;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {677}, m = "invokeSuspend")
final class TextFieldSelectionManager$cut$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$cut$1(TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.c<? super TextFieldSelectionManager$cut$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TextFieldSelectionManager$cut$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TextFieldSelectionManager$cut$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (E.b(this.this$0.l().f15492b)) {
                return p293xa.r.f47939a;
            }
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            Z z10 = textFieldSelectionManager.f11559h;
            if (z10 != null) {
                Y yA = p245u.a.a(C.o(textFieldSelectionManager.l()));
                this.label = 1;
                if (z10.a(yA) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C1260a c1260aQ = C.q(this.this$0.l(), this.this$0.l().f15491a.f15408c.length());
        C1260a c1260aP = C.p(this.this$0.l(), this.this$0.l().f15491a.f15408c.length());
        C1260a.b bVar = new C1260a.b(c1260aQ);
        bVar.b(c1260aP);
        C1260a c1260aI = bVar.i();
        int iE = E.e(this.this$0.l().f15492b);
        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
        long jB = O.h.b(iE, iE);
        textFieldSelectionManager2.getClass();
        this.this$0.f11554c.invoke(TextFieldSelectionManager.d(c1260aI, jB));
        this.this$0.p(HandleState.f11117b);
        G g10 = this.this$0.f11552a;
        if (g10 != null) {
            g10.f11107f = true;
        }
        return p293xa.r.f47939a;
    }
}
