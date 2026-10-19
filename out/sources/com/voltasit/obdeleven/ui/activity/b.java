package com.voltasit.obdeleven.ui.activity;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.M0;

/* JADX INFO: compiled from: ForceUpdateDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends M0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f33669s;

    public b() {
        this(0);
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final void B() {
        super.B();
        requireActivity().finish();
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final void C() {
        super.C();
        p186p0.d dVarRequireActivity = requireActivity();
        kotlin.jvm.internal.i.c(dVarRequireActivity, "null cannot be cast to non-null type com.voltasit.obdeleven.presentation.ActivityHandler");
        ((com.voltasit.obdeleven.presentation.a) dVarRequireActivity).f();
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String D() {
        String string = getString(R.string.dialog_force_update_description);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String E() {
        return this.f33669s;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String G() {
        String string = getString(R.string.dialog_force_update_title);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String H() {
        String string = getString(R.string.common_update);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    public b(int i10) {
        this.f33669s = "ForceUpdateDialog";
    }
}
