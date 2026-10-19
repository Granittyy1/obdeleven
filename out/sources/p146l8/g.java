package p146l8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p121j8.c;

/* JADX INFO: compiled from: KWP1281Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Continuation<c, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f44437a;

    public g(d dVar) {
        this.f44437a = dVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<c> task) throws Exception {
        this.f44437a.f44428n = task.getResult();
        return null;
    }
}
