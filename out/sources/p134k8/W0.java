package p134k8;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000SubSystem1A.java */
/* JADX INFO: loaded from: classes3.dex */
public final class W0 implements Continuation<String, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X0.a f42690a;

    public W0(X0.a aVar) {
        this.f42690a = aVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.startsWith("7B")) {
            if (result.startsWith("7F")) {
                return d.a(result, 4, 16);
            }
            return -1;
        }
        X0.a aVar = this.f42690a;
        X0.this.f42702i = aVar.f42703a;
        return 0;
    }
}
