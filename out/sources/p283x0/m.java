package p283x0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47875c;

    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47876b;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f47876b = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f47876b);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f47874b, this.f47875c);
    }
}
