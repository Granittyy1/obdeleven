package p146l8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f44457a;

    public l(m mVar) {
        this.f44457a = mVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.startsWith("71")) {
            if (result.startsWith("7F31")) {
                throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
            }
            throw new CommandException(-1);
        }
        i iVar = this.f44457a.f44459b;
        iVar.f44445i = null;
        iVar.f44444h = false;
        return null;
    }
}
