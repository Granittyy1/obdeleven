package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LogInUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f31005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.n f31007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f31008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.o f31009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.B f31010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final K8.v f31011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.voltasit.sharednetwork.dataSources.a f31012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D f31013i;
    public final x j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J8.a f31014k;

    public r(s sVar, t tVar, com.voltasit.obdeleven.domain.usecases.n nVar, i iVar, com.voltasit.obdeleven.domain.usecases.vehicle.o oVar, com.voltasit.obdeleven.domain.usecases.B b10, K8.v vVar, com.voltasit.sharednetwork.dataSources.a aVar, D d10, x xVar, J8.a aVar2) {
        this.f31005a = sVar;
        this.f31006b = tVar;
        this.f31007c = nVar;
        this.f31008d = iVar;
        this.f31009e = oVar;
        this.f31010f = b10;
        this.f31011g = vVar;
        this.f31012h = aVar;
        this.f31013i = d10;
        this.j = xVar;
        this.f31014k = aVar2;
    }

    public static /* synthetic */ Object b(r rVar, G8.r rVar2, String str, String str2, SuspendLambda suspendLambda, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return rVar.a(rVar2, str, str2, suspendLambda);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(G8.r rVar, String str, String str2, ContinuationImpl continuationImpl) {
        LogInUC$invoke$1 logInUC$invoke$1;
        r rVar2;
        C8.a aVar;
        if (continuationImpl instanceof LogInUC$invoke$1) {
            logInUC$invoke$1 = (LogInUC$invoke$1) continuationImpl;
            int i10 = logInUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                logInUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                logInUC$invoke$1 = new LogInUC$invoke$1(this, continuationImpl);
            }
        } else {
            logInUC$invoke$1 = new LogInUC$invoke$1(this, continuationImpl);
        }
        Object objA = logInUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = logInUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            if (rVar instanceof G8.r.a) {
                G8.r.a aVar2 = (G8.r.a) rVar;
                String str3 = aVar2.f3531b;
                logInUC$invoke$1.L$0 = this;
                logInUC$invoke$1.label = 1;
                objA = this.f31005a.a(str3, aVar2.f3532c, str, str2, logInUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rVar2 = this;
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.b) {
                    if (aVar instanceof C8.a.C0024a) {
                        return aVar;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                logInUC$invoke$1.L$0 = null;
                logInUC$invoke$1.label = 3;
                rVar2.getClass();
                objA = kotlinx.coroutines.B.d(new LogInUC$downloadUserData$2(rVar2, null), logInUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (!(rVar instanceof G8.r.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                G8.r.b bVar = (G8.r.b) rVar;
                String str4 = bVar.f3533b;
                logInUC$invoke$1.L$0 = this;
                logInUC$invoke$1.label = 2;
                objA = this.f31006b.a(str4, bVar.f3534c, bVar.f3535d, str, str2, logInUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rVar2 = this;
                aVar = (C8.a) objA;
                if (aVar instanceof C8.a.b) {
                    if (aVar instanceof C8.a.C0024a) {
                        return aVar;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                logInUC$invoke$1.L$0 = null;
                logInUC$invoke$1.label = 3;
                rVar2.getClass();
                objA = kotlinx.coroutines.B.d(new LogInUC$downloadUserData$2(rVar2, null), logInUC$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i11 == 1) {
            rVar2 = (r) logInUC$invoke$1.L$0;
            kotlin.b.b(objA);
            aVar = (C8.a) objA;
            if (aVar instanceof C8.a.b) {
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                throw new NoWhenBranchMatchedException();
            }
            logInUC$invoke$1.L$0 = null;
            logInUC$invoke$1.label = 3;
            rVar2.getClass();
            objA = kotlinx.coroutines.B.d(new LogInUC$downloadUserData$2(rVar2, null), logInUC$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i11 == 2) {
            rVar2 = (r) logInUC$invoke$1.L$0;
            kotlin.b.b(objA);
            aVar = (C8.a) objA;
            if (aVar instanceof C8.a.b) {
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                throw new NoWhenBranchMatchedException();
            }
            logInUC$invoke$1.L$0 = null;
            logInUC$invoke$1.label = 3;
            rVar2.getClass();
            objA = kotlinx.coroutines.B.d(new LogInUC$downloadUserData$2(rVar2, null), logInUC$invoke$1);
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
}
