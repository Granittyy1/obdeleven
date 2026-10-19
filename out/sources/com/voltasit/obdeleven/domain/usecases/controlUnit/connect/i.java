package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Protocol;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.exceptions.CantConnectToCuException;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: ConnectToKlineCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p084g8.c f30708a;

    public i(p084g8.c cVar) {
        this.f30708a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToKlineCuUC$invoke$1 connectToKlineCuUC$invoke$1;
        i iVar;
        ControlUnit controlUnit2;
        Task<Boolean> task;
        if (continuationImpl instanceof ConnectToKlineCuUC$invoke$1) {
            connectToKlineCuUC$invoke$1 = (ConnectToKlineCuUC$invoke$1) continuationImpl;
            int i10 = connectToKlineCuUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToKlineCuUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToKlineCuUC$invoke$1 = new ConnectToKlineCuUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToKlineCuUC$invoke$1 = new ConnectToKlineCuUC$invoke$1(this, continuationImpl);
        }
        Object obj = connectToKlineCuUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToKlineCuUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Task<Boolean> taskF = controlUnit.F();
            Sa.a aVar = N.f43200c;
            ConnectToKlineCuUC$invoke$2 connectToKlineCuUC$invoke$2 = new ConnectToKlineCuUC$invoke$2(taskF, null);
            connectToKlineCuUC$invoke$1.L$0 = this;
            connectToKlineCuUC$invoke$1.L$1 = controlUnit;
            connectToKlineCuUC$invoke$1.L$2 = taskF;
            connectToKlineCuUC$invoke$1.S$0 = s10;
            connectToKlineCuUC$invoke$1.label = 1;
            if (C2680e.f(aVar, connectToKlineCuUC$invoke$2, connectToKlineCuUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            iVar = this;
            controlUnit2 = controlUnit;
            task = taskF;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s10 = connectToKlineCuUC$invoke$1.S$0;
            task = (Task) connectToKlineCuUC$invoke$1.L$2;
            controlUnit2 = (ControlUnit) connectToKlineCuUC$invoke$1.L$1;
            iVar = (i) connectToKlineCuUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        if (task.isFaulted()) {
            Exception error = task.getError();
            kotlin.jvm.internal.i.d(error, "getError(...)");
            return new C8.a.C0024a(error);
        }
        if (!task.getResult().booleanValue()) {
            return new C8.a.C0024a(new CantConnectToCuException());
        }
        Protocol protocol = controlUnit2.f29324f;
        kotlin.jvm.internal.i.b(protocol);
        iVar.f30708a.a(s10, protocol);
        return controlUnit2.f29326h == TransportProtocol.f29304c ? new C8.a.b(ProtocolType.KLINE_KWP1281) : new C8.a.b(ProtocolType.KLINE_KWP2000_PHYSICAL);
    }
}
