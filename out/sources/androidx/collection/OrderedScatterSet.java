package androidx.collection;

import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class OrderedScatterSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f9110a = U.f9132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f9111b = p233t.a.f46998c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f9112c = W.f9136a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9113d = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9114e = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9116g;

    public final boolean a(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f9115f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f9110a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.i.a(this.f9111b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderedScatterSet)) {
            return false;
        }
        OrderedScatterSet orderedScatterSet = (OrderedScatterSet) obj;
        if (orderedScatterSet.f9116g != this.f9116g) {
            return false;
        }
        Object[] objArr = this.f9111b;
        long[] jArr = this.f9110a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128 && !orderedScatterSet.a(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[DONT_INVERT, PHI: r0
      0x0051: PHI (r0v5 int) = (r0v4 int), (r0v6 int) binds: [B:6:0x0020, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[LOOP:0: B:5:0x0012->B:20:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[EDGE_INSN: B:23:0x0056->B:21:0x0056 BREAK  A[LOOP:0: B:5:0x0012->B:20:0x0053], SYNTHETIC] */
    public final int hashCode() {
        int iHashCode = (this.f9115f * 31) + this.f9116g;
        Object[] objArr = this.f9111b;
        long[] jArr = this.f9110a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!kotlin.jvm.internal.i.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return iHashCode;
    }

    public final String toString() {
        Ia.l<E, CharSequence> lVar = new Ia.l<E, CharSequence>(this) { // from class: androidx.collection.OrderedScatterSet.toString.1
            final /* synthetic */ OrderedScatterSet<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final CharSequence invoke(Object obj) {
                return obj == this.this$0 ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f9111b;
        long[] jArr = this.f9112c;
        int i10 = this.f9114e;
        int i11 = 0;
        while (i10 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.i.d(string, "toString(...)");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) lVar.invoke(obj));
            i11++;
            i10 = i12;
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        kotlin.jvm.internal.i.d(string2, "toString(...)");
        return string2;
    }
}
