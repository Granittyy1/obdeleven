package p134k8;

import com.obdeleven.service.util.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KWP2000SubSystem22.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2597b1 implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2600c1 f42738a;

    public C2597b1(C2600c1 c2600c1) {
        this.f42738a = c2600c1;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        boolean zStartsWith = result.startsWith("62");
        C2600c1 c2600c1 = this.f42738a;
        if (zStartsWith) {
            C2630m1.this.f42798h = b.b(result.substring(6));
            return null;
        }
        if (!result.startsWith("7F22")) {
            return null;
        }
        C2630m1.this.f42798h = "";
        return null;
    }
}
