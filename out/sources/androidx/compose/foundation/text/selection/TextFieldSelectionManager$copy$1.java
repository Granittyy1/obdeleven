package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.Y;
import androidx.compose.ui.platform.Z;
import androidx.compose.ui.text.E;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {623}, m = "invokeSuspend")
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z10, kotlin.coroutines.c<? super TextFieldSelectionManager$copy$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionManager;
        this.$cancelSelection = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TextFieldSelectionManager$copy$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Ia.l, kotlin.jvm.internal.Lambda] */
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
        if (!this.$cancelSelection) {
            return p293xa.r.f47939a;
        }
        int iD = E.d(this.this$0.l().f15492b);
        this.this$0.f11554c.invoke(TextFieldSelectionManager.d(this.this$0.l().f15491a, O.h.b(iD, iD)));
        this.this$0.p(HandleState.f11117b);
        return p293xa.r.f47939a;
    }
}
