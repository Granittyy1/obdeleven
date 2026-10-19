package V8;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2100o;
import com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestFragment;
import java.util.List;
import p134k8.C2644r1;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6820b;

    public /* synthetic */ p(int i10, Object obj) {
        this.f6819a = i10;
        this.f6820b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f6819a) {
            case 0:
                s sVar = (s) this.f6820b;
                sVar.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    sVar.O();
                    return null;
                }
                P.b(sVar.getActivity(), R.string.common_something_went_wrong);
                sVar.getActivity().getSupportFragmentManager().R();
                return null;
            case 1:
                UDSOutputTestFragment this$0 = (UDSOutputTestFragment) this.f6820b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                Object result = task.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                if (!((Boolean) result).booleanValue()) {
                    return Task.forResult(0);
                }
                ControlUnit controlUnit = this$0.f31971s;
                kotlin.jvm.internal.i.b(controlUnit);
                return controlUnit.H0(this$0.f31973u, "00", "");
            case 2:
                com.voltasit.obdeleven.utils.bluetooth.m mVar = (com.voltasit.obdeleven.utils.bluetooth.m) this.f6820b;
                mVar.getClass();
                if (task.isFaulted()) {
                    Exception error = task.getError();
                    if ((error instanceof CommandException) && ((CommandException) error).a() == -1) {
                        return Task.forResult(5);
                    }
                }
                int iOrdinal = mVar.f34366a.ordinal();
                if (iOrdinal != 1) {
                    return (iOrdinal == 2 || iOrdinal == 3) ? Task.forResult(1) : Task.forResult(2);
                }
                return new com.obdeleven.service.core.gen1.g("10", true).a().onSuccess(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.e(2, mVar)).continueWithTask(new com.voltasit.obdeleven.utils.bluetooth.l(0, mVar)).continueWithTask(new com.voltasit.obdeleven.presentation.controlUnit.t(1, mVar)).continueWith(new C2100o(2));
            case 3:
                com.voltasit.obdeleven.utils.bluetooth.o oVar = (com.voltasit.obdeleven.utils.bluetooth.o) this.f6820b;
                oVar.getClass();
                String str = (String) task.getResult();
                oVar.f34369d = str;
                return str;
            case 4:
                p073f9.l lVar = (p073f9.l) this.f6820b;
                lVar.w();
                List<p194p8.j> list = (List) task.getResult();
                lVar.f35062E = list;
                if (list.isEmpty()) {
                    lVar.E(R.string.snackbar_no_information_available);
                    return null;
                }
                lVar.W(lVar.f35062E);
                return null;
            case 5:
                OBDIICu oBDIICu = (OBDIICu) this.f6820b;
                oBDIICu.getClass();
                return !task.isFaulted() ? task : com.obdeleven.service.core.b.a("01E0070000").onSuccessTask(new C2644r1(oBDIICu, 1));
            default:
                return ((p219r8.b) this.f6820b).m();
        }
    }
}
