package com.voltasit.obdeleven.domain.usecases.vehicle;

import G8.D;
import J8.u;
import K8.v;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ShouldShowVagRedirectDialogAfterLoginUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f31085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f31086b;

    public s(u uVar, v vVar) {
        this.f31085a = uVar;
        this.f31086b = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        ShouldShowVagRedirectDialogAfterLoginUC$invoke$1 shouldShowVagRedirectDialogAfterLoginUC$invoke$1;
        Object objH;
        if (continuationImpl instanceof ShouldShowVagRedirectDialogAfterLoginUC$invoke$1) {
            shouldShowVagRedirectDialogAfterLoginUC$invoke$1 = (ShouldShowVagRedirectDialogAfterLoginUC$invoke$1) continuationImpl;
            int i10 = shouldShowVagRedirectDialogAfterLoginUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                shouldShowVagRedirectDialogAfterLoginUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                shouldShowVagRedirectDialogAfterLoginUC$invoke$1 = new ShouldShowVagRedirectDialogAfterLoginUC$invoke$1(this, continuationImpl);
            }
        } else {
            shouldShowVagRedirectDialogAfterLoginUC$invoke$1 = new ShouldShowVagRedirectDialogAfterLoginUC$invoke$1(this, continuationImpl);
        }
        Object obj = shouldShowVagRedirectDialogAfterLoginUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = shouldShowVagRedirectDialogAfterLoginUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            if (!this.f31085a.j()) {
                return Boolean.FALSE;
            }
            v vVar = this.f31086b;
            if (((D) vVar.A().getValue()).f3410a != SubscriptionType.None) {
                return Boolean.FALSE;
            }
            shouldShowVagRedirectDialogAfterLoginUC$invoke$1.label = 1;
            objH = vVar.H(shouldShowVagRedirectDialogAfterLoginUC$invoke$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            objH = ((Result) obj).b();
        }
        return objH instanceof Result.Failure ? Boolean.FALSE : objH;
    }
}
