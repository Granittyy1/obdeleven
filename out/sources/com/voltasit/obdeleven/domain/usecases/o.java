package com.voltasit.obdeleven.domain.usecases;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetPersonalInfoCountriesUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.n f30868a;

    public o(K8.n nVar) {
        this.f30868a = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetPersonalInfoCountriesUC$invoke$1 getPersonalInfoCountriesUC$invoke$1;
        if (continuationImpl instanceof GetPersonalInfoCountriesUC$invoke$1) {
            getPersonalInfoCountriesUC$invoke$1 = (GetPersonalInfoCountriesUC$invoke$1) continuationImpl;
            int i10 = getPersonalInfoCountriesUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getPersonalInfoCountriesUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getPersonalInfoCountriesUC$invoke$1 = new GetPersonalInfoCountriesUC$invoke$1(this, continuationImpl);
            }
        } else {
            getPersonalInfoCountriesUC$invoke$1 = new GetPersonalInfoCountriesUC$invoke$1(this, continuationImpl);
        }
        Object objA = getPersonalInfoCountriesUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getPersonalInfoCountriesUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            getPersonalInfoCountriesUC$invoke$1.label = 1;
            objA = this.f30868a.a(getPersonalInfoCountriesUC$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        if (aVar instanceof C8.a.b) {
            return new C8.a.b(kotlin.collections.q.h0((Iterable) ((C8.a.b) aVar).f2463a, new com.obdeleven.service.util.a(1)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
