package V8;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.exception.ControlUnitException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2088c;
import com.voltasit.obdeleven.core.app.z0;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2147h;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p134k8.C2642q1;
import p134k8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6742b;

    public /* synthetic */ B(int i10, Object obj) {
        this.f6741a = i10;
        this.f6742b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws ControlUnitException {
        JSONArray jSONArrayOptJSONArray;
        switch (this.f6741a) {
            case 0:
                D d10 = (D) this.f6742b;
                if (d10.y()) {
                    return null;
                }
                d10.f6748D.setRefreshing(false);
                if (!((Boolean) task.getResult()).booleanValue()) {
                    d10.E(R.string.common_something_went_wrong);
                    d10.r().h();
                    return null;
                }
                p122j9.g gVar = d10.f6760x;
                C2642q1 c2642q1X = d10.f6761y.x();
                gVar.getClass();
                gVar.f41190d = c2642q1X;
                gVar.f41191e = c2642q1X.clone();
                gVar.notifyDataSetChanged();
                d10.X(d10.f6745A);
                d10.U(true);
                return null;
            case 1:
                return ((p146l8.a) this.f6742b).a().continueWith(new C2088c(0, task));
            case 2:
                C2147h c2147h = (C2147h) this.f6742b;
                c2147h.getClass();
                List list = (List) task.getResult();
                if (list.isEmpty()) {
                    return null;
                }
                c2147h.f33967y.clear();
                c2147h.f33967y.addAll(list);
                return null;
            case 3:
                com.voltasit.obdeleven.utils.bluetooth.m mVar = (com.voltasit.obdeleven.utils.bluetooth.m) this.f6742b;
                int iOrdinal = mVar.f34366a.ordinal();
                if (iOrdinal == 1) {
                    return new com.obdeleven.service.core.gen1.j().a().onSuccess(new q(2, mVar));
                }
                if (iOrdinal != 2) {
                    return iOrdinal != 3 ? Task.forError(new CommandException(-1)) : Task.forResult(null);
                }
                p009a8.b bVar = new p009a8.b("214154205253543E", false);
                bVar.f8065h = "";
                return bVar.a().onSuccess(new r(3, mVar));
            case 4:
                p060e9.a aVar = (p060e9.a) this.f6742b;
                aVar.getClass();
                C2134a0.a();
                if (task.isFaulted() || task.getResult() == null) {
                    aVar.E(R.string.common_something_went_wrong);
                    return null;
                }
                p147l9.e eVar = new p147l9.e(aVar.q(), aVar.f34828o, (com.obdeleven.service.odx.e) task.getResult(), aVar.f34829p.a());
                HistoryDB historyDB = aVar.f34853n;
                historyDB.getClass();
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObjectOptJSONObject = historyDB.d().optJSONObject("adaptations");
                if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("values")) != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject2 != null) {
                            arrayList.add(new p255u9.y(jSONObjectOptJSONObject2));
                        }
                    }
                }
                eVar.e(arrayList);
                aVar.f34851l.setAdapter(eVar);
                return null;
            case 5:
                a2 a2Var = (a2) this.f6742b;
                a2Var.getClass();
                return a2Var.d().continueWith(new z0(a2Var, 2, (List) task.getResult()));
            default:
                return ((p219r8.e) this.f6742b).c();
        }
    }
}
