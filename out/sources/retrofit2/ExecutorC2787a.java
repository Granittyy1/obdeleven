package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: retrofit2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidMainExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC2787a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f46678b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f46678b.post(runnable);
    }
}
