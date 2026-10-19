package com.voltasit.obdeleven.domain.usecases.vehicle;

import J8.x;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetGatewaysForCodingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f31046c;

    public e(x xVar) {
        this.f31046c = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i0(kotlin.coroutines.c cVar) {
        GetGatewaysForCodingUC$execute$1 getGatewaysForCodingUC$execute$1;
        if (cVar instanceof GetGatewaysForCodingUC$execute$1) {
            getGatewaysForCodingUC$execute$1 = (GetGatewaysForCodingUC$execute$1) cVar;
            int i10 = getGatewaysForCodingUC$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getGatewaysForCodingUC$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getGatewaysForCodingUC$execute$1 = new GetGatewaysForCodingUC$execute$1(this, (ContinuationImpl) cVar);
            }
        } else {
            getGatewaysForCodingUC$execute$1 = new GetGatewaysForCodingUC$execute$1(this, (ContinuationImpl) cVar);
        }
        Object objI = getGatewaysForCodingUC$execute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getGatewaysForCodingUC$execute$1.label;
        if (i11 == 0) {
            kotlin.b.b(objI);
            getGatewaysForCodingUC$execute$1.label = 1;
            objI = this.f31046c.i(getGatewaysForCodingUC$execute$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objI);
        }
        C8.a aVar = (C8.a) objI;
        if (!(aVar instanceof C8.a.b)) {
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) ((C8.a.b) aVar).f2463a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((com.obdeleven.service.model.f) entry.getValue()).f29427E != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new C8.a.b(linkedHashMap);
    }
}
