package com.voltasit.obdeleven.data.repositories;

import com.parse.ParseUser;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: UserRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.UserRepositoryImpl$loginWithFacebook$4", f = "UserRepositoryImpl.kt", l = {}, m = "invokeSuspend")
final class UserRepositoryImpl$loginWithFacebook$4 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super ParseUser>, Object> {
    final /* synthetic */ A9.e $facebookLoginResponse;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$loginWithFacebook$4(A9.e eVar, kotlin.coroutines.c<? super UserRepositoryImpl$loginWithFacebook$4> cVar) {
        super(2, cVar);
        this.$facebookLoginResponse = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UserRepositoryImpl$loginWithFacebook$4(this.$facebookLoginResponse, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super ParseUser> cVar) {
        return ((UserRepositoryImpl$loginWithFacebook$4) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return ParseUser.become(this.$facebookLoginResponse.f1001b.f48494E);
    }
}
