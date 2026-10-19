package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2649t0 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2652u0 f42845a;

    public C2649t0(C2652u0 c2652u0) {
        this.f42845a = c2652u0;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.startsWith("62F1A1")) {
            return Boolean.FALSE;
        }
        this.f42845a.f42852a.put("F1A1", result.substring(6));
        return Boolean.TRUE;
    }
}
