package io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import ra.i;

/* JADX INFO: loaded from: classes3.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements i<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Integer f40882b = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscArrayQueue(int i10) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i10 - 1)));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i10 / 4, f40882b.intValue());
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
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    @Override // ra.j
    public final boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.mask;
        long j = this.producerIndex.get();
        int i11 = ((int) j) & i10;
        if (j >= this.producerLookAhead) {
            long j10 = ((long) this.lookAheadStep) + j;
            if (get(i10 & ((int) j10)) == null) {
                this.producerLookAhead = j10;
            } else if (get(i11) != null) {
                return false;
            }
        }
        lazySet(i11, e10);
        this.producerIndex.lazySet(j + 1);
        return true;
    }

    @Override // ra.j
    public final E poll() {
        long j = this.consumerIndex.get();
        int i10 = ((int) j) & this.mask;
        E e10 = get(i10);
        if (e10 == null) {
            return null;
        }
        this.consumerIndex.lazySet(j + 1);
        lazySet(i10, null);
        return e10;
    }
}
