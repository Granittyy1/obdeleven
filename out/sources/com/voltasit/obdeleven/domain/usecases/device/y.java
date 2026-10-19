package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C2092g;
import com.voltasit.obdeleven.core.app.C2096k;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.C2804g;

/* JADX INFO: compiled from: UpdateFirmwareUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.h f30825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f30826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f30827c;

    public y(K8.h hVar, f fVar, z zVar) {
        this.f30825a = hVar;
        this.f30826b = fVar;
        this.f30827c = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(IDevice iDevice, ContinuationImpl continuationImpl) {
        UpdateFirmwareUC$invoke$1 updateFirmwareUC$invoke$1;
        Object objA;
        y yVar;
        Object objA2;
        Throwable thA;
        C2804g c2804g;
        Object objB;
        Object objA3;
        if (continuationImpl instanceof UpdateFirmwareUC$invoke$1) {
            updateFirmwareUC$invoke$1 = (UpdateFirmwareUC$invoke$1) continuationImpl;
            int i10 = updateFirmwareUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateFirmwareUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateFirmwareUC$invoke$1 = new UpdateFirmwareUC$invoke$1(this, continuationImpl);
            }
        } else {
            updateFirmwareUC$invoke$1 = new UpdateFirmwareUC$invoke$1(this, continuationImpl);
        }
        Object obj = updateFirmwareUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateFirmwareUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                iDevice = (IDevice) updateFirmwareUC$invoke$1.L$1;
                yVar = (y) updateFirmwareUC$invoke$1.L$0;
                kotlin.b.b(obj);
                objA = ((Result) obj).b();
            } else {
                if (i11 != 2) {
                    if (i11 == 3) {
                        kotlin.b.b(obj);
                        return ((Result) obj).b();
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).b();
                }
                iDevice = (IDevice) updateFirmwareUC$invoke$1.L$1;
                yVar = (y) updateFirmwareUC$invoke$1.L$0;
                kotlin.b.b(obj);
                objA2 = ((Result) obj).b();
            }
            thA = Result.a(objA2);
            if (thA == null) {
                return kotlin.b.a(thA);
            }
            c2804g = (C2804g) objA2;
            if (iDevice instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
                updateFirmwareUC$invoke$1.L$0 = null;
                updateFirmwareUC$invoke$1.L$1 = null;
                updateFirmwareUC$invoke$1.label = 3;
                objA3 = yVar.f30827c.a(c2804g, (com.voltasit.obdeleven.utils.bluetooth.o) iDevice, updateFirmwareUC$invoke$1);
                if (objA3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objA3;
            }
            kotlin.jvm.internal.i.c(iDevice, "null cannot be cast to non-null type com.voltasit.obdeleven.utils.bluetooth.Device");
            updateFirmwareUC$invoke$1.L$0 = null;
            updateFirmwareUC$invoke$1.L$1 = null;
            updateFirmwareUC$invoke$1.label = 4;
            objB = yVar.b(c2804g, (com.voltasit.obdeleven.utils.bluetooth.m) iDevice, updateFirmwareUC$invoke$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objB;
        }
        kotlin.b.b(obj);
        updateFirmwareUC$invoke$1.L$0 = this;
        updateFirmwareUC$invoke$1.L$1 = iDevice;
        updateFirmwareUC$invoke$1.label = 1;
        objA = this.f30826b.a(updateFirmwareUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        yVar = this;
        Throwable thA2 = Result.a(objA);
        if (thA2 != null) {
            return kotlin.b.a(thA2);
        }
        String str = ((G8.o) objA).f3528b;
        K8.h hVar = yVar.f30825a;
        updateFirmwareUC$invoke$1.L$0 = yVar;
        updateFirmwareUC$invoke$1.L$1 = iDevice;
        updateFirmwareUC$invoke$1.label = 2;
        objA2 = hVar.a(str, updateFirmwareUC$invoke$1);
        if (objA2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        thA = Result.a(objA2);
        if (thA == null) {
            return kotlin.b.a(thA);
        }
        c2804g = (C2804g) objA2;
        if (iDevice instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
            updateFirmwareUC$invoke$1.L$0 = null;
            updateFirmwareUC$invoke$1.L$1 = null;
            updateFirmwareUC$invoke$1.label = 3;
            objA3 = yVar.f30827c.a(c2804g, (com.voltasit.obdeleven.utils.bluetooth.o) iDevice, updateFirmwareUC$invoke$1);
            if (objA3 == coroutineSingletons) {
                return coroutineSingletons;
            }
            return objA3;
        }
        kotlin.jvm.internal.i.c(iDevice, "null cannot be cast to non-null type com.voltasit.obdeleven.utils.bluetooth.Device");
        updateFirmwareUC$invoke$1.L$0 = null;
        updateFirmwareUC$invoke$1.L$1 = null;
        updateFirmwareUC$invoke$1.label = 4;
        objB = yVar.b(c2804g, (com.voltasit.obdeleven.utils.bluetooth.m) iDevice, updateFirmwareUC$invoke$1);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(C2804g c2804g, com.voltasit.obdeleven.utils.bluetooth.m mVar, ContinuationImpl continuationImpl) {
        UpdateFirmwareUC$updateFirstGen$1 updateFirmwareUC$updateFirstGen$1;
        Object objC;
        if (continuationImpl instanceof UpdateFirmwareUC$updateFirstGen$1) {
            updateFirmwareUC$updateFirstGen$1 = (UpdateFirmwareUC$updateFirstGen$1) continuationImpl;
            int i10 = updateFirmwareUC$updateFirstGen$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateFirmwareUC$updateFirstGen$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateFirmwareUC$updateFirstGen$1 = new UpdateFirmwareUC$updateFirstGen$1(this, continuationImpl);
            }
        } else {
            updateFirmwareUC$updateFirstGen$1 = new UpdateFirmwareUC$updateFirstGen$1(this, continuationImpl);
        }
        Object obj = updateFirmwareUC$updateFirstGen$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateFirmwareUC$updateFirstGen$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            List list = c2804g.getList("firmware");
            String string = c2804g.getString("checksum");
            String string2 = c2804g.getString("version");
            mVar.getClass();
            O.e.j("Device", "updateDevice(" + string2 + ")");
            int i12 = 2;
            Task taskContinueWithTask = Task.forResult(null).continueWithTask(new V8.B(3, mVar)).onSuccessTask(new C2092g(1, mVar)).onSuccessTask(new com.voltasit.obdeleven.utils.bluetooth.k(mVar, 0, list)).onSuccessTask(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.h(mVar, 1, string)).onSuccessTask(new p022b9.a(i12, mVar)).continueWithTask(new C2096k(mVar, i12, string2));
            kotlin.jvm.internal.i.d(taskContinueWithTask, "updateDevice(...)");
            updateFirmwareUC$updateFirstGen$1.label = 1;
            objC = ParseTaskExtensionsKt.c(taskContinueWithTask, updateFirmwareUC$updateFirstGen$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            objC = ((Result) obj).b();
        }
        if (objC instanceof Result.Failure) {
            return objC;
        }
        return p293xa.r.f47939a;
    }
}
