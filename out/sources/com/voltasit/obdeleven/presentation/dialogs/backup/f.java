package com.voltasit.obdeleven.presentation.dialogs.backup;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.models.ControlUnitType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import p134k8.a2;
import p255u9.D;

/* JADX INFO: compiled from: MultiBackupDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiBackupDialog f32188a;

    public f(MultiBackupDialog multiBackupDialog) {
        this.f32188a = multiBackupDialog;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        i.e(task, "task");
        Object result = task.getResult();
        i.d(result, "getResult(...)");
        List<? extends ControlUnit> list = (List) result;
        MultiBackupDialog multiBackupDialog = this.f32188a;
        a2 a2Var = multiBackupDialog.f32171A;
        i.b(a2Var);
        if (a2Var.f42726c.i() != null) {
            a2 a2Var2 = multiBackupDialog.f32171A;
            i.b(a2Var2);
            D dI = a2Var2.f42726c.i();
            i.b(dI);
            ArrayList<Short> arrayListB = dI.b();
            ControlUnitType controlUnitType = ControlUnitType.ObdII;
            if (!arrayListB.contains(Short.valueOf(controlUnitType.a()))) {
                arrayListB.add(Short.valueOf(controlUnitType.a()));
            }
            Iterator<? extends ControlUnit> it = list.iterator();
            while (it.hasNext()) {
                if (arrayListB.contains(it.next().n())) {
                    it.remove();
                }
            }
        }
        multiBackupDialog.f32177z = list;
        return null;
    }
}
