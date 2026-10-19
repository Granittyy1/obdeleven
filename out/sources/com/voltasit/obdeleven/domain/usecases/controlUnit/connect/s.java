package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.protocol.Kwp2000Protocol;
import com.obdeleven.service.protocol.Protocol;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: ConnectToKlineObdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.c f30720b;

    public s(J8.p pVar, p084g8.c cVar) {
        this.f30719a = pVar;
        this.f30720b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, OBDIICu oBDIICu, ContinuationImpl continuationImpl) {
        ConnectToKlineObdUC$invoke$1 connectToKlineObdUC$invoke$1;
        s sVar;
        OBDIICu oBDIICu2;
        Task task;
        ProtocolType protocolType;
        Protocol eVar;
        Protocol protocol;
        Sa.a aVar;
        ConnectToKlineObdUC$invoke$3 connectToKlineObdUC$invoke$3;
        ProtocolType protocolType2;
        if (continuationImpl instanceof ConnectToKlineObdUC$invoke$1) {
            connectToKlineObdUC$invoke$1 = (ConnectToKlineObdUC$invoke$1) continuationImpl;
            int i10 = connectToKlineObdUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToKlineObdUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToKlineObdUC$invoke$1 = new ConnectToKlineObdUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToKlineObdUC$invoke$1 = new ConnectToKlineObdUC$invoke$1(this, continuationImpl);
        }
        Object obj = connectToKlineObdUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToKlineObdUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = connectToKlineObdUC$invoke$1.S$0;
                task = (Task) connectToKlineObdUC$invoke$1.L$2;
                oBDIICu2 = (OBDIICu) connectToKlineObdUC$invoke$1.L$1;
                sVar = (s) connectToKlineObdUC$invoke$1.L$0;
                kotlin.b.b(obj);
            } else if (i11 == 2) {
                protocol = (Protocol) connectToKlineObdUC$invoke$1.L$1;
                protocolType = (ProtocolType) connectToKlineObdUC$invoke$1.L$0;
                kotlin.b.b(obj);
                aVar = N.f43200c;
                connectToKlineObdUC$invoke$3 = new ConnectToKlineObdUC$invoke$3(protocol, null);
                connectToKlineObdUC$invoke$1.L$0 = protocolType;
                connectToKlineObdUC$invoke$1.L$1 = null;
                connectToKlineObdUC$invoke$1.label = 3;
                if (C2680e.f(aVar, connectToKlineObdUC$invoke$3, connectToKlineObdUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                protocolType2 = protocolType;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                protocolType2 = (ProtocolType) connectToKlineObdUC$invoke$1.L$0;
                kotlin.b.b(obj);
            }
            return new C8.a.b(protocolType2);
        }
        kotlin.b.b(obj);
        this.f30719a.f("ConnectToKlineObdUC", "ConnectToKlineObdUC(" + F8.a.l(s10) + ")");
        Task taskOnSuccessTask = new SetProtocolCommand(SetProtocolCommand.Protocol.K_LINE).a().onSuccessTask(new p(0));
        Sa.a aVar2 = N.f43200c;
        ConnectToKlineObdUC$invoke$2 connectToKlineObdUC$invoke$2 = new ConnectToKlineObdUC$invoke$2(taskOnSuccessTask, null);
        connectToKlineObdUC$invoke$1.L$0 = this;
        connectToKlineObdUC$invoke$1.L$1 = oBDIICu;
        connectToKlineObdUC$invoke$1.L$2 = taskOnSuccessTask;
        connectToKlineObdUC$invoke$1.S$0 = s10;
        connectToKlineObdUC$invoke$1.label = 1;
        if (C2680e.f(aVar2, connectToKlineObdUC$invoke$2, connectToKlineObdUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        sVar = this;
        oBDIICu2 = oBDIICu;
        task = taskOnSuccessTask;
        if (task.isFaulted()) {
            Exception error = task.getError();
            kotlin.jvm.internal.i.d(error, "getError(...)");
            return new C8.a.C0024a(error);
        }
        String str = (String) task.getResult();
        sVar.f30719a.e("ConnectToKlineObdUC", "Result: " + str);
        if (str == null || str.length() < 8) {
            sVar.f30719a.b("ConnectToKlineObdUC", "Result must be at least 8 symbol length!");
        }
        kotlin.jvm.internal.i.b(str);
        String strSubstring = str.substring(0, 2);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        O.h.c(16);
        int i12 = Integer.parseInt(strSubstring, 16);
        String strSubstring2 = str.substring(2, 4);
        kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
        O.h.c(16);
        oBDIICu2.j = new ControlUnit.h(1000000 / ((i12 | (Integer.parseInt(strSubstring2, 16) << 8)) & 65535), "bps");
        String strSubstring3 = str.substring(4, 8);
        kotlin.jvm.internal.i.d(strSubstring3, "substring(...)");
        if (strSubstring3.equals("0808") || strSubstring3.equals("9494")) {
            protocolType = ProtocolType.KLINE_OBDII;
            oBDIICu2.f29384C = OBDIICu.OBDIIProtocol.f29391c;
            eVar = new com.obdeleven.service.protocol.e();
        } else {
            protocolType = ProtocolType.KLINE_KWP2000_FUNCTIONAL;
            oBDIICu2.f29384C = OBDIICu.OBDIIProtocol.f29392d;
            eVar = new Kwp2000Protocol(51, Kwp2000Protocol.Type.f29522c);
        }
        sVar.f30720b.a(s10, eVar);
        oBDIICu2.f29324f = eVar;
        connectToKlineObdUC$invoke$1.L$0 = protocolType;
        connectToKlineObdUC$invoke$1.L$1 = eVar;
        connectToKlineObdUC$invoke$1.L$2 = null;
        connectToKlineObdUC$invoke$1.label = 2;
        if (I.b(55L, connectToKlineObdUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        protocol = eVar;
        aVar = N.f43200c;
        connectToKlineObdUC$invoke$3 = new ConnectToKlineObdUC$invoke$3(protocol, null);
        connectToKlineObdUC$invoke$1.L$0 = protocolType;
        connectToKlineObdUC$invoke$1.L$1 = null;
        connectToKlineObdUC$invoke$1.label = 3;
        if (C2680e.f(aVar, connectToKlineObdUC$invoke$3, connectToKlineObdUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        protocolType2 = protocolType;
        return new C8.a.b(protocolType2);
    }
}
