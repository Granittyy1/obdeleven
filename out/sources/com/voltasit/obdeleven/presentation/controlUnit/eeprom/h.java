package com.voltasit.obdeleven.presentation.controlUnit.eeprom;

import com.voltasit.obdeleven.domain.usecases.vehicle.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p293xa.r;

/* JADX INFO: compiled from: EepromViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f31582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U7.a<r> f31583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U7.a f31584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U7.a<r> f31585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U7.a f31586s;

    public h(l lVar) {
        this.f31582o = lVar;
        U7.a<r> aVar = new U7.a<>();
        this.f31583p = aVar;
        this.f31584q = aVar;
        U7.a<r> aVar2 = new U7.a<>();
        this.f31585r = aVar2;
        this.f31586s = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(h hVar, ContinuationImpl continuationImpl) {
        EepromViewModel$isPopTheHoodRequired$1 eepromViewModel$isPopTheHoodRequired$1;
        boolean zBooleanValue;
        hVar.getClass();
        if (continuationImpl instanceof EepromViewModel$isPopTheHoodRequired$1) {
            eepromViewModel$isPopTheHoodRequired$1 = (EepromViewModel$isPopTheHoodRequired$1) continuationImpl;
            int i10 = eepromViewModel$isPopTheHoodRequired$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eepromViewModel$isPopTheHoodRequired$1.label = i10 - Integer.MIN_VALUE;
            } else {
                eepromViewModel$isPopTheHoodRequired$1 = new EepromViewModel$isPopTheHoodRequired$1(hVar, continuationImpl);
            }
        } else {
            eepromViewModel$isPopTheHoodRequired$1 = new EepromViewModel$isPopTheHoodRequired$1(hVar, continuationImpl);
        }
        Object objA = eepromViewModel$isPopTheHoodRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = eepromViewModel$isPopTheHoodRequired$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            eepromViewModel$isPopTheHoodRequired$1.label = 1;
            objA = hVar.f31582o.a(eepromViewModel$isPopTheHoodRequired$1);
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
