package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Y implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42711b;

    public /* synthetic */ Y(int i10, ControlUnit controlUnit) {
        this.f42710a = i10;
        this.f42711b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42710a) {
            case 0:
                return ((Integer) task.getResult()).intValue() == 0 ? this.f42711b.f29335r.d("31B80FFF").continueWith(new X(0)) : task;
            default:
                return ((Integer) task.getResult()).intValue() == 0 ? this.f42711b.f29335r.d("37").continueWith(new X(1)) : task;
        }
    }
}
