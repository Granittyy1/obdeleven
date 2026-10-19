package com.voltasit.obdeleven.ui.activity;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$shouldShowVagRedirectDialogAfterLogin$1", f = "MainActivityViewModel.kt", l = {795}, m = "invokeSuspend")
final class MainActivityViewModel$shouldShowVagRedirectDialogAfterLogin$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$shouldShowVagRedirectDialogAfterLogin$1(MainActivityViewModel mainActivityViewModel, kotlin.coroutines.c<? super MainActivityViewModel$shouldShowVagRedirectDialogAfterLogin$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$shouldShowVagRedirectDialogAfterLogin$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$shouldShowVagRedirectDialogAfterLogin$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.vehicle.s sVar = this.this$0.f33616U;
            this.label = 1;
            obj = sVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.f33607P0.j(p293xa.r.f47939a);
        }
        return p293xa.r.f47939a;
    }
}
