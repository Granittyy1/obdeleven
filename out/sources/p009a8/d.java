package p009a8;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.obdeleven.service.core.gen1.j;
import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.OBDIIService;
import com.obdeleven.service.model.fault.OBDIIFault;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.view.LineDataChart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import p073f9.b;
import p073f9.e;
import p134k8.a2;
import p194p8.f;
import p255u9.C2800c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8069b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f8068a = i10;
        this.f8069b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws InterruptedException {
        switch (this.f8068a) {
            case 0:
                ((g) this.f8069b).h(1);
                return null;
            case 1:
                ((j) this.f8069b).h(null);
                return null;
            case 2:
                a2 vehicle = (a2) this.f8069b;
                i.e(vehicle, "$vehicle");
                vehicle.f42726c.saveInBackground();
                return Boolean.TRUE;
            case 3:
                e eVar = (e) this.f8069b;
                eVar.getClass();
                C2800c.a aVar = (C2800c.a) task.getResult();
                if (aVar == null) {
                    return null;
                }
                List<String> listA = aVar.a();
                if (listA == null) {
                    listA = Collections.emptyList();
                }
                eVar.f35005l.f34182b.addAll(listA);
                for (C2800c.b bVar : aVar.b()) {
                    LineDataChart.b bVar2 = new LineDataChart.b(bVar.b(), bVar.a());
                    List<Float> listD = bVar.d();
                    bVar2.f34191c = false;
                    LineDataSet lineDataSet = bVar2.f34189a;
                    int entryCount = lineDataSet.getEntryCount();
                    Iterator<Float> it = listD.iterator();
                    while (it.hasNext()) {
                        lineDataSet.addEntry(new Entry(entryCount, it.next().floatValue()));
                        entryCount++;
                    }
                    lineDataSet.notifyDataSetChanged();
                    LineDataChart lineDataChart = eVar.f35005l;
                    lineDataChart.f34183c.add(bVar2);
                    lineDataChart.a(bVar2);
                    b.C0365b c0365b = new b.C0365b(new f(0, eVar.f35016w), 0, bVar2);
                    c0365b.f35025e = bVar.c();
                    eVar.f35015v.a(c0365b);
                }
                eVar.f35006m.setVisibility(0);
                eVar.f35015v.notifyDataSetChanged();
                eVar.f35005l.c();
                eVar.U(3);
                C2134a0.a();
                return null;
            case 4:
                ControlUnit controlUnit = (ControlUnit) this.f8069b;
                controlUnit.getClass();
                Boolean bool = (Boolean) task.getResult();
                if (!bool.booleanValue()) {
                    controlUnit.f29326h = TransportProtocol.f29303b;
                    controlUnit.f29320b.removeProtocol();
                }
                return bool;
            case 5:
                OBDIICu oBDIICu = (OBDIICu) this.f8069b;
                oBDIICu.f29337t = false;
                Task taskP0 = oBDIICu.P0(0, OBDIIService.f29395b.a());
                taskP0.waitForCompletion();
                return Task.forResult(new ArrayList(OBDIIFault.k(oBDIICu, (String) taskP0.getResult(), OBDIIFault.FaultType.ACTIVE)));
            default:
                return ((p135k9.e) this.f8069b).f42897b.D(false);
        }
    }
}
