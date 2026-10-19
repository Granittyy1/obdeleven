package S2;

import R2.t;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.material.T;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.Z;

/* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f5478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f5479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f5480c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f5481d = new a();

    /* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.this.f5480c.post(runnable);
        }
    }

    public c(ExecutorService executorService) {
        t tVar = new t(executorService);
        this.f5478a = tVar;
        this.f5479b = T.g(tVar);
    }

    @Override // S2.b
    public final Z a() {
        return this.f5479b;
    }

    @Override // S2.b
    public final a b() {
        return this.f5481d;
    }

    @Override // S2.b
    public final t c() {
        return this.f5478a;
    }
}
