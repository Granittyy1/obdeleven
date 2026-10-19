package m8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Continuation<String, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f44634a;

    public l(k kVar) {
        this.f44634a = kVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.contains("71")) {
            this.f44634a.f44631h = true;
            return null;
        }
        if (result.startsWith("7F31")) {
            throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
        }
        throw new CommandException(-1);
    }
}
