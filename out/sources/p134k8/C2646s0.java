package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: renamed from: k8.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2646s0 implements Continuation<Boolean, Task<Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f42839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42840b;

    public C2646s0(ControlUnit controlUnit, HashMap map) {
        this.f42840b = controlUnit;
        this.f42839a = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Boolean> then(Task<Boolean> task) throws Exception {
        return this.f42840b.f29335r.d("22F1A4").continueWith(new C2643r0(this));
    }
}
