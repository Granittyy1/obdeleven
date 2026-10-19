package com.voltasit.obdeleven.presentation.controlUnit;

import android.os.Bundle;
import android.view.View;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.C2133a;
import com.voltasit.obdeleven.ui.dialogs.C2150i0;
import java.util.ArrayList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31615c;

    public /* synthetic */ i(int i10, Object obj) {
        this.f31614b = i10;
        this.f31615c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f31615c;
        switch (this.f31614b) {
            case 0:
                ((ControlUnitViewModel) ((ControlUnitFragment) obj).f31425B.getValue()).d(ProCuScreen.f31483f);
                break;
            case 1:
                C2133a c2133a = (C2133a) obj;
                c2133a.y();
                c2133a.w("AddVehicleDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            case 2:
                ((com.voltasit.obdeleven.ui.dialogs.C) obj).y();
                break;
            case 3:
                C2150i0 c2150i0 = (C2150i0) obj;
                if (!c2150i0.f33975u.f2141s.getText().equals(c2150i0.getText(R.string.common_select_all))) {
                    p110i9.l lVarD = c2150i0.D();
                    lVarD.f36809d.clear();
                    lVarD.notifyItemRangeChanged(0, lVarD.f36779a.size());
                    c2150i0.f33975u.f2141s.setText(R.string.common_select_all);
                } else {
                    p110i9.l lVarD2 = c2150i0.D();
                    ArrayList<String> arrayList = lVarD2.f36809d;
                    arrayList.clear();
                    arrayList.addAll(lVarD2.f36779a);
                    lVarD2.notifyItemRangeChanged(0, lVarD2.f36779a.size());
                    c2150i0.f33975u.f2141s.setText(R.string.common_clear_all);
                }
                break;
            default:
                androidx.media3.ui.c cVar = androidx.media3.ui.c.this;
                p078g1.v vVar = cVar.f18991z0;
                if (vVar != null && vVar.L(29)) {
                    p078g1.A aU = cVar.f18991z0.U();
                    p078g1.v vVar2 = cVar.f18991z0;
                    int i10 = p114j1.A.f40996a;
                    vVar2.z(aU.a().b(1).i(1).a());
                    cVar.f18963g.f19003b[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
                    cVar.f18967l.dismiss();
                    break;
                }
                break;
        }
    }
}
