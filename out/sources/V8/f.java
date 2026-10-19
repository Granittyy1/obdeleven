package V8;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.internal.measurement.Y;
import com.obdeleven.service.interfaces.IDevice;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.util.Texttabe;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.utils.HistoryUtils;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;
import java.util.Locale;
import kotlin.Pair;
import p134k8.CallableC2666z;
import p134k8.D1;
import p134k8.RunnableC2650t1;
import p255u9.F;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6783c;

    public /* synthetic */ f(Object obj, int i10, Object obj2) {
        this.f6781a = i10;
        this.f6783c = obj;
        this.f6782b = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task1) {
        int i10 = 0;
        Object obj = this.f6782b;
        Object obj2 = this.f6783c;
        switch (this.f6781a) {
            case 0:
                h hVar = (h) obj2;
                hVar.getClass();
                Integer num = (Integer) task1.getResult();
                int iIntValue = num.intValue();
                if (iIntValue != -1) {
                    String str = (String) obj;
                    if (iIntValue == 0) {
                        D1 d10 = hVar.f6791r;
                        ControlUnit controlUnit = hVar.f6792s;
                        p279w9.d.a(ControlUnitDB.getSubsystemQuery(d10.d(), controlUnit.f29320b, controlUnit.f29321c.f42726c), null, null).continueWith(new m(5, d10), Task.BACKGROUND_EXECUTOR);
                        HistoryUtils.b(hVar.f6791r, "SUB_CODING", hVar.f6787n.getText().toString(), str);
                        hVar.G(R.string.common_coding_accepted);
                        hVar.P();
                        hVar.f6789p.setText("");
                        hVar.U();
                    } else if (iIntValue != 51) {
                        hVar.F(String.format(Locale.US, "(%02X) %s", num, Texttabe.a(iIntValue)));
                    } else {
                        B0 b10 = hVar.f6793t;
                        if (b10 == null || !b10.isVisible()) {
                            Bundle bundleD = C4.v.d("key_coding", str);
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("key_login_finder_enabled", false);
                            bundle.putBundle("key_bundle", bundleD);
                            B0 b11 = new B0();
                            b11.setArguments(bundle);
                            b11.setTargetFragment(hVar, 0);
                            b11.f32261r = hVar.getFragmentManager();
                            hVar.f6793t = b11;
                            b11.f33753w = hVar.f6792s;
                            b11.A();
                        }
                    }
                } else {
                    hVar.E(R.string.common_something_went_wrong);
                }
                hVar.f6794u.setRefreshing(false);
                hVar.f6790q.setEnabled(true);
                hVar.f6791r.a();
                return null;
            case 1:
                boolean z10 = MainActivity.f33531Q;
                String vin = (String) obj;
                kotlin.jvm.internal.i.e(vin, "$vin");
                kotlin.jvm.internal.i.e(task1, "task1");
                F f10 = (F) task1.getResult();
                return f10 != null ? Y.m(vin, f10.getObjectId(), (String) obj2) : Task.forResult(null);
            case 2:
                BluetoothConnectionHelper this$0 = (BluetoothConnectionHelper) obj2;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                IDevice device = (IDevice) obj;
                kotlin.jvm.internal.i.e(device, "$device");
                kotlin.jvm.internal.i.e(task1, "task");
                if (task1.isFaulted()) {
                    if (W7.c.d()) {
                        W7.c.b();
                    }
                    O.e.m(task1.getError());
                    return p293xa.r.f47939a;
                }
                if (device instanceof com.voltasit.obdeleven.utils.bluetooth.o) {
                    kotlin.jvm.internal.i.d(new p047d8.a(300L, "17", true).a().continueWithTask(new j(4, device)), "continueWithTask(...)");
                } else {
                    kotlin.jvm.internal.i.d(Task.forResult(null), "forResult(...)");
                }
                this$0.j.e0(new J8.r("device_connected", kotlin.collections.x.o(new Pair("model", device instanceof com.voltasit.obdeleven.utils.bluetooth.m ? "FirstGen" : "NextGen"))));
                return this$0.f34294a.B().d();
            case 3:
                if (task1.isFaulted()) {
                    O.e.D("OBDIIControlUnit", "Error requesting live data");
                    O.e.m(task1.getError());
                } else if (task1.getResult() != null) {
                    ((Handler) obj2).post(new RunnableC2650t1((i8.i.a) obj, i10, task1));
                }
                return null;
            default:
                p135k9.e eVar = (p135k9.e) obj2;
                ControlUnit controlUnit2 = eVar.f42897b;
                com.obdeleven.service.odx.e.g gVar = eVar.f42903h;
                controlUnit2.getClass();
                return Task.callInBackground(new CallableC2666z(controlUnit2, (COMPUSCALE) obj, gVar));
        }
    }

    public /* synthetic */ f(String str, String str2) {
        this.f6781a = 1;
        this.f6782b = str;
        this.f6783c = str2;
    }
}
