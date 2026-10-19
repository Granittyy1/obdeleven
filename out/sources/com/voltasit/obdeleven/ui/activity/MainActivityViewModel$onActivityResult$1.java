package com.voltasit.obdeleven.ui.activity;

import android.app.Activity;
import android.content.Intent;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$onActivityResult$1", f = "MainActivityViewModel.kt", l = {332}, m = "invokeSuspend")
final class MainActivityViewModel$onActivityResult$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Intent $data;
    final /* synthetic */ int $requestCode;
    final /* synthetic */ int $resultCode;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$onActivityResult$1(MainActivityViewModel mainActivityViewModel, Activity activity, int i10, int i11, Intent intent, kotlin.coroutines.c<? super MainActivityViewModel$onActivityResult$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
        this.$activity = activity;
        this.$requestCode = i10;
        this.$resultCode = i11;
        this.$data = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$onActivityResult$1(this.this$0, this.$activity, this.$requestCode, this.$resultCode, this.$data, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$onActivityResult$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            PurchaseProvider purchaseProvider = this.this$0.f33646q;
            this.label = 1;
            if (purchaseProvider.c() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
