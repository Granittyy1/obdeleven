package com.voltasit.obdeleven.presentation.screens.emailVerification;

import J8.l;
import K8.i;
import K8.v;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.EmailAlreadyTakenException;
import com.voltasit.obdeleven.domain.usecases.user.G;
import com.voltasit.obdeleven.presentation.d;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.w;

/* JADX INFO: compiled from: EmailVerificationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmailVerificationViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v f32936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f32937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G f32938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f32939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1085f0 f32940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1085f0 f32941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f32942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r f32943v;

    /* JADX WARN: Multi-variable type inference failed */
    public EmailVerificationViewModel(v vVar, l lVar, G g10, i iVar) {
        this.f32936o = vVar;
        this.f32937p = lVar;
        this.f32938q = g10;
        this.f32939r = iVar;
        C1085f0 c1085f0F = J0.f(new a("", null, true, false, TryAgainAction.f32944b));
        this.f32940s = c1085f0F;
        this.f32941t = c1085f0F;
        kotlinx.coroutines.flow.v vVarB = w.b(0, 1, BufferOverflow.f43244c, 1);
        this.f32942u = vVarB;
        this.f32943v = C2688e.a(vVarB);
        a aVar = (a) c1085f0F.getValue();
        String email = vVar.L().getEmail();
        c1085f0F.setValue(a.a(aVar, email == null ? "" : email, null, false, false, null, 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(EmailVerificationViewModel emailVerificationViewModel, C8.a.C0024a c0024a) {
        emailVerificationViewModel.getClass();
        boolean z10 = c0024a.f2462a instanceof EmailAlreadyTakenException;
        C1085f0 c1085f0 = emailVerificationViewModel.f32940s;
        if (z10) {
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, Integer.valueOf(R.string.common_email_taken), false, false, null, 25));
        } else {
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, false, false, TryAgainAction.f32945c, 15));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        C1085f0 c1085f0 = this.f32940s;
        c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, false, false, TryAgainAction.f32944b, 15));
        if (this.f32937p.a(((a) c1085f0.getValue()).f32948a)) {
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, true, false, null, 25));
        } else {
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, Integer.valueOf(R.string.common_invalid_email), false, false, null, 25));
        }
        if (((a) c1085f0.getValue()).f32950c) {
            C2680e.c(Z.a(this), this.f32112a, null, new EmailVerificationViewModel$onNextClick$1(this, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String email) {
        kotlin.jvm.internal.i.e(email, "email");
        C1085f0 c1085f0 = this.f32940s;
        c1085f0.setValue(a.a((a) c1085f0.getValue(), email, null, false, false, null, 30));
        C2680e.c(Z.a(this), this.f32112a, null, new EmailVerificationViewModel$onResendEmailClick$1(this, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(TryAgainAction tryAgainDialogAction) {
        kotlin.jvm.internal.i.e(tryAgainDialogAction, "tryAgainDialogAction");
        int iOrdinal = tryAgainDialogAction.ordinal();
        if (iOrdinal == 1) {
            d(((a) this.f32940s.getValue()).f32948a);
            return;
        }
        if (iOrdinal == 2) {
            c();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            C2680e.c(Z.a(this), this.f32112a, null, new EmailVerificationViewModel$onConfirmationNextClick$1(this, null), 2);
        }
    }
}
