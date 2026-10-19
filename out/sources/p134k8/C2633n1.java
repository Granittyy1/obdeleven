package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;

/* JADX INFO: renamed from: k8.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KWP2000SubSystem22.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2633n1 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2630m1.b f42813a;

    public C2633n1(C2630m1.b bVar) {
        this.f42813a = bVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        String result = task.getResult();
        boolean zStartsWith = result.startsWith("62");
        C2630m1.b bVar = this.f42813a;
        if (zStartsWith) {
            C2630m1 c2630m1 = C2630m1.this;
            c2630m1.f42799i = CodingType.f34406f;
            c2630m1.j = result.substring(6);
            return Boolean.TRUE;
        }
        if (!result.startsWith("7F22")) {
            return Boolean.FALSE;
        }
        C2630m1 c2630m2 = C2630m1.this;
        c2630m2.f42799i = CodingType.f34403c;
        c2630m2.j = "";
        return Boolean.TRUE;
    }
}
