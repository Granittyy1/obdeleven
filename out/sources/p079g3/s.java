package p079g3;

import M2.e;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: LottieTask.java */
/* JADX INFO: loaded from: classes.dex */
public final class s<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExecutorService f35593e = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f35594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f35595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f35596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile r<T> f35597d;

    /* JADX INFO: compiled from: LottieTask.java */
    public class a extends FutureTask<r<T>> {
        public a(Callable<r<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            s sVar = s.this;
            if (isCancelled()) {
                return;
            }
            try {
                sVar.c(get());
            } catch (InterruptedException | ExecutionException e10) {
                sVar.c(new r<>(e10));
            }
        }
    }

    public s() {
        throw null;
    }

    public s(Callable<r<T>> callable) {
        this.f35594a = new LinkedHashSet(1);
        this.f35595b = new LinkedHashSet(1);
        this.f35596c = new Handler(Looper.getMainLooper());
        this.f35597d = null;
        f35593e.execute(new a(callable));
    }

    public final synchronized void a(q qVar) {
        Throwable th;
        try {
            r<T> rVar = this.f35597d;
            if (rVar != null && (th = rVar.f35592b) != null) {
                qVar.onResult(th);
            }
            this.f35595b.add(qVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(q qVar) {
        T t8;
        try {
            r<T> rVar = this.f35597d;
            if (rVar != null && (t8 = rVar.f35591a) != null) {
                qVar.onResult(t8);
            }
            this.f35594a.add(qVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(r<T> rVar) {
        if (this.f35597d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f35597d = rVar;
        this.f35596c.post(new e(3, this));
    }
}
