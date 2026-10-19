package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SfdLockCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.core.app.SfdLockCommand$lock$1$output$1", f = "SfdLockCommand.kt", l = {25}, m = "invokeSuspend")
final class SfdLockCommand$lock$1$output$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends String>>, Object> {
    final /* synthetic */ ControlUnit $controlUnit;
    int label;
    final /* synthetic */ j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfdLockCommand$lock$1$output$1(j0 j0Var, ControlUnit controlUnit, kotlin.coroutines.c<? super SfdLockCommand$lock$1$output$1> cVar) {
        super(2, cVar);
        this.this$0 = j0Var;
        this.$controlUnit = controlUnit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SfdLockCommand$lock$1$output$1(this.this$0, this.$controlUnit, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends String>> cVar) {
        return ((SfdLockCommand$lock$1$output$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.sfd.f fVar = this.this$0.f30104k;
            short sShortValue = this.$controlUnit.n().shortValue();
            this.label = 1;
            obj = fVar.a(sShortValue, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
