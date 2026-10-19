package com.voltasit.obdeleven.ui.activity;

import android.app.Activity;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$onResume$1", f = "MainActivityViewModel.kt", l = {201, 206}, m = "invokeSuspend")
final class MainActivityViewModel$onResume$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$onResume$1(MainActivityViewModel mainActivityViewModel, kotlin.coroutines.c<? super MainActivityViewModel$onResume$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$onResume$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$onResume$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        boolean zH = this.this$0.f33644p.h();
        if (this.this$0.f33648r.z() && zH) {
            MainActivityViewModel mainActivityViewModel = this.this$0;
            PurchaseProvider purchaseProvider = mainActivityViewModel.f33646q;
            Activity activity = (Activity) mainActivityViewModel.f33650s.d();
            p040d1.a aVarA = Z.a(this.this$0);
            this.label = 1;
            if (purchaseProvider.e(activity, aVarA, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        MainActivityViewModel mainActivityViewModel2 = this.this$0;
        this.label = 2;
        if (MainActivityViewModel.b(mainActivityViewModel2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
