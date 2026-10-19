package p022b9;

import W7.c;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.obdeleven.service.core.d;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.exception.OBDelevenException;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.view.LineDataChart;
import com.voltasit.obdeleven.utils.bluetooth.m;
import com.voltasit.obdeleven.utils.bluetooth.n;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p060e9.f;
import p073f9.b;
import p134k8.T1;
import p134k8.a2;
import p147l9.e;
import p220r9.P;
import p255u9.y;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20617b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f20616a = i10;
        this.f20617b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws JSONException, CommandException {
        switch (this.f20616a) {
            case 0:
                return ((f) this.f20617b).f20629p.a();
            case 1:
                d dVar = (d) this.f20617b;
                dVar.getClass();
                try {
                    n nVar = c.f7066d;
                    if (nVar == null) {
                        throw new OBDelevenException(0);
                    }
                    nVar.a(dVar);
                    d<T>.a aVar = dVar.f29246e;
                    synchronized (aVar) {
                        aVar.f29248c = true;
                        aVar.start();
                    }
                    return dVar.f29243b;
                } catch (OBDelevenException unused) {
                    throw new CommandException(-1);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    throw new CommandException(-1);
                }
            case 2:
                return ((m) this.f20617b).p();
            case 3:
                f fVar = (f) this.f20617b;
                fVar.getClass();
                C2134a0.a();
                if (task.isFaulted() || task.getResult() == null) {
                    MainActivity mainActivityQ = fVar.q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
                    return null;
                }
                e eVar = new e(fVar.q(), fVar.f34838o, (com.obdeleven.service.odx.e) task.getResult(), fVar.f34839p.a());
                if (fVar.f34853n.h().isEmpty()) {
                    eVar.e(fVar.f34853n.f());
                    fVar.f34851l.setAdapter(eVar);
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (y yVar : fVar.f34853n.f()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("channel", yVar.a());
                    jSONObject.put("data", yVar.b().substring(6));
                    arrayList.add(new y(jSONObject));
                }
                eVar.e(arrayList);
                fVar.f34851l.setAdapter(eVar);
                return null;
            case 4:
                b bVar = (b) this.f20617b;
                for (T t8 : bVar.f35015v.f36779a) {
                    T1 t10 = (T1) t8.f35022b.a(bVar.f35018y).get(t8.f35023c);
                    String str = t10.f42679b;
                    t8.f35024d = str;
                    t8.f35025e = t10.f42680c;
                    if (bVar.f35013t == 1) {
                        try {
                            LineDataChart.b bVar2 = t8.f35021a;
                            float f10 = Float.parseFloat(str);
                            bVar2.f34191c = true;
                            LineDataSet lineDataSet = bVar2.f34189a;
                            lineDataSet.addEntry(new Entry(lineDataSet.getEntryCount(), f10));
                            lineDataSet.notifyDataSetChanged();
                        } catch (NumberFormatException unused2) {
                        }
                    }
                }
                if (bVar.f35013t == 1) {
                    bVar.f35005l.f34182b.add(Long.toString(System.currentTimeMillis()));
                }
                if (!bVar.f35014u) {
                    return null;
                }
                bVar.T();
                return null;
            case 5:
                return ((OBDIICu) this.f20617b).f29324f.g("0100");
            default:
                return ((a2) this.f20617b).f42731h.b("010100FFFF9F");
        }
    }
}
