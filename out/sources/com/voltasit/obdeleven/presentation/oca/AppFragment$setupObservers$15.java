package com.voltasit.obdeleven.presentation.oca;

import Ia.p;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: AppFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$15", f = "AppFragment.kt", l = {}, m = "invokeSuspend")
final class AppFragment$setupObservers$15 extends SuspendLambda implements p<Pair<? extends Integer, ? extends Boolean>, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFragment$setupObservers$15(AppFragment appFragment, kotlin.coroutines.c<? super AppFragment$setupObservers$15> cVar) {
        super(2, cVar);
        this.this$0 = appFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AppFragment$setupObservers$15 appFragment$setupObservers$15 = new AppFragment$setupObservers$15(this.this$0, cVar);
        appFragment$setupObservers$15.L$0 = obj;
        return appFragment$setupObservers$15;
    }

    @Override // Ia.p
    public final Object invoke(Pair<? extends Integer, ? extends Boolean> pair, kotlin.coroutines.c<? super r> cVar) {
        return ((AppFragment$setupObservers$15) create(pair, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        Pair pair = (Pair) this.L$0;
        AppFragment.O(this.this$0, ((Number) pair.c()).intValue(), ((Boolean) pair.d()).booleanValue());
        return r.f47939a;
    }
}
