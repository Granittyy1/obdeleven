package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* JADX INFO: compiled from: ConnectToUdsExtendedUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.s f30739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.t f30740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f30741d;

    public x(J8.p pVar, com.voltasit.obdeleven.domain.usecases.device.s sVar, com.voltasit.obdeleven.domain.usecases.device.t tVar, z zVar) {
        this.f30738a = pVar;
        this.f30739b = sVar;
        this.f30740c = tVar;
        this.f30741d = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0117  */
    /* JADX WARN: Code duplicated, block: B:45:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        ConnectToUdsExtendedUC$invoke$1 connectToUdsExtendedUC$invoke$1;
        String str3;
        x xVar;
        C8.a aVar;
        C8.a aVar2;
        if (continuationImpl instanceof ConnectToUdsExtendedUC$invoke$1) {
            connectToUdsExtendedUC$invoke$1 = (ConnectToUdsExtendedUC$invoke$1) continuationImpl;
            int i10 = connectToUdsExtendedUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToUdsExtendedUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToUdsExtendedUC$invoke$1 = new ConnectToUdsExtendedUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToUdsExtendedUC$invoke$1 = new ConnectToUdsExtendedUC$invoke$1(this, continuationImpl);
        }
        Object objA = connectToUdsExtendedUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToUdsExtendedUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                str3 = (String) connectToUdsExtendedUC$invoke$1.L$1;
                xVar = (x) connectToUdsExtendedUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else if (i11 == 2) {
                str3 = (String) connectToUdsExtendedUC$invoke$1.L$1;
                xVar = (x) connectToUdsExtendedUC$invoke$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                z zVar = xVar.f30741d;
                connectToUdsExtendedUC$invoke$1.L$0 = str3;
                connectToUdsExtendedUC$invoke$1.L$1 = null;
                connectToUdsExtendedUC$invoke$1.label = 3;
                objA = zVar.a(connectToUdsExtendedUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) connectToUdsExtendedUC$invoke$1.L$0;
                kotlin.b.b(objA);
            }
            aVar2 = (C8.a) objA;
            if (aVar2 instanceof C8.a.C0024a) {
                return aVar2;
            }
            return new C8.a.b(str3);
        }
        kotlin.b.b(objA);
        this.f30738a.f("ConnectToUdsExtendedUC", "ConnectToUdsExtendedUC(request=" + str + ", response=" + str2 + ")");
        if (kotlin.text.n.S(str) || kotlin.text.n.S(str2)) {
            return new C8.a.C0024a(new Exception("UDS request or response extended ids missing"));
        }
        String[] strArr = (String[]) new Regex(":").h(str, 0).toArray(new String[0]);
        String[] strArr2 = (String[]) new Regex(":").h(str2, 0).toArray(new String[0]);
        if (strArr.length == 0 || strArr.length == 0) {
            return new C8.a.C0024a(new Exception("UDS request or response extended ids missing"));
        }
        str3 = strArr[0];
        String str4 = strArr2[0];
        O.h.c(16);
        String strG = com.obdeleven.service.util.b.g(Integer.parseInt(str4, 16) | Integer.MIN_VALUE);
        kotlin.jvm.internal.i.d(strG, "intToUDRequestString(...)");
        connectToUdsExtendedUC$invoke$1.L$0 = this;
        connectToUdsExtendedUC$invoke$1.L$1 = str3;
        connectToUdsExtendedUC$invoke$1.label = 1;
        objA = this.f30739b.a(strG, connectToUdsExtendedUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        xVar = this;
        C8.a aVar3 = (C8.a) objA;
        if (aVar3 instanceof C8.a.C0024a) {
            return aVar3;
        }
        com.voltasit.obdeleven.domain.usecases.device.t tVar = xVar.f30740c;
        O.h.c(16);
        String strG2 = com.obdeleven.service.util.b.g(Integer.MIN_VALUE | Integer.parseInt(str3, 16));
        kotlin.jvm.internal.i.d(strG2, "intToUDRequestString(...)");
        connectToUdsExtendedUC$invoke$1.L$0 = xVar;
        connectToUdsExtendedUC$invoke$1.L$1 = str3;
        connectToUdsExtendedUC$invoke$1.label = 2;
        objA = tVar.a(strG2, connectToUdsExtendedUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        z zVar2 = xVar.f30741d;
        connectToUdsExtendedUC$invoke$1.L$0 = str3;
        connectToUdsExtendedUC$invoke$1.L$1 = null;
        connectToUdsExtendedUC$invoke$1.label = 3;
        objA = zVar2.a(connectToUdsExtendedUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        return new C8.a.b(str3);
    }
}
