package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.C2804g;

/* JADX INFO: compiled from: IsDeviceUpdateNeededUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.h f30796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f30798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f30799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J8.u f30800e;

    public m(K8.h hVar, J8.p pVar, f fVar, l lVar, J8.u uVar) {
        this.f30796a = hVar;
        this.f30797b = pVar;
        this.f30798c = fVar;
        this.f30799d = lVar;
        this.f30800e = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(IDevice iDevice, ContinuationImpl continuationImpl) throws Throwable {
        IsDeviceUpdateNeededUC$invoke$1 isDeviceUpdateNeededUC$invoke$1;
        m mVar;
        m mVar2;
        boolean z10;
        boolean zBooleanValue;
        if (continuationImpl instanceof IsDeviceUpdateNeededUC$invoke$1) {
            isDeviceUpdateNeededUC$invoke$1 = (IsDeviceUpdateNeededUC$invoke$1) continuationImpl;
            int i10 = isDeviceUpdateNeededUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isDeviceUpdateNeededUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isDeviceUpdateNeededUC$invoke$1 = new IsDeviceUpdateNeededUC$invoke$1(this, continuationImpl);
            }
        } else {
            isDeviceUpdateNeededUC$invoke$1 = new IsDeviceUpdateNeededUC$invoke$1(this, continuationImpl);
        }
        Object objA = isDeviceUpdateNeededUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isDeviceUpdateNeededUC$invoke$1.label;
        int i12 = 1;
        if (i11 != 0) {
            if (i11 == 1) {
                iDevice = (IDevice) isDeviceUpdateNeededUC$invoke$1.L$1;
                mVar = (m) isDeviceUpdateNeededUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = isDeviceUpdateNeededUC$invoke$1.Z$0;
                mVar2 = (m) isDeviceUpdateNeededUC$invoke$1.L$0;
                kotlin.b.b(objA);
            }
            zBooleanValue = ((Boolean) objA).booleanValue();
            mVar2.f30797b.e("IsDeviceUpdateNeededUC", "Device firmware update required: " + zBooleanValue);
            if (!z10 && zBooleanValue) {
                i12 = 4;
            } else if (z10) {
                i12 = 3;
            } else if (!zBooleanValue) {
                i12 = 0;
            }
            return new Integer(i12);
        }
        kotlin.b.b(objA);
        isDeviceUpdateNeededUC$invoke$1.L$0 = this;
        isDeviceUpdateNeededUC$invoke$1.L$1 = iDevice;
        isDeviceUpdateNeededUC$invoke$1.label = 1;
        objA = this.f30799d.a(iDevice, isDeviceUpdateNeededUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        mVar = this;
        boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
        mVar.f30797b.e("IsDeviceUpdateNeededUC", "Bluetooth firmware update required: " + zBooleanValue2);
        isDeviceUpdateNeededUC$invoke$1.L$0 = mVar;
        isDeviceUpdateNeededUC$invoke$1.L$1 = null;
        isDeviceUpdateNeededUC$invoke$1.Z$0 = zBooleanValue2;
        isDeviceUpdateNeededUC$invoke$1.label = 2;
        Object objB = mVar.b(iDevice, isDeviceUpdateNeededUC$invoke$1);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        mVar2 = mVar;
        objA = objB;
        z10 = zBooleanValue2;
        zBooleanValue = ((Boolean) objA).booleanValue();
        mVar2.f30797b.e("IsDeviceUpdateNeededUC", "Device firmware update required: " + zBooleanValue);
        if (!z10) {
            if (z10) {
                i12 = 3;
            } else if (!zBooleanValue) {
                i12 = 0;
            }
        } else if (z10) {
            i12 = 3;
        } else if (!zBooleanValue) {
            i12 = 0;
        }
        return new Integer(i12);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x012b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x012c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0135  */
    /* JADX WARN: Code duplicated, block: B:51:0x016b  */
    /* JADX WARN: Code duplicated, block: B:53:0x016e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00d8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0135, please report this as an issue */
    public final Object b(IDevice iDevice, ContinuationImpl continuationImpl) {
        IsDeviceUpdateNeededUC$isFwUpdateRequired$1 isDeviceUpdateNeededUC$isFwUpdateRequired$1;
        IDevice iDevice2;
        Object objA;
        m mVar;
        m mVar2;
        IDevice iDevice3;
        Object objB;
        C2804g c2804g;
        String version;
        String string;
        Object objC;
        C2804g c2804g2;
        Object objB2;
        m mVar3;
        String str;
        if (continuationImpl instanceof IsDeviceUpdateNeededUC$isFwUpdateRequired$1) {
            isDeviceUpdateNeededUC$isFwUpdateRequired$1 = (IsDeviceUpdateNeededUC$isFwUpdateRequired$1) continuationImpl;
            int i10 = isDeviceUpdateNeededUC$isFwUpdateRequired$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isDeviceUpdateNeededUC$isFwUpdateRequired$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isDeviceUpdateNeededUC$isFwUpdateRequired$1 = new IsDeviceUpdateNeededUC$isFwUpdateRequired$1(this, continuationImpl);
            }
        } else {
            isDeviceUpdateNeededUC$isFwUpdateRequired$1 = new IsDeviceUpdateNeededUC$isFwUpdateRequired$1(this, continuationImpl);
        }
        Object obj = isDeviceUpdateNeededUC$isFwUpdateRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isDeviceUpdateNeededUC$isFwUpdateRequired$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                IDevice iDevice4 = (IDevice) isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$1;
                mVar = (m) isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$0;
                kotlin.b.b(obj);
                objA = ((Result) obj).b();
                iDevice2 = iDevice4;
            } else {
                if (i11 == 2) {
                    iDevice3 = (IDevice) isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$1;
                    mVar2 = (m) isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$0;
                    kotlin.b.b(obj);
                    objB = ((Result) obj).b();
                    if (Result.a(objB) == null) {
                        return Boolean.FALSE;
                    }
                    c2804g = (C2804g) objB;
                    J8.p pVar = mVar2.f30797b;
                    version = iDevice3.getVersion();
                    if (version == null) {
                        version = "";
                    }
                    String string2 = c2804g.getString("version");
                    pVar.f("IsDeviceUpdateNeededUC", B6.c.d("Device firmware: ", version, ", available: ", string2 != null ? string2 : ""));
                    if ((iDevice3 instanceof com.voltasit.obdeleven.utils.bluetooth.o) && (string = c2804g.getString("checksum")) != null && string.length() > 0) {
                        mVar2.f30797b.e("IsDeviceUpdateNeededUC", "Verifying checksum");
                        Task<String> taskA = new p047d8.c("1B", true).a();
                        isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$0 = mVar2;
                        isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$1 = iDevice3;
                        isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$2 = c2804g;
                        isDeviceUpdateNeededUC$isFwUpdateRequired$1.label = 3;
                        objC = ParseTaskExtensionsKt.c(taskA, isDeviceUpdateNeededUC$isFwUpdateRequired$1);
                        if (objC == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c2804g2 = c2804g;
                        objB2 = objC;
                        mVar3 = mVar2;
                    }
                    return Boolean.valueOf((mVar2.f30800e.m() || kotlin.jvm.internal.i.a(iDevice3.getVersion(), c2804g.getString("version"))) ? false : true);
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2804g2 = (C2804g) isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$2;
                iDevice3 = (IDevice) isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$1;
                mVar3 = (m) isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$0;
                kotlin.b.b(obj);
                objB2 = ((Result) obj).b();
            }
            if (Result.a(objB2) == null) {
                return Boolean.TRUE;
            }
            str = (String) objB2;
            mVar3.f30797b.f("IsDeviceUpdateNeededUC", "Checksum: " + c2804g2.getString("checksum"));
            mVar3.f30797b.f("IsDeviceUpdateNeededUC", "Actual checksum: " + str);
            if (!kotlin.jvm.internal.i.a(str, c2804g2.getString("checksum"))) {
                return Boolean.TRUE;
            }
            mVar2 = mVar3;
            c2804g = c2804g2;
            return Boolean.valueOf((mVar2.f30800e.m() || kotlin.jvm.internal.i.a(iDevice3.getVersion(), c2804g.getString("version"))) ? false : true);
        }
        kotlin.b.b(obj);
        this.f30797b.f("IsDeviceUpdateNeededUC", B7.b.c("Current firmware: ", iDevice.getVersion()));
        isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$0 = this;
        iDevice2 = iDevice;
        isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$1 = iDevice2;
        isDeviceUpdateNeededUC$isFwUpdateRequired$1.label = 1;
        objA = this.f30798c.a(isDeviceUpdateNeededUC$isFwUpdateRequired$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        mVar = this;
        Throwable thA = Result.a(objA);
        if (thA != null) {
            mVar.f30797b.d(thA, false);
            return Boolean.FALSE;
        }
        G8.o oVar = (G8.o) objA;
        mVar.f30797b.f("IsDeviceUpdateNeededUC", "Latest firmware info: " + oVar);
        String str2 = oVar.f3528b;
        isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$0 = mVar;
        isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$1 = iDevice2;
        isDeviceUpdateNeededUC$isFwUpdateRequired$1.label = 2;
        Object objA2 = mVar.f30796a.a(str2, isDeviceUpdateNeededUC$isFwUpdateRequired$1);
        if (objA2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        mVar2 = mVar;
        iDevice3 = iDevice2;
        objB = objA2;
        if (Result.a(objB) == null) {
            return Boolean.FALSE;
        }
        c2804g = (C2804g) objB;
        J8.p pVar2 = mVar2.f30797b;
        version = iDevice3.getVersion();
        if (version == null) {
            version = "";
        }
        String string3 = c2804g.getString("version");
        pVar2.f("IsDeviceUpdateNeededUC", B6.c.d("Device firmware: ", version, ", available: ", string3 != null ? string3 : ""));
        if (iDevice3 instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
            mVar2.f30797b.e("IsDeviceUpdateNeededUC", "Verifying checksum");
            Task<String> taskA2 = new p047d8.c("1B", true).a();
            isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$0 = mVar2;
            isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$1 = iDevice3;
            isDeviceUpdateNeededUC$isFwUpdateRequired$1.L$2 = c2804g;
            isDeviceUpdateNeededUC$isFwUpdateRequired$1.label = 3;
            objC = ParseTaskExtensionsKt.c(taskA2, isDeviceUpdateNeededUC$isFwUpdateRequired$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2804g2 = c2804g;
            objB2 = objC;
            mVar3 = mVar2;
            if (Result.a(objB2) == null) {
                return Boolean.TRUE;
            }
            str = (String) objB2;
            mVar3.f30797b.f("IsDeviceUpdateNeededUC", "Checksum: " + c2804g2.getString("checksum"));
            mVar3.f30797b.f("IsDeviceUpdateNeededUC", "Actual checksum: " + str);
            if (!kotlin.jvm.internal.i.a(str, c2804g2.getString("checksum"))) {
                return Boolean.TRUE;
            }
            mVar2 = mVar3;
            c2804g = c2804g2;
        }
        return Boolean.valueOf((mVar2.f30800e.m() || kotlin.jvm.internal.i.a(iDevice3.getVersion(), c2804g.getString("version"))) ? false : true);
    }
}
