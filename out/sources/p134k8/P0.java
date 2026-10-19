package p134k8;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class P0 implements Continuation<String, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q0 f42640a;

    public P0(Q0 q10) {
        this.f42640a = q10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        this.f42640a.f42664b.a();
        if (result.startsWith("51")) {
            return 0;
        }
        if (result.startsWith("7F")) {
            return d.a(result, 4, 16);
        }
        return -1;
    }
}
