package com.voltasit.obdeleven.presentation.twofactorauth.verify;

import B8.AbstractC0665z0;
import android.view.View;
import kotlin.Pair;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TwoFactorAuthVerifySfdFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends TwoFactorAuthVerifyFragment {
    @Override // com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment
    public final void P(String backupCode) {
        i.e(backupCode, "backupCode");
        H3.c.l(this, "TwoFactorAuthVerifySfdFragment", p271w0.c.b(new Pair("backup_code", backupCode)));
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: Q */
    public final void C(AbstractC0665z0 abstractC0665z0) {
        super.C(abstractC0665z0);
        View view = abstractC0665z0.f4488d;
        i.d(view, "getRoot(...)");
        W8.d.b(view);
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "TwoFactorAuthVerifySfdFragment";
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorAuthVerifyFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return null;
    }
}
