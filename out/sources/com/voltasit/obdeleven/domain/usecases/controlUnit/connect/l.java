package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import androidx.compose.foundation.C0936h;
import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Kwp2000Protocol;
import com.obdeleven.service.protocol.Protocol;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N;

/* JADX INFO: compiled from: ConnectToKlineEngineCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.w f30710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f30711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p084g8.c f30712d;

    public l(J8.p pVar, com.voltasit.obdeleven.domain.usecases.device.w wVar, t tVar, p084g8.c cVar) {
        this.f30709a = pVar;
        this.f30710b = wVar;
        this.f30711c = tVar;
        this.f30712d = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:32:0x0101  */
    /* JADX WARN: Code duplicated, block: B:34:0x011e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0133  */
    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    /* JADX WARN: Code duplicated, block: B:43:0x0162 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0163  */
    /* JADX WARN: Code duplicated, block: B:47:0x016c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0180 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0181  */
    /* JADX WARN: Code duplicated, block: B:52:0x0188  */
    /* JADX WARN: Code duplicated, block: B:54:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x019a  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToKlineEngineCuUC$invoke$1 connectToKlineEngineCuUC$invoke$1;
        l lVar;
        C8.a aVar;
        Task taskContinueWithTask;
        Sa.a aVar2;
        ConnectToKlineEngineCuUC$invoke$2 connectToKlineEngineCuUC$invoke$2;
        l lVar2;
        ControlUnit controlUnit2;
        Task task;
        String strSubstring;
        ProtocolType protocolType;
        Protocol bVar;
        Protocol protocol;
        Task<String> taskG;
        Sa.a aVar3;
        ConnectToKlineEngineCuUC$invoke$3 connectToKlineEngineCuUC$invoke$3;
        ControlUnit controlUnit3;
        ProtocolType protocolType2;
        Protocol protocol2;
        t tVar;
        ControlUnit controlUnit4;
        Sa.a aVar4;
        ConnectToKlineEngineCuUC$invoke$4 connectToKlineEngineCuUC$invoke$4;
        if (continuationImpl instanceof ConnectToKlineEngineCuUC$invoke$1) {
            connectToKlineEngineCuUC$invoke$1 = (ConnectToKlineEngineCuUC$invoke$1) continuationImpl;
            int i10 = connectToKlineEngineCuUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToKlineEngineCuUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToKlineEngineCuUC$invoke$1 = new ConnectToKlineEngineCuUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToKlineEngineCuUC$invoke$1 = new ConnectToKlineEngineCuUC$invoke$1(this, continuationImpl);
        }
        Object objA = connectToKlineEngineCuUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        switch (connectToKlineEngineCuUC$invoke$1.label) {
            case 0:
                kotlin.b.b(objA);
                short s11 = s10;
                this.f30709a.f("ConnectToKlineEngineUC", C0936h.d("ConnectToKlineEngineUC(cuId=", p293xa.p.a(s11), "(0x", D9.o.u(s11), "))"));
                SetProtocolCommand.Protocol protocol3 = SetProtocolCommand.Protocol.K_LINE;
                connectToKlineEngineCuUC$invoke$1.L$0 = this;
                connectToKlineEngineCuUC$invoke$1.L$1 = controlUnit;
                connectToKlineEngineCuUC$invoke$1.S$0 = s10;
                connectToKlineEngineCuUC$invoke$1.label = 1;
                objA = this.f30710b.a(protocol3, connectToKlineEngineCuUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lVar = this;
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                taskContinueWithTask = com.obdeleven.service.core.b.a("0001").continueWithTask(new j());
                aVar2 = N.f43200c;
                connectToKlineEngineCuUC$invoke$2 = new ConnectToKlineEngineCuUC$invoke$2(taskContinueWithTask, null);
                connectToKlineEngineCuUC$invoke$1.L$0 = lVar;
                connectToKlineEngineCuUC$invoke$1.L$1 = controlUnit;
                connectToKlineEngineCuUC$invoke$1.L$2 = taskContinueWithTask;
                connectToKlineEngineCuUC$invoke$1.S$0 = s10;
                connectToKlineEngineCuUC$invoke$1.label = 2;
                if (C2680e.f(aVar2, connectToKlineEngineCuUC$invoke$2, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lVar2 = lVar;
                controlUnit2 = controlUnit;
                task = taskContinueWithTask;
                if (task.isFaulted()) {
                    Exception error = task.getError();
                    kotlin.jvm.internal.i.d(error, "getError(...)");
                    return new C8.a.C0024a(error);
                }
                String str = (String) task.getResult();
                kotlin.jvm.internal.i.b(str);
                strSubstring = str.substring(4, 8);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                if (!kotlin.text.m.I(strSubstring, "010A", false) || kotlin.text.m.I(strSubstring, "0105", false)) {
                    protocolType = ProtocolType.KLINE_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                } else {
                    protocolType = ProtocolType.KLINE_KWP2000_PHYSICAL;
                    bVar = new Kwp2000Protocol(16, Kwp2000Protocol.Type.f29521b);
                }
                lVar2.f30712d.a(s10, bVar);
                if (!(bVar instanceof com.obdeleven.service.protocol.b)) {
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit2;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType;
                    connectToKlineEngineCuUC$invoke$1.L$2 = bVar;
                    connectToKlineEngineCuUC$invoke$1.label = 5;
                    if (I.b(55L, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocol = bVar;
                    aVar4 = N.f43200c;
                    connectToKlineEngineCuUC$invoke$4 = new ConnectToKlineEngineCuUC$invoke$4(protocol, null);
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit2;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType;
                    connectToKlineEngineCuUC$invoke$1.L$2 = protocol;
                    connectToKlineEngineCuUC$invoke$1.label = 6;
                    if (C2680e.f(aVar4, connectToKlineEngineCuUC$invoke$4, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    controlUnit4 = controlUnit2;
                    protocolType2 = protocolType;
                    controlUnit3 = controlUnit4;
                    protocol2 = protocol;
                    if (controlUnit3 != null) {
                        controlUnit3.G0(protocol2);
                    }
                    return new C8.a.b(protocolType2);
                }
                taskG = bVar.g(null);
                aVar3 = N.f43200c;
                connectToKlineEngineCuUC$invoke$3 = new ConnectToKlineEngineCuUC$invoke$3(taskG, null);
                connectToKlineEngineCuUC$invoke$1.L$0 = lVar2;
                connectToKlineEngineCuUC$invoke$1.L$1 = controlUnit2;
                connectToKlineEngineCuUC$invoke$1.L$2 = protocolType;
                connectToKlineEngineCuUC$invoke$1.L$3 = bVar;
                connectToKlineEngineCuUC$invoke$1.L$4 = taskG;
                connectToKlineEngineCuUC$invoke$1.label = 3;
                if (C2680e.f(aVar3, connectToKlineEngineCuUC$invoke$3, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                controlUnit3 = controlUnit2;
                protocolType2 = protocolType;
                protocol2 = bVar;
                if (!taskG.isFaulted()) {
                    tVar = lVar2.f30711c;
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit3;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType2;
                    connectToKlineEngineCuUC$invoke$1.L$2 = protocol2;
                    connectToKlineEngineCuUC$invoke$1.L$3 = null;
                    connectToKlineEngineCuUC$invoke$1.L$4 = null;
                    connectToKlineEngineCuUC$invoke$1.label = 4;
                    if (tVar.a(protocol2, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocol = protocol2;
                    protocolType = protocolType2;
                    controlUnit4 = controlUnit3;
                    protocolType2 = protocolType;
                    controlUnit3 = controlUnit4;
                    protocol2 = protocol;
                }
                if (controlUnit3 != null) {
                    controlUnit3.G0(protocol2);
                }
                return new C8.a.b(protocolType2);
            case 1:
                s10 = connectToKlineEngineCuUC$invoke$1.S$0;
                controlUnit = (ControlUnit) connectToKlineEngineCuUC$invoke$1.L$1;
                lVar = (l) connectToKlineEngineCuUC$invoke$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                taskContinueWithTask = com.obdeleven.service.core.b.a("0001").continueWithTask(new j());
                aVar2 = N.f43200c;
                connectToKlineEngineCuUC$invoke$2 = new ConnectToKlineEngineCuUC$invoke$2(taskContinueWithTask, null);
                connectToKlineEngineCuUC$invoke$1.L$0 = lVar;
                connectToKlineEngineCuUC$invoke$1.L$1 = controlUnit;
                connectToKlineEngineCuUC$invoke$1.L$2 = taskContinueWithTask;
                connectToKlineEngineCuUC$invoke$1.S$0 = s10;
                connectToKlineEngineCuUC$invoke$1.label = 2;
                if (C2680e.f(aVar2, connectToKlineEngineCuUC$invoke$2, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lVar2 = lVar;
                controlUnit2 = controlUnit;
                task = taskContinueWithTask;
                if (task.isFaulted()) {
                    Exception error2 = task.getError();
                    kotlin.jvm.internal.i.d(error2, "getError(...)");
                    return new C8.a.C0024a(error2);
                }
                String str2 = (String) task.getResult();
                kotlin.jvm.internal.i.b(str2);
                strSubstring = str2.substring(4, 8);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                if (kotlin.text.m.I(strSubstring, "010A", false)) {
                    protocolType = ProtocolType.KLINE_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                } else {
                    protocolType = ProtocolType.KLINE_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                }
                lVar2.f30712d.a(s10, bVar);
                if (!(bVar instanceof com.obdeleven.service.protocol.b)) {
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit2;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType;
                    connectToKlineEngineCuUC$invoke$1.L$2 = bVar;
                    connectToKlineEngineCuUC$invoke$1.label = 5;
                    if (I.b(55L, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocol = bVar;
                    aVar4 = N.f43200c;
                    connectToKlineEngineCuUC$invoke$4 = new ConnectToKlineEngineCuUC$invoke$4(protocol, null);
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit2;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType;
                    connectToKlineEngineCuUC$invoke$1.L$2 = protocol;
                    connectToKlineEngineCuUC$invoke$1.label = 6;
                    if (C2680e.f(aVar4, connectToKlineEngineCuUC$invoke$4, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    controlUnit4 = controlUnit2;
                    protocolType2 = protocolType;
                    controlUnit3 = controlUnit4;
                    protocol2 = protocol;
                    if (controlUnit3 != null) {
                        controlUnit3.G0(protocol2);
                    }
                    return new C8.a.b(protocolType2);
                }
                taskG = bVar.g(null);
                aVar3 = N.f43200c;
                connectToKlineEngineCuUC$invoke$3 = new ConnectToKlineEngineCuUC$invoke$3(taskG, null);
                connectToKlineEngineCuUC$invoke$1.L$0 = lVar2;
                connectToKlineEngineCuUC$invoke$1.L$1 = controlUnit2;
                connectToKlineEngineCuUC$invoke$1.L$2 = protocolType;
                connectToKlineEngineCuUC$invoke$1.L$3 = bVar;
                connectToKlineEngineCuUC$invoke$1.L$4 = taskG;
                connectToKlineEngineCuUC$invoke$1.label = 3;
                if (C2680e.f(aVar3, connectToKlineEngineCuUC$invoke$3, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                controlUnit3 = controlUnit2;
                protocolType2 = protocolType;
                protocol2 = bVar;
                if (!taskG.isFaulted()) {
                    tVar = lVar2.f30711c;
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit3;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType2;
                    connectToKlineEngineCuUC$invoke$1.L$2 = protocol2;
                    connectToKlineEngineCuUC$invoke$1.L$3 = null;
                    connectToKlineEngineCuUC$invoke$1.L$4 = null;
                    connectToKlineEngineCuUC$invoke$1.label = 4;
                    if (tVar.a(protocol2, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocol = protocol2;
                    protocolType = protocolType2;
                    controlUnit4 = controlUnit3;
                    protocolType2 = protocolType;
                    controlUnit3 = controlUnit4;
                    protocol2 = protocol;
                }
                if (controlUnit3 != null) {
                    controlUnit3.G0(protocol2);
                }
                return new C8.a.b(protocolType2);
            case 2:
                s10 = connectToKlineEngineCuUC$invoke$1.S$0;
                task = (Task) connectToKlineEngineCuUC$invoke$1.L$2;
                controlUnit2 = (ControlUnit) connectToKlineEngineCuUC$invoke$1.L$1;
                l lVar3 = (l) connectToKlineEngineCuUC$invoke$1.L$0;
                kotlin.b.b(objA);
                lVar2 = lVar3;
                if (task.isFaulted()) {
                    Exception error3 = task.getError();
                    kotlin.jvm.internal.i.d(error3, "getError(...)");
                    return new C8.a.C0024a(error3);
                }
                String str3 = (String) task.getResult();
                kotlin.jvm.internal.i.b(str3);
                strSubstring = str3.substring(4, 8);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                if (kotlin.text.m.I(strSubstring, "010A", false)) {
                    protocolType = ProtocolType.KLINE_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                } else {
                    protocolType = ProtocolType.KLINE_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                }
                lVar2.f30712d.a(s10, bVar);
                if (!(bVar instanceof com.obdeleven.service.protocol.b)) {
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit2;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType;
                    connectToKlineEngineCuUC$invoke$1.L$2 = bVar;
                    connectToKlineEngineCuUC$invoke$1.label = 5;
                    if (I.b(55L, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocol = bVar;
                    aVar4 = N.f43200c;
                    connectToKlineEngineCuUC$invoke$4 = new ConnectToKlineEngineCuUC$invoke$4(protocol, null);
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit2;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType;
                    connectToKlineEngineCuUC$invoke$1.L$2 = protocol;
                    connectToKlineEngineCuUC$invoke$1.label = 6;
                    if (C2680e.f(aVar4, connectToKlineEngineCuUC$invoke$4, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    controlUnit4 = controlUnit2;
                    protocolType2 = protocolType;
                    controlUnit3 = controlUnit4;
                    protocol2 = protocol;
                    if (controlUnit3 != null) {
                        controlUnit3.G0(protocol2);
                    }
                    return new C8.a.b(protocolType2);
                }
                taskG = bVar.g(null);
                aVar3 = N.f43200c;
                connectToKlineEngineCuUC$invoke$3 = new ConnectToKlineEngineCuUC$invoke$3(taskG, null);
                connectToKlineEngineCuUC$invoke$1.L$0 = lVar2;
                connectToKlineEngineCuUC$invoke$1.L$1 = controlUnit2;
                connectToKlineEngineCuUC$invoke$1.L$2 = protocolType;
                connectToKlineEngineCuUC$invoke$1.L$3 = bVar;
                connectToKlineEngineCuUC$invoke$1.L$4 = taskG;
                connectToKlineEngineCuUC$invoke$1.label = 3;
                if (C2680e.f(aVar3, connectToKlineEngineCuUC$invoke$3, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                controlUnit3 = controlUnit2;
                protocolType2 = protocolType;
                protocol2 = bVar;
                if (!taskG.isFaulted()) {
                    tVar = lVar2.f30711c;
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit3;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType2;
                    connectToKlineEngineCuUC$invoke$1.L$2 = protocol2;
                    connectToKlineEngineCuUC$invoke$1.L$3 = null;
                    connectToKlineEngineCuUC$invoke$1.L$4 = null;
                    connectToKlineEngineCuUC$invoke$1.label = 4;
                    if (tVar.a(protocol2, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocol = protocol2;
                    protocolType = protocolType2;
                    controlUnit4 = controlUnit3;
                    protocolType2 = protocolType;
                    controlUnit3 = controlUnit4;
                    protocol2 = protocol;
                }
                if (controlUnit3 != null) {
                    controlUnit3.G0(protocol2);
                }
                return new C8.a.b(protocolType2);
            case 3:
                taskG = (Task) connectToKlineEngineCuUC$invoke$1.L$4;
                protocol2 = (Protocol) connectToKlineEngineCuUC$invoke$1.L$3;
                protocolType2 = (ProtocolType) connectToKlineEngineCuUC$invoke$1.L$2;
                controlUnit3 = (ControlUnit) connectToKlineEngineCuUC$invoke$1.L$1;
                lVar2 = (l) connectToKlineEngineCuUC$invoke$1.L$0;
                kotlin.b.b(objA);
                if (!taskG.isFaulted()) {
                    tVar = lVar2.f30711c;
                    connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit3;
                    connectToKlineEngineCuUC$invoke$1.L$1 = protocolType2;
                    connectToKlineEngineCuUC$invoke$1.L$2 = protocol2;
                    connectToKlineEngineCuUC$invoke$1.L$3 = null;
                    connectToKlineEngineCuUC$invoke$1.L$4 = null;
                    connectToKlineEngineCuUC$invoke$1.label = 4;
                    if (tVar.a(protocol2, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocol = protocol2;
                    protocolType = protocolType2;
                    controlUnit4 = controlUnit3;
                    protocolType2 = protocolType;
                    controlUnit3 = controlUnit4;
                    protocol2 = protocol;
                }
                if (controlUnit3 != null) {
                    controlUnit3.G0(protocol2);
                }
                return new C8.a.b(protocolType2);
            case 4:
            case 6:
                protocol = (Protocol) connectToKlineEngineCuUC$invoke$1.L$2;
                protocolType = (ProtocolType) connectToKlineEngineCuUC$invoke$1.L$1;
                controlUnit4 = (ControlUnit) connectToKlineEngineCuUC$invoke$1.L$0;
                kotlin.b.b(objA);
                protocolType2 = protocolType;
                controlUnit3 = controlUnit4;
                protocol2 = protocol;
                if (controlUnit3 != null) {
                    controlUnit3.G0(protocol2);
                }
                return new C8.a.b(protocolType2);
            case 5:
                protocol = (Protocol) connectToKlineEngineCuUC$invoke$1.L$2;
                protocolType = (ProtocolType) connectToKlineEngineCuUC$invoke$1.L$1;
                controlUnit2 = (ControlUnit) connectToKlineEngineCuUC$invoke$1.L$0;
                kotlin.b.b(objA);
                aVar4 = N.f43200c;
                connectToKlineEngineCuUC$invoke$4 = new ConnectToKlineEngineCuUC$invoke$4(protocol, null);
                connectToKlineEngineCuUC$invoke$1.L$0 = controlUnit2;
                connectToKlineEngineCuUC$invoke$1.L$1 = protocolType;
                connectToKlineEngineCuUC$invoke$1.L$2 = protocol;
                connectToKlineEngineCuUC$invoke$1.label = 6;
                if (C2680e.f(aVar4, connectToKlineEngineCuUC$invoke$4, connectToKlineEngineCuUC$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                controlUnit4 = controlUnit2;
                protocolType2 = protocolType;
                controlUnit3 = controlUnit4;
                protocol2 = protocol;
                if (controlUnit3 != null) {
                    controlUnit3.G0(protocol2);
                }
                return new C8.a.b(protocolType2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
