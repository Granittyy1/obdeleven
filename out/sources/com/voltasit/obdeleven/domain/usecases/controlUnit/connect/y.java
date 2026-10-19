package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* JADX INFO: compiled from: ConnectToUdsShortUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.s f30743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.t f30744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f30745d;

    public y(J8.p pVar, com.voltasit.obdeleven.domain.usecases.device.s sVar, com.voltasit.obdeleven.domain.usecases.device.t tVar, z zVar) {
        this.f30742a = pVar;
        this.f30743b = sVar;
        this.f30744c = tVar;
        this.f30745d = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String[] strArr, String[] strArr2, int i10, ContinuationImpl continuationImpl) {
        ConnectToUdsShortUC$connectUdsShort$1 connectToUdsShortUC$connectUdsShort$1;
        String str;
        y yVar;
        C8.a aVar;
        C8.a aVar2;
        if (continuationImpl instanceof ConnectToUdsShortUC$connectUdsShort$1) {
            connectToUdsShortUC$connectUdsShort$1 = (ConnectToUdsShortUC$connectUdsShort$1) continuationImpl;
            int i11 = connectToUdsShortUC$connectUdsShort$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                connectToUdsShortUC$connectUdsShort$1.label = i11 - Integer.MIN_VALUE;
            } else {
                connectToUdsShortUC$connectUdsShort$1 = new ConnectToUdsShortUC$connectUdsShort$1(this, continuationImpl);
            }
        } else {
            connectToUdsShortUC$connectUdsShort$1 = new ConnectToUdsShortUC$connectUdsShort$1(this, continuationImpl);
        }
        Object objA = connectToUdsShortUC$connectUdsShort$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = connectToUdsShortUC$connectUdsShort$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                str = (String) connectToUdsShortUC$connectUdsShort$1.L$1;
                yVar = (y) connectToUdsShortUC$connectUdsShort$1.L$0;
                kotlin.b.b(objA);
            } else if (i12 == 2) {
                str = (String) connectToUdsShortUC$connectUdsShort$1.L$1;
                yVar = (y) connectToUdsShortUC$connectUdsShort$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                z zVar = yVar.f30745d;
                connectToUdsShortUC$connectUdsShort$1.L$0 = str;
                connectToUdsShortUC$connectUdsShort$1.L$1 = null;
                connectToUdsShortUC$connectUdsShort$1.label = 3;
                objA = zVar.a(connectToUdsShortUC$connectUdsShort$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) connectToUdsShortUC$connectUdsShort$1.L$0;
                kotlin.b.b(objA);
            }
            aVar2 = (C8.a) objA;
            if (aVar2 instanceof C8.a.C0024a) {
                return aVar2;
            }
            return new C8.a.b(str);
        }
        kotlin.b.b(objA);
        str = strArr[i10];
        String str2 = strArr2[i10];
        O.h.c(16);
        String strG = com.obdeleven.service.util.b.g(Integer.parseInt(str2, 16));
        kotlin.jvm.internal.i.d(strG, "intToUDRequestString(...)");
        connectToUdsShortUC$connectUdsShort$1.L$0 = this;
        connectToUdsShortUC$connectUdsShort$1.L$1 = str;
        connectToUdsShortUC$connectUdsShort$1.label = 1;
        objA = this.f30743b.a(strG, connectToUdsShortUC$connectUdsShort$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        yVar = this;
        C8.a aVar3 = (C8.a) objA;
        if (aVar3 instanceof C8.a.C0024a) {
            return aVar3;
        }
        com.voltasit.obdeleven.domain.usecases.device.t tVar = yVar.f30744c;
        O.h.c(16);
        String strG2 = com.obdeleven.service.util.b.g(Integer.parseInt(str, 16));
        kotlin.jvm.internal.i.d(strG2, "intToUDRequestString(...)");
        connectToUdsShortUC$connectUdsShort$1.L$0 = yVar;
        connectToUdsShortUC$connectUdsShort$1.L$1 = str;
        connectToUdsShortUC$connectUdsShort$1.label = 2;
        objA = tVar.a(strG2, connectToUdsShortUC$connectUdsShort$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        z zVar2 = yVar.f30745d;
        connectToUdsShortUC$connectUdsShort$1.L$0 = str;
        connectToUdsShortUC$connectUdsShort$1.L$1 = null;
        connectToUdsShortUC$connectUdsShort$1.label = 3;
        objA = zVar2.a(connectToUdsShortUC$connectUdsShort$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        return new C8.a.b(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        ConnectToUdsShortUC$invoke$1 connectToUdsShortUC$invoke$1;
        y yVar;
        String[] strArr;
        String[] strArr2;
        if (continuationImpl instanceof ConnectToUdsShortUC$invoke$1) {
            connectToUdsShortUC$invoke$1 = (ConnectToUdsShortUC$invoke$1) continuationImpl;
            int i10 = connectToUdsShortUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToUdsShortUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToUdsShortUC$invoke$1 = new ConnectToUdsShortUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToUdsShortUC$invoke$1 = new ConnectToUdsShortUC$invoke$1(this, continuationImpl);
        }
        Object objA = connectToUdsShortUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToUdsShortUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                strArr2 = (String[]) connectToUdsShortUC$invoke$1.L$2;
                strArr = (String[]) connectToUdsShortUC$invoke$1.L$1;
                yVar = (y) connectToUdsShortUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            return objA;
        }
        kotlin.b.b(objA);
        this.f30742a.f("ConnectToUdsShortUC", "ConnectToUdsShortUC(request=" + str + ", response=" + str2 + ")");
        if (kotlin.text.n.S(str) || kotlin.text.n.S(str2)) {
            return new C8.a.C0024a(new Exception("UDS request or response ids missing"));
        }
        String[] strArr3 = (String[]) new Regex(":").h(str, 0).toArray(new String[0]);
        String[] strArr4 = (String[]) new Regex(":").h(str2, 0).toArray(new String[0]);
        connectToUdsShortUC$invoke$1.L$0 = this;
        connectToUdsShortUC$invoke$1.L$1 = strArr3;
        connectToUdsShortUC$invoke$1.L$2 = strArr4;
        connectToUdsShortUC$invoke$1.label = 1;
        objA = a(strArr3, strArr4, 0, connectToUdsShortUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        yVar = this;
        strArr = strArr3;
        strArr2 = strArr4;
        objA = (C8.a) objA;
        if ((objA instanceof C8.a.C0024a) && strArr.length > 1 && strArr2.length > 1) {
            connectToUdsShortUC$invoke$1.L$0 = null;
            connectToUdsShortUC$invoke$1.L$1 = null;
            connectToUdsShortUC$invoke$1.L$2 = null;
            connectToUdsShortUC$invoke$1.label = 2;
            objA = yVar.a(strArr, strArr2, 1, connectToUdsShortUC$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return objA;
    }
}
