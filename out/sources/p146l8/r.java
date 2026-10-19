package p146l8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Continuation<Void, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f44463a;

    public r(i iVar) {
        this.f44463a = iVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Void> then(Task<Void> task) throws Exception {
        i iVar = this.f44463a;
        ControlUnit controlUnit = iVar.f44413b;
        return controlUnit.f29335r.d(String.format("31BA01%02X", Integer.valueOf(iVar.j()))).continueWith(new q());
    }
}
