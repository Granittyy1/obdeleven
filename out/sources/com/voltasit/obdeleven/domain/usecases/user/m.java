package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: IsEmailVerifiedUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f31001a;

    public m(K8.v vVar) {
        this.f31001a = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        IsEmailVerifiedUC$invoke$1 isEmailVerifiedUC$invoke$1;
        m mVar;
        if (continuationImpl instanceof IsEmailVerifiedUC$invoke$1) {
            isEmailVerifiedUC$invoke$1 = (IsEmailVerifiedUC$invoke$1) continuationImpl;
            int i10 = isEmailVerifiedUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isEmailVerifiedUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isEmailVerifiedUC$invoke$1 = new IsEmailVerifiedUC$invoke$1(this, continuationImpl);
            }
        } else {
            isEmailVerifiedUC$invoke$1 = new IsEmailVerifiedUC$invoke$1(this, continuationImpl);
        }
        Object obj = isEmailVerifiedUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isEmailVerifiedUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            isEmailVerifiedUC$invoke$1.L$0 = this;
            isEmailVerifiedUC$invoke$1.label = 1;
            if (this.f31001a.F(isEmailVerifiedUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) isEmailVerifiedUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(mVar.f31001a.L().getBoolean("emailVerified"));
    }
}
