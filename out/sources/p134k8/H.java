package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.b;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42596b;

    public /* synthetic */ H(int i10, ControlUnit controlUnit) {
        this.f42595a = i10;
        this.f42596b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42595a) {
            case 0:
                ControlUnit controlUnit = this.f42596b;
                controlUnit.getClass();
                String str = (String) task.getResult();
                if (str.startsWith("62F191")) {
                    controlUnit.C0(b.b(str.substring(6)).trim());
                } else if (str.startsWith("7F22")) {
                    controlUnit.C0("");
                }
                break;
            default:
                ControlUnit controlUnit2 = this.f42596b;
                controlUnit2.getClass();
                String str2 = (String) task.getResult();
                boolean zStartsWith = str2.startsWith("62F18C");
                ControlUnitDB controlUnitDB = controlUnit2.f29320b;
                if (zStartsWith) {
                    controlUnitDB.setSerialNumber(b.b(str2.substring(6)));
                } else if (str2.startsWith("7F22")) {
                    controlUnitDB.setSerialNumber("");
                }
                break;
        }
        return null;
    }
}
