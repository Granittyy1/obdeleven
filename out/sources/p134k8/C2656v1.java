package p134k8;

import com.obdeleven.service.core.b;
import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2656v1 implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        if (!task.isFaulted()) {
            return task;
        }
        int iA = ((CommandException) task.getError()).a();
        return (iA == 128 || iA == 129 || iA == 133) ? b.a("0033") : task;
    }
}
