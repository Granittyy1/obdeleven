package com.voltasit.obdeleven.presentation.profile;

import Ia.p;
import com.voltasit.obdeleven.domain.date.FacebookTokenExpirationDateParseFormat;
import com.voltasit.obdeleven.domain.usecases.user.q;
import java.util.Date;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$onFacebookAuthSuccess$1", f = "ProfileViewModel.kt", l = {236}, m = "invokeSuspend")
final class ProfileViewModel$onFacebookAuthSuccess$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ Date $expirationDate;
    final /* synthetic */ Ia.l<Throwable, r> $failure;
    final /* synthetic */ Ia.a<r> $success;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ ProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileViewModel$onFacebookAuthSuccess$1(ProfileViewModel profileViewModel, String str, String str2, Date date, Ia.a<r> aVar, Ia.l<? super Throwable, r> lVar, kotlin.coroutines.c<? super ProfileViewModel$onFacebookAuthSuccess$1> cVar) {
        super(2, cVar);
        this.this$0 = profileViewModel;
        this.$userId = str;
        this.$accessToken = str2;
        this.$expirationDate = date;
        this.$success = aVar;
        this.$failure = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ProfileViewModel$onFacebookAuthSuccess$1(this.this$0, this.$userId, this.$accessToken, this.$expirationDate, this.$success, this.$failure, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ProfileViewModel$onFacebookAuthSuccess$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0.f32871t;
            String str = this.$userId;
            String str2 = this.$accessToken;
            Date date = this.$expirationDate;
            this.label = 1;
            String objectId = qVar.f31004a.L().getObjectId();
            kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
            String str3 = FacebookTokenExpirationDateParseFormat.f30400b.format(date);
            kotlin.jvm.internal.i.d(str3, "format(...)");
            obj = qVar.f31004a.D(objectId, str, str2, str3, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            this.$success.invoke();
        } else if (aVar instanceof C8.a.C0024a) {
            this.$failure.invoke(((C8.a.C0024a) aVar).f2462a);
        }
        return r.f47939a;
    }
}
