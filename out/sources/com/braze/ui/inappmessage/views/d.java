package com.braze.ui.inappmessage.views;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import com.voltasit.obdeleven.ui.dialogs.F0;
import com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24448c;

    public /* synthetic */ d(int i10, Object obj) {
        this.f24447b = i10;
        this.f24448c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24447b) {
            case 0:
                InAppMessageModalView.resetMessageMargins$lambda$0((InAppMessageModalView) this.f24448c, view);
                break;
            case 1:
                DialogC2146g0 dialogC2146g0 = (DialogC2146g0) this.f24448c;
                DialogC2146g0.c cVar = dialogC2146g0.f33961k;
                if (cVar != null) {
                    cVar.b();
                }
                dialogC2146g0.dismiss();
                break;
            case 2:
                F0 f10 = (F0) this.f24448c;
                f10.getClass();
                f10.w("SelectiveOutputDialog", DialogCallback.CallbackType.f31103d, new Bundle());
                f10.y();
                break;
            default:
                AutocodeProgressDialog this$0 = (AutocodeProgressDialog) this.f24448c;
                i.e(this$0, "this$0");
                Bundle bundle = new Bundle();
                bundle.putBoolean("HasSaveFailed", this$0.B().f33904m);
                this$0.w("AutocodeProgressDialog", DialogCallback.CallbackType.f31102c, bundle);
                break;
        }
    }
}
