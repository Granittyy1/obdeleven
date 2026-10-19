package com.voltasit.obdeleven.domain.usecases;

/* JADX INFO: compiled from: UpdateLoggerKeysUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.v f30611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.a f30612c;

    public B(J8.a aVar, J8.p pVar, K8.v vVar) {
        this.f30610a = pVar;
        this.f30611b = vVar;
        this.f30612c = aVar;
    }

    public final void a() {
        K8.v vVar = this.f30611b;
        if (vVar.z()) {
            p255u9.z zVarL = vVar.L();
            String objectId = zVarL.getObjectId();
            kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
            this.f30610a.a(objectId);
            String objectId2 = zVarL.getObjectId();
            kotlin.jvm.internal.i.d(objectId2, "getObjectId(...)");
            this.f30612c.a(objectId2);
        }
    }
}
