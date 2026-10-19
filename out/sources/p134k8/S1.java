package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: compiled from: UDSSubSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 implements Continuation<String, Task<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P1.c f42672a;

    public S1(P1.c cVar) {
        this.f42672a = cVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<String> then(Task<String> task) throws Exception {
        if (!task.getResult().startsWith("6EF198")) {
            return Task.forResult(task.getResult());
        }
        P1.c cVar = this.f42672a;
        ControlUnit controlUnit = P1.this.f42642b;
        return controlUnit.f29335r.d(String.format(Locale.US, "2E%04X%s", Integer.valueOf(cVar.f42655a), cVar.f42656b));
    }
}
