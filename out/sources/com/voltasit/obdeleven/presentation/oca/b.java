package com.voltasit.obdeleven.presentation.oca;

import V8.q;
import Z3.o;
import android.os.Bundle;
import android.util.SparseArray;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.exception.RequestException;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.LIMIT;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.vehicle.gauges.GaugeFragment;
import com.voltasit.obdeleven.ui.dialogs.I0;
import com.voltasit.parse.model.CodingType;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import p134k8.a2;
import p220r9.C2783o;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32684b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f32683a = i10;
        this.f32684b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0134  */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws Exception {
        UDSResult uDSResultB;
        com.obdeleven.service.odx.e.g gVarG;
        String string;
        Map map;
        int i10 = 2;
        ArrayList arrayList = null;
        Object obj = this.f32684b;
        switch (this.f32683a) {
            case 0:
                AppFragment this$0 = (AppFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                Float f10 = (Float) task.getResult();
                if ((f10 != null ? Double.valueOf(f10.floatValue()) : null).doubleValue() > 11.0d) {
                    return Boolean.TRUE;
                }
                this$0.P().i(2);
                I0 i11 = this$0.f32678q;
                if (i11 != null && i11.isVisible()) {
                    return Boolean.FALSE;
                }
                Bundle bundleA = o.a("key_tag", R.string.common_attention, "low_voltage_dialog", "key_title");
                bundleA.putInt("key_message_res", R.string.view_app_battery_too_low);
                bundleA.putInt("key_positive_text", R.string.common_ok);
                I0 i12 = new I0();
                i12.setArguments(bundleA);
                i12.f32261r = this$0.getFragmentManager();
                i12.setTargetFragment(this$0, 0);
                this$0.f32678q = i12;
                i12.A();
                return Boolean.FALSE;
            case 1:
                String str = (String) task.getResult();
                StringBuilder sb2 = new StringBuilder();
                Capture capture = (Capture) obj;
                sb2.append((String) capture.get());
                sb2.append(str);
                capture.set(sb2.toString());
                return null;
            case 2:
                p060e9.d dVar = (p060e9.d) obj;
                dVar.getClass();
                com.obdeleven.service.odx.e eVar = (com.obdeleven.service.odx.e) task.getResult();
                if (eVar != null) {
                    HistoryDB historyDB = dVar.f34853n;
                    kotlin.jvm.internal.i.b(historyDB);
                    if (historyDB.c().getCodingType() != CodingType.f34406f || (gVarG = eVar.G()) == null) {
                        uDSResultB = null;
                    } else {
                        try {
                            HistoryDB historyDB2 = dVar.f34853n;
                            kotlin.jvm.internal.i.b(historyDB2);
                            try {
                                string = historyDB2.d().getJSONObject("coding").getString("value");
                            } catch (JSONException e10) {
                                e10.printStackTrace();
                                string = "";
                            }
                            try {
                                List<COMPUSCALE> listC = C2783o.c(eVar, gVarG);
                                COMPUSCALE compuscale = listC != null ? listC.get(0) : null;
                                if (compuscale != null) {
                                    LIMIT lowerlimit = compuscale.getLOWERLIMIT();
                                    if (lowerlimit == null) {
                                        lowerlimit = compuscale.getUPPERLIMIT();
                                    }
                                    uDSResultB = UDSResult.b(Integer.parseInt(lowerlimit.getValue()), string, gVarG, eVar);
                                } else {
                                    uDSResultB = null;
                                }
                            } catch (ControlUnitException e11) {
                                e = e11;
                                p279w9.b bVar = Application.f29634b;
                                P8.c.b(e);
                            } catch (OdxFactory$Exception e12) {
                                e = e12;
                                p279w9.b bVar2 = Application.f29634b;
                                P8.c.b(e);
                            }
                        } catch (Exception e13) {
                            O.e.m(e13);
                        }
                    }
                    break;
                } else {
                    uDSResultB = null;
                }
                if (uDSResultB != null) {
                    ArrayList<Param> arrayListC = uDSResultB.f29414c.c(false);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Param param : arrayListC) {
                        linkedHashMap.put(param.f29459g, param);
                    }
                    arrayList = new ArrayList(linkedHashMap.values());
                }
                dVar.f34836o = arrayList;
                return (com.obdeleven.service.odx.e) task.getResult();
            case 3:
                final GaugeFragment gaugeFragment = (GaugeFragment) obj;
                gaugeFragment.getClass();
                SparseArray sparseArray = (SparseArray) task.getResult();
                if (sparseArray == null || sparseArray.size() == 0) {
                    throw new RequestException();
                }
                Task taskForResult = Task.forResult(null);
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    final p194p8.j jVar = (p194p8.j) sparseArray.get(sparseArray.keyAt(i13));
                    taskForResult = taskForResult.continueWithTask(new Continuation() { // from class: g9.e
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            return jVar.b(gaugeFragment.f33450z).makeVoid();
                        }
                    });
                }
                return taskForResult.continueWith(new com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.e(i10, sparseArray));
            case 4:
                ((com.obdeleven.service.model.f) obj).a();
                return ((String) task.getResult()).startsWith("7B9A") ? 0 : -1;
            case 5:
                ((OBDIICu) obj).a();
                return task;
            case 6:
                a2 a2Var = (a2) obj;
                a2Var.getClass();
                if (task.isFaulted()) {
                    O.e.j("Vehicle", "Encountered exception: " + task.getError().getMessage());
                    Exception error = task.getError();
                    if (!(error instanceof CommandException) || ((CommandException) error).a() != 255) {
                        O.e.l("Vehicle", "Rethrowing unhandled exception");
                        throw error;
                    }
                    O.e.j("Vehicle", "Encountered result error in broadcast. Attempting to use gateway 19");
                    map = new HashMap();
                } else {
                    map = (Map) task.getResult();
                }
                a2Var.f42725b.putAll(map);
                a2Var.f42724a.putAll(map);
                if (!a2Var.h() || a2Var.f42725b.containsKey((short) 25)) {
                    return Task.forResult(a2Var.f42725b);
                }
                O.e.j("Vehicle", "Attempting to use gateway 19");
                return a2Var.d().continueWith(new q(4, a2Var));
            default:
                if (task.getResult() != null) {
                    ((O8.a) obj).b(((Float) task.getResult()).floatValue());
                }
                return null;
        }
    }
}
