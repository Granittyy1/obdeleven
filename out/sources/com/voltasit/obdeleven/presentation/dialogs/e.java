package com.voltasit.obdeleven.presentation.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import androidx.fragment.app.y;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: LegacyBaseDialogFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public class e extends DialogInterfaceOnCancelListenerC1342g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f32261r;

    public final void A() {
        if (getTargetFragment() instanceof BaseFragment) {
            BaseFragment baseFragment = (BaseFragment) getTargetFragment();
            kotlin.jvm.internal.i.b(baseFragment);
            if (baseFragment.f34089i) {
                p279w9.b bVar = Application.f29634b;
                P8.c.a(5, "BaseDialogFragment", "Target fragment's onSaveInstanceState() called. Ignoring show operation", Arrays.copyOf(new Object[0], 0));
                return;
            }
        }
        y yVar = this.f32261r;
        if (yVar == null) {
            return;
        }
        v(yVar, "BaseDialogFragment");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32261r = getParentFragmentManager();
        s(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f32261r = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public void onStart() {
        boolean zB;
        super.onStart();
        Dialog dialog = this.f17606m;
        kotlin.jvm.internal.i.b(dialog);
        if (dialog.getWindow() == null) {
            return;
        }
        MainActivity mainActivityZ = z();
        if (mainActivityZ != null) {
            zB = mainActivityZ.E();
        } else {
            List<String> list = com.voltasit.obdeleven.a.f29638c;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
            zB = com.voltasit.obdeleven.a.C0320a.a(contextRequireContext).b("is_landscape", getResources().getBoolean(R.bool.is_tablet));
        }
        if (zB) {
            Dialog dialog2 = this.f17606m;
            kotlin.jvm.internal.i.b(dialog2);
            Window window = dialog2.getWindow();
            kotlin.jvm.internal.i.b(window);
            window.setLayout(requireContext().getResources().getDimensionPixelSize(R.dimen.default_dialog_width), -2);
            return;
        }
        Dialog dialog3 = this.f17606m;
        kotlin.jvm.internal.i.b(dialog3);
        Window window2 = dialog3.getWindow();
        kotlin.jvm.internal.i.b(window2);
        window2.setLayout(-1, -2);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final void v(y manager, String str) {
        kotlin.jvm.internal.i.e(manager, "manager");
        try {
            super.v(manager, str);
        } catch (IllegalStateException e10) {
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e10);
            C1336a c1336a = new C1336a(manager);
            c1336a.d(0, this, str, 1);
            c1336a.j(true, true);
        }
    }

    public final void w(String str, DialogCallback.CallbackType callbackType, Bundle bundle) {
        if (getTargetFragment() == null || !(getTargetFragment() instanceof DialogCallback)) {
            if (getParentFragment() != null || !(getActivity() instanceof DialogCallback)) {
                if (getTargetFragment() != null) {
                    p279w9.b bVar = Application.f29634b;
                    P8.c.a(5, "BaseDialogFragment", "Target fragment does not implement callback interface", Arrays.copyOf(new Object[0], 0));
                    return;
                }
                return;
            }
            DialogCallback dialogCallback = (DialogCallback) getActivity();
            kotlin.jvm.internal.i.b(dialogCallback);
            kotlin.jvm.internal.i.b(str);
            kotlin.jvm.internal.i.b(bundle);
            dialogCallback.g(str, callbackType, bundle);
            return;
        }
        if (getTargetFragment() instanceof BaseFragment) {
            BaseFragment baseFragment = (BaseFragment) getTargetFragment();
            kotlin.jvm.internal.i.b(baseFragment);
            if (baseFragment.f34089i) {
                p279w9.b bVar2 = Application.f29634b;
                P8.c.a(5, "BaseDialogFragment", "Target fragment's onSaveInstanceState() called. Ignoring %s callback.", Arrays.copyOf(new Object[]{callbackType.toString()}, 1));
                return;
            }
        }
        DialogCallback dialogCallback2 = (DialogCallback) getTargetFragment();
        kotlin.jvm.internal.i.b(dialogCallback2);
        kotlin.jvm.internal.i.b(str);
        kotlin.jvm.internal.i.b(bundle);
        dialogCallback2.g(str, callbackType, bundle);
    }

    public void y() {
        try {
            p(false, false);
        } catch (Exception e10) {
            p279w9.b bVar = Application.f29634b;
            P8.c.b(e10);
            if (getTargetFragment() != null) {
                o();
            }
        }
    }

    public final MainActivity z() {
        if (getActivity() instanceof MainActivity) {
            return (MainActivity) getActivity();
        }
        return null;
    }
}
