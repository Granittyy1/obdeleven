package p074fa;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;
import p036ca.b;
import p293xa.d;

/* JADX INFO: compiled from: ChunkBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@d
public final class a extends p061ea.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35064i;
    public static final C0367a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f35065k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p086ga.d<a> f35066g;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    static {
        C0367a c0367a = new C0367a();
        j = c0367a;
        f35065k = new a(b.f22529a, c0367a);
        f35063h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "nextRef");
        f35064i = AtomicIntegerFieldUpdater.newUpdater(a.class, "refCount");
    }

    public a() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ByteBuffer memory, p086ga.d dVar) {
        super(memory);
        i.e(memory, "memory");
        this.f35066g = dVar;
        this.nextRef = null;
        this.refCount = 1;
    }

    public final a f() {
        return (a) f35063h.getAndSet(this, null);
    }

    public final a g() {
        return (a) this.nextRef;
    }

    public final int h() {
        return this.refCount;
    }

    public final void i(p086ga.d<a> pool) {
        int i10;
        int i11;
        i.e(pool, "pool");
        do {
            i10 = this.refCount;
            if (i10 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i11 = i10 - 1;
        } while (!f35064i.compareAndSet(this, i10, i11));
        if (i11 == 0) {
            p086ga.d<a> dVar = this.f35066g;
            if (dVar != null) {
                pool = dVar;
            }
            pool.H0(this);
        }
    }

    public final void j() {
        d(0);
        int i10 = this.f34860f;
        int i11 = this.f34858d;
        this.f34856b = i11;
        this.f34857c = i11;
        this.f34859e = i10 - i11;
        this.nextRef = null;
    }

    public final void k(a aVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (aVar == null) {
            f();
            return;
        }
        do {
            atomicReferenceFieldUpdater = f35063h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    public final void l() {
        int i10;
        do {
            i10 = this.refCount;
            if (i10 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i10 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f35064i.compareAndSet(this, i10, 1));
    }

    /* JADX INFO: renamed from: fa.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChunkBuffer.kt */
    public static final class C0367a implements p086ga.d<a> {
        @Override // p086ga.d
        public final void H0(a aVar) {
            a instance = aVar;
            i.e(instance, "instance");
            if (instance != a.f35065k) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }

        @Override // p086ga.d
        public final a y() {
            return a.f35065k;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
