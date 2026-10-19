package p010a9;

import O.e;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8077a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f8077a) {
            case 0:
                if (!task.isFaulted()) {
                    return null;
                }
                e.m(task.getError());
                return null;
            default:
                return Integer.valueOf(((Boolean) task.getResult()).booleanValue() ? 0 : -2);
        }
    }
}
