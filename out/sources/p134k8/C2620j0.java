package p134k8;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2620j0 implements Continuation<String, Integer> {
    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("77")) {
            return 0;
        }
        if (result.startsWith("7F")) {
            return d.a(result, 4, 16);
        }
        return -1;
    }
}
