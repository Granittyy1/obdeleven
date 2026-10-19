package X3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Executors.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7203a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7204b = new b();

    /* JADX INFO: compiled from: Executors.java */
    public class a implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f7205b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f7205b.post(runnable);
        }
    }

    /* JADX INFO: compiled from: Executors.java */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
