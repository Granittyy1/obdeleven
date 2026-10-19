package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2605e0 f42604a;

    public I0(C2605e0 c2605e0) {
        this.f42604a = c2605e0;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.startsWith("62F1A4")) {
            return Boolean.FALSE;
        }
        this.f42604a.f42749b.put("F1A4", result.substring(6));
        return Boolean.TRUE;
    }
}
