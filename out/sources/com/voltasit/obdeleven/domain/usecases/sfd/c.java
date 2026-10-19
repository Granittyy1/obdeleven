package com.voltasit.obdeleven.domain.usecases.sfd;

import J8.p;
import com.voltasit.obdeleven.domain.exceptions.BadResponseException;
import com.voltasit.obdeleven.domain.exceptions.ModuleDisruptedException;
import com.voltasit.obdeleven.domain.exceptions.NegativeResponseCodeException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetSfdActivationDataUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.g f30930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30931b;

    public c(com.voltasit.obdeleven.domain.usecases.controlUnit.g gVar, p pVar) {
        this.f30930a = gVar;
        this.f30931b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(short s10, ContinuationImpl continuationImpl) {
        GetSfdActivationDataUC$invoke$1 getSfdActivationDataUC$invoke$1;
        c cVar;
        if (continuationImpl instanceof GetSfdActivationDataUC$invoke$1) {
            getSfdActivationDataUC$invoke$1 = (GetSfdActivationDataUC$invoke$1) continuationImpl;
            int i10 = getSfdActivationDataUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getSfdActivationDataUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getSfdActivationDataUC$invoke$1 = new GetSfdActivationDataUC$invoke$1(this, continuationImpl);
            }
        } else {
            getSfdActivationDataUC$invoke$1 = new GetSfdActivationDataUC$invoke$1(this, continuationImpl);
        }
        Object objA = getSfdActivationDataUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getSfdActivationDataUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            short s11 = s10;
            this.f30931b.f("GetSfdActivationDataUC", androidx.compose.foundation.gestures.d.b("GetSfdActivationDataUC(klineId=", p293xa.p.a(s11), ")"));
            getSfdActivationDataUC$invoke$1.L$0 = this;
            getSfdActivationDataUC$invoke$1.label = 1;
            objA = this.f30930a.a("01C00802", getSfdActivationDataUC$invoke$1, s11);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) getSfdActivationDataUC$invoke$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            String str = (String) ((C8.a.b) aVar).f2463a;
            if (str.length() <= 10) {
                return new C8.a.C0024a(new BadResponseException(str));
            }
            String strSubstring = str.substring(10);
            kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
            return new C8.a.b(strSubstring);
        }
        if (!(aVar instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable th = ((C8.a.C0024a) aVar).f2462a;
        cVar.getClass();
        NegativeResponseCodeException negativeResponseCodeException = th instanceof NegativeResponseCodeException ? (NegativeResponseCodeException) th : null;
        return (negativeResponseCodeException == null || negativeResponseCodeException.a() != 16) ? new C8.a.C0024a(th) : new C8.a.C0024a(new ModuleDisruptedException());
    }
}
