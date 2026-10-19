package com.voltasit.obdeleven.core.app;

import android.text.TextUtils;
import com.obdeleven.service.enums.GatewayType;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p134k8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30190c;

    public /* synthetic */ z0(Object obj, int i10, Object obj2) {
        this.f30188a = i10;
        this.f30189b = obj;
        this.f30190c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30188a) {
            case 0:
                B0 b10 = (B0) this.f30189b;
                String[] strArr = b10.f30032k;
                return ((ControlUnit) this.f30190c).L0(b10.f30033l[b10.f30034m], Integer.parseInt(strArr[0], 16), Integer.parseInt(strArr[1], 16)).continueWith(new A0(0));
            case 1:
                ControlUnitInfoFragment this$0 = (ControlUnitInfoFragment) this.f30190c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                String str = (String) task.getResult();
                String str2 = (String) this.f30189b;
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                    return null;
                }
                kotlin.jvm.internal.i.b(str2);
                int i10 = Integer.parseInt(str2);
                kotlin.jvm.internal.i.b(str);
                if (i10 >= Integer.parseInt(str)) {
                    return null;
                }
                com.voltasit.obdeleven.presentation.controlUnit.info.c cVarO = this$0.O();
                cVarO.getClass();
                androidx.lifecycle.C<List<com.voltasit.obdeleven.presentation.controlUnit.info.h>> c10 = cVarO.f31638v;
                List<com.voltasit.obdeleven.presentation.controlUnit.info.h> listD = c10.d();
                if (listD == null) {
                    return null;
                }
                ArrayList arrayListP0 = kotlin.collections.q.p0(listD);
                J8.d dVar = cVarO.f31632p;
                String strA = dVar.a(R.string.common_software_version, new Object[0]);
                Iterator it = arrayListP0.iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                    } else if (!kotlin.jvm.internal.i.a(((com.voltasit.obdeleven.presentation.controlUnit.info.h) it.next()).f31658a, strA)) {
                        i11++;
                    }
                }
                int i12 = i11;
                arrayListP0.set(i12, new com.voltasit.obdeleven.presentation.controlUnit.info.h(strA, str, dVar.a(R.string.view_cu_info_new_version_exists, new Object[0]), ((com.voltasit.obdeleven.presentation.controlUnit.info.h) arrayListP0.get(i12)).f31661d, null, 16));
                c10.j(arrayListP0);
                return null;
            case 2:
                a2 a2Var = (a2) this.f30189b;
                a2Var.getClass();
                GatewayType gatewayType = ((com.obdeleven.service.model.f) task.getResult()).f29428F;
                GatewayType gatewayType2 = GatewayType.f29268b;
                List<ControlUnit> list = (List) this.f30190c;
                if (gatewayType == gatewayType2 || gatewayType == GatewayType.f29269c || a2Var.f42729f) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (ControlUnit controlUnit : list) {
                    if (controlUnit.k0()) {
                        arrayList.add(controlUnit);
                    }
                }
                return arrayList;
            default:
                p194p8.h hVar = (p194p8.h) this.f30189b;
                hVar.getClass();
                hVar.f45913d = (p121j8.c) task.getResult();
                hVar.i();
                return hVar.g((ValueUnit) this.f30190c);
        }
    }
}
