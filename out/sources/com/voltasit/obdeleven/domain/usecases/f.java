package com.voltasit.obdeleven.domain.usecases;

import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.models.UserPermission;

/* JADX INFO: compiled from: CheckIfRawDataShouldBeShownUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.o f30833b;

    public f(K8.v vVar, K8.o oVar) {
        this.f30832a = vVar;
        this.f30833b = oVar;
    }

    public final boolean a() {
        UserPermission[] userPermissionArr = {UserPermission.SEE_RAW_DATA};
        K8.v vVar = this.f30832a;
        return (vVar.C(userPermissionArr) || vVar.K().f3410a == SubscriptionType.Ultimate) && this.f30833b.I();
    }
}
