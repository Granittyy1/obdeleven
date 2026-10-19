package com.voltasit.obdeleven.domain.usecases.controlUnit;

import com.parse.ControlUnitDB;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetFilteredControlUnitsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.d f30654c;

    public b(K8.d dVar) {
        this.f30654c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i0(String str, ContinuationImpl continuationImpl) {
        GetFilteredControlUnitsUC$execute$1 getFilteredControlUnitsUC$execute$1;
        if (continuationImpl instanceof GetFilteredControlUnitsUC$execute$1) {
            getFilteredControlUnitsUC$execute$1 = (GetFilteredControlUnitsUC$execute$1) continuationImpl;
            int i10 = getFilteredControlUnitsUC$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getFilteredControlUnitsUC$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getFilteredControlUnitsUC$execute$1 = new GetFilteredControlUnitsUC$execute$1(this, continuationImpl);
            }
        } else {
            getFilteredControlUnitsUC$execute$1 = new GetFilteredControlUnitsUC$execute$1(this, continuationImpl);
        }
        Object objE = getFilteredControlUnitsUC$execute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getFilteredControlUnitsUC$execute$1.label;
        if (i11 == 0) {
            kotlin.b.b(objE);
            getFilteredControlUnitsUC$execute$1.label = 1;
            objE = this.f30654c.e(str, getFilteredControlUnitsUC$execute$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objE);
        }
        C8.a aVar = (C8.a) objE;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterable iterable = (Iterable) ((C8.a.b) aVar).f2463a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((ControlUnitDB) obj).isValid()) {
                arrayList.add(obj);
            }
        }
        return new C8.a.b(arrayList);
    }
}
