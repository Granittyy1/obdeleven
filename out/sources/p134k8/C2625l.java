package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.b;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2625l implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42785b;

    public /* synthetic */ C2625l(int i10, ControlUnit controlUnit) {
        this.f42784a = i10;
        this.f42785b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42784a) {
            case 0:
                ControlUnit controlUnit = this.f42785b;
                controlUnit.getClass();
                return ((String) task.getResult()).startsWith("75") ? controlUnit.f29335r.d("36") : task;
            default:
                ControlUnit controlUnit2 = this.f42785b;
                controlUnit2.getClass();
                String str = (String) task.getResult();
                boolean zStartsWith = str.startsWith("62F187");
                ControlUnitDB controlUnitDB = controlUnit2.f29320b;
                if (zStartsWith) {
                    controlUnitDB.setSWNumber(b.b(str.substring(6)).trim());
                    return null;
                }
                if (!str.startsWith("7F22")) {
                    return null;
                }
                controlUnitDB.setSWNumber("");
                return null;
        }
    }
}
