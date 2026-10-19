package V8;

import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoFragment;
import com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoViewModel;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import p220r9.P;
import p255u9.F;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6838b;

    public /* synthetic */ x(int i10, Object obj) {
        this.f6837a = i10;
        this.f6838b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, xa.g] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f6837a) {
            case 0:
                D d10 = (D) this.f6838b;
                d10.getClass();
                int iIntValue = ((Integer) task.getResult()).intValue();
                if (iIntValue == -1) {
                    return null;
                }
                d10.X(iIntValue);
                return null;
            case 1:
                X8.s sVar = (X8.s) this.f6838b;
                sVar.getClass();
                if (task.getResult() != null) {
                    sVar.E(R.string.snackbar_failed_to_save_history);
                }
                sVar.w();
                return null;
            case 2:
                com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a aVar = (com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.a) this.f6838b;
                aVar.getClass();
                C2134a0.a();
                if (!task.isFaulted() || !(task.getError() instanceof OdxFactory$Exception)) {
                    if (((Boolean) task.getResult()).booleanValue()) {
                        aVar.P();
                        return null;
                    }
                    aVar.Q();
                    aVar.r().h();
                    return null;
                }
                int iA = ((OdxFactory$Exception) task.getError()).a();
                if (iA == 0) {
                    MainActivity mainActivityQ = aVar.q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.common_check_network_try_again));
                } else if (iA != 1) {
                    MainActivity mainActivityQ2 = aVar.q();
                    P.a(mainActivityQ2, mainActivityQ2.getString(R.string.common_something_went_wrong));
                } else {
                    MainActivity mainActivityQ3 = aVar.q();
                    P.a(mainActivityQ3, mainActivityQ3.getString(R.string.common_description_data_na));
                }
                aVar.r().h();
                return null;
            case 3:
                VehicleInfoFragment this$0 = (VehicleInfoFragment) this.f6838b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                if (task.getResult() == null) {
                    return null;
                }
                p255u9.E e10 = this$0.f33470M;
                kotlin.jvm.internal.i.b(e10);
                e10.put("vehicleModification", (F) task.getResult());
                p255u9.E e11 = this$0.f33470M;
                kotlin.jvm.internal.i.b(e11);
                e11.saveEventually();
                VehicleInfoViewModel vehicleInfoViewModel = (VehicleInfoViewModel) this$0.f33476S.getValue();
                p255u9.E e12 = this$0.f33470M;
                kotlin.jvm.internal.i.b(e12);
                vehicleInfoViewModel.b(e12);
                this$0.O();
                return null;
            case 4:
                com.voltasit.obdeleven.utils.bluetooth.m mVar = (com.voltasit.obdeleven.utils.bluetooth.m) this.f6838b;
                mVar.getClass();
                String str = (String) task.getResult();
                mVar.f34370e = str;
                return str;
            case 5:
                return (String) ((Capture) this.f6838b).get();
            default:
                OBDIICu oBDIICu = (OBDIICu) this.f6838b;
                oBDIICu.getClass();
                if (task.isFaulted()) {
                    return task;
                }
                String str2 = (String) task.getResult();
                if (str2.startsWith("4120")) {
                    oBDIICu.f29385D.addAll(oBDIICu.N0(str2));
                    if (oBDIICu.f29385D.contains("40")) {
                        return oBDIICu.P0(0, "0140");
                    }
                }
                return Task.forResult("");
        }
    }
}
