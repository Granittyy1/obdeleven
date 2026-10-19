package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.parse.Parse;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetUserPermissionsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.v f30994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.m f30995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.obdeleven.network.b f30996d;

    public i(J8.p pVar, K8.v vVar, K8.m mVar, com.voltasit.obdeleven.network.b bVar) {
        this.f30993a = pVar;
        this.f30994b = vVar;
        this.f30995c = mVar;
        this.f30996d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetUserPermissionsUC$invoke$1 getUserPermissionsUC$invoke$1;
        i iVar;
        if (continuationImpl instanceof GetUserPermissionsUC$invoke$1) {
            getUserPermissionsUC$invoke$1 = (GetUserPermissionsUC$invoke$1) continuationImpl;
            int i10 = getUserPermissionsUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getUserPermissionsUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getUserPermissionsUC$invoke$1 = new GetUserPermissionsUC$invoke$1(this, continuationImpl);
            }
        } else {
            getUserPermissionsUC$invoke$1 = new GetUserPermissionsUC$invoke$1(this, continuationImpl);
        }
        Object objA = getUserPermissionsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getUserPermissionsUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                iVar = (i) getUserPermissionsUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            return new C8.a.b(p293xa.r.f47939a);
        }
        kotlin.b.b(objA);
        this.f30993a.f("GetUserPermissionsUC", "GetUserPermissionsUC()");
        K8.v vVar = this.f30994b;
        if (!vVar.z() || vVar.L().getSessionToken() == null) {
            return new C8.a.b(p293xa.r.f47939a);
        }
        String sessionToken = vVar.L().getSessionToken();
        Parse.f34394a.f34437a = sessionToken;
        kotlin.jvm.internal.i.b(sessionToken);
        this.f30996d.a(sessionToken);
        getUserPermissionsUC$invoke$1.L$0 = this;
        getUserPermissionsUC$invoke$1.label = 1;
        objA = this.f30995c.a(getUserPermissionsUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        iVar = this;
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        K8.v vVar2 = iVar.f30994b;
        List list = (List) ((C8.a.b) aVar).f2463a;
        getUserPermissionsUC$invoke$1.L$0 = null;
        getUserPermissionsUC$invoke$1.label = 2;
        if (vVar2.w(list, getUserPermissionsUC$invoke$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return new C8.a.b(p293xa.r.f47939a);
    }
}
