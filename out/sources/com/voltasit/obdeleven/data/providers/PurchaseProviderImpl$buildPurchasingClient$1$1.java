package com.voltasit.obdeleven.data.providers;

import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$buildPurchasingClient$1$1", f = "PurchaseProviderImpl.kt", l = {278}, m = "invokeSuspend")
final class PurchaseProviderImpl$buildPurchasingClient$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2691h<C8.a<Boolean>> $continuation;
    final /* synthetic */ String $productId;
    final /* synthetic */ List<Purchase> $purchases;
    final /* synthetic */ com.android.billingclient.api.a $result;
    Object L$0;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseProviderImpl$buildPurchasingClient$1$1(InterfaceC2691h<? super C8.a<Boolean>> interfaceC2691h, u uVar, String str, com.android.billingclient.api.a aVar, List<Purchase> list, kotlin.coroutines.c<? super PurchaseProviderImpl$buildPurchasingClient$1$1> cVar) {
        super(2, cVar);
        this.$continuation = interfaceC2691h;
        this.this$0 = uVar;
        this.$productId = str;
        this.$result = aVar;
        this.$purchases = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PurchaseProviderImpl$buildPurchasingClient$1$1(this.$continuation, this.this$0, this.$productId, this.$result, this.$purchases, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PurchaseProviderImpl$buildPurchasingClient$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2691h<C8.a<Boolean>> interfaceC2691h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            InterfaceC2691h<C8.a<Boolean>> interfaceC2691h2 = this.$continuation;
            u uVar = this.this$0;
            String str = this.$productId;
            int i11 = this.$result.f23552a;
            List<Purchase> list = this.$purchases;
            this.L$0 = interfaceC2691h2;
            this.label = 1;
            Object objK = u.k(uVar, str, i11, list, this);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC2691h = interfaceC2691h2;
            obj = objK;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2691h = (InterfaceC2691h) this.L$0;
            kotlin.b.b(obj);
        }
        E8.a.d(interfaceC2691h, obj);
        u.g(this.this$0);
        return p293xa.r.f47939a;
    }
}
