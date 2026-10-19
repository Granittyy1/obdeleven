package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: UpdateUserDetailsAndCreditsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.e f30965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.p f30966c;

    public C(K8.v vVar, K8.e eVar, J8.p pVar) {
        this.f30964a = vVar;
        this.f30965b = eVar;
        this.f30966c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        UpdateUserDetailsAndCreditsUC$invoke$1 updateUserDetailsAndCreditsUC$invoke$1;
        if (continuationImpl instanceof UpdateUserDetailsAndCreditsUC$invoke$1) {
            updateUserDetailsAndCreditsUC$invoke$1 = (UpdateUserDetailsAndCreditsUC$invoke$1) continuationImpl;
            int i10 = updateUserDetailsAndCreditsUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateUserDetailsAndCreditsUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateUserDetailsAndCreditsUC$invoke$1 = new UpdateUserDetailsAndCreditsUC$invoke$1(this, continuationImpl);
            }
        } else {
            updateUserDetailsAndCreditsUC$invoke$1 = new UpdateUserDetailsAndCreditsUC$invoke$1(this, continuationImpl);
        }
        Object objD = updateUserDetailsAndCreditsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateUserDetailsAndCreditsUC$invoke$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objD);
                this.f30966c.f("UpdateUserDetailsAndCreditsUC", "UpdateUserDetailsAndCreditsUC()");
                if (!this.f30964a.z()) {
                    return new C8.a.b(p293xa.r.f47939a);
                }
                UpdateUserDetailsAndCreditsUC$invoke$2 updateUserDetailsAndCreditsUC$invoke$2 = new UpdateUserDetailsAndCreditsUC$invoke$2(this, null);
                updateUserDetailsAndCreditsUC$invoke$1.label = 1;
                objD = kotlinx.coroutines.B.d(updateUserDetailsAndCreditsUC$invoke$2, updateUserDetailsAndCreditsUC$invoke$1);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objD);
            }
            return objD;
        } catch (Throwable th) {
            return new C8.a.C0024a(th);
        }
    }
}
