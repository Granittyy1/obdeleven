package p184ob;

import com.braze.support.BrazeLogger;
import io.grpc.internal.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import p172nb.b;
import p293xa.r;

/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f45260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f45261i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f45262a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45265d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45263b = 10000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45266e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f45267f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C f45268g = new C(1, this);

    /* JADX INFO: compiled from: TaskRunner.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f45269a;

        public a(p172nb.a aVar) {
            this.f45269a = new ThreadPoolExecutor(0, BrazeLogger.SUPPRESS, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }

        public final void a(C runnable) {
            i.e(runnable, "runnable");
            this.f45269a.execute(runnable);
        }
    }

    static {
        String name = b.f45032g + " TaskRunner";
        i.e(name, "name");
        f45260h = new d(new a(new p172nb.a(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        i.d(logger, "getLogger(TaskRunner::class.java.name)");
        f45261i = logger;
    }

    public d(a aVar) {
        this.f45262a = aVar;
    }

    public static final void a(d dVar, p184ob.a aVar) {
        dVar.getClass();
        byte[] bArr = b.f45026a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f45249a);
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
                r rVar = r.f47939a;
            }
        } finally {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                r rVar2 = r.f47939a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(p184ob.a aVar, long j) {
        byte[] bArr = b.f45026a;
        c cVar = aVar.f45251c;
        i.b(cVar);
        if (cVar.f45257d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = cVar.f45259f;
        cVar.f45259f = false;
        cVar.f45257d = null;
        this.f45266e.remove(cVar);
        if (j != -1 && !z10 && !cVar.f45256c) {
            cVar.e(aVar, j, true);
        }
        if (cVar.f45258e.isEmpty()) {
            return;
        }
        this.f45267f.add(cVar);
    }

    public final p184ob.a c() {
        boolean z10;
        byte[] bArr = b.f45026a;
        while (true) {
            ArrayList arrayList = this.f45267f;
            if (arrayList.isEmpty()) {
                return null;
            }
            a aVar = this.f45262a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            p184ob.a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                p184ob.a aVar3 = (p184ob.a) ((c) it.next()).f45258e.get(0);
                long jMax = Math.max(0L, aVar3.f45252d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z10 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
            }
            ArrayList arrayList2 = this.f45266e;
            if (aVar2 != null) {
                byte[] bArr2 = b.f45026a;
                aVar2.f45252d = -1L;
                c cVar = aVar2.f45251c;
                i.b(cVar);
                cVar.f45258e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f45257d = aVar2;
                arrayList2.add(cVar);
                if (z10 || (!this.f45264c && !arrayList.isEmpty())) {
                    aVar.a(this.f45268g);
                }
                return aVar2;
            }
            if (this.f45264c) {
                if (jMin < this.f45265d - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.f45264c = true;
            this.f45265d = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    long j10 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j10);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f45258e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f45264c = false;
            } catch (Throwable th) {
                this.f45264c = false;
                throw th;
            }
        }
    }

    public final void d(c taskQueue) {
        i.e(taskQueue, "taskQueue");
        byte[] bArr = b.f45026a;
        if (taskQueue.f45257d == null) {
            boolean zIsEmpty = taskQueue.f45258e.isEmpty();
            ArrayList arrayList = this.f45267f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                i.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z10 = this.f45264c;
        a aVar = this.f45262a;
        if (z10) {
            notify();
        } else {
            aVar.a(this.f45268g);
        }
    }

    public final c e() {
        int i10;
        synchronized (this) {
            i10 = this.f45263b;
            this.f45263b = i10 + 1;
        }
        return new c(this, J4.i.b(i10, "Q"));
    }
}
