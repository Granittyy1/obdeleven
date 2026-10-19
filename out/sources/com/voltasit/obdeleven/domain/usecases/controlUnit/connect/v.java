package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Kwp2000Protocol;
import com.obdeleven.service.protocol.Protocol;
import com.voltasit.obdeleven.domain.exceptions.BadResponseException;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.I;

/* JADX INFO: compiled from: ConnectToTP16CuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.w f30727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.s f30728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.r f30729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f30730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.p f30731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p084g8.c f30732g;

    public v(J8.p pVar, com.voltasit.obdeleven.domain.usecases.device.w wVar, com.voltasit.obdeleven.domain.usecases.device.s sVar, com.voltasit.obdeleven.domain.usecases.device.r rVar, t tVar, com.voltasit.obdeleven.domain.usecases.device.p pVar2, p084g8.c cVar) {
        this.f30726a = pVar;
        this.f30727b = wVar;
        this.f30728c = sVar;
        this.f30729d = rVar;
        this.f30730e = tVar;
        this.f30731f = pVar2;
        this.f30732g = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029b  */
    /* JADX WARN: Code duplicated, block: B:101:0x029d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:109:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0113  */
    /* JADX WARN: Code duplicated, block: B:32:0x0128 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0129  */
    /* JADX WARN: Code duplicated, block: B:36:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0132  */
    /* JADX WARN: Code duplicated, block: B:39:0x013e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x016b  */
    /* JADX WARN: Code duplicated, block: B:47:0x017a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0185  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0206  */
    /* JADX WARN: Code duplicated, block: B:73:0x020d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0213  */
    /* JADX WARN: Code duplicated, block: B:79:0x0247 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0248  */
    /* JADX WARN: Code duplicated, block: B:83:0x0255  */
    /* JADX WARN: Code duplicated, block: B:84:0x025b  */
    /* JADX WARN: Code duplicated, block: B:86:0x025f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0264  */
    /* JADX WARN: Code duplicated, block: B:91:0x0278 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0279  */
    /* JADX WARN: Code duplicated, block: B:95:0x0292 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0293  */
    /* JADX WARN: Code duplicated, block: B:99:0x029a A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, String str, String str2, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToTP16CuUC$invoke$1 connectToTP16CuUC$invoke$1;
        ControlUnit controlUnit2;
        v vVar;
        C8.a aVar;
        ControlUnit controlUnit3;
        v vVar2;
        C8.a aVar2;
        int i10;
        C8.a aVar3;
        String str3;
        String strSubstring;
        ProtocolType protocolType;
        Protocol bVar;
        Object objA;
        short s11;
        ProtocolType protocolType2;
        ControlUnit controlUnit4;
        C8.a aVar4;
        Protocol protocol;
        v vVar3;
        ProtocolType protocolType3;
        short s12;
        C8.a aVar5;
        short s13 = s10;
        String str4 = str;
        String str5 = str2;
        if (continuationImpl instanceof ConnectToTP16CuUC$invoke$1) {
            connectToTP16CuUC$invoke$1 = (ConnectToTP16CuUC$invoke$1) continuationImpl;
            int i11 = connectToTP16CuUC$invoke$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                connectToTP16CuUC$invoke$1.label = i11 - Integer.MIN_VALUE;
            } else {
                connectToTP16CuUC$invoke$1 = new ConnectToTP16CuUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToTP16CuUC$invoke$1 = new ConnectToTP16CuUC$invoke$1(this, continuationImpl);
        }
        Object objA2 = connectToTP16CuUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        switch (connectToTP16CuUC$invoke$1.label) {
            case 0:
                kotlin.b.b(objA2);
                J8.p pVar = this.f30726a;
                short s14 = s13;
                StringBuilder sbC = B6.a.c("ConnectToTP16CuUC(cuId=", p293xa.p.a(s14), "(0x", D9.o.u(s14), "), canKwp2000Id=");
                sbC.append(str4);
                sbC.append(", klineKwp2000Id=");
                sbC.append(str5);
                sbC.append(")");
                pVar.f("ConnectToTP16CuUC", sbC.toString());
                if (kotlin.text.n.S(str)) {
                    return new C8.a.C0024a(new Exception("canKwp2000Id is invalid"));
                }
                com.voltasit.obdeleven.domain.usecases.device.w wVar = this.f30727b;
                SetProtocolCommand.Protocol protocol2 = SetProtocolCommand.Protocol.TP16;
                connectToTP16CuUC$invoke$1.L$0 = this;
                connectToTP16CuUC$invoke$1.L$1 = str4;
                connectToTP16CuUC$invoke$1.L$2 = str5;
                controlUnit2 = controlUnit;
                connectToTP16CuUC$invoke$1.L$3 = controlUnit2;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 1;
                objA2 = wVar.a(protocol2, connectToTP16CuUC$invoke$1);
                if (objA2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                vVar = this;
                aVar = (C8.a) objA2;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                com.voltasit.obdeleven.domain.usecases.device.s sVar = vVar.f30728c;
                connectToTP16CuUC$invoke$1.L$0 = vVar;
                connectToTP16CuUC$invoke$1.L$1 = str5;
                connectToTP16CuUC$invoke$1.L$2 = controlUnit2;
                connectToTP16CuUC$invoke$1.L$3 = null;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 2;
                objA2 = sVar.a(str4, connectToTP16CuUC$invoke$1);
                if (objA2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                controlUnit3 = controlUnit2;
                vVar2 = vVar;
                aVar2 = (C8.a) objA2;
                if (aVar2 instanceof C8.a.C0024a) {
                    return aVar2;
                }
                i10 = 65535 & s13;
                if (Integer.bitCount(i10) % 2 == 0) {
                    i10 |= 128;
                }
                com.voltasit.obdeleven.domain.usecases.device.r rVar = vVar2.f30729d;
                String str6 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(i10)}, 1));
                connectToTP16CuUC$invoke$1.L$0 = vVar2;
                connectToTP16CuUC$invoke$1.L$1 = str5;
                connectToTP16CuUC$invoke$1.L$2 = controlUnit3;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 3;
                objA2 = rVar.a(str6, connectToTP16CuUC$invoke$1);
                if (objA2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar3 = (C8.a) objA2;
                if (aVar3 instanceof C8.a.b) {
                    if (aVar3 instanceof C8.a.C0024a) {
                        return aVar3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                str3 = (String) ((C8.a.b) aVar3).f2463a;
                if (!kotlin.text.m.I(str3, "55", false)) {
                    return new C8.a.C0024a(new BadResponseException(str3));
                }
                strSubstring = str3.substring(2);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                String strSubstring2 = strSubstring.substring(2, 4);
                kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
                O.h.c(16);
                int i12 = (~Integer.parseInt(strSubstring2, 16)) & 255;
                if (!kotlin.text.m.I(strSubstring, "018A", false) || kotlin.text.m.I(strSubstring, "0185", false) || kotlin.text.m.I(strSubstring, "010A", false) || kotlin.text.m.I(strSubstring, "0105", false)) {
                    protocolType = ProtocolType.TP16_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                    if (controlUnit3 != null) {
                        controlUnit3.w0(ApplicationProtocol.f29262b);
                    }
                    if (controlUnit3 != null) {
                        controlUnit3.G0(bVar);
                    }
                } else {
                    if (kotlin.text.n.S(str5)) {
                        vVar2.f30726a.c("ConnectToTP16CuUC", "klineKwp2000Id missing");
                        return new C8.a.C0024a(new Exception("klineKwp2000Id is invalid"));
                    }
                    protocolType = ProtocolType.TP16_KWP2000;
                    O.h.c(16);
                    bVar = new Kwp2000Protocol(Integer.parseInt(str5, 16), Kwp2000Protocol.Type.f29521b);
                    if (controlUnit3 != null) {
                        controlUnit3.w0(ApplicationProtocol.f29263c);
                    }
                    if (controlUnit3 != null) {
                        controlUnit3.G0(bVar);
                    }
                }
                if (controlUnit3 != null) {
                    controlUnit3.j = new ControlUnit.h(500, "kbps");
                }
                vVar2.f30732g.a(s13, bVar);
                com.voltasit.obdeleven.domain.usecases.device.r rVar2 = vVar2.f30729d;
                String str7 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(i12)}, 1));
                connectToTP16CuUC$invoke$1.L$0 = vVar2;
                connectToTP16CuUC$invoke$1.L$1 = controlUnit3;
                connectToTP16CuUC$invoke$1.L$2 = protocolType;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 4;
                objA = rVar2.a(str7, connectToTP16CuUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ControlUnit controlUnit5 = controlUnit3;
                s11 = s13;
                protocolType2 = protocolType;
                objA2 = objA;
                controlUnit4 = controlUnit5;
                aVar4 = (C8.a) objA2;
                if (aVar4 instanceof C8.a.b) {
                    ((C8.a.b) aVar4).getClass();
                } else if (aVar4 instanceof C8.a.C0024a) {
                    return aVar4;
                }
                if (protocolType2 == ProtocolType.TP16_KWP2000) {
                    connectToTP16CuUC$invoke$1.L$0 = vVar2;
                    connectToTP16CuUC$invoke$1.L$1 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.S$0 = s11;
                    connectToTP16CuUC$invoke$1.label = 5;
                    if (I.b(55L, connectToTP16CuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar3 = vVar2;
                    short s15 = s11;
                    protocolType3 = protocolType2;
                    s12 = s15;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType3;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.label = 6;
                    objA2 = vVar3.f30731f.a("1089", connectToTP16CuUC$invoke$1, s12);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocolType2 = protocolType3;
                    aVar5 = (C8.a) objA2;
                    if (aVar5 instanceof C8.a.C0024a) {
                        return aVar5;
                    }
                } else if (controlUnit4 != null && (protocol = controlUnit4.f29324f) != null) {
                    t tVar = vVar2.f30730e;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.label = 7;
                    objA2 = tVar.a(protocol, connectToTP16CuUC$invoke$1);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new C8.a.b(protocolType2);
            case 1:
                s13 = connectToTP16CuUC$invoke$1.S$0;
                ControlUnit controlUnit6 = (ControlUnit) connectToTP16CuUC$invoke$1.L$3;
                str5 = (String) connectToTP16CuUC$invoke$1.L$2;
                String str8 = (String) connectToTP16CuUC$invoke$1.L$1;
                vVar = (v) connectToTP16CuUC$invoke$1.L$0;
                kotlin.b.b(objA2);
                controlUnit2 = controlUnit6;
                str4 = str8;
                aVar = (C8.a) objA2;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                com.voltasit.obdeleven.domain.usecases.device.s sVar2 = vVar.f30728c;
                connectToTP16CuUC$invoke$1.L$0 = vVar;
                connectToTP16CuUC$invoke$1.L$1 = str5;
                connectToTP16CuUC$invoke$1.L$2 = controlUnit2;
                connectToTP16CuUC$invoke$1.L$3 = null;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 2;
                objA2 = sVar2.a(str4, connectToTP16CuUC$invoke$1);
                if (objA2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                controlUnit3 = controlUnit2;
                vVar2 = vVar;
                aVar2 = (C8.a) objA2;
                if (aVar2 instanceof C8.a.C0024a) {
                    return aVar2;
                }
                i10 = 65535 & s13;
                if (Integer.bitCount(i10) % 2 == 0) {
                    i10 |= 128;
                }
                com.voltasit.obdeleven.domain.usecases.device.r rVar3 = vVar2.f30729d;
                String str9 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(i10)}, 1));
                connectToTP16CuUC$invoke$1.L$0 = vVar2;
                connectToTP16CuUC$invoke$1.L$1 = str5;
                connectToTP16CuUC$invoke$1.L$2 = controlUnit3;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 3;
                objA2 = rVar3.a(str9, connectToTP16CuUC$invoke$1);
                if (objA2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar3 = (C8.a) objA2;
                if (aVar3 instanceof C8.a.b) {
                    if (aVar3 instanceof C8.a.C0024a) {
                        return aVar3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                str3 = (String) ((C8.a.b) aVar3).f2463a;
                if (!kotlin.text.m.I(str3, "55", false)) {
                    return new C8.a.C0024a(new BadResponseException(str3));
                }
                strSubstring = str3.substring(2);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                String strSubstring3 = strSubstring.substring(2, 4);
                kotlin.jvm.internal.i.d(strSubstring3, "substring(...)");
                O.h.c(16);
                int i13 = (~Integer.parseInt(strSubstring3, 16)) & 255;
                if (kotlin.text.m.I(strSubstring, "018A", false)) {
                    protocolType = ProtocolType.TP16_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                    if (controlUnit3 != null) {
                        controlUnit3.w0(ApplicationProtocol.f29262b);
                    }
                    if (controlUnit3 != null) {
                        controlUnit3.G0(bVar);
                    }
                } else {
                    protocolType = ProtocolType.TP16_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                    if (controlUnit3 != null) {
                        controlUnit3.w0(ApplicationProtocol.f29262b);
                    }
                    if (controlUnit3 != null) {
                        controlUnit3.G0(bVar);
                    }
                }
                if (controlUnit3 != null) {
                    controlUnit3.j = new ControlUnit.h(500, "kbps");
                }
                vVar2.f30732g.a(s13, bVar);
                com.voltasit.obdeleven.domain.usecases.device.r rVar4 = vVar2.f30729d;
                String str10 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(i13)}, 1));
                connectToTP16CuUC$invoke$1.L$0 = vVar2;
                connectToTP16CuUC$invoke$1.L$1 = controlUnit3;
                connectToTP16CuUC$invoke$1.L$2 = protocolType;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 4;
                objA = rVar4.a(str10, connectToTP16CuUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ControlUnit controlUnit7 = controlUnit3;
                s11 = s13;
                protocolType2 = protocolType;
                objA2 = objA;
                controlUnit4 = controlUnit7;
                aVar4 = (C8.a) objA2;
                if (aVar4 instanceof C8.a.b) {
                    ((C8.a.b) aVar4).getClass();
                } else if (aVar4 instanceof C8.a.C0024a) {
                    return aVar4;
                }
                if (protocolType2 == ProtocolType.TP16_KWP2000) {
                    connectToTP16CuUC$invoke$1.L$0 = vVar2;
                    connectToTP16CuUC$invoke$1.L$1 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.S$0 = s11;
                    connectToTP16CuUC$invoke$1.label = 5;
                    if (I.b(55L, connectToTP16CuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar3 = vVar2;
                    short s16 = s11;
                    protocolType3 = protocolType2;
                    s12 = s16;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType3;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.label = 6;
                    objA2 = vVar3.f30731f.a("1089", connectToTP16CuUC$invoke$1, s12);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocolType2 = protocolType3;
                    aVar5 = (C8.a) objA2;
                    if (aVar5 instanceof C8.a.C0024a) {
                        return aVar5;
                    }
                } else if (controlUnit4 != null) {
                    t tVar2 = vVar2.f30730e;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.label = 7;
                    objA2 = tVar2.a(protocol, connectToTP16CuUC$invoke$1);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new C8.a.b(protocolType2);
            case 2:
                s13 = connectToTP16CuUC$invoke$1.S$0;
                controlUnit3 = (ControlUnit) connectToTP16CuUC$invoke$1.L$2;
                str5 = (String) connectToTP16CuUC$invoke$1.L$1;
                vVar2 = (v) connectToTP16CuUC$invoke$1.L$0;
                kotlin.b.b(objA2);
                aVar2 = (C8.a) objA2;
                if (aVar2 instanceof C8.a.C0024a) {
                    return aVar2;
                }
                i10 = 65535 & s13;
                if (Integer.bitCount(i10) % 2 == 0) {
                    i10 |= 128;
                }
                com.voltasit.obdeleven.domain.usecases.device.r rVar5 = vVar2.f30729d;
                String str11 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(i10)}, 1));
                connectToTP16CuUC$invoke$1.L$0 = vVar2;
                connectToTP16CuUC$invoke$1.L$1 = str5;
                connectToTP16CuUC$invoke$1.L$2 = controlUnit3;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 3;
                objA2 = rVar5.a(str11, connectToTP16CuUC$invoke$1);
                if (objA2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar3 = (C8.a) objA2;
                if (aVar3 instanceof C8.a.b) {
                    if (aVar3 instanceof C8.a.C0024a) {
                        return aVar3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                str3 = (String) ((C8.a.b) aVar3).f2463a;
                if (!kotlin.text.m.I(str3, "55", false)) {
                    return new C8.a.C0024a(new BadResponseException(str3));
                }
                strSubstring = str3.substring(2);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                String strSubstring4 = strSubstring.substring(2, 4);
                kotlin.jvm.internal.i.d(strSubstring4, "substring(...)");
                O.h.c(16);
                int i14 = (~Integer.parseInt(strSubstring4, 16)) & 255;
                if (kotlin.text.m.I(strSubstring, "018A", false)) {
                    protocolType = ProtocolType.TP16_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                    if (controlUnit3 != null) {
                        controlUnit3.w0(ApplicationProtocol.f29262b);
                    }
                    if (controlUnit3 != null) {
                        controlUnit3.G0(bVar);
                    }
                } else {
                    protocolType = ProtocolType.TP16_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                    if (controlUnit3 != null) {
                        controlUnit3.w0(ApplicationProtocol.f29262b);
                    }
                    if (controlUnit3 != null) {
                        controlUnit3.G0(bVar);
                    }
                }
                if (controlUnit3 != null) {
                    controlUnit3.j = new ControlUnit.h(500, "kbps");
                }
                vVar2.f30732g.a(s13, bVar);
                com.voltasit.obdeleven.domain.usecases.device.r rVar6 = vVar2.f30729d;
                String str12 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(i14)}, 1));
                connectToTP16CuUC$invoke$1.L$0 = vVar2;
                connectToTP16CuUC$invoke$1.L$1 = controlUnit3;
                connectToTP16CuUC$invoke$1.L$2 = protocolType;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 4;
                objA = rVar6.a(str12, connectToTP16CuUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ControlUnit controlUnit8 = controlUnit3;
                s11 = s13;
                protocolType2 = protocolType;
                objA2 = objA;
                controlUnit4 = controlUnit8;
                aVar4 = (C8.a) objA2;
                if (aVar4 instanceof C8.a.b) {
                    ((C8.a.b) aVar4).getClass();
                } else if (aVar4 instanceof C8.a.C0024a) {
                    return aVar4;
                }
                if (protocolType2 == ProtocolType.TP16_KWP2000) {
                    connectToTP16CuUC$invoke$1.L$0 = vVar2;
                    connectToTP16CuUC$invoke$1.L$1 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.S$0 = s11;
                    connectToTP16CuUC$invoke$1.label = 5;
                    if (I.b(55L, connectToTP16CuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar3 = vVar2;
                    short s17 = s11;
                    protocolType3 = protocolType2;
                    s12 = s17;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType3;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.label = 6;
                    objA2 = vVar3.f30731f.a("1089", connectToTP16CuUC$invoke$1, s12);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocolType2 = protocolType3;
                    aVar5 = (C8.a) objA2;
                    if (aVar5 instanceof C8.a.C0024a) {
                        return aVar5;
                    }
                } else if (controlUnit4 != null) {
                    t tVar3 = vVar2.f30730e;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.label = 7;
                    objA2 = tVar3.a(protocol, connectToTP16CuUC$invoke$1);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new C8.a.b(protocolType2);
            case 3:
                s13 = connectToTP16CuUC$invoke$1.S$0;
                controlUnit3 = (ControlUnit) connectToTP16CuUC$invoke$1.L$2;
                str5 = (String) connectToTP16CuUC$invoke$1.L$1;
                vVar2 = (v) connectToTP16CuUC$invoke$1.L$0;
                kotlin.b.b(objA2);
                aVar3 = (C8.a) objA2;
                if (aVar3 instanceof C8.a.b) {
                    if (aVar3 instanceof C8.a.C0024a) {
                        return aVar3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                str3 = (String) ((C8.a.b) aVar3).f2463a;
                if (!kotlin.text.m.I(str3, "55", false)) {
                    return new C8.a.C0024a(new BadResponseException(str3));
                }
                strSubstring = str3.substring(2);
                kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                String strSubstring5 = strSubstring.substring(2, 4);
                kotlin.jvm.internal.i.d(strSubstring5, "substring(...)");
                O.h.c(16);
                int i15 = (~Integer.parseInt(strSubstring5, 16)) & 255;
                if (kotlin.text.m.I(strSubstring, "018A", false)) {
                    protocolType = ProtocolType.TP16_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                    if (controlUnit3 != null) {
                        controlUnit3.w0(ApplicationProtocol.f29262b);
                    }
                    if (controlUnit3 != null) {
                        controlUnit3.G0(bVar);
                    }
                } else {
                    protocolType = ProtocolType.TP16_KWP1281;
                    bVar = new com.obdeleven.service.protocol.b();
                    if (controlUnit3 != null) {
                        controlUnit3.w0(ApplicationProtocol.f29262b);
                    }
                    if (controlUnit3 != null) {
                        controlUnit3.G0(bVar);
                    }
                }
                if (controlUnit3 != null) {
                    controlUnit3.j = new ControlUnit.h(500, "kbps");
                }
                vVar2.f30732g.a(s13, bVar);
                com.voltasit.obdeleven.domain.usecases.device.r rVar7 = vVar2.f30729d;
                String str13 = String.format("%02X", Arrays.copyOf(new Object[]{new Integer(i15)}, 1));
                connectToTP16CuUC$invoke$1.L$0 = vVar2;
                connectToTP16CuUC$invoke$1.L$1 = controlUnit3;
                connectToTP16CuUC$invoke$1.L$2 = protocolType;
                connectToTP16CuUC$invoke$1.S$0 = s13;
                connectToTP16CuUC$invoke$1.label = 4;
                objA = rVar7.a(str13, connectToTP16CuUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ControlUnit controlUnit9 = controlUnit3;
                s11 = s13;
                protocolType2 = protocolType;
                objA2 = objA;
                controlUnit4 = controlUnit9;
                aVar4 = (C8.a) objA2;
                if (aVar4 instanceof C8.a.b) {
                    ((C8.a.b) aVar4).getClass();
                } else if (aVar4 instanceof C8.a.C0024a) {
                    return aVar4;
                }
                if (protocolType2 == ProtocolType.TP16_KWP2000) {
                    connectToTP16CuUC$invoke$1.L$0 = vVar2;
                    connectToTP16CuUC$invoke$1.L$1 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.S$0 = s11;
                    connectToTP16CuUC$invoke$1.label = 5;
                    if (I.b(55L, connectToTP16CuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar3 = vVar2;
                    short s18 = s11;
                    protocolType3 = protocolType2;
                    s12 = s18;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType3;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.label = 6;
                    objA2 = vVar3.f30731f.a("1089", connectToTP16CuUC$invoke$1, s12);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocolType2 = protocolType3;
                    aVar5 = (C8.a) objA2;
                    if (aVar5 instanceof C8.a.C0024a) {
                        return aVar5;
                    }
                } else if (controlUnit4 != null) {
                    t tVar4 = vVar2.f30730e;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.label = 7;
                    objA2 = tVar4.a(protocol, connectToTP16CuUC$invoke$1);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new C8.a.b(protocolType2);
            case 4:
                short s19 = connectToTP16CuUC$invoke$1.S$0;
                ProtocolType protocolType4 = (ProtocolType) connectToTP16CuUC$invoke$1.L$2;
                controlUnit4 = (ControlUnit) connectToTP16CuUC$invoke$1.L$1;
                vVar2 = (v) connectToTP16CuUC$invoke$1.L$0;
                kotlin.b.b(objA2);
                s11 = s19;
                protocolType2 = protocolType4;
                aVar4 = (C8.a) objA2;
                if (aVar4 instanceof C8.a.b) {
                    ((C8.a.b) aVar4).getClass();
                } else if (aVar4 instanceof C8.a.C0024a) {
                    return aVar4;
                }
                if (protocolType2 == ProtocolType.TP16_KWP2000) {
                    connectToTP16CuUC$invoke$1.L$0 = vVar2;
                    connectToTP16CuUC$invoke$1.L$1 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.S$0 = s11;
                    connectToTP16CuUC$invoke$1.label = 5;
                    if (I.b(55L, connectToTP16CuUC$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vVar3 = vVar2;
                    short s110 = s11;
                    protocolType3 = protocolType2;
                    s12 = s110;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType3;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.label = 6;
                    objA2 = vVar3.f30731f.a("1089", connectToTP16CuUC$invoke$1, s12);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    protocolType2 = protocolType3;
                    aVar5 = (C8.a) objA2;
                    if (aVar5 instanceof C8.a.C0024a) {
                        return aVar5;
                    }
                } else if (controlUnit4 != null) {
                    t tVar5 = vVar2.f30730e;
                    connectToTP16CuUC$invoke$1.L$0 = protocolType2;
                    connectToTP16CuUC$invoke$1.L$1 = null;
                    connectToTP16CuUC$invoke$1.L$2 = null;
                    connectToTP16CuUC$invoke$1.label = 7;
                    objA2 = tVar5.a(protocol, connectToTP16CuUC$invoke$1);
                    if (objA2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new C8.a.b(protocolType2);
            case 5:
                s12 = connectToTP16CuUC$invoke$1.S$0;
                protocolType3 = (ProtocolType) connectToTP16CuUC$invoke$1.L$1;
                vVar3 = (v) connectToTP16CuUC$invoke$1.L$0;
                kotlin.b.b(objA2);
                connectToTP16CuUC$invoke$1.L$0 = protocolType3;
                connectToTP16CuUC$invoke$1.L$1 = null;
                connectToTP16CuUC$invoke$1.label = 6;
                objA2 = vVar3.f30731f.a("1089", connectToTP16CuUC$invoke$1, s12);
                if (objA2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                protocolType2 = protocolType3;
                aVar5 = (C8.a) objA2;
                if (aVar5 instanceof C8.a.C0024a) {
                    return aVar5;
                }
                return new C8.a.b(protocolType2);
            case 6:
                protocolType2 = (ProtocolType) connectToTP16CuUC$invoke$1.L$0;
                kotlin.b.b(objA2);
                aVar5 = (C8.a) objA2;
                if (aVar5 instanceof C8.a.C0024a) {
                    return aVar5;
                }
                return new C8.a.b(protocolType2);
            case 7:
                protocolType2 = (ProtocolType) connectToTP16CuUC$invoke$1.L$0;
                kotlin.b.b(objA2);
                return new C8.a.b(protocolType2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
