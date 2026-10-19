package com.voltasit.obdeleven.ui.activity;

import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33685c;

    public /* synthetic */ o(int i10, Object obj) {
        this.f33684b = i10;
        this.f33685c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f33685c;
        switch (this.f33684b) {
            case 0:
                boolean z10 = MainActivity.f33531Q;
                MainActivity this$0 = (MainActivity) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                P.d(this$0, R.string.snackbar_youve_been_signed_out, R.string.common_sign_in, new n(this$0, 0));
                break;
            case 1:
                BluetoothConnectionHelper bluetoothConnectionHelper = (BluetoothConnectionHelper) obj;
                bluetoothConnectionHelper.f34294a.getClass();
                P.b(bluetoothConnectionHelper.f34294a, R.string.common_server_problems);
                break;
            case 2:
                ((FetchedAppSettingsManager.a) obj).getClass();
                break;
            default:
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                if (appStartTrace.f28452q == null) {
                    appStartTrace.f28452q = new com.google.firebase.perf.util.h();
                    com.google.firebase.perf.v1.i.a aVarA0 = com.google.firebase.perf.v1.i.a0();
                    aVarA0.y("_experiment_onDrawFoQ");
                    aVarA0.w(appStartTrace.d().f28507b);
                    aVarA0.x(appStartTrace.d().b(appStartTrace.f28452q));
                    com.google.firebase.perf.v1.i iVarP = aVarA0.p();
                    com.google.firebase.perf.v1.i.a aVar = appStartTrace.f28441e;
                    aVar.u(iVarP);
                    if (appStartTrace.f28444h != null) {
                        com.google.firebase.perf.v1.i.a aVarA1 = com.google.firebase.perf.v1.i.a0();
                        aVarA1.y("_experiment_procStart_to_classLoad");
                        aVarA1.w(appStartTrace.d().f28507b);
                        aVarA1.x(appStartTrace.d().b(appStartTrace.a()));
                        aVar.u(aVarA1.p());
                    }
                    String str = appStartTrace.f28457v ? "true" : "false";
                    aVar.r();
                    com.google.firebase.perf.v1.i.L((com.google.firebase.perf.v1.i) aVar.f29047c).put("systemDeterminedForeground", str);
                    aVar.v(appStartTrace.f28455t, "onDrawCount");
                    com.google.firebase.perf.v1.h hVarA = appStartTrace.f28453r.a();
                    aVar.r();
                    com.google.firebase.perf.v1.i.M((com.google.firebase.perf.v1.i) aVar.f29047c, hVarA);
                    appStartTrace.f(aVar);
                    break;
                }
                break;
        }
    }
}
