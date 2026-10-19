package p134k8;

import O.e;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.b;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2645s implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42838b;

    public /* synthetic */ C2645s(int i10, ControlUnit controlUnit) {
        this.f42837a = i10;
        this.f42838b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42837a) {
            case 0:
                ControlUnit controlUnit = this.f42838b;
                controlUnit.getClass();
                boolean zIsFaulted = task.isFaulted();
                boolean z10 = !zIsFaulted;
                e.j(controlUnit.f0(), "disconnect(" + z10 + ")");
                if (!zIsFaulted) {
                    controlUnit.G0(null);
                }
                return Boolean.valueOf(z10);
            case 1:
                ControlUnit controlUnit2 = this.f42838b;
                if (controlUnit2.f29327i == ApplicationProtocol.f29264d) {
                    return controlUnit2.f29335r.d("22F1A2").continueWith(new C2645s(2, controlUnit2));
                }
                controlUnit2.f29320b.setODXVersion("");
                return Task.forResult(null);
            default:
                ControlUnit controlUnit3 = this.f42838b;
                controlUnit3.getClass();
                String str = (String) task.getResult();
                boolean zStartsWith = str.startsWith("62F1A2");
                ControlUnitDB controlUnitDB = controlUnit3.f29320b;
                if (zStartsWith) {
                    controlUnitDB.setODXVersion(b.b(str.substring(6)));
                    return null;
                }
                if (!str.startsWith("7F22")) {
                    return null;
                }
                controlUnitDB.setODXVersion("");
                return null;
        }
    }
}
