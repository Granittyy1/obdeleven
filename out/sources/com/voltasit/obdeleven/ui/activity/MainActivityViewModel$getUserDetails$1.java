package com.voltasit.obdeleven.ui.activity;

import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.usecases.user.C2120a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$getUserDetails$1", f = "MainActivityViewModel.kt", l = {452}, m = "invokeSuspend")
final class MainActivityViewModel$getUserDetails$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $cpuId;
    final /* synthetic */ int $creditsFromDevice;
    final /* synthetic */ String $mac;
    final /* synthetic */ String $serial;
    final /* synthetic */ SubscriptionType $subscriptionType;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$getUserDetails$1(int i10, SubscriptionType subscriptionType, MainActivityViewModel mainActivityViewModel, String str, String str2, String str3, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
        this.$subscriptionType = subscriptionType;
        this.$creditsFromDevice = i10;
        this.$cpuId = str;
        this.$mac = str2;
        this.$serial = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MainActivityViewModel mainActivityViewModel = this.this$0;
        return new MainActivityViewModel$getUserDetails$1(this.$creditsFromDevice, this.$subscriptionType, mainActivityViewModel, this.$cpuId, this.$mac, this.$serial, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$getUserDetails$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C2120a c2120a = this.this$0.f33576A;
            SubscriptionType subscriptionType = this.$subscriptionType;
            this.label = 1;
            obj = c2120a.a(subscriptionType, this);
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
        if (!(aVar instanceof C8.a.b)) {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f33632e0.j(new com.voltasit.obdeleven.presentation.dialogs.bonus.c(this.$cpuId, this.$mac, this.$serial, this.$creditsFromDevice, false, this.$subscriptionType));
            return p293xa.r.f47939a;
        }
        boolean zBooleanValue = ((Boolean) ((C8.a.b) aVar).f2463a).booleanValue();
        if (zBooleanValue || this.$creditsFromDevice != 0) {
            this.this$0.f33634g0.j(new com.voltasit.obdeleven.presentation.dialogs.bonus.c(this.$cpuId, this.$mac, this.$serial, this.$creditsFromDevice, zBooleanValue, this.$subscriptionType));
            return p293xa.r.f47939a;
        }
        U7.a<p293xa.r> aVar2 = this.this$0.f33630c0;
        p293xa.r rVar = p293xa.r.f47939a;
        aVar2.j(rVar);
        return rVar;
    }
}
