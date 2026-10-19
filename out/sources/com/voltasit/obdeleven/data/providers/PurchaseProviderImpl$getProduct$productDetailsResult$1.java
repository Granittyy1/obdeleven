package com.voltasit.obdeleven.data.providers;

import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$getProduct$productDetailsResult$1", f = "PurchaseProviderImpl.kt", l = {251}, m = "invokeSuspend")
final class PurchaseProviderImpl$getProduct$productDetailsResult$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super u.a>, Object> {
    final /* synthetic */ String $productId;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseProviderImpl$getProduct$productDetailsResult$1(u uVar, String str, kotlin.coroutines.c<? super PurchaseProviderImpl$getProduct$productDetailsResult$1> cVar) {
        super(2, cVar);
        this.this$0 = uVar;
        this.$productId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PurchaseProviderImpl$getProduct$productDetailsResult$1(this.this$0, this.$productId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super u.a> cVar) {
        return ((PurchaseProviderImpl$getProduct$productDetailsResult$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            u uVar = this.this$0;
            List listK = M1.k(this.$productId);
            this.label = 1;
            obj = uVar.p(listK, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
