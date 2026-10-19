package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.core.gen1.SetProtocolCommand;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConnectToCanObd29BitUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p084g8.c f30679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.s f30680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.t f30681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2115a f30682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.w f30683f;

    public d(J8.p pVar, p084g8.c cVar, com.voltasit.obdeleven.domain.usecases.device.s sVar, com.voltasit.obdeleven.domain.usecases.device.t tVar, C2115a c2115a, com.voltasit.obdeleven.domain.usecases.device.w wVar) {
        this.f30678a = pVar;
        this.f30679b = cVar;
        this.f30680c = sVar;
        this.f30681d = tVar;
        this.f30682e = c2115a;
        this.f30683f = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, int i10, ContinuationImpl continuationImpl) {
        ConnectToCanObd29BitUC$connect$1 connectToCanObd29BitUC$connect$1;
        Object obj;
        int i11;
        d dVar;
        C8.a aVar;
        C8.a aVar2;
        C8.a aVar3;
        if (continuationImpl instanceof ConnectToCanObd29BitUC$connect$1) {
            connectToCanObd29BitUC$connect$1 = (ConnectToCanObd29BitUC$connect$1) continuationImpl;
            int i12 = connectToCanObd29BitUC$connect$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                connectToCanObd29BitUC$connect$1.label = i12 - Integer.MIN_VALUE;
            } else {
                connectToCanObd29BitUC$connect$1 = new ConnectToCanObd29BitUC$connect$1(this, continuationImpl);
            }
        } else {
            connectToCanObd29BitUC$connect$1 = new ConnectToCanObd29BitUC$connect$1(this, continuationImpl);
        }
        Object objA = connectToCanObd29BitUC$connect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i13 = connectToCanObd29BitUC$connect$1.label;
        if (i13 != 0) {
            if (i13 == 1) {
                int i14 = connectToCanObd29BitUC$connect$1.I$0;
                s10 = connectToCanObd29BitUC$connect$1.S$0;
                d dVar2 = (d) connectToCanObd29BitUC$connect$1.L$0;
                kotlin.b.b(objA);
                i11 = i14;
                dVar = dVar2;
                obj = objA;
            } else if (i13 == 2) {
                s10 = connectToCanObd29BitUC$connect$1.S$0;
                dVar = (d) connectToCanObd29BitUC$connect$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                dVar.f30678a.e("ConnectToCanObd29ButUC", "Set transfer id");
                String strG = com.obdeleven.service.util.b.g(-1730464783);
                kotlin.jvm.internal.i.d(strG, "intToUDRequestString(...)");
                connectToCanObd29BitUC$connect$1.L$0 = dVar;
                connectToCanObd29BitUC$connect$1.S$0 = s10;
                connectToCanObd29BitUC$connect$1.label = 3;
                objA = dVar.f30681d.a(strG, connectToCanObd29BitUC$connect$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = (C8.a) objA;
                if (aVar2 instanceof C8.a.C0024a) {
                    return aVar2;
                }
                C2115a c2115a = dVar.f30682e;
                connectToCanObd29BitUC$connect$1.L$0 = dVar;
                connectToCanObd29BitUC$connect$1.S$0 = s10;
                connectToCanObd29BitUC$connect$1.label = 4;
                objA = c2115a.a(connectToCanObd29BitUC$connect$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i13 == 3) {
                s10 = connectToCanObd29BitUC$connect$1.S$0;
                dVar = (d) connectToCanObd29BitUC$connect$1.L$0;
                kotlin.b.b(objA);
                aVar2 = (C8.a) objA;
                if (aVar2 instanceof C8.a.C0024a) {
                    return aVar2;
                }
                C2115a c2115a2 = dVar.f30682e;
                connectToCanObd29BitUC$connect$1.L$0 = dVar;
                connectToCanObd29BitUC$connect$1.S$0 = s10;
                connectToCanObd29BitUC$connect$1.label = 4;
                objA = c2115a2.a(connectToCanObd29BitUC$connect$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s10 = connectToCanObd29BitUC$connect$1.S$0;
                dVar = (d) connectToCanObd29BitUC$connect$1.L$0;
                kotlin.b.b(objA);
            }
            aVar3 = (C8.a) objA;
            if (aVar3 instanceof C8.a.C0024a) {
                return aVar3;
            }
            dVar.f30679b.a(s10, new com.obdeleven.service.protocol.a());
            return new C8.a.b(ProtocolType.CAN_OBDII);
        }
        kotlin.b.b(objA);
        this.f30678a.e("ConnectToCanObd29ButUC", "Set protocol");
        SetProtocolCommand.Protocol protocol = SetProtocolCommand.Protocol.ISO_TP_OBD2;
        connectToCanObd29BitUC$connect$1.L$0 = this;
        connectToCanObd29BitUC$connect$1.S$0 = s10;
        connectToCanObd29BitUC$connect$1.I$0 = i10;
        connectToCanObd29BitUC$connect$1.label = 1;
        Object objA2 = this.f30683f.a(protocol, connectToCanObd29BitUC$connect$1);
        if (objA2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objA2;
        i11 = i10;
        dVar = this;
        C8.a aVar4 = (C8.a) obj;
        if (aVar4 instanceof C8.a.C0024a) {
            return aVar4;
        }
        dVar.f30678a.e("ConnectToCanObd29ButUC", "Set can filter");
        String strG2 = com.obdeleven.service.util.b.g(i11);
        kotlin.jvm.internal.i.d(strG2, "intToUDRequestString(...)");
        connectToCanObd29BitUC$connect$1.L$0 = dVar;
        connectToCanObd29BitUC$connect$1.S$0 = s10;
        connectToCanObd29BitUC$connect$1.label = 2;
        objA = dVar.f30680c.a(strG2, connectToCanObd29BitUC$connect$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        dVar.f30678a.e("ConnectToCanObd29ButUC", "Set transfer id");
        String strG3 = com.obdeleven.service.util.b.g(-1730464783);
        kotlin.jvm.internal.i.d(strG3, "intToUDRequestString(...)");
        connectToCanObd29BitUC$connect$1.L$0 = dVar;
        connectToCanObd29BitUC$connect$1.S$0 = s10;
        connectToCanObd29BitUC$connect$1.label = 3;
        objA = dVar.f30681d.a(strG3, connectToCanObd29BitUC$connect$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        C2115a c2115a3 = dVar.f30682e;
        connectToCanObd29BitUC$connect$1.L$0 = dVar;
        connectToCanObd29BitUC$connect$1.S$0 = s10;
        connectToCanObd29BitUC$connect$1.label = 4;
        objA = c2115a3.a(connectToCanObd29BitUC$connect$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar3 = (C8.a) objA;
        if (aVar3 instanceof C8.a.C0024a) {
            return aVar3;
        }
        dVar.f30679b.a(s10, new com.obdeleven.service.protocol.a());
        return new C8.a.b(ProtocolType.CAN_OBDII);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(short s10, ContinuationImpl continuationImpl) {
        ConnectToCanObd29BitUC$invoke$1 connectToCanObd29BitUC$invoke$1;
        d dVar;
        C8.a aVar;
        if (continuationImpl instanceof ConnectToCanObd29BitUC$invoke$1) {
            connectToCanObd29BitUC$invoke$1 = (ConnectToCanObd29BitUC$invoke$1) continuationImpl;
            int i10 = connectToCanObd29BitUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCanObd29BitUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCanObd29BitUC$invoke$1 = new ConnectToCanObd29BitUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToCanObd29BitUC$invoke$1 = new ConnectToCanObd29BitUC$invoke$1(this, continuationImpl);
        }
        Object objA = connectToCanObd29BitUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCanObd29BitUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = connectToCanObd29BitUC$invoke$1.S$0;
                dVar = (d) connectToCanObd29BitUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else if (i11 == 2) {
                s10 = connectToCanObd29BitUC$invoke$1.S$0;
                dVar = (d) connectToCanObd29BitUC$invoke$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.b) {
                    return aVar;
                }
                connectToCanObd29BitUC$invoke$1.L$0 = null;
                connectToCanObd29BitUC$invoke$1.label = 3;
                objA = dVar.a(s10, -1730481920, connectToCanObd29BitUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            return (C8.a) objA;
        }
        kotlin.b.b(objA);
        short s11 = s10;
        this.f30678a.f("ConnectToCanObd29ButUC", androidx.compose.foundation.gestures.d.b("ConnectToCanObd29ButUC(cuId=0x", D9.o.u(s11), ")"));
        connectToCanObd29BitUC$invoke$1.L$0 = this;
        connectToCanObd29BitUC$invoke$1.S$0 = s10;
        connectToCanObd29BitUC$invoke$1.label = 1;
        objA = a(s11, -1730481919, connectToCanObd29BitUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        dVar = this;
        C8.a aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.b) {
            return aVar2;
        }
        connectToCanObd29BitUC$invoke$1.L$0 = dVar;
        connectToCanObd29BitUC$invoke$1.S$0 = s10;
        connectToCanObd29BitUC$invoke$1.label = 2;
        objA = dVar.a(s10, -1730481905, connectToCanObd29BitUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            return aVar;
        }
        connectToCanObd29BitUC$invoke$1.L$0 = null;
        connectToCanObd29BitUC$invoke$1.label = 3;
        objA = dVar.a(s10, -1730481920, connectToCanObd29BitUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        return (C8.a) objA;
    }
}
