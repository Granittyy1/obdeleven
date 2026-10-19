package io.ktor.utils.io.internal;

import A1.C0575j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: RingBufferCapacity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40629b = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availableForRead$internal");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40630c = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availableForWrite$internal");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40631d = AtomicIntegerFieldUpdater.newUpdater(g.class, "_pendingToFlush");
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40632a;
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    volatile /* synthetic */ int _pendingToFlush = 0;

    public g(int i10) {
        this.f40632a = i10;
        this._availableForWrite$internal = i10;
    }

    public final void a(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._availableForWrite$internal;
            i12 = i11 + i10;
            if (i12 > this.f40632a) {
                StringBuilder sbA = B6.a.a("Completed read overflow: ", " + ", " = ", i11, i10);
                sbA.append(i12);
                sbA.append(" > ");
                sbA.append(this.f40632a);
                throw new IllegalArgumentException(sbA.toString());
            }
        } while (!f40630c.compareAndSet(this, i11, i12));
    }

    public final void b(int i10) {
        int i11;
        int i12;
        do {
            i11 = this._pendingToFlush;
            i12 = i11 + i10;
            if (i12 > this.f40632a) {
                StringBuilder sbA = B6.a.a("Complete write overflow: ", " + ", " > ", i11, i10);
                sbA.append(this.f40632a);
                throw new IllegalArgumentException(sbA.toString());
            }
        } while (!f40631d.compareAndSet(this, i11, i12));
    }

    public final boolean c() {
        int andSet = f40631d.getAndSet(this, 0);
        if (andSet == 0) {
            return this._availableForRead$internal > 0;
        }
        return f40629b.addAndGet(this, andSet) > 0;
    }

    public final boolean d() {
        return this._availableForWrite$internal == 0;
    }

    public final void e() {
        this._availableForRead$internal = this.f40632a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    public final void f() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f40632a;
    }

    public final boolean g() {
        int i10;
        do {
            i10 = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i10 != this.f40632a) {
                return false;
            }
        } while (!f40630c.compareAndSet(this, i10, 0));
        return true;
    }

    public final int h(int i10) {
        int i11;
        int iMin;
        do {
            i11 = this._availableForWrite$internal;
            iMin = Math.min(i10, i11);
            if (iMin == 0) {
                return 0;
            }
        } while (!f40630c.compareAndSet(this, i11, i11 - iMin));
        return Math.min(i10, i11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RingBufferCapacity[read: ");
        sb2.append(this._availableForRead$internal);
        sb2.append(", write: ");
        sb2.append(this._availableForWrite$internal);
        sb2.append(", flush: ");
        sb2.append(this._pendingToFlush);
        sb2.append(", capacity: ");
        return C0575j.b(sb2, this.f40632a, ']');
    }
}
