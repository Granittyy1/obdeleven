package com.voltasit.obdeleven.ui.dialogs.user;

import Aa.c;
import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: ForceChangePasswordDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.ui.dialogs.user.ForceChangePasswordDialog$setupObservers$3", f = "ForceChangePasswordDialog.kt", l = {}, m = "invokeSuspend")
final class ForceChangePasswordDialog$setupObservers$3 extends SuspendLambda implements p<r, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ ForceChangePasswordDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceChangePasswordDialog$setupObservers$3(ForceChangePasswordDialog forceChangePasswordDialog, kotlin.coroutines.c<? super ForceChangePasswordDialog$setupObservers$3> cVar) {
        super(2, cVar);
        this.this$0 = forceChangePasswordDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ForceChangePasswordDialog$setupObservers$3(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(r rVar, kotlin.coroutines.c<? super r> cVar) {
        return ((ForceChangePasswordDialog$setupObservers$3) create(rVar, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.this$0.y();
        return r.f47939a;
    }
}
