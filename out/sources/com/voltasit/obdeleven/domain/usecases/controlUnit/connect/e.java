package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import androidx.compose.foundation.C0936h;
import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConnectToCanUdsCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.w f30685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f30686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f30687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p084g8.c f30688e;

    public e(J8.p pVar, com.voltasit.obdeleven.domain.usecases.device.w wVar, y yVar, x xVar, p084g8.c cVar) {
        this.f30684a = pVar;
        this.f30685b = wVar;
        this.f30686c = yVar;
        this.f30687d = xVar;
        this.f30688e = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:36:0x0123  */
    /* JADX WARN: Code duplicated, block: B:38:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0139  */
    /* JADX WARN: Code duplicated, block: B:42:0x0141  */
    /* JADX WARN: Code duplicated, block: B:44:0x014e  */
    /* JADX WARN: Code duplicated, block: B:46:0x016d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0172  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, String str, String str2, String str3, String str4, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToCanUdsCuUC$invoke$1 connectToCanUdsCuUC$invoke$1;
        String str5;
        String str6;
        String str7;
        e eVar;
        String str8;
        ControlUnit controlUnit2;
        String str9;
        String str10;
        e eVar2;
        C8.a aVar;
        ControlUnit controlUnit3;
        e eVar3;
        com.obdeleven.service.protocol.f fVar;
        C8.a aVar2;
        com.obdeleven.service.protocol.f fVar2;
        short s11 = s10;
        if (continuationImpl instanceof ConnectToCanUdsCuUC$invoke$1) {
            connectToCanUdsCuUC$invoke$1 = (ConnectToCanUdsCuUC$invoke$1) continuationImpl;
            int i10 = connectToCanUdsCuUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCanUdsCuUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCanUdsCuUC$invoke$1 = new ConnectToCanUdsCuUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToCanUdsCuUC$invoke$1 = new ConnectToCanUdsCuUC$invoke$1(this, continuationImpl);
        }
        Object objA = connectToCanUdsCuUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCanUdsCuUC$invoke$1.label;
        ApplicationProtocol applicationProtocol = ApplicationProtocol.f29264d;
        if (i11 != 0) {
            if (i11 == 1) {
                s11 = connectToCanUdsCuUC$invoke$1.S$0;
                controlUnit2 = (ControlUnit) connectToCanUdsCuUC$invoke$1.L$5;
                str7 = (String) connectToCanUdsCuUC$invoke$1.L$4;
                str6 = (String) connectToCanUdsCuUC$invoke$1.L$3;
                String str11 = (String) connectToCanUdsCuUC$invoke$1.L$2;
                str8 = (String) connectToCanUdsCuUC$invoke$1.L$1;
                e eVar4 = (e) connectToCanUdsCuUC$invoke$1.L$0;
                kotlin.b.b(objA);
                eVar = eVar4;
                str5 = str11;
            } else if (i11 == 2) {
                s11 = connectToCanUdsCuUC$invoke$1.S$0;
                controlUnit2 = (ControlUnit) connectToCanUdsCuUC$invoke$1.L$3;
                str9 = (String) connectToCanUdsCuUC$invoke$1.L$2;
                str10 = (String) connectToCanUdsCuUC$invoke$1.L$1;
                eVar2 = (e) connectToCanUdsCuUC$invoke$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.b) {
                    fVar = new com.obdeleven.service.protocol.f();
                    eVar2.f30688e.a(s11, fVar);
                    if (controlUnit2 != null) {
                        controlUnit2.f29325g = (String) ((C8.a.b) aVar).f2463a;
                        controlUnit2.G0(fVar);
                        controlUnit2.w0(applicationProtocol);
                        controlUnit2.j = new ControlUnit.h(500, "kbps");
                    }
                    return new C8.a.b(ProtocolType.CAN_UDS);
                }
                x xVar = eVar2.f30687d;
                connectToCanUdsCuUC$invoke$1.L$0 = eVar2;
                connectToCanUdsCuUC$invoke$1.L$1 = controlUnit2;
                connectToCanUdsCuUC$invoke$1.L$2 = null;
                connectToCanUdsCuUC$invoke$1.L$3 = null;
                connectToCanUdsCuUC$invoke$1.S$0 = s11;
                connectToCanUdsCuUC$invoke$1.label = 3;
                objA = xVar.a(str10, str9, connectToCanUdsCuUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                controlUnit3 = controlUnit2;
                eVar3 = eVar2;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s11 = connectToCanUdsCuUC$invoke$1.S$0;
                controlUnit3 = (ControlUnit) connectToCanUdsCuUC$invoke$1.L$1;
                eVar3 = (e) connectToCanUdsCuUC$invoke$1.L$0;
                kotlin.b.b(objA);
            }
            aVar2 = (C8.a) objA;
            if (aVar2 instanceof C8.a.b) {
                if (aVar2 instanceof C8.a.C0024a) {
                    return aVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            fVar2 = new com.obdeleven.service.protocol.f();
            eVar3.f30688e.a(s11, fVar2);
            if (controlUnit3 != null) {
                controlUnit3.f29325g = (String) ((C8.a.b) aVar2).f2463a;
                controlUnit3.G0(fVar2);
                controlUnit3.w0(applicationProtocol);
                controlUnit3.j = new ControlUnit.h(500, "kbps");
            }
            return new C8.a.b(ProtocolType.CAN_UDS);
        }
        kotlin.b.b(objA);
        short s12 = s11;
        this.f30684a.f("ConnectToCanUdsCuUC", C0936h.d("ConnectToCanUdsCuUC(cuId=", p293xa.p.a(s12), "(0x", D9.o.u(s12), "))"));
        SetProtocolCommand.Protocol protocol = SetProtocolCommand.Protocol.ISO_TP;
        connectToCanUdsCuUC$invoke$1.L$0 = this;
        connectToCanUdsCuUC$invoke$1.L$1 = str;
        str5 = str2;
        connectToCanUdsCuUC$invoke$1.L$2 = str5;
        str6 = str3;
        connectToCanUdsCuUC$invoke$1.L$3 = str6;
        connectToCanUdsCuUC$invoke$1.L$4 = str4;
        connectToCanUdsCuUC$invoke$1.L$5 = controlUnit;
        connectToCanUdsCuUC$invoke$1.S$0 = s11;
        connectToCanUdsCuUC$invoke$1.label = 1;
        objA = this.f30685b.a(protocol, connectToCanUdsCuUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        str7 = str4;
        eVar = this;
        str8 = str;
        controlUnit2 = controlUnit;
        C8.a aVar3 = (C8.a) objA;
        if (aVar3 instanceof C8.a.C0024a) {
            return aVar3;
        }
        y yVar = eVar.f30686c;
        connectToCanUdsCuUC$invoke$1.L$0 = eVar;
        connectToCanUdsCuUC$invoke$1.L$1 = str6;
        connectToCanUdsCuUC$invoke$1.L$2 = str7;
        connectToCanUdsCuUC$invoke$1.L$3 = controlUnit2;
        connectToCanUdsCuUC$invoke$1.L$4 = null;
        connectToCanUdsCuUC$invoke$1.L$5 = null;
        connectToCanUdsCuUC$invoke$1.S$0 = s11;
        connectToCanUdsCuUC$invoke$1.label = 2;
        objA = yVar.b(str8, str5, connectToCanUdsCuUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        str9 = str7;
        str10 = str6;
        eVar2 = eVar;
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            fVar = new com.obdeleven.service.protocol.f();
            eVar2.f30688e.a(s11, fVar);
            if (controlUnit2 != null) {
                controlUnit2.f29325g = (String) ((C8.a.b) aVar).f2463a;
                controlUnit2.G0(fVar);
                controlUnit2.w0(applicationProtocol);
                controlUnit2.j = new ControlUnit.h(500, "kbps");
            }
            return new C8.a.b(ProtocolType.CAN_UDS);
        }
        x xVar2 = eVar2.f30687d;
        connectToCanUdsCuUC$invoke$1.L$0 = eVar2;
        connectToCanUdsCuUC$invoke$1.L$1 = controlUnit2;
        connectToCanUdsCuUC$invoke$1.L$2 = null;
        connectToCanUdsCuUC$invoke$1.L$3 = null;
        connectToCanUdsCuUC$invoke$1.S$0 = s11;
        connectToCanUdsCuUC$invoke$1.label = 3;
        objA = xVar2.a(str10, str9, connectToCanUdsCuUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        controlUnit3 = controlUnit2;
        eVar3 = eVar2;
        aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.b) {
            if (aVar2 instanceof C8.a.C0024a) {
                return aVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        fVar2 = new com.obdeleven.service.protocol.f();
        eVar3.f30688e.a(s11, fVar2);
        if (controlUnit3 != null) {
            controlUnit3.f29325g = (String) ((C8.a.b) aVar2).f2463a;
            controlUnit3.G0(fVar2);
            controlUnit3.w0(applicationProtocol);
            controlUnit3.j = new ControlUnit.h(500, "kbps");
        }
        return new C8.a.b(ProtocolType.CAN_UDS);
    }
}
