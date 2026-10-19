package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.domain.exceptions.DeviceNotConnectedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetDeviceFirmwareInfoUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.u f30780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.g f30781b;

    public f(J8.u uVar, J8.g gVar) {
        this.f30780a = uVar;
        this.f30781b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetDeviceFirmwareInfoUC$invoke$1 getDeviceFirmwareInfoUC$invoke$1;
        IDevice iDeviceD;
        f fVar;
        IDevice iDevice;
        String strD;
        if (continuationImpl instanceof GetDeviceFirmwareInfoUC$invoke$1) {
            getDeviceFirmwareInfoUC$invoke$1 = (GetDeviceFirmwareInfoUC$invoke$1) continuationImpl;
            int i10 = getDeviceFirmwareInfoUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getDeviceFirmwareInfoUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getDeviceFirmwareInfoUC$invoke$1 = new GetDeviceFirmwareInfoUC$invoke$1(this, continuationImpl);
            }
        } else {
            getDeviceFirmwareInfoUC$invoke$1 = new GetDeviceFirmwareInfoUC$invoke$1(this, continuationImpl);
        }
        Object obj = getDeviceFirmwareInfoUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getDeviceFirmwareInfoUC$invoke$1.label;
        int i12 = 1;
        if (i11 == 0) {
            kotlin.b.b(obj);
            iDeviceD = this.f30781b.d();
            if (iDeviceD == null) {
                return kotlin.b.a(new DeviceNotConnectedException());
            }
            if (iDeviceD instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
                getDeviceFirmwareInfoUC$invoke$1.L$0 = this;
                getDeviceFirmwareInfoUC$invoke$1.L$1 = iDeviceD;
                getDeviceFirmwareInfoUC$invoke$1.label = 1;
                Object objA = A.a((com.voltasit.obdeleven.utils.bluetooth.o) iDeviceD, getDeviceFirmwareInfoUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                iDevice = iDeviceD;
                obj = objA;
                fVar = this;
            } else {
                fVar = this;
            }
            if (iDeviceD instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
                strD = fVar.f30780a.d();
            } else if (i12 == 3) {
                strD = fVar.f30780a.c();
            } else {
                strD = fVar.f30780a.g();
            }
            return new G8.o(i12, strD);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iDevice = (IDevice) getDeviceFirmwareInfoUC$invoke$1.L$1;
        fVar = (f) getDeviceFirmwareInfoUC$invoke$1.L$0;
        kotlin.b.b(obj);
        if (((Boolean) obj).booleanValue()) {
            iDeviceD = iDevice;
            i12 = 3;
        } else {
            i12 = 2;
            iDeviceD = iDevice;
        }
        if (iDeviceD instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
            strD = fVar.f30780a.d();
        } else if (i12 == 3) {
            strD = fVar.f30780a.c();
        } else {
            strD = fVar.f30780a.g();
        }
        return new G8.o(i12, strD);
    }
}
