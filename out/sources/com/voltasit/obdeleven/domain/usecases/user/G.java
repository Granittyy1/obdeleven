package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: VerifyUserEmailUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30970b;

    public G(J8.p pVar, K8.v vVar) {
        this.f30969a = vVar;
        this.f30970b = pVar;
    }

    public final Object a(String str, SuspendLambda suspendLambda) {
        this.f30970b.f("VerifyUserEmailUC", androidx.compose.foundation.gestures.d.b("VerifyUserEmailUC(email=", str, ")"));
        return this.f30969a.E(str, suspendLambda);
    }
}
