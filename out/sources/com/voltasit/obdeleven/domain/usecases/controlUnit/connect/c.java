package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.E;
import com.voltasit.obdeleven.core.app.G;
import com.voltasit.obdeleven.core.app.J;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: ConnectToCanObd11BitUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.c f30677b;

    public c(J8.p pVar, p084g8.c cVar) {
        this.f30676a = pVar;
        this.f30677b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        ConnectToCanObd11BitUC$invoke$1 connectToCanObd11BitUC$invoke$1;
        c cVar;
        Task task;
        if (continuationImpl instanceof ConnectToCanObd11BitUC$invoke$1) {
            connectToCanObd11BitUC$invoke$1 = (ConnectToCanObd11BitUC$invoke$1) continuationImpl;
            int i10 = connectToCanObd11BitUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCanObd11BitUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCanObd11BitUC$invoke$1 = new ConnectToCanObd11BitUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToCanObd11BitUC$invoke$1 = new ConnectToCanObd11BitUC$invoke$1(this, continuationImpl);
        }
        Object obj = connectToCanObd11BitUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCanObd11BitUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            this.f30676a.f("ConnectToCanObd11BitUC", androidx.compose.foundation.gestures.d.b("ConnectToCanObdUC(cuId=0x", D9.o.u(s10), ")"));
            Task taskContinueWithTask = new SetProtocolCommand(SetProtocolCommand.Protocol.ISO_TP).a().onSuccessTask(new E(1)).onSuccessTask(new G(2)).onSuccessTask(new b(0)).continueWithTask(new J(1));
            Sa.a aVar = N.f43200c;
            ConnectToCanObd11BitUC$invoke$2 connectToCanObd11BitUC$invoke$2 = new ConnectToCanObd11BitUC$invoke$2(taskContinueWithTask, null);
            connectToCanObd11BitUC$invoke$1.L$0 = this;
            connectToCanObd11BitUC$invoke$1.L$1 = taskContinueWithTask;
            connectToCanObd11BitUC$invoke$1.S$0 = s10;
            connectToCanObd11BitUC$invoke$1.label = 1;
            if (C2680e.f(aVar, connectToCanObd11BitUC$invoke$2, connectToCanObd11BitUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar = this;
            task = taskContinueWithTask;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s10 = connectToCanObd11BitUC$invoke$1.S$0;
            task = (Task) connectToCanObd11BitUC$invoke$1.L$1;
            cVar = (c) connectToCanObd11BitUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        if (!task.isFaulted()) {
            cVar.f30677b.a(s10, new com.obdeleven.service.protocol.a());
            return new C8.a.b(ProtocolType.CAN_OBDII);
        }
        Exception error = task.getError();
        kotlin.jvm.internal.i.d(error, "getError(...)");
        return new C8.a.C0024a(error);
    }
}
