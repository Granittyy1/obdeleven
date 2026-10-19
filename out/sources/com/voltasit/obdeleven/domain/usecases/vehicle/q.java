package com.voltasit.obdeleven.domain.usecases.vehicle;

import J8.x;
import com.obdeleven.service.model.VehicleConnectState;
import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p134k8.a2;

/* JADX INFO: compiled from: ReadControlUnitsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f31070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f31071b;

    public q(x xVar, J8.p pVar) {
        this.f31070a = xVar;
        this.f31071b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object a(ContinuationImpl continuationImpl) {
        ReadControlUnitsUC$invoke$1 readControlUnitsUC$invoke$1;
        Task taskContinueWithTask;
        int i10 = 0;
        if (continuationImpl instanceof ReadControlUnitsUC$invoke$1) {
            readControlUnitsUC$invoke$1 = (ReadControlUnitsUC$invoke$1) continuationImpl;
            int i11 = readControlUnitsUC$invoke$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readControlUnitsUC$invoke$1.label = i11 - Integer.MIN_VALUE;
            } else {
                readControlUnitsUC$invoke$1 = new ReadControlUnitsUC$invoke$1(this, continuationImpl);
            }
        } else {
            readControlUnitsUC$invoke$1 = new ReadControlUnitsUC$invoke$1(this, continuationImpl);
        }
        Object obj = readControlUnitsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = readControlUnitsUC$invoke$1.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            J8.p pVar = this.f31071b;
            pVar.f("ReadControlUnitsUC", "ReadControlUnitsUC()");
            VehicleConnectState[] vehicleConnectStateArr = VehicleConnectState.f29419b;
            x xVar = this.f31070a;
            xVar.e();
            a2 a2VarK = xVar.k();
            if (!a2VarK.j()) {
                pVar.e("ReadControlUnitsUC", "Vehicle is not supported");
                return new C8.a.b(p293xa.r.f47939a);
            }
            taskContinueWithTask = a2VarK.c(false).continueWithTask(new p(this, i10, a2VarK));
            Sa.a aVar = N.f43200c;
            ReadControlUnitsUC$invoke$2 readControlUnitsUC$invoke$2 = new ReadControlUnitsUC$invoke$2(taskContinueWithTask, null);
            readControlUnitsUC$invoke$1.L$0 = taskContinueWithTask;
            readControlUnitsUC$invoke$1.label = 1;
            if (C2680e.f(aVar, readControlUnitsUC$invoke$2, readControlUnitsUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskContinueWithTask = (Task) readControlUnitsUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskContinueWithTask.isFaulted()) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        Exception error = taskContinueWithTask.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }
}
