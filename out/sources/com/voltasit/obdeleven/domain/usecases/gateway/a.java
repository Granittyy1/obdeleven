package com.voltasit.obdeleven.domain.usecases.gateway;

import J8.j;
import com.voltasit.obdeleven.domain.exceptions.SecurityAccessException;
import com.voltasit.obdeleven.domain.models.Nrc;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import p109i8.h;
import p134k8.T0;

/* JADX INFO: compiled from: GatewayAutoCodeUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f30837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f30838b;

    public a(j jVar, c cVar) {
        this.f30837a = jVar;
        this.f30838b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Q8.a aVar, ContinuationImpl continuationImpl) {
        GatewayAutoCodeUC$invoke$1 gatewayAutoCodeUC$invoke$1;
        a aVar2;
        Object c0024a;
        if (continuationImpl instanceof GatewayAutoCodeUC$invoke$1) {
            gatewayAutoCodeUC$invoke$1 = (GatewayAutoCodeUC$invoke$1) continuationImpl;
            int i10 = gatewayAutoCodeUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gatewayAutoCodeUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                gatewayAutoCodeUC$invoke$1 = new GatewayAutoCodeUC$invoke$1(this, continuationImpl);
            }
        } else {
            gatewayAutoCodeUC$invoke$1 = new GatewayAutoCodeUC$invoke$1(this, continuationImpl);
        }
        Object objA = gatewayAutoCodeUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = gatewayAutoCodeUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar = (Q8.a) gatewayAutoCodeUC$invoke$1.L$1;
                aVar2 = (a) gatewayAutoCodeUC$invoke$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
        }
        kotlin.b.b(objA);
        gatewayAutoCodeUC$invoke$1.L$0 = this;
        gatewayAutoCodeUC$invoke$1.L$1 = aVar;
        gatewayAutoCodeUC$invoke$1.label = 1;
        objA = this.f30837a.a(aVar, gatewayAutoCodeUC$invoke$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar2 = this;
        C8.a aVar3 = (C8.a) objA;
        if (!(aVar3 instanceof C8.a.b)) {
            if (aVar3 instanceof C8.a.C0024a) {
                return aVar3;
            }
            throw new NoWhenBranchMatchedException();
        }
        T0 t8 = (T0) ((C8.a.b) aVar3).f2463a;
        gatewayAutoCodeUC$invoke$1.L$0 = null;
        gatewayAutoCodeUC$invoke$1.L$1 = null;
        gatewayAutoCodeUC$invoke$1.label = 2;
        aVar2.getClass();
        h hVar = aVar.f5126b;
        int i12 = t8.f42677c;
        if (i12 == 0) {
            i.b(hVar);
            c0024a = aVar2.f30838b.a(hVar, t8, gatewayAutoCodeUC$invoke$1);
        } else {
            c0024a = i12 == Nrc.f30498d.a() ? new C8.a.C0024a(new SecurityAccessException()) : new C8.a.C0024a(new Throwable("Failed gateway auto coding"));
        }
        objA = c0024a;
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
