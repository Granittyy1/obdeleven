package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;

/* JADX INFO: compiled from: UDSSubSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Q1 implements Continuation<String, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P1.b f42665a;

    public Q1(P1.b bVar) {
        this.f42665a = bVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Boolean then(Task<String> task) throws Exception {
        String result = task.getResult();
        boolean zStartsWith = result.startsWith("62");
        P1.b bVar = this.f42665a;
        if (zStartsWith) {
            P1 p10 = P1.this;
            p10.f42649i = CodingType.f34406f;
            p10.j = result.substring(6);
            return Boolean.TRUE;
        }
        if (!result.startsWith("7F22")) {
            return Boolean.FALSE;
        }
        P1 p11 = P1.this;
        p11.f42649i = CodingType.f34403c;
        p11.j = "";
        return Boolean.TRUE;
    }
}
