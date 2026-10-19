package m8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Continuation<p121j8.c, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f44615a;

    public f(g gVar) {
        this.f44615a = gVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<p121j8.c> task) throws Exception {
        this.f44615a.f44618c = task.getResult();
        return null;
    }
}
