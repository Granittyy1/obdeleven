package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: compiled from: UDSSubSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J1 implements Continuation<Void, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P1.a f42612a;

    public J1(P1.a aVar) {
        this.f42612a = aVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Void> then(Task<Void> task) throws Exception {
        P1.a aVar = this.f42612a;
        P1 p10 = P1.this;
        boolean z10 = p10.f42650k;
        int i10 = aVar.f42651a;
        return p10.f42642b.f29335r.d(String.format(Locale.US, "22%04X", Integer.valueOf(z10 ? i10 | 26112 : (i10 | 1536) + 160))).continueWith(new I1(this));
    }
}
