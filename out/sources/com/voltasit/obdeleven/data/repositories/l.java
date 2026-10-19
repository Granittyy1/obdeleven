package com.voltasit.obdeleven.data.repositories;

import com.voltasit.obdeleven.domain.repositories.InAppPurchaseRepository;
import com.voltasit.sharednetwork.domain.common.CloudException;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: InAppPurchaseRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements InAppPurchaseRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.voltasit.sharednetwork.dataSources.b f30363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F8.c f30364b;

    public l(com.voltasit.sharednetwork.dataSources.b client, F8.c cVar) {
        kotlin.jvm.internal.i.e(client, "client");
        this.f30363a = client;
        this.f30364b = cVar;
    }

    public static HashMap b(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("packageName", str);
        map.put("productId", str2);
        map.put("purchaseToken", str3);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.voltasit.obdeleven.domain.repositories.InAppPurchaseRepository
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        InAppPurchaseRepositoryImpl$purchase$1 inAppPurchaseRepositoryImpl$purchase$1;
        l lVar;
        if (continuationImpl instanceof InAppPurchaseRepositoryImpl$purchase$1) {
            inAppPurchaseRepositoryImpl$purchase$1 = (InAppPurchaseRepositoryImpl$purchase$1) continuationImpl;
            int i10 = inAppPurchaseRepositoryImpl$purchase$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                inAppPurchaseRepositoryImpl$purchase$1.label = i10 - Integer.MIN_VALUE;
            } else {
                inAppPurchaseRepositoryImpl$purchase$1 = new InAppPurchaseRepositoryImpl$purchase$1(this, continuationImpl);
            }
        } else {
            inAppPurchaseRepositoryImpl$purchase$1 = new InAppPurchaseRepositoryImpl$purchase$1(this, continuationImpl);
        }
        InAppPurchaseRepositoryImpl$purchase$1 inAppPurchaseRepositoryImpl$purchase$2 = inAppPurchaseRepositoryImpl$purchase$1;
        Object obj = inAppPurchaseRepositoryImpl$purchase$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = inAppPurchaseRepositoryImpl$purchase$2.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                try {
                    com.voltasit.sharednetwork.dataSources.b bVar = this.f30363a;
                    HashMap mapB = b(str, str2, str3);
                    inAppPurchaseRepositoryImpl$purchase$2.L$0 = this;
                    inAppPurchaseRepositoryImpl$purchase$2.label = 1;
                    if (com.voltasit.sharednetwork.dataSources.a.C0353a.b(bVar, "validatePurchaseAndroid", mapB, null, inAppPurchaseRepositoryImpl$purchase$2, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lVar = this;
                } catch (Throwable th) {
                    th = th;
                    lVar = this;
                    return E8.a.i(lVar.f30364b.a(th));
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (l) inAppPurchaseRepositoryImpl$purchase$2.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    return E8.a.i(lVar.f30364b.a(th));
                }
            }
            return new C8.a.b(InAppPurchaseRepository.Result.f30599b);
        } catch (CloudException.UnknownCloudException e10) {
            switch (e10.a()) {
                case 1001:
                    return new C8.a.b(InAppPurchaseRepository.Result.f30601d);
                case 1002:
                    return new C8.a.b(InAppPurchaseRepository.Result.f30600c);
                case 1003:
                    return new C8.a.b(InAppPurchaseRepository.Result.f30602e);
                case 1004:
                    return new C8.a.b(InAppPurchaseRepository.Result.f30603f);
                case 1005:
                    return new C8.a.b(InAppPurchaseRepository.Result.f30604g);
                default:
                    return new C8.a.C0024a(e10);
            }
        }
    }
}
