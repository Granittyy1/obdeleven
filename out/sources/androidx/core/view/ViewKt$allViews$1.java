package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements Ia.p<kotlin.sequences.i<? super View>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, kotlin.coroutines.c<? super ViewKt$allViews$1> cVar) {
        super(2, cVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, cVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlin.sequences.i<? super View> iVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ViewKt$allViews$1) create(iVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            kotlin.sequences.i iVar = (kotlin.sequences.i) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = iVar;
            this.label = 1;
            iVar.a(view, this);
            return coroutineSingletons;
        }
        if (i10 == 1) {
            kotlin.sequences.i iVar2 = (kotlin.sequences.i) this.L$0;
            kotlin.b.b(obj);
            View view2 = this.$this_allViews;
            if (view2 instanceof ViewGroup) {
                this.L$0 = null;
                this.label = 2;
                iVar2.getClass();
                Object objB = iVar2.b(new H(new V((ViewGroup) view2), ViewGroupKt$descendants$1$1.f16881h), this);
                if (objB != coroutineSingletons) {
                    objB = p293xa.r.f47939a;
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
