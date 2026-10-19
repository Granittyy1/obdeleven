package com.voltasit.obdeleven.domain.usecases.oca;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetOcaListUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.j f30874a;

    public d(K8.j jVar) {
        this.f30874a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, boolean z10, ContinuationImpl continuationImpl) {
        GetOcaListUC$invoke$1 getOcaListUC$invoke$1;
        if (continuationImpl instanceof GetOcaListUC$invoke$1) {
            getOcaListUC$invoke$1 = (GetOcaListUC$invoke$1) continuationImpl;
            int i10 = getOcaListUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getOcaListUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getOcaListUC$invoke$1 = new GetOcaListUC$invoke$1(this, continuationImpl);
            }
        } else {
            getOcaListUC$invoke$1 = new GetOcaListUC$invoke$1(this, continuationImpl);
        }
        Object objI = getOcaListUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getOcaListUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objI);
            getOcaListUC$invoke$1.label = 1;
            objI = this.f30874a.i(str, z10, getOcaListUC$invoke$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objI);
        }
        C8.a aVar = (C8.a) objI;
        if (aVar instanceof C8.a.b) {
            return new C8.a.b(q.h0((Iterable) ((C8.a.b) aVar).f2463a, new c()));
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
