package com.voltasit.obdeleven.domain.usecases.user;

/* JADX INFO: compiled from: HandleExpiredSessionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F8.c f30997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f30998b;

    public j(F8.c cVar, u uVar) {
        this.f30997a = cVar;
        this.f30998b = uVar;
    }

    public final kotlinx.coroutines.flow.t a() {
        return new kotlinx.coroutines.flow.t(new HandleExpiredSessionUC$invoke$1(this, null));
    }
}
