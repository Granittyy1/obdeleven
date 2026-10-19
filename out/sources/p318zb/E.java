package p318zb;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f49048a = new D(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f49049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<D>[] f49050c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f49049b = iHighestOneBit;
        AtomicReference<D>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f49050c = atomicReferenceArr;
    }

    public static final void a(D segment) {
        i.e(segment, "segment");
        if (segment.f49046f != null || segment.f49047g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f49044d) {
            return;
        }
        AtomicReference<D> atomicReference = f49050c[(int) (Thread.currentThread().getId() & (((long) f49049b) - 1))];
        D d10 = f49048a;
        D andSet = atomicReference.getAndSet(d10);
        if (andSet == d10) {
            return;
        }
        int i10 = andSet != null ? andSet.f49043c : 0;
        if (i10 >= 65536) {
            atomicReference.set(andSet);
            return;
        }
        segment.f49046f = andSet;
        segment.f49042b = 0;
        segment.f49043c = i10 + 8192;
        atomicReference.set(segment);
    }

    public static final D b() {
        AtomicReference<D> atomicReference = f49050c[(int) (Thread.currentThread().getId() & (((long) f49049b) - 1))];
        D d10 = f49048a;
        D andSet = atomicReference.getAndSet(d10);
        if (andSet == d10) {
            return new D();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new D();
        }
        atomicReference.set(andSet.f49046f);
        andSet.f49046f = null;
        andSet.f49043c = 0;
        return andSet;
    }
}
