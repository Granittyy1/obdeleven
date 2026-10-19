package com.voltasit.obdeleven.domain.usecases.vehicle;

import J8.x;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: IsPopTheHoodRequiredUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f31061a;

    public l(x xVar) {
        this.f31061a = xVar;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        x xVar = this.f31061a;
        return !xVar.b() ? new C8.a.b(Boolean.FALSE) : xVar.n(continuationImpl);
    }
}
