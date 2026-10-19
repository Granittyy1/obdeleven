package p146l8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements Continuation<Void, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f44462a;

    public p(i iVar) {
        this.f44462a = iVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Void> then(Task<Void> task) throws Exception {
        i iVar = this.f44462a;
        ControlUnit controlUnit = iVar.f44413b;
        return controlUnit.f29335r.d(String.format("31B901%02X%02X", Integer.valueOf(iVar.j()), Integer.valueOf(iVar.f44412a))).continueWith(new o(this));
    }
}
