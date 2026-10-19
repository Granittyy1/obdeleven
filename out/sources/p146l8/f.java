package p146l8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP1281Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.c f44436a;

    public f(d.c cVar) {
        this.f44436a = cVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.contains("09") && !result.contains("E6")) {
            if (result.contains("0A")) {
                throw new CommandException(0);
            }
            throw new CommandException(-1);
        }
        d dVar = d.this;
        dVar.f44427m = null;
        dVar.f44422g = false;
        return null;
    }
}
