package com.voltasit.obdeleven.ui.dialogs.user;

import Aa.c;
import Ia.p;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: ForceChangePasswordDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.ui.dialogs.user.ForceChangePasswordDialog$setupObservers$1", f = "ForceChangePasswordDialog.kt", l = {}, m = "invokeSuspend")
final class ForceChangePasswordDialog$setupObservers$1 extends SuspendLambda implements p<Boolean, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ForceChangePasswordDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceChangePasswordDialog$setupObservers$1(ForceChangePasswordDialog forceChangePasswordDialog, kotlin.coroutines.c<? super ForceChangePasswordDialog$setupObservers$1> cVar) {
        super(2, cVar);
        this.this$0 = forceChangePasswordDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ForceChangePasswordDialog$setupObservers$1 forceChangePasswordDialog$setupObservers$1 = new ForceChangePasswordDialog$setupObservers$1(this.this$0, cVar);
        forceChangePasswordDialog$setupObservers$1.Z$0 = ((Boolean) obj).booleanValue();
        return forceChangePasswordDialog$setupObservers$1;
    }

    @Override // Ia.p
    public final Object invoke(Boolean bool, kotlin.coroutines.c<? super r> cVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((ForceChangePasswordDialog$setupObservers$1) create(bool2, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        if (this.Z$0) {
            ForceChangePasswordDialog forceChangePasswordDialog = this.this$0;
            forceChangePasswordDialog.s(false);
            ProgressBar progressBar = forceChangePasswordDialog.f34034v;
            if (progressBar == null) {
                i.m("loader");
                throw null;
            }
            progressBar.setVisibility(0);
            LinearLayout linearLayout = forceChangePasswordDialog.f34035w;
            if (linearLayout == null) {
                i.m("inputLayout");
                throw null;
            }
            linearLayout.setVisibility(8);
            TextView textView = forceChangePasswordDialog.f34033u;
            if (textView == null) {
                i.m("errorText");
                throw null;
            }
            textView.setVisibility(8);
        } else {
            ForceChangePasswordDialog forceChangePasswordDialog2 = this.this$0;
            forceChangePasswordDialog2.s(forceChangePasswordDialog2.B().f34039c);
            ProgressBar progressBar2 = forceChangePasswordDialog2.f34034v;
            if (progressBar2 == null) {
                i.m("loader");
                throw null;
            }
            progressBar2.setVisibility(8);
            LinearLayout linearLayout2 = forceChangePasswordDialog2.f34035w;
            if (linearLayout2 == null) {
                i.m("inputLayout");
                throw null;
            }
            linearLayout2.setVisibility(0);
        }
        return r.f47939a;
    }
}
