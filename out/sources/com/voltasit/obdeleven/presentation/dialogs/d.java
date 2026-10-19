package com.voltasit.obdeleven.presentation.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.R;
import p293xa.r;

/* JADX INFO: compiled from: FairUsePolicyBreachDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ia.a<r> f32239r;

    public d(Ia.a<r> aVar) {
        this.f32239r = aVar;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        androidx.appcompat.app.e eVarShow = new F5.b(requireContext(), R.style.DialogTheme).k(R.string.fair_use_breach_title).b(R.string.fair_use_breach_description).i(R.string.fair_use_breach_view_options, new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.presentation.dialogs.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                d this$0 = this.f32170b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.f32239r.invoke();
            }
        }).d(R.string.common_close, new c()).show();
        kotlin.jvm.internal.i.d(eVarShow, "show(...)");
        return eVarShow;
    }
}
