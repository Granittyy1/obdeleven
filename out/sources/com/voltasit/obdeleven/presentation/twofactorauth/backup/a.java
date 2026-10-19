package com.voltasit.obdeleven.presentation.twofactorauth.backup;

import B8.AbstractC0653t0;
import H3.c;
import W8.d;
import android.view.View;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TwoFactorAuthBackupSfdFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends TwoFactorAuthBackupFragment {
    @Override // com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment
    public final void O() {
        c.l(this, "TwoFactorBackupSfdFragment", p271w0.c.a());
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    /* JADX INFO: renamed from: P */
    public final void C(AbstractC0653t0 abstractC0653t0) {
        super.C(abstractC0653t0);
        View view = abstractC0653t0.f4488d;
        i.d(view, "getRoot(...)");
        d.b(view);
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "TwoFactorBackupSfdFragment";
    }

    @Override // com.voltasit.obdeleven.presentation.twofactorauth.backup.TwoFactorAuthBackupFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String u() {
        return null;
    }
}
