package com.voltasit.obdeleven.presentation.controlUnit;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import p134k8.a2;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31888b;

    public /* synthetic */ t(int i10, Object obj) {
        this.f31887a = i10;
        this.f31888b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f31887a) {
            case 0:
                final ControlUnitFragment this$0 = (ControlUnitFragment) this.f31888b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                final Integer num = (Integer) task.getResult();
                if (num != null && num.intValue() == -1) {
                    return null;
                }
                ControlUnit controlUnit = this$0.f31429o;
                kotlin.jvm.internal.i.b(controlUnit);
                controlUnit.D(false).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.presentation.controlUnit.s
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task1) {
                        ControlUnitFragment this$1 = this$0;
                        kotlin.jvm.internal.i.e(this$1, "this$0");
                        kotlin.jvm.internal.i.e(task1, "task1");
                        Object result = task1.getResult();
                        kotlin.jvm.internal.i.d(result, "getResult(...)");
                        if (!((Boolean) result).booleanValue()) {
                            P.b(this$1.requireActivity(), R.string.common_unable_to_connect);
                            return null;
                        }
                        Integer num2 = num;
                        int iIntValue = num2.intValue() | 8388608;
                        ControlUnit controlUnit2 = this$1.f31429o;
                        kotlin.jvm.internal.i.b(controlUnit2);
                        return controlUnit2.K0(Integer.toString(iIntValue)).continueWith(new v(this$1, num2, 0), Task.UI_THREAD_EXECUTOR);
                    }
                }, Task.UI_THREAD_EXECUTOR);
                return null;
            case 1:
                com.voltasit.obdeleven.utils.bluetooth.m mVar = (com.voltasit.obdeleven.utils.bluetooth.m) this.f31888b;
                mVar.getClass();
                return new com.obdeleven.service.core.gen1.e("14", true).a().onSuccess(new V8.x(4, mVar));
            case 2:
                p097h9.r rVar = (p097h9.r) this.f31888b;
                rVar.getClass();
                C2134a0.a();
                if (!task.isCompleted()) {
                    MainActivity mainActivityQ = rVar.q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.view_manual_editor_unable_to_delete));
                    return null;
                }
                rVar.O();
                rVar.q().L();
                UserTrackingUtils.c(UserTrackingUtils.Key.f34263g, -1);
                return null;
            default:
                return ((a2) this.f31888b).f42725b;
        }
    }
}
