package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: renamed from: k8.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KWP2000SubSystem22.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2639p1 implements Continuation<String, Task<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2630m1.c f42826a;

    public C2639p1(C2630m1.c cVar) {
        this.f42826a = cVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<String> then(Task<String> task) throws Exception {
        if (!task.getResult().startsWith("6EF198")) {
            return Task.forResult(task.getResult());
        }
        C2630m1.c cVar = this.f42826a;
        ControlUnit controlUnit = C2630m1.this.f42792b;
        return controlUnit.f29335r.d(String.format(Locale.US, "2E%1X6%02X%s", Integer.valueOf(cVar.f42806a), Integer.valueOf(cVar.f42807b + 16), cVar.f42808c));
    }
}
