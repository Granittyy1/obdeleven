package io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ra.i;

/* JADX INFO: compiled from: SpscLinkedArrayQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> implements i<T> {
    public static final int j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f40883k = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f40884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicReferenceArray<Object> f40888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f40889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AtomicReferenceArray<Object> f40890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f40891i;

    public a(int i10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f40884b = atomicLong;
        this.f40891i = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i10) - 1));
        int i11 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.f40888f = atomicReferenceArray;
        this.f40887e = i11;
        this.f40885c = Math.min(iNumberOfLeadingZeros / 4, j);
        this.f40890h = atomicReferenceArray;
        this.f40889g = i11;
        this.f40886d = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // ra.j
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // ra.j
    public final boolean isEmpty() {
        return this.f40884b.get() == this.f40891i.get();
    }

    @Override // ra.j
    public final boolean offer(T t8) {
        if (t8 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f40888f;
        AtomicLong atomicLong = this.f40884b;
        long j10 = atomicLong.get();
        int i10 = this.f40887e;
        int i11 = ((int) j10) & i10;
        if (j10 < this.f40886d) {
            atomicReferenceArray.lazySet(i11, t8);
            atomicLong.lazySet(j10 + 1);
            return true;
        }
        long j11 = ((long) this.f40885c) + j10;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            this.f40886d = j11 - 1;
            atomicReferenceArray.lazySet(i11, t8);
            atomicLong.lazySet(j10 + 1);
            return true;
        }
        long j12 = j10 + 1;
        if (atomicReferenceArray.get(((int) j12) & i10) == null) {
            atomicReferenceArray.lazySet(i11, t8);
            atomicLong.lazySet(j12);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f40888f = atomicReferenceArray2;
        this.f40886d = (j10 + ((long) i10)) - 1;
        atomicReferenceArray2.lazySet(i11, t8);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i11, f40883k);
        atomicLong.lazySet(j12);
        return true;
    }

    @Override // ra.j
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f40890h;
        AtomicLong atomicLong = this.f40891i;
        long j10 = atomicLong.get();
        int i10 = this.f40889g;
        int i11 = ((int) j10) & i10;
        T t8 = (T) atomicReferenceArray.get(i11);
        boolean z10 = t8 == f40883k;
        if (t8 != null && !z10) {
            atomicReferenceArray.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
            return t8;
        }
        if (!z10) {
            return null;
        }
        int i12 = i10 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
        atomicReferenceArray.lazySet(i12, null);
        this.f40890h = atomicReferenceArray2;
        T t10 = (T) atomicReferenceArray2.get(i11);
        if (t10 != null) {
            atomicReferenceArray2.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
        }
        return t10;
    }
}
