package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.models.SubscriptionType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: NotifyAboutSubscriptionFunctionUsageUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.b f31024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.v f31025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.p f31026c;

    public v(K8.b bVar, K8.v vVar, J8.p pVar) {
        this.f31024a = bVar;
        this.f31025b = vVar;
        this.f31026c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SubscriptionType subscriptionType, ContinuationImpl continuationImpl) {
        NotifyAboutSubscriptionFunctionUsageUC$invoke$1 notifyAboutSubscriptionFunctionUsageUC$invoke$1;
        v vVar;
        p279w9.a aVar;
        if (continuationImpl instanceof NotifyAboutSubscriptionFunctionUsageUC$invoke$1) {
            notifyAboutSubscriptionFunctionUsageUC$invoke$1 = (NotifyAboutSubscriptionFunctionUsageUC$invoke$1) continuationImpl;
            int i10 = notifyAboutSubscriptionFunctionUsageUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                notifyAboutSubscriptionFunctionUsageUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                notifyAboutSubscriptionFunctionUsageUC$invoke$1 = new NotifyAboutSubscriptionFunctionUsageUC$invoke$1(this, continuationImpl);
            }
        } else {
            notifyAboutSubscriptionFunctionUsageUC$invoke$1 = new NotifyAboutSubscriptionFunctionUsageUC$invoke$1(this, continuationImpl);
        }
        Object objU = notifyAboutSubscriptionFunctionUsageUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = notifyAboutSubscriptionFunctionUsageUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objU);
            this.f31026c.f("NotifyAboutSubscriptionFunctionUsageUC", "NotifyAboutSubscriptionFunctionUsageUC(subscriptionType=" + subscriptionType + ")");
            p279w9.a aVar2 = new p279w9.a(B7.b.c("IS_SUBSCRIPTION_USAGE_NOTIFIED", subscriptionType.b()), 86400000L);
            Boolean bool = (Boolean) this.f31024a.c(aVar2, false);
            if (bool != null ? bool.booleanValue() : false) {
                return p293xa.r.f47939a;
            }
            notifyAboutSubscriptionFunctionUsageUC$invoke$1.L$0 = this;
            notifyAboutSubscriptionFunctionUsageUC$invoke$1.L$1 = aVar2;
            notifyAboutSubscriptionFunctionUsageUC$invoke$1.label = 1;
            objU = this.f31025b.u(subscriptionType, notifyAboutSubscriptionFunctionUsageUC$invoke$1);
            if (objU == coroutineSingletons) {
                return coroutineSingletons;
            }
            vVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p279w9.a) notifyAboutSubscriptionFunctionUsageUC$invoke$1.L$1;
            vVar = (v) notifyAboutSubscriptionFunctionUsageUC$invoke$1.L$0;
            kotlin.b.b(objU);
        }
        C8.a aVar3 = (C8.a) objU;
        if (aVar3 instanceof C8.a.b) {
            vVar.f31024a.j(aVar, Boolean.TRUE);
        } else if (aVar3 instanceof C8.a.C0024a) {
            vVar.f31026c.d(((C8.a.C0024a) aVar3).f2462a, false);
        }
        return p293xa.r.f47939a;
    }
}
