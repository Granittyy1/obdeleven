package p146l8;

import I.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Continuation<Void, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f44458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f44459b;

    public m(i iVar, String str) {
        this.f44459b = iVar;
        this.f44458a = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Void> then(Task<Void> task) throws Exception {
        String str = this.f44458a;
        i iVar = this.f44459b;
        return iVar.f44413b.f29335r.d(String.format("31BB01%02X%s0594E8DE".concat(b.j()), Integer.valueOf(iVar.j()), iVar.m(str))).continueWith(new l(this));
    }
}
