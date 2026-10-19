package com.voltasit.obdeleven.presentation.twofactorauth.setup;

import B8.AbstractC0661x0;
import H3.c;
import W8.d;
import android.view.View;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TwoFactorAuthSetupSfdFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class a extends TwoFactorAuthSetupFragment {
    @Override // com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment
    public final void O() {
        c.l(this, "TwoFactorAuthSetupSfdFragment", p271w0.c.a());
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: P */
    public final void C(AbstractC0661x0 abstractC0661x0) {
        super.C(abstractC0661x0);
        View view = abstractC0661x0.f4488d;
        i.d(view, "getRoot(...)");
        d.b(view);
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "TwoFactorAuthSetupSfdFragment";
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return null;
    }
}
