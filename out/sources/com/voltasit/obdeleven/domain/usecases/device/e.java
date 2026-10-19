package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.exceptions.DeviceNotConnectedException;
import com.voltasit.obdeleven.domain.exceptions.EmptyFieldException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: CreateFirstGenDeviceUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.f f30778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.g f30779b;

    public e(K8.f fVar, J8.g gVar) {
        this.f30778a = fVar;
        this.f30779b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        CreateFirstGenDeviceUC$invoke$1 createFirstGenDeviceUC$invoke$1;
        IDevice iDevice;
        Task<Void> taskA;
        if (continuationImpl instanceof CreateFirstGenDeviceUC$invoke$1) {
            createFirstGenDeviceUC$invoke$1 = (CreateFirstGenDeviceUC$invoke$1) continuationImpl;
            int i10 = createFirstGenDeviceUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                createFirstGenDeviceUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                createFirstGenDeviceUC$invoke$1 = new CreateFirstGenDeviceUC$invoke$1(this, continuationImpl);
            }
        } else {
            createFirstGenDeviceUC$invoke$1 = new CreateFirstGenDeviceUC$invoke$1(this, continuationImpl);
        }
        Object obj = createFirstGenDeviceUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = createFirstGenDeviceUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                iDevice = (IDevice) createFirstGenDeviceUC$invoke$1.L$0;
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                taskA = (Task) createFirstGenDeviceUC$invoke$1.L$0;
                kotlin.b.b(obj);
            }
            if (taskA.isFaulted()) {
                return new C8.a.b(p293xa.r.f47939a);
            }
            Exception error = taskA.getError();
            kotlin.jvm.internal.i.d(error, "getError(...)");
            return new C8.a.C0024a(error);
        }
        kotlin.b.b(obj);
        IDevice iDeviceD = this.f30779b.d();
        if (iDeviceD == null) {
            return new C8.a.C0024a(new DeviceNotConnectedException());
        }
        String strG = kotlin.text.m.G(str, ":", "");
        createFirstGenDeviceUC$invoke$1.L$0 = iDeviceD;
        createFirstGenDeviceUC$invoke$1.label = 1;
        Object objL = this.f30778a.l(strG, str2, createFirstGenDeviceUC$invoke$1);
        if (objL == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objL;
        iDevice = iDeviceD;
        C8.a aVar = (C8.a) obj;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        G8.n nVar = (G8.n) ((C8.a.b) aVar).f2463a;
        if (nVar.f3526b.length() == 0) {
            return new C8.a.C0024a(new EmptyFieldException("serialNumber".concat(" is empty")));
        }
        iDevice.d(nVar.f3525a);
        taskA = new com.obdeleven.service.core.gen1.l("13" + nVar.f3526b, true).a();
        Sa.a aVar2 = N.f43200c;
        CreateFirstGenDeviceUC$invoke$2 createFirstGenDeviceUC$invoke$2 = new CreateFirstGenDeviceUC$invoke$2(taskA, null);
        createFirstGenDeviceUC$invoke$1.L$0 = taskA;
        createFirstGenDeviceUC$invoke$1.label = 2;
        if (C2680e.f(aVar2, createFirstGenDeviceUC$invoke$2, createFirstGenDeviceUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (taskA.isFaulted()) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        Exception error2 = taskA.getError();
        kotlin.jvm.internal.i.d(error2, "getError(...)");
        return new C8.a.C0024a(error2);
    }
}
