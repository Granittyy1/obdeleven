package p134k8;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: UDSSubSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class R1 implements Continuation<String, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P1.c f42667a;

    public R1(P1.c cVar) {
        this.f42667a = cVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("6E")) {
            P1.this.j = null;
            return 0;
        }
        if (result.startsWith("7F")) {
            return d.a(result, 4, 16);
        }
        return -1;
    }
}
