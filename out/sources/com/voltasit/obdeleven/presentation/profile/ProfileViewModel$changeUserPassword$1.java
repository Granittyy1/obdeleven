package com.voltasit.obdeleven.presentation.profile;

import Ia.p;
import com.voltasit.obdeleven.domain.usecases.user.C2121b;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$changeUserPassword$1", f = "ProfileViewModel.kt", l = {193}, m = "invokeSuspend")
final class ProfileViewModel$changeUserPassword$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $password;
    int label;
    final /* synthetic */ ProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$changeUserPassword$1(ProfileViewModel profileViewModel, String str, kotlin.coroutines.c<? super ProfileViewModel$changeUserPassword$1> cVar) {
        super(2, cVar);
        this.this$0 = profileViewModel;
        this.$password = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ProfileViewModel$changeUserPassword$1(this.this$0, this.$password, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ProfileViewModel$changeUserPassword$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            C2121b c2121b = this.this$0.f32867p;
            String str = this.$password;
            this.label = 1;
            obj = c2121b.a(str, this);
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
            this.this$0.f32836I.j(r.f47939a);
        } else if (aVar instanceof C8.a.C0024a) {
            this.this$0.f32838K.j(r.f47939a);
            B7.b.h(E8.b.a(((C8.a.C0024a) aVar).f2462a), this.this$0.f32119h);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
