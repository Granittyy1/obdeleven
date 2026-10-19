package com.voltasit.obdeleven.domain.usecases;

import com.obdeleven.service.enums.RequestType;
import com.voltasit.obdeleven.domain.models.ControlUnitType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.D;

/* JADX INFO: compiled from: Sfd2IsPopTheHoodRequiredUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.x f31088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.f f31089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.p f31090c;

    public x(J8.x xVar, com.voltasit.obdeleven.domain.usecases.controlUnit.f fVar, J8.p pVar) {
        this.f31088a = xVar;
        this.f31089b = fVar;
        this.f31090c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(ContinuationImpl continuationImpl) {
        Sfd2IsPopTheHoodRequiredUC$invoke$1 sfd2IsPopTheHoodRequiredUC$invoke$1;
        x xVar;
        if (continuationImpl instanceof Sfd2IsPopTheHoodRequiredUC$invoke$1) {
            sfd2IsPopTheHoodRequiredUC$invoke$1 = (Sfd2IsPopTheHoodRequiredUC$invoke$1) continuationImpl;
            int i10 = sfd2IsPopTheHoodRequiredUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sfd2IsPopTheHoodRequiredUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sfd2IsPopTheHoodRequiredUC$invoke$1 = new Sfd2IsPopTheHoodRequiredUC$invoke$1(this, continuationImpl);
            }
        } else {
            sfd2IsPopTheHoodRequiredUC$invoke$1 = new Sfd2IsPopTheHoodRequiredUC$invoke$1(this, continuationImpl);
        }
        Object objA = sfd2IsPopTheHoodRequiredUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sfd2IsPopTheHoodRequiredUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            this.f31090c.f("Sfd2IsPopTheHoodRequiredUC", "Sfd2IsPopTheHoodRequiredUC()");
            D dI = this.f31088a.k().f42726c.i();
            if (dI == null || !dI.getBoolean("isFirewallProtected")) {
                return Boolean.FALSE;
            }
            short sA = ControlUnitType.Gateway.a();
            String strA = RequestType.DiagnosisFilterStatus.a();
            sfd2IsPopTheHoodRequiredUC$invoke$1.L$0 = this;
            sfd2IsPopTheHoodRequiredUC$invoke$1.label = 1;
            objA = this.f31089b.a(strA, sfd2IsPopTheHoodRequiredUC$invoke$1, sA);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            xVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = (x) sfd2IsPopTheHoodRequiredUC$invoke$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            xVar.f31090c.d(((C8.a.C0024a) aVar).f2462a, false);
            return Boolean.FALSE;
        }
        kotlin.jvm.internal.i.c(aVar, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.common.Output.Success<kotlin.String>");
        String str = (String) ((C8.a.b) aVar).f2463a;
        String strSubstring = str.substring(0, 2);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        O.h.c(16);
        boolean z10 = Integer.parseInt(strSubstring, 16) == 1;
        String strSubstring2 = str.substring(2, 4);
        kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
        O.h.c(16);
        return Boolean.valueOf(z10 && (Integer.parseInt(strSubstring2, 16) == 1));
    }
}
