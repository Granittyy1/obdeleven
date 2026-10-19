package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: renamed from: k8.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2641q0 implements Continuation<Boolean, Task<Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f42828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42829b;

    public C2641q0(ControlUnit controlUnit, HashMap map) {
        this.f42829b = controlUnit;
        this.f42828a = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Boolean> then(Task<Boolean> task) throws Exception {
        return this.f42829b.f29335r.d("22F1AC").continueWith(new C2638p0(0, this));
    }
}
