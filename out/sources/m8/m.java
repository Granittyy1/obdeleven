package m8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: compiled from: KWP2000BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Continuation<Void, Task<String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f44635a;

    public m(k kVar) {
        this.f44635a = kVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<String> then(Task<Void> task) throws Exception {
        k kVar = this.f44635a;
        ControlUnit controlUnit = kVar.f44617b;
        return controlUnit.f29335r.d(String.format(Locale.US, "31B800%02X", Integer.valueOf(kVar.f44616a)));
    }
}
