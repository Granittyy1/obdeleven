package W7;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import kotlinx.coroutines.C2693i;
import p293xa.r;

/* JADX INFO: compiled from: ParseTaskExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task<Object> f7068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2693i f7069b;

    public e(Task task, C2693i c2693i) {
        this.f7068a = task;
        this.f7069b = c2693i;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task<Object> task) {
        Task<Object> task2 = this.f7068a;
        boolean zIsFaulted = task2.isFaulted();
        C2693i c2693i = this.f7069b;
        if (zIsFaulted) {
            return Boolean.valueOf(c2693i.o(task2.getError()));
        }
        c2693i.resumeWith(task2.getResult());
        return r.f47939a;
    }
}
