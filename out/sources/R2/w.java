package R2;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SynchronousExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
