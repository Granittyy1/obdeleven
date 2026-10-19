package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConnectToTP20CuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.w f30734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.s f30735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.p f30736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p084g8.c f30737e;

    public w(J8.p pVar, com.voltasit.obdeleven.domain.usecases.device.w wVar, com.voltasit.obdeleven.domain.usecases.device.s sVar, com.voltasit.obdeleven.domain.usecases.device.p pVar2, p084g8.c cVar) {
        this.f30733a = pVar;
        this.f30734b = wVar;
        this.f30735c = sVar;
        this.f30736d = pVar2;
        this.f30737e = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, String str, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToTP20CuUC$invoke$1 connectToTP20CuUC$invoke$1;
        Object obj;
        ControlUnit controlUnit2;
        w wVar;
        ControlUnit controlUnit3;
        C8.a aVar;
        ProtocolType protocolType;
        com.obdeleven.service.protocol.c cVar;
        Object objA;
        ProtocolType protocolType2;
        C8.a aVar2;
        if (continuationImpl instanceof ConnectToTP20CuUC$invoke$1) {
            connectToTP20CuUC$invoke$1 = (ConnectToTP20CuUC$invoke$1) continuationImpl;
            int i10 = connectToTP20CuUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToTP20CuUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToTP20CuUC$invoke$1 = new ConnectToTP20CuUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToTP20CuUC$invoke$1 = new ConnectToTP20CuUC$invoke$1(this, continuationImpl);
        }
        Object obj2 = connectToTP20CuUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToTP20CuUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = connectToTP20CuUC$invoke$1.S$0;
                ControlUnit controlUnit4 = (ControlUnit) connectToTP20CuUC$invoke$1.L$2;
                str = (String) connectToTP20CuUC$invoke$1.L$1;
                w wVar2 = (w) connectToTP20CuUC$invoke$1.L$0;
                kotlin.b.b(obj2);
                controlUnit2 = controlUnit4;
                wVar = wVar2;
                obj = obj2;
            } else if (i11 == 2) {
                s10 = connectToTP20CuUC$invoke$1.S$0;
                controlUnit3 = (ControlUnit) connectToTP20CuUC$invoke$1.L$1;
                wVar = (w) connectToTP20CuUC$invoke$1.L$0;
                kotlin.b.b(obj2);
                aVar = (C8.a) obj2;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                protocolType = ProtocolType.TP20_KWP2002;
                cVar = new com.obdeleven.service.protocol.c();
                short s11 = s10;
                wVar.f30737e.a(s11, cVar);
                if (controlUnit3 != null) {
                    controlUnit3.w0(ApplicationProtocol.f29263c);
                }
                if (controlUnit3 != null) {
                    controlUnit3.G0(cVar);
                }
                if (controlUnit3 != null) {
                    controlUnit3.j = new ControlUnit.h(500, "kbps");
                }
                connectToTP20CuUC$invoke$1.L$0 = protocolType;
                connectToTP20CuUC$invoke$1.L$1 = null;
                connectToTP20CuUC$invoke$1.label = 3;
                objA = wVar.f30736d.a("1089", connectToTP20CuUC$invoke$1, s11);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj2 = objA;
                protocolType2 = protocolType;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                protocolType2 = (ProtocolType) connectToTP20CuUC$invoke$1.L$0;
                kotlin.b.b(obj2);
            }
            aVar2 = (C8.a) obj2;
            if (aVar2 instanceof C8.a.C0024a) {
                return aVar2;
            }
            return new C8.a.b(protocolType2);
        }
        kotlin.b.b(obj2);
        this.f30733a.f("ConnectToTP20CuUC", "ConnectToTP20CuUC(canKwp2000Id=" + str + ")");
        if (kotlin.text.n.S(str)) {
            return new C8.a.C0024a(new Exception("canKwp2000Id is invalid"));
        }
        SetProtocolCommand.Protocol protocol = SetProtocolCommand.Protocol.TP20;
        connectToTP20CuUC$invoke$1.L$0 = this;
        connectToTP20CuUC$invoke$1.L$1 = str;
        connectToTP20CuUC$invoke$1.L$2 = controlUnit;
        connectToTP20CuUC$invoke$1.S$0 = s10;
        connectToTP20CuUC$invoke$1.label = 1;
        Object objA2 = this.f30734b.a(protocol, connectToTP20CuUC$invoke$1);
        if (objA2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objA2;
        controlUnit2 = controlUnit;
        wVar = this;
        C8.a aVar3 = (C8.a) obj;
        if (aVar3 instanceof C8.a.C0024a) {
            return aVar3;
        }
        com.voltasit.obdeleven.domain.usecases.device.s sVar = wVar.f30735c;
        connectToTP20CuUC$invoke$1.L$0 = wVar;
        connectToTP20CuUC$invoke$1.L$1 = controlUnit2;
        connectToTP20CuUC$invoke$1.L$2 = null;
        connectToTP20CuUC$invoke$1.S$0 = s10;
        connectToTP20CuUC$invoke$1.label = 2;
        Object objA3 = sVar.a(str, connectToTP20CuUC$invoke$1);
        if (objA3 == coroutineSingletons) {
            return coroutineSingletons;
        }
        ControlUnit controlUnit5 = controlUnit2;
        obj2 = objA3;
        controlUnit3 = controlUnit5;
        aVar = (C8.a) obj2;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        protocolType = ProtocolType.TP20_KWP2002;
        cVar = new com.obdeleven.service.protocol.c();
        short s12 = s10;
        wVar.f30737e.a(s12, cVar);
        if (controlUnit3 != null) {
            controlUnit3.w0(ApplicationProtocol.f29263c);
        }
        if (controlUnit3 != null) {
            controlUnit3.G0(cVar);
        }
        if (controlUnit3 != null) {
            controlUnit3.j = new ControlUnit.h(500, "kbps");
        }
        connectToTP20CuUC$invoke$1.L$0 = protocolType;
        connectToTP20CuUC$invoke$1.L$1 = null;
        connectToTP20CuUC$invoke$1.label = 3;
        objA = wVar.f30736d.a("1089", connectToTP20CuUC$invoke$1, s12);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj2 = objA;
        protocolType2 = protocolType;
        aVar2 = (C8.a) obj2;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        return new C8.a.b(protocolType2);
    }
}
