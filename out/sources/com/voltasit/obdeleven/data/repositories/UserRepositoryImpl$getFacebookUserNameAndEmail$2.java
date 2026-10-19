package com.voltasit.obdeleven.data.repositories;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: UserRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.UserRepositoryImpl$getFacebookUserNameAndEmail$2", f = "UserRepositoryImpl.kt", l = {}, m = "invokeSuspend")
final class UserRepositoryImpl$getFacebookUserNameAndEmail$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super Z3.x>, Object> {
    final /* synthetic */ Z3.r $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$getFacebookUserNameAndEmail$2(Z3.r rVar, kotlin.coroutines.c<? super UserRepositoryImpl$getFacebookUserNameAndEmail$2> cVar) {
        super(2, cVar);
        this.$request = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UserRepositoryImpl$getFacebookUserNameAndEmail$2(this.$request, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super Z3.x> cVar) {
        return ((UserRepositoryImpl$getFacebookUserNameAndEmail$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return this.$request.c();
    }
}
