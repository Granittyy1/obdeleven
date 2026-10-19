package com.voltasit.obdeleven.ui.activity;

import com.voltasit.obdeleven.domain.models.SubscriptionType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$getUserDetailsBonusDialog$1", f = "MainActivityViewModel.kt", l = {}, m = "invokeSuspend")
final class MainActivityViewModel$getUserDetailsBonusDialog$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $cpuId;
    final /* synthetic */ int $creditsFromDevice;
    final /* synthetic */ String $mac;
    final /* synthetic */ String $serial;
    final /* synthetic */ SubscriptionType $subscriptionBonusType;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$getUserDetailsBonusDialog$1(int i10, SubscriptionType subscriptionType, MainActivityViewModel mainActivityViewModel, String str, String str2, String str3, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$subscriptionBonusType = subscriptionType;
        this.this$0 = mainActivityViewModel;
        this.$cpuId = str;
        this.$mac = str2;
        this.$serial = str3;
        this.$creditsFromDevice = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$getUserDetailsBonusDialog$1(this.$creditsFromDevice, this.$subscriptionBonusType, this.this$0, this.$cpuId, this.$mac, this.$serial, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$getUserDetailsBonusDialog$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        SubscriptionType subscriptionType = this.$subscriptionBonusType;
        SubscriptionType subscriptionType2 = SubscriptionType.None;
        if (subscriptionType != subscriptionType2) {
            this.this$0.f(this.$cpuId, this.$mac, this.$serial, this.$creditsFromDevice, subscriptionType);
        } else {
            int i10 = this.$creditsFromDevice;
            if (i10 > 0) {
                this.this$0.f33634g0.j(new com.voltasit.obdeleven.presentation.dialogs.bonus.c(this.$cpuId, this.$mac, this.$serial, i10, false, subscriptionType2));
            } else {
                this.this$0.f33630c0.j(p293xa.r.f47939a);
            }
        }
        return p293xa.r.f47939a;
    }
}
