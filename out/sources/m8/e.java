package m8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Continuation<Void, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f44614a;

    public e(g gVar) {
        this.f44614a = gVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Void> then(Task<Void> task) throws Exception {
        return this.f44614a.b();
    }
}
