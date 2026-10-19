package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class U implements Continuation<String, Task<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42681a;

    public U(ControlUnit controlUnit) {
        this.f42681a = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<String> then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("620607")) {
            return Task.forResult(result);
        }
        return result.startsWith("7F22") ? this.f42681a.f29335r.d("220606") : Task.forResult("");
    }
}
