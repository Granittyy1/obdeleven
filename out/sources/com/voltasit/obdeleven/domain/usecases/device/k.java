package com.voltasit.obdeleven.domain.usecases.device;

import G8.C0703e;
import G8.C0704f;
import com.voltasit.obdeleven.domain.exceptions.InvalidVinException;
import com.voltasit.obdeleven.domain.exceptions.UnknownProtocolException;
import com.voltasit.obdeleven.domain.models.ControlUnitType;
import com.voltasit.obdeleven.domain.providers.AnalyticsProvider$EventParamValue$VinResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetVehicleVinUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.h f30785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.requests.d f30786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.requests.e f30787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.requests.g f30788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.u f30789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.requests.f f30790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J8.p f30791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.a f30792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A f30793i;
    public final J8.a j;

    public k(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.h hVar, com.voltasit.obdeleven.domain.usecases.device.requests.d dVar, com.voltasit.obdeleven.domain.usecases.device.requests.e eVar, com.voltasit.obdeleven.domain.usecases.device.requests.g gVar, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.u uVar, com.voltasit.obdeleven.domain.usecases.device.requests.f fVar, com.voltasit.obdeleven.domain.usecases.device.requests.h hVar2, J8.p pVar, com.voltasit.obdeleven.domain.usecases.controlUnit.a aVar, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A a10, J8.a aVar2) {
        this.f30785a = hVar;
        this.f30786b = dVar;
        this.f30787c = eVar;
        this.f30788d = gVar;
        this.f30789e = uVar;
        this.f30790f = fVar;
        this.f30791g = pVar;
        this.f30792h = aVar;
        this.f30793i = a10;
        this.j = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        GetVehicleVinUC$getVinUsingOBDII$1 getVehicleVinUC$getVinUsingOBDII$1;
        k kVar;
        C8.a aVar;
        String str;
        String str2;
        k kVar2;
        if (continuationImpl instanceof GetVehicleVinUC$getVinUsingOBDII$1) {
            getVehicleVinUC$getVinUsingOBDII$1 = (GetVehicleVinUC$getVinUsingOBDII$1) continuationImpl;
            int i10 = getVehicleVinUC$getVinUsingOBDII$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getVehicleVinUC$getVinUsingOBDII$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getVehicleVinUC$getVinUsingOBDII$1 = new GetVehicleVinUC$getVinUsingOBDII$1(this, continuationImpl);
            }
        } else {
            getVehicleVinUC$getVinUsingOBDII$1 = new GetVehicleVinUC$getVinUsingOBDII$1(this, continuationImpl);
        }
        Object objA = getVehicleVinUC$getVinUsingOBDII$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getVehicleVinUC$getVinUsingOBDII$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = getVehicleVinUC$getVinUsingOBDII$1.S$0;
                kVar = (k) getVehicleVinUC$getVinUsingOBDII$1.L$0;
                kotlin.b.b(objA);
            } else if (i11 == 2) {
                s10 = getVehicleVinUC$getVinUsingOBDII$1.S$0;
                kVar = (k) getVehicleVinUC$getVinUsingOBDII$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.b) {
                    if (aVar instanceof C8.a.C0024a) {
                        throw new NoWhenBranchMatchedException();
                    }
                    J8.a aVar2 = kVar.j;
                    AnalyticsProvider$EventParamValue$VinResult analyticsProvider$EventParamValue$VinResult = AnalyticsProvider$EventParamValue$VinResult.ReadViaObd;
                    aVar2.F(AnalyticsProvider$EventParamValue$VinResult.CannotRead, "");
                    return aVar;
                }
                str = (String) ((C8.a.b) aVar).f2463a;
                getVehicleVinUC$getVinUsingOBDII$1.L$0 = kVar;
                getVehicleVinUC$getVinUsingOBDII$1.L$1 = str;
                getVehicleVinUC$getVinUsingOBDII$1.label = 3;
                if (kVar.f30793i.a(s10, getVehicleVinUC$getVinUsingOBDII$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                kVar2 = kVar;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) getVehicleVinUC$getVinUsingOBDII$1.L$1;
                kVar2 = (k) getVehicleVinUC$getVinUsingOBDII$1.L$0;
                kotlin.b.b(objA);
            }
            return kVar2.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaObd, str2);
        }
        kotlin.b.b(objA);
        getVehicleVinUC$getVinUsingOBDII$1.L$0 = this;
        getVehicleVinUC$getVinUsingOBDII$1.S$0 = s10;
        getVehicleVinUC$getVinUsingOBDII$1.label = 1;
        objA = this.f30789e.a(s10, getVehicleVinUC$getVinUsingOBDII$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        kVar = this;
        C8.a aVar3 = (C8.a) objA;
        if (aVar3 instanceof C8.a.b) {
            ((C8.a.b) aVar3).getClass();
        } else if (aVar3 instanceof C8.a.C0024a) {
            J8.a aVar4 = kVar.j;
            AnalyticsProvider$EventParamValue$VinResult analyticsProvider$EventParamValue$VinResult2 = AnalyticsProvider$EventParamValue$VinResult.ReadViaObd;
            aVar4.F(AnalyticsProvider$EventParamValue$VinResult.CannotRead, "");
            return aVar3;
        }
        getVehicleVinUC$getVinUsingOBDII$1.L$0 = kVar;
        getVehicleVinUC$getVinUsingOBDII$1.S$0 = s10;
        getVehicleVinUC$getVinUsingOBDII$1.label = 2;
        objA = kVar.f30790f.a(s10, getVehicleVinUC$getVinUsingOBDII$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            if (aVar instanceof C8.a.C0024a) {
                throw new NoWhenBranchMatchedException();
            }
            J8.a aVar5 = kVar.j;
            AnalyticsProvider$EventParamValue$VinResult analyticsProvider$EventParamValue$VinResult3 = AnalyticsProvider$EventParamValue$VinResult.ReadViaObd;
            aVar5.F(AnalyticsProvider$EventParamValue$VinResult.CannotRead, "");
            return aVar;
        }
        str = (String) ((C8.a.b) aVar).f2463a;
        getVehicleVinUC$getVinUsingOBDII$1.L$0 = kVar;
        getVehicleVinUC$getVinUsingOBDII$1.L$1 = str;
        getVehicleVinUC$getVinUsingOBDII$1.label = 3;
        if (kVar.f30793i.a(s10, getVehicleVinUC$getVinUsingOBDII$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        str2 = str;
        kVar2 = kVar;
        return kVar2.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaObd, str2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:29:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0122  */
    /* JADX WARN: Code duplicated, block: B:33:0x012b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0139  */
    /* JADX WARN: Code duplicated, block: B:36:0x013c  */
    /* JADX WARN: Code duplicated, block: B:38:0x014e  */
    /* JADX WARN: Code duplicated, block: B:40:0x015f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0160  */
    /* JADX WARN: Code duplicated, block: B:44:0x0167  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0179  */
    /* JADX WARN: Code duplicated, block: B:49:0x017d  */
    /* JADX WARN: Code duplicated, block: B:51:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x018f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0193  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e3 A[PHI: r1
      0x01e3: PHI (r1v54 java.lang.Object) = (r1v50 java.lang.Object), (r1v1 java.lang.Object) binds: [B:67:0x01e0, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0200 A[PHI: r1
      0x0200: PHI (r1v36 java.lang.Object) = (r1v20 java.lang.Object), (r1v1 java.lang.Object) binds: [B:73:0x01fd, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0201  */
    /* JADX WARN: Code duplicated, block: B:78:0x0207  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0213  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(ContinuationImpl continuationImpl) {
        GetVehicleVinUC$invoke$1 getVehicleVinUC$invoke$1;
        k kVar;
        C8.a aVar;
        C0704f c0704f;
        Object objB;
        k kVar2;
        C0704f c0704f2;
        C8.a aVar2;
        int iOrdinal;
        k kVar3;
        C8.a aVar3;
        k kVar4;
        C0704f c0704f3;
        C8.a aVar4;
        com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A a10;
        short s10;
        if (continuationImpl instanceof GetVehicleVinUC$invoke$1) {
            getVehicleVinUC$invoke$1 = (GetVehicleVinUC$invoke$1) continuationImpl;
            int i10 = getVehicleVinUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getVehicleVinUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getVehicleVinUC$invoke$1 = new GetVehicleVinUC$invoke$1(this, continuationImpl);
            }
        } else {
            getVehicleVinUC$invoke$1 = new GetVehicleVinUC$invoke$1(this, continuationImpl);
        }
        Object objD = getVehicleVinUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        switch (getVehicleVinUC$invoke$1.label) {
            case 0:
                kotlin.b.b(objD);
                this.f30791g.f("GetVehicleVinUC", "GetVehicleVinUC()");
                short sA = ControlUnitType.Engine.a();
                getVehicleVinUC$invoke$1.L$0 = this;
                getVehicleVinUC$invoke$1.label = 1;
                com.voltasit.obdeleven.domain.usecases.controlUnit.a aVar5 = this.f30792h;
                objD = aVar5.f30652a.d(D9.o.u(sA), getVehicleVinUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kVar = this;
                aVar = (C8.a) objD;
                if (aVar instanceof C8.a.b) {
                    if (aVar instanceof C8.a.C0024a) {
                        throw new NoWhenBranchMatchedException();
                    }
                    J8.a aVar6 = kVar.j;
                    AnalyticsProvider$EventParamValue$VinResult analyticsProvider$EventParamValue$VinResult = AnalyticsProvider$EventParamValue$VinResult.ReadViaObd;
                    aVar6.F(AnalyticsProvider$EventParamValue$VinResult.CannotRead, "");
                    return aVar;
                }
                c0704f = (C0704f) ((C8.a.b) aVar).f2463a;
                kVar.f30791g.e("GetVehicleVinUC", "Received control unit base from server");
                C0703e c0703e = new C0703e(null, null, c0704f, null, null, null, false, null, null, null, null, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, null, 0, false, null, false, null, -5, 7);
                getVehicleVinUC$invoke$1.L$0 = kVar;
                getVehicleVinUC$invoke$1.L$1 = c0704f;
                getVehicleVinUC$invoke$1.label = 2;
                objB = kVar.f30785a.b(c0703e, getVehicleVinUC$invoke$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kVar2 = kVar;
                c0704f2 = c0704f;
                objD = objB;
                aVar2 = (C8.a) objD;
                if (!(aVar2 instanceof C8.a.b)) {
                    if (!(aVar2 instanceof C8.a.C0024a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar2.f30791g.b("GetVehicleVinUC", "Unable to connect to Engine control unit using VAG protocols");
                    short s11 = c0704f2.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = null;
                    getVehicleVinUC$invoke$1.L$1 = null;
                    getVehicleVinUC$invoke$1.label = 3;
                    objD = kVar2.a(s11, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return objD;
                }
                iOrdinal = ((C0703e) ((C8.a.b) aVar2).f2463a).f3453C.ordinal();
                if (iOrdinal == 0) {
                    com.voltasit.obdeleven.domain.usecases.device.requests.g gVar = kVar2.f30788d;
                    short s12 = c0704f2.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = kVar2;
                    getVehicleVinUC$invoke$1.L$1 = c0704f2;
                    getVehicleVinUC$invoke$1.label = 7;
                    objD = gVar.a(s12, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar3 = kVar2;
                    aVar3 = (C8.a) objD;
                    kVar4 = kVar3;
                    c0704f3 = c0704f2;
                    aVar4 = aVar3;
                    a10 = kVar4.f30793i;
                    s10 = c0704f3.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = kVar4;
                    getVehicleVinUC$invoke$1.L$1 = c0704f3;
                    getVehicleVinUC$invoke$1.L$2 = aVar4;
                    getVehicleVinUC$invoke$1.label = 8;
                    if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (aVar4 instanceof C8.a.b) {
                        return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                    }
                    short s13 = c0704f3.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = null;
                    getVehicleVinUC$invoke$1.L$1 = null;
                    getVehicleVinUC$invoke$1.L$2 = null;
                    getVehicleVinUC$invoke$1.label = 9;
                    objD = kVar4.a(s13, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return objD;
                }
                switch (iOrdinal) {
                    case 2:
                        com.voltasit.obdeleven.domain.usecases.device.requests.e eVar = kVar2.f30787c;
                        short s14 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 6;
                        objD = eVar.a(s14, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s15 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s15, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    case 3:
                    case 5:
                        com.voltasit.obdeleven.domain.usecases.device.requests.d dVar = kVar2.f30786b;
                        short s16 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 4;
                        objD = dVar.a(s16, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s17 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s17, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    case 4:
                    case 6:
                    case 7:
                        com.voltasit.obdeleven.domain.usecases.device.requests.e eVar2 = kVar2.f30787c;
                        short s18 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 5;
                        objD = eVar2.a(s18, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s19 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s19, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    default:
                        kVar2.f30791g.b("GetVehicleVinUC", "Unknown application protocol");
                        return new C8.a.C0024a(new UnknownProtocolException());
                }
            case 1:
                kVar = (k) getVehicleVinUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar = (C8.a) objD;
                if (aVar instanceof C8.a.b) {
                    if (aVar instanceof C8.a.C0024a) {
                        throw new NoWhenBranchMatchedException();
                    }
                    J8.a aVar7 = kVar.j;
                    AnalyticsProvider$EventParamValue$VinResult analyticsProvider$EventParamValue$VinResult2 = AnalyticsProvider$EventParamValue$VinResult.ReadViaObd;
                    aVar7.F(AnalyticsProvider$EventParamValue$VinResult.CannotRead, "");
                    return aVar;
                }
                c0704f = (C0704f) ((C8.a.b) aVar).f2463a;
                kVar.f30791g.e("GetVehicleVinUC", "Received control unit base from server");
                C0703e c0703e2 = new C0703e(null, null, c0704f, null, null, null, false, null, null, null, null, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, null, 0, false, null, false, null, -5, 7);
                getVehicleVinUC$invoke$1.L$0 = kVar;
                getVehicleVinUC$invoke$1.L$1 = c0704f;
                getVehicleVinUC$invoke$1.label = 2;
                objB = kVar.f30785a.b(c0703e2, getVehicleVinUC$invoke$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kVar2 = kVar;
                c0704f2 = c0704f;
                objD = objB;
                aVar2 = (C8.a) objD;
                if (!(aVar2 instanceof C8.a.b)) {
                    if (!(aVar2 instanceof C8.a.C0024a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar2.f30791g.b("GetVehicleVinUC", "Unable to connect to Engine control unit using VAG protocols");
                    short s110 = c0704f2.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = null;
                    getVehicleVinUC$invoke$1.L$1 = null;
                    getVehicleVinUC$invoke$1.label = 3;
                    objD = kVar2.a(s110, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return objD;
                }
                iOrdinal = ((C0703e) ((C8.a.b) aVar2).f2463a).f3453C.ordinal();
                if (iOrdinal == 0) {
                    com.voltasit.obdeleven.domain.usecases.device.requests.g gVar2 = kVar2.f30788d;
                    short s111 = c0704f2.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = kVar2;
                    getVehicleVinUC$invoke$1.L$1 = c0704f2;
                    getVehicleVinUC$invoke$1.label = 7;
                    objD = gVar2.a(s111, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar3 = kVar2;
                    aVar3 = (C8.a) objD;
                    kVar4 = kVar3;
                    c0704f3 = c0704f2;
                    aVar4 = aVar3;
                    a10 = kVar4.f30793i;
                    s10 = c0704f3.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = kVar4;
                    getVehicleVinUC$invoke$1.L$1 = c0704f3;
                    getVehicleVinUC$invoke$1.L$2 = aVar4;
                    getVehicleVinUC$invoke$1.label = 8;
                    if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (aVar4 instanceof C8.a.b) {
                        return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                    }
                    short s112 = c0704f3.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = null;
                    getVehicleVinUC$invoke$1.L$1 = null;
                    getVehicleVinUC$invoke$1.L$2 = null;
                    getVehicleVinUC$invoke$1.label = 9;
                    objD = kVar4.a(s112, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return objD;
                }
                switch (iOrdinal) {
                    case 2:
                        com.voltasit.obdeleven.domain.usecases.device.requests.e eVar3 = kVar2.f30787c;
                        short s113 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 6;
                        objD = eVar3.a(s113, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s114 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s114, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    case 3:
                    case 5:
                        com.voltasit.obdeleven.domain.usecases.device.requests.d dVar2 = kVar2.f30786b;
                        short s115 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 4;
                        objD = dVar2.a(s115, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s116 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s116, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    case 4:
                    case 6:
                    case 7:
                        com.voltasit.obdeleven.domain.usecases.device.requests.e eVar4 = kVar2.f30787c;
                        short s117 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 5;
                        objD = eVar4.a(s117, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s118 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s118, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    default:
                        kVar2.f30791g.b("GetVehicleVinUC", "Unknown application protocol");
                        return new C8.a.C0024a(new UnknownProtocolException());
                }
            case 2:
                c0704f2 = (C0704f) getVehicleVinUC$invoke$1.L$1;
                kVar2 = (k) getVehicleVinUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar2 = (C8.a) objD;
                if (!(aVar2 instanceof C8.a.b)) {
                    if (!(aVar2 instanceof C8.a.C0024a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar2.f30791g.b("GetVehicleVinUC", "Unable to connect to Engine control unit using VAG protocols");
                    short s119 = c0704f2.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = null;
                    getVehicleVinUC$invoke$1.L$1 = null;
                    getVehicleVinUC$invoke$1.label = 3;
                    objD = kVar2.a(s119, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return objD;
                }
                iOrdinal = ((C0703e) ((C8.a.b) aVar2).f2463a).f3453C.ordinal();
                if (iOrdinal == 0) {
                    com.voltasit.obdeleven.domain.usecases.device.requests.g gVar3 = kVar2.f30788d;
                    short s1110 = c0704f2.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = kVar2;
                    getVehicleVinUC$invoke$1.L$1 = c0704f2;
                    getVehicleVinUC$invoke$1.label = 7;
                    objD = gVar3.a(s1110, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar3 = kVar2;
                    aVar3 = (C8.a) objD;
                    kVar4 = kVar3;
                    c0704f3 = c0704f2;
                    aVar4 = aVar3;
                    a10 = kVar4.f30793i;
                    s10 = c0704f3.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = kVar4;
                    getVehicleVinUC$invoke$1.L$1 = c0704f3;
                    getVehicleVinUC$invoke$1.L$2 = aVar4;
                    getVehicleVinUC$invoke$1.label = 8;
                    if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (aVar4 instanceof C8.a.b) {
                        return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                    }
                    short s1111 = c0704f3.f3487c;
                    getVehicleVinUC$invoke$1.L$0 = null;
                    getVehicleVinUC$invoke$1.L$1 = null;
                    getVehicleVinUC$invoke$1.L$2 = null;
                    getVehicleVinUC$invoke$1.label = 9;
                    objD = kVar4.a(s1111, getVehicleVinUC$invoke$1);
                    if (objD == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return objD;
                }
                switch (iOrdinal) {
                    case 2:
                        com.voltasit.obdeleven.domain.usecases.device.requests.e eVar5 = kVar2.f30787c;
                        short s1112 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 6;
                        objD = eVar5.a(s1112, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s1113 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s1113, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    case 3:
                    case 5:
                        com.voltasit.obdeleven.domain.usecases.device.requests.d dVar3 = kVar2.f30786b;
                        short s1114 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 4;
                        objD = dVar3.a(s1114, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s1115 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s1115, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    case 4:
                    case 6:
                    case 7:
                        com.voltasit.obdeleven.domain.usecases.device.requests.e eVar6 = kVar2.f30787c;
                        short s1116 = c0704f2.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar2;
                        getVehicleVinUC$invoke$1.L$1 = c0704f2;
                        getVehicleVinUC$invoke$1.label = 5;
                        objD = eVar6.a(s1116, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        kVar3 = kVar2;
                        aVar3 = (C8.a) objD;
                        kVar4 = kVar3;
                        c0704f3 = c0704f2;
                        aVar4 = aVar3;
                        a10 = kVar4.f30793i;
                        s10 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = kVar4;
                        getVehicleVinUC$invoke$1.L$1 = c0704f3;
                        getVehicleVinUC$invoke$1.L$2 = aVar4;
                        getVehicleVinUC$invoke$1.label = 8;
                        if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (aVar4 instanceof C8.a.b) {
                            return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                        }
                        short s1117 = c0704f3.f3487c;
                        getVehicleVinUC$invoke$1.L$0 = null;
                        getVehicleVinUC$invoke$1.L$1 = null;
                        getVehicleVinUC$invoke$1.L$2 = null;
                        getVehicleVinUC$invoke$1.label = 9;
                        objD = kVar4.a(s1117, getVehicleVinUC$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return objD;
                    default:
                        kVar2.f30791g.b("GetVehicleVinUC", "Unknown application protocol");
                        return new C8.a.C0024a(new UnknownProtocolException());
                }
            case 3:
                kotlin.b.b(objD);
                return objD;
            case 4:
                c0704f2 = (C0704f) getVehicleVinUC$invoke$1.L$1;
                kVar3 = (k) getVehicleVinUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar3 = (C8.a) objD;
                kVar4 = kVar3;
                c0704f3 = c0704f2;
                aVar4 = aVar3;
                a10 = kVar4.f30793i;
                s10 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = kVar4;
                getVehicleVinUC$invoke$1.L$1 = c0704f3;
                getVehicleVinUC$invoke$1.L$2 = aVar4;
                getVehicleVinUC$invoke$1.label = 8;
                if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (aVar4 instanceof C8.a.b) {
                    return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                }
                short s1118 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = null;
                getVehicleVinUC$invoke$1.L$1 = null;
                getVehicleVinUC$invoke$1.L$2 = null;
                getVehicleVinUC$invoke$1.label = 9;
                objD = kVar4.a(s1118, getVehicleVinUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objD;
            case 5:
                c0704f2 = (C0704f) getVehicleVinUC$invoke$1.L$1;
                kVar3 = (k) getVehicleVinUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar3 = (C8.a) objD;
                kVar4 = kVar3;
                c0704f3 = c0704f2;
                aVar4 = aVar3;
                a10 = kVar4.f30793i;
                s10 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = kVar4;
                getVehicleVinUC$invoke$1.L$1 = c0704f3;
                getVehicleVinUC$invoke$1.L$2 = aVar4;
                getVehicleVinUC$invoke$1.label = 8;
                if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (aVar4 instanceof C8.a.b) {
                    return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                }
                short s1119 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = null;
                getVehicleVinUC$invoke$1.L$1 = null;
                getVehicleVinUC$invoke$1.L$2 = null;
                getVehicleVinUC$invoke$1.label = 9;
                objD = kVar4.a(s1119, getVehicleVinUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objD;
            case 6:
                c0704f2 = (C0704f) getVehicleVinUC$invoke$1.L$1;
                kVar3 = (k) getVehicleVinUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar3 = (C8.a) objD;
                kVar4 = kVar3;
                c0704f3 = c0704f2;
                aVar4 = aVar3;
                a10 = kVar4.f30793i;
                s10 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = kVar4;
                getVehicleVinUC$invoke$1.L$1 = c0704f3;
                getVehicleVinUC$invoke$1.L$2 = aVar4;
                getVehicleVinUC$invoke$1.label = 8;
                if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (aVar4 instanceof C8.a.b) {
                    return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                }
                short s11110 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = null;
                getVehicleVinUC$invoke$1.L$1 = null;
                getVehicleVinUC$invoke$1.L$2 = null;
                getVehicleVinUC$invoke$1.label = 9;
                objD = kVar4.a(s11110, getVehicleVinUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objD;
            case 7:
                c0704f2 = (C0704f) getVehicleVinUC$invoke$1.L$1;
                kVar3 = (k) getVehicleVinUC$invoke$1.L$0;
                kotlin.b.b(objD);
                aVar3 = (C8.a) objD;
                kVar4 = kVar3;
                c0704f3 = c0704f2;
                aVar4 = aVar3;
                a10 = kVar4.f30793i;
                s10 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = kVar4;
                getVehicleVinUC$invoke$1.L$1 = c0704f3;
                getVehicleVinUC$invoke$1.L$2 = aVar4;
                getVehicleVinUC$invoke$1.label = 8;
                if (a10.a(s10, getVehicleVinUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (aVar4 instanceof C8.a.b) {
                    return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                }
                short s11111 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = null;
                getVehicleVinUC$invoke$1.L$1 = null;
                getVehicleVinUC$invoke$1.L$2 = null;
                getVehicleVinUC$invoke$1.label = 9;
                objD = kVar4.a(s11111, getVehicleVinUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objD;
            case 8:
                aVar4 = (C8.a) getVehicleVinUC$invoke$1.L$2;
                c0704f3 = (C0704f) getVehicleVinUC$invoke$1.L$1;
                kVar4 = (k) getVehicleVinUC$invoke$1.L$0;
                kotlin.b.b(objD);
                if (aVar4 instanceof C8.a.b) {
                    return kVar4.c(AnalyticsProvider$EventParamValue$VinResult.ReadViaNative, (String) ((C8.a.b) aVar4).f2463a);
                }
                short s11112 = c0704f3.f3487c;
                getVehicleVinUC$invoke$1.L$0 = null;
                getVehicleVinUC$invoke$1.L$1 = null;
                getVehicleVinUC$invoke$1.L$2 = null;
                getVehicleVinUC$invoke$1.label = 9;
                objD = kVar4.a(s11112, getVehicleVinUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objD;
            case 9:
                kotlin.b.b(objD);
                return objD;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0100  */
    public final C8.a c(AnalyticsProvider$EventParamValue$VinResult analyticsProvider$EventParamValue$VinResult, String vin) {
        C8.a c0024a;
        kotlin.jvm.internal.i.e(vin, "vin");
        if (vin.length() == 17) {
            int i10 = 0;
            char cCharAt = vin.charAt(0);
            if ('1' > cCharAt || cCharAt >= '6') {
                int length = vin.length() - 1;
                while (true) {
                    if (i10 < length) {
                        char cCharAt2 = vin.charAt(i10);
                        i10++;
                        if (cCharAt2 != vin.charAt(i10)) {
                            c0024a = new C8.a.b(p293xa.r.f47939a);
                        }
                    } else {
                        c0024a = new C8.a.C0024a(new InvalidVinException(vin));
                    }
                }
            } else {
                char cCharAt3 = vin.charAt(8);
                int iA = ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(16)) * 2) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(15)) * 3) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(14)) * 4) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(13)) * 5) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(12)) * 6) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(11)) * 7) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(10)) * 8) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(9)) * 9) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(7)) * 10) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(6)) * 2) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(5)) * 3) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(4)) * 4) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(3)) * 5) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(2)) * 6) + ((com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(1)) * 7) + (com.voltasit.obdeleven.domain.usecases.device.requests.h.a(vin.charAt(0)) * 8)))))))))))))))) % 11;
                if ((iA >= 10 || iA != com.voltasit.obdeleven.domain.usecases.device.requests.h.a(cCharAt3)) && !(iA == 10 && cCharAt3 == 'X')) {
                    c0024a = new C8.a.C0024a(new InvalidVinException(vin));
                } else {
                    c0024a = new C8.a.b(p293xa.r.f47939a);
                }
            }
        } else {
            c0024a = new C8.a.C0024a(new InvalidVinException(vin));
        }
        boolean z10 = c0024a instanceof C8.a.b;
        J8.a aVar = this.j;
        if (z10) {
            aVar.F(analyticsProvider$EventParamValue$VinResult, vin);
            return new C8.a.b(vin);
        }
        if (!(c0024a instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsProvider$EventParamValue$VinResult analyticsProvider$EventParamValue$VinResult2 = AnalyticsProvider$EventParamValue$VinResult.ReadViaObd;
        aVar.F(AnalyticsProvider$EventParamValue$VinResult.CannotRead, "");
        return new C8.a.C0024a(new InvalidVinException(vin));
    }
}
