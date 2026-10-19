package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0 implements Continuation<Integer, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f42576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42577b;

    public C0(ControlUnit controlUnit, HashMap map) {
        this.f42577b = controlUnit;
        this.f42576a = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Integer> task) throws Exception {
        if (task.getResult().intValue() != 0) {
            return task;
        }
        HashMap map = this.f42576a;
        if (!map.containsKey("F1A0")) {
            return task;
        }
        return this.f42577b.f29335r.d("2EF1A0" + ((String) map.get("F1A0"))).continueWith(new B0());
    }
}
