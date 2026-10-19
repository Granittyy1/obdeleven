package y7;

import com.google.firebase.messaging.RunnableC2056t;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.util.i;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: MemoryGaugeCollector.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p241t7.a f48421f = p241t7.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f48422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<com.google.firebase.perf.v1.b> f48423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runtime f48424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f48425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f48426e;

    public e() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.f48425d = null;
        this.f48426e = -1L;
        this.f48422a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f48423b = new ConcurrentLinkedQueue<>();
        this.f48424c = runtime;
    }

    public final synchronized void a(long j, h hVar) {
        this.f48426e = j;
        try {
            this.f48425d = this.f48422a.scheduleAtFixedRate(new RunnableC2056t(this, 5, hVar), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            p241t7.a aVar = f48421f;
            e10.getMessage();
            aVar.f();
        }
    }

    public final com.google.firebase.perf.v1.b b(h hVar) {
        if (hVar == null) {
            return null;
        }
        long jA = hVar.a() + hVar.f28507b;
        com.google.firebase.perf.v1.b.a aVarJ = com.google.firebase.perf.v1.b.J();
        aVarJ.r();
        com.google.firebase.perf.v1.b.H((com.google.firebase.perf.v1.b) aVarJ.f29047c, jA);
        StorageUnit storageUnit = StorageUnit.f28488d;
        Runtime runtime = this.f48424c;
        int iB = i.b(storageUnit.a(runtime.totalMemory() - runtime.freeMemory()));
        aVarJ.r();
        com.google.firebase.perf.v1.b.I((com.google.firebase.perf.v1.b) aVarJ.f29047c, iB);
        return aVarJ.p();
    }
}
