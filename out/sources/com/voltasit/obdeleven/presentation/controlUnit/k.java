package com.voltasit.obdeleven.presentation.controlUnit;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.Theme;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.DiagnosticSession;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.util.Texttabe;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p033c7.C1505s;
import p134k8.a2;
import p220r9.P;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31666b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f31665a = i10;
        this.f31666b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws Exception {
        switch (this.f31665a) {
            case 0:
                ControlUnitFragment this$0 = (ControlUnitFragment) this.f31666b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                C2134a0.a();
                ArrayList arrayListB = task.getResult() == ApplicationProtocol.f29264d ? DiagnosticSession.b() : DiagnosticSession.a();
                if (task.isFaulted()) {
                    task.getError().printStackTrace();
                    MainActivity mainActivityQ = this$0.q();
                    P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
                } else {
                    int size = arrayListB.size();
                    String[] strArr = new String[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        DiagnosticSession diagnosticSession = (DiagnosticSession) arrayListB.get(i10);
                        String str = diagnosticSession.f29363c;
                        String strC = (str == null || str.isEmpty()) ? null : Texttabe.c(str);
                        if (strC == null || strC.isEmpty()) {
                            strC = diagnosticSession.f29362b;
                        }
                        strArr[i10] = strC;
                        ControlUnit controlUnit = this$0.f31429o;
                        kotlin.jvm.internal.i.b(controlUnit);
                        if (controlUnit.p() != null) {
                            ControlUnit controlUnit2 = this$0.f31429o;
                            kotlin.jvm.internal.i.b(controlUnit2);
                            DiagnosticSession diagnosticSessionP = controlUnit2.p();
                            kotlin.jvm.internal.i.b(diagnosticSessionP);
                            String str2 = diagnosticSessionP.f29363c;
                            String strC2 = (str2 == null || str2.isEmpty()) ? null : Texttabe.c(str2);
                            if (strC2 == null || strC2.isEmpty()) {
                                strC2 = diagnosticSessionP.f29362b;
                            }
                            if (kotlin.jvm.internal.i.a(strC2, strArr[i10])) {
                                strArr[i10] = androidx.compose.ui.text.font.s.b(strArr[i10], " -Active");
                            }
                        }
                    }
                    MaterialDialog.a aVar = new MaterialDialog.a(this$0.requireActivity());
                    aVar.f23212B = Theme.f23261b;
                    aVar.g(R.string.view_cu_select_diagnostic_session);
                    aVar.c((CharSequence[]) Arrays.copyOf(strArr, size));
                    aVar.f23256z = new C1505s(arrayListB, this$0);
                    aVar.f23211A = null;
                    aVar.f();
                }
                return null;
            case 1:
                p060e9.a aVar2 = (p060e9.a) this.f31666b;
                aVar2.getClass();
                com.obdeleven.service.odx.e eVar = (com.obdeleven.service.odx.e) task.getResult();
                aVar2.f34828o = eVar.I("TAB_RecorDataIdentCalibData");
                p060e9.n.R(aVar2.f34853n.b(), aVar2.f34828o, eVar);
                return eVar;
            case 2:
                OBDIICu oBDIICu = (OBDIICu) this.f31666b;
                oBDIICu.getClass();
                if (task.isFaulted()) {
                    throw task.getError();
                }
                String str3 = (String) task.getResult();
                if (str3.startsWith("4180")) {
                    oBDIICu.f29385D.addAll(oBDIICu.N0(str3));
                }
                return oBDIICu.f29385D;
            case 3:
                a2 a2Var = (a2) this.f31666b;
                a2Var.getClass();
                List<ControlUnit> list = (List) task.getResult();
                if (!a2Var.h() && !a2Var.f42726c.getBoolean("scanned")) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (ControlUnit controlUnit3 : list) {
                    if (controlUnit3.b()) {
                        arrayList.add(controlUnit3);
                    }
                }
                return arrayList;
            default:
                return ((p219r8.e) this.f31666b).g();
        }
    }
}
