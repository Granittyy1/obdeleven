package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: renamed from: k8.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2652u0 implements Continuation<Boolean, Task<Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f42852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42853b;

    public C2652u0(ControlUnit controlUnit, HashMap map) {
        this.f42853b = controlUnit;
        this.f42852a = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Boolean> then(Task<Boolean> task) throws Exception {
        return this.f42853b.f29335r.d("22F1A1").continueWith(new C2649t0(this));
    }
}
