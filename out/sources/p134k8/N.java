package p134k8;

import com.obdeleven.service.core.c;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class N implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f42626b;

    public /* synthetic */ N(int i10, ControlUnit controlUnit) {
        this.f42625a = i10;
        this.f42626b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42625a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("00");
                ControlUnit controlUnit = this.f42626b;
                sb2.append(controlUnit.O());
                return ((c) controlUnit.f29339v).b(sb2.toString());
            default:
                return this.f42626b.f29324f.g("1089");
        }
    }
}
