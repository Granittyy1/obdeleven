package com.voltasit.obdeleven.data.providers;

import com.android.billingclient.api.Purchase;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$getProductsPricesPurchaseUpdateListener$1$1", f = "PurchaseProviderImpl.kt", l = {R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
final class PurchaseProviderImpl$getProductsPricesPurchaseUpdateListener$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ com.android.billingclient.api.a $billingResult;
    final /* synthetic */ List<String> $productIds;
    final /* synthetic */ List<Purchase> $purchases;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseProviderImpl$getProductsPricesPurchaseUpdateListener$1$1(List<String> list, u uVar, com.android.billingclient.api.a aVar, List<Purchase> list2, kotlin.coroutines.c<? super PurchaseProviderImpl$getProductsPricesPurchaseUpdateListener$1$1> cVar) {
        super(2, cVar);
        this.$productIds = list;
        this.this$0 = uVar;
        this.$billingResult = aVar;
        this.$purchases = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PurchaseProviderImpl$getProductsPricesPurchaseUpdateListener$1$1(this.$productIds, this.this$0, this.$billingResult, this.$purchases, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PurchaseProviderImpl$getProductsPricesPurchaseUpdateListener$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u uVar;
        Iterator it;
        com.android.billingclient.api.a aVar;
        List<Purchase> list;
        Object objI;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            List<String> list2 = this.$productIds;
            u uVar2 = this.this$0;
            com.android.billingclient.api.a aVar2 = this.$billingResult;
            List<Purchase> list3 = this.$purchases;
            uVar = uVar2;
            it = list2.iterator();
            aVar = aVar2;
            list = list3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$3;
            list = (List) this.L$2;
            aVar = (com.android.billingclient.api.a) this.L$1;
            uVar = (u) this.L$0;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            kotlin.jvm.internal.i.b(aVar);
            this.L$0 = uVar;
            this.L$1 = aVar;
            this.L$2 = list;
            this.L$3 = it;
            this.label = 1;
            uVar.getClass();
            uVar.f30282a.f("GooglePurchaseProviderImpl", "onPurchasesUpdated(productId=" + str + ", responseCode=" + aVar.f23552a + ")");
            Purchase purchase = null;
            Object obj2 = null;
            if (list != null) {
                for (Object obj3 : list) {
                    if (kotlin.jvm.internal.i.a(kotlin.collections.q.O(((Purchase) obj3).a()), str)) {
                        obj2 = obj3;
                        break;
                    }
                }
                purchase = (Purchase) obj2;
            }
            if (purchase == null || !((i10 = aVar.f23552a) == 0 || i10 == 7)) {
                if (aVar.f23552a == 3) {
                    uVar.o("failure");
                }
                objI = E8.a.i(new PurchaseProvider.PurchaseException.Unknown(aVar.f23552a));
            } else {
                objI = uVar.q(purchase, this);
            }
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        u.g(this.this$0);
        return p293xa.r.f47939a;
    }
}
