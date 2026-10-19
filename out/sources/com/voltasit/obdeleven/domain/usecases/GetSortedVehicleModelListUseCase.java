package com.voltasit.obdeleven.domain.usecases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.D;
import p255u9.F;

/* JADX INFO: compiled from: GetSortedVehicleModelListUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetSortedVehicleModelListUseCase extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.x f30616c;

    public GetSortedVehicleModelListUseCase(K8.x xVar) {
        this.f30616c = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i0(List<D> list, kotlin.coroutines.c<? super C8.a<? extends List<? extends p315z8.c>>> cVar) {
        GetSortedVehicleModelListUseCase$execute$1 getSortedVehicleModelListUseCase$execute$1;
        p315z8.d dVar;
        p315z8.c cVar2;
        if (cVar instanceof GetSortedVehicleModelListUseCase$execute$1) {
            getSortedVehicleModelListUseCase$execute$1 = (GetSortedVehicleModelListUseCase$execute$1) cVar;
            int i10 = getSortedVehicleModelListUseCase$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getSortedVehicleModelListUseCase$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getSortedVehicleModelListUseCase$execute$1 = new GetSortedVehicleModelListUseCase$execute$1(this, (ContinuationImpl) cVar);
            }
        } else {
            getSortedVehicleModelListUseCase$execute$1 = new GetSortedVehicleModelListUseCase$execute$1(this, (ContinuationImpl) cVar);
        }
        Object objB = getSortedVehicleModelListUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getSortedVehicleModelListUseCase$execute$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            getSortedVehicleModelListUseCase$execute$1.label = 1;
            objB = this.f30616c.b(list, getSortedVehicleModelListUseCase$execute$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objB);
        }
        C8.a aVar = (C8.a) objB;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        List<F> list2 = (List) ((C8.a.b) aVar).f2463a;
        ArrayList arrayList = new ArrayList();
        for (F f10 : list2) {
            D d10 = (D) f10.getParseObject("vehicleBase");
            Iterator it = arrayList.iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    cVar2 = null;
                    break;
                }
                cVar2 = (p315z8.c) it.next();
            } while (!cVar2.f48948a.getObjectId().equals(d10.getObjectId()));
            if (cVar2 == null) {
                cVar2 = new p315z8.c(d10);
                arrayList.add(cVar2);
            }
            ArrayList<p315z8.d> arrayList2 = cVar2.f48949b;
            for (p315z8.d dVar2 : arrayList2) {
                if (dVar2.f48950a.equals(f10.getString("model"))) {
                    dVar = dVar2;
                    break;
                }
            }
            if (dVar == null) {
                dVar = new p315z8.d(f10.getString("model"));
                arrayList2.add(dVar);
            }
            dVar.f48951b.add(f10);
        }
        Collections.sort(arrayList, new p315z8.b());
        kotlin.collections.p.G(arrayList, new q(0));
        return new C8.a.b(arrayList);
    }
}
