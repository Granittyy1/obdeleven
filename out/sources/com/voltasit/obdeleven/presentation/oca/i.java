package com.voltasit.obdeleven.presentation.oca;

import B8.B1;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.M0;

/* JADX INFO: compiled from: OcaAgreementDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends M0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f32695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f32696t;

    public i(String url) {
        kotlin.jvm.internal.i.e(url, "url");
        this.f32695s = url;
        this.f32696t = "OcaAgreementDialog";
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String D() {
        return "";
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String E() {
        return this.f32696t;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String F() {
        String string = getString(R.string.common_cancel);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String G() {
        String string = getString(R.string.view_main_agreement);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final String H() {
        String string = getString(R.string.dialog_developer_accept_agreement);
        kotlin.jvm.internal.i.d(string, "getString(...)");
        return string;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M0
    public final void I(B1 b10) {
        b10.t(G());
        TextView descriptionText = b10.f1625r;
        kotlin.jvm.internal.i.d(descriptionText, "descriptionText");
        W8.d.d(descriptionText, getString(R.string.common_oca_testing_disclaimer, this.f32695s));
        descriptionText.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
