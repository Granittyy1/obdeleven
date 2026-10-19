package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import G8.C0703e;
import G8.C0704f;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.voltasit.obdeleven.domain.exceptions.CantConnectToCuException;
import com.voltasit.obdeleven.domain.exceptions.WrongCuIDException;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConnectToCuWithProtocolUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f30694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f30695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f30696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f30697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f30698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f30699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f30700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J8.x f30701i;

    public g(J8.p pVar, e eVar, w wVar, v vVar, i iVar, c cVar, d dVar, s sVar, J8.x xVar) {
        this.f30693a = pVar;
        this.f30694b = eVar;
        this.f30695c = wVar;
        this.f30696d = vVar;
        this.f30697e = iVar;
        this.f30698f = cVar;
        this.f30699g = dVar;
        this.f30700h = sVar;
        this.f30701i = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(C0703e c0703e, C0704f c0704f, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToCuWithProtocolUC$connectCanObdUC$1 connectToCuWithProtocolUC$connectCanObdUC$1;
        Object obj;
        ControlUnit controlUnit2;
        g gVar;
        C8.a aVar;
        C0703e c0703e2;
        ControlUnit controlUnit3;
        if (continuationImpl instanceof ConnectToCuWithProtocolUC$connectCanObdUC$1) {
            connectToCuWithProtocolUC$connectCanObdUC$1 = (ConnectToCuWithProtocolUC$connectCanObdUC$1) continuationImpl;
            int i10 = connectToCuWithProtocolUC$connectCanObdUC$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCuWithProtocolUC$connectCanObdUC$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCuWithProtocolUC$connectCanObdUC$1 = new ConnectToCuWithProtocolUC$connectCanObdUC$1(this, continuationImpl);
            }
        } else {
            connectToCuWithProtocolUC$connectCanObdUC$1 = new ConnectToCuWithProtocolUC$connectCanObdUC$1(this, continuationImpl);
        }
        Object obj2 = connectToCuWithProtocolUC$connectCanObdUC$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCuWithProtocolUC$connectCanObdUC$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ControlUnit controlUnit4 = (ControlUnit) connectToCuWithProtocolUC$connectCanObdUC$1.L$3;
                c0704f = (C0704f) connectToCuWithProtocolUC$connectCanObdUC$1.L$2;
                c0703e = (C0703e) connectToCuWithProtocolUC$connectCanObdUC$1.L$1;
                g gVar2 = (g) connectToCuWithProtocolUC$connectCanObdUC$1.L$0;
                kotlin.b.b(obj2);
                controlUnit2 = controlUnit4;
                gVar = gVar2;
                obj = obj2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                controlUnit3 = (ControlUnit) connectToCuWithProtocolUC$connectCanObdUC$1.L$2;
                c0703e2 = (C0703e) connectToCuWithProtocolUC$connectCanObdUC$1.L$1;
                gVar = (g) connectToCuWithProtocolUC$connectCanObdUC$1.L$0;
                kotlin.b.b(obj2);
            }
            aVar = (C8.a) obj2;
            controlUnit2 = controlUnit3;
            c0703e = c0703e2;
            if (aVar instanceof C8.a.b) {
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                throw new NoWhenBranchMatchedException();
            }
            C0703e c0703eA = C0703e.a(c0703e, (ProtocolType) ((C8.a.b) aVar).f2463a);
            gVar.f30701i.g(c0703eA);
            controlUnit2.j = new ControlUnit.h(500, "kbps");
            controlUnit2.f29324f = new com.obdeleven.service.protocol.a();
            ((OBDIICu) controlUnit2).f29384C = OBDIICu.OBDIIProtocol.f29393e;
            return new C8.a.b(c0703eA);
        }
        kotlin.b.b(obj2);
        if (!(controlUnit instanceof OBDIICu)) {
            return new C8.a.C0024a(new CantConnectToCuException());
        }
        c cVar = this.f30698f;
        short s10 = c0704f.f3487c;
        connectToCuWithProtocolUC$connectCanObdUC$1.L$0 = this;
        connectToCuWithProtocolUC$connectCanObdUC$1.L$1 = c0703e;
        connectToCuWithProtocolUC$connectCanObdUC$1.L$2 = c0704f;
        connectToCuWithProtocolUC$connectCanObdUC$1.L$3 = controlUnit;
        connectToCuWithProtocolUC$connectCanObdUC$1.label = 1;
        Object objA = cVar.a(s10, connectToCuWithProtocolUC$connectCanObdUC$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objA;
        controlUnit2 = controlUnit;
        gVar = this;
        aVar = (C8.a) obj;
        if (!(aVar instanceof C8.a.b)) {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            d dVar = gVar.f30699g;
            short s11 = c0704f.f3487c;
            connectToCuWithProtocolUC$connectCanObdUC$1.L$0 = gVar;
            connectToCuWithProtocolUC$connectCanObdUC$1.L$1 = c0703e;
            connectToCuWithProtocolUC$connectCanObdUC$1.L$2 = controlUnit2;
            connectToCuWithProtocolUC$connectCanObdUC$1.L$3 = null;
            connectToCuWithProtocolUC$connectCanObdUC$1.label = 2;
            Object objB = dVar.b(s11, connectToCuWithProtocolUC$connectCanObdUC$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0703e2 = c0703e;
            controlUnit3 = controlUnit2;
            obj2 = objB;
            aVar = (C8.a) obj2;
            controlUnit2 = controlUnit3;
            c0703e = c0703e2;
        }
        if (aVar instanceof C8.a.b) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        C0703e c0703eA2 = C0703e.a(c0703e, (ProtocolType) ((C8.a.b) aVar).f2463a);
        gVar.f30701i.g(c0703eA2);
        controlUnit2.j = new ControlUnit.h(500, "kbps");
        controlUnit2.f29324f = new com.obdeleven.service.protocol.a();
        ((OBDIICu) controlUnit2).f29384C = OBDIICu.OBDIIProtocol.f29393e;
        return new C8.a.b(c0703eA2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(C0703e c0703e, C0704f c0704f, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToCuWithProtocolUC$connectKlineObdUC$1 connectToCuWithProtocolUC$connectKlineObdUC$1;
        g gVar;
        if (continuationImpl instanceof ConnectToCuWithProtocolUC$connectKlineObdUC$1) {
            connectToCuWithProtocolUC$connectKlineObdUC$1 = (ConnectToCuWithProtocolUC$connectKlineObdUC$1) continuationImpl;
            int i10 = connectToCuWithProtocolUC$connectKlineObdUC$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCuWithProtocolUC$connectKlineObdUC$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCuWithProtocolUC$connectKlineObdUC$1 = new ConnectToCuWithProtocolUC$connectKlineObdUC$1(this, continuationImpl);
            }
        } else {
            connectToCuWithProtocolUC$connectKlineObdUC$1 = new ConnectToCuWithProtocolUC$connectKlineObdUC$1(this, continuationImpl);
        }
        Object objA = connectToCuWithProtocolUC$connectKlineObdUC$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCuWithProtocolUC$connectKlineObdUC$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            if (!(controlUnit instanceof OBDIICu)) {
                return new C8.a.C0024a(new CantConnectToCuException());
            }
            connectToCuWithProtocolUC$connectKlineObdUC$1.L$0 = this;
            connectToCuWithProtocolUC$connectKlineObdUC$1.L$1 = c0703e;
            connectToCuWithProtocolUC$connectKlineObdUC$1.label = 1;
            objA = this.f30700h.a(c0704f.f3487c, (OBDIICu) controlUnit, connectToCuWithProtocolUC$connectKlineObdUC$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0703e = (C0703e) connectToCuWithProtocolUC$connectKlineObdUC$1.L$1;
            gVar = (g) connectToCuWithProtocolUC$connectKlineObdUC$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            C0703e c0703eA = C0703e.a(c0703e, (ProtocolType) ((C8.a.b) aVar).f2463a);
            gVar.f30701i.g(c0703eA);
            return new C8.a.b(c0703eA);
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(short s10, C0704f c0704f, C0703e c0703e, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToCuWithProtocolUC$connectToIsoTpCuUC$1 connectToCuWithProtocolUC$connectToIsoTpCuUC$1;
        g gVar;
        if (continuationImpl instanceof ConnectToCuWithProtocolUC$connectToIsoTpCuUC$1) {
            connectToCuWithProtocolUC$connectToIsoTpCuUC$1 = (ConnectToCuWithProtocolUC$connectToIsoTpCuUC$1) continuationImpl;
            int i10 = connectToCuWithProtocolUC$connectToIsoTpCuUC$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCuWithProtocolUC$connectToIsoTpCuUC$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCuWithProtocolUC$connectToIsoTpCuUC$1 = new ConnectToCuWithProtocolUC$connectToIsoTpCuUC$1(this, continuationImpl);
            }
        } else {
            connectToCuWithProtocolUC$connectToIsoTpCuUC$1 = new ConnectToCuWithProtocolUC$connectToIsoTpCuUC$1(this, continuationImpl);
        }
        ConnectToCuWithProtocolUC$connectToIsoTpCuUC$1 connectToCuWithProtocolUC$connectToIsoTpCuUC$2 = connectToCuWithProtocolUC$connectToIsoTpCuUC$1;
        Object objA = connectToCuWithProtocolUC$connectToIsoTpCuUC$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCuWithProtocolUC$connectToIsoTpCuUC$2.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            String str = c0704f.f3493i;
            connectToCuWithProtocolUC$connectToIsoTpCuUC$2.L$0 = this;
            connectToCuWithProtocolUC$connectToIsoTpCuUC$2.L$1 = c0703e;
            connectToCuWithProtocolUC$connectToIsoTpCuUC$2.label = 1;
            objA = this.f30694b.a(s10, str, c0704f.f3492h, c0704f.f3491g, c0704f.f3490f, controlUnit, connectToCuWithProtocolUC$connectToIsoTpCuUC$2);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0703e = (C0703e) connectToCuWithProtocolUC$connectToIsoTpCuUC$2.L$1;
            gVar = (g) connectToCuWithProtocolUC$connectToIsoTpCuUC$2.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            C0703e c0703eA = C0703e.a(c0703e, (ProtocolType) ((C8.a.b) aVar).f2463a);
            gVar.f30701i.g(c0703eA);
            return new C8.a.b(c0703eA);
        }
        if (!(aVar instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        gVar.f30693a.d(((C8.a.C0024a) aVar).f2462a, false);
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(C0703e c0703e, C0704f c0704f, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToCuWithProtocolUC$connectToKlineCuUC$1 connectToCuWithProtocolUC$connectToKlineCuUC$1;
        g gVar;
        if (continuationImpl instanceof ConnectToCuWithProtocolUC$connectToKlineCuUC$1) {
            connectToCuWithProtocolUC$connectToKlineCuUC$1 = (ConnectToCuWithProtocolUC$connectToKlineCuUC$1) continuationImpl;
            int i10 = connectToCuWithProtocolUC$connectToKlineCuUC$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCuWithProtocolUC$connectToKlineCuUC$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCuWithProtocolUC$connectToKlineCuUC$1 = new ConnectToCuWithProtocolUC$connectToKlineCuUC$1(this, continuationImpl);
            }
        } else {
            connectToCuWithProtocolUC$connectToKlineCuUC$1 = new ConnectToCuWithProtocolUC$connectToKlineCuUC$1(this, continuationImpl);
        }
        Object objA = connectToCuWithProtocolUC$connectToKlineCuUC$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCuWithProtocolUC$connectToKlineCuUC$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            int iG = kotlin.jvm.internal.i.g(c0704f.f3487c & 65535, 127);
            short s10 = c0704f.f3487c;
            if (iG > 0) {
                return new C8.a.C0024a(new WrongCuIDException((short) 127, s10));
            }
            connectToCuWithProtocolUC$connectToKlineCuUC$1.L$0 = this;
            connectToCuWithProtocolUC$connectToKlineCuUC$1.L$1 = c0703e;
            connectToCuWithProtocolUC$connectToKlineCuUC$1.label = 1;
            objA = this.f30697e.a(s10, controlUnit, connectToCuWithProtocolUC$connectToKlineCuUC$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0703e = (C0703e) connectToCuWithProtocolUC$connectToKlineCuUC$1.L$1;
            gVar = (g) connectToCuWithProtocolUC$connectToKlineCuUC$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            C0703e c0703eA = C0703e.a(c0703e, (ProtocolType) ((C8.a.b) aVar).f2463a);
            gVar.f30701i.g(c0703eA);
            return new C8.a.b(c0703eA);
        }
        if (aVar instanceof C8.a.C0024a) {
            return (C8.a.C0024a) aVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(C0703e c0703e, C0704f c0704f, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToCuWithProtocolUC$connectToTp16CuUC$1 connectToCuWithProtocolUC$connectToTp16CuUC$1;
        g gVar;
        if (continuationImpl instanceof ConnectToCuWithProtocolUC$connectToTp16CuUC$1) {
            connectToCuWithProtocolUC$connectToTp16CuUC$1 = (ConnectToCuWithProtocolUC$connectToTp16CuUC$1) continuationImpl;
            int i10 = connectToCuWithProtocolUC$connectToTp16CuUC$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCuWithProtocolUC$connectToTp16CuUC$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCuWithProtocolUC$connectToTp16CuUC$1 = new ConnectToCuWithProtocolUC$connectToTp16CuUC$1(this, continuationImpl);
            }
        } else {
            connectToCuWithProtocolUC$connectToTp16CuUC$1 = new ConnectToCuWithProtocolUC$connectToTp16CuUC$1(this, continuationImpl);
        }
        ConnectToCuWithProtocolUC$connectToTp16CuUC$1 connectToCuWithProtocolUC$connectToTp16CuUC$2 = connectToCuWithProtocolUC$connectToTp16CuUC$1;
        Object objA = connectToCuWithProtocolUC$connectToTp16CuUC$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCuWithProtocolUC$connectToTp16CuUC$2.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            if (kotlin.jvm.internal.i.g(c0704f.f3487c & 65535, 127) > 0) {
                return new C8.a.C0024a(new WrongCuIDException((short) 127, c0704f.f3487c));
            }
            connectToCuWithProtocolUC$connectToTp16CuUC$2.L$0 = this;
            connectToCuWithProtocolUC$connectToTp16CuUC$2.L$1 = c0703e;
            connectToCuWithProtocolUC$connectToTp16CuUC$2.label = 1;
            objA = this.f30696d.a(c0704f.f3487c, c0704f.f3488d, c0704f.f3489e, controlUnit, connectToCuWithProtocolUC$connectToTp16CuUC$2);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0703e = (C0703e) connectToCuWithProtocolUC$connectToTp16CuUC$2.L$1;
            gVar = (g) connectToCuWithProtocolUC$connectToTp16CuUC$2.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            C0703e c0703eA = C0703e.a(c0703e, (ProtocolType) ((C8.a.b) aVar).f2463a);
            gVar.f30701i.g(c0703eA);
            return new C8.a.b(c0703eA);
        }
        if (aVar instanceof C8.a.C0024a) {
            return (C8.a.C0024a) aVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(C0703e c0703e, C0704f c0704f, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        ConnectToCuWithProtocolUC$connectToTp20CuUC$1 connectToCuWithProtocolUC$connectToTp20CuUC$1;
        g gVar;
        if (continuationImpl instanceof ConnectToCuWithProtocolUC$connectToTp20CuUC$1) {
            connectToCuWithProtocolUC$connectToTp20CuUC$1 = (ConnectToCuWithProtocolUC$connectToTp20CuUC$1) continuationImpl;
            int i10 = connectToCuWithProtocolUC$connectToTp20CuUC$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToCuWithProtocolUC$connectToTp20CuUC$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToCuWithProtocolUC$connectToTp20CuUC$1 = new ConnectToCuWithProtocolUC$connectToTp20CuUC$1(this, continuationImpl);
            }
        } else {
            connectToCuWithProtocolUC$connectToTp20CuUC$1 = new ConnectToCuWithProtocolUC$connectToTp20CuUC$1(this, continuationImpl);
        }
        Object objA = connectToCuWithProtocolUC$connectToTp20CuUC$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToCuWithProtocolUC$connectToTp20CuUC$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            int iG = kotlin.jvm.internal.i.g(c0704f.f3487c & 65535, 255);
            short s10 = c0704f.f3487c;
            if (iG > 0) {
                return new C8.a.C0024a(new WrongCuIDException((short) 255, s10));
            }
            connectToCuWithProtocolUC$connectToTp20CuUC$1.L$0 = this;
            connectToCuWithProtocolUC$connectToTp20CuUC$1.L$1 = c0703e;
            connectToCuWithProtocolUC$connectToTp20CuUC$1.label = 1;
            objA = this.f30695c.a(s10, c0704f.f3488d, controlUnit, connectToCuWithProtocolUC$connectToTp20CuUC$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            gVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0703e = (C0703e) connectToCuWithProtocolUC$connectToTp20CuUC$1.L$1;
            gVar = (g) connectToCuWithProtocolUC$connectToTp20CuUC$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            C0703e c0703eA = C0703e.a(c0703e, (ProtocolType) ((C8.a.b) aVar).f2463a);
            gVar.f30701i.g(c0703eA);
            return new C8.a.b(c0703eA);
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
