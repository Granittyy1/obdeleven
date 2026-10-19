package S8;

import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.utils.bluetooth.n;
import java.util.TimerTask;

/* JADX INFO: compiled from: VoltageReadTimer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f5700b;

    public b(c cVar) {
        this.f5700b = cVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        c cVar = this.f5700b;
        if (cVar.f5702b == null) {
            cancel();
        } else {
            if (cVar.f5701a == null) {
                return;
            }
            n nVar = W7.c.f7066d;
            (nVar == null ? Task.forError(new Exception("Device not connected")) : nVar.g()).continueWith(new a(0, cVar));
        }
    }
}
