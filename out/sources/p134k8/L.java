package p134k8;

import O.e;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.b;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p109i8.k;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42618b;

    public /* synthetic */ L(int i10, ControlUnit controlUnit) {
        this.f42617a = i10;
        this.f42618b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42617a) {
            case 0:
                ControlUnit controlUnit = this.f42618b;
                controlUnit.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return Task.forResult(Boolean.FALSE);
                }
                int iOrdinal = controlUnit.f29327i.ordinal();
                k kVar = controlUnit.f29335r;
                if (iOrdinal == 0) {
                    e.j(controlUnit.f0(), "clearFaultsKline()");
                    return kVar.d("05").continueWithTask(new I(1, controlUnit));
                }
                if (iOrdinal != 1) {
                    e.j(controlUnit.f0(), "clearFaultsUDS()");
                    return kVar.d("14FFFFFF").continueWithTask(new C2638p0(1, controlUnit));
                }
                e.j(controlUnit.f0(), "clearFaultsKWP()");
                return kVar.d("14FF00").continueWith(new C2614h0(1));
            default:
                ControlUnit controlUnit2 = this.f42618b;
                controlUnit2.getClass();
                String str = (String) task.getResult();
                boolean zStartsWith = str.startsWith("62F189");
                ControlUnitDB controlUnitDB = controlUnit2.f29320b;
                if (zStartsWith) {
                    controlUnitDB.setSWVersion(b.b(str.substring(6)).trim());
                    return null;
                }
                if (!str.startsWith("7F22")) {
                    return null;
                }
                controlUnitDB.setSWVersion("");
                return null;
        }
    }
}
