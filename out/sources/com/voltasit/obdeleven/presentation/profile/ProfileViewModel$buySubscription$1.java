package com.voltasit.obdeleven.presentation.profile;

import G8.z;
import Ia.p;
import android.app.Activity;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.exceptions.RedirectException;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.usecases.C2113b;
import com.voltasit.obdeleven.domain.usecases.user.D;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$buySubscription$1", f = "ProfileViewModel.kt", l = {148, 150, 151}, m = "invokeSuspend")
final class ProfileViewModel$buySubscription$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ ProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$buySubscription$1(ProfileViewModel profileViewModel, Activity activity, kotlin.coroutines.c<? super ProfileViewModel$buySubscription$1> cVar) {
        super(2, cVar);
        this.this$0 = profileViewModel;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ProfileViewModel$buySubscription$1(this.this$0, this.$activity, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ProfileViewModel$buySubscription$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProfileViewModel profileViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else if (i10 == 2) {
                kotlin.b.b(obj);
                profileViewModel = this.this$0;
                this.label = 3;
                if (ProfileViewModel.b(profileViewModel, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f32113b.j(PreloaderState.c.f32642a);
        ProfileViewModel profileViewModel2 = this.this$0;
        C2113b c2113b = profileViewModel2.f32876y;
        Activity activity = this.$activity;
        z zVar = profileViewModel2.f32863j0;
        if (zVar == null) {
            kotlin.jvm.internal.i.m("selectedSubscriptionProduct");
            throw null;
        }
        p040d1.a aVarA = Z.a(profileViewModel2);
        this.label = 1;
        obj = c2113b.a(activity, zVar.f3572b, aVarA, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            D d10 = this.this$0.f32877z;
            this.label = 2;
            if (d10.a(false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileViewModel = this.this$0;
            this.label = 3;
            if (ProfileViewModel.b(profileViewModel, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (aVar instanceof C8.a.C0024a) {
            ProfileViewModel profileViewModel3 = this.this$0;
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            z zVar2 = profileViewModel3.f32863j0;
            if (zVar2 == null) {
                kotlin.jvm.internal.i.m("selectedSubscriptionProduct");
                throw null;
            }
            if (th instanceof RedirectException) {
                profileViewModel3.f32857d0.j(zVar2.f3572b);
            } else {
                boolean z10 = th instanceof PurchaseProvider.PurchaseException;
                U7.a<String> aVar2 = profileViewModel3.f32832E;
                if (z10) {
                    aVar2.j(profileViewModel3.f32866o.a((PurchaseProvider.PurchaseException) th));
                } else {
                    aVar2.j("");
                }
            }
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
