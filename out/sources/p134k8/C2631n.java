package p134k8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.C;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.q;

/* JADX INFO: renamed from: k8.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2631n implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42811b;

    public /* synthetic */ C2631n(int i10, ControlUnit controlUnit) {
        this.f42810a = i10;
        this.f42811b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42810a) {
            case 0:
                ControlUnit controlUnit = this.f42811b;
                controlUnit.getClass();
                return ((String) task.getResult()).startsWith("75") ? controlUnit.f29335r.d("3601") : task;
            case 1:
                ControlUnit controlUnit2 = this.f42811b;
                return controlUnit2.f29335r.d("22F1A3").continueWith(new C(2, controlUnit2));
            default:
                ControlUnit controlUnit3 = this.f42811b;
                return controlUnit3.f29327i == ApplicationProtocol.f29263c ? Task.delay(55L).continueWithTask(new N(1, controlUnit3)).onSuccess(new q(1)) : controlUnit3.E(((String) task.getResult()).substring(4), true);
        }
    }
}
