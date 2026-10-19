package com.voltasit.obdeleven.domain.usecases.oca;

import J8.p;
import J8.x;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.D;

/* JADX INFO: compiled from: IsOriginalAppValueValidUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.j f30882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f30883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f30884c;

    public i(K8.j jVar, x xVar, p pVar) {
        this.f30882a = jVar;
        this.f30883b = xVar;
        this.f30884c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        IsOriginalAppValueValidUC$invoke$1 isOriginalAppValueValidUC$invoke$1;
        i iVar;
        List list;
        if (continuationImpl instanceof IsOriginalAppValueValidUC$invoke$1) {
            isOriginalAppValueValidUC$invoke$1 = (IsOriginalAppValueValidUC$invoke$1) continuationImpl;
            int i10 = isOriginalAppValueValidUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isOriginalAppValueValidUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isOriginalAppValueValidUC$invoke$1 = new IsOriginalAppValueValidUC$invoke$1(this, continuationImpl);
            }
        } else {
            isOriginalAppValueValidUC$invoke$1 = new IsOriginalAppValueValidUC$invoke$1(this, continuationImpl);
        }
        Object objF = isOriginalAppValueValidUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isOriginalAppValueValidUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            D dI = this.f30883b.k().f42726c.i();
            String objectId = dI != null ? dI.getObjectId() : null;
            if (objectId == null) {
                objectId = "";
            }
            isOriginalAppValueValidUC$invoke$1.L$0 = this;
            isOriginalAppValueValidUC$invoke$1.L$1 = arrayList;
            isOriginalAppValueValidUC$invoke$1.label = 1;
            objF = this.f30882a.f(objectId, str, isOriginalAppValueValidUC$invoke$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
            iVar = this;
            list = arrayList;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) isOriginalAppValueValidUC$invoke$1.L$1;
            iVar = (i) isOriginalAppValueValidUC$invoke$1.L$0;
            kotlin.b.b(objF);
            list = list2;
        }
        C8.a aVar = (C8.a) objF;
        if (!(aVar instanceof C8.a.b)) {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((C8.a.C0024a) aVar).f2462a instanceof VehicleNotConnectedException) {
                iVar.f30884c.b("IsOriginalAppValueValidUC", "Vehicle is not connected");
            }
            return Boolean.FALSE;
        }
        List list3 = (List) ((C8.a.b) aVar).f2463a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list3) {
            if (((I8.b) obj).f3918d.length() > 0) {
                arrayList2.add(obj);
            }
        }
        return Boolean.valueOf(arrayList2.size() == list.size());
    }
}
