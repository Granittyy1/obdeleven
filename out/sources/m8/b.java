package m8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Continuation<Integer, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f44611a;

    public b(g gVar) {
        this.f44611a = gVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<Integer> task) throws Exception {
        Integer result = task.getResult();
        int iIntValue = result.intValue();
        g gVar = this.f44611a;
        if (iIntValue == gVar.f44620e) {
            return null;
        }
        gVar.f44621f.add(result);
        gVar.f44620e = result.intValue();
        return null;
    }
}
