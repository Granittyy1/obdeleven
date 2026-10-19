package p146l8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Continuation<String, Void> {
    @Override // com.parse.boltsinternal.Continuation
    public final Void then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("71")) {
            return null;
        }
        if (result.startsWith("7F31")) {
            throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
        }
        throw new CommandException(-1);
    }
}
