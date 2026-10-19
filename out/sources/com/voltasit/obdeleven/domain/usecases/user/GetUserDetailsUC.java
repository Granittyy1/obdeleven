package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.models.SubscriptionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: GetUserDetailsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetUserDetailsUC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.o f30972b;

    public GetUserDetailsUC(K8.v vVar, K8.o oVar) {
        this.f30971a = vVar;
        this.f30972b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(kotlin.coroutines.c<? super C8.a<G8.D>> cVar) {
        GetUserDetailsUC$invoke$1 getUserDetailsUC$invoke$1;
        GetUserDetailsUC getUserDetailsUC;
        if (cVar instanceof GetUserDetailsUC$invoke$1) {
            getUserDetailsUC$invoke$1 = (GetUserDetailsUC$invoke$1) cVar;
            int i10 = getUserDetailsUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getUserDetailsUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getUserDetailsUC$invoke$1 = new GetUserDetailsUC$invoke$1(this, cVar);
            }
        } else {
            getUserDetailsUC$invoke$1 = new GetUserDetailsUC$invoke$1(this, cVar);
        }
        Object objV = getUserDetailsUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getUserDetailsUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objV);
            K8.v vVar = this.f30971a;
            if (!vVar.z()) {
                SubscriptionType.a aVar = SubscriptionType.f30540b;
                return new C8.a.b(new G8.D());
            }
            getUserDetailsUC$invoke$1.L$0 = this;
            getUserDetailsUC$invoke$1.label = 1;
            objV = vVar.v(getUserDetailsUC$invoke$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            getUserDetailsUC = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getUserDetailsUC = (GetUserDetailsUC) getUserDetailsUC$invoke$1.L$0;
            kotlin.b.b(objV);
        }
        C8.a aVar2 = (C8.a) objV;
        if (!(aVar2 instanceof C8.a.b)) {
            if (aVar2 instanceof C8.a.C0024a) {
                return aVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        G8.E e10 = (G8.E) ((C8.a.b) aVar2).f2463a;
        getUserDetailsUC.getClass();
        G8.t tVar = e10.f3414b;
        K8.o oVar = getUserDetailsUC.f30972b;
        oVar.P(tVar.f3541a);
        oVar.n(e10.f3414b.f3542b);
        return new C8.a.b(e10.f3413a);
    }
}
