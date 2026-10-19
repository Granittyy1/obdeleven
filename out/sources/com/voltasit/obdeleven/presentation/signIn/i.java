package com.voltasit.obdeleven.presentation.signIn;

import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import java.util.List;
import kotlinx.coroutines.C2680e;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SigninFragment f33257b;

    public /* synthetic */ i(SigninFragment signinFragment) {
        this.f33257b = signinFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SigninFragment this$0 = this.f33257b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        List<String> list = SigninFragment.f33197n;
        b bVarO = this$0.o();
        bVarO.getClass();
        C2680e.c(Z.a(bVarO), bVarO.f32112a, null, new SignInViewModel$logout$1(bVarO, null), 2);
        P.b(this$0.requireActivity(), R.string.view_signin_could_not_login);
    }
}
