package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class L0 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f42619a;

    public L0(HashMap map) {
        this.f42619a = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.startsWith("62F1A0")) {
            return Boolean.FALSE;
        }
        this.f42619a.put("F1A0", result.substring(6));
        return Boolean.TRUE;
    }
}
