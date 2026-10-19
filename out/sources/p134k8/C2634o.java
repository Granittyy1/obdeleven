package p134k8;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2634o implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42815b;

    public /* synthetic */ C2634o(int i10, ControlUnit controlUnit) {
        this.f42814a = i10;
        this.f42815b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42814a) {
            case 0:
                ControlUnit controlUnit = this.f42815b;
                controlUnit.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    return controlUnit.f29327i == ApplicationProtocol.f29262b ? Task.forResult(Boolean.FALSE) : Task.forResult(null).continueWithTask(new C2654v(0, controlUnit)).continueWithTask(new C2657w(0, controlUnit));
                }
                return Task.forResult(Boolean.FALSE);
            default:
                ControlUnit controlUnit2 = this.f42815b;
                controlUnit2.getClass();
                String str = (String) task.getResult();
                if (str.startsWith("5A9A")) {
                    int i10 = (Integer.parseInt(str.substring(26, 28), 16) - 1) * 2;
                    controlUnit2.f29332o = str.substring(24, 28);
                    controlUnit2.E0(str.substring(28, i10 + 28), true);
                }
                return Boolean.TRUE;
        }
    }
}
