package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: LabelDeveloperAgreementDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class W extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C2182z f33855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public A f33856t;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        MaterialDialog.a aVar = new MaterialDialog.a(requireContext());
        aVar.g(R.string.dialog_developer_developer_agreement);
        aVar.f23212B = Theme.f23261b;
        aVar.a(R.layout.dialog_warning);
        aVar.e(R.string.common_ok);
        aVar.d();
        aVar.f23253w = new S6.k(7, this);
        aVar.f23254x = new Y1.d(7, this);
        aVar.f23213C = false;
        aVar.f23214D = false;
        aVar.f23223M = new U();
        return new MaterialDialog(aVar);
    }
}
