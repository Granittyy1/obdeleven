package com.voltasit.obdeleven.domain.usecases.device;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: SendIoCtlCommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SendIoCtlCommandUC$invoke$1 sendIoCtlCommandUC$invoke$1;
        Task<String> taskA;
        if (continuationImpl instanceof SendIoCtlCommandUC$invoke$1) {
            sendIoCtlCommandUC$invoke$1 = (SendIoCtlCommandUC$invoke$1) continuationImpl;
            int i10 = sendIoCtlCommandUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sendIoCtlCommandUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sendIoCtlCommandUC$invoke$1 = new SendIoCtlCommandUC$invoke$1(this, continuationImpl);
            }
        } else {
            sendIoCtlCommandUC$invoke$1 = new SendIoCtlCommandUC$invoke$1(this, continuationImpl);
        }
        Object obj = sendIoCtlCommandUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sendIoCtlCommandUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            taskA = new com.obdeleven.service.core.gen1.c(str).a();
            Sa.a aVar = N.f43200c;
            SendIoCtlCommandUC$invoke$2 sendIoCtlCommandUC$invoke$2 = new SendIoCtlCommandUC$invoke$2(taskA, null);
            sendIoCtlCommandUC$invoke$1.L$0 = taskA;
            sendIoCtlCommandUC$invoke$1.label = 1;
            if (C2680e.f(aVar, sendIoCtlCommandUC$invoke$2, sendIoCtlCommandUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskA = (Task) sendIoCtlCommandUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskA.isFaulted()) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        Exception error = taskA.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }
}
