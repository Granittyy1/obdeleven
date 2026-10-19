package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.protocol.Kwp2000Protocol;
import com.obdeleven.service.protocol.Protocol;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.Q;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: ConnectToKlineEngineObdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.c f30716b;

    public o(J8.p pVar, p084g8.c cVar) {
        this.f30715a = pVar;
        this.f30716b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        ConnectToKlineEngineObdUC$invoke$1 connectToKlineEngineObdUC$invoke$1;
        Task taskOnSuccessTask;
        o oVar;
        ProtocolType protocolType;
        Protocol dVar;
        Protocol protocol;
        Sa.a aVar;
        ConnectToKlineEngineObdUC$invoke$3 connectToKlineEngineObdUC$invoke$3;
        ProtocolType protocolType2;
        if (continuationImpl instanceof ConnectToKlineEngineObdUC$invoke$1) {
            connectToKlineEngineObdUC$invoke$1 = (ConnectToKlineEngineObdUC$invoke$1) continuationImpl;
            int i10 = connectToKlineEngineObdUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToKlineEngineObdUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToKlineEngineObdUC$invoke$1 = new ConnectToKlineEngineObdUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToKlineEngineObdUC$invoke$1 = new ConnectToKlineEngineObdUC$invoke$1(this, continuationImpl);
        }
        Object obj = connectToKlineEngineObdUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToKlineEngineObdUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = connectToKlineEngineObdUC$invoke$1.S$0;
                taskOnSuccessTask = (Task) connectToKlineEngineObdUC$invoke$1.L$1;
                oVar = (o) connectToKlineEngineObdUC$invoke$1.L$0;
                kotlin.b.b(obj);
            } else if (i11 == 2) {
                protocol = (Protocol) connectToKlineEngineObdUC$invoke$1.L$1;
                ProtocolType protocolType3 = (ProtocolType) connectToKlineEngineObdUC$invoke$1.L$0;
                kotlin.b.b(obj);
                protocolType = protocolType3;
                aVar = N.f43200c;
                connectToKlineEngineObdUC$invoke$3 = new ConnectToKlineEngineObdUC$invoke$3(protocol, null);
                connectToKlineEngineObdUC$invoke$1.L$0 = protocolType;
                connectToKlineEngineObdUC$invoke$1.L$1 = null;
                connectToKlineEngineObdUC$invoke$1.label = 3;
                if (C2680e.f(aVar, connectToKlineEngineObdUC$invoke$3, connectToKlineEngineObdUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                protocolType2 = protocolType;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                protocolType2 = (ProtocolType) connectToKlineEngineObdUC$invoke$1.L$0;
                kotlin.b.b(obj);
            }
            return new C8.a.b(protocolType2);
        }
        kotlin.b.b(obj);
        this.f30715a.f("ConnectToKlineObdUC", androidx.compose.foundation.gestures.d.b("ConnectToKlineEngineObdUC(", F8.a.l(s10), ")"));
        taskOnSuccessTask = new SetProtocolCommand(SetProtocolCommand.Protocol.K_LINE).a().onSuccessTask(new Q(1));
        Sa.a aVar2 = N.f43200c;
        ConnectToKlineEngineObdUC$invoke$2 connectToKlineEngineObdUC$invoke$2 = new ConnectToKlineEngineObdUC$invoke$2(taskOnSuccessTask, null);
        connectToKlineEngineObdUC$invoke$1.L$0 = this;
        connectToKlineEngineObdUC$invoke$1.L$1 = taskOnSuccessTask;
        connectToKlineEngineObdUC$invoke$1.S$0 = s10;
        connectToKlineEngineObdUC$invoke$1.label = 1;
        if (C2680e.f(aVar2, connectToKlineEngineObdUC$invoke$2, connectToKlineEngineObdUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        oVar = this;
        if (taskOnSuccessTask.isFaulted()) {
            Exception error = taskOnSuccessTask.getError();
            kotlin.jvm.internal.i.d(error, "getError(...)");
            return new C8.a.C0024a(error);
        }
        String str = (String) taskOnSuccessTask.getResult();
        oVar.f30715a.e("ConnectToKlineObdUC", "Result: " + str);
        if (str == null || str.length() < 8) {
            oVar.f30715a.b("ConnectToKlineObdUC", "Result must be at least 8 symbol length!");
        }
        kotlin.jvm.internal.i.b(str);
        String strSubstring = str.substring(4, 8);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        if (strSubstring.equals("0808") || strSubstring.equals("9494")) {
            protocolType = ProtocolType.KLINE_OBDII_MULTI_MESSAGE;
            dVar = new com.obdeleven.service.protocol.d(new O3.d());
        } else {
            protocolType = ProtocolType.KLINE_KWP2000_FUNCTIONAL;
            dVar = new Kwp2000Protocol(51, Kwp2000Protocol.Type.f29522c);
        }
        oVar.f30716b.a(s10, dVar);
        connectToKlineEngineObdUC$invoke$1.L$0 = protocolType;
        connectToKlineEngineObdUC$invoke$1.L$1 = dVar;
        connectToKlineEngineObdUC$invoke$1.label = 2;
        if (I.b(55L, connectToKlineEngineObdUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        protocol = dVar;
        aVar = N.f43200c;
        connectToKlineEngineObdUC$invoke$3 = new ConnectToKlineEngineObdUC$invoke$3(protocol, null);
        connectToKlineEngineObdUC$invoke$1.L$0 = protocolType;
        connectToKlineEngineObdUC$invoke$1.L$1 = null;
        connectToKlineEngineObdUC$invoke$1.label = 3;
        if (C2680e.f(aVar, connectToKlineEngineObdUC$invoke$3, connectToKlineEngineObdUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        protocolType2 = protocolType;
        return new C8.a.b(protocolType2);
    }
}
