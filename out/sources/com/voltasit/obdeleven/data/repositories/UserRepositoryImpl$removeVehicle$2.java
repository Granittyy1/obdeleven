package com.voltasit.obdeleven.data.repositories;

import com.parse.ParseException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p255u9.z;

/* JADX INFO: compiled from: UserRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.UserRepositoryImpl$removeVehicle$2", f = "UserRepositoryImpl.kt", l = {}, m = "invokeSuspend")
final class UserRepositoryImpl$removeVehicle$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ z $user;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$removeVehicle$2(z zVar, kotlin.coroutines.c<? super UserRepositoryImpl$removeVehicle$2> cVar) {
        super(2, cVar);
        this.$user = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UserRepositoryImpl$removeVehicle$2(this.$user, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((UserRepositoryImpl$removeVehicle$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws ParseException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$user.save();
        return p293xa.r.f47939a;
    }
}
