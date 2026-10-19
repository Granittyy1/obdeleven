package p134k8;

import O.e;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42622b;

    public /* synthetic */ M(int i10, ControlUnit controlUnit) {
        this.f42621a = i10;
        this.f42622b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42621a) {
            case 0:
                ControlUnit controlUnit = this.f42622b;
                return controlUnit.f29335r.d("22F18C").continueWith(new H(1, controlUnit));
            default:
                ControlUnit controlUnit2 = this.f42622b;
                controlUnit2.getClass();
                if (!task.isFaulted() || controlUnit2.f29320b.getControlUnitBase().getString("udsRespId").split(":").length <= 1) {
                    return task;
                }
                e.m(task.getError());
                return controlUnit2.I(1);
        }
    }
}
