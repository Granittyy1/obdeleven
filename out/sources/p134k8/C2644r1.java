package p134k8;

import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2644r1 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OBDIICu f42836b;

    public /* synthetic */ C2644r1(OBDIICu oBDIICu, int i10) {
        this.f42835a = i10;
        this.f42836b = oBDIICu;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42835a) {
            case 0:
                this.f42836b.a();
                return task;
            default:
                this.f42836b.getClass();
                return new C2668z1("0100", 500L).a();
        }
    }
}
