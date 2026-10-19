package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.OnlineControlUnitAdaptationFragment;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2088c implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30082b;

    public /* synthetic */ C2088c(int i10, Object obj) {
        this.f30081a = i10;
        this.f30082b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task13) {
        switch (this.f30081a) {
            case 0:
                Task task = (Task) this.f30082b;
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
            case 1:
                OnlineControlUnitAdaptationFragment this$0 = (OnlineControlUnitAdaptationFragment) this.f30082b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task13, "task13");
                Integer num = (Integer) task13.getResult();
                if (num == null || num.intValue() != 0) {
                    this$0.f0();
                    return null;
                }
                this$0.f31672F = "";
                this$0.f31671E = true;
                this$0.c0();
                return null;
            case 2:
                p060e9.b bVar = (p060e9.b) this.f30082b;
                bVar.getClass();
                com.obdeleven.service.odx.e eVar = (com.obdeleven.service.odx.e) task13.getResult();
                bVar.f34830o = eVar.I("TAB_RecorDataIdentECUIdent");
                p060e9.n.R(bVar.f34853n.b(), bVar.f34830o, eVar);
                return eVar;
            case 3:
                return ((com.obdeleven.service.model.f) this.f30082b).a().continueWith(new C2092g(3, task13));
            case 4:
                OBDIICu oBDIICu = (OBDIICu) this.f30082b;
                oBDIICu.getClass();
                O.e.j("OBDIIControlUnit", "Requesting supported pids");
                return oBDIICu.R0();
            default:
                return ((p219r8.e) this.f30082b).f();
        }
    }
}
