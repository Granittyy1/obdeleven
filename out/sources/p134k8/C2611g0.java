package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: renamed from: k8.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2611g0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f42759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42760c;

    public /* synthetic */ C2611g0(ControlUnit controlUnit, HashMap map, int i10) {
        this.f42758a = i10;
        this.f42760c = controlUnit;
        this.f42759b = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42758a) {
            case 0:
                if (((Integer) task.getResult()).intValue() != 0) {
                    return task;
                }
                HashMap map = this.f42759b;
                if (!map.containsKey("F1A0")) {
                    return task;
                }
                return this.f42760c.f29335r.d("2EF1A0" + ((String) map.get("F1A0"))).continueWith(new C2608f0());
            default:
                return this.f42760c.f29335r.d("22F1A1").continueWith(new J0(this));
        }
    }
}
