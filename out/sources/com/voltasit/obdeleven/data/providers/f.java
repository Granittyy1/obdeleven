package com.voltasit.obdeleven.data.providers;

import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.exceptions.DeviceNotConnectedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: DeviceProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements J8.g {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.g
    public final Object a(ContinuationImpl continuationImpl) throws DeviceNotConnectedException {
        DeviceProviderImpl$readColor$1 deviceProviderImpl$readColor$1;
        Task<String> task;
        if (continuationImpl instanceof DeviceProviderImpl$readColor$1) {
            deviceProviderImpl$readColor$1 = (DeviceProviderImpl$readColor$1) continuationImpl;
            int i10 = deviceProviderImpl$readColor$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceProviderImpl$readColor$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceProviderImpl$readColor$1 = new DeviceProviderImpl$readColor$1(this, continuationImpl);
            }
        } else {
            deviceProviderImpl$readColor$1 = new DeviceProviderImpl$readColor$1(this, continuationImpl);
        }
        Object obj = deviceProviderImpl$readColor$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceProviderImpl$readColor$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.utils.bluetooth.n nVar = W7.c.f7066d;
            if ((nVar instanceof com.voltasit.obdeleven.utils.bluetooth.o ? (com.voltasit.obdeleven.utils.bluetooth.o) nVar : null) == null) {
                throw new DeviceNotConnectedException();
            }
            Task<String> taskA = new p047d8.a(300L, "17", true).a();
            Sa.a aVar = N.f43200c;
            DeviceProviderImpl$readColor$2 deviceProviderImpl$readColor$2 = new DeviceProviderImpl$readColor$2(taskA, null);
            deviceProviderImpl$readColor$1.L$0 = taskA;
            deviceProviderImpl$readColor$1.label = 1;
            if (C2680e.f(aVar, deviceProviderImpl$readColor$2, deviceProviderImpl$readColor$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            task = taskA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            task = (Task) deviceProviderImpl$readColor$1.L$0;
            kotlin.b.b(obj);
        }
        if (!task.isFaulted()) {
            return new C8.a.b(task.getResult());
        }
        Exception error = task.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.g
    public final Object b(String str, ContinuationImpl continuationImpl) throws DeviceNotConnectedException {
        DeviceProviderImpl$changePassword$1 deviceProviderImpl$changePassword$1;
        Task<Void> taskH;
        if (continuationImpl instanceof DeviceProviderImpl$changePassword$1) {
            deviceProviderImpl$changePassword$1 = (DeviceProviderImpl$changePassword$1) continuationImpl;
            int i10 = deviceProviderImpl$changePassword$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceProviderImpl$changePassword$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceProviderImpl$changePassword$1 = new DeviceProviderImpl$changePassword$1(this, continuationImpl);
            }
        } else {
            deviceProviderImpl$changePassword$1 = new DeviceProviderImpl$changePassword$1(this, continuationImpl);
        }
        Object obj = deviceProviderImpl$changePassword$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceProviderImpl$changePassword$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.utils.bluetooth.n nVar = W7.c.f7066d;
            if (nVar == null) {
                throw new DeviceNotConnectedException();
            }
            taskH = nVar.h(str);
            Sa.a aVar = N.f43200c;
            DeviceProviderImpl$changePassword$2 deviceProviderImpl$changePassword$2 = new DeviceProviderImpl$changePassword$2(taskH, null);
            deviceProviderImpl$changePassword$1.L$0 = taskH;
            deviceProviderImpl$changePassword$1.label = 1;
            if (C2680e.f(aVar, deviceProviderImpl$changePassword$2, deviceProviderImpl$changePassword$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskH = (Task) deviceProviderImpl$changePassword$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskH.isFaulted()) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        Exception error = taskH.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.g
    public final Object c(String str, ContinuationImpl continuationImpl) throws DeviceNotConnectedException {
        DeviceProviderImpl$writeColor$1 deviceProviderImpl$writeColor$1;
        Task<Void> taskA;
        if (continuationImpl instanceof DeviceProviderImpl$writeColor$1) {
            deviceProviderImpl$writeColor$1 = (DeviceProviderImpl$writeColor$1) continuationImpl;
            int i10 = deviceProviderImpl$writeColor$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceProviderImpl$writeColor$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceProviderImpl$writeColor$1 = new DeviceProviderImpl$writeColor$1(this, continuationImpl);
            }
        } else {
            deviceProviderImpl$writeColor$1 = new DeviceProviderImpl$writeColor$1(this, continuationImpl);
        }
        Object obj = deviceProviderImpl$writeColor$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceProviderImpl$writeColor$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.utils.bluetooth.n nVar = W7.c.f7066d;
            if ((nVar instanceof com.voltasit.obdeleven.utils.bluetooth.o ? (com.voltasit.obdeleven.utils.bluetooth.o) nVar : null) == null) {
                throw new DeviceNotConnectedException();
            }
            taskA = new p047d8.k(B7.b.c("18", str), true).a();
            Sa.a aVar = N.f43200c;
            DeviceProviderImpl$writeColor$2 deviceProviderImpl$writeColor$2 = new DeviceProviderImpl$writeColor$2(taskA, null);
            deviceProviderImpl$writeColor$1.L$0 = taskA;
            deviceProviderImpl$writeColor$1.label = 1;
            if (C2680e.f(aVar, deviceProviderImpl$writeColor$2, deviceProviderImpl$writeColor$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskA = (Task) deviceProviderImpl$writeColor$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskA.isFaulted()) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        Exception error = taskA.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }

    @Override // J8.g
    public final IDevice d() {
        return W7.c.f7066d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.g
    public final Object e(ContinuationImpl continuationImpl) {
        DeviceProviderImpl$readVoltage$1 deviceProviderImpl$readVoltage$1;
        Task<Float> task;
        if (continuationImpl instanceof DeviceProviderImpl$readVoltage$1) {
            deviceProviderImpl$readVoltage$1 = (DeviceProviderImpl$readVoltage$1) continuationImpl;
            int i10 = deviceProviderImpl$readVoltage$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceProviderImpl$readVoltage$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceProviderImpl$readVoltage$1 = new DeviceProviderImpl$readVoltage$1(this, continuationImpl);
            }
        } else {
            deviceProviderImpl$readVoltage$1 = new DeviceProviderImpl$readVoltage$1(this, continuationImpl);
        }
        Object obj = deviceProviderImpl$readVoltage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceProviderImpl$readVoltage$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.utils.bluetooth.n nVar = W7.c.f7066d;
            if (nVar == null) {
                return new C8.a.C0024a(new DeviceNotConnectedException());
            }
            Task<Float> taskG = nVar.g();
            Sa.a aVar = N.f43200c;
            DeviceProviderImpl$readVoltage$2 deviceProviderImpl$readVoltage$2 = new DeviceProviderImpl$readVoltage$2(taskG, null);
            deviceProviderImpl$readVoltage$1.L$0 = taskG;
            deviceProviderImpl$readVoltage$1.label = 1;
            if (C2680e.f(aVar, deviceProviderImpl$readVoltage$2, deviceProviderImpl$readVoltage$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            task = taskG;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            task = (Task) deviceProviderImpl$readVoltage$1.L$0;
            kotlin.b.b(obj);
        }
        if (!task.isFaulted()) {
            return new C8.a.b(task.getResult());
        }
        Exception error = task.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.g
    public final Object f(String str, ContinuationImpl continuationImpl) throws DeviceNotConnectedException {
        DeviceProviderImpl$calibrateVoltage$1 deviceProviderImpl$calibrateVoltage$1;
        Task taskOnSuccessTask;
        if (continuationImpl instanceof DeviceProviderImpl$calibrateVoltage$1) {
            deviceProviderImpl$calibrateVoltage$1 = (DeviceProviderImpl$calibrateVoltage$1) continuationImpl;
            int i10 = deviceProviderImpl$calibrateVoltage$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deviceProviderImpl$calibrateVoltage$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deviceProviderImpl$calibrateVoltage$1 = new DeviceProviderImpl$calibrateVoltage$1(this, continuationImpl);
            }
        } else {
            deviceProviderImpl$calibrateVoltage$1 = new DeviceProviderImpl$calibrateVoltage$1(this, continuationImpl);
        }
        Object obj = deviceProviderImpl$calibrateVoltage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = deviceProviderImpl$calibrateVoltage$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.utils.bluetooth.n nVar = W7.c.f7066d;
            if (nVar == null) {
                throw new DeviceNotConnectedException();
            }
            O.e.j("Device", "calibrateVoltage(" + str + ")");
            taskOnSuccessTask = nVar.n(1.0f).onSuccessTask(new X8.r(4, nVar)).onSuccessTask(new com.voltasit.obdeleven.utils.bluetooth.a(nVar, 1, str));
            Sa.a aVar = N.f43200c;
            DeviceProviderImpl$calibrateVoltage$2 deviceProviderImpl$calibrateVoltage$2 = new DeviceProviderImpl$calibrateVoltage$2(taskOnSuccessTask, null);
            deviceProviderImpl$calibrateVoltage$1.L$0 = taskOnSuccessTask;
            deviceProviderImpl$calibrateVoltage$1.label = 1;
            if (C2680e.f(aVar, deviceProviderImpl$calibrateVoltage$2, deviceProviderImpl$calibrateVoltage$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskOnSuccessTask = (Task) deviceProviderImpl$calibrateVoltage$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskOnSuccessTask.isFaulted()) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        Exception error = taskOnSuccessTask.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }

    @Override // J8.g
    public final p109i8.a g() {
        com.voltasit.obdeleven.utils.bluetooth.g gVar = W7.c.f7065c;
        kotlin.jvm.internal.i.d(gVar, "getBluetooth(...)");
        return gVar;
    }
}
