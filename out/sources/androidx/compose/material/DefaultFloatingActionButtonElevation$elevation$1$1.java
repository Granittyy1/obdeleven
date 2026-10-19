package androidx.compose.material;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", l = {272}, m = "invokeSuspend")
final class DefaultFloatingActionButtonElevation$elevation$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ D $animatable;
    int label;
    final /* synthetic */ C1039o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFloatingActionButtonElevation$elevation$1$1(D d10, C1039o c1039o, kotlin.coroutines.c<? super DefaultFloatingActionButtonElevation$elevation$1$1> cVar) {
        super(2, cVar);
        this.$animatable = d10;
        this.this$0 = c1039o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DefaultFloatingActionButtonElevation$elevation$1$1(this.$animatable, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            D d10 = this.$animatable;
            C1039o c1039o = this.this$0;
            float f10 = c1039o.f11921a;
            this.label = 1;
            d10.f11717a = f10;
            d10.f11718b = c1039o.f11922b;
            d10.f11719c = c1039o.f11923c;
            d10.f11720d = c1039o.f11924d;
            Object objB = d10.b(this);
            if (objB != coroutineSingletons) {
                objB = p293xa.r.f47939a;
            }
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
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
