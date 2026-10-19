package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F0 implements Continuation<Integer, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42590a;

    public F0(ControlUnit controlUnit) {
        this.f42590a = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Integer> task) throws Exception {
        return task.getResult().intValue() == 0 ? this.f42590a.f29335r.d("310102EF030100").continueWith(new E0()) : task;
    }
}
