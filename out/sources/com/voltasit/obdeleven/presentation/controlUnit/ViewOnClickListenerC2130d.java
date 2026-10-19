package com.voltasit.obdeleven.presentation.controlUnit;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import com.voltasit.obdeleven.ui.dialogs.F0;

/* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlUnit.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC2130d implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f31535c;

    public /* synthetic */ ViewOnClickListenerC2130d(View.OnCreateContextMenuListener onCreateContextMenuListener, int i10) {
        this.f31534b = i10;
        this.f31535c = onCreateContextMenuListener;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p255u9.F f10;
        switch (this.f31534b) {
            case 0:
                ((ControlUnitViewModel) ((ControlUnitFragment) this.f31535c).f31425B.getValue()).d(ProCuScreen.f31481d);
                break;
            case 1:
                DialogC2146g0 dialogC2146g0 = (DialogC2146g0) this.f31535c;
                DialogC2146g0.c cVar = dialogC2146g0.f33961k;
                if (cVar == null || (f10 = dialogC2146g0.j) == null) {
                    Toast.makeText(dialogC2146g0.getContext(), R.string.dialog_model_select_modification_and_body_type, 1).show();
                } else {
                    cVar.c(f10);
                    dialogC2146g0.dismiss();
                }
                break;
            default:
                F0 f11 = (F0) this.f31535c;
                f11.getClass();
                f11.w("SelectiveOutputDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                f11.y();
                break;
        }
    }
}
