package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;

/* JADX INFO: renamed from: k8.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KWP2000SubSystem22.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2612g1 implements Continuation<Void, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2630m1.a f42761a;

    public C2612g1(C2630m1.a aVar) {
        this.f42761a = aVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Void> then(Task<Void> task) throws Exception {
        C2630m1.a aVar = this.f42761a;
        ControlUnit controlUnit = C2630m1.this.f42792b;
        return controlUnit.f29335r.d(String.format(Locale.US, "22%1X6%02X", Integer.valueOf(aVar.f42800a), Integer.valueOf(aVar.f42801b + 160))).continueWith(new C2609f1(this));
    }
}
