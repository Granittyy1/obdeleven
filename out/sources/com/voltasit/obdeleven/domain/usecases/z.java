package com.voltasit.obdeleven.domain.usecases;

import G8.C0703e;
import G8.C0704f;
import com.voltasit.obdeleven.domain.exceptions.PopTheHoodRequiredException;
import com.voltasit.obdeleven.domain.exceptions.SfdInfoMissingException;
import com.voltasit.obdeleven.domain.exceptions.SfdTemporarilyUnavailableException;
import com.voltasit.obdeleven.domain.models.ControlUnitType;
import com.voltasit.obdeleven.domain.models.Feature;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p134k8.a2;

/* JADX INFO: compiled from: UnlockSfd2ProtectionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.e f31092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.h f31093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.h f31094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.d f31095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.h f31096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J8.p f31097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A f31098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f31099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J8.a f31100i;
    public final J8.x j;

    public z(com.voltasit.obdeleven.domain.usecases.sfd.e eVar, com.voltasit.obdeleven.domain.usecases.sfd.h hVar, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.h hVar2, K8.d dVar, com.voltasit.obdeleven.domain.usecases.controlUnit.h hVar3, J8.p pVar, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A a10, x xVar, J8.a aVar, J8.x xVar2) {
        this.f31092a = eVar;
        this.f31093b = hVar;
        this.f31094c = hVar2;
        this.f31095d = dVar;
        this.f31096e = hVar3;
        this.f31097f = pVar;
        this.f31098g = a10;
        this.f31099h = xVar;
        this.f31100i = aVar;
        this.j = xVar2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x012a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0134  */
    /* JADX WARN: Code duplicated, block: B:40:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    /* JADX WARN: Code duplicated, block: B:44:0x014b  */
    /* JADX WARN: Code duplicated, block: B:46:0x015e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x015f  */
    /* JADX WARN: Code duplicated, block: B:50:0x016a  */
    /* JADX WARN: Code duplicated, block: B:52:0x016e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0204 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0219 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0230 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x0231  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(ContinuationImpl continuationImpl) {
        UnlockSfd2ProtectionUC$invoke$1 unlockSfd2ProtectionUC$invoke$1;
        z zVar;
        C8.a aVar;
        C0704f c0704f;
        C8.a aVar2;
        z zVar2;
        C8.a aVar3;
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A a10;
        short sA;
        C8.a aVar4;
        C8.a aVar5;
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A a11;
        short sA2;
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A a12;
        short sA3;
        C8.a aVar6;
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A a13;
        short sA4;
        C8.a aVar7;
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A a14;
        short sA5;
        if (continuationImpl instanceof UnlockSfd2ProtectionUC$invoke$1) {
            unlockSfd2ProtectionUC$invoke$1 = (UnlockSfd2ProtectionUC$invoke$1) continuationImpl;
            int i10 = unlockSfd2ProtectionUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                unlockSfd2ProtectionUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                unlockSfd2ProtectionUC$invoke$1 = new UnlockSfd2ProtectionUC$invoke$1(this, continuationImpl);
            }
        } else {
            unlockSfd2ProtectionUC$invoke$1 = new UnlockSfd2ProtectionUC$invoke$1(this, continuationImpl);
        }
        Object objD = unlockSfd2ProtectionUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        switch (unlockSfd2ProtectionUC$invoke$1.label) {
            case 0:
                kotlin.b.b(objD);
                this.f31097f.f("UnlockSfd2ProtectionUC", "UnlockSfd2ProtectionUC()");
                String strU = D9.o.u(ControlUnitType.Gateway.a());
                unlockSfd2ProtectionUC$invoke$1.L$0 = this;
                unlockSfd2ProtectionUC$invoke$1.label = 1;
                objD = this.f31095d.d(strU, unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zVar = this;
                aVar = (C8.a) objD;
                if (aVar instanceof C8.a.C0024a) {
                    return new C8.a.C0024a(((C8.a.C0024a) aVar).f2462a);
                }
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.common.Output.Success<com.voltasit.obdeleven.domain.models.ControlUnitBase>");
                c0704f = (C0704f) ((C8.a.b) aVar).f2463a;
                C0703e c0703e = new C0703e(null, null, c0704f, null, null, null, false, null, null, null, null, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, null, 0, false, null, false, null, -5, 7);
                com.voltasit.obdeleven.domain.usecases.controlUnit.connect.h hVar = zVar.f31094c;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar;
                unlockSfd2ProtectionUC$invoke$1.L$1 = c0704f;
                unlockSfd2ProtectionUC$invoke$1.label = 2;
                objD = hVar.b(c0703e, unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = (C8.a) objD;
                if (aVar2 instanceof C8.a.C0024a) {
                    return new C8.a.C0024a(((C8.a.C0024a) aVar2).f2462a);
                }
                String str = c0704f.f3485a;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar;
                unlockSfd2ProtectionUC$invoke$1.L$1 = null;
                unlockSfd2ProtectionUC$invoke$1.label = 3;
                objD = zVar.b(str, unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zVar2 = zVar;
                aVar3 = (C8.a) objD;
                if (aVar3 instanceof C8.a.C0024a) {
                    a10 = zVar2.f31098g;
                    sA = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = aVar3;
                    unlockSfd2ProtectionUC$invoke$1.label = 4;
                    if (a10.a(sA, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar4 = aVar3;
                    return new C8.a.C0024a(((C8.a.C0024a) aVar4).f2462a);
                }
                if ((aVar3 instanceof C8.a.b) && !((Boolean) ((C8.a.b) aVar3).f2463a).booleanValue()) {
                    com.voltasit.obdeleven.domain.usecases.sfd.e eVar = zVar2.f31092a;
                    unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                    unlockSfd2ProtectionUC$invoke$1.label = 5;
                    objD = eVar.a(unlockSfd2ProtectionUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar5 = (C8.a) objD;
                    if (aVar5 instanceof C8.a.C0024a) {
                        a12 = zVar2.f31098g;
                        sA3 = ControlUnitType.Gateway.a();
                        unlockSfd2ProtectionUC$invoke$1.L$0 = aVar5;
                        unlockSfd2ProtectionUC$invoke$1.label = 6;
                        if (a12.a(sA3, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar6 = aVar5;
                        return new C8.a.C0024a(((C8.a.C0024a) aVar6).f2462a);
                    }
                    if ((aVar5 instanceof C8.a.b) && !((Boolean) ((C8.a.b) aVar5).f2463a).booleanValue()) {
                        a11 = zVar2.f31098g;
                        sA2 = ControlUnitType.Gateway.a();
                        unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                        unlockSfd2ProtectionUC$invoke$1.label = 7;
                        if (a11.a(sA2, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return new C8.a.C0024a(SfdInfoMissingException.f30425b);
                    }
                }
                x xVar = zVar2.f31099h;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 8;
                objD = xVar.a(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) objD).booleanValue()) {
                    a13 = zVar2.f31098g;
                    sA4 = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                    unlockSfd2ProtectionUC$invoke$1.label = 9;
                    if (a13.a(sA4, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(PopTheHoodRequiredException.f30422b);
                }
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 10;
                objD = zVar2.c(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar7 = (C8.a) objD;
                a14 = zVar2.f31098g;
                sA5 = ControlUnitType.Gateway.a();
                unlockSfd2ProtectionUC$invoke$1.L$0 = aVar7;
                unlockSfd2ProtectionUC$invoke$1.label = 11;
                if (a14.a(sA5, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return aVar7;
            case 1:
                z zVar3 = (z) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                zVar = zVar3;
                aVar = (C8.a) objD;
                if (aVar instanceof C8.a.C0024a) {
                    return new C8.a.C0024a(((C8.a.C0024a) aVar).f2462a);
                }
                kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.common.Output.Success<com.voltasit.obdeleven.domain.models.ControlUnitBase>");
                c0704f = (C0704f) ((C8.a.b) aVar).f2463a;
                C0703e c0703e2 = new C0703e(null, null, c0704f, null, null, null, false, null, null, null, null, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, null, 0, false, null, false, null, -5, 7);
                com.voltasit.obdeleven.domain.usecases.controlUnit.connect.h hVar2 = zVar.f31094c;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar;
                unlockSfd2ProtectionUC$invoke$1.L$1 = c0704f;
                unlockSfd2ProtectionUC$invoke$1.label = 2;
                objD = hVar2.b(c0703e2, unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = (C8.a) objD;
                if (aVar2 instanceof C8.a.C0024a) {
                    return new C8.a.C0024a(((C8.a.C0024a) aVar2).f2462a);
                }
                String str2 = c0704f.f3485a;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar;
                unlockSfd2ProtectionUC$invoke$1.L$1 = null;
                unlockSfd2ProtectionUC$invoke$1.label = 3;
                objD = zVar.b(str2, unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zVar2 = zVar;
                aVar3 = (C8.a) objD;
                if (aVar3 instanceof C8.a.C0024a) {
                    a10 = zVar2.f31098g;
                    sA = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = aVar3;
                    unlockSfd2ProtectionUC$invoke$1.label = 4;
                    if (a10.a(sA, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar4 = aVar3;
                    return new C8.a.C0024a(((C8.a.C0024a) aVar4).f2462a);
                }
                if (aVar3 instanceof C8.a.b) {
                    com.voltasit.obdeleven.domain.usecases.sfd.e eVar2 = zVar2.f31092a;
                    unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                    unlockSfd2ProtectionUC$invoke$1.label = 5;
                    objD = eVar2.a(unlockSfd2ProtectionUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar5 = (C8.a) objD;
                    if (aVar5 instanceof C8.a.C0024a) {
                        a12 = zVar2.f31098g;
                        sA3 = ControlUnitType.Gateway.a();
                        unlockSfd2ProtectionUC$invoke$1.L$0 = aVar5;
                        unlockSfd2ProtectionUC$invoke$1.label = 6;
                        if (a12.a(sA3, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar6 = aVar5;
                        return new C8.a.C0024a(((C8.a.C0024a) aVar6).f2462a);
                    }
                    if (aVar5 instanceof C8.a.b) {
                        a11 = zVar2.f31098g;
                        sA2 = ControlUnitType.Gateway.a();
                        unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                        unlockSfd2ProtectionUC$invoke$1.label = 7;
                        if (a11.a(sA2, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return new C8.a.C0024a(SfdInfoMissingException.f30425b);
                    }
                }
                x xVar2 = zVar2.f31099h;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 8;
                objD = xVar2.a(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) objD).booleanValue()) {
                    a13 = zVar2.f31098g;
                    sA4 = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                    unlockSfd2ProtectionUC$invoke$1.label = 9;
                    if (a13.a(sA4, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(PopTheHoodRequiredException.f30422b);
                }
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 10;
                objD = zVar2.c(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar7 = (C8.a) objD;
                a14 = zVar2.f31098g;
                sA5 = ControlUnitType.Gateway.a();
                unlockSfd2ProtectionUC$invoke$1.L$0 = aVar7;
                unlockSfd2ProtectionUC$invoke$1.label = 11;
                if (a14.a(sA5, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return aVar7;
            case 2:
                c0704f = (C0704f) unlockSfd2ProtectionUC$invoke$1.L$1;
                zVar = (z) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar2 = (C8.a) objD;
                if (aVar2 instanceof C8.a.C0024a) {
                    return new C8.a.C0024a(((C8.a.C0024a) aVar2).f2462a);
                }
                String str3 = c0704f.f3485a;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar;
                unlockSfd2ProtectionUC$invoke$1.L$1 = null;
                unlockSfd2ProtectionUC$invoke$1.label = 3;
                objD = zVar.b(str3, unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                zVar2 = zVar;
                aVar3 = (C8.a) objD;
                if (aVar3 instanceof C8.a.C0024a) {
                    a10 = zVar2.f31098g;
                    sA = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = aVar3;
                    unlockSfd2ProtectionUC$invoke$1.label = 4;
                    if (a10.a(sA, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar4 = aVar3;
                    return new C8.a.C0024a(((C8.a.C0024a) aVar4).f2462a);
                }
                if (aVar3 instanceof C8.a.b) {
                    com.voltasit.obdeleven.domain.usecases.sfd.e eVar3 = zVar2.f31092a;
                    unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                    unlockSfd2ProtectionUC$invoke$1.label = 5;
                    objD = eVar3.a(unlockSfd2ProtectionUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar5 = (C8.a) objD;
                    if (aVar5 instanceof C8.a.C0024a) {
                        a12 = zVar2.f31098g;
                        sA3 = ControlUnitType.Gateway.a();
                        unlockSfd2ProtectionUC$invoke$1.L$0 = aVar5;
                        unlockSfd2ProtectionUC$invoke$1.label = 6;
                        if (a12.a(sA3, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar6 = aVar5;
                        return new C8.a.C0024a(((C8.a.C0024a) aVar6).f2462a);
                    }
                    if (aVar5 instanceof C8.a.b) {
                        a11 = zVar2.f31098g;
                        sA2 = ControlUnitType.Gateway.a();
                        unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                        unlockSfd2ProtectionUC$invoke$1.label = 7;
                        if (a11.a(sA2, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return new C8.a.C0024a(SfdInfoMissingException.f30425b);
                    }
                }
                x xVar3 = zVar2.f31099h;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 8;
                objD = xVar3.a(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) objD).booleanValue()) {
                    a13 = zVar2.f31098g;
                    sA4 = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                    unlockSfd2ProtectionUC$invoke$1.label = 9;
                    if (a13.a(sA4, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(PopTheHoodRequiredException.f30422b);
                }
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 10;
                objD = zVar2.c(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar7 = (C8.a) objD;
                a14 = zVar2.f31098g;
                sA5 = ControlUnitType.Gateway.a();
                unlockSfd2ProtectionUC$invoke$1.L$0 = aVar7;
                unlockSfd2ProtectionUC$invoke$1.label = 11;
                if (a14.a(sA5, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return aVar7;
            case 3:
                zVar2 = (z) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar3 = (C8.a) objD;
                if (aVar3 instanceof C8.a.C0024a) {
                    a10 = zVar2.f31098g;
                    sA = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = aVar3;
                    unlockSfd2ProtectionUC$invoke$1.label = 4;
                    if (a10.a(sA, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar4 = aVar3;
                    return new C8.a.C0024a(((C8.a.C0024a) aVar4).f2462a);
                }
                if (aVar3 instanceof C8.a.b) {
                    com.voltasit.obdeleven.domain.usecases.sfd.e eVar4 = zVar2.f31092a;
                    unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                    unlockSfd2ProtectionUC$invoke$1.label = 5;
                    objD = eVar4.a(unlockSfd2ProtectionUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar5 = (C8.a) objD;
                    if (aVar5 instanceof C8.a.C0024a) {
                        a12 = zVar2.f31098g;
                        sA3 = ControlUnitType.Gateway.a();
                        unlockSfd2ProtectionUC$invoke$1.L$0 = aVar5;
                        unlockSfd2ProtectionUC$invoke$1.label = 6;
                        if (a12.a(sA3, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar6 = aVar5;
                        return new C8.a.C0024a(((C8.a.C0024a) aVar6).f2462a);
                    }
                    if (aVar5 instanceof C8.a.b) {
                        a11 = zVar2.f31098g;
                        sA2 = ControlUnitType.Gateway.a();
                        unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                        unlockSfd2ProtectionUC$invoke$1.label = 7;
                        if (a11.a(sA2, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return new C8.a.C0024a(SfdInfoMissingException.f30425b);
                    }
                }
                x xVar4 = zVar2.f31099h;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 8;
                objD = xVar4.a(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) objD).booleanValue()) {
                    a13 = zVar2.f31098g;
                    sA4 = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                    unlockSfd2ProtectionUC$invoke$1.label = 9;
                    if (a13.a(sA4, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(PopTheHoodRequiredException.f30422b);
                }
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 10;
                objD = zVar2.c(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar7 = (C8.a) objD;
                a14 = zVar2.f31098g;
                sA5 = ControlUnitType.Gateway.a();
                unlockSfd2ProtectionUC$invoke$1.L$0 = aVar7;
                unlockSfd2ProtectionUC$invoke$1.label = 11;
                if (a14.a(sA5, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return aVar7;
            case 4:
                aVar4 = (C8.a) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                return new C8.a.C0024a(((C8.a.C0024a) aVar4).f2462a);
            case 5:
                zVar2 = (z) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar5 = (C8.a) objD;
                if (aVar5 instanceof C8.a.C0024a) {
                    a12 = zVar2.f31098g;
                    sA3 = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = aVar5;
                    unlockSfd2ProtectionUC$invoke$1.label = 6;
                    if (a12.a(sA3, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar6 = aVar5;
                    return new C8.a.C0024a(((C8.a.C0024a) aVar6).f2462a);
                }
                if (aVar5 instanceof C8.a.b) {
                    a11 = zVar2.f31098g;
                    sA2 = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                    unlockSfd2ProtectionUC$invoke$1.label = 7;
                    if (a11.a(sA2, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(SfdInfoMissingException.f30425b);
                }
                x xVar5 = zVar2.f31099h;
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 8;
                objD = xVar5.a(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) objD).booleanValue()) {
                    a13 = zVar2.f31098g;
                    sA4 = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                    unlockSfd2ProtectionUC$invoke$1.label = 9;
                    if (a13.a(sA4, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(PopTheHoodRequiredException.f30422b);
                }
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 10;
                objD = zVar2.c(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar7 = (C8.a) objD;
                a14 = zVar2.f31098g;
                sA5 = ControlUnitType.Gateway.a();
                unlockSfd2ProtectionUC$invoke$1.L$0 = aVar7;
                unlockSfd2ProtectionUC$invoke$1.label = 11;
                if (a14.a(sA5, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return aVar7;
            case 6:
                aVar6 = (C8.a) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                return new C8.a.C0024a(((C8.a.C0024a) aVar6).f2462a);
            case 7:
                kotlin.b.b(objD);
                return new C8.a.C0024a(SfdInfoMissingException.f30425b);
            case 8:
                zVar2 = (z) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                if (((Boolean) objD).booleanValue()) {
                    a13 = zVar2.f31098g;
                    sA4 = ControlUnitType.Gateway.a();
                    unlockSfd2ProtectionUC$invoke$1.L$0 = null;
                    unlockSfd2ProtectionUC$invoke$1.label = 9;
                    if (a13.a(sA4, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return new C8.a.C0024a(PopTheHoodRequiredException.f30422b);
                }
                unlockSfd2ProtectionUC$invoke$1.L$0 = zVar2;
                unlockSfd2ProtectionUC$invoke$1.label = 10;
                objD = zVar2.c(unlockSfd2ProtectionUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar7 = (C8.a) objD;
                a14 = zVar2.f31098g;
                sA5 = ControlUnitType.Gateway.a();
                unlockSfd2ProtectionUC$invoke$1.L$0 = aVar7;
                unlockSfd2ProtectionUC$invoke$1.label = 11;
                if (a14.a(sA5, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return aVar7;
            case 9:
                kotlin.b.b(objD);
                return new C8.a.C0024a(PopTheHoodRequiredException.f30422b);
            case 10:
                zVar2 = (z) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar7 = (C8.a) objD;
                a14 = zVar2.f31098g;
                sA5 = ControlUnitType.Gateway.a();
                unlockSfd2ProtectionUC$invoke$1.L$0 = aVar7;
                unlockSfd2ProtectionUC$invoke$1.label = 11;
                if (a14.a(sA5, unlockSfd2ProtectionUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return aVar7;
            case 11:
                C8.a aVar8 = (C8.a) unlockSfd2ProtectionUC$invoke$1.L$0;
                kotlin.b.b(objD);
                return aVar8;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        UnlockSfd2ProtectionUC$unlockSfd$1 unlockSfd2ProtectionUC$unlockSfd$1;
        z zVar;
        if (continuationImpl instanceof UnlockSfd2ProtectionUC$unlockSfd$1) {
            unlockSfd2ProtectionUC$unlockSfd$1 = (UnlockSfd2ProtectionUC$unlockSfd$1) continuationImpl;
            int i10 = unlockSfd2ProtectionUC$unlockSfd$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                unlockSfd2ProtectionUC$unlockSfd$1.label = i10 - Integer.MIN_VALUE;
            } else {
                unlockSfd2ProtectionUC$unlockSfd$1 = new UnlockSfd2ProtectionUC$unlockSfd$1(this, continuationImpl);
            }
        } else {
            unlockSfd2ProtectionUC$unlockSfd$1 = new UnlockSfd2ProtectionUC$unlockSfd$1(this, continuationImpl);
        }
        Object objB = unlockSfd2ProtectionUC$unlockSfd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = unlockSfd2ProtectionUC$unlockSfd$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            short sA = ControlUnitType.Gateway.a();
            Feature feature = Feature.Adaptations;
            unlockSfd2ProtectionUC$unlockSfd$1.L$0 = this;
            unlockSfd2ProtectionUC$unlockSfd$1.label = 1;
            objB = this.f31093b.b(str, sA, feature, unlockSfd2ProtectionUC$unlockSfd$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            zVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (z) unlockSfd2ProtectionUC$unlockSfd$1.L$0;
            kotlin.b.b(objB);
        }
        C8.a aVar = (C8.a) objB;
        if (!(aVar instanceof C8.a.C0024a)) {
            return new C8.a.b(Boolean.TRUE);
        }
        C8.a.C0024a c0024a = (C8.a.C0024a) aVar;
        if (!(c0024a.f2462a instanceof SfdTemporarilyUnavailableException)) {
            return new C8.a.b(Boolean.FALSE);
        }
        zVar.f31100i.g0(zVar.j.k().f42726c.k(), false);
        return new C8.a.C0024a(c0024a.f2462a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ContinuationImpl continuationImpl) {
        UnlockSfd2ProtectionUC$unlockSfd2$1 unlockSfd2ProtectionUC$unlockSfd2$1;
        z zVar;
        if (continuationImpl instanceof UnlockSfd2ProtectionUC$unlockSfd2$1) {
            unlockSfd2ProtectionUC$unlockSfd2$1 = (UnlockSfd2ProtectionUC$unlockSfd2$1) continuationImpl;
            int i10 = unlockSfd2ProtectionUC$unlockSfd2$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                unlockSfd2ProtectionUC$unlockSfd2$1.label = i10 - Integer.MIN_VALUE;
            } else {
                unlockSfd2ProtectionUC$unlockSfd2$1 = new UnlockSfd2ProtectionUC$unlockSfd2$1(this, continuationImpl);
            }
        } else {
            unlockSfd2ProtectionUC$unlockSfd2$1 = new UnlockSfd2ProtectionUC$unlockSfd2$1(this, continuationImpl);
        }
        Object objA = unlockSfd2ProtectionUC$unlockSfd2$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = unlockSfd2ProtectionUC$unlockSfd2$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            short sA = ControlUnitType.Gateway.a();
            unlockSfd2ProtectionUC$unlockSfd2$1.L$0 = this;
            unlockSfd2ProtectionUC$unlockSfd2$1.label = 1;
            objA = this.f31096e.a("031D00", unlockSfd2ProtectionUC$unlockSfd2$1, sA);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            zVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (z) unlockSfd2ProtectionUC$unlockSfd2$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        a2 a2VarK = zVar.j.k();
        boolean z10 = aVar instanceof C8.a.C0024a;
        J8.a aVar2 = zVar.f31100i;
        if (z10) {
            aVar2.g0(a2VarK.f42726c.k(), false);
            return new C8.a.C0024a(((C8.a.C0024a) aVar).f2462a);
        }
        aVar2.g0(a2VarK.f42726c.k(), true);
        return new C8.a.b(p293xa.r.f47939a);
    }
}
