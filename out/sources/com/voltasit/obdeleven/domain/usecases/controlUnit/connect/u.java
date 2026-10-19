package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConnectToObdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f30723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f30724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f30725d;

    public u(J8.p pVar, c cVar, d dVar, o oVar) {
        this.f30722a = pVar;
        this.f30723b = cVar;
        this.f30724c = dVar;
        this.f30725d = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        ConnectToObdUC$invoke$1 connectToObdUC$invoke$1;
        u uVar;
        C8.a aVar;
        if (continuationImpl instanceof ConnectToObdUC$invoke$1) {
            connectToObdUC$invoke$1 = (ConnectToObdUC$invoke$1) continuationImpl;
            int i10 = connectToObdUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                connectToObdUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                connectToObdUC$invoke$1 = new ConnectToObdUC$invoke$1(this, continuationImpl);
            }
        } else {
            connectToObdUC$invoke$1 = new ConnectToObdUC$invoke$1(this, continuationImpl);
        }
        Object objA = connectToObdUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = connectToObdUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = connectToObdUC$invoke$1.S$0;
                uVar = (u) connectToObdUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else if (i11 == 2) {
                s10 = connectToObdUC$invoke$1.S$0;
                uVar = (u) connectToObdUC$invoke$1.L$0;
                kotlin.b.b(objA);
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.b) {
                    return aVar;
                }
                if (aVar instanceof C8.a.C0024a) {
                    uVar.f30722a.d(((C8.a.C0024a) aVar).f2462a, false);
                }
                connectToObdUC$invoke$1.L$0 = null;
                connectToObdUC$invoke$1.label = 3;
                objA = uVar.f30725d.a(s10, connectToObdUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            return objA;
        }
        kotlin.b.b(objA);
        short s11 = s10;
        this.f30722a.f("ConnectToObdUC", androidx.compose.foundation.gestures.d.b("ConnectToObdUC(cuId=0x", D9.o.u(s11), ")"));
        connectToObdUC$invoke$1.L$0 = this;
        connectToObdUC$invoke$1.S$0 = s10;
        connectToObdUC$invoke$1.label = 1;
        objA = this.f30723b.a(s11, connectToObdUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        uVar = this;
        C8.a aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.b) {
            return aVar2;
        }
        if (aVar2 instanceof C8.a.C0024a) {
            uVar.f30722a.d(((C8.a.C0024a) aVar2).f2462a, false);
        }
        connectToObdUC$invoke$1.L$0 = uVar;
        connectToObdUC$invoke$1.S$0 = s10;
        connectToObdUC$invoke$1.label = 2;
        objA = uVar.f30724c.b(s10, connectToObdUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            return aVar;
        }
        if (aVar instanceof C8.a.C0024a) {
            uVar.f30722a.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        connectToObdUC$invoke$1.L$0 = null;
        connectToObdUC$invoke$1.label = 3;
        objA = uVar.f30725d.a(s10, connectToObdUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objA;
    }
}
