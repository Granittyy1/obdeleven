package com.braze.ui.inappmessage.factories;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.d1;
import p073f9.h;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24434c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f24433b = i10;
        this.f24434c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24433b) {
            case 0:
                DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$1((DefaultInAppMessageModalViewFactory) this.f24434c, view);
                break;
            case 1:
                d1 d1Var = (d1) this.f24434c;
                d1Var.getClass();
                d1Var.w(d1Var.f33915t.isEmpty() ? "VagRedirectDialog" : d1Var.f33915t, DialogCallback.CallbackType.f31103d, new Bundle());
                break;
            default:
                h hVar = (h) this.f24434c;
                hVar.getClass();
                hVar.w("ChartSaveDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                hVar.y();
                break;
        }
    }
}
