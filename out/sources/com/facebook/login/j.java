package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import com.voltasit.obdeleven.ui.dialogs.C2175v0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC1342g f25127c;

    public /* synthetic */ j(DialogInterfaceOnCancelListenerC1342g dialogInterfaceOnCancelListenerC1342g, int i10) {
        this.f25126b = i10;
        this.f25127c = dialogInterfaceOnCancelListenerC1342g;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f25126b) {
            case 0:
                k this$0 = (k) this.f25127c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                View viewX = this$0.x(false);
                Dialog dialog = this$0.f17606m;
                if (dialog != null) {
                    dialog.setContentView(viewX);
                }
                LoginClient.b bVar = this$0.f25129B;
                if (bVar == null) {
                    return;
                }
                this$0.E(bVar);
                return;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.eeprom.e eVar = (com.voltasit.obdeleven.presentation.controlUnit.eeprom.e) this.f25127c;
                eVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putSerializable("eepromData", new EepromFragment.EepromData(eVar.f31573y.b(), eVar.f31571w.f41191e.f42831c.replaceAll("..", "$0 "), eVar.f31573y.c()));
                eVar.y();
                eVar.w("EepromCodingDialog", DialogCallback.CallbackType.f31102c, bundle);
                return;
            default:
                C2175v0 this$1 = (C2175v0) this.f25127c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                C2175v0.a aVar = this$1.f34050r;
                if (aVar != null) {
                    aVar.i(this$1);
                    return;
                } else {
                    kotlin.jvm.internal.i.m("listener");
                    throw null;
                }
        }
    }
}
