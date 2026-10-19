package com.voltasit.obdeleven.presentation.controlUnit;

import G8.C0701c;
import Q8.c;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.CancellationTokenSource;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2086b;
import com.voltasit.obdeleven.presentation.dialogs.backup.MultiBackupDialog;
import com.voltasit.obdeleven.presentation.dialogs.backup.e;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginFragment;
import com.voltasit.obdeleven.presentation.vehicleInfo.h;
import com.voltasit.parse.model.CodingType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlUnit.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC2132f implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f31588c;

    public /* synthetic */ ViewOnClickListenerC2132f(Fragment fragment, int i10) {
        this.f31587b = i10;
        this.f31588c = fragment;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, xa.g] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p255u9.E e10;
        switch (this.f31587b) {
            case 0:
                ControlUnitFragment controlUnitFragment = (ControlUnitFragment) this.f31588c;
                VehicleHistoryFragment vehicleHistoryFragment = new VehicleHistoryFragment();
                Bundle bundle = new Bundle();
                if (controlUnitFragment.Z()) {
                    e10 = controlUnitFragment.f31428n;
                } else {
                    ControlUnit controlUnit = controlUnitFragment.f31429o;
                    kotlin.jvm.internal.i.b(controlUnit);
                    e10 = controlUnit.f29321c.f42726c;
                }
                bundle.putParcelable("vehicle", e10);
                ControlUnit controlUnit2 = controlUnitFragment.f31429o;
                kotlin.jvm.internal.i.b(controlUnit2);
                bundle.putParcelable("control_unit", controlUnit2.f29320b);
                vehicleHistoryFragment.setArguments(bundle);
                controlUnitFragment.r().n(vehicleHistoryFragment, null);
                break;
            case 1:
                MultiBackupDialog this$0 = (MultiBackupDialog) this.f31588c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                String string = "";
                this$0.f33984s.f2128x.setError("");
                int i10 = this$0.f33987v;
                if (i10 == 0) {
                    this$0.f32176y.p();
                    if (this$0.f33984s.f2128x.getEditText() != null) {
                        EditText editText = this$0.f33984s.f2128x.getEditText();
                        kotlin.jvm.internal.i.b(editText);
                        string = editText.getText().toString();
                    }
                    ((com.voltasit.obdeleven.presentation.dialogs.backup.h) this$0.f32175E.getValue()).f32190o.E("FULL_BACKUP");
                    this$0.E(1);
                    this$0.f33984s.f2115F.setText(R.string.common_scanning);
                    List list = this$0.f32177z;
                    p220r9.E e11 = new p220r9.E();
                    e11.f46410n = 0;
                    e11.f46411o = 0;
                    e11.f46412p = new CancellationTokenSource();
                    e11.f46409m = list;
                    this$0.f32172B = e11;
                    this$0.f33984s.f2113D.setMax(100);
                    ProgressBar progressBar = this$0.f33984s.f2114E;
                    List<? extends ControlUnit> list2 = this$0.f32177z;
                    kotlin.jvm.internal.i.b(list2);
                    progressBar.setMax(list2.size());
                    final p220r9.E e12 = this$0.f32172B;
                    kotlin.jvm.internal.i.b(e12);
                    final com.voltasit.obdeleven.presentation.dialogs.backup.e eVar = new com.voltasit.obdeleven.presentation.dialogs.backup.e(this$0, string);
                    Task.callInBackground(new Callable() { // from class: r9.D
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws InterruptedException {
                            C0701c c0701c;
                            int size;
                            D d10 = this;
                            E e13 = e12;
                            List<ControlUnit> list3 = e13.f46409m;
                            e13.f46410n = list3.size();
                            ArrayList arrayList = new ArrayList();
                            for (ControlUnit controlUnit3 : list3) {
                                e13.f34212c = 0.0d;
                                Handler handler = new Handler(Looper.getMainLooper());
                                e eVar2 = eVar;
                                handler.post(new h(e13, eVar2, controlUnit3, 2));
                                if (!e13.f34210a) {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    O.e.j("ControlUnitBackupUtil", "Preparations started");
                                    if (controlUnit3.b()) {
                                        O.e.j("ControlUnitBackupUtil", "Identifying supported functions");
                                        controlUnit3.i0().waitForCompletion();
                                        if (controlUnit3.f29329l != null) {
                                            O.e.j("ControlUnitBackupUtil", "Identifying info");
                                            Task<Boolean> taskC = controlUnit3.c();
                                            taskC.waitForCompletion();
                                            if (taskC.getResult().booleanValue()) {
                                                O.e.j("ControlUnitBackupUtil", "Reading info");
                                                Task<Boolean> taskN0 = controlUnit3.n0();
                                                taskN0.waitForCompletion();
                                                if (!taskN0.getResult().booleanValue()) {
                                                    controlUnit3.e().waitForCompletion();
                                                }
                                                if (e13.f34210a) {
                                                    controlUnit3.a();
                                                } else {
                                                    ControlUnitDB controlUnitDB = controlUnit3.f29320b;
                                                    List<String> confirmedSecurityAccessCodesSync = controlUnitDB.getConfirmedSecurityAccessCodesSync();
                                                    C0701c c0701c2 = new C0701c(new JSONObject());
                                                    try {
                                                        double d11 = e13.f34212c;
                                                        double size2 = controlUnit3.f29327i == ApplicationProtocol.f29264d ? ((double) (e13.l(controlUnit3) == null ? 0 : e13.l(controlUnit3).size())) + 0.0d : 0.0d;
                                                        controlUnit3.h0(controlUnit3.d0(false));
                                                        try {
                                                            double dP = size2 + ((double) (!controlUnitDB.getCodingType().equals(CodingType.f34403c) ? 1 : 0)) + ((double) e13.p(controlUnit3));
                                                            try {
                                                                size = controlUnit3.c0(true).size();
                                                            } catch (ControlUnitException unused) {
                                                                size = 0;
                                                            }
                                                            double dQ = d11 + e13.q(controlUnit3) + dP + ((double) size);
                                                            e13.f34212c = dQ;
                                                            e13.f34214e = 100.0d / dQ;
                                                            c0701c = c0701c2;
                                                            try {
                                                                e13.t(controlUnit3, c0701c2, eVar2, confirmedSecurityAccessCodesSync, jCurrentTimeMillis);
                                                            } catch (OdxFactory$Exception unused2) {
                                                                O.e.l("ControlUnitBackupUtil", "Error while doing backup");
                                                            }
                                                        } catch (OdxFactory$Exception unused3) {
                                                            c0701c = c0701c2;
                                                        }
                                                    } catch (OdxFactory$Exception unused4) {
                                                        c0701c = c0701c2;
                                                    }
                                                    controlUnitDB.saveInBackgroundEventually();
                                                    c cVar = new c();
                                                    cVar.f5133a = controlUnit3;
                                                    cVar.f5134b = c0701c;
                                                    arrayList.add(cVar);
                                                    controlUnit3.a().waitForCompletion();
                                                    e13.f34217h = null;
                                                    e13.f34218i = null;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    d10 = this;
                                }
                                return null;
                            }
                            return arrayList;
                        }
                    }, e12.f46412p.getToken()).continueWith(new C2086b(e12, 5, eVar), Task.UI_THREAD_EXECUTOR);
                    break;
                } else if (i10 == 1) {
                    this$0.f33984s.f2115F.setText(R.string.common_cancelling);
                    p220r9.E e13 = this$0.f32172B;
                    kotlin.jvm.internal.i.b(e13);
                    e13.u();
                    break;
                } else if (i10 == 2) {
                    MultiBackupDialog.a aVar = this$0.f32174D;
                    if (aVar != null) {
                        aVar.a();
                    }
                    this$0.y();
                    break;
                } else if (i10 == 4) {
                    this$0.y();
                    break;
                }
                break;
            default:
                TwoFactorLoginFragment this$1 = (TwoFactorLoginFragment) this.f31588c;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                this$1.o().f33271x.j(p293xa.r.f47939a);
                break;
        }
    }
}
