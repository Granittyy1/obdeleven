package p134k8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2663y implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42877b;

    public /* synthetic */ C2663y(int i10, ControlUnit controlUnit) {
        this.f42876a = i10;
        this.f42877b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42876a) {
            case 0:
                ControlUnit controlUnit = this.f42877b;
                return controlUnit.f29327i != ApplicationProtocol.f29264d ? controlUnit.g0() : Task.forResult(Boolean.FALSE);
            default:
                ControlUnit controlUnit2 = this.f42877b;
                controlUnit2.getClass();
                return ((Boolean) task.getResult()).booleanValue() ? controlUnit2.p0(false, false) : Task.forResult(Boolean.FALSE);
        }
    }
}
