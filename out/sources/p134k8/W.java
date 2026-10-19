package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class W implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42689b;

    public /* synthetic */ W(int i10, ControlUnit controlUnit) {
        this.f42688a = i10;
        this.f42689b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42688a) {
            case 0:
                String str = (String) task.getResult();
                if (str.startsWith("620606")) {
                    return Task.forResult(str);
                }
                return str.startsWith("7F22") ? this.f42689b.f29335r.d("220608") : Task.forResult("");
            default:
                return ((Integer) task.getResult()).intValue() == 0 ? this.f42689b.f29335r.d("310302EF").continueWith(new D0()) : task;
        }
    }
}
