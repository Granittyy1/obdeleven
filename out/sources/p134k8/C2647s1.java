package p134k8;

import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: k8.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2647s1 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OBDIICu f42842b;

    public /* synthetic */ C2647s1(OBDIICu oBDIICu, int i10) {
        this.f42841a = i10;
        this.f42842b = oBDIICu;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f42841a) {
            case 0:
                OBDIICu oBDIICu = this.f42842b;
                oBDIICu.getClass();
                List list = (List) task.getResult();
                oBDIICu.f29337t = !list.isEmpty();
                ArrayList arrayList = oBDIICu.f29330m;
                arrayList.clear();
                arrayList.addAll(list);
                oBDIICu.a();
                return task;
            default:
                OBDIICu oBDIICu2 = this.f42842b;
                oBDIICu2.getClass();
                return ((Boolean) task.getResult()).booleanValue() ? oBDIICu2.R0() : Task.forResult(null);
        }
    }
}
