package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class K implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42614b;

    public /* synthetic */ K(int i10, ControlUnit controlUnit) {
        this.f42613a = i10;
        this.f42614b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        String str;
        switch (this.f42613a) {
            case 0:
                ControlUnit controlUnit = this.f42614b;
                return controlUnit.f29335r.d("22F1AA").continueWith(new r(2, controlUnit));
            default:
                ControlUnit controlUnit2 = this.f42614b;
                controlUnit2.getClass();
                return (task.isFaulted() || (str = (String) task.getResult()) == null || !(str.startsWith("620600") || str.startsWith("7F22"))) ? Task.delay(2000L).continueWithTask(new C2648t(2, controlUnit2)) : Task.forResult(str);
        }
    }
}
