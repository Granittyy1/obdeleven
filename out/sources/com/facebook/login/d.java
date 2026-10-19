package com.facebook.login;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.dialogs.devicePassword.PasswordEnterDialog;
import com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2147h;
import com.voltasit.obdeleven.ui.dialogs.C2166q0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f25111c;

    public /* synthetic */ d(View.OnCreateContextMenuListener onCreateContextMenuListener, int i10) {
        this.f25110b = i10;
        this.f25111c = onCreateContextMenuListener;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25110b) {
            case 0:
                k this$0 = (k) this.f25111c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.y();
                break;
            case 1:
                OnlineControlUnitListFragment this$1 = (OnlineControlUnitListFragment) this.f25111c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                ((VagProRedirectPromoPresenter) this$1.f32061t.getValue()).a(this$1, new androidx.activity.j(3, this$1));
                break;
            case 2:
                PasswordEnterDialog this$2 = (PasswordEnterDialog) this.f25111c;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                Ia.l<? super Boolean, p293xa.r> lVar = this$2.f32245g;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
                this$2.dismiss();
                break;
            case 3:
                C2147h c2147h = (C2147h) this.f25111c;
                B0 b10 = c2147h.f33966A;
                if (b10 == null || !b10.isVisible()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("key_login_finder_enabled", true);
                    bundle.putBoolean("key_is_offline", !W7.c.e());
                    B0 b11 = new B0();
                    b11.setArguments(bundle);
                    b11.setTargetFragment(c2147h, 0);
                    b11.f32261r = c2147h.getFragmentManager();
                    c2147h.f33966A = b11;
                    b11.f33753w = c2147h.f33985t;
                    b11.A();
                }
                break;
            default:
                C2166q0 c2166q0 = (C2166q0) this.f25111c;
                String string = c2166q0.f34012y.f1636t.getText().toString();
                if (!string.isEmpty()) {
                    int i10 = Integer.parseInt(string);
                    if (i10 >= c2166q0.f34007t && i10 <= c2166q0.f34008u) {
                        D9.o.m(c2166q0.f34012y.f1636t);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("key_channel", i10);
                        c2166q0.w("NumberLabelDialog", DialogCallback.CallbackType.f31102c, bundle2);
                        c2166q0.y();
                    } else {
                        c2166q0.f34012y.f1636t.c(R.string.common_wrong_value);
                    }
                } else {
                    c2166q0.f34012y.f1636t.c(R.string.common_enter_value);
                }
                break;
        }
    }
}
