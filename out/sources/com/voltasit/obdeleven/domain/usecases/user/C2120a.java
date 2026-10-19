package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.models.SubscriptionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.user.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CanUserConsumeDeviceSubscriptionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2120a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetUserDetailsUC f30977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.j f30978b;

    public C2120a(GetUserDetailsUC getUserDetailsUC, com.voltasit.obdeleven.domain.usecases.j jVar) {
        this.f30977a = getUserDetailsUC;
        this.f30978b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(SubscriptionType subscriptionType, ContinuationImpl continuationImpl) {
        CanUserConsumeDeviceSubscriptionUC$invoke$1 canUserConsumeDeviceSubscriptionUC$invoke$1;
        C2120a c2120a;
        if (continuationImpl instanceof CanUserConsumeDeviceSubscriptionUC$invoke$1) {
            canUserConsumeDeviceSubscriptionUC$invoke$1 = (CanUserConsumeDeviceSubscriptionUC$invoke$1) continuationImpl;
            int i10 = canUserConsumeDeviceSubscriptionUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                canUserConsumeDeviceSubscriptionUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                canUserConsumeDeviceSubscriptionUC$invoke$1 = new CanUserConsumeDeviceSubscriptionUC$invoke$1(this, continuationImpl);
            }
        } else {
            canUserConsumeDeviceSubscriptionUC$invoke$1 = new CanUserConsumeDeviceSubscriptionUC$invoke$1(this, continuationImpl);
        }
        Object objA = canUserConsumeDeviceSubscriptionUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = canUserConsumeDeviceSubscriptionUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            if (subscriptionType == SubscriptionType.None) {
                return new C8.a.b(Boolean.FALSE);
            }
            canUserConsumeDeviceSubscriptionUC$invoke$1.L$0 = this;
            canUserConsumeDeviceSubscriptionUC$invoke$1.L$1 = subscriptionType;
            canUserConsumeDeviceSubscriptionUC$invoke$1.label = 1;
            objA = this.f30977a.a(canUserConsumeDeviceSubscriptionUC$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2120a = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            subscriptionType = (SubscriptionType) canUserConsumeDeviceSubscriptionUC$invoke$1.L$1;
            c2120a = (C2120a) canUserConsumeDeviceSubscriptionUC$invoke$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        G8.D d10 = (G8.D) ((C8.a.b) aVar).f2463a;
        SubscriptionType subscriptionType2 = d10.f3410a;
        int iOrdinal = subscriptionType2.ordinal();
        if (iOrdinal == 0) {
            return new C8.a.b(Boolean.TRUE);
        }
        if (iOrdinal == 2) {
            return subscriptionType == SubscriptionType.Ultimate ? new C8.a.b(Boolean.TRUE) : new C8.a.b(Boolean.FALSE);
        }
        if (subscriptionType == SubscriptionType.Ultimate && subscriptionType2 == SubscriptionType.Pro) {
            return new C8.a.b(Boolean.TRUE);
        }
        C8.a<Integer> aVarA = c2120a.f30978b.a(d10.f3411b);
        if (aVarA instanceof C8.a.b) {
            int iIntValue = ((Number) ((C8.a.b) aVarA).f2463a).intValue();
            return (1 > iIntValue || iIntValue >= 31) ? new C8.a.b(Boolean.FALSE) : new C8.a.b(Boolean.TRUE);
        }
        if (aVarA instanceof C8.a.C0024a) {
            return new C8.a.b(Boolean.TRUE);
        }
        throw new NoWhenBranchMatchedException();
    }
}
