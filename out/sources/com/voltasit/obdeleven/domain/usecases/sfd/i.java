package com.voltasit.obdeleven.domain.usecases.sfd;

import J8.p;
import com.voltasit.obdeleven.domain.exceptions.InvalidSfdTokenException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.o;

/* JADX INFO: compiled from: UnlockSfdRequestUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.g f30952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30953b;

    public i(com.voltasit.obdeleven.domain.usecases.controlUnit.g gVar, p pVar) {
        this.f30952a = gVar;
        this.f30953b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, ContinuationImpl continuationImpl, short s10) {
        UnlockSfdRequestUC$invoke$1 unlockSfdRequestUC$invoke$1;
        i iVar;
        if (continuationImpl instanceof UnlockSfdRequestUC$invoke$1) {
            unlockSfdRequestUC$invoke$1 = (UnlockSfdRequestUC$invoke$1) continuationImpl;
            int i10 = unlockSfdRequestUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                unlockSfdRequestUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                unlockSfdRequestUC$invoke$1 = new UnlockSfdRequestUC$invoke$1(this, continuationImpl);
            }
        } else {
            unlockSfdRequestUC$invoke$1 = new UnlockSfdRequestUC$invoke$1(this, continuationImpl);
        }
        Object objA = unlockSfdRequestUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = unlockSfdRequestUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            short s11 = s10;
            this.f30953b.f("UnlockSfdRequestUC", "UnlockSfdRequestUC(klineId=" + p293xa.p.a(s11) + ", sfdToken.length=" + str.length() + ")");
            String strConcat = "01C004".concat(str);
            unlockSfdRequestUC$invoke$1.L$0 = this;
            unlockSfdRequestUC$invoke$1.label = 1;
            objA = this.f30952a.a(strConcat, unlockSfdRequestUC$invoke$1, s11);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            iVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (i) unlockSfdRequestUC$invoke$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str2 = (String) ((C8.a.b) aVar).f2463a;
        if (!o.u0(str2).equals("00")) {
            return o.u0(str2).equals("07") ? new C8.a.C0024a(InvalidSfdTokenException.f30410b) : new C8.a.b(Boolean.FALSE);
        }
        iVar.f30953b.e("UnlockSfdRequestUC", "Unlock request successful");
        return new C8.a.b(Boolean.TRUE);
    }
}
