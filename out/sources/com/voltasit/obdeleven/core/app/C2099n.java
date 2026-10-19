package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2099n implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30129c;

    public /* synthetic */ C2099n(Object obj, int i10, Object obj2) {
        this.f30127a = i10;
        this.f30128b = obj;
        this.f30129c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30127a) {
            case 0:
                C2101p c2101p = (C2101p) this.f30128b;
                c2101p.getClass();
                if (task.isFaulted()) {
                    CommandException commandException = (CommandException) task.getError();
                    int iA = commandException.a();
                    if (iA == -3 || iA == -1) {
                        return Task.forResult(-3);
                    }
                    return commandException.a() > 128 ? Task.forResult(Integer.valueOf(commandException.a())) : Task.forResult(-1);
                }
                if (((Integer) task.getResult()).intValue() == 4) {
                    return Task.forResult(-3);
                }
                if (Integer.parseInt(c2101p.f30136l[c2101p.f30137m]) != 1) {
                    return Task.forResult(0);
                }
                m8.g gVar = (m8.g) this.f30129c;
                Task taskContinueWithTask = gVar.f44619d.continueWithTask(new m8.c(gVar));
                gVar.f44619d = taskContinueWithTask;
                return taskContinueWithTask.continueWith(new C2100o(0));
            case 1:
                n0 n0Var = (n0) this.f30128b;
                String[] strArr = n0Var.j;
                return ((ControlUnit) this.f30129c).L0(n0Var.a(), Integer.parseInt(strArr[0], 16), Integer.parseInt(strArr[1], 16)).continueWith(new C2100o(1));
            case 2:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m mVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.m) this.f30128b;
                mVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return null;
                }
                mVar.V((String) this.f30129c);
                return null;
            default:
                OBDIICu oBDIICu = (OBDIICu) this.f30128b;
                oBDIICu.getClass();
                O.e.j("OBDIIControlUnit", "Requesting supported pids");
                return oBDIICu.P0(0, (String) this.f30129c);
        }
    }
}
