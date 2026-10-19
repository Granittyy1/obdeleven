package p009a8;

import com.obdeleven.service.core.gen1.c;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.OBDIIService;
import com.obdeleven.service.model.fault.OBDIIFault;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.AbstractC2107w;
import com.voltasit.obdeleven.utils.bluetooth.o;
import java.util.List;
import p109i8.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8071b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f8070a = i10;
        this.f8071b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws InterruptedException {
        switch (this.f8070a) {
            case 0:
                ((g) this.f8071b).h(2);
                return null;
            case 1:
                AbstractC2107w abstractC2107w = (AbstractC2107w) this.f8071b;
                abstractC2107w.getClass();
                Integer num = (Integer) task.getResult();
                int iIntValue = num.intValue();
                if (abstractC2107w.f30180d || iIntValue == 0) {
                    return 0;
                }
                return num;
            case 2:
                o oVar = (o) this.f8071b;
                oVar.getClass();
                String str = (String) task.getResult();
                oVar.f34368c = str;
                return str;
            case 3:
                ControlUnit.g gVar = (ControlUnit.g) this.f8071b;
                if (gVar == null || task.isFaulted()) {
                    return null;
                }
                gVar.b((List) task.getResult());
                return null;
            case 4:
                ControlUnit controlUnit = (ControlUnit) this.f8071b;
                controlUnit.getClass();
                return new c("00" + controlUnit.O()).a();
            case 5:
                OBDIICu oBDIICu = (OBDIICu) this.f8071b;
                oBDIICu.getClass();
                List list = (List) task.getResult();
                Task taskP0 = oBDIICu.P0(0, OBDIIService.f29397d.a());
                taskP0.waitForCompletion();
                list.addAll(OBDIIFault.k(oBDIICu, (String) taskP0.getResult(), OBDIIFault.FaultType.PENDING));
                return Task.forResult(list);
            default:
                i.b bVar = (i.b) this.f8071b;
                if (bVar == null) {
                    return null;
                }
                bVar.a();
                return null;
        }
    }
}
