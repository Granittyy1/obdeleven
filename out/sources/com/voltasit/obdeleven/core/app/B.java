package com.voltasit.obdeleven.core.app;

import android.content.Intent;
import android.os.Bundle;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.obdeleven.utils.UserTrackingUtils;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30031b;

    public /* synthetic */ B(int i10, Object obj) {
        this.f30030a = i10;
        this.f30031b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30030a) {
            case 0:
                F f10 = (F) this.f30031b;
                f10.getClass();
                String str = (String) task.getResult();
                if (str.startsWith("62")) {
                    f10.f(str.substring(6));
                    return 0;
                }
                if (!str.startsWith("7F")) {
                    return -3;
                }
                int i10 = Integer.parseInt(str.substring(4), 16);
                if (i10 > 128) {
                    return Integer.valueOf(i10);
                }
                return -1;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) this.f30031b;
                qVar.getClass();
                int iIntValue = ((Integer) task.getResult()).intValue();
                if (iIntValue == -1) {
                    return null;
                }
                qVar.X(iIntValue);
                return null;
            case 2:
                VehicleHistoryFragment this$0 = (VehicleHistoryFragment) this.f30031b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                this$0.w();
                if (!task.isFaulted()) {
                    this$0.startActivity((Intent) task.getResult());
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34247H, 1);
                    return null;
                }
                O.e.m(task.getError());
                int i11 = p220r9.J.i(task.getError());
                MainActivity mainActivityQ = this$0.q();
                p220r9.P.a(mainActivityQ, mainActivityQ.getString(i11));
                return null;
            case 3:
                com.voltasit.obdeleven.utils.bluetooth.o oVar = (com.voltasit.obdeleven.utils.bluetooth.o) this.f30031b;
                oVar.getClass();
                p034c8.a aVar = (p034c8.a) task.getResult();
                oVar.f34369d = aVar.f22520b;
                oVar.f34376l = aVar.f22519a;
                return aVar;
            case 4:
                p097h9.r rVar = (p097h9.r) this.f30031b;
                rVar.getClass();
                C2134a0.a();
                if (task.getResult() != null) {
                    MainActivity mainActivityQ2 = rVar.q();
                    p220r9.P.a(mainActivityQ2, mainActivityQ2.getString(p220r9.J.h(((ParseException) task.getResult()).getCode())));
                } else {
                    rVar.O();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(p255u9.i.class.getName(), rVar.f36229o);
                    p097h9.u uVar = new p097h9.u();
                    uVar.setArguments(bundle);
                    NavigationManager navigationManager = rVar.q().f33533B;
                    kotlin.jvm.internal.i.b(navigationManager);
                    navigationManager.n(uVar, null);
                    if (!rVar.f36236v) {
                        UserTrackingUtils.c(UserTrackingUtils.Key.f34263g, 1);
                    }
                }
                return null;
            case 5:
                ControlUnit controlUnit = (ControlUnit) this.f30031b;
                controlUnit.getClass();
                String str2 = (String) task.getResult();
                if (!str2.startsWith("52")) {
                    return null;
                }
                O.e.j(controlUnit.f0(), "Result from kwp: ".concat(str2));
                return new p181o8.b(str2.substring(2));
            default:
                OBDIICu oBDIICu = (OBDIICu) this.f30031b;
                oBDIICu.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    return task;
                }
                oBDIICu.f29384C = OBDIICu.OBDIIProtocol.f29391c;
                return oBDIICu.H();
        }
    }
}
