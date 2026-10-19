package com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest;

import com.voltasit.obdeleven.domain.usecases.vehicle.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p293xa.r;

/* JADX INFO: compiled from: UDSOutputTestViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f31989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J8.a f31990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U7.a<r> f31991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U7.a f31992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U7.a<r> f31993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U7.a f31994t;

    public e(l lVar, J8.a aVar) {
        this.f31989o = lVar;
        this.f31990p = aVar;
        U7.a<r> aVar2 = new U7.a<>();
        this.f31991q = aVar2;
        this.f31992r = aVar2;
        U7.a<r> aVar3 = new U7.a<>();
        this.f31993s = aVar3;
        this.f31994t = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(e eVar, ContinuationImpl continuationImpl) {
        UDSOutputTestViewModel$isPopTheHoodRequired$1 uDSOutputTestViewModel$isPopTheHoodRequired$1;
        boolean zBooleanValue;
        eVar.getClass();
        if (continuationImpl instanceof UDSOutputTestViewModel$isPopTheHoodRequired$1) {
            uDSOutputTestViewModel$isPopTheHoodRequired$1 = (UDSOutputTestViewModel$isPopTheHoodRequired$1) continuationImpl;
            int i10 = uDSOutputTestViewModel$isPopTheHoodRequired$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uDSOutputTestViewModel$isPopTheHoodRequired$1.label = i10 - Integer.MIN_VALUE;
            } else {
                uDSOutputTestViewModel$isPopTheHoodRequired$1 = new UDSOutputTestViewModel$isPopTheHoodRequired$1(eVar, continuationImpl);
            }
        } else {
            uDSOutputTestViewModel$isPopTheHoodRequired$1 = new UDSOutputTestViewModel$isPopTheHoodRequired$1(eVar, continuationImpl);
        }
        Object objA = uDSOutputTestViewModel$isPopTheHoodRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = uDSOutputTestViewModel$isPopTheHoodRequired$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            uDSOutputTestViewModel$isPopTheHoodRequired$1.label = 1;
            objA = eVar.f31989o.a(uDSOutputTestViewModel$isPopTheHoodRequired$1);
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
            zBooleanValue = false;
        } else {
            if (!(aVar instanceof C8.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            zBooleanValue = ((Boolean) ((C8.a.b) aVar).f2463a).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
