package com.voltasit.obdeleven.data.repositories;

import com.parse.ParseUser;
import com.voltasit.obdeleven.utils.CreditUtils;
import p255u9.z;

/* JADX INFO: compiled from: CreditsRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements K8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30348a;

    public g(J8.p pVar) {
        this.f30348a = pVar;
    }

    @Override // K8.e
    public final void a() {
        int i10 = z.f47484b;
        z zVar = (z) ParseUser.getCurrentUser();
        kotlin.jvm.internal.i.b(zVar);
        CreditUtils.b(zVar);
    }
}
