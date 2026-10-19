package com.voltasit.obdeleven.presentation.oca;

import B8.S;
import Ia.p;
import android.view.View;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: AppFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.AppFragment$setupObservers$13", f = "AppFragment.kt", l = {}, m = "invokeSuspend")
final class AppFragment$setupObservers$13 extends SuspendLambda implements p<Boolean, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ AppFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFragment$setupObservers$13(AppFragment appFragment, kotlin.coroutines.c<? super AppFragment$setupObservers$13> cVar) {
        super(2, cVar);
        this.this$0 = appFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppFragment$setupObservers$13(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(Boolean bool, kotlin.coroutines.c<? super r> cVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((AppFragment$setupObservers$13) create(bool2, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        final AppFragment appFragment = this.this$0;
        S s10 = appFragment.f32680s;
        if (s10 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        s10.f1798s.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.voltasit.obdeleven.presentation.oca.e
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                appFragment.Q();
                return true;
            }
        });
        AppFragment appFragment2 = this.this$0;
        S s11 = appFragment2.f32680s;
        if (s11 == null) {
            kotlin.jvm.internal.i.m("binding");
            throw null;
        }
        s11.f1798s.setOnClickListener(new f(appFragment2, 0));
        return r.f47939a;
    }
}
