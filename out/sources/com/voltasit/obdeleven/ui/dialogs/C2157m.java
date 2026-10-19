package com.voltasit.obdeleven.ui.dialogs;

import androidx.fragment.app.C1336a;
import com.voltasit.obdeleven.ui.module.BaseFragment;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BaseBottomSheetDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2157m extends com.google.android.material.bottomsheet.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.fragment.app.y f33991r;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final void v(androidx.fragment.app.y yVar, String str) {
        try {
            super.v(yVar, "BaseBottomSheetDialog");
        } catch (IllegalStateException e10) {
            O.e.m(e10);
            yVar.getClass();
            C1336a c1336a = new C1336a(yVar);
            c1336a.d(0, this, "BaseBottomSheetDialog", 1);
            c1336a.j(true, true);
        }
    }

    public final void w() {
        if ((getTargetFragment() instanceof BaseFragment) && ((BaseFragment) getTargetFragment()).f34089i) {
            O.e.D("BaseBottomSheetDialog", "Target fragment's onSaveInstanceState() called. Ignoring show operation");
        } else {
            v(this.f33991r, "BaseBottomSheetDialog");
        }
    }
}
