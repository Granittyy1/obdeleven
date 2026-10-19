package com.voltasit.obdeleven.domain.usecases.device;

import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C2105u;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: UpdateSecondGenFirmwareUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class A {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(com.voltasit.obdeleven.utils.bluetooth.o oVar, ContinuationImpl continuationImpl) {
        UpdateSecondGenFirmwareUCKt$readIsGen3$1 updateSecondGenFirmwareUCKt$readIsGen3$1;
        if (continuationImpl instanceof UpdateSecondGenFirmwareUCKt$readIsGen3$1) {
            updateSecondGenFirmwareUCKt$readIsGen3$1 = (UpdateSecondGenFirmwareUCKt$readIsGen3$1) continuationImpl;
            int i10 = updateSecondGenFirmwareUCKt$readIsGen3$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateSecondGenFirmwareUCKt$readIsGen3$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateSecondGenFirmwareUCKt$readIsGen3$1 = new UpdateSecondGenFirmwareUCKt$readIsGen3$1(continuationImpl);
            }
        } else {
            updateSecondGenFirmwareUCKt$readIsGen3$1 = new UpdateSecondGenFirmwareUCKt$readIsGen3$1(continuationImpl);
        }
        Object objB = updateSecondGenFirmwareUCKt$readIsGen3$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateSecondGenFirmwareUCKt$readIsGen3$1.label;
        boolean z10 = false;
        try {
            if (i11 == 0) {
                kotlin.b.b(objB);
                oVar.getClass();
                Task<TContinuationResult> taskOnSuccess = new p059e8.a("08", true).a().onSuccess(new C2105u(1));
                kotlin.jvm.internal.i.d(taskOnSuccess, "readGeneration(...)");
                updateSecondGenFirmwareUCKt$readIsGen3$1.label = 1;
                objB = ParseTaskExtensionsKt.b(taskOnSuccess, updateSecondGenFirmwareUCKt$readIsGen3$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objB);
            }
            Integer num = (Integer) objB;
            z10 = num != null && num.intValue() == 3;
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z10);
    }
}
