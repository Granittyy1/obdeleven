package E6;

import A6.f0;
import C4.w;
import android.os.SystemClock;
import android.util.Log;
import androidx.compose.material.ripple.j;
import com.google.android.datatransport.Priority;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p191p5.h;
import p302y6.G;
import p302y6.Q;
import p311z4.g;
import p311z4.i;

/* JADX INFO: compiled from: ReportQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f3098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f3099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f3103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f3104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g<f0> f3105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f3106i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3107k;

    /* JADX INFO: compiled from: ReportQueue.java */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G f3108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h<G> f3109c;

        public a(G g10, h hVar) {
            this.f3108b = g10;
            this.f3109c = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            G g10 = this.f3108b;
            h<G> hVar = this.f3109c;
            d dVar = d.this;
            dVar.b(g10, hVar);
            ((AtomicInteger) dVar.f3106i.f12004c).set(0);
            double dMin = Math.min(3600000.0d, Math.pow(dVar.f3099b, dVar.a()) * (60000.0d / dVar.f3098a));
            String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d));
            Log.isLoggable("FirebaseCrashlytics", 3);
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public d(g<f0> gVar, F6.d dVar, j jVar) {
        double d10 = dVar.f3264d;
        long j = ((long) dVar.f3266f) * 1000;
        this.f3098a = d10;
        this.f3099b = dVar.f3265e;
        this.f3100c = j;
        this.f3105h = gVar;
        this.f3106i = jVar;
        this.f3101d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f3102e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f3103f = arrayBlockingQueue;
        this.f3104g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f3107k = 0L;
    }

    public final int a() {
        if (this.f3107k == 0) {
            this.f3107k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f3107k) / this.f3100c);
        int iMin = this.f3103f.size() == this.f3102e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.f3107k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final G g10, final h<G> hVar) {
        g10.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        final boolean z10 = SystemClock.elapsedRealtime() - this.f3101d < 2000;
        ((w) this.f3105h).a(new p311z4.a(g10.a(), Priority.f25233d, null), new i() { // from class: E6.b
            @Override // p311z4.i
            public final void b(Exception exc) throws Throwable {
                int i10 = 0;
                d dVar = this.f3091b;
                dVar.getClass();
                h hVar2 = hVar;
                if (exc != null) {
                    hVar2.c(exc);
                    return;
                }
                if (z10) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new c(dVar, i10, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = Q.f48352a;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    i10 = 1;
                                }
                            } catch (Throwable th) {
                                th = th;
                                i10 = 1;
                                if (i10 != 0) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (i10 != 0) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                hVar2.d(g10);
            }
        });
    }
}
