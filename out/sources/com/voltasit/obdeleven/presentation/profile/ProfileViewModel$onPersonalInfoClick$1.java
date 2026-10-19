package com.voltasit.obdeleven.presentation.profile;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$onPersonalInfoClick$1", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend")
final class ProfileViewModel$onPersonalInfoClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $hash;
    int label;
    final /* synthetic */ ProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$onPersonalInfoClick$1(ProfileViewModel profileViewModel, String str, kotlin.coroutines.c<? super ProfileViewModel$onPersonalInfoClick$1> cVar) {
        super(2, cVar);
        this.this$0 = profileViewModel;
        this.$hash = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ProfileViewModel$onPersonalInfoClick$1(this.this$0, this.$hash, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ProfileViewModel$onPersonalInfoClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.this$0.f32874w.f("ProfileViewModel", "onPersonalInfoClick()");
        this.this$0.f32847T.f(this.$hash);
        return r.f47939a;
    }
}
