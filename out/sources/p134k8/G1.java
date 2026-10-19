package p134k8;

import com.obdeleven.service.util.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: UDSSubSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G1 implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H1 f42594a;

    public G1(H1 h8) {
        this.f42594a = h8;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        boolean zStartsWith = result.startsWith("62");
        H1 h8 = this.f42594a;
        if (zStartsWith) {
            P1.this.f42647g = b.b(result.substring(6));
            return null;
        }
        if (!result.startsWith("7F22")) {
            return null;
        }
        P1.this.f42647g = "";
        return null;
    }
}
