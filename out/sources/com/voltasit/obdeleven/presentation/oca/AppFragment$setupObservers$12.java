package com.voltasit.obdeleven.presentation.oca;

import Ia.p;
import com.google.android.gms.internal.measurement.Y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: AppFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$12", f = "AppFragment.kt", l = {}, m = "invokeSuspend")
final class AppFragment$setupObservers$12 extends SuspendLambda implements p<l, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFragment$setupObservers$12(AppFragment appFragment, kotlin.coroutines.c<? super AppFragment$setupObservers$12> cVar) {
        super(2, cVar);
        this.this$0 = appFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AppFragment$setupObservers$12 appFragment$setupObservers$12 = new AppFragment$setupObservers$12(this.this$0, cVar);
        appFragment$setupObservers$12.L$0 = obj;
        return appFragment$setupObservers$12;
    }

    @Override // Ia.p
    public final Object invoke(l lVar, kotlin.coroutines.c<? super r> cVar) {
        return ((AppFragment$setupObservers$12) create(lVar, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        l lVar = (l) this.L$0;
        Y.k(this.this$0, lVar.f32784a, lVar.f32785b);
        return r.f47939a;
    }
}
