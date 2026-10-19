package p134k8;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KWP2000SubSystem22.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2636o1 implements Continuation<String, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2630m1.c f42820a;

    public C2636o1(C2630m1.c cVar) {
        this.f42820a = cVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("6E")) {
            C2630m1.this.j = null;
            return 0;
        }
        if (result.startsWith("7F")) {
            return d.a(result, 4, 16);
        }
        return -1;
    }
}
