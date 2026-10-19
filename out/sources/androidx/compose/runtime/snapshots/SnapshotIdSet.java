package androidx.compose.runtime.snapshots;

import androidx.collection.D;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: SnapshotIdSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Long>, Ja.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SnapshotIdSet f13147f = new SnapshotIdSet(0, 0, 0, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f13151e;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotIdSet.kt */
    @Aa.c(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Ia.p<kotlin.sequences.i<? super Long>, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(kotlin.sequences.i<? super Long> iVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(iVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007b  */
        /* JADX WARN: Code duplicated, block: B:24:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0085 -> B:26:0x009e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d7 -> B:37:0x00d9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SnapshotIdSet(long j, long j10, long j11, long[] jArr) {
        this.f13148b = j;
        this.f13149c = j10;
        this.f13150d = j11;
        this.f13151e = jArr;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    public final SnapshotIdSet A(long j) {
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        long j12 = this.f13150d;
        long j13 = j - j12;
        long j14 = this.f13149c;
        if (j13 < 0 || j13 >= 64) {
            long j15 = this.f13148b;
            int i10 = 64;
            if (j13 < 64 || j13 >= 128) {
                long[] jArr3 = this.f13151e;
                if (j13 < 128) {
                    if (jArr3 == null) {
                        return new SnapshotIdSet(j15, j14, j12, new long[]{j});
                    }
                    int iF = C.e.f(jArr3, j);
                    if (iF < 0) {
                        int i11 = -(iF + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        Q3.d.p(jArr3, jArr4, 0, 0, i11);
                        Q3.d.p(jArr3, jArr4, 1 + i11, i11, length);
                        jArr4[i11] = j;
                        return new SnapshotIdSet(this.f13148b, this.f13149c, this.f13150d, jArr4);
                    }
                } else if (!q(j)) {
                    long j16 = 64;
                    long j17 = ((j + 1) / j16) * j16;
                    if (j17 < 0) {
                        j17 = 9223372036854775680L;
                    }
                    long j18 = j14;
                    long j19 = this.f13150d;
                    long j20 = j15;
                    j jVar = null;
                    while (true) {
                        if (j19 >= j17) {
                            j10 = j19;
                            j11 = j18;
                            break;
                        }
                        if (j18 != 0) {
                            if (jVar == null) {
                                jVar = new j(jArr3);
                            }
                            int i12 = 0;
                            while (i12 < i10) {
                                long j21 = j16;
                                if ((j18 & (1 << i12)) != 0) {
                                    ((D) jVar.f13215b).a(((long) i12) + j19);
                                }
                                i12++;
                                j16 = j21;
                                i10 = 64;
                            }
                        }
                        long j22 = j16;
                        if (j20 == 0) {
                            j11 = 0;
                            j10 = j17;
                            break;
                        }
                        j19 += j22;
                        j18 = j20;
                        j16 = j22;
                        i10 = 64;
                        j20 = 0;
                    }
                    if (jVar == null) {
                        jArr = jArr3;
                    } else {
                        D d10 = (D) jVar.f13215b;
                        int i13 = d10.f9198b;
                        if (i13 == 0) {
                            jArr2 = null;
                        } else {
                            jArr2 = new long[i13];
                            long[] jArr5 = d10.f9197a;
                            for (int i14 = 0; i14 < i13; i14++) {
                                jArr2[i14] = jArr5[i14];
                            }
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new SnapshotIdSet(j20, j11, j10, jArr).A(j);
                }
            } else {
                long j23 = 1 << (((int) j13) - 64);
                if ((j15 & j23) == 0) {
                    return new SnapshotIdSet(j15 | j23, j14, j12, this.f13151e);
                }
            }
        } else {
            long j24 = 1 << ((int) j13);
            if ((j14 & j24) == 0) {
                return new SnapshotIdSet(this.f13148b, j14 | j24, j12, this.f13151e);
            }
        }
        return this;
    }

    public final SnapshotIdSet e(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSetK;
        long[] jArr;
        SnapshotIdSet snapshotIdSet2 = f13147f;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        long j = snapshotIdSet.f13150d;
        long j10 = this.f13150d;
        long[] jArr2 = snapshotIdSet.f13151e;
        long j11 = snapshotIdSet.f13149c;
        long j12 = snapshotIdSet.f13148b;
        if (j == j10 && jArr2 == (jArr = this.f13151e)) {
            return new SnapshotIdSet(this.f13148b & (~j12), this.f13149c & (~j11), j10, jArr);
        }
        if (jArr2 != null) {
            snapshotIdSetK = this;
            for (long j13 : jArr2) {
                snapshotIdSetK = snapshotIdSetK.k(j13);
            }
        } else {
            snapshotIdSetK = this;
        }
        long j14 = 0;
        long j15 = snapshotIdSet.f13150d;
        if (j11 != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((j11 & (1 << i10)) != 0) {
                    snapshotIdSetK = snapshotIdSetK.k(((long) i10) + j15);
                }
            }
        }
        if (j12 != 0) {
            int i11 = 0;
            while (i11 < 64) {
                if (((1 << i11) & j12) != j14) {
                    snapshotIdSetK = snapshotIdSetK.k(((long) i11) + j15 + ((long) 64));
                }
                i11++;
                j14 = 0;
            }
        }
        return snapshotIdSetK;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return C1787c0.n(new AnonymousClass1(null));
    }

    public final SnapshotIdSet k(long j) {
        long[] jArr;
        int iF;
        long[] jArr2;
        long j10 = this.f13150d;
        long j11 = j - j10;
        if (j11 >= 0 && j11 < 64) {
            long j12 = 1 << ((int) j11);
            long j13 = this.f13149c;
            if ((j13 & j12) != 0) {
                return new SnapshotIdSet(this.f13148b, j13 & (~j12), j10, this.f13151e);
            }
        } else if (j11 >= 64 && j11 < 128) {
            long j14 = 1 << (((int) j11) - 64);
            long j15 = this.f13148b;
            if ((j15 & j14) != 0) {
                return new SnapshotIdSet(j15 & (~j14), this.f13149c, j10, this.f13151e);
            }
        } else if (j11 < 0 && (jArr = this.f13151e) != null && (iF = C.e.f(jArr, j)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (iF > 0) {
                    Q3.d.p(jArr, jArr3, 0, 0, iF);
                }
                if (iF < i10) {
                    Q3.d.p(jArr, jArr3, iF, iF + 1, length);
                }
                jArr2 = jArr3;
            }
            return new SnapshotIdSet(this.f13148b, this.f13149c, this.f13150d, jArr2);
        }
        return this;
    }

    public final boolean q(long j) {
        long[] jArr;
        long j10 = j - this.f13150d;
        if (j10 < 0 || j10 >= 64) {
            if (j10 < 64 || j10 >= 128) {
                if (j10 <= 0 && (jArr = this.f13151e) != null && C.e.f(jArr, j) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j10) - 64)) & this.f13148b) != 0) {
                return true;
            }
        } else if (((1 << ((int) j10)) & this.f13149c) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }

    public final SnapshotIdSet v(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSetA;
        long[] jArr;
        SnapshotIdSet snapshotIdSetA2 = snapshotIdSet;
        SnapshotIdSet snapshotIdSet2 = f13147f;
        if (snapshotIdSetA2 == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSetA2;
        }
        long j = snapshotIdSetA2.f13150d;
        long j10 = this.f13150d;
        long j11 = this.f13149c;
        long j12 = this.f13148b;
        long[] jArr2 = snapshotIdSetA2.f13151e;
        long j13 = snapshotIdSetA2.f13149c;
        long j14 = snapshotIdSetA2.f13148b;
        if (j == j10 && jArr2 == (jArr = this.f13151e)) {
            return new SnapshotIdSet(j12 | j14, j11 | j13, j10, jArr);
        }
        long j15 = 1;
        long[] jArr3 = this.f13151e;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j16 : jArr3) {
                    snapshotIdSetA2 = snapshotIdSetA2.A(j16);
                }
            }
            long j17 = this.f13150d;
            if (j11 != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if (((1 << i10) & j11) != 0) {
                        snapshotIdSetA2 = snapshotIdSetA2.A(((long) i10) + j17);
                    }
                }
            }
            if (j12 == 0) {
                return snapshotIdSetA2;
            }
            int i11 = 0;
            while (i11 < 64) {
                if (((j15 << i11) & j12) != 0) {
                    snapshotIdSetA2 = snapshotIdSetA2.A(((long) i11) + j17 + ((long) 64));
                }
                i11++;
                j15 = 1;
            }
            return snapshotIdSetA2;
        }
        if (jArr2 != null) {
            snapshotIdSetA = this;
            for (long j18 : jArr2) {
                snapshotIdSetA = snapshotIdSetA.A(j18);
            }
        } else {
            snapshotIdSetA = this;
        }
        long j19 = snapshotIdSetA2.f13150d;
        if (j13 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((j13 & (1 << i12)) != 0) {
                    snapshotIdSetA = snapshotIdSetA.A(((long) i12) + j19);
                }
            }
        }
        if (j14 != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if (((1 << i13) & j14) != 0) {
                    snapshotIdSetA = snapshotIdSetA.A(((long) i13) + j19 + ((long) 64));
                }
            }
        }
        return snapshotIdSetA;
    }
}
