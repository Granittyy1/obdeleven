package com.voltasit.obdeleven.presentation.profile;

import Ia.p;
import com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileFragment$setupObservables$4", f = "ProfileFragment.kt", l = {}, m = "invokeSuspend")
final class ProfileFragment$setupObservables$4 extends SuspendLambda implements p<String, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ ProfileFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileFragment$setupObservables$4(ProfileFragment profileFragment, kotlin.coroutines.c<? super ProfileFragment$setupObservables$4> cVar) {
        super(2, cVar);
        this.this$0 = profileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ProfileFragment$setupObservables$4(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(String str, kotlin.coroutines.c<? super r> cVar) {
        return ((ProfileFragment$setupObservables$4) create(str, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.this$0.r().n(new EditPersonalInfoWizardFragment(), null);
        return r.f47939a;
    }
}
