package m8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Continuation<Void, Task<p194p8.j>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f44613a;

    public d(g gVar) {
        this.f44613a = gVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<p194p8.j> then(Task<Void> task) throws Exception {
        return this.f44613a.c();
    }
}
