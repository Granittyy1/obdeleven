package com.voltasit.obdeleven.presentation.oca;

import B8.S;
import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: AppFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$14", f = "AppFragment.kt", l = {}, m = "invokeSuspend")
final class AppFragment$setupObservers$14 extends SuspendLambda implements p<r, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ AppFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFragment$setupObservers$14(AppFragment appFragment, kotlin.coroutines.c<? super AppFragment$setupObservers$14> cVar) {
        super(2, cVar);
        this.this$0 = appFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppFragment$setupObservers$14(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(r rVar, kotlin.coroutines.c<? super r> cVar) {
        return ((AppFragment$setupObservers$14) create(rVar, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        AppFragment appFragment = this.this$0;
        S s10 = appFragment.f32680s;
        if (s10 != null) {
            AppFragment.O(appFragment, s10.f1803x.getCount() - 1, true);
            return r.f47939a;
        }
        kotlin.jvm.internal.i.m("binding");
        throw null;
    }
}
