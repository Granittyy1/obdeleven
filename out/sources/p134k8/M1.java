package p134k8;

import com.obdeleven.service.util.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: UDSSubSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class M1 implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N1 f42624a;

    public M1(N1 n10) {
        this.f42624a = n10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        boolean zStartsWith = result.startsWith("62");
        N1 n10 = this.f42624a;
        if (zStartsWith) {
            P1.this.f42644d = b.b(result.substring(6));
            return null;
        }
        if (!result.startsWith("7F22")) {
            return null;
        }
        P1.this.f42644d = "";
        return null;
    }
}
