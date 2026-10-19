package com.voltasit.obdeleven.presentation.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.R;
import kotlin.Pair;

/* JADX INFO: compiled from: SfdRateLimitDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends DialogInterfaceOnCancelListenerC1342g {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        androidx.appcompat.app.e eVarShow = new F5.b(requireContext(), R.style.DialogTheme).k(R.string.dialog_sfd_error_rate_limit_title).b(requireArguments().getInt("message")).i(R.string.common_ok, new com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.b()).d(R.string.common_learn_more, new h(this, 0)).show();
        kotlin.jvm.internal.i.d(eVarShow, "show(...)");
        return eVarShow;
    }

    public final void w(int i10) {
        setArguments(p271w0.c.b(new Pair("message", Integer.valueOf(i10))));
    }
}
