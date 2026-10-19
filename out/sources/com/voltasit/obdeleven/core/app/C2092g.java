package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.OBDIIService;
import com.obdeleven.service.model.fault.Fault;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.parse.Parse;
import me.zhanghai.android.materialprogressbar.R;
import p134k8.a2;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2092g implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30092b;

    public /* synthetic */ C2092g(int i10, Object obj) {
        this.f30091a = i10;
        this.f30092b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30091a) {
            case 0:
                AbstractC2107w command = (AbstractC2107w) this.f30092b;
                kotlin.jvm.internal.i.e(command, "$command");
                kotlin.jvm.internal.i.e(task, "task");
                if (task.isFaulted()) {
                    return task;
                }
                Object result = task.getResult();
                kotlin.jvm.internal.i.d(result, "getResult(...)");
                if (!((Boolean) result).booleanValue() || !(command instanceof A)) {
                    return task;
                }
                O.e.j("DeviceCommand", "isCuExist()");
                return W7.c.f7067e.b(Integer.valueOf(((A) command).j, 16).shortValue()).continueWith(new C2109y());
            case 1:
                final com.voltasit.obdeleven.utils.bluetooth.m mVar = (com.voltasit.obdeleven.utils.bluetooth.m) this.f30092b;
                mVar.getClass();
                O.e.j("Device", "eraseFirmware()");
                Task taskForResult = Task.forResult(null);
                for (int i10 = R.styleable.AppCompatTheme_windowMinWidthMajor; i10 >= 0; i10--) {
                    final int i11 = ((i10 << 8) | 192) & 65535;
                    taskForResult = taskForResult.onSuccessTask(new Continuation() { // from class: com.voltasit.obdeleven.utils.bluetooth.h
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            mVar.getClass();
                            return m.o(i11);
                        }
                    });
                }
                return taskForResult;
            case 2:
                p060e9.d dVar = (p060e9.d) this.f30092b;
                dVar.getClass();
                C2134a0.a();
                if (task.isFaulted() || task.getResult() == null) {
                    MainActivity mainActivityQ = dVar.q();
                    p220r9.P.a(mainActivityQ, mainActivityQ.getString(com.voltasit.obdeleven.R.string.common_something_went_wrong));
                } else {
                    p147l9.e eVar = new p147l9.e(dVar.q(), null, (com.obdeleven.service.odx.e) task.getResult(), dVar.f34837p.a());
                    eVar.a(dVar.f34836o);
                    dVar.f34851l.setAdapter(eVar);
                }
                return null;
            case 3:
                Task task2 = (Task) this.f30092b;
                String str = (String) task2.getResult();
                if (task2.getResult() == null) {
                    return -1;
                }
                if (str.startsWith("6E04A3")) {
                    return 0;
                }
                if (str.startsWith("7F")) {
                    return androidx.compose.foundation.gestures.d.a(str, 4, 16);
                }
                return -1;
            case 4:
                OBDIICu oBDIICu = (OBDIICu) this.f30092b;
                oBDIICu.getClass();
                O.e.j("OBDIIControlUnit", "Executing clear command");
                return oBDIICu.P0(0, OBDIIService.f29396c.a());
            case 5:
                return ((a2) this.f30092b).f42731h.b("02000000070000");
            default:
                Fault fault = (Fault) this.f30092b;
                fault.getClass();
                p181o8.a aVar = (p181o8.a) task.getResult();
                fault.f29441m = aVar;
                boolean z10 = aVar != null;
                fault.f29430a = z10;
                if (z10) {
                    Parse.f34395b.e();
                }
                return fault.f29441m;
        }
    }
}
