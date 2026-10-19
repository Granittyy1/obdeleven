package com.voltasit.obdeleven.domain.usecases.sfd;

import G8.G;
import K8.v;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.usecases.user.k;
import com.voltasit.obdeleven.domain.usecases.user.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: IsSfdUnlockAllowedUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f30936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.h f30937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f30938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f30939d;

    public e(v vVar, com.voltasit.obdeleven.domain.usecases.user.h hVar, k kVar, n nVar) {
        this.f30936a = vVar;
        this.f30937b = hVar;
        this.f30938c = kVar;
        this.f30939d = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(ContinuationImpl continuationImpl) {
        IsSfdUnlockAllowedUC$invoke$1 isSfdUnlockAllowedUC$invoke$1;
        e eVar;
        e eVar2;
        C8.a aVar;
        if (continuationImpl instanceof IsSfdUnlockAllowedUC$invoke$1) {
            isSfdUnlockAllowedUC$invoke$1 = (IsSfdUnlockAllowedUC$invoke$1) continuationImpl;
            int i10 = isSfdUnlockAllowedUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isSfdUnlockAllowedUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isSfdUnlockAllowedUC$invoke$1 = new IsSfdUnlockAllowedUC$invoke$1(this, continuationImpl);
            }
        } else {
            isSfdUnlockAllowedUC$invoke$1 = new IsSfdUnlockAllowedUC$invoke$1(this, continuationImpl);
        }
        Object objF = isSfdUnlockAllowedUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isSfdUnlockAllowedUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                eVar = (e) isSfdUnlockAllowedUC$invoke$1.L$0;
                kotlin.b.b(objF);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar2 = (e) isSfdUnlockAllowedUC$invoke$1.L$0;
                kotlin.b.b(objF);
            }
            aVar = (C8.a) objF;
            if (aVar instanceof C8.a.C0024a) {
                if (((C8.a.C0024a) aVar).f2462a instanceof NotFoundException) {
                    return E8.a.j(Boolean.FALSE);
                }
                return aVar;
            }
            if (aVar instanceof C8.a.b) {
                throw new NoWhenBranchMatchedException();
            }
            if (eVar2.f30939d.a((G) ((C8.a.b) aVar).f2463a)) {
                return E8.a.j(Boolean.FALSE);
            }
            if (eVar2.f30936a.L().getBoolean("emailVerified")) {
                return eVar2.f30938c.f30999a.x() ? new C8.a.b(Boolean.TRUE) : new C8.a.b(Boolean.FALSE);
            }
            return new C8.a.b(Boolean.FALSE);
        }
        kotlin.b.b(objF);
        isSfdUnlockAllowedUC$invoke$1.L$0 = this;
        isSfdUnlockAllowedUC$invoke$1.label = 1;
        objF = this.f30936a.F(isSfdUnlockAllowedUC$invoke$1);
        if (objF == coroutineSingletons) {
            return coroutineSingletons;
        }
        eVar = this;
        C8.a aVar2 = (C8.a) objF;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        com.voltasit.obdeleven.domain.usecases.user.h hVar = eVar.f30937b;
        isSfdUnlockAllowedUC$invoke$1.L$0 = eVar;
        isSfdUnlockAllowedUC$invoke$1.label = 2;
        objF = hVar.f30992a.h(isSfdUnlockAllowedUC$invoke$1);
        if (objF == coroutineSingletons) {
            return coroutineSingletons;
        }
        eVar2 = eVar;
        aVar = (C8.a) objF;
        if (aVar instanceof C8.a.C0024a) {
            if (((C8.a.C0024a) aVar).f2462a instanceof NotFoundException) {
                return E8.a.j(Boolean.FALSE);
            }
            return aVar;
        }
        if (aVar instanceof C8.a.b) {
            throw new NoWhenBranchMatchedException();
        }
        if (eVar2.f30939d.a((G) ((C8.a.b) aVar).f2463a)) {
            return E8.a.j(Boolean.FALSE);
        }
        if (eVar2.f30936a.L().getBoolean("emailVerified")) {
            return new C8.a.b(Boolean.FALSE);
        }
        if (eVar2.f30938c.f30999a.x()) {
        }
    }
}
