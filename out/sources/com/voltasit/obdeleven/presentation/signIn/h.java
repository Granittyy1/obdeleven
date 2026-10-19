package com.voltasit.obdeleven.presentation.signIn;

import Z3.C0835a;
import androidx.lifecycle.Z;
import com.facebook.FacebookException;
import com.facebook.login.y;
import java.util.Date;
import java.util.List;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: SigninFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Z3.k<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SigninFragment f33256a;

    public h(SigninFragment signinFragment) {
        this.f33256a = signinFragment;
    }

    @Override // Z3.k
    public final void a(FacebookException facebookException) {
        O.e.s("SigninFragment", "onError(error=" + facebookException.getMessage() + ")");
    }

    @Override // Z3.k
    public final void b(y yVar) {
        C0835a c0835a = yVar.f25189a;
        StringBuilder sb2 = new StringBuilder("onSuccess(result=");
        Date expirationDate = c0835a.f7785b;
        sb2.append(expirationDate);
        sb2.append(")");
        O.e.s("SigninFragment", sb2.toString());
        List<String> list = SigninFragment.f33197n;
        b bVarO = this.f33256a.o();
        bVarO.getClass();
        String userId = c0835a.j;
        kotlin.jvm.internal.i.e(userId, "userId");
        String token = c0835a.f7789f;
        kotlin.jvm.internal.i.e(token, "token");
        kotlin.jvm.internal.i.e(expirationDate, "expirationDate");
        C2680e.c(Z.a(bVarO), bVarO.f32112a, null, new SignInViewModel$onFacebookAuthSuccess$1(bVarO, userId, token, expirationDate, null), 2);
    }

    @Override // Z3.k
    public final void onCancel() {
        O.e.s("SigninFragment", "onCancel()");
    }
}
