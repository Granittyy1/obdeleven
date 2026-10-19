package p100i;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;

/* JADX INFO: compiled from: AppCompatDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class n extends DialogInterfaceOnCancelListenerC1342g {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public Dialog r(Bundle bundle) {
        return new m(getContext(), q());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final void u(Dialog dialog, int i10) {
        if (!(dialog instanceof m)) {
            super.u(dialog, i10);
            return;
        }
        m mVar = (m) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        mVar.d().v(1);
    }
}
