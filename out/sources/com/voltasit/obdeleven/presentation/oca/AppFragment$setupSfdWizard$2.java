package com.voltasit.obdeleven.presentation.oca;

import Ia.p;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardFullScreenDialog;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: AppFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.AppFragment$setupSfdWizard$2", f = "AppFragment.kt", l = {}, m = "invokeSuspend")
final class AppFragment$setupSfdWizard$2 extends SuspendLambda implements p<r, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ AppFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppFragment$setupSfdWizard$2(AppFragment appFragment, kotlin.coroutines.c<? super AppFragment$setupSfdWizard$2> cVar) {
        super(2, cVar);
        this.this$0 = appFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppFragment$setupSfdWizard$2(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(r rVar, kotlin.coroutines.c<? super r> cVar) {
        return ((AppFragment$setupSfdWizard$2) create(rVar, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        SfdWizardFullScreenDialog sfdWizardFullScreenDialog = new SfdWizardFullScreenDialog();
        sfdWizardFullScreenDialog.F(null);
        sfdWizardFullScreenDialog.v(this.this$0.getChildFragmentManager(), "SfdWizardFullScreenDialog");
        return r.f47939a;
    }
}
