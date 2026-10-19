package p085g9;

import O.e;
import com.obdeleven.service.model.OBDIICu;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.HistoryDB;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OBDIICu f35662b;

    public /* synthetic */ i(OBDIICu oBDIICu, int i10) {
        this.f35661a = i10;
        this.f35662b = oBDIICu;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws ParseException {
        switch (this.f35661a) {
            case 0:
                if (task.isFaulted()) {
                    e.m(task.getError());
                }
                this.f35662b.a();
                return task;
            default:
                OBDIICu oBDIICu = this.f35662b;
                HistoryDB historyDBU = oBDIICu.u(oBDIICu.f29330m);
                oBDIICu.u0(historyDBU);
                historyDBU.save();
                return Boolean.valueOf(!task.isFaulted());
        }
    }
}
