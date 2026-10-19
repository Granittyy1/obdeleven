package com.voltasit.obdeleven.presentation.main;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.M0;

/* JADX INFO: compiled from: LocationPermissionInfoDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends M0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f32628s;

    public d() {
        this(0);
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String D() {
        String string = getString(R.string.view_main_enable_location_message);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String E() {
        return this.f32628s;
    }

    public d(int i10) {
        this.f32628s = "LocationPermissionInfoDialog";
    }
}
