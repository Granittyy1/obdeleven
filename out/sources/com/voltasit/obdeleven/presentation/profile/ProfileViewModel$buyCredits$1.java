package com.voltasit.obdeleven.presentation.profile;

import G8.C0706h;
import Ia.p;
import android.app.Activity;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.exceptions.RedirectException;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.usecases.C2113b;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$buyCredits$1", f = "ProfileViewModel.kt", l = {272}, m = "invokeSuspend")
final class ProfileViewModel$buyCredits$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ C0706h $product;
    int label;
    final /* synthetic */ ProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$buyCredits$1(ProfileViewModel profileViewModel, Activity activity, C0706h c0706h, kotlin.coroutines.c<? super ProfileViewModel$buyCredits$1> cVar) {
        super(2, cVar);
        this.this$0 = profileViewModel;
        this.$activity = activity;
        this.$product = c0706h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ProfileViewModel$buyCredits$1(this.this$0, this.$activity, this.$product, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ProfileViewModel$buyCredits$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            ProfileViewModel profileViewModel = this.this$0;
            C2113b c2113b = profileViewModel.f32876y;
            Activity activity = this.$activity;
            String str = this.$product.f3501d;
            p040d1.a aVarA = Z.a(profileViewModel);
            this.label = 1;
            obj = c2113b.a(activity, str, aVarA, this);
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
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        if (aVar instanceof C8.a.b) {
            if (((Boolean) ((C8.a.b) aVar).f2463a).booleanValue()) {
                ProfileViewModel profileViewModel2 = this.this$0;
                profileViewModel2.f32830C.f();
                profileViewModel2.f32831D.a();
            }
        } else if (aVar instanceof C8.a.C0024a) {
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            if (th instanceof RedirectException) {
                this.this$0.f32859f0.j(this.$product.f3502e);
            } else {
                ProfileViewModel profileViewModel3 = this.this$0;
                profileViewModel3.getClass();
                boolean z10 = th instanceof PurchaseProvider.PurchaseException;
                U7.a<ProfileViewModel.c> aVar2 = profileViewModel3.f32861h0;
                if (z10) {
                    aVar2.j(new ProfileViewModel.c.a(profileViewModel3.f32866o.a((PurchaseProvider.PurchaseException) th)));
                } else {
                    aVar2.j(ProfileViewModel.c.b.f32885a);
                }
            }
        }
        return r.f47939a;
    }
}
