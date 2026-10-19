package io.ktor.utils.io.pool;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.i;
import p086ga.d;

/* JADX INFO: compiled from: DefaultPool.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class DefaultPool<T> implements d<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater<DefaultPool<?>> f40652f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray<T> f40655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f40656e;
    private volatile long top;

    static {
        AtomicLongFieldUpdater<DefaultPool<?>> atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(DefaultPool.class, new MutablePropertyReference1Impl() { // from class: io.ktor.utils.io.pool.DefaultPool$Companion$Top$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.j
            public final Object get(Object obj) {
                return Long.valueOf(((DefaultPool) obj).top);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, Oa.h
            public final void set(Object obj, Object obj2) {
                ((DefaultPool) obj).top = ((Number) obj2).longValue();
            }
        }.getName());
        i.d(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        f40652f = atomicLongFieldUpdaterNewUpdater;
    }

    public DefaultPool(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "capacity should be positive but it is ").toString());
        }
        if (i10 > 536870911) {
            throw new IllegalArgumentException(J4.i.b(i10, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
        this.f40653b = iHighestOneBit;
        this.f40654c = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i11 = iHighestOneBit + 1;
        this.f40655d = new AtomicReferenceArray<>(i11);
        this.f40656e = new int[i11];
    }

    @Override // p086ga.d
    public final void H0(T instance) {
        long j;
        long j10;
        i.e(instance, "instance");
        p(instance);
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.f40654c) + 1;
        for (int i10 = 0; i10 < 8; i10++) {
            AtomicReferenceArray<T> atomicReferenceArray = this.f40655d;
            do {
                if (atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                    if (iIdentityHashCode <= 0) {
                        throw new IllegalArgumentException("index should be positive");
                    }
                    do {
                        j = this.top;
                        j10 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                        this.f40656e[iIdentityHashCode] = (int) (4294967295L & j);
                    } while (!f40652f.compareAndSet(this, j, j10));
                    return;
                }
            } while (atomicReferenceArray.get(iIdentityHashCode) == null);
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.f40653b;
            }
        }
        i(instance);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            T tK = k();
            if (tK == null) {
                return;
            } else {
                i(tK);
            }
        }
    }

    public void i(T instance) {
        i.e(instance, "instance");
    }

    public abstract T j();

    public final T k() {
        int i10;
        while (true) {
            long j = this.top;
            i10 = 0;
            if (j == 0) {
                break;
            }
            long j10 = ((j >> 32) & 4294967295L) + 1;
            int i11 = (int) (4294967295L & j);
            if (i11 == 0) {
                break;
            }
            if (f40652f.compareAndSet(this, j, (j10 << 32) | ((long) this.f40656e[i11]))) {
                i10 = i11;
                break;
            }
        }
        if (i10 == 0) {
            return null;
        }
        return this.f40655d.getAndSet(i10, null);
    }

    public void p(T instance) {
        i.e(instance, "instance");
    }

    @Override // p086ga.d
    public final T y() {
        T tK = k();
        return tK != null ? h(tK) : j();
    }

    public T h(T t8) {
        return t8;
    }
}
