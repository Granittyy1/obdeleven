package com.voltasit.obdeleven.presentation.controlUnit;

import androidx.fragment.app.ActivityC1347l;
import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.UDSResult;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.util.Texttabe;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.parse.model.HistoryDB;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f32011c;

    public /* synthetic */ v(Object obj, Serializable serializable, int i10) {
        this.f32009a = i10;
        this.f32010b = obj;
        this.f32011c = serializable;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task11) {
        Serializable serializable = this.f32011c;
        Object obj = this.f32010b;
        switch (this.f32009a) {
            case 0:
                ControlUnitFragment this$0 = (ControlUnitFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task11, "task11");
                Integer num = (Integer) task11.getResult();
                if (num == null || num.intValue() != 0) {
                    if (num != null && num.intValue() == -1) {
                        P.b(this$0.requireActivity(), R.string.common_something_went_wrong);
                        return null;
                    }
                    ActivityC1347l activityC1347lRequireActivity = this$0.requireActivity();
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.i.b(num);
                    P.a(activityC1347lRequireActivity, String.format(locale, "(%02X) %s", Arrays.copyOf(new Object[]{num, Texttabe.a(num.intValue())}, 2)));
                    return null;
                }
                ControlUnit controlUnit = this$0.f31429o;
                kotlin.jvm.internal.i.b(controlUnit);
                p255u9.E e10 = controlUnit.f29321c.f42726c;
                ControlUnit controlUnit2 = this$0.f31429o;
                String strValueOf = String.valueOf((Integer) serializable);
                HistoryDB historyDB = new HistoryDB();
                int i10 = p255u9.z.f47484b;
                historyDB.o((p255u9.z) ParseUser.getCurrentUser());
                historyDB.setVehicle(e10);
                historyDB.i(controlUnit2.f29320b);
                historyDB.n("CODING_II");
                historyDB.m(e10.getInt("mileage"));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("value", strValueOf);
                    historyDB.j(jSONObject);
                    if (controlUnit2.p() != null) {
                        historyDB.k(controlUnit2.p().f29363c);
                    }
                    historyDB.a();
                    historyDB.saveEventually();
                    break;
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                P.f(this$0.requireActivity(), R.string.view_cu_coding2_accepted);
                this$0.P();
                return null;
            case 1:
                ControlUnit controlUnit3 = (ControlUnit) obj;
                controlUnit3.getClass();
                if (((Boolean) task11.getResult()).booleanValue()) {
                    return task11;
                }
                controlUnit3.f29326h = (TransportProtocol) ((ArrayList) serializable).get(2);
                return controlUnit3.H();
            case 2:
                return Integer.valueOf(((String) serializable).equals((String) ControlUnit.this.Q().f10040b) ? 0 : -1);
            default:
                final p135k9.e eVar = (p135k9.e) obj;
                eVar.getClass();
                for (final COMPUSCALE compuscale : (ArrayList) serializable) {
                    final int iIndexOf = eVar.f42900e.indexOf(compuscale);
                    if (iIndexOf != -1 && eVar.f42901f.contains(compuscale) && (eVar.f42899d || !eVar.f42902g.containsKey(compuscale))) {
                        eVar.f42904i = eVar.f42904i.continueWithTask(new V8.f(eVar, 4, compuscale)).continueWith((Continuation<TContinuationResult, TContinuationResult>) new Continuation() { // from class: k9.c
                            @Override // com.parse.boltsinternal.Continuation
                            public final Object then(Task task) {
                                e eVar2 = eVar;
                                eVar2.getClass();
                                eVar2.f42902g.put(compuscale, (UDSResult) task.getResult());
                                eVar2.notifyItemChanged(iIndexOf);
                                return null;
                            }
                        }, Task.UI_THREAD_EXECUTOR);
                    }
                }
                return eVar.f42904i;
        }
    }
}
