package com.voltasit.obdeleven.data.repositories;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FaultRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements p084g8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.x f30354b;

    public i(com.voltasit.sharednetwork.a aVar, A8.x xVar) {
        this.f30353a = aVar;
        this.f30354b = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p084g8.a
    public final Object q(List list, String str, ContinuationImpl continuationImpl) {
        FaultRepositoryImpl$getUdsFaultDescriptions$1 faultRepositoryImpl$getUdsFaultDescriptions$1;
        i iVar;
        if (continuationImpl instanceof FaultRepositoryImpl$getUdsFaultDescriptions$1) {
            faultRepositoryImpl$getUdsFaultDescriptions$1 = (FaultRepositoryImpl$getUdsFaultDescriptions$1) continuationImpl;
            int i10 = faultRepositoryImpl$getUdsFaultDescriptions$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                faultRepositoryImpl$getUdsFaultDescriptions$1.label = i10 - Integer.MIN_VALUE;
            } else {
                faultRepositoryImpl$getUdsFaultDescriptions$1 = new FaultRepositoryImpl$getUdsFaultDescriptions$1(this, continuationImpl);
            }
        } else {
            faultRepositoryImpl$getUdsFaultDescriptions$1 = new FaultRepositoryImpl$getUdsFaultDescriptions$1(this, continuationImpl);
        }
        Object objQ = faultRepositoryImpl$getUdsFaultDescriptions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = faultRepositoryImpl$getUdsFaultDescriptions$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objQ);
                com.voltasit.sharednetwork.a aVar = this.f30353a;
                faultRepositoryImpl$getUdsFaultDescriptions$1.L$0 = this;
                faultRepositoryImpl$getUdsFaultDescriptions$1.label = 1;
                objQ = aVar.q(list, str, faultRepositoryImpl$getUdsFaultDescriptions$1);
                if (objQ == coroutineSingletons) {
                    return coroutineSingletons;
                }
                iVar = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (i) faultRepositoryImpl$getUdsFaultDescriptions$1.L$0;
                kotlin.b.b(objQ);
            }
            Map map = (Map) objQ;
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.x.n(map.size()));
            for (Object obj : map.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                A8.x xVar = iVar.f30354b;
                A9.o input = (A9.o) ((Map.Entry) obj).getValue();
                kotlin.jvm.internal.i.e(input, "input");
                linkedHashMap.put(key, new p072f8.a(input.f1027a, A8.u.a(A8.v.a(input.f1028b))));
            }
            return new C8.a.b(linkedHashMap);
        } catch (Throwable th) {
            return new C8.a.C0024a(th);
        }
    }
}
