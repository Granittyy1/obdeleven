package V8;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.exception.VehicleException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.utils.HistoryUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p134k8.C2598c;
import p134k8.a2;
import p255u9.C2801d;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6840b;

    public /* synthetic */ y(int i10, Object obj) {
        this.f6839a = i10;
        this.f6840b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws VehicleException {
        switch (this.f6839a) {
            case 0:
                D d10 = (D) this.f6840b;
                d10.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return null;
                }
                d10.q().getSupportFragmentManager().R();
                return null;
            case 1:
                ((p146l8.v) this.f6840b).a();
                if (!task.isFaulted()) {
                    return 0;
                }
                CommandException commandException = (CommandException) task.getError();
                int iA = commandException.a();
                if (iA == -3 || iA == -1) {
                    return -3;
                }
                if (commandException.a() > 128) {
                    return Integer.valueOf(commandException.a());
                }
                return -1;
            case 2:
                com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i iVar = (com.voltasit.obdeleven.presentation.controlUnit.basicsettings.i) this.f6840b;
                ArrayList arrayList = iVar.f31532z.f44621f;
                if (arrayList.size() > 1) {
                    ControlUnit controlUnit = iVar.f31531y;
                    HistoryUtils.a(controlUnit.f29321c.f42726c, controlUnit, String.valueOf(iVar.f31532z.f44616a), arrayList);
                }
                if (!iVar.f31512A) {
                    return null;
                }
                iVar.W();
                return null;
            case 3:
                OBDIICu oBDIICu = (OBDIICu) this.f6840b;
                oBDIICu.getClass();
                if (task.isFaulted()) {
                    return task;
                }
                String str = (String) task.getResult();
                if (str.startsWith("4140")) {
                    oBDIICu.f29385D.addAll(oBDIICu.N0(str));
                    if (oBDIICu.f29385D.contains("60")) {
                        return oBDIICu.P0(0, "0160");
                    }
                }
                return Task.forResult("");
            case 4:
                a2 a2Var = (a2) this.f6840b;
                if (a2Var.f42729f) {
                    O.e.j("Vehicle", "enableAllControlUnits()");
                    p109i8.g gVar = a2Var.f42733k;
                    if (gVar.c() instanceof C8.a.C0024a) {
                        throw new VehicleException(3);
                    }
                    C8.a<Map<Short, C2801d>> aVarA = gVar.a();
                    if (aVarA instanceof C8.a.C0024a) {
                        throw new VehicleException(3);
                    }
                    for (C2801d c2801d : ((Map) ((C8.a.b) aVarA).f2463a).values()) {
                        short sShortValue = c2801d.a().shortValue();
                        C8.a<ControlUnitDB> aVarE = gVar.e(sShortValue);
                        if (!(aVarE instanceof C8.a.C0024a)) {
                            ControlUnitDB controlUnitDB = (ControlUnitDB) ((C8.a.b) aVarE).f2463a;
                            boolean z10 = controlUnitDB.getObjectId() == null;
                            if (51 != sShortValue && !a2Var.f42724a.containsKey(c2801d.a())) {
                                ControlUnit controlUnit2 = new ControlUnit(controlUnitDB, a2Var, new C2598c(), new com.obdeleven.service.core.c());
                                p266v8.a aVar = new p266v8.a();
                                controlUnit2.f29338u = aVar;
                                boolean z11 = !z10;
                                aVar.f(z11);
                                controlUnit2.D0(z11);
                                a2Var.f42724a.put(controlUnit2.n(), controlUnit2);
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(a2Var.f42724a.values());
                Collections.sort(arrayList2, new com.obdeleven.service.util.a(0));
                return arrayList2;
            default:
                return ((p219r8.e) this.f6840b).e();
        }
    }
}
