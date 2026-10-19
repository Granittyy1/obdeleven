package m8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Continuation<Void, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f44610a;

    public a(g gVar) {
        this.f44610a = gVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<Void> task) throws Exception {
        return this.f44610a.d();
    }
}
