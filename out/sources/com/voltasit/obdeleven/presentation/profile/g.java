package com.voltasit.obdeleven.presentation.profile;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.signIn.SigninFragment;
import com.voltasit.obdeleven.ui.dialogs.C2174v;
import com.voltasit.obdeleven.ui.dialogs.Y;
import java.util.List;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32911c;

    public /* synthetic */ g(int i10, Object obj) {
        this.f32910b = i10;
        this.f32911c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f32911c;
        switch (this.f32910b) {
            case 0:
                androidx.appcompat.app.e dialog = (androidx.appcompat.app.e) obj;
                kotlin.jvm.internal.i.e(dialog, "$dialog");
                dialog.dismiss();
                break;
            case 1:
                List<String> list = SigninFragment.f33197n;
                SigninFragment this$0 = (SigninFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.p();
                break;
            case 2:
                C2174v c2174v = (C2174v) obj;
                c2174v.w(c2174v.f34048y.isEmpty() ? "InputDialog" : c2174v.f34048y, DialogCallback.CallbackType.f31102c, new Bundle());
                break;
            default:
                Y y10 = (Y) obj;
                if (y10.f33864u.f1906u.getSelectedItemPosition() == 0) {
                    P.b(y10.z(), R.string.dialog_live_data_chart_select_measurement);
                } else if (y10.f33864u.f1907v.getSelectedItemPosition() != 0) {
                    int selectedItemPosition = y10.f33864u.f1906u.getSelectedItemPosition() - 1;
                    int selectedItemPosition2 = y10.f33864u.f1907v.getSelectedItemPosition() - 1;
                    Bundle bundle = new Bundle();
                    bundle.putString("obd_command", (String) y10.f33867x.get(selectedItemPosition));
                    bundle.putInt("obd_command_value_index", selectedItemPosition2);
                    bundle.putString("obd_command_value", y10.f33866w.getItem(y10.f33864u.f1907v.getSelectedItemPosition()));
                    y10.w("OBDIILiveDataChartDialog", DialogCallback.CallbackType.f31102c, bundle);
                } else {
                    P.b(y10.z(), R.string.common_select_value);
                }
                break;
        }
    }
}
