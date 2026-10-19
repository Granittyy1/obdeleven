package com.voltasit.obdeleven.data.providers;

import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$getProductPrice$2$2$onBillingSetupFinished$1", f = "PurchaseProviderImpl.kt", l = {235}, m = "invokeSuspend")
public final class PurchaseProviderImpl$getProductPrice$2$2$onBillingSetupFinished$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2691h<C8.a<String>> $continuation;
    final /* synthetic */ String $productId;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseProviderImpl$getProductPrice$2$2$onBillingSetupFinished$1(u uVar, String str, InterfaceC2691h<? super C8.a<String>> interfaceC2691h, kotlin.coroutines.c<? super PurchaseProviderImpl$getProductPrice$2$2$onBillingSetupFinished$1> cVar) {
        super(2, cVar);
        this.this$0 = uVar;
        this.$productId = str;
        this.$continuation = interfaceC2691h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PurchaseProviderImpl$getProductPrice$2$2$onBillingSetupFinished$1(this.this$0, this.$productId, this.$continuation, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PurchaseProviderImpl$getProductPrice$2$2$onBillingSetupFinished$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                u uVar = this.this$0;
                String str = this.$productId;
                InterfaceC2691h<C8.a<String>> interfaceC2691h = this.$continuation;
                this.label = 1;
                if (u.h(uVar, str, interfaceC2691h, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
        } catch (PurchaseProvider.PurchaseException e10) {
            E8.a.d(this.$continuation, new C8.a.C0024a(e10));
            u.g(this.this$0);
        }
        return p293xa.r.f47939a;
    }
}
