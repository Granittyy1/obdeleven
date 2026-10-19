package com.voltasit.obdeleven.presentation.main;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.M0;

/* JADX INFO: compiled from: SlowScanWarningDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends M0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f32632s;

    public i() {
        this(0);
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String D() {
        String string = getString(R.string.scan_will_take_longer_message);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String E() {
        return this.f32632s;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String F() {
        String string = getString(R.string.common_cancel);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String G() {
        String string = getString(R.string.common_unknown_control_units);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String H() {
        String string = getString(R.string.common_continue);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    public i(int i10) {
        this.f32632s = "SlowScanWarningDialog";
    }
}
