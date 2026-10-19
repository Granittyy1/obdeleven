package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: renamed from: k8.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2599c0 implements Continuation<Integer, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f42741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42742b;

    public C2599c0(ControlUnit controlUnit, HashMap map) {
        this.f42742b = controlUnit;
        this.f42741a = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Integer> task) throws Exception {
        if (task.getResult().intValue() != 0) {
            return task;
        }
        HashMap map = this.f42741a;
        if (!map.containsKey("F1A4")) {
            return task;
        }
        return this.f42742b.f29335r.d("2EF1A4" + ((String) map.get("F1A4"))).continueWith(new C2596b0());
    }
}
