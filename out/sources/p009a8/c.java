package p009a8;

import O.e;
import U6.f;
import android.text.TextUtils;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.obdeleven.service.util.Texttabe;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.p0;
import com.voltasit.obdeleven.core.app.r0;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitFragment;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.parse.model.HistoryDB;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import p109i8.k;
import p110i9.y;
import p134k8.A1;
import p134k8.D1;
import p134k8.a2;
import p220r9.P;
import p255u9.E;
import p279w9.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8067b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f8066a = i10;
        this.f8067b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws ParseException {
        switch (this.f8066a) {
            case 0:
                ((g) this.f8067b).h(0);
                return null;
            case 1:
                r0 r0Var = (r0) this.f8067b;
                r0Var.getClass();
                D1 d10 = (D1) task.getResult();
                return d10 != null ? d10.g().continueWith(new p0(r0Var, 0, d10)) : Task.forResult(-3);
            case 2:
                final a2 vehicle = (a2) this.f8067b;
                i.e(vehicle, "$vehicle");
                final long jCurrentTimeMillis = System.currentTimeMillis();
                return vehicle.b((short) 21).onSuccess(new Continuation() { // from class: k8.X1
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        boolean z10;
                        a2 a2Var = vehicle;
                        ControlUnit controlUnit = (ControlUnit) task2.getResult();
                        long j = jCurrentTimeMillis;
                        if (controlUnit == null) {
                            e.j("Vehicle", "CrashDataRequestTime.no_cu: " + (System.currentTimeMillis() - j) + "ms");
                            return Boolean.FALSE;
                        }
                        if (controlUnit.G().getResult().booleanValue() && controlUnit.f29327i == ApplicationProtocol.f29264d) {
                            k kVar = controlUnit.f29335r;
                            String result = kVar.b("222353").getResult();
                            String result2 = kVar.b("222354").getResult();
                            String result3 = kVar.b("222355").getResult();
                            String result4 = kVar.b("222356").getResult();
                            String result5 = kVar.b("222357").getResult();
                            int i10 = (TextUtils.isEmpty(result) || !result.startsWith("622353")) ? 0 : Integer.parseInt(result.substring(6, 8), 16);
                            int i11 = (TextUtils.isEmpty(result2) || !result2.startsWith("622354")) ? 0 : Integer.parseInt(result2.substring(6, 8), 16);
                            int i12 = (TextUtils.isEmpty(result3) || !result3.startsWith("622355")) ? 0 : Integer.parseInt(result3.substring(6, 8), 16);
                            int i13 = (TextUtils.isEmpty(result4) || !result4.startsWith("622356")) ? 0 : Integer.parseInt(result4.substring(6, 8), 16);
                            int i14 = (TextUtils.isEmpty(result5) || !result5.startsWith("622357")) ? 0 : Integer.parseInt(result5.substring(6, 8), 16);
                            E e10 = a2Var.f42726c;
                            JSONObject jSONObject = e10.getJSONObject("crashData");
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            try {
                                jSONObject.put("front", i10);
                                jSONObject.put("driver", i11);
                                jSONObject.put("passenger", i12);
                                jSONObject.put("rear", i13);
                                jSONObject.put("roll", i14);
                                e10.put("crashData", jSONObject);
                            } catch (JSONException e11) {
                                e11.printStackTrace();
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        try {
                            controlUnit.a().waitForCompletion();
                        } catch (InterruptedException e12) {
                            e.m(e12);
                        }
                        e.j("Vehicle", "CrashDataRequestTime." + z10 + ": " + (System.currentTimeMillis() - j) + "ms");
                        return Boolean.valueOf(z10);
                    }
                }, Task.BACKGROUND_EXECUTOR);
            case 3:
                ControlUnitFragment this$0 = (ControlUnitFragment) this.f8067b;
                i.e(this$0, "this$0");
                i.e(task, "task");
                Integer num = (Integer) task.getResult();
                if (num != null && num.intValue() == 0) {
                    this$0.G(R.string.snackbar_reset_success);
                    this$0.P();
                    return null;
                }
                if (num != null && num.intValue() == -1) {
                    this$0.E(R.string.common_something_went_wrong);
                    return null;
                }
                Locale locale = Locale.US;
                i.b(num);
                this$0.F(String.format(locale, "(%02X) %s", Arrays.copyOf(new Object[]{num, Texttabe.a(num.intValue())}, 2)));
                return null;
            case 4:
                EepromFragment this$1 = (EepromFragment) this.f8067b;
                i.e(this$1, "this$0");
                i.e(task, "task");
                Object result = task.getResult();
                i.d(result, "getResult(...)");
                if (!((Boolean) result).booleanValue()) {
                    return null;
                }
                this$1.r().h();
                return null;
            case 5:
                m mVar = (m) this.f8067b;
                mVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return null;
                }
                mVar.U();
                return null;
            case 6:
                ControlUnit controlUnit = (ControlUnit) this.f8067b;
                controlUnit.getClass();
                if (task.getResult() == null) {
                    return Boolean.FALSE;
                }
                HistoryDB historyDBU = controlUnit.u(controlUnit.f29330m);
                controlUnit.u0(historyDBU);
                historyDBU.save();
                return Boolean.TRUE;
            case 7:
                f fVar = (f) this.f8067b;
                List<? extends A1> vehicleInformation = (List) task.getResult();
                com.voltasit.obdeleven.presentation.controlUnit.info.i this$2 = (com.voltasit.obdeleven.presentation.controlUnit.info.i) fVar.f6547b;
                i.e(this$2, "this$0");
                i.e(vehicleInformation, "vehicleInformation");
                this$2.w();
                if (this$2.y()) {
                    return null;
                }
                if (vehicleInformation.isEmpty()) {
                    this$2.E(R.string.snackbar_no_information_available);
                    this$2.r().h();
                    return null;
                }
                b bVar = Application.f29634b;
                synchronized (bVar) {
                    bVar.f47824a.put("OBDII_CU_INFO", new b.a(vehicleInformation, 86400000L));
                }
                this$2.Q(vehicleInformation);
                return null;
            default:
                p170n9.f fVar2 = (p170n9.f) this.f8067b;
                fVar2.getClass();
                if (task.isFaulted()) {
                    int iA = ((MeasurementException) task.getError()).a();
                    if (iA == 1) {
                        MainActivity mainActivityQ = fVar2.q();
                        P.a(mainActivityQ, mainActivityQ.getString(R.string.common_connection_failed));
                    } else if (iA != 2) {
                        MainActivity mainActivityQ2 = fVar2.q();
                        P.a(mainActivityQ2, mainActivityQ2.getString(R.string.common_something_went_wrong));
                    } else {
                        MainActivity mainActivityQ3 = fVar2.q();
                        P.a(mainActivityQ3, mainActivityQ3.getString(R.string.common_not_available));
                    }
                    fVar2.q().getSupportFragmentManager().R();
                } else {
                    List list = (List) task.getResult();
                    y yVar = fVar2.f45005o;
                    yVar.f36845b.addAll(list);
                    yVar.notifyDataSetChanged();
                }
                fVar2.f45003m.setVisibility(8);
                fVar2.f45002l.setVisibility(0);
                fVar2.f45004n.a();
                return null;
        }
    }
}
