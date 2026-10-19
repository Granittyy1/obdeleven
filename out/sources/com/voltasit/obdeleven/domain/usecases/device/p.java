package com.voltasit.obdeleven.domain.usecases.device;

import com.parse.boltsinternal.Task;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: SendProtocolRequestUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p084g8.c f30804a;

    public p(p084g8.c cVar) {
        this.f30804a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl, short s10) {
        SendProtocolRequestUC$invoke$1 sendProtocolRequestUC$invoke$1;
        Task<String> taskG;
        if (continuationImpl instanceof SendProtocolRequestUC$invoke$1) {
            sendProtocolRequestUC$invoke$1 = (SendProtocolRequestUC$invoke$1) continuationImpl;
            int i10 = sendProtocolRequestUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sendProtocolRequestUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sendProtocolRequestUC$invoke$1 = new SendProtocolRequestUC$invoke$1(this, continuationImpl);
            }
        } else {
            sendProtocolRequestUC$invoke$1 = new SendProtocolRequestUC$invoke$1(this, continuationImpl);
        }
        Object obj = sendProtocolRequestUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sendProtocolRequestUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            taskG = this.f30804a.c(s10).g(str);
            Sa.a aVar = N.f43200c;
            SendProtocolRequestUC$invoke$2 sendProtocolRequestUC$invoke$2 = new SendProtocolRequestUC$invoke$2(taskG, null);
            sendProtocolRequestUC$invoke$1.L$0 = taskG;
            sendProtocolRequestUC$invoke$1.label = 1;
            if (C2680e.f(aVar, sendProtocolRequestUC$invoke$2, sendProtocolRequestUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskG = (Task) sendProtocolRequestUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        if (!taskG.isFaulted()) {
            return new C8.a.b(taskG.getResult());
        }
        Exception error = taskG.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }
}
