package com.voltasit.obdeleven.presentation.controlUnit.info;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.obdeleven.service.model.OBDIIService;
import com.obdeleven.service.model.OBDIIService09;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.C2099n;
import com.voltasit.obdeleven.domain.usecases.vehicle.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptyList;
import kotlin.text.n;
import p109i8.j;
import p134k8.A1;
import p134k8.C2644r1;

/* JADX INFO: compiled from: OBDIIControlUnitInfoFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@O8.b("http://obdeleven.proboards.com/thread/107/info")
public final class i extends ControlUnitInfoFragment {
    @Override // com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment
    public final void P() {
        H(R.string.common_loading_data);
        List<? extends A1> list = (List) Application.f29634b.e(p279w9.a.f47815m);
        if (list == null) {
            list = EmptyList.f42983b;
        }
        if (list != null && !list.isEmpty()) {
            w();
            Q(list);
            return;
        }
        ControlUnit controlUnit = this.f31619o;
        kotlin.jvm.internal.i.c(controlUnit, "null cannot be cast to non-null type com.obdeleven.service.model.OBDIICu");
        OBDIICu oBDIICu = (OBDIICu) controlUnit;
        U6.f fVar = new U6.f(this);
        O.e.j("OBDIIControlUnit", oBDIICu.t() + "_" + oBDIICu.getName() + ": requestVehicleInformation()");
        OBDIIService09 oBDIIService09 = OBDIIService09.f29409b;
        OBDIIService oBDIIService = OBDIIService.f29398e;
        String str = oBDIIService.a() + oBDIIService09.b();
        String str2 = oBDIIService.b() + oBDIIService09.b();
        Task<Boolean> taskD = oBDIICu.D(false);
        int i10 = 3;
        C2099n c2099n = new C2099n(oBDIICu, i10, str);
        ExecutorService executorService = Task.BACKGROUND_EXECUTOR;
        taskD.continueWithTask(c2099n, executorService).continueWithTask(new p(oBDIICu, i10, str2), executorService).continueWithTask(new C2644r1(oBDIICu, 0), executorService).continueWith(new p009a8.c(7, fVar), Task.UI_THREAD_EXECUTOR);
    }

    public final void Q(List<? extends A1> obd2InfoItems) {
        c cVarO = O();
        cVarO.getClass();
        kotlin.jvm.internal.i.e(obd2InfoItems, "obd2InfoItems");
        ArrayList arrayList = new ArrayList();
        for (A1 a10 : obd2InfoItems) {
            if (a10 != null) {
                j jVar = a10.f42568a;
                String strA = cVarO.f31632p.a(jVar.getDescription(), new Object[0]);
                String strC = jVar.c(a10.f42569b);
                kotlin.jvm.internal.i.b(strC);
                if (!n.S(strC)) {
                    arrayList.add(new h(strA, null, null, strC, null, 22));
                }
            }
        }
        cVarO.f31638v.j(arrayList);
    }

    @Override // com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment, com.voltasit.obdeleven.ui.module.BaseFragment
    public final String o() {
        return "OBDIIControlUnitInfoFragment";
    }
}
