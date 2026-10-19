package p134k8;

import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.parse.boltsinternal.Task;
import java.util.List;
import p109i8.i;

/* JADX INFO: renamed from: k8.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2650t1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42848d;

    public /* synthetic */ RunnableC2650t1(Object obj, int i10, Object obj2) {
        this.f42846b = i10;
        this.f42847c = obj;
        this.f42848d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f42848d;
        Object obj2 = this.f42847c;
        switch (this.f42846b) {
            case 0:
                i.a aVar = (i.a) obj2;
                if (aVar != null) {
                    aVar.l((List) ((Task) obj).getResult());
                }
                break;
            default:
                h hVar = AppStartTrace.f28434w;
                AppStartTrace appStartTrace = (AppStartTrace) obj2;
                appStartTrace.getClass();
                appStartTrace.f28439c.c(((com.google.firebase.perf.v1.i.a) obj).p(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                break;
        }
    }
}
