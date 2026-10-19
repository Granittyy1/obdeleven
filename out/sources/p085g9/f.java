package p085g9;

import O.e;
import W7.c;
import com.obdeleven.service.model.OBDIICu;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Collections;
import p134k8.C2647s1;
import p134k8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        Task taskContinueWithTask;
        if (!((Boolean) task.getResult()).booleanValue()) {
            return Task.forResult(Collections.emptyList());
        }
        try {
            a2 a2Var = c.f7067e;
            if (a2Var == null) {
                taskContinueWithTask = Task.forResult(Collections.emptyList());
            } else {
                OBDIICu oBDIICuG = a2Var.g();
                ArrayList arrayList = oBDIICuG.f29385D;
                taskContinueWithTask = (arrayList != null ? Task.forResult(arrayList) : oBDIICuG.D(false).continueWithTask(new C2647s1(oBDIICuG, 1))).continueWithTask(new i(oBDIICuG, 0));
            }
            return taskContinueWithTask;
        } catch (ParseException e10) {
            e.m(e10);
            return Task.forResult(Collections.emptyList());
        }
    }
}
