package com.voltasit.obdeleven.domain.usecases.odx;

import G8.p;
import K8.s;
import K8.v;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.voltasit.obdeleven.domain.models.UserPermission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RemoveHiddenCompuscalesUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f30903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f30904b;

    public j(s sVar, v vVar) {
        this.f30903a = sVar;
        this.f30904b = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        RemoveHiddenCompuscalesUC$invoke$1 removeHiddenCompuscalesUC$invoke$1;
        if (continuationImpl instanceof RemoveHiddenCompuscalesUC$invoke$1) {
            removeHiddenCompuscalesUC$invoke$1 = (RemoveHiddenCompuscalesUC$invoke$1) continuationImpl;
            int i10 = removeHiddenCompuscalesUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                removeHiddenCompuscalesUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                removeHiddenCompuscalesUC$invoke$1 = new RemoveHiddenCompuscalesUC$invoke$1(this, continuationImpl);
            }
        } else {
            removeHiddenCompuscalesUC$invoke$1 = new RemoveHiddenCompuscalesUC$invoke$1(this, continuationImpl);
        }
        Object objP = removeHiddenCompuscalesUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = removeHiddenCompuscalesUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objP);
            if (this.f30904b.C(UserPermission.FACTORY_RESET)) {
                return new C8.a.b(list);
            }
            removeHiddenCompuscalesUC$invoke$1.L$0 = list;
            removeHiddenCompuscalesUC$invoke$1.label = 1;
            objP = this.f30903a.p(removeHiddenCompuscalesUC$invoke$1);
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) removeHiddenCompuscalesUC$invoke$1.L$0;
            kotlin.b.b(objP);
        }
        C8.a aVar = (C8.a) objP;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterable iterable = (Iterable) ((C8.a.b) aVar).f2463a;
        ArrayList arrayList = new ArrayList(m.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((p) it.next()).f3529a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!arrayList.contains(((COMPUSCALE) obj).getCOMPUCONST().getVT().getTI())) {
                arrayList2.add(obj);
            }
        }
        return new C8.a.b(arrayList2);
    }
}
