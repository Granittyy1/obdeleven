package p134k8;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class M0 implements Continuation<String, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f42623a;

    public M0(String str) {
        this.f42623a = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith(String.format(Locale.US, "%02X", Integer.valueOf(Integer.parseInt(this.f42623a.substring(0, 2), 16) + 64)))) {
            return 0;
        }
        if (result.startsWith("7F")) {
            return d.a(result, 4, 16);
        }
        return -1;
    }
}
