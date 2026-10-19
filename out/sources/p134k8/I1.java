package p134k8;

import com.obdeleven.service.util.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: UDSSubSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class I1 implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J1 f42605a;

    public I1(J1 j10) {
        this.f42605a = j10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        boolean zStartsWith = result.startsWith("62");
        J1 j10 = this.f42605a;
        if (zStartsWith) {
            P1.this.f42646f = b.b(result.substring(6));
            return null;
        }
        if (!result.startsWith("7F22")) {
            return null;
        }
        P1.this.f42646f = "";
        return null;
    }
}
