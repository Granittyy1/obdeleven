package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2643r0 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2646s0 f42834a;

    public C2643r0(C2646s0 c2646s0) {
        this.f42834a = c2646s0;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.startsWith("62F1A4")) {
            return Boolean.FALSE;
        }
        this.f42834a.f42839a.put("F1A4", result.substring(6));
        return Boolean.TRUE;
    }
}
