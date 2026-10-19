package com.voltasit.obdeleven.presentation.controlUnit;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.C2150i0;
import com.voltasit.obdeleven.ui.dialogs.I0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f31613c;

    public /* synthetic */ h(Fragment fragment, int i10) {
        this.f31612b = i10;
        this.f31613c = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31612b) {
            case 0:
                ControlUnitFragment controlUnitFragment = (ControlUnitFragment) this.f31613c;
                if (!W7.c.e()) {
                    p182o9.d dVar = new p182o9.d();
                    dVar.f31997n = controlUnitFragment.f31429o;
                    dVar.f32000q = "TAB_RecorDataIdentECUIdent";
                    dVar.f32001r = false;
                    controlUnitFragment.r().n(dVar, null);
                } else {
                    p182o9.e eVar = new p182o9.e();
                    eVar.f31997n = controlUnitFragment.f31429o;
                    eVar.f32000q = "TAB_RecorDataIdentECUIdent";
                    eVar.f32001r = false;
                    controlUnitFragment.r().n(eVar, null);
                }
                break;
            case 1:
                C2150i0 c2150i0 = (C2150i0) this.f31613c;
                if (!c2150i0.D().f36809d.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("items", c2150i0.D().f36809d);
                    c2150i0.w("MultiChoiceDialog", DialogCallback.CallbackType.f31102c, bundle);
                    c2150i0.y();
                } else {
                    c2150i0.y();
                    c2150i0.w("MultiChoiceDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                }
                break;
            default:
                I0 i10 = (I0) this.f31613c;
                i10.y();
                i10.w(i10.f33793s.isEmpty() ? "SimpleDialog" : i10.f33793s, DialogCallback.CallbackType.f31103d, new Bundle());
                break;
        }
    }
}
