package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2611g0 f42611a;

    public J0(C2611g0 c2611g0) {
        this.f42611a = c2611g0;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.startsWith("62F1A1")) {
            return Boolean.FALSE;
        }
        this.f42611a.f42759b.put("F1A1", result.substring(6));
        return Boolean.TRUE;
    }
}
