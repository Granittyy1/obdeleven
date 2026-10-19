package com.voltasit.obdeleven.presentation.dialogs;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.M0;

/* JADX INFO: compiled from: EnableTwoFactorDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends M0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f32164s;

    public a() {
        this(0);
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String D() {
        String string = getString(R.string.dialog_reenable_2fa_message);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String E() {
        return this.f32164s;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String G() {
        String string = getString(R.string.dialog_reenable_2fa_title);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String H() {
        String string = getString(R.string.common_enable);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    public a(int i10) {
        this.f32164s = "EnableTwoFactorDialog";
    }
}
