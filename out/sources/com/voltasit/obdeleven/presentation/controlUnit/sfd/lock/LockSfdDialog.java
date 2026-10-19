package com.voltasit.obdeleven.presentation.controlUnit.sfd.lock;

import Ia.p;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.e;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.R;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: LockSfdDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LockSfdDialog extends DialogInterfaceOnCancelListenerC1342g {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Context contextRequireContext = requireContext();
        i.d(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6);
        composeView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        composeView.setContent(new ComposableLambdaImpl(true, 1540233383, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.lock.LockSfdDialog$onCreateDialog$1
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    c.a(this.this$0.requireArguments().getInt("param_time_left"), interfaceC1084f2, 0);
                }
                return r.f47939a;
            }
        }));
        e eVarShow = new F5.b(requireContext(), R.style.DialogTheme).m(composeView).k(R.string.common_sfd_protection).i(R.string.common_lock, new a(this, 0)).d(R.string.common_cancel, new b()).show();
        i.d(eVarShow, "show(...)");
        return eVarShow;
    }
}
