package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.HashMap;

/* JADX INFO: renamed from: k8.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2605e0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f42749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42750c;

    public /* synthetic */ C2605e0(ControlUnit controlUnit, HashMap map, int i10) {
        this.f42748a = i10;
        this.f42750c = controlUnit;
        this.f42749b = map;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42748a) {
            case 0:
                if (((Integer) task.getResult()).intValue() != 0) {
                    return task;
                }
                HashMap map = this.f42749b;
                if (!map.containsKey("F1A1")) {
                    return task;
                }
                return this.f42750c.f29335r.d("2EF1A1" + ((String) map.get("F1A1"))).continueWith(new C2602d0());
            default:
                return this.f42750c.f29335r.d("22F1A4").continueWith(new I0(this));
        }
    }
}
