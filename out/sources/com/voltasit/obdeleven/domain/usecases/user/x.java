package com.voltasit.obdeleven.domain.usecases.user;

/* JADX INFO: compiled from: RegisterIntercomUserUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f31028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f31029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.v f31030c;

    public x(K8.v vVar, J8.p pVar, J8.v vVar2) {
        this.f31028a = vVar;
        this.f31029b = pVar;
        this.f31030c = vVar2;
    }

    public final void a() {
        this.f31029b.f("RegisterIntercomUserUC", "invoke()");
        boolean z10 = this.f31028a.z();
        J8.v vVar = this.f31030c;
        if (z10) {
            vVar.b();
        } else {
            vVar.c();
        }
    }
}
