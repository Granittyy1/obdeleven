package m8;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Continuation<String, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.b f44636a;

    public n(k.b bVar) {
        this.f44636a = bVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Integer then(Task<String> task) throws Exception {
        String result = task.getResult();
        if (!result.contains("71BA")) {
            if (result.startsWith("7F31")) {
                throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
            }
            throw new CommandException(-1);
        }
        int i10 = Integer.parseInt(result.substring(8, 10), 16);
        byte[] bArrE = com.obdeleven.service.util.b.e(result.substring(10));
        byte b10 = bArrE[0];
        k.this.f44630g.f(bArrE, 3, (b10 == 95 || b10 == 110 || b10 == 111 || b10 == 118) ? 1 : bArrE.length / 3);
        return Integer.valueOf(i10);
    }
}
