package p302y6;

import android.os.Process;

/* JADX INFO: renamed from: y6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackgroundPriorityRunnable.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC2808d implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
