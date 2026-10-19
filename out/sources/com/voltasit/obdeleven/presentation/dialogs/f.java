package com.voltasit.obdeleven.presentation.dialogs;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.M0;

/* JADX INFO: compiled from: PopTheHoodDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends M0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f32262s;

    public f() {
        this(0);
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String D() {
        String string = getString(R.string.common_please_open_hood);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String E() {
        return this.f32262s;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String F() {
        String string = getString(R.string.common_cancel);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String H() {
        String string = getString(R.string.common_try_again);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    public /* synthetic */ f(int i10) {
        this("PopTheHoodDialog");
    }

    public f(String dialogTag) {
        kotlin.jvm.internal.i.e(dialogTag, "dialogTag");
        this.f32262s = dialogTag;
    }
}
