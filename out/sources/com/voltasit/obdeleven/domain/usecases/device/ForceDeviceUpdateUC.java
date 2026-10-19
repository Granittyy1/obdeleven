package com.voltasit.obdeleven.domain.usecases.device;

import com.voltasit.obdeleven.domain.models.FirmwareUpdateResponse;
import com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.I;

/* JADX INFO: compiled from: ForceDeviceUpdateUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ForceDeviceUpdateUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.g f30763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f30764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.a f30765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f30766d;

    /* JADX INFO: compiled from: ForceDeviceUpdateUC.kt */
    public static final class AlreadyConnectedException extends IllegalStateException {
        public AlreadyConnectedException() {
            super("Already connected");
        }
    }

    /* JADX INFO: compiled from: ForceDeviceUpdateUC.kt */
    public static final class CouldNotConnectException extends Exception {
        public CouldNotConnectException() {
            super("Could not connect");
        }
    }

    /* JADX INFO: compiled from: ForceDeviceUpdateUC.kt */
    public static final class CouldNotUpdateException extends Exception {
        public CouldNotUpdateException() {
            super("Could not update");
        }
    }

    public ForceDeviceUpdateUC(J8.g gVar, y yVar, J8.a aVar, n nVar) {
        this.f30763a = gVar;
        this.f30764b = yVar;
        this.f30765c = aVar;
        this.f30766d = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(com.voltasit.obdeleven.utils.bluetooth.o oVar, ContinuationImpl continuationImpl) throws Exception {
        ForceDeviceUpdateUC$invoke$1 forceDeviceUpdateUC$invoke$1;
        ForceDeviceUpdateUC forceDeviceUpdateUC;
        int i10;
        Object objA;
        if (continuationImpl instanceof ForceDeviceUpdateUC$invoke$1) {
            forceDeviceUpdateUC$invoke$1 = (ForceDeviceUpdateUC$invoke$1) continuationImpl;
            int i11 = forceDeviceUpdateUC$invoke$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                forceDeviceUpdateUC$invoke$1.label = i11 - Integer.MIN_VALUE;
            } else {
                forceDeviceUpdateUC$invoke$1 = new ForceDeviceUpdateUC$invoke$1(this, continuationImpl);
            }
        } else {
            forceDeviceUpdateUC$invoke$1 = new ForceDeviceUpdateUC$invoke$1(this, continuationImpl);
        }
        Object objI = forceDeviceUpdateUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = forceDeviceUpdateUC$invoke$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                oVar = (com.voltasit.obdeleven.utils.bluetooth.o) forceDeviceUpdateUC$invoke$1.L$1;
                forceDeviceUpdateUC = (ForceDeviceUpdateUC) forceDeviceUpdateUC$invoke$1.L$0;
                kotlin.b.b(objI);
            } else if (i12 == 2) {
                oVar = (com.voltasit.obdeleven.utils.bluetooth.o) forceDeviceUpdateUC$invoke$1.L$1;
                forceDeviceUpdateUC = (ForceDeviceUpdateUC) forceDeviceUpdateUC$invoke$1.L$0;
                kotlin.b.b(objI);
                if (!((Boolean) objI).booleanValue()) {
                    forceDeviceUpdateUC.f30766d.a(FirmwareUpdateResponse.BtConnectionLost, null, null);
                    return new C8.a.C0024a(new CouldNotConnectException());
                }
                y yVar = forceDeviceUpdateUC.f30764b;
                forceDeviceUpdateUC$invoke$1.L$0 = null;
                forceDeviceUpdateUC$invoke$1.L$1 = null;
                forceDeviceUpdateUC$invoke$1.label = 3;
                objA = yVar.a(oVar, forceDeviceUpdateUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objI);
                objA = ((Result) objI).b();
            }
            return objA instanceof Result.Failure ? new C8.a.C0024a(new CouldNotUpdateException()) : new C8.a.b(p293xa.r.f47939a);
        }
        kotlin.b.b(objI);
        this.f30765c.H();
        forceDeviceUpdateUC$invoke$1.L$0 = this;
        forceDeviceUpdateUC$invoke$1.L$1 = oVar;
        forceDeviceUpdateUC$invoke$1.label = 1;
        if (I.b(10000L, forceDeviceUpdateUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        forceDeviceUpdateUC = this;
        LeBluetoothDevice leBluetoothDevice = (LeBluetoothDevice) forceDeviceUpdateUC.f30763a.g();
        synchronized (leBluetoothDevice) {
            i10 = leBluetoothDevice.f34340d;
        }
        if (i10 != 0) {
            return new C8.a.C0024a(new AlreadyConnectedException());
        }
        forceDeviceUpdateUC$invoke$1.L$0 = forceDeviceUpdateUC;
        forceDeviceUpdateUC$invoke$1.L$1 = oVar;
        forceDeviceUpdateUC$invoke$1.label = 2;
        objI = leBluetoothDevice.i(oVar, forceDeviceUpdateUC$invoke$1);
        if (objI == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (!((Boolean) objI).booleanValue()) {
            forceDeviceUpdateUC.f30766d.a(FirmwareUpdateResponse.BtConnectionLost, null, null);
            return new C8.a.C0024a(new CouldNotConnectException());
        }
        y yVar2 = forceDeviceUpdateUC.f30764b;
        forceDeviceUpdateUC$invoke$1.L$0 = null;
        forceDeviceUpdateUC$invoke$1.L$1 = null;
        forceDeviceUpdateUC$invoke$1.label = 3;
        objA = yVar2.a(oVar, forceDeviceUpdateUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (objA instanceof Result.Failure) {
        }
    }
}
