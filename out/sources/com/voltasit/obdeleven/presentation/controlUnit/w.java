package com.voltasit.obdeleven.presentation.controlUnit;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment;
import com.voltasit.obdeleven.ui.dialogs.C2172u;
import com.voltasit.obdeleven.ui.dialogs.c1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f32013c;

    public /* synthetic */ w(Fragment fragment, int i10) {
        this.f32012b = i10;
        this.f32013c = fragment;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        switch (this.f32012b) {
            case 0:
                ControlUnitFragment controlUnitFragment = (ControlUnitFragment) this.f32013c;
                ControlUnitInfoFragment iVar = controlUnitFragment.f31429o instanceof p109i8.i ? new com.voltasit.obdeleven.presentation.controlUnit.info.i() : new ControlUnitInfoFragment();
                p255u9.E e10 = controlUnitFragment.f31428n;
                String str = "";
                if (e10 == null || e10.i() == null) {
                    ControlUnit controlUnit = controlUnitFragment.f31429o;
                    kotlin.jvm.internal.i.b(controlUnit);
                    if (controlUnit.f29321c != null) {
                        ControlUnit controlUnit2 = controlUnitFragment.f31429o;
                        kotlin.jvm.internal.i.b(controlUnit2);
                        if (controlUnit2.f29321c.f42726c != null) {
                            ControlUnit controlUnit3 = controlUnitFragment.f31429o;
                            kotlin.jvm.internal.i.b(controlUnit3);
                            if (controlUnit3.f29321c.f42726c.i() != null) {
                                ControlUnit controlUnit4 = controlUnitFragment.f31429o;
                                kotlin.jvm.internal.i.b(controlUnit4);
                                p255u9.D dI = controlUnit4.f29321c.f42726c.i();
                                kotlin.jvm.internal.i.b(dI);
                                string = dI.getString("platform");
                            } else {
                                O.e.l("ControlUnitFragment", "Unable to get vehicle base");
                                string = "";
                            }
                        } else {
                            O.e.l("ControlUnitFragment", "Unable to get vehicle base");
                            string = "";
                        }
                    } else {
                        O.e.l("ControlUnitFragment", "Unable to get vehicle base");
                        string = "";
                    }
                } else {
                    p255u9.E e11 = controlUnitFragment.f31428n;
                    kotlin.jvm.internal.i.b(e11);
                    p255u9.D dI2 = e11.i();
                    kotlin.jvm.internal.i.b(dI2);
                    string = dI2.getString("platform");
                }
                if (string == null) {
                    O.e.j("ControlUnitFragment", "Vehicle base doesn't have platform");
                } else {
                    str = string;
                }
                ControlUnit controlUnit5 = controlUnitFragment.f31429o;
                boolean Z10 = controlUnitFragment.Z();
                iVar.f31619o = controlUnit5;
                iVar.f31616l = str;
                iVar.f31620p = Z10;
                controlUnitFragment.r().n(iVar, null);
                break;
            case 1:
                C2172u c2172u = (C2172u) this.f32013c;
                c2172u.w(c2172u.f34028y.isEmpty() ? "InputDialog" : c2172u.f34028y, DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            default:
                c1 c1Var = (c1) this.f32013c;
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.b bVar = c1Var.f33911x;
                if (bVar != null) {
                    int i10 = c1Var.f33846v.f36830d;
                    DATAOBJECTPROP dataobjectprop = bVar.f31900c;
                    Param param = bVar.f31901d;
                    int i11 = bVar.f31902e;
                    com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = bVar.f31898a;
                    hVar.getClass();
                    if (i10 >= 0) {
                        COMPUSCALE compuscale = (COMPUSCALE) bVar.f31899b.get(i10);
                        try {
                            com.obdeleven.service.odx.a aVarPhysicalToInternal = dataobjectprop.physicalToInternal(compuscale.getCOMPUCONST().getVT().getValue());
                            param.f29454b = aVarPhysicalToInternal.f29475a;
                            param.f29465n = aVarPhysicalToInternal.f29476b;
                            param.f29459g = compuscale.getCOMPUCONST().getVT().getValue();
                            param.f29460h = compuscale.getCOMPUCONST().getVT().getTI();
                            hVar.f31926r.notifyItemChanged(i11);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
                c1Var.y();
                break;
        }
    }
}
