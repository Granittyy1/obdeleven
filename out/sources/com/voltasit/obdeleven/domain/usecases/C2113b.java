package com.voltasit.obdeleven.domain.usecases;

import android.app.Activity;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BuyProductUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2113b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PurchaseProvider f30636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.v f30637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f30638c;

    public C2113b(PurchaseProvider purchaseProvider, K8.v vVar, u uVar) {
        this.f30636a = purchaseProvider;
        this.f30637b = vVar;
        this.f30638c = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Activity activity, String str, p040d1.a aVar, ContinuationImpl continuationImpl) {
        BuyProductUC$invoke$1 buyProductUC$invoke$1;
        C2113b c2113b;
        C8.a aVar2;
        u uVar;
        if (continuationImpl instanceof BuyProductUC$invoke$1) {
            buyProductUC$invoke$1 = (BuyProductUC$invoke$1) continuationImpl;
            int i10 = buyProductUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                buyProductUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                buyProductUC$invoke$1 = new BuyProductUC$invoke$1(this, continuationImpl);
            }
        } else {
            buyProductUC$invoke$1 = new BuyProductUC$invoke$1(this, continuationImpl);
        }
        Object objD = buyProductUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = buyProductUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                C2113b c2113b2 = (C2113b) buyProductUC$invoke$1.L$0;
                kotlin.b.b(objD);
                c2113b = c2113b2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (C8.a) buyProductUC$invoke$1.L$1;
                c2113b = (C2113b) buyProductUC$invoke$1.L$0;
                kotlin.b.b(objD);
            }
            uVar = c2113b.f30638c;
            if (uVar.f30959a.W().f3551g) {
                uVar.f30960b.a();
            }
            return aVar2;
        }
        kotlin.b.b(objD);
        PurchaseProvider purchaseProvider = this.f30636a;
        buyProductUC$invoke$1.L$0 = this;
        buyProductUC$invoke$1.label = 1;
        objD = purchaseProvider.d(activity, str, aVar, buyProductUC$invoke$1);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        c2113b = this;
        aVar2 = (C8.a) objD;
        if (aVar2 instanceof C8.a.b) {
            K8.v vVar = c2113b.f30637b;
            buyProductUC$invoke$1.L$0 = c2113b;
            buyProductUC$invoke$1.L$1 = aVar2;
            buyProductUC$invoke$1.label = 2;
            if (vVar.F(buyProductUC$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            uVar = c2113b.f30638c;
            if (uVar.f30959a.W().f3551g) {
                uVar.f30960b.a();
            }
        }
        return aVar2;
    }
}
