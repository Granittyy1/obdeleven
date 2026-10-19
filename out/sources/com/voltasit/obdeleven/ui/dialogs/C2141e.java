package com.voltasit.obdeleven.ui.dialogs;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.vehicle.gauges.GaugeFragment;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import java.util.Collection;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2141e implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33930b;

    public /* synthetic */ C2141e(int i10, Object obj) {
        this.f33929a = i10;
        this.f33930b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f33929a) {
            case 0:
                C2147h c2147h = (C2147h) this.f33930b;
                c2147h.f33967y.addAll((Collection<? extends String>) task.getResult());
                c2147h.f33984s.f2129y.setVisibility(8);
                return null;
            case 1:
                com.voltasit.obdeleven.utils.bluetooth.m mVar = (com.voltasit.obdeleven.utils.bluetooth.m) this.f33930b;
                mVar.getClass();
                String str = (String) task.getResult();
                mVar.f34369d = str;
                return str;
            case 2:
                p060e9.b bVar = (p060e9.b) this.f33930b;
                bVar.getClass();
                C2134a0.a();
                if (task.isFaulted() || task.getResult() == null) {
                    MainActivity mainActivityQ = bVar.q();
                    p220r9.P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
                    return null;
                }
                p147l9.e eVar = new p147l9.e(bVar.q(), bVar.f34830o, (com.obdeleven.service.odx.e) task.getResult(), bVar.f34831p.a());
                eVar.e(bVar.f34853n.b());
                bVar.f34851l.setAdapter(eVar);
                return null;
            case 3:
                return ((GaugeFragment) this.f33930b).f33444t.a();
            default:
                ((Integer) task.getResult()).intValue();
                int iIntValue = ((Integer) task.getResult()).intValue();
                p134k8.T0 t8 = (p134k8.T0) this.f33930b;
                t8.f42677c = iIntValue;
                return t8;
        }
    }
}
