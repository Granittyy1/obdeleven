package com.voltasit.obdeleven.domain.usecases.sfd;

import J8.p;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LockSfdRequestUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.g f30940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f30941b;

    public f(com.voltasit.obdeleven.domain.usecases.controlUnit.g gVar, p pVar) {
        this.f30940a = gVar;
        this.f30941b = pVar;
    }

    public final Object a(short s10, ContinuationImpl continuationImpl) {
        this.f30941b.f("LockSfdRequestUC", androidx.compose.foundation.gestures.d.b("LockSfdRequestUC(klineId=", p293xa.p.a(s10), ")"));
        return this.f30940a.a("01C005", continuationImpl, s10);
    }
}
