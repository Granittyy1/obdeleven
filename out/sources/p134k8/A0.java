package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 implements Continuation<Integer, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f42566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42567b;

    public A0(ControlUnit controlUnit, HashMap map) {
        this.f42567b = controlUnit;
        this.f42566a = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Integer> task) throws Exception {
        if (task.getResult().intValue() != 0) {
            return task;
        }
        HashMap map = this.f42566a;
        if (!map.containsKey("F1A1")) {
            return task;
        }
        return this.f42567b.f29335r.d("2EF1A1" + ((String) map.get("F1A1"))).continueWith(new C2667z0());
    }
}
