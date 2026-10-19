package com.parse;

import P8.c;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.exception.VehicleException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.p;
import com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitFragment;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.f;
import com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h;
import com.voltasit.obdeleven.ui.dialogs.B;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import com.voltasit.obdeleven.utils.bluetooth.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.i;
import p134k8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29561b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f29560a = i10;
        this.f29561b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task11) throws VehicleException, CommandException {
        int length = 1;
        int i10 = 0;
        switch (this.f29560a) {
            case 0:
                return ControlUnitDB.lambda$getConfirmedSecurityAccessCodesAsync$1((ArrayList) this.f29561b, task11);
            case 1:
                OnlineControlUnitFragment this$0 = (OnlineControlUnitFragment) this.f29561b;
                i.e(this$0, "this$0");
                i.e(task11, "task11");
                p279w9.b bVar = Application.f29634b;
                c.a(3, "OnlineControlUnitFragment", "task.result3(" + task11.getResult() + ")", Arrays.copyOf(new Object[0], 0));
                if (((Boolean) task11.getResult()).booleanValue()) {
                    return Task.forResult(Boolean.TRUE);
                }
                ControlUnit controlUnit = this$0.f31429o;
                i.b(controlUnit);
                return controlUnit.e();
            case 2:
                ((f) this.f29561b).f31784v.i();
                return null;
            case 3:
                h hVar = (h) this.f29561b;
                hVar.getClass();
                if (task11.getResult() != null) {
                    hVar.W(R.string.snackbar_failed_to_save_history);
                }
                hVar.w();
                return null;
            case 4:
                B b10 = (B) this.f29561b;
                b10.getClass();
                if (!task11.isFaulted()) {
                    com.voltasit.parse.Parse.f34395b.e();
                }
                C2134a0.a();
                b10.f33735d.dismiss();
                b10.f33744n.setResult(Boolean.TRUE);
                return null;
            case 5:
                ((m) this.f29561b).getClass();
                return (task11.isFaulted() || !((Boolean) task11.getResult()).booleanValue()) ? m.o(31936).continueWith(new p(length)) : Task.forResult(null);
            case 6:
                ((p047d8.i) this.f29561b).h(null);
                return null;
            case 7:
                OBDIICu oBDIICu = (OBDIICu) this.f29561b;
                oBDIICu.getClass();
                boolean zIsFaulted = task11.isFaulted();
                boolean z10 = true ^ zIsFaulted;
                if (!zIsFaulted) {
                    oBDIICu.f29324f = null;
                    oBDIICu.f29386E = System.currentTimeMillis();
                }
                return Boolean.valueOf(z10);
            case 8:
                a2 a2Var = (a2) this.f29561b;
                a2Var.getClass();
                if (task11.isFaulted() && (task11.getError() instanceof ParseException)) {
                    throw new VehicleException(3);
                }
                a2Var.f42724a.putAll((Map) task11.getResult());
                ArrayList arrayList = new ArrayList(a2Var.f42724a.values());
                Collections.sort(arrayList, new com.obdeleven.service.util.a(i10));
                return arrayList;
            default:
                p219r8.b bVar2 = (p219r8.b) this.f29561b;
                bVar2.getClass();
                String str = (String) task11.getResult();
                if (!str.contains("71")) {
                    if (str.startsWith("7F31")) {
                        throw new CommandException(Integer.parseInt(str.substring(4, 6), 16));
                    }
                    throw new CommandException(-1);
                }
                byte[] bArrE = com.obdeleven.service.util.b.e(str.substring(10));
                if (bArrE.length == 0) {
                    length = 0;
                } else {
                    byte b11 = bArrE[0];
                    if (b11 != 95 && b11 != 110 && b11 != 111 && b11 != 118) {
                        length = bArrE.length / 3;
                    }
                }
                bVar2.f46394c.f(bArrE, 3, length);
                return null;
        }
    }
}
