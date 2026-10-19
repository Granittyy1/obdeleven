package p134k8;

import com.obdeleven.service.model.NRC;
import com.obdeleven.service.model.OBDIICu;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2595b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42734a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42737d;

    public /* synthetic */ C2595b(int i10, OBDIICu oBDIICu, String str) {
        this.f42737d = oBDIICu;
        this.f42735b = i10;
        this.f42736c = str;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        final int i10;
        switch (this.f42734a) {
            case 0:
                return ((C2598c) this.f42737d).e(this.f42735b + 1, this.f42736c);
            default:
                final OBDIICu oBDIICu = (OBDIICu) this.f42737d;
                oBDIICu.getClass();
                String str = (String) task.getResult();
                if (NRC.a(Integer.parseInt(str.substring(0, 2), 16)) != NRC.f29380e) {
                    return task;
                }
                NRC nrcA = NRC.a(Integer.parseInt(str.substring(4, 6), 16));
                if ((nrcA != NRC.f29377b && nrcA != NRC.f29379d) || (i10 = this.f42735b) >= 3) {
                    return task;
                }
                Task<Void> taskDelay = Task.delay(1000L);
                final String str2 = this.f42736c;
                return taskDelay.continueWithTask(new Continuation() { // from class: k8.w1
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        return oBDIICu.P0(i10 + 1, str2);
                    }
                });
        }
    }

    public /* synthetic */ C2595b(int i10, String str, C2598c c2598c) {
        this.f42737d = c2598c;
        this.f42736c = str;
        this.f42735b = i10;
    }
}
