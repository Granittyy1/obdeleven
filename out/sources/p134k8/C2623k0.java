package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2623k0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42782b;

    public /* synthetic */ C2623k0(int i10, Object obj) {
        this.f42781a = i10;
        this.f42782b = obj;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42781a) {
            case 0:
                return ((Integer) task.getResult()).intValue() == 0 ? ((ControlUnit) this.f42782b).f29335r.d("37").continueWith(new C2620j0()) : task;
            default:
                return ((ControlUnit) ((C2638p0) this.f42782b).f42825b).f29324f.g("04");
        }
    }
}
