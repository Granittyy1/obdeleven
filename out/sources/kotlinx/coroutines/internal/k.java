package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.C2714y;
import kotlinx.coroutines.E;
import kotlinx.coroutines.H;
import kotlinx.coroutines.P;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends AbstractC2712w implements H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43482h = AtomicIntegerFieldUpdater.newUpdater(k.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2712w f43483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f43485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n<Runnable> f43486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f43487g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: compiled from: LimitedDispatcher.kt */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f43488b;

        public a(Runnable runnable) {
            this.f43488b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f43488b.run();
                } catch (Throwable th) {
                    C2714y.a(EmptyCoroutineContext.f43032b, th);
                }
                k kVar = k.this;
                Runnable runnableD1 = kVar.d1();
                if (runnableD1 == null) {
                    return;
                }
                this.f43488b = runnableD1;
                i10++;
                if (i10 >= 16) {
                    AbstractC2712w abstractC2712w = kVar.f43483c;
                    if (abstractC2712w.b1(kVar)) {
                        abstractC2712w.Z0(kVar, this);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(AbstractC2712w abstractC2712w, int i10) {
        this.f43483c = abstractC2712w;
        this.f43484d = i10;
        H h8 = abstractC2712w instanceof H ? (H) abstractC2712w : null;
        this.f43485e = h8 == null ? E.f43173a : h8;
        this.f43486f = new n<>();
        this.f43487g = new Object();
    }

    @Override // kotlinx.coroutines.H
    public final void N(long j, C2693i c2693i) {
        this.f43485e.N(j, c2693i);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        Runnable runnableD1;
        this.f43486f.a(runnable);
        if (f43482h.get(this) >= this.f43484d || !e1() || (runnableD1 = d1()) == null) {
            return;
        }
        this.f43483c.Z0(this, new a(runnableD1));
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void a1(kotlin.coroutines.e eVar, Runnable runnable) {
        Runnable runnableD1;
        this.f43486f.a(runnable);
        if (f43482h.get(this) >= this.f43484d || !e1() || (runnableD1 = d1()) == null) {
            return;
        }
        this.f43483c.a1(this, new a(runnableD1));
    }

    public final Runnable d1() {
        while (true) {
            Runnable runnableD = this.f43486f.d();
            if (runnableD != null) {
                return runnableD;
            }
            synchronized (this.f43487g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43482h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f43486f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean e1() {
        synchronized (this.f43487g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43482h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f43484d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.H
    public final P m0(long j, Runnable runnable, kotlin.coroutines.e eVar) {
        return this.f43485e.m0(j, runnable, eVar);
    }
}
