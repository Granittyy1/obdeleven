package p009a8;

import O.h;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.OBDIIService;
import com.obdeleven.service.model.fault.OBDIIFault;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m;
import com.voltasit.obdeleven.utils.bluetooth.o;
import java.util.List;
import kotlin.jvm.internal.i;
import p010a9.a;
import p097h9.r;
import p135k9.e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8073b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f8072a = i10;
        this.f8073b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task1) throws InterruptedException {
        switch (this.f8072a) {
            case 0:
                super/*com.obdeleven.service.core.d*/.f();
                return null;
            case 1:
                EepromFragment this$0 = (EepromFragment) this.f8073b;
                i.e(this$0, "this$0");
                i.e(task1, "task1");
                if (task1.isFaulted()) {
                    return null;
                }
                ControlUnit controlUnit = this$0.f31540m;
                i.b(controlUnit);
                int i10 = this$0.f31547t;
                String str = this$0.f31549v;
                i.b(str);
                h.c(16);
                controlUnit.o0(i10, Integer.parseInt(str, 16), this$0.f31548u).continueWith(new a(2, this$0), Task.UI_THREAD_EXECUTOR);
                return null;
            case 2:
                m mVar = (m) this.f8073b;
                mVar.getClass();
                if (((Boolean) task1.getResult()).booleanValue()) {
                    mVar.U();
                    return null;
                }
                mVar.E(R.string.common_something_went_wrong);
                mVar.q().getSupportFragmentManager().R();
                return null;
            case 3:
                o oVar = (o) this.f8073b;
                oVar.getClass();
                oVar.f34376l = (String) task1.getResult();
                return oVar.f34368c;
            case 4:
                r rVar = (r) this.f8073b;
                rVar.getClass();
                if (!((Boolean) task1.getResult()).booleanValue()) {
                    return null;
                }
                rVar.q().L();
                return null;
            case 5:
                OBDIICu oBDIICu = (OBDIICu) this.f8073b;
                oBDIICu.getClass();
                List list = (List) task1.getResult();
                Task taskP0 = oBDIICu.P0(0, OBDIIService.f29399f.a());
                taskP0.waitForCompletion();
                list.addAll(OBDIIFault.k(oBDIICu, (String) taskP0.getResult(), OBDIIFault.FaultType.PERMANENT));
                return Task.forResult(list);
            default:
                e eVar = (e) this.f8073b;
                if (!eVar.f42899d || !eVar.j) {
                    return null;
                }
                eVar.b();
                return null;
        }
    }
}
