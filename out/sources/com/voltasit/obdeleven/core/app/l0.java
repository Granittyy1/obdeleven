package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.exceptions.SfdInvalidCountryCodeException;
import com.voltasit.obdeleven.domain.exceptions.SfdRateLimitException;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C2680e;
import p255u9.C2801d;

/* JADX INFO: compiled from: SfdUnlockCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends T {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.j f30114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.d f30115l;

    public l0(I8.b bVar, com.voltasit.obdeleven.domain.usecases.sfd.j jVar, com.voltasit.obdeleven.domain.usecases.sfd.d dVar) {
        super(bVar);
        this.f30114k = jVar;
        this.f30115l = dVar;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
        return j(controlUnit);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
        return j(controlUnit);
    }

    public final Task<Integer> j(ControlUnit controlUnit) {
        C2801d controlUnitBase;
        ControlUnitDB controlUnitDB = controlUnit.f29320b;
        final String objectId = (controlUnitDB == null || (controlUnitBase = controlUnitDB.getControlUnitBase()) == null) ? null : controlUnitBase.getObjectId();
        if (objectId == null) {
            Task<Integer> taskForResult = Task.forResult(-6);
            kotlin.jvm.internal.i.d(taskForResult, "forResult(...)");
            return taskForResult;
        }
        final short sShortValue = controlUnit.n().shortValue();
        Task<Integer> taskCallInBackground = Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.core.app.k0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                l0 this$0 = this.f30108b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                String str = objectId;
                short s10 = sShortValue;
                SfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1 sfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1 = new SfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1(this$0, s10, null);
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f43032b;
                C8.a aVar = (C8.a) C2680e.d(emptyCoroutineContext, sfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1);
                int i10 = 0;
                if (aVar instanceof C8.a.b) {
                    G8.w wVar = (G8.w) ((C8.a.b) aVar).f2463a;
                    if (wVar.f3553a && wVar.f3554b >= 5) {
                        return 0;
                    }
                } else if (!(aVar instanceof C8.a.C0024a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C8.a aVar2 = (C8.a) C2680e.d(emptyCoroutineContext, new SfdUnlockCommand$unlockCu$output$1(this$0, str, s10, null));
                if (!(aVar2 instanceof C8.a.b)) {
                    if (!(aVar2 instanceof C8.a.C0024a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Throwable th = ((C8.a.C0024a) aVar2).f2462a;
                    if (th instanceof SfdRateLimitException) {
                        kotlin.jvm.internal.i.c(th, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.exceptions.SfdRateLimitException");
                        int iOrdinal = ((SfdRateLimitException) th).b().ordinal();
                        if (iOrdinal == 0) {
                            i10 = -8;
                        } else if (iOrdinal == 1 || iOrdinal == 2) {
                            i10 = -7;
                        } else {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i10 = -9;
                        }
                    } else {
                        i10 = th instanceof SfdInvalidCountryCodeException ? -10 : -6;
                    }
                }
                return Integer.valueOf(i10);
            }
        });
        kotlin.jvm.internal.i.d(taskCallInBackground, "callInBackground(...)");
        return taskCallInBackground;
    }
}
