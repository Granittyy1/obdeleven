package com.voltasit.obdeleven.domain.usecases.device;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: SendRequestCommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SendRequestCommandUC$invoke$1 sendRequestCommandUC$invoke$1;
        Task<String> taskA;
        if (continuationImpl instanceof SendRequestCommandUC$invoke$1) {
            sendRequestCommandUC$invoke$1 = (SendRequestCommandUC$invoke$1) continuationImpl;
            int i10 = sendRequestCommandUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sendRequestCommandUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sendRequestCommandUC$invoke$1 = new SendRequestCommandUC$invoke$1(this, continuationImpl);
            }
        } else {
            sendRequestCommandUC$invoke$1 = new SendRequestCommandUC$invoke$1(this, continuationImpl);
        }
        Object obj = sendRequestCommandUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sendRequestCommandUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            taskA = new q(str, 1000L).a();
            Sa.a aVar = N.f43200c;
            SendRequestCommandUC$invoke$2 sendRequestCommandUC$invoke$2 = new SendRequestCommandUC$invoke$2(taskA, null);
            sendRequestCommandUC$invoke$1.L$0 = taskA;
            sendRequestCommandUC$invoke$1.label = 1;
            if (C2680e.f(aVar, sendRequestCommandUC$invoke$2, sendRequestCommandUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskA = (Task) sendRequestCommandUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskA.isFaulted()) {
            return new C8.a.b(taskA.getResult());
        }
        Exception error = taskA.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }
}
