package p220r9;

import O8.a;
import W7.c;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.oca.b;
import com.voltasit.obdeleven.utils.AbstractControlUnitBackupUtil;
import com.voltasit.obdeleven.utils.bluetooth.n;
import java.util.TimerTask;

/* JADX INFO: renamed from: r9.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractControlUnitBackupUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2778j extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f46475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractControlUnitBackupUtil f46476c;

    public C2778j(AbstractControlUnitBackupUtil abstractControlUnitBackupUtil, a aVar) {
        this.f46476c = abstractControlUnitBackupUtil;
        this.f46475b = aVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f46476c.f34220l == null) {
            cancel();
            return;
        }
        n nVar = c.f7066d;
        if (nVar == null) {
            return;
        }
        nVar.g().continueWith(new b(7, this.f46475b), Task.UI_THREAD_EXECUTOR);
    }
}
