package androidx.work;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.work.impl.utils.futures.a<j.a> f20313b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.f20313b.k(worker.b());
            } catch (Throwable th) {
                worker.f20313b.l(th);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.work.impl.utils.futures.a f20315b;

        public b(androidx.work.impl.utils.futures.a aVar) {
            this.f20315b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
            } catch (Throwable th) {
                this.f20315b.l(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract j.a.c b();

    @Override // androidx.work.j
    public final p107i6.f<e> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        getBackgroundExecutor().execute(new b(aVar));
        return aVar;
    }

    @Override // androidx.work.j
    public final p107i6.f<j.a> startWork() {
        this.f20313b = new androidx.work.impl.utils.futures.a<>();
        getBackgroundExecutor().execute(new a());
        return this.f20313b;
    }
}
