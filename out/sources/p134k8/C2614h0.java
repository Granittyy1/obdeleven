package p134k8;

import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2614h0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42765a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42765a) {
            case 0:
                String str = (String) task.getResult();
                if (str.startsWith("73")) {
                    return 0;
                }
                if (str.startsWith("7F")) {
                    return d.a(str, 4, 16);
                }
                return -1;
            default:
                return Boolean.valueOf(((String) task.getResult()).startsWith("54"));
        }
    }
}
