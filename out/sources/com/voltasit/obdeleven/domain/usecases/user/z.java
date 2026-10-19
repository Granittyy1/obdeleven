package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RemoveLocalUserDataUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f31033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.o f31034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f31035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J8.v f31036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K8.b f31037e;

    public z(K8.v vVar, K8.o oVar, x xVar, J8.v vVar2, K8.b bVar) {
        this.f31033a = vVar;
        this.f31034b = oVar;
        this.f31035c = xVar;
        this.f31036d = vVar2;
        this.f31037e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        RemoveLocalUserDataUC$invoke$1 removeLocalUserDataUC$invoke$1;
        z zVar;
        if (continuationImpl instanceof RemoveLocalUserDataUC$invoke$1) {
            removeLocalUserDataUC$invoke$1 = (RemoveLocalUserDataUC$invoke$1) continuationImpl;
            int i10 = removeLocalUserDataUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                removeLocalUserDataUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                removeLocalUserDataUC$invoke$1 = new RemoveLocalUserDataUC$invoke$1(this, continuationImpl);
            }
        } else {
            removeLocalUserDataUC$invoke$1 = new RemoveLocalUserDataUC$invoke$1(this, continuationImpl);
        }
        Object obj = removeLocalUserDataUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = removeLocalUserDataUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            removeLocalUserDataUC$invoke$1.L$0 = this;
            removeLocalUserDataUC$invoke$1.label = 1;
            if (this.f31033a.N(removeLocalUserDataUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            zVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (z) removeLocalUserDataUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        zVar.f31034b.j0("workshopNumber");
        K8.o oVar = zVar.f31034b;
        oVar.j0("sharingEmail");
        oVar.j0("device_list");
        oVar.n(false);
        oVar.P(false);
        zVar.f31037e.g(p279w9.a.f47821s);
        zVar.f31036d.a();
        zVar.f31035c.a();
        return p293xa.r.f47939a;
    }
}
