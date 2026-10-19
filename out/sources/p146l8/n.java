package p146l8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f44460a;

    public n(i iVar) {
        this.f44460a = iVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("72")) {
            this.f44460a.f44441e = false;
            return null;
        }
        if (result.startsWith("7F32")) {
            throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
        }
        throw new CommandException(-1);
    }
}
