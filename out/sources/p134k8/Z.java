package p134k8;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Z implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42714a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42714a) {
            case 0:
                String str = (String) task.getResult();
                if (str.startsWith("6E")) {
                    return 0;
                }
                if (str.startsWith("7F")) {
                    return d.a(str, 4, 16);
                }
                return -1;
            default:
                String str2 = (String) task.getResult();
                if (str2.startsWith("76")) {
                    return 0;
                }
                if (str2.startsWith("7F")) {
                    return Integer.valueOf(Integer.parseInt(str2.substring(4, 16)));
                }
                return -1;
        }
    }
}
