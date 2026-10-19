package V8;

import com.obdeleven.service.interfaces.IDevice;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.S;
import com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment;
import com.voltasit.obdeleven.ui.dialogs.C2137c;
import java.util.Arrays;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6824b;

    public /* synthetic */ r(int i10, Object obj) {
        this.f6823a = i10;
        this.f6824b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task15) {
        int i10 = 0;
        Object obj = this.f6824b;
        switch (this.f6823a) {
            case 0:
                s sVar = (s) obj;
                sVar.getClass();
                if (((Boolean) task15.getResult()).booleanValue()) {
                    sVar.O();
                } else {
                    P.b(sVar.getActivity(), R.string.common_something_went_wrong);
                    sVar.getActivity().getSupportFragmentManager().R();
                }
                return null;
            case 1:
                S s10 = (S) obj;
                s10.getClass();
                String str = (String) task15.getResult();
                if (str.startsWith("7F")) {
                    return -3;
                }
                s10.f(str);
                return 0;
            case 2:
                OnlineControlUnitFragment this$0 = (OnlineControlUnitFragment) obj;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task15, "task15");
                this$0.w();
                p279w9.b bVar = Application.f29634b;
                P8.c.a(3, "OnlineControlUnitFragment", "task.result7(" + task15.getResult() + ")", Arrays.copyOf(new Object[0], 0));
                if (task15.getResult() != null) {
                    Object result = task15.getResult();
                    kotlin.jvm.internal.i.b(result);
                    if (((Boolean) result).booleanValue()) {
                        this$0.f0();
                        ControlUnit controlUnit = this$0.f31429o;
                        kotlin.jvm.internal.i.b(controlUnit);
                        if (!(controlUnit instanceof OBDIICu)) {
                            ControlUnit controlUnit2 = this$0.f31429o;
                            kotlin.jvm.internal.i.b(controlUnit2);
                            controlUnit2.f29320b.saveEventuallyWithLogging();
                        }
                    } else {
                        C2137c.b(this$0.getActivity(), R.string.view_control_unit_communication_error, R.string.common_try_again, R.string.common_cancel).continueWith(new com.voltasit.obdeleven.presentation.controlUnit.E(i10, this$0), Task.UI_THREAD_EXECUTOR);
                    }
                } else {
                    C2137c.b(this$0.getActivity(), R.string.view_control_unit_communication_error, R.string.common_try_again, R.string.common_cancel).continueWith(new com.voltasit.obdeleven.presentation.controlUnit.E(i10, this$0), Task.UI_THREAD_EXECUTOR);
                }
                ControlUnit controlUnit3 = this$0.f31429o;
                kotlin.jvm.internal.i.b(controlUnit3);
                controlUnit3.a();
                return null;
            case 3:
                ((com.voltasit.obdeleven.utils.bluetooth.m) obj).f34366a = IDevice.State.f29316e;
                return null;
            case 4:
                String str2 = (String) task15.getResult();
                if (str2.contains("41" + ((String) obj))) {
                    return str2.substring(4);
                }
                return null;
            default:
                p219r8.b bVar2 = (p219r8.b) obj;
                if (bVar2.f46395d) {
                    return Task.forResult(null);
                }
                return bVar2.f46400a.f29335r.d(bVar2.i()).continueWith(new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.n(1));
        }
    }
}
