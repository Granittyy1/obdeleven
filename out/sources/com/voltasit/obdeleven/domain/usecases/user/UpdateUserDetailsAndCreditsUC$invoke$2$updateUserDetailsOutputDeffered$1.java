package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: UpdateUserDetailsAndCreditsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.UpdateUserDetailsAndCreditsUC$invoke$2$updateUserDetailsOutputDeffered$1", f = "UpdateUserDetailsAndCreditsUC.kt", l = {27}, m = "invokeSuspend")
public final class UpdateUserDetailsAndCreditsUC$invoke$2$updateUserDetailsOutputDeffered$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends p293xa.r>>, Object> {
    int label;
    final /* synthetic */ C this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserDetailsAndCreditsUC$invoke$2$updateUserDetailsOutputDeffered$1(C c10, kotlin.coroutines.c<? super UpdateUserDetailsAndCreditsUC$invoke$2$updateUserDetailsOutputDeffered$1> cVar) {
        super(2, cVar);
        this.this$0 = c10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UpdateUserDetailsAndCreditsUC$invoke$2$updateUserDetailsOutputDeffered$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends p293xa.r>> cVar) {
        return ((UpdateUserDetailsAndCreditsUC$invoke$2$updateUserDetailsOutputDeffered$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            K8.v vVar = this.this$0.f30964a;
            this.label = 1;
            obj = vVar.q(false, this);
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
