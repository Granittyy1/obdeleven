package m8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP1281BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Continuation<String, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.b f44628a;

    public i(h.b bVar) {
        this.f44628a = bVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (result.startsWith("F4")) {
            h.this.f44622g.d(com.obdeleven.service.util.b.e(result.substring(2)));
            return 0;
        }
        if (result.contains("0A")) {
            throw new CommandException(0);
        }
        throw new CommandException(-1);
    }
}
