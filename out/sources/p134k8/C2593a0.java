package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import p109i8.k;

/* JADX INFO: renamed from: k8.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2593a0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f42722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42723c;

    public /* synthetic */ C2593a0(Object obj, Serializable serializable, int i10) {
        this.f42721a = i10;
        this.f42723c = obj;
        this.f42722b = serializable;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42721a) {
            case 0:
                if (((Integer) task.getResult()).intValue() != 0) {
                    return task;
                }
                HashMap map = (HashMap) this.f42722b;
                if (!map.containsKey("F1AC")) {
                    return task;
                }
                return ((ControlUnit) this.f42723c).f29335r.d("2EF1AC" + ((String) map.get("F1AC"))).continueWith(new Z(0));
            default:
                if (((Integer) task.getResult()).intValue() != 0) {
                    return task;
                }
                k kVar = ((G0) this.f42723c).f42593a.f42600d.f29335r;
                Locale locale = Locale.US;
                return kVar.d("3601" + ((String) this.f42722b)).continueWith(new Z(1));
        }
    }
}
