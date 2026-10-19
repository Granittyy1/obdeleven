package com.voltasit.obdeleven.presentation.oca;

import B8.S;
import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: AppFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$17", f = "AppFragment.kt", l = {}, m = "invokeSuspend")
final class AppFragment$setupObservers$17 extends SuspendLambda implements p<Boolean, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AppFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFragment$setupObservers$17(AppFragment appFragment, kotlin.coroutines.c<? super AppFragment$setupObservers$17> cVar) {
        super(2, cVar);
        this.this$0 = appFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AppFragment$setupObservers$17 appFragment$setupObservers$17 = new AppFragment$setupObservers$17(this.this$0, cVar);
        appFragment$setupObservers$17.Z$0 = ((Boolean) obj).booleanValue();
        return appFragment$setupObservers$17;
    }

    @Override // Ia.p
    public final Object invoke(Boolean bool, kotlin.coroutines.c<? super r> cVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((AppFragment$setupObservers$17) create(bool2, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        boolean z10 = this.Z$0;
        S s10 = this.this$0.f32680s;
        if (s10 != null) {
            s10.f1798s.setEnabled(z10);
            return r.f47939a;
        }
        kotlin.jvm.internal.i.m("binding");
        throw null;
    }
}
