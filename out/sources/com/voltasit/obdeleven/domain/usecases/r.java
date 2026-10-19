package com.voltasit.obdeleven.domain.usecases;

import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: IsPersonalInfoUpdateNeededUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GetUserDetailsUC f30909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.o f30910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.b f30911d;

    public r(J8.p pVar, GetUserDetailsUC getUserDetailsUC, K8.o oVar, K8.b bVar) {
        this.f30908a = pVar;
        this.f30909b = getUserDetailsUC;
        this.f30910c = oVar;
        this.f30911d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        IsPersonalInfoUpdateNeededUC$invoke$1 isPersonalInfoUpdateNeededUC$invoke$1;
        r rVar;
        if (continuationImpl instanceof IsPersonalInfoUpdateNeededUC$invoke$1) {
            isPersonalInfoUpdateNeededUC$invoke$1 = (IsPersonalInfoUpdateNeededUC$invoke$1) continuationImpl;
            int i10 = isPersonalInfoUpdateNeededUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isPersonalInfoUpdateNeededUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isPersonalInfoUpdateNeededUC$invoke$1 = new IsPersonalInfoUpdateNeededUC$invoke$1(this, continuationImpl);
            }
        } else {
            isPersonalInfoUpdateNeededUC$invoke$1 = new IsPersonalInfoUpdateNeededUC$invoke$1(this, continuationImpl);
        }
        Object objA = isPersonalInfoUpdateNeededUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isPersonalInfoUpdateNeededUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            this.f30908a.f("IsPersonalInfoUpdateNeededUC", "IsPersonalInfoUpdateNeededUC()");
            isPersonalInfoUpdateNeededUC$invoke$1.L$0 = this;
            isPersonalInfoUpdateNeededUC$invoke$1.label = 1;
            objA = this.f30909b.a(isPersonalInfoUpdateNeededUC$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            rVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = (r) isPersonalInfoUpdateNeededUC$invoke$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            rVar.f30908a.d(((C8.a.C0024a) aVar).f2462a, false);
            return aVar;
        }
        Boolean bool = (Boolean) rVar.f30911d.c(p279w9.a.f47821s, false);
        if (bool != null ? bool.booleanValue() : false) {
            return new C8.a.b(new G8.t(false, false));
        }
        K8.o oVar = rVar.f30910c;
        return new C8.a.b(new G8.t(oVar.B(), oVar.i0()));
    }
}
