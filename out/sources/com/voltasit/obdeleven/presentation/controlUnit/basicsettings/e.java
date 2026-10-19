package com.voltasit.obdeleven.presentation.controlUnit.basicsettings;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.obdeleven.utils.bluetooth.m;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31504b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f31503a = i10;
        this.f31504b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f31503a) {
            case 0:
                i iVar = (i) this.f31504b;
                iVar.getClass();
                if (!task.isFaulted()) {
                    iVar.P();
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34280y, 1);
                    return null;
                }
                int iA = ((CommandException) task.getError()).a();
                if (iA == -1) {
                    MainActivity mainActivityQ = iVar.q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.common_request_timeout));
                    return null;
                }
                if (iA != 51) {
                    P.a(iVar.q(), String.format("(%02X) %s", Integer.valueOf(iA), Texttabe.a(iA)));
                    return null;
                }
                iVar.V(true);
                return null;
            case 1:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a this$0 = (com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.a) this.f31504b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                ControlUnit controlUnit = this$0.f31668B;
                kotlin.jvm.internal.i.b(controlUnit);
                return controlUnit.a();
            case 2:
                m mVar = (m) this.f31504b;
                mVar.getClass();
                String str = (String) task.getResult();
                mVar.f34368c = str;
                return str;
            case 3:
                OBDIICu oBDIICu = (OBDIICu) this.f31504b;
                oBDIICu.getClass();
                if (task.isFaulted()) {
                    return task;
                }
                String str2 = (String) task.getResult();
                if (str2.startsWith("4160")) {
                    oBDIICu.f29385D.addAll(oBDIICu.N0(str2));
                    if (oBDIICu.f29385D.contains("80")) {
                        return oBDIICu.P0(0, "0180");
                    }
                }
                return Task.forResult("");
            case 4:
                p146l8.i iVar2 = (p146l8.i) this.f31504b;
                iVar2.getClass();
                iVar2.j = (p121j8.c) task.getResult();
                return null;
            default:
                return ((p219r8.e) this.f31504b).a();
        }
    }
}
