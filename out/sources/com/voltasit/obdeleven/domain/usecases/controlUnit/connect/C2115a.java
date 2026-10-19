package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.controlUnit.connect.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ConnectObd2CommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2115a {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        ConnectObd2CommandUC$invoke$1 connectObd2CommandUC$invoke$1;
        Task<String> task;
        if (continuationImpl instanceof ConnectObd2CommandUC$invoke$1) {
            connectObd2CommandUC$invoke$1 = (ConnectObd2CommandUC$invoke$1) continuationImpl;
            int i10 = connectObd2CommandUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectObd2CommandUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectObd2CommandUC$invoke$1 = new ConnectObd2CommandUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectObd2CommandUC$invoke$1 = new ConnectObd2CommandUC$invoke$1(this, continuationImpl);
        }
        Object obj = connectObd2CommandUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectObd2CommandUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Task<String> taskA = new com.obdeleven.service.core.gen1.a().a();
            Sa.a aVar = N.f43200c;
            ConnectObd2CommandUC$invoke$2 connectObd2CommandUC$invoke$2 = new ConnectObd2CommandUC$invoke$2(taskA, null);
            connectObd2CommandUC$invoke$1.L$0 = taskA;
            connectObd2CommandUC$invoke$1.label = 1;
            if (C2680e.f(aVar, connectObd2CommandUC$invoke$2, connectObd2CommandUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            task = taskA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            task = (Task) connectObd2CommandUC$invoke$1.L$0;
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
