package com.voltasit.obdeleven.data.providers;

import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$onGetProductsBillingSetupFinished$1", f = "PurchaseProviderImpl.kt", l = {140}, m = "invokeSuspend")
final class PurchaseProviderImpl$onGetProductsBillingSetupFinished$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2691h<C8.a<? extends List<PurchaseProvider.a>>> $continuation;
    final /* synthetic */ List<String> $productIds;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseProviderImpl$onGetProductsBillingSetupFinished$1(u uVar, List<String> list, InterfaceC2691h<? super C8.a<? extends List<PurchaseProvider.a>>> interfaceC2691h, kotlin.coroutines.c<? super PurchaseProviderImpl$onGetProductsBillingSetupFinished$1> cVar) {
        super(2, cVar);
        this.this$0 = uVar;
        this.$productIds = list;
        this.$continuation = interfaceC2691h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PurchaseProviderImpl$onGetProductsBillingSetupFinished$1(this.this$0, this.$productIds, this.$continuation, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PurchaseProviderImpl$onGetProductsBillingSetupFinished$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            u uVar = this.this$0;
            List<String> list = this.$productIds;
            InterfaceC2691h<C8.a<? extends List<PurchaseProvider.a>>> interfaceC2691h = this.$continuation;
            this.label = 1;
            if (u.i(uVar, list, interfaceC2691h, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        u.g(this.this$0);
        return p293xa.r.f47939a;
    }
}
