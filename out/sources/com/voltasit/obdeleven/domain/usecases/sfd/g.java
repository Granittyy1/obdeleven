package com.voltasit.obdeleven.domain.usecases.sfd;

import J8.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p293xa.r;

/* JADX INFO: compiled from: LockSfdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f30942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f f30943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f30944c;

    public g(p pVar, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f fVar, f fVar2) {
        this.f30942a = pVar;
        this.f30943b = fVar;
        this.f30944c = fVar2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        LockSfdUC$invoke$1 lockSfdUC$invoke$1;
        g gVar;
        C8.a aVar;
        if (continuationImpl instanceof LockSfdUC$invoke$1) {
            lockSfdUC$invoke$1 = (LockSfdUC$invoke$1) continuationImpl;
            int i10 = lockSfdUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lockSfdUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                lockSfdUC$invoke$1 = new LockSfdUC$invoke$1(this, continuationImpl);
            }
        } else {
            lockSfdUC$invoke$1 = new LockSfdUC$invoke$1(this, continuationImpl);
        }
        Object objA = lockSfdUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = lockSfdUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s10 = lockSfdUC$invoke$1.S$0;
                gVar = (g) lockSfdUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            aVar = (C8.a) objA;
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            if (aVar instanceof C8.a.b) {
                return new C8.a.b(r.f47939a);
            }
            throw new NoWhenBranchMatchedException();
        }
        kotlin.b.b(objA);
        lockSfdUC$invoke$1.L$0 = this;
        lockSfdUC$invoke$1.S$0 = s10;
        lockSfdUC$invoke$1.label = 1;
        objA = this.f30943b.a(s10, lockSfdUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        gVar = this;
        C8.a aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.C0024a) {
            gVar.f30942a.d(((C8.a.C0024a) aVar2).f2462a, false);
            return aVar2;
        }
        lockSfdUC$invoke$1.L$0 = null;
        lockSfdUC$invoke$1.label = 2;
        objA = gVar.f30944c.a(s10, lockSfdUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        if (aVar instanceof C8.a.b) {
            return new C8.a.b(r.f47939a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
