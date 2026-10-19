package com.voltasit.obdeleven.domain.usecases.controlUnit;

import J8.p;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.fault.Fault;
import com.parse.boltsinternal.Task;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.F0;
import kotlinx.coroutines.G0;
import p293xa.r;

/* JADX INFO: compiled from: ScanControlUnitUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ScanControlUnitUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f f30646b;

    public ScanControlUnitUC(p pVar, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f fVar) {
        this.f30645a = pVar;
        this.f30646b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(ScanControlUnitUC scanControlUnitUC, p109i8.e eVar, ContinuationImpl continuationImpl) {
        ScanControlUnitUC$tryDisconnect$1 scanControlUnitUC$tryDisconnect$1;
        scanControlUnitUC.getClass();
        if (continuationImpl instanceof ScanControlUnitUC$tryDisconnect$1) {
            scanControlUnitUC$tryDisconnect$1 = (ScanControlUnitUC$tryDisconnect$1) continuationImpl;
            int i10 = scanControlUnitUC$tryDisconnect$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scanControlUnitUC$tryDisconnect$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scanControlUnitUC$tryDisconnect$1 = new ScanControlUnitUC$tryDisconnect$1(scanControlUnitUC, continuationImpl);
            }
        } else {
            scanControlUnitUC$tryDisconnect$1 = new ScanControlUnitUC$tryDisconnect$1(scanControlUnitUC, continuationImpl);
        }
        Object obj = scanControlUnitUC$tryDisconnect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scanControlUnitUC$tryDisconnect$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                Task<Boolean> taskA = eVar.a();
                i.d(taskA, "disconnect(...)");
                scanControlUnitUC$tryDisconnect$1.L$0 = scanControlUnitUC;
                scanControlUnitUC$tryDisconnect$1.label = 1;
                Object objS = O3.d.s(taskA, scanControlUnitUC$tryDisconnect$1);
                scanControlUnitUC = objS;
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ScanControlUnitUC scanControlUnitUC2 = (ScanControlUnitUC) scanControlUnitUC$tryDisconnect$1.L$0;
                kotlin.b.b(obj);
                scanControlUnitUC = scanControlUnitUC2;
            }
        } catch (Throwable th) {
            scanControlUnitUC.f30645a.d(th, false);
        }
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(ScanControlUnitUC scanControlUnitUC, p109i8.e eVar, boolean z10, ContinuationImpl continuationImpl) {
        ScanControlUnitUC$tryReadControlUnitFaults$1 scanControlUnitUC$tryReadControlUnitFaults$1;
        scanControlUnitUC.getClass();
        if (continuationImpl instanceof ScanControlUnitUC$tryReadControlUnitFaults$1) {
            scanControlUnitUC$tryReadControlUnitFaults$1 = (ScanControlUnitUC$tryReadControlUnitFaults$1) continuationImpl;
            int i10 = scanControlUnitUC$tryReadControlUnitFaults$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scanControlUnitUC$tryReadControlUnitFaults$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scanControlUnitUC$tryReadControlUnitFaults$1 = new ScanControlUnitUC$tryReadControlUnitFaults$1(scanControlUnitUC, continuationImpl);
            }
        } else {
            scanControlUnitUC$tryReadControlUnitFaults$1 = new ScanControlUnitUC$tryReadControlUnitFaults$1(scanControlUnitUC, continuationImpl);
        }
        Object objS = scanControlUnitUC$tryReadControlUnitFaults$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scanControlUnitUC$tryReadControlUnitFaults$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objS);
                Task<List<Fault>> taskO = eVar.o(false, z10);
                i.d(taskO, "readFaults(...)");
                scanControlUnitUC$tryReadControlUnitFaults$1.L$0 = scanControlUnitUC;
                scanControlUnitUC$tryReadControlUnitFaults$1.label = 1;
                objS = O3.d.s(taskO, scanControlUnitUC$tryReadControlUnitFaults$1);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scanControlUnitUC = (ScanControlUnitUC) scanControlUnitUC$tryReadControlUnitFaults$1.L$0;
                kotlin.b.b(objS);
            }
            return new C8.a.b(objS);
        } catch (Throwable th) {
            scanControlUnitUC.f30645a.d(th, false);
            return new C8.a.C0024a(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(ScanControlUnitUC scanControlUnitUC, p109i8.e eVar, ContinuationImpl continuationImpl) {
        ScanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1 scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1;
        ScanControlUnitUC scanControlUnitUC2;
        p109i8.e eVar2;
        scanControlUnitUC.getClass();
        if (continuationImpl instanceof ScanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1) {
            scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1 = (ScanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1) continuationImpl;
            int i10 = scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1 = new ScanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1(scanControlUnitUC, continuationImpl);
            }
        } else {
            scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1 = new ScanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1(scanControlUnitUC, continuationImpl);
        }
        Object objE = scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                eVar = (p109i8.e) scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$1;
                scanControlUnitUC = (ScanControlUnitUC) scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$0;
                kotlin.b.b(objE);
            } else if (i11 == 2) {
                eVar2 = (p109i8.e) scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$1;
                scanControlUnitUC2 = (ScanControlUnitUC) scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$0;
                kotlin.b.b(objE);
                ScanControlUnitUC scanControlUnitUC3 = scanControlUnitUC2;
                eVar = eVar2;
                scanControlUnitUC = scanControlUnitUC3;
                scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$0 = null;
                scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$1 = null;
                scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.label = 3;
                if (scanControlUnitUC.f(eVar, scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objE);
            }
            return r.f47939a;
        }
        kotlin.b.b(objE);
        scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$0 = scanControlUnitUC;
        scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$1 = eVar;
        scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.label = 1;
        objE = scanControlUnitUC.e(eVar, scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1);
        if (objE == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (!((Boolean) objE).booleanValue() || eVar.s() == ControlUnit.RequestSID.f29346d || eVar.i() == ApplicationProtocol.f29264d) {
            scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$0 = scanControlUnitUC;
            scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$1 = eVar;
            scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.label = 2;
            if (scanControlUnitUC.g(eVar, scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            p109i8.e eVar3 = eVar;
            scanControlUnitUC2 = scanControlUnitUC;
            eVar2 = eVar3;
            ScanControlUnitUC scanControlUnitUC4 = scanControlUnitUC2;
            eVar = eVar2;
            scanControlUnitUC = scanControlUnitUC4;
        }
        scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$0 = null;
        scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.L$1 = null;
        scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1.label = 3;
        if (scanControlUnitUC.f(eVar, scanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }

    public final Object d(p109i8.e eVar, boolean z10, boolean z11, kotlin.coroutines.c<? super C8.a<? extends List<? extends Fault>>> cVar) throws Throwable {
        Object objA = G0.a(new F0(300000L, (ContinuationImpl) cVar), new ScanControlUnitUC$invoke$2(this, eVar, z11, z10, null));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(p109i8.e eVar, ContinuationImpl continuationImpl) {
        ScanControlUnitUC$tryIdentifyControlUnitInfo$1 scanControlUnitUC$tryIdentifyControlUnitInfo$1;
        ScanControlUnitUC scanControlUnitUC;
        if (continuationImpl instanceof ScanControlUnitUC$tryIdentifyControlUnitInfo$1) {
            scanControlUnitUC$tryIdentifyControlUnitInfo$1 = (ScanControlUnitUC$tryIdentifyControlUnitInfo$1) continuationImpl;
            int i10 = scanControlUnitUC$tryIdentifyControlUnitInfo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scanControlUnitUC$tryIdentifyControlUnitInfo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scanControlUnitUC$tryIdentifyControlUnitInfo$1 = new ScanControlUnitUC$tryIdentifyControlUnitInfo$1(this, continuationImpl);
            }
        } else {
            scanControlUnitUC$tryIdentifyControlUnitInfo$1 = new ScanControlUnitUC$tryIdentifyControlUnitInfo$1(this, continuationImpl);
        }
        Object obj = scanControlUnitUC$tryIdentifyControlUnitInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scanControlUnitUC$tryIdentifyControlUnitInfo$1.label;
        boolean z10 = true;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                Task<Boolean> taskC = eVar.c();
                i.d(taskC, "identifyInfo(...)");
                scanControlUnitUC$tryIdentifyControlUnitInfo$1.L$0 = this;
                scanControlUnitUC$tryIdentifyControlUnitInfo$1.label = 1;
                if (O3.d.s(taskC, scanControlUnitUC$tryIdentifyControlUnitInfo$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                th = th;
                scanControlUnitUC = this;
                z10 = false;
                scanControlUnitUC.f30645a.d(th, false);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scanControlUnitUC = (ScanControlUnitUC) scanControlUnitUC$tryIdentifyControlUnitInfo$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
                scanControlUnitUC.f30645a.d(th, false);
            }
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(p109i8.e eVar, ContinuationImpl continuationImpl) {
        ScanControlUnitUC$tryIdentifySubSystems$1 scanControlUnitUC$tryIdentifySubSystems$1;
        ScanControlUnitUC scanControlUnitUC;
        if (continuationImpl instanceof ScanControlUnitUC$tryIdentifySubSystems$1) {
            scanControlUnitUC$tryIdentifySubSystems$1 = (ScanControlUnitUC$tryIdentifySubSystems$1) continuationImpl;
            int i10 = scanControlUnitUC$tryIdentifySubSystems$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scanControlUnitUC$tryIdentifySubSystems$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scanControlUnitUC$tryIdentifySubSystems$1 = new ScanControlUnitUC$tryIdentifySubSystems$1(this, continuationImpl);
            }
        } else {
            scanControlUnitUC$tryIdentifySubSystems$1 = new ScanControlUnitUC$tryIdentifySubSystems$1(this, continuationImpl);
        }
        Object obj = scanControlUnitUC$tryIdentifySubSystems$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scanControlUnitUC$tryIdentifySubSystems$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                Task<Void> taskL = eVar.l();
                i.d(taskL, "identifySubSystems(...)");
                scanControlUnitUC$tryIdentifySubSystems$1.L$0 = this;
                scanControlUnitUC$tryIdentifySubSystems$1.label = 1;
                if (O3.d.s(taskL, scanControlUnitUC$tryIdentifySubSystems$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                th = th;
                scanControlUnitUC = this;
                scanControlUnitUC.f30645a.d(th, false);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scanControlUnitUC = (ScanControlUnitUC) scanControlUnitUC$tryIdentifySubSystems$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                scanControlUnitUC.f30645a.d(th, false);
            }
        }
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(p109i8.e eVar, ContinuationImpl continuationImpl) {
        ScanControlUnitUC$tryReadControlUnitLongCoding$1 scanControlUnitUC$tryReadControlUnitLongCoding$1;
        ScanControlUnitUC scanControlUnitUC;
        if (continuationImpl instanceof ScanControlUnitUC$tryReadControlUnitLongCoding$1) {
            scanControlUnitUC$tryReadControlUnitLongCoding$1 = (ScanControlUnitUC$tryReadControlUnitLongCoding$1) continuationImpl;
            int i10 = scanControlUnitUC$tryReadControlUnitLongCoding$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scanControlUnitUC$tryReadControlUnitLongCoding$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scanControlUnitUC$tryReadControlUnitLongCoding$1 = new ScanControlUnitUC$tryReadControlUnitLongCoding$1(this, continuationImpl);
            }
        } else {
            scanControlUnitUC$tryReadControlUnitLongCoding$1 = new ScanControlUnitUC$tryReadControlUnitLongCoding$1(this, continuationImpl);
        }
        Object obj = scanControlUnitUC$tryReadControlUnitLongCoding$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scanControlUnitUC$tryReadControlUnitLongCoding$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            try {
                Task<Boolean> taskE = eVar.e();
                i.d(taskE, "readLongCoding(...)");
                scanControlUnitUC$tryReadControlUnitLongCoding$1.L$0 = this;
                scanControlUnitUC$tryReadControlUnitLongCoding$1.label = 1;
                if (O3.d.s(taskE, scanControlUnitUC$tryReadControlUnitLongCoding$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                th = th;
                scanControlUnitUC = this;
                scanControlUnitUC.f30645a.d(th, false);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scanControlUnitUC = (ScanControlUnitUC) scanControlUnitUC$tryReadControlUnitLongCoding$1.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th2) {
                th = th2;
                scanControlUnitUC.f30645a.d(th, false);
            }
        }
        return r.f47939a;
    }
}
