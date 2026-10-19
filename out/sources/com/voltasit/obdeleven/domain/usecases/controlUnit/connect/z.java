package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: ConnectUdsCommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        ConnectUdsCommandUC$invoke$1 connectUdsCommandUC$invoke$1;
        Task<String> task;
        if (continuationImpl instanceof ConnectUdsCommandUC$invoke$1) {
            connectUdsCommandUC$invoke$1 = (ConnectUdsCommandUC$invoke$1) continuationImpl;
            int i10 = connectUdsCommandUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectUdsCommandUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectUdsCommandUC$invoke$1 = new ConnectUdsCommandUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectUdsCommandUC$invoke$1 = new ConnectUdsCommandUC$invoke$1(this, continuationImpl);
        }
        Object obj = connectUdsCommandUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectUdsCommandUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Task<String> taskA = new com.obdeleven.service.core.gen1.b().a();
            Sa.a aVar = N.f43200c;
            ConnectUdsCommandUC$invoke$2 connectUdsCommandUC$invoke$2 = new ConnectUdsCommandUC$invoke$2(taskA, null);
            connectUdsCommandUC$invoke$1.L$0 = taskA;
            connectUdsCommandUC$invoke$1.label = 1;
            if (C2680e.f(aVar, connectUdsCommandUC$invoke$2, connectUdsCommandUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            task = taskA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            task = (Task) connectUdsCommandUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        if (!task.isFaulted()) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        Exception error = task.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }
}
