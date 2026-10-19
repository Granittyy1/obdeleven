package com.voltasit.obdeleven.presentation.profile;

import D9.o;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.DiagnosticSession;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.F0;
import com.voltasit.obdeleven.ui.dialogs.autocodeprogress.AutocodeProgressDialog;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.parse.model.HistoryDB;
import kotlin.jvm.internal.n;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f32922c;

    public /* synthetic */ k(Fragment fragment, int i10) {
        this.f32921b = i10;
        this.f32922c = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        E e10;
        switch (this.f32921b) {
            case 0:
                ProfileFragment this$0 = (ProfileFragment) this.f32922c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                ProfileViewModel profileViewModelU = this$0.U();
                if (!kotlin.jvm.internal.i.a(profileViewModelU.f32835H.d(), Boolean.TRUE)) {
                    profileViewModelU.f32849V.j(r.f47939a);
                } else {
                    profileViewModelU.f32851X.j(r.f47939a);
                }
                break;
            case 1:
                F0 f10 = (F0) this.f32922c;
                String string = f10.f33786x.f1636t.getText().toString();
                if (!string.isEmpty()) {
                    int i10 = Integer.parseInt(string);
                    if (i10 >= f10.f33782t && i10 <= f10.f33783u) {
                        o.m(f10.f33786x.f1636t);
                        Bundle bundle = new Bundle();
                        bundle.putString("key_channel", n.g(string));
                        f10.w("SelectiveOutputDialog", DialogCallback.CallbackType.f31102c, bundle);
                        f10.y();
                    } else {
                        f10.f33786x.f1636t.c(R.string.common_wrong_value);
                    }
                } else {
                    f10.f33786x.f1636t.c(R.string.common_enter_value);
                }
                break;
            case 2:
                AutocodeProgressDialog this$1 = (AutocodeProgressDialog) this.f32922c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.w("AutocodeProgressDialog", DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            default:
                p170n9.m this$2 = (p170n9.m) this.f32922c;
                kotlin.jvm.internal.i.e(this$2, "this$0");
                NavigationManager navigationManagerR = this$2.r();
                BaseFragment<?> iVar = new p170n9.i();
                ControlUnit controlUnit = this$2.f31429o;
                kotlin.jvm.internal.i.b(controlUnit);
                E e11 = this$2.f31428n;
                HistoryDB historyDB = new HistoryDB();
                historyDB.put("type", HistoryDB.HistoryTypeValue.FAULT.a());
                if (e11 == null) {
                    e10 = null;
                } else {
                    e10 = new E();
                    e10.put("make", e11.d());
                    e10.put("model", e11.e());
                    e10.put("vehicleBase", e11.i());
                    e10.put("vin", e11.k());
                    if (e11.getString("year") != null) {
                        e10.put("year", e11.getString("year"));
                    }
                    e10.put("mileage", Integer.valueOf(e11.getInt("mileage")));
                }
                historyDB.setVehicle(e10);
                ControlUnitDB controlUnitDB = controlUnit.f29320b;
                kotlin.jvm.internal.i.d(controlUnitDB, "getParseObject(...)");
                ControlUnitDB controlUnitDB2 = new ControlUnitDB();
                if (controlUnitDB.getSystemDescription() != null) {
                    controlUnitDB2.setSystemDescription(controlUnitDB.getSystemDescription());
                }
                if (controlUnitDB.getSWNumber() != null) {
                    controlUnitDB2.setSWNumber(controlUnitDB.getSWNumber());
                }
                if (controlUnitDB.getSWVersion() != null) {
                    controlUnitDB2.setSWVersion(controlUnitDB.getSWVersion());
                }
                if (controlUnitDB.getHWNumber() != null) {
                    controlUnitDB2.setHWNumber(controlUnitDB.getHWNumber());
                }
                if (controlUnitDB.getHWVersion() != null) {
                    controlUnitDB2.setHWVersion(controlUnitDB.getHWVersion());
                }
                if (controlUnitDB.getSerialNumber() != null) {
                    controlUnitDB2.setSerialNumber(controlUnitDB.getSerialNumber());
                }
                if (controlUnitDB.getODXName() != null) {
                    controlUnitDB2.setODXName(controlUnitDB.getODXName());
                }
                if (controlUnitDB.getODXVersion() != null) {
                    controlUnitDB2.setODXVersion(controlUnitDB.getODXVersion());
                }
                if (controlUnitDB.getControlUnitBase() != null) {
                    controlUnitDB2.setControlUnitBase(controlUnitDB.getControlUnitBase());
                }
                if (controlUnitDB.getProtocol() != null) {
                    controlUnitDB2.setProtocol(controlUnitDB.getProtocol());
                }
                controlUnitDB2.setFaults(controlUnitDB.getFaults());
                historyDB.i(controlUnitDB2);
                if (controlUnit.p() != null) {
                    DiagnosticSession diagnosticSessionP = controlUnit.p();
                    kotlin.jvm.internal.i.b(diagnosticSessionP);
                    historyDB.k(diagnosticSessionP.f29363c);
                }
                historyDB.l(controlUnitDB2.getFaults(), controlUnitDB2.getODXName());
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("historyItem", historyDB);
                iVar.setArguments(bundle2);
                navigationManagerR.n(iVar, null);
                break;
        }
    }
}
