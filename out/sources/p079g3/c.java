package p079g3;

import O.e;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Task;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p109i8.j;
import p134k8.A1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35567d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f35565b = i10;
        this.f35566c = obj;
        this.f35567d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws InterruptedException {
        switch (this.f35565b) {
            case 0:
                return j.b((InputStream) this.f35566c, (String) this.f35567d);
            default:
                OBDIICu oBDIICu = (OBDIICu) this.f35566c;
                oBDIICu.getClass();
                ArrayList arrayList = new ArrayList();
                oBDIICu.D(false).waitForCompletion();
                e.j("OBDIIControlUnit", "Connected to control unit");
                for (j jVar : (List) this.f35567d) {
                    Task<String> taskQ0 = oBDIICu.Q0(Integer.parseInt(jVar.b(), 16));
                    taskQ0.waitForCompletion();
                    arrayList.add(new A1(jVar, taskQ0.getResult()));
                }
                oBDIICu.a().waitForCompletion();
                e.j("OBDIIControlUnit", "Disconnected from control unit");
                return arrayList;
        }
    }
}
