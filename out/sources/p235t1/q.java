package p235t1;

import A1.K;
import U1.f;
import android.util.SparseArray;
import androidx.media3.exoplayer.Q;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.k;
import com.braze.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import p078g1.i;
import p078g1.n;
import p078g1.t;
import p114j1.r;
import p272w1.d;

/* JADX INFO: compiled from: SampleQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class q implements K {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f47055B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f47056a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.b f47059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.a.C0185a f47060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f47061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f47062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DrmSession f47063h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f47070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f47071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f47072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f47073s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f47077w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n f47080z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f47057b = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47064i = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
    public long[] j = new long[Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f47065k = new long[Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f47068n = new long[Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f47067m = new int[Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f47066l = new int[Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public K.a[] f47069o = new K.a[Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u<b> f47058c = new u<>(new B7.b(11));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f47074t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f47075u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f47076v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f47079y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f47078x = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f47054A = true;

    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f47082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public K.a f47083c;
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f47084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.drm.b.InterfaceC0187b f47085b;

        public b(n nVar, androidx.media3.exoplayer.drm.b.InterfaceC0187b interfaceC0187b) {
            this.f47084a = nVar;
            this.f47085b = interfaceC0187b;
        }
    }

    public q(d dVar, androidx.media3.exoplayer.drm.b bVar, androidx.media3.exoplayer.drm.a.C0185a c0185a) {
        this.f47059d = bVar;
        this.f47060e = c0185a;
        this.f47056a = new p(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00be A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:23:0x0043, B:25:0x0047, B:29:0x005d, B:32:0x0064, B:36:0x006c, B:41:0x00a5, B:64:0x011a, B:66:0x0123, B:43:0x00be, B:45:0x00c7, B:47:0x00cf, B:49:0x00e2, B:53:0x00eb, B:54:0x00f0, B:56:0x00f6, B:60:0x0104, B:62:0x0109, B:63:0x0117, B:46:0x00cd), top: B:71:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:23:0x0043, B:25:0x0047, B:29:0x005d, B:32:0x0064, B:36:0x006c, B:41:0x00a5, B:64:0x011a, B:66:0x0123, B:43:0x00be, B:45:0x00c7, B:47:0x00cf, B:49:0x00e2, B:53:0x00eb, B:54:0x00f0, B:56:0x00f6, B:60:0x0104, B:62:0x0109, B:63:0x0117, B:46:0x00cd), top: B:71:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:23:0x0043, B:25:0x0047, B:29:0x005d, B:32:0x0064, B:36:0x006c, B:41:0x00a5, B:64:0x011a, B:66:0x0123, B:43:0x00be, B:45:0x00c7, B:47:0x00cf, B:49:0x00e2, B:53:0x00eb, B:54:0x00f0, B:56:0x00f6, B:60:0x0104, B:62:0x0109, B:63:0x0117, B:46:0x00cd), top: B:71:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:23:0x0043, B:25:0x0047, B:29:0x005d, B:32:0x0064, B:36:0x006c, B:41:0x00a5, B:64:0x011a, B:66:0x0123, B:43:0x00be, B:45:0x00c7, B:47:0x00cf, B:49:0x00e2, B:53:0x00eb, B:54:0x00f0, B:56:0x00f6, B:60:0x0104, B:62:0x0109, B:63:0x0117, B:46:0x00cd), top: B:71:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:23:0x0043, B:25:0x0047, B:29:0x005d, B:32:0x0064, B:36:0x006c, B:41:0x00a5, B:64:0x011a, B:66:0x0123, B:43:0x00be, B:45:0x00c7, B:47:0x00cf, B:49:0x00e2, B:53:0x00eb, B:54:0x00f0, B:56:0x00f6, B:60:0x0104, B:62:0x0109, B:63:0x0117, B:46:0x00cd), top: B:71:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:23:0x0043, B:25:0x0047, B:29:0x005d, B:32:0x0064, B:36:0x006c, B:41:0x00a5, B:64:0x011a, B:66:0x0123, B:43:0x00be, B:45:0x00c7, B:47:0x00cf, B:49:0x00e2, B:53:0x00eb, B:54:0x00f0, B:56:0x00f6, B:60:0x0104, B:62:0x0109, B:63:0x0117, B:46:0x00cd), top: B:71:0x0043 }] */
    @Override // A1.K
    public final void b(long j, int i10, int i11, int i12, K.a aVar) {
        androidx.media3.exoplayer.drm.b bVar;
        f fVar;
        u<b> uVar;
        int i13;
        int i14;
        SparseArray<b> sparseArray;
        int iKeyAt;
        boolean z10;
        boolean z11;
        int i15 = i10 & 1;
        boolean z12 = i15 != 0;
        if (this.f47078x) {
            if (!z12) {
                return;
            } else {
                this.f47078x = false;
            }
        }
        if (this.f47054A) {
            if (j < this.f47074t) {
                return;
            }
            if (i15 == 0) {
                if (!this.f47055B) {
                    p114j1.k.f("Overriding unexpected non-sync sample for format: " + this.f47080z);
                    this.f47055B = true;
                }
                i10 |= 1;
            }
        }
        long j10 = (this.f47056a.f47049g - ((long) i11)) - ((long) i12);
        synchronized (this) {
            try {
                int i16 = this.f47070p;
                if (i16 > 0) {
                    int iJ = j(i16 - 1);
                    p241t7.b.e(this.f47065k[iJ] + ((long) this.f47066l[iJ]) <= j10);
                }
                this.f47077w = (536870912 & i10) != 0;
                this.f47076v = Math.max(this.f47076v, j);
                int iJ2 = j(this.f47070p);
                this.f47068n[iJ2] = j;
                this.f47065k[iJ2] = j10;
                this.f47066l[iJ2] = i11;
                this.f47067m[iJ2] = i10;
                this.f47069o[iJ2] = aVar;
                this.j[iJ2] = 0;
                if (this.f47058c.f47098b.size() == 0) {
                    n nVar = this.f47080z;
                    nVar.getClass();
                    bVar = this.f47059d;
                    if (bVar != null) {
                        bVar.getClass();
                        fVar = androidx.media3.exoplayer.drm.b.InterfaceC0187b.f18340d0;
                    } else {
                        fVar = androidx.media3.exoplayer.drm.b.InterfaceC0187b.f18340d0;
                    }
                    uVar = this.f47058c;
                    i13 = this.f47071q + this.f47070p;
                    b bVar2 = new b(nVar, fVar);
                    i14 = uVar.f47097a;
                    sparseArray = uVar.f47098b;
                    if (i14 == -1) {
                        if (sparseArray.size() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        p241t7.b.k(z11);
                        uVar.f47097a = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i13 >= iKeyAt) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        p241t7.b.e(z10);
                        if (iKeyAt == i13) {
                            uVar.f47099c.a(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i13, bVar2);
                } else {
                    SparseArray<b> sparseArray2 = this.f47058c.f47098b;
                    if (!sparseArray2.valueAt(sparseArray2.size() - 1).f47084a.equals(this.f47080z)) {
                        n nVar2 = this.f47080z;
                        nVar2.getClass();
                        bVar = this.f47059d;
                        if (bVar != null) {
                            bVar.getClass();
                            fVar = androidx.media3.exoplayer.drm.b.InterfaceC0187b.f18340d0;
                        } else {
                            fVar = androidx.media3.exoplayer.drm.b.InterfaceC0187b.f18340d0;
                        }
                        uVar = this.f47058c;
                        i13 = this.f47071q + this.f47070p;
                        b bVar3 = new b(nVar2, fVar);
                        i14 = uVar.f47097a;
                        sparseArray = uVar.f47098b;
                        if (i14 == -1) {
                            if (sparseArray.size() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            p241t7.b.k(z11);
                            uVar.f47097a = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i13 >= iKeyAt) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            p241t7.b.e(z10);
                            if (iKeyAt == i13) {
                                uVar.f47099c.a(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i13, bVar3);
                    }
                }
                int i17 = this.f47070p + 1;
                this.f47070p = i17;
                int i18 = this.f47064i;
                if (i17 == i18) {
                    int i19 = i18 + Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                    long[] jArr = new long[i19];
                    long[] jArr2 = new long[i19];
                    long[] jArr3 = new long[i19];
                    int[] iArr = new int[i19];
                    int[] iArr2 = new int[i19];
                    K.a[] aVarArr = new K.a[i19];
                    int i20 = this.f47072r;
                    int i21 = i18 - i20;
                    System.arraycopy(this.f47065k, i20, jArr2, 0, i21);
                    System.arraycopy(this.f47068n, this.f47072r, jArr3, 0, i21);
                    System.arraycopy(this.f47067m, this.f47072r, iArr, 0, i21);
                    System.arraycopy(this.f47066l, this.f47072r, iArr2, 0, i21);
                    System.arraycopy(this.f47069o, this.f47072r, aVarArr, 0, i21);
                    System.arraycopy(this.j, this.f47072r, jArr, 0, i21);
                    int i22 = this.f47072r;
                    System.arraycopy(this.f47065k, 0, jArr2, i21, i22);
                    System.arraycopy(this.f47068n, 0, jArr3, i21, i22);
                    System.arraycopy(this.f47067m, 0, iArr, i21, i22);
                    System.arraycopy(this.f47066l, 0, iArr2, i21, i22);
                    System.arraycopy(this.f47069o, 0, aVarArr, i21, i22);
                    System.arraycopy(this.j, 0, jArr, i21, i22);
                    this.f47065k = jArr2;
                    this.f47068n = jArr3;
                    this.f47067m = iArr;
                    this.f47066l = iArr2;
                    this.f47069o = aVarArr;
                    this.j = jArr;
                    this.f47072r = 0;
                    this.f47064i = i19;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A1.K
    public final void c(r rVar, int i10, int i11) {
        while (true) {
            p pVar = this.f47056a;
            if (i10 <= 0) {
                pVar.getClass();
                return;
            }
            int iB = pVar.b(i10);
            p.a aVar = pVar.f47048f;
            p272w1.a aVar2 = aVar.f47052c;
            rVar.f(aVar2.f47687a, ((int) (pVar.f47049g - aVar.f47050a)) + aVar2.f47688b, iB);
            i10 -= iB;
            long j = pVar.f47049g + ((long) iB);
            pVar.f47049g = j;
            p.a aVar3 = pVar.f47048f;
            if (j == aVar3.f47051b) {
                pVar.f47048f = aVar3.f47053d;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x001e, B:15:0x0035, B:19:0x004d, B:18:0x004b), top: B:29:0x0002 }] */
    @Override // A1.K
    public final void d(n nVar) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            try {
                this.f47079y = false;
                if (!Objects.equals(nVar, this.f47080z)) {
                    if (this.f47058c.f47098b.size() == 0) {
                        this.f47080z = nVar;
                    } else {
                        SparseArray<b> sparseArray = this.f47058c.f47098b;
                        if (sparseArray.valueAt(sparseArray.size() - 1).f47084a.equals(nVar)) {
                            SparseArray<b> sparseArray2 = this.f47058c.f47098b;
                            this.f47080z = sparseArray2.valueAt(sparseArray2.size() - 1).f47084a;
                        } else {
                            this.f47080z = nVar;
                        }
                    }
                    boolean z11 = this.f47054A;
                    n nVar2 = this.f47080z;
                    this.f47054A = z11 & t.a(nVar2.f35302n, nVar2.f35299k);
                    this.f47055B = false;
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        k kVar = this.f47061f;
        if (kVar == null || !z10) {
            return;
        }
        kVar.f18751r.post(kVar.f18749p);
    }

    @Override // A1.K
    public final int e(i iVar, int i10, boolean z10) throws IOException {
        p pVar = this.f47056a;
        int iB = pVar.b(i10);
        p.a aVar = pVar.f47048f;
        p272w1.a aVar2 = aVar.f47052c;
        int i11 = iVar.read(aVar2.f47687a, ((int) (pVar.f47049g - aVar.f47050a)) + aVar2.f47688b, iB);
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j = pVar.f47049g + ((long) i11);
        pVar.f47049g = j;
        p.a aVar3 = pVar.f47048f;
        if (j != aVar3.f47051b) {
            return i11;
        }
        pVar.f47048f = aVar3.f47053d;
        return i11;
    }

    public final long g(int i10) {
        long j = this.f47075u;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iJ = j(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.f47068n[iJ]);
                if ((this.f47067m[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
                if (iJ == -1) {
                    iJ = this.f47064i - 1;
                }
            }
        }
        this.f47075u = Math.max(j, jMax);
        this.f47070p -= i10;
        int i12 = this.f47071q + i10;
        this.f47071q = i12;
        int i13 = this.f47072r + i10;
        this.f47072r = i13;
        int i14 = this.f47064i;
        if (i13 >= i14) {
            this.f47072r = i13 - i14;
        }
        int i15 = this.f47073s - i10;
        this.f47073s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f47073s = 0;
        }
        while (true) {
            u<b> uVar = this.f47058c;
            SparseArray<b> sparseArray = uVar.f47098b;
            if (i16 >= sparseArray.size() - 1) {
                break;
            }
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            uVar.f47099c.a(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = uVar.f47097a;
            if (i18 > 0) {
                uVar.f47097a = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f47070p != 0) {
            return this.f47065k[this.f47072r];
        }
        int i19 = this.f47072r;
        if (i19 == 0) {
            i19 = this.f47064i;
        }
        int i20 = i19 - 1;
        return this.f47065k[i20] + ((long) this.f47066l[i20]);
    }

    public final void h() {
        long jG;
        p pVar = this.f47056a;
        synchronized (this) {
            int i10 = this.f47070p;
            jG = i10 == 0 ? -1L : g(i10);
        }
        pVar.a(jG);
    }

    public final int i(int i10, int i11, long j, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = this.f47068n[i10];
            if (j10 > j) {
                return i12;
            }
            if (!z10 || (this.f47067m[i10] & 1) != 0) {
                if (j10 == j) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f47064i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int j(int i10) {
        int i11 = this.f47072r + i10;
        int i12 = this.f47064i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized boolean k(boolean z10) {
        n nVar;
        int i10 = this.f47073s;
        boolean z11 = false;
        if (i10 != this.f47070p) {
            if (this.f47058c.a(this.f47071q + i10).f47084a != this.f47062g) {
                return true;
            }
            return l(j(this.f47073s));
        }
        if (z10 || this.f47077w || ((nVar = this.f47080z) != null && nVar != this.f47062g)) {
            z11 = true;
        }
        return z11;
    }

    public final boolean l(int i10) {
        DrmSession drmSession = this.f47063h;
        return drmSession == null || drmSession.getState() == 4 || ((this.f47067m[i10] & 1073741824) == 0 && this.f47063h.c());
    }

    public final void m(n nVar, Q q10) {
        n nVar2;
        n nVar3 = this.f47062g;
        boolean z10 = nVar3 == null;
        p078g1.k kVar = nVar3 == null ? null : nVar3.f35306r;
        this.f47062g = nVar;
        p078g1.k kVar2 = nVar.f35306r;
        androidx.media3.exoplayer.drm.b bVar = this.f47059d;
        if (bVar != null) {
            int iD = bVar.d(nVar);
            n.a aVarA = nVar.a();
            aVarA.f35326L = iD;
            nVar2 = new n(aVarA);
        } else {
            nVar2 = nVar;
        }
        q10.f18136b = nVar2;
        q10.f18135a = this.f47063h;
        if (bVar == null) {
            return;
        }
        if (z10 || !Objects.equals(kVar, kVar2)) {
            DrmSession drmSession = this.f47063h;
            androidx.media3.exoplayer.drm.a.C0185a c0185a = this.f47060e;
            DrmSession drmSessionE = bVar.e(c0185a, nVar);
            this.f47063h = drmSessionE;
            q10.f18135a = drmSessionE;
            if (drmSession != null) {
                drmSession.d(c0185a);
            }
        }
    }

    public final void n(boolean z10) {
        SparseArray<b> sparseArray;
        p pVar = this.f47056a;
        p.a aVar = pVar.f47046d;
        if (aVar.f47052c != null) {
            d dVar = pVar.f47043a;
            synchronized (dVar) {
                p.a aVar2 = aVar;
                while (aVar2 != null) {
                    try {
                        p272w1.a[] aVarArr = dVar.f47702f;
                        int i10 = dVar.f47701e;
                        dVar.f47701e = i10 + 1;
                        p272w1.a aVar3 = aVar2.f47052c;
                        aVar3.getClass();
                        aVarArr[i10] = aVar3;
                        dVar.f47700d--;
                        aVar2 = aVar2.f47053d;
                        if (aVar2 == null || aVar2.f47052c == null) {
                            aVar2 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                dVar.notifyAll();
            }
            aVar.f47052c = null;
            aVar.f47053d = null;
        }
        p.a aVar4 = pVar.f47046d;
        int i11 = pVar.f47044b;
        int i12 = 0;
        p241t7.b.k(aVar4.f47052c == null);
        aVar4.f47050a = 0L;
        aVar4.f47051b = i11;
        p.a aVar5 = pVar.f47046d;
        pVar.f47047e = aVar5;
        pVar.f47048f = aVar5;
        pVar.f47049g = 0L;
        pVar.f47043a.b();
        this.f47070p = 0;
        this.f47071q = 0;
        this.f47072r = 0;
        this.f47073s = 0;
        this.f47078x = true;
        this.f47074t = Long.MIN_VALUE;
        this.f47075u = Long.MIN_VALUE;
        this.f47076v = Long.MIN_VALUE;
        this.f47077w = false;
        u<b> uVar = this.f47058c;
        while (true) {
            sparseArray = uVar.f47098b;
            if (i12 >= sparseArray.size()) {
                break;
            }
            uVar.f47099c.a(sparseArray.valueAt(i12));
            i12++;
        }
        uVar.f47097a = -1;
        sparseArray.clear();
        if (z10) {
            this.f47080z = null;
            this.f47079y = true;
            this.f47054A = true;
        }
    }

    public final synchronized boolean o(long j, boolean z10) {
        int i10;
        synchronized (this) {
            this.f47073s = 0;
            p pVar = this.f47056a;
            pVar.f47047e = pVar.f47046d;
        }
        int iJ = j(0);
        int i11 = this.f47073s;
        int i12 = this.f47070p;
        if ((i11 != i12) && j >= this.f47068n[iJ] && (j <= this.f47076v || z10)) {
            if (this.f47054A) {
                int i13 = i12 - i11;
                i10 = 0;
                while (true) {
                    if (i10 >= i13) {
                        if (!z10) {
                            i13 = -1;
                        }
                        i10 = i13;
                        break;
                    }
                    if (this.f47068n[iJ] >= j) {
                        break;
                    }
                    iJ++;
                    if (iJ == this.f47064i) {
                        iJ = 0;
                    }
                    i10++;
                }
            } else {
                i10 = i(iJ, i12 - i11, j, true);
            }
            if (i10 == -1) {
                return false;
            }
            this.f47074t = j;
            this.f47073s += i10;
            return true;
        }
        return false;
    }
}
