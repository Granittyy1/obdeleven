package androidx.compose.material3;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {538}, m = "invokeSuspend")
final class FloatingActionButtonElevation$animateElevation$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ K $animatable;
    int label;
    final /* synthetic */ J this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$1$1(K k10, J j, kotlin.coroutines.c<? super FloatingActionButtonElevation$animateElevation$1$1> cVar) {
        super(2, cVar);
        this.$animatable = k10;
        this.this$0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FloatingActionButtonElevation$animateElevation$1$1(this.$animatable, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((FloatingActionButtonElevation$animateElevation$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            K k10 = this.$animatable;
            J j = this.this$0;
            float f10 = j.f12191a;
            this.label = 1;
            k10.f12195a = f10;
            k10.f12196b = j.f12192b;
            k10.f12197c = j.f12194d;
            k10.f12198d = j.f12193c;
            Object objB = k10.b(this);
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
