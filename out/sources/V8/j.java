package V8;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.obdeleven.service.interfaces.IDevice;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.DOPBASE;
import com.obdeleven.service.odx.model.ODXLINK;
import com.obdeleven.service.odx.model.SNREF;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import com.voltasit.obdeleven.ui.dialogs.B0;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import com.voltasit.parse.model.ControlUnitLabelDB;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6800b;

    public /* synthetic */ j(int i10, Object obj) {
        this.f6799a = i10;
        this.f6800b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws OdxFactory$Exception {
        switch (this.f6799a) {
            case 0:
                o oVar = (o) this.f6800b;
                oVar.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    int i10 = 0;
                    oVar.f6816s.c().continueWithTask(new k(i10, oVar)).continueWith(new l(i10, oVar), Task.UI_THREAD_EXECUTOR);
                    return null;
                }
                C2134a0.a();
                C2137c.b(oVar.getActivity(), R.string.view_cu_not_responding_message, R.string.common_try_again, R.string.common_cancel).continueWith(new m(0, oVar), Task.UI_THREAD_EXECUTOR);
                return null;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) this.f6800b;
                qVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return null;
                }
                qVar.r().h();
                return null;
            case 2:
                UDSOutputTestFragment this$0 = (UDSOutputTestFragment) this.f6800b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                this$0.f31976x = (com.obdeleven.service.odx.e) task.getResult();
                SNREF snref = new SNREF();
                snref.setSHORTNAME("TAB_IOContrActuaTest");
                com.obdeleven.service.odx.e eVar = this$0.f31976x;
                kotlin.jvm.internal.i.b(eVar);
                com.obdeleven.service.odx.e.g gVarH = eVar.H(snref);
                this$0.f31974v = gVarH;
                if (gVarH != null) {
                    com.obdeleven.service.odx.e eVar2 = this$0.f31976x;
                    kotlin.jvm.internal.i.b(eVar2);
                    com.obdeleven.service.odx.e.g gVar = this$0.f31974v;
                    kotlin.jvm.internal.i.b(gVar);
                    ODXLINK keydopref = gVar.f29507a.getKEYDOPREF();
                    com.obdeleven.service.odx.e.g gVar2 = this$0.f31974v;
                    kotlin.jvm.internal.i.b(gVar2);
                    com.obdeleven.service.odx.e.c cVarL = eVar2.l(keydopref, gVar2.f29508b);
                    if (cVarL != null) {
                        DOPBASE dopbase = cVarL.f29499a;
                        kotlin.jvm.internal.i.c(dopbase, "null cannot be cast to non-null type com.obdeleven.service.odx.model.DATAOBJECTPROP");
                        this$0.f31972t = ((DATAOBJECTPROP) dopbase).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
                    }
                }
                return Boolean.valueOf(this$0.f31972t != null);
            case 3:
                B0.a aVar = (B0.a) this.f6800b;
                B0.this.C(aVar.f33757a).continueWith(new k(5, aVar), Task.UI_THREAD_EXECUTOR);
                return null;
            case 4:
                IDevice device = (IDevice) this.f6800b;
                kotlin.jvm.internal.i.e(device, "$device");
                kotlin.jvm.internal.i.e(task, "task");
                if (!kotlin.jvm.internal.i.a(task.getResult(), "000000")) {
                    return Task.forResult(null);
                }
                return new p047d8.k("18FFFFFF", true).a();
            case 5:
                com.voltasit.obdeleven.utils.bluetooth.o oVar2 = (com.voltasit.obdeleven.utils.bluetooth.o) this.f6800b;
                oVar2.getClass();
                O.e.s("DeviceGen2", "readSerialNumber");
                return new p047d8.f(300L, "11", true).a().onSuccess(new p(3, oVar2));
            case 6:
                OBDIICu oBDIICu = (OBDIICu) this.f6800b;
                if (oBDIICu.f29388G) {
                    oBDIICu.f29389H = true;
                    oBDIICu.f29388G = false;
                    try {
                        O.e.j("OBDIIControlUnit", "Stopping background thread");
                        oBDIICu.f29387F.join();
                        O.e.j("OBDIIControlUnit", "Background thread stopped");
                    } catch (Exception unused) {
                        O.e.D("OBDIIControlUnit", "Unable to stop background thread. Interrupting.");
                        oBDIICu.f29387F.interrupt();
                    }
                    oBDIICu.f29387F = null;
                    oBDIICu.f29389H = false;
                    break;
                }
                return (oBDIICu.f29324f == null || !oBDIICu.f29324f.d()) ? Task.forResult(Boolean.TRUE) : oBDIICu.f29324f.a().continueWith(new com.parse.a(7, oBDIICu));
            default:
                p170n9.k this$1 = (p170n9.k) this.f6800b;
                kotlin.jvm.internal.i.e(this$1, "this$0");
                int i11 = this$1.f31667A;
                if (i11 > 0) {
                    p121j8.c.a(i11, this$1.f31668B, ControlUnitLabelDB.Type.f34411d).continueWith(new k(9, this$1), Task.UI_THREAD_EXECUTOR);
                    return null;
                }
                SwipeRefreshLayout swipeRefreshLayout = this$1.f31679o;
                if (swipeRefreshLayout == null) {
                    return null;
                }
                swipeRefreshLayout.setRefreshing(false);
                return null;
        }
    }
}
