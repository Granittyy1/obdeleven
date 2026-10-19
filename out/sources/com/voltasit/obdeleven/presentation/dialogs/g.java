package com.voltasit.obdeleven.presentation.dialogs;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.K0;

/* JADX INFO: compiled from: Sfd2PopTheHoodDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends K0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f32263s;

    public g() {
        this(0);
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.K0
    public final String B() {
        String string = getString(R.string.common_please_open_hood);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.K0
    public final String C() {
        return this.f32263s;
    }

    public g(int i10) {
        this.f32263s = "Sfd2PopTheHoodDialog";
    }
}
