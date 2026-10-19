package com.voltasit.obdeleven.presentation.profile;

import Ia.p;
import K8.v;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$clickUnlinkFacebook$1", f = "ProfileViewModel.kt", l = {216}, m = "invokeSuspend")
final class ProfileViewModel$clickUnlinkFacebook$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Ia.l<Throwable, r> $failure;
    final /* synthetic */ Ia.a<r> $success;
    int label;
    final /* synthetic */ ProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileViewModel$clickUnlinkFacebook$1(ProfileViewModel profileViewModel, Ia.a<r> aVar, Ia.l<? super Throwable, r> lVar, kotlin.coroutines.c<? super ProfileViewModel$clickUnlinkFacebook$1> cVar) {
        super(2, cVar);
        this.this$0 = profileViewModel;
        this.$success = aVar;
        this.$failure = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ProfileViewModel$clickUnlinkFacebook$1(this.this$0, this.$success, this.$failure, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ProfileViewModel$clickUnlinkFacebook$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.user.A a10 = this.this$0.f32872u;
            this.label = 1;
            v vVar = a10.f30961a;
            String objectId = vVar.L().getObjectId();
            kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
            obj = vVar.J(objectId, this);
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
