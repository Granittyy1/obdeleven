package p146l8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Continuation<Void, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f44456a;

    public k(i iVar) {
        this.f44456a = iVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Void> then(Task<Void> task) throws Exception {
        return i.i(this.f44456a);
    }
}
