package D3;

import com.google.android.gms.internal.measurement.M1;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<j<?>> f2714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.load.engine.c f2715c;

    /* JADX INFO: compiled from: ActiveResources.java */
    public static final class a extends WeakReference<j<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f2716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o<?> f2718c;

        public a(i iVar, j jVar, ReferenceQueue referenceQueue) {
            super(jVar, referenceQueue);
            M1.d(iVar, "Argument must not be null");
            this.f2716a = iVar;
            boolean z10 = jVar.f2757b;
            this.f2718c = null;
            this.f2717b = z10;
        }
    }

    public c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new D3.a());
        this.f2713a = new HashMap();
        this.f2714b = new ReferenceQueue<>();
        executorServiceNewSingleThreadExecutor.execute(new b(0, this));
    }

    public final synchronized void a(i iVar, j jVar) {
        a aVar = (a) this.f2713a.put(iVar, new a(iVar, jVar, this.f2714b));
        if (aVar != null) {
            aVar.f2718c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        o<?> oVar;
        synchronized (this) {
            this.f2713a.remove(aVar.f2716a);
            if (aVar.f2717b && (oVar = aVar.f2718c) != null) {
                this.f2715c.d(aVar.f2716a, new j(oVar, true, false, aVar.f2716a, this.f2715c));
            }
        }
    }
}
