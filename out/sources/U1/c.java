package U1;

import A1.C0568c;
import A1.C0572g;
import A1.C0574i;
import A1.E;
import A1.F;
import A1.J;
import A1.K;
import A1.p;
import A1.q;
import A1.r;
import A1.z;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.braze.support.BrazeLogger;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.t;
import p114j1.A;

/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final byte[] f6158J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final p078g1.n f6159K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6160A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f6161B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6162C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f6163D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f6164E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public r f6165F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public K[] f6166G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public K[] f6167H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f6168I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X1.l.a f6169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<p078g1.n> f6171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<b> f6172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p114j1.r f6173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p114j1.r f6174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p114j1.r f6175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f6176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p114j1.r f6177i;
    public final L1.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p114j1.r f6178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque<k1.b.a> f6179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque<a> f6180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p127k1.g f6181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImmutableList<J> f6182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p114j1.r f6187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f6188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f6190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f6191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f6192y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f6193z;

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6196c;

        public a(int i10, long j, boolean z10) {
            this.f6194a = j;
            this.f6195b = z10;
            this.f6196c = i10;
        }
    }

    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f6197a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o f6200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public U1.b f6201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6204h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6205i;
        public final String j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f6208m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f6198b = new n();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p114j1.r f6199c = new p114j1.r();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final p114j1.r f6206k = new p114j1.r(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final p114j1.r f6207l = new p114j1.r();

        public b(K k10, o oVar, U1.b bVar, String str) {
            this.f6197a = k10;
            this.f6200d = oVar;
            this.f6201e = bVar;
            this.j = str;
            e(oVar, bVar);
        }

        public final int a() {
            int i10;
            if (this.f6208m) {
                i10 = this.f6198b.j[this.f6202f] ? 1 : 0;
            } else {
                i10 = this.f6200d.f6295g[this.f6202f];
            }
            return b() != null ? i10 | 1073741824 : i10;
        }

        public final m b() {
            if (!this.f6208m) {
                return null;
            }
            n nVar = this.f6198b;
            U1.b bVar = nVar.f6273a;
            int i10 = A.f40996a;
            int i11 = bVar.f6154a;
            m mVar = nVar.f6284m;
            if (mVar == null) {
                mVar = this.f6200d.f6289a.f6267l[i11];
            }
            if (mVar == null || !mVar.f6268a) {
                return null;
            }
            return mVar;
        }

        public final boolean c() {
            this.f6202f++;
            if (!this.f6208m) {
                return false;
            }
            int i10 = this.f6203g + 1;
            this.f6203g = i10;
            int[] iArr = this.f6198b.f6279g;
            int i11 = this.f6204h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f6204h = i11 + 1;
            this.f6203g = 0;
            return false;
        }

        public final int d(int i10, int i11) {
            p114j1.r rVar;
            m mVarB = b();
            if (mVarB == null) {
                return 0;
            }
            n nVar = this.f6198b;
            int length = mVarB.f6271d;
            if (length != 0) {
                rVar = nVar.f6285n;
            } else {
                int i12 = A.f40996a;
                byte[] bArr = mVarB.f6272e;
                int length2 = bArr.length;
                p114j1.r rVar2 = this.f6207l;
                rVar2.E(length2, bArr);
                length = bArr.length;
                rVar = rVar2;
            }
            boolean z10 = nVar.f6282k && nVar.f6283l[this.f6202f];
            boolean z11 = z10 || i11 != 0;
            p114j1.r rVar3 = this.f6206k;
            rVar3.f41062a[0] = (byte) ((z11 ? 128 : 0) | length);
            rVar3.G(0);
            K k10 = this.f6197a;
            k10.c(rVar3, 1, 1);
            k10.c(rVar, length, 1);
            if (!z11) {
                return length + 1;
            }
            p114j1.r rVar4 = this.f6199c;
            if (!z10) {
                rVar4.D(8);
                byte[] bArr2 = rVar4.f41062a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) (i11 & 255);
                bArr2[4] = (byte) ((i10 >> 24) & 255);
                bArr2[5] = (byte) ((i10 >> 16) & 255);
                bArr2[6] = (byte) ((i10 >> 8) & 255);
                bArr2[7] = (byte) (i10 & 255);
                k10.c(rVar4, 8, 1);
                return length + 9;
            }
            p114j1.r rVar5 = nVar.f6285n;
            int iA = rVar5.A();
            rVar5.H(-2);
            int i13 = (iA * 6) + 2;
            if (i11 != 0) {
                rVar4.D(i13);
                byte[] bArr3 = rVar4.f41062a;
                rVar5.f(bArr3, 0, i13);
                int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
                bArr3[2] = (byte) ((i14 >> 8) & 255);
                bArr3[3] = (byte) (i14 & 255);
            } else {
                rVar4 = rVar5;
            }
            k10.c(rVar4, i13, 1);
            return length + 1 + i13;
        }

        public final void e(o oVar, U1.b bVar) {
            this.f6200d = oVar;
            this.f6201e = bVar;
            g1.n.a aVarA = oVar.f6289a.f6263g.a();
            aVarA.f35337l = t.m(this.j);
            this.f6197a.d(new p078g1.n(aVarA));
            f();
        }

        public final void f() {
            n nVar = this.f6198b;
            nVar.f6276d = 0;
            nVar.f6287p = 0L;
            nVar.f6288q = false;
            nVar.f6282k = false;
            nVar.f6286o = false;
            nVar.f6284m = null;
            this.f6202f = 0;
            this.f6204h = 0;
            this.f6203g = 0;
            this.f6205i = 0;
            this.f6208m = false;
        }
    }

    static {
        g1.n.a aVar = new g1.n.a();
        aVar.f35338m = t.m("application/x-emsg");
        f6159K = new p078g1.n(aVar);
    }

    public c(X1.l.a aVar, int i10) {
        ImmutableList immutableListK = ImmutableList.K();
        this.f6169a = aVar;
        this.f6170b = i10;
        this.f6171c = Collections.unmodifiableList(immutableListK);
        this.j = new L1.c();
        this.f6178k = new p114j1.r(16);
        this.f6173e = new p114j1.r(p127k1.e.f41399a);
        this.f6174f = new p114j1.r(6);
        this.f6175g = new p114j1.r();
        byte[] bArr = new byte[16];
        this.f6176h = bArr;
        this.f6177i = new p114j1.r(bArr);
        this.f6179l = new ArrayDeque<>();
        this.f6180m = new ArrayDeque<>();
        this.f6172d = new SparseArray<>();
        this.f6182o = ImmutableList.K();
        this.f6191x = -9223372036854775807L;
        this.f6190w = -9223372036854775807L;
        this.f6192y = -9223372036854775807L;
        this.f6165F = r.f552a0;
        this.f6166G = new K[0];
        this.f6167H = new K[0];
        this.f6181n = new p127k1.g(new C7.h(this));
    }

    public static p078g1.k c(ArrayList arrayList) {
        int i10;
        UUID[] uuidArr;
        int size = arrayList.size();
        int i11 = 0;
        ArrayList arrayList2 = null;
        while (i11 < size) {
            p127k1.b.C0471b c0471b = (p127k1.b.C0471b) arrayList.get(i11);
            if (c0471b.f41389a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c0471b.f41393b.f41062a;
                p114j1.r rVar = new p114j1.r(bArr);
                i.a aVar = null;
                if (rVar.f41064c < 32) {
                    i10 = i11;
                } else {
                    rVar.G(0);
                    int iA = rVar.a();
                    int iH = rVar.h();
                    if (iH != iA) {
                        p114j1.k.f("Advertised atom size (" + iH + ") does not match buffer size: " + iA);
                    } else {
                        int iH2 = rVar.h();
                        if (iH2 != 1886614376) {
                            com.google.gson.internal.b.e(iH2, "Atom type is not pssh: ");
                        } else {
                            int iC = U1.a.c(rVar.h());
                            if (iC > 1) {
                                com.google.gson.internal.b.e(iC, "Unsupported pssh version: ");
                            } else {
                                i10 = i11;
                                UUID uuid = new UUID(rVar.o(), rVar.o());
                                if (iC == 1) {
                                    int iY = rVar.y();
                                    uuidArr = new UUID[iY];
                                    int i12 = 0;
                                    while (i12 < iY) {
                                        uuidArr[i12] = new UUID(rVar.o(), rVar.o());
                                        i12++;
                                        iY = iY;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                int iY2 = rVar.y();
                                int iA2 = rVar.a();
                                if (iY2 != iA2) {
                                    p114j1.k.f("Atom data size (" + iY2 + ") does not match the bytes left: " + iA2);
                                } else {
                                    byte[] bArr2 = new byte[iY2];
                                    rVar.f(bArr2, 0, iY2);
                                    aVar = new i.a(uuid, iC, bArr2, uuidArr);
                                }
                            }
                        }
                    }
                    i10 = i11;
                }
                UUID uuid2 = aVar == null ? null : aVar.f6248a;
                if (uuid2 == null) {
                    p114j1.k.f("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new g1.k.b(uuid2, null, "video/mp4", bArr));
                }
            } else {
                i10 = i11;
            }
            i11 = i10 + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new p078g1.k(null, false, (g1.k.b[]) arrayList2.toArray(new g1.k.b[0]));
    }

    public static void d(p114j1.r rVar, int i10, n nVar) throws ParserException {
        rVar.G(i10 + 8);
        int iH = rVar.h();
        byte[] bArr = U1.a.f6123a;
        if ((iH & 1) != 0) {
            throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iH & 2) != 0;
        int iY = rVar.y();
        if (iY == 0) {
            Arrays.fill(nVar.f6283l, 0, nVar.f6277e, false);
            return;
        }
        if (iY != nVar.f6277e) {
            StringBuilder sbE = A8.f.e(iY, "Senc sample count ", " is different from fragment sample count");
            sbE.append(nVar.f6277e);
            throw ParserException.a(null, sbE.toString());
        }
        Arrays.fill(nVar.f6283l, 0, iY, z10);
        int iA = rVar.a();
        p114j1.r rVar2 = nVar.f6285n;
        rVar2.D(iA);
        nVar.f6282k = true;
        nVar.f6286o = true;
        rVar.f(rVar2.f41062a, 0, rVar2.f41064c);
        rVar2.G(0);
        nVar.f6286o = false;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:164:0x03c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x03da  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:173:0x03e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:175:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:180:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:181:0x0408  */
    /* JADX WARN: Code duplicated, block: B:184:0x0426  */
    /* JADX WARN: Code duplicated, block: B:185:0x0432  */
    /* JADX WARN: Code duplicated, block: B:191:0x0446  */
    /* JADX WARN: Code duplicated, block: B:310:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:345:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x045f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0282  */
    public final void e(long j) throws ParserException {
        c cVar;
        int i10;
        c cVar2;
        SparseArray<b> sparseArray;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        ArrayList arrayList3;
        boolean z11;
        p114j1.r rVar;
        boolean z12;
        boolean z13;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z14;
        int i17;
        long j10;
        int i18;
        int iH;
        int iH2;
        int iH3;
        int iH4;
        long jL;
        boolean z15;
        long[] jArr2;
        int i19;
        U1.b bVar;
        U1.b bVar2;
        ArrayList arrayList4;
        c cVar3 = this;
        int i20 = 1;
        while (true) {
            ArrayDeque<k1.b.a> arrayDeque = cVar3.f6179l;
            if (arrayDeque.isEmpty() || arrayDeque.peek().f41390b != j) {
                break;
            }
            k1.b.a aVarPop = arrayDeque.pop();
            int i21 = aVarPop.f41389a;
            SparseArray<b> sparseArray2 = cVar3.f6172d;
            ArrayList arrayList5 = aVarPop.f41391c;
            int i22 = cVar3.f6170b;
            int i23 = 12;
            if (i21 == 1836019574) {
                p078g1.k kVarC = c(arrayList5);
                k1.b.a aVarB = aVarPop.b(1836475768);
                aVarB.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList6 = aVarB.f41391c;
                int size = arrayList6.size();
                long jW = -9223372036854775807L;
                int i24 = 0;
                while (i24 < size) {
                    p127k1.b.C0471b c0471b = (p127k1.b.C0471b) arrayList6.get(i24);
                    int i25 = c0471b.f41389a;
                    p114j1.r rVar2 = c0471b.f41393b;
                    if (i25 == 1953654136) {
                        rVar2.G(i23);
                        arrayList4 = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(rVar2.h()), new U1.b(rVar2.h() - i20, rVar2.h(), rVar2.h(), rVar2.h()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (U1.b) pairCreate.second);
                    } else {
                        arrayList4 = arrayList6;
                        if (i25 == 1835362404) {
                            rVar2.G(8);
                            jW = U1.a.c(rVar2.h()) == 0 ? rVar2.w() : rVar2.z();
                        }
                    }
                    i24++;
                    i20 = 1;
                    arrayList6 = arrayList4;
                    i23 = 12;
                }
                ArrayList arrayListG = U1.a.g(aVarPop, new z(), jW, kVarC, (i22 & 16) != 0, false, new Q6.d(cVar3));
                int size2 = arrayListG.size();
                if (sparseArray2.size() == 0) {
                    String strG = I.b.g(arrayListG);
                    for (int i26 = 0; i26 < size2; i26++) {
                        o oVar = (o) arrayListG.get(i26);
                        l lVar = oVar.f6289a;
                        K kP = cVar3.f6165F.p(i26, lVar.f6258b);
                        kP.getClass();
                        int size3 = sparseArray3.size();
                        int i27 = lVar.f6257a;
                        if (size3 == 1) {
                            bVar2 = (U1.b) sparseArray3.valueAt(0);
                        } else {
                            bVar2 = (U1.b) sparseArray3.get(i27);
                            bVar2.getClass();
                        }
                        sparseArray2.put(i27, new b(kP, oVar, bVar2, strG));
                        cVar3.f6191x = Math.max(cVar3.f6191x, lVar.f6261e);
                    }
                    cVar3.f6165F.j();
                } else {
                    p241t7.b.k(sparseArray2.size() == size2);
                    for (int i28 = 0; i28 < size2; i28++) {
                        o oVar2 = (o) arrayListG.get(i28);
                        l lVar2 = oVar2.f6289a;
                        b bVar3 = sparseArray2.get(lVar2.f6257a);
                        if (sparseArray3.size() == 1) {
                            bVar = (U1.b) sparseArray3.valueAt(0);
                        } else {
                            bVar = (U1.b) sparseArray3.get(lVar2.f6257a);
                            bVar.getClass();
                        }
                        bVar3.e(oVar2, bVar);
                    }
                }
                cVar = cVar3;
                i10 = 1;
            } else {
                SparseArray<b> sparseArray4 = sparseArray2;
                if (i21 == 1836019558) {
                    ArrayList arrayList7 = aVarPop.f41392d;
                    int size4 = arrayList7.size();
                    int i29 = 0;
                    while (i29 < size4) {
                        k1.b.a aVar = (k1.b.a) arrayList7.get(i29);
                        if (aVar.f41389a == 1953653094) {
                            p127k1.b.C0471b c0471bC = aVar.c(1952868452);
                            c0471bC.getClass();
                            p114j1.r rVar3 = c0471bC.f41393b;
                            rVar3.G(8);
                            int iH5 = rVar3.h();
                            byte[] bArr = U1.a.f6123a;
                            b bVar4 = sparseArray4.get(rVar3.h());
                            if (bVar4 == null) {
                                bVar4 = null;
                            } else {
                                int i30 = iH5 & 1;
                                n nVar = bVar4.f6198b;
                                if (i30 != 0) {
                                    long jZ = rVar3.z();
                                    nVar.f6274b = jZ;
                                    nVar.f6275c = jZ;
                                }
                                U1.b bVar5 = bVar4.f6201e;
                                nVar.f6273a = new U1.b((iH5 & 2) != 0 ? rVar3.h() - 1 : bVar5.f6154a, (iH5 & 8) != 0 ? rVar3.h() : bVar5.f6155b, (iH5 & 16) != 0 ? rVar3.h() : bVar5.f6156c, (iH5 & 32) != 0 ? rVar3.h() : bVar5.f6157d);
                            }
                            if (bVar4 != null) {
                                n nVar2 = bVar4.f6198b;
                                long j11 = nVar2.f6287p;
                                boolean z16 = nVar2.f6288q;
                                bVar4.f();
                                bVar4.f6208m = true;
                                p127k1.b.C0471b c0471bC2 = aVar.c(1952867444);
                                if (c0471bC2 == null || (i22 & 2) != 0) {
                                    nVar2.f6287p = j11;
                                    nVar2.f6288q = z16;
                                } else {
                                    p114j1.r rVar4 = c0471bC2.f41393b;
                                    rVar4.G(8);
                                    nVar2.f6287p = U1.a.c(rVar4.h()) == 1 ? rVar4.z() : rVar4.w();
                                    nVar2.f6288q = true;
                                }
                                ArrayList arrayList8 = aVar.f41391c;
                                int size5 = arrayList8.size();
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    i14 = 1953658222;
                                    if (i31 >= size5) {
                                        break;
                                    }
                                    ArrayList arrayList9 = arrayList7;
                                    p127k1.b.C0471b c0471b2 = (p127k1.b.C0471b) arrayList8.get(i31);
                                    int i34 = size4;
                                    if (c0471b2.f41389a == 1953658222) {
                                        p114j1.r rVar5 = c0471b2.f41393b;
                                        rVar5.G(12);
                                        int iY = rVar5.y();
                                        if (iY > 0) {
                                            i33 += iY;
                                            i19 = 1;
                                            i32++;
                                        } else {
                                            i19 = 1;
                                        }
                                    } else {
                                        i19 = 1;
                                    }
                                    i31 += i19;
                                    size4 = i34;
                                    arrayList7 = arrayList9;
                                }
                                arrayList = arrayList7;
                                i11 = size4;
                                bVar4.f6204h = 0;
                                bVar4.f6203g = 0;
                                bVar4.f6202f = 0;
                                nVar2.f6276d = i32;
                                nVar2.f6277e = i33;
                                if (nVar2.f6279g.length < i32) {
                                    nVar2.f6278f = new long[i32];
                                    nVar2.f6279g = new int[i32];
                                }
                                if (nVar2.f6280h.length < i33) {
                                    int i35 = (i33 * R.styleable.AppCompatTheme_windowMinWidthMinor) / 100;
                                    nVar2.f6280h = new int[i35];
                                    nVar2.f6281i = new long[i35];
                                    nVar2.j = new boolean[i35];
                                    nVar2.f6283l = new boolean[i35];
                                }
                                int i36 = 0;
                                int i37 = 0;
                                int i38 = 0;
                                while (true) {
                                    long j12 = 0;
                                    if (i36 >= size5) {
                                        sparseArray = sparseArray4;
                                        ArrayList arrayList10 = arrayList8;
                                        k1.b.a aVar2 = aVar;
                                        arrayList2 = arrayList5;
                                        i12 = i29;
                                        i13 = i22;
                                        o oVar3 = bVar4.f6200d;
                                        U1.b bVar6 = nVar2.f6273a;
                                        bVar6.getClass();
                                        m mVar = oVar3.f6289a.f6267l[bVar6.f6154a];
                                        p127k1.b.C0471b c0471bC3 = aVar2.c(1935763834);
                                        if (c0471bC3 != null) {
                                            mVar.getClass();
                                            p114j1.r rVar6 = c0471bC3.f41393b;
                                            rVar6.G(8);
                                            int iH6 = rVar6.h();
                                            byte[] bArr2 = U1.a.f6123a;
                                            if ((iH6 & 1) == 1) {
                                                rVar6.H(8);
                                            }
                                            int iU = rVar6.u();
                                            int iY2 = rVar6.y();
                                            if (iY2 > nVar2.f6277e) {
                                                StringBuilder sbE = A8.f.e(iY2, "Saiz sample count ", " is greater than fragment sample count");
                                                sbE.append(nVar2.f6277e);
                                                throw ParserException.a(null, sbE.toString());
                                            }
                                            int i39 = mVar.f6271d;
                                            if (iU == 0) {
                                                boolean[] zArr2 = nVar2.f6283l;
                                                i15 = 0;
                                                for (int i40 = 0; i40 < iY2; i40++) {
                                                    int iU2 = rVar6.u();
                                                    i15 += iU2;
                                                    zArr2[i40] = iU2 > i39;
                                                }
                                                z10 = false;
                                            } else {
                                                boolean z17 = iU > i39;
                                                i15 = iU * iY2;
                                                z10 = false;
                                                Arrays.fill(nVar2.f6283l, 0, iY2, z17);
                                            }
                                            Arrays.fill(nVar2.f6283l, iY2, nVar2.f6277e, z10);
                                            if (i15 > 0) {
                                                nVar2.f6285n.D(i15);
                                                nVar2.f6282k = true;
                                                nVar2.f6286o = true;
                                            }
                                        }
                                        p127k1.b.C0471b c0471bC4 = aVar2.c(1935763823);
                                        if (c0471bC4 != null) {
                                            p114j1.r rVar7 = c0471bC4.f41393b;
                                            rVar7.G(8);
                                            int iH7 = rVar7.h();
                                            byte[] bArr3 = U1.a.f6123a;
                                            if ((iH7 & 1) == 1) {
                                                rVar7.H(8);
                                            }
                                            int iY3 = rVar7.y();
                                            if (iY3 != 1) {
                                                throw ParserException.a(null, "Unexpected saio entry count: " + iY3);
                                            }
                                            nVar2.f6275c += U1.a.c(iH7) == 0 ? rVar7.w() : rVar7.z();
                                        }
                                        byte[] bArr4 = null;
                                        p127k1.b.C0471b c0471bC5 = aVar2.c(1936027235);
                                        if (c0471bC5 != null) {
                                            d(c0471bC5.f41393b, 0, nVar2);
                                        }
                                        String str = mVar != null ? mVar.f6269b : null;
                                        p114j1.r rVar8 = null;
                                        p114j1.r rVar9 = null;
                                        int i41 = 0;
                                        while (i41 < arrayList10.size()) {
                                            ArrayList arrayList11 = arrayList10;
                                            p127k1.b.C0471b c0471b3 = (p127k1.b.C0471b) arrayList11.get(i41);
                                            p114j1.r rVar10 = c0471b3.f41393b;
                                            int i42 = c0471b3.f41389a;
                                            if (i42 == 1935828848) {
                                                rVar10.G(12);
                                                if (rVar10.h() == 1936025959) {
                                                    rVar8 = rVar10;
                                                }
                                            } else if (i42 == 1936158820) {
                                                rVar10.G(12);
                                                if (rVar10.h() == 1936025959) {
                                                    rVar9 = rVar10;
                                                }
                                            }
                                            i41++;
                                            arrayList10 = arrayList11;
                                        }
                                        ArrayList arrayList12 = arrayList10;
                                        if (rVar8 != null && rVar9 != null) {
                                            rVar8.G(8);
                                            int iC = U1.a.c(rVar8.h());
                                            rVar8.H(4);
                                            if (iC == 1) {
                                                rVar8.H(4);
                                            }
                                            if (rVar8.h() != 1) {
                                                throw ParserException.b("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            rVar9.G(8);
                                            int iC2 = U1.a.c(rVar9.h());
                                            rVar9.H(4);
                                            if (iC2 == 1) {
                                                if (rVar9.w() == 0) {
                                                    throw ParserException.b("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iC2 >= 2) {
                                                rVar9.H(4);
                                            }
                                            if (rVar9.w() != 1) {
                                                throw ParserException.b("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            rVar9.H(1);
                                            int iU3 = rVar9.u();
                                            int i43 = (iU3 & 240) >> 4;
                                            int i44 = iU3 & 15;
                                            boolean z18 = rVar9.u() == 1;
                                            if (z18) {
                                                int iU4 = rVar9.u();
                                                byte[] bArr5 = new byte[16];
                                                rVar9.f(bArr5, 0, 16);
                                                if (iU4 == 0) {
                                                    int iU5 = rVar9.u();
                                                    bArr4 = new byte[iU5];
                                                    rVar9.f(bArr4, 0, iU5);
                                                }
                                                nVar2.f6282k = true;
                                                nVar2.f6284m = new m(z18, str, iU4, bArr5, i43, i44, bArr4);
                                            }
                                        }
                                        int size6 = arrayList12.size();
                                        for (int i45 = 0; i45 < size6; i45++) {
                                            p127k1.b.C0471b c0471b4 = (p127k1.b.C0471b) arrayList12.get(i45);
                                            if (c0471b4.f41389a == 1970628964) {
                                                p114j1.r rVar11 = c0471b4.f41393b;
                                                rVar11.G(8);
                                                byte[] bArr6 = this.f6176h;
                                                rVar11.f(bArr6, 0, 16);
                                                if (Arrays.equals(bArr6, f6158J)) {
                                                    d(rVar11, 16, nVar2);
                                                }
                                            }
                                        }
                                        cVar2 = this;
                                        break;
                                    }
                                    p127k1.b.C0471b c0471b5 = (p127k1.b.C0471b) arrayList8.get(i36);
                                    if (c0471b5.f41389a == i14) {
                                        int i46 = i37 + 1;
                                        p114j1.r rVar12 = c0471b5.f41393b;
                                        rVar12.G(8);
                                        int iH8 = rVar12.h();
                                        byte[] bArr7 = U1.a.f6123a;
                                        o oVar4 = bVar4.f6200d;
                                        U1.b bVar7 = nVar2.f6273a;
                                        int i47 = A.f40996a;
                                        nVar2.f6279g[i37] = rVar12.y();
                                        long[] jArr3 = nVar2.f6278f;
                                        long j13 = nVar2.f6274b;
                                        jArr3[i37] = j13;
                                        if ((iH8 & 1) != 0) {
                                            jArr3[i37] = j13 + ((long) rVar12.h());
                                        }
                                        boolean z19 = (iH8 & 4) != 0;
                                        int iH9 = bVar7.f6157d;
                                        if (z19) {
                                            iH9 = rVar12.h();
                                        }
                                        boolean z20 = (iH8 & 256) != 0;
                                        boolean z21 = (iH8 & 512) != 0;
                                        boolean z22 = (iH8 & 1024) != 0;
                                        boolean z23 = (iH8 & 2048) != 0;
                                        l lVar3 = oVar4.f6289a;
                                        long[] jArr4 = lVar3.f6265i;
                                        int i48 = iH9;
                                        if (jArr4 != null) {
                                            arrayList3 = arrayList8;
                                            if (jArr4.length == 1 && (jArr2 = lVar3.j) != null) {
                                                long j14 = jArr4[0];
                                                if (j14 == 0) {
                                                    z11 = z21;
                                                    rVar = rVar12;
                                                    z12 = z22;
                                                    z13 = z23;
                                                } else {
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    z12 = z22;
                                                    z13 = z23;
                                                    long jL2 = A.L(j14, 1000000L, lVar3.f6260d, roundingMode);
                                                    z11 = z21;
                                                    rVar = rVar12;
                                                    if (jL2 + A.L(jArr2[0], 1000000L, lVar3.f6259c, roundingMode) >= lVar3.f6261e) {
                                                    }
                                                }
                                                j12 = jArr2[0];
                                            }
                                            iArr = nVar2.f6280h;
                                            jArr = nVar2.f6281i;
                                            zArr = nVar2.j;
                                            if (lVar3.f6258b == 2 || (i22 & 1) == 0) {
                                                z14 = false;
                                            } else {
                                                z14 = true;
                                            }
                                            i17 = i38 + nVar2.f6279g[i37];
                                            boolean z24 = z14;
                                            j10 = nVar2.f6287p;
                                            i18 = i38;
                                            while (i18 < i17) {
                                                if (z20) {
                                                    iH = rVar.h();
                                                } else {
                                                    iH = bVar7.f6155b;
                                                }
                                                if (iH >= 0) {
                                                    throw ParserException.a(null, "Unexpected negative value: " + iH);
                                                }
                                                if (z11) {
                                                    iH2 = rVar.h();
                                                } else {
                                                    iH2 = bVar7.f6156c;
                                                }
                                                if (iH2 >= 0) {
                                                    throw ParserException.a(null, "Unexpected negative value: " + iH2);
                                                }
                                                if (z12) {
                                                    iH3 = rVar.h();
                                                } else if (i18 == 0 || !z19) {
                                                    iH3 = bVar7.f6157d;
                                                } else {
                                                    iH3 = i48;
                                                }
                                                if (z13) {
                                                    iH4 = rVar.h();
                                                } else {
                                                    iH4 = 0;
                                                }
                                                jL = A.L((((long) iH4) + j10) - j12, 1000000L, lVar3.f6259c, RoundingMode.DOWN);
                                                jArr[i18] = jL;
                                                if (!nVar2.f6288q) {
                                                    jArr[i18] = jL + bVar4.f6200d.f6296h;
                                                }
                                                iArr[i18] = iH2;
                                                if (((iH3 >> 16) & 1) == 0 || (z24 && i18 != 0)) {
                                                    z15 = false;
                                                } else {
                                                    z15 = true;
                                                }
                                                zArr[i18] = z15;
                                                j10 += (long) iH;
                                                i18++;
                                                i17 = i17;
                                                z20 = z20;
                                                i36 = i36;
                                                z19 = z19;
                                                z12 = z12;
                                                lVar3 = lVar3;
                                                z13 = z13;
                                            }
                                            i16 = i36;
                                            int i49 = i17;
                                            nVar2.f6287p = j10;
                                            i37 = i46;
                                            i38 = i49;
                                        } else {
                                            arrayList3 = arrayList8;
                                        }
                                        z11 = z21;
                                        rVar = rVar12;
                                        z12 = z22;
                                        z13 = z23;
                                        iArr = nVar2.f6280h;
                                        jArr = nVar2.f6281i;
                                        zArr = nVar2.j;
                                        if (lVar3.f6258b == 2) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        i17 = i38 + nVar2.f6279g[i37];
                                        boolean z25 = z14;
                                        j10 = nVar2.f6287p;
                                        i18 = i38;
                                        while (i18 < i17) {
                                            if (z20) {
                                                iH = rVar.h();
                                            } else {
                                                iH = bVar7.f6155b;
                                            }
                                            if (iH >= 0) {
                                                throw ParserException.a(null, "Unexpected negative value: " + iH);
                                            }
                                            if (z11) {
                                                iH2 = rVar.h();
                                            } else {
                                                iH2 = bVar7.f6156c;
                                            }
                                            if (iH2 >= 0) {
                                                throw ParserException.a(null, "Unexpected negative value: " + iH2);
                                            }
                                            if (z12) {
                                                iH3 = rVar.h();
                                            } else if (i18 == 0) {
                                                iH3 = bVar7.f6157d;
                                            } else {
                                                iH3 = bVar7.f6157d;
                                            }
                                            if (z13) {
                                                iH4 = rVar.h();
                                            } else {
                                                iH4 = 0;
                                            }
                                            jL = A.L((((long) iH4) + j10) - j12, 1000000L, lVar3.f6259c, RoundingMode.DOWN);
                                            jArr[i18] = jL;
                                            if (!nVar2.f6288q) {
                                                jArr[i18] = jL + bVar4.f6200d.f6296h;
                                            }
                                            iArr[i18] = iH2;
                                            if (((iH3 >> 16) & 1) == 0) {
                                                z15 = false;
                                            } else {
                                                z15 = false;
                                            }
                                            zArr[i18] = z15;
                                            j10 += (long) iH;
                                            i18++;
                                            i17 = i17;
                                            z20 = z20;
                                            i36 = i36;
                                            z19 = z19;
                                            z12 = z12;
                                            lVar3 = lVar3;
                                            z13 = z13;
                                        }
                                        i16 = i36;
                                        int i410 = i17;
                                        nVar2.f6287p = j10;
                                        i37 = i46;
                                        i38 = i410;
                                    } else {
                                        i16 = i36;
                                        arrayList3 = arrayList8;
                                        aVar = aVar;
                                    }
                                    i36 = i16 + 1;
                                    size5 = size5;
                                    sparseArray4 = sparseArray4;
                                    arrayList5 = arrayList5;
                                    i29 = i29;
                                    aVar = aVar;
                                    arrayList8 = arrayList3;
                                    i22 = i22;
                                    i14 = 1953658222;
                                }
                            } else {
                                cVar2 = cVar3;
                                sparseArray = sparseArray4;
                                arrayList = arrayList7;
                                i11 = size4;
                                arrayList2 = arrayList5;
                                i12 = i29;
                                i13 = i22;
                            }
                        } else {
                            cVar2 = cVar3;
                            sparseArray = sparseArray4;
                            arrayList = arrayList7;
                            i11 = size4;
                            arrayList2 = arrayList5;
                            i12 = i29;
                            i13 = i22;
                        }
                        i29 = i12 + 1;
                        cVar3 = cVar2;
                        size4 = i11;
                        arrayList7 = arrayList;
                        sparseArray4 = sparseArray;
                        arrayList5 = arrayList2;
                        i22 = i13;
                    }
                    cVar = cVar3;
                    SparseArray<b> sparseArray5 = sparseArray4;
                    p078g1.k kVarC2 = c(arrayList5);
                    if (kVarC2 != null) {
                        int size7 = sparseArray5.size();
                        int i50 = 0;
                        while (i50 < size7) {
                            SparseArray<b> sparseArray6 = sparseArray5;
                            b bVarValueAt = sparseArray6.valueAt(i50);
                            o oVar5 = bVarValueAt.f6200d;
                            U1.b bVar8 = bVarValueAt.f6198b.f6273a;
                            int i51 = A.f40996a;
                            m mVar2 = oVar5.f6289a.f6267l[bVar8.f6154a];
                            p078g1.k kVarA = kVarC2.a(mVar2 != null ? mVar2.f6269b : null);
                            g1.n.a aVarA = bVarValueAt.f6200d.f6289a.f6263g.a();
                            aVarA.f35337l = t.m(bVarValueAt.j);
                            aVarA.f35342q = kVarA;
                            bVarValueAt.f6197a.d(new p078g1.n(aVarA));
                            i50++;
                            sparseArray5 = sparseArray6;
                        }
                    }
                    SparseArray<b> sparseArray7 = sparseArray5;
                    if (cVar.f6190w != -9223372036854775807L) {
                        int size8 = sparseArray7.size();
                        for (int i52 = 0; i52 < size8; i52++) {
                            b bVarValueAt2 = sparseArray7.valueAt(i52);
                            long j15 = cVar.f6190w;
                            int i53 = bVarValueAt2.f6202f;
                            while (true) {
                                n nVar3 = bVarValueAt2.f6198b;
                                if (i53 >= nVar3.f6277e || nVar3.f6281i[i53] > j15) {
                                    break;
                                }
                                if (nVar3.j[i53]) {
                                    bVarValueAt2.f6205i = i53;
                                }
                                i53++;
                            }
                        }
                        i10 = 1;
                        cVar.f6190w = -9223372036854775807L;
                    } else {
                        i10 = 1;
                    }
                } else {
                    cVar = cVar3;
                    i10 = 1;
                    if (!arrayDeque.isEmpty()) {
                        arrayDeque.peek().f41392d.add(aVarPop);
                    }
                }
            }
            cVar3 = cVar;
            i20 = i10;
        }
        c cVar4 = cVar3;
        cVar4.f6183p = 0;
        cVar4.f6186s = 0;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        SparseArray<b> sparseArray = this.f6172d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.valueAt(i10).f();
        }
        this.f6180m.clear();
        this.f6189v = 0;
        this.f6181n.f41470d.clear();
        this.f6190w = j10;
        this.f6179l.clear();
        this.f6183p = 0;
        this.f6186s = 0;
    }

    @Override // A1.p
    public final List g() {
        return this.f6182o;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:128:0x0252  */
    /* JADX WARN: Code duplicated, block: B:132:0x0262  */
    /* JADX WARN: Code duplicated, block: B:417:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        int i10;
        p127k1.g gVar;
        ArrayDeque<a> arrayDeque;
        String strP;
        long jL;
        long jL2;
        long j;
        long jW;
        String strP2;
        long jZ;
        long jZ2;
        b bVar;
        long j10;
        l lVar;
        int i11;
        int iH;
        String str;
        char c10;
        long j11;
        int iF;
        int i12;
        loop0: while (true) {
            i10 = 1;
            while (true) {
                int i13 = this.f6183p;
                ArrayDeque<k1.b.a> arrayDeque2 = this.f6179l;
                SparseArray<b> sparseArray = this.f6172d;
                gVar = this.f6181n;
                if (i13 != 0) {
                    arrayDeque = this.f6180m;
                    if (i13 == i10) {
                        int i14 = (int) (this.f6185r - ((long) this.f6186s));
                        p114j1.r rVar = this.f6187t;
                        if (rVar != null) {
                            ((C0574i) qVar).a(rVar.f41062a, 8, i14, false);
                            int i15 = this.f6184q;
                            p127k1.b.C0471b c0471b = new p127k1.b.C0471b(i15, rVar);
                            long j12 = ((C0574i) qVar).f523d;
                            if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.peek().f41391c.add(c0471b);
                            } else if (i15 == 1936286840) {
                                rVar.G(8);
                                int iC = U1.a.c(rVar.h());
                                rVar.H(4);
                                long jW2 = rVar.w();
                                if (iC == 0) {
                                    jZ = rVar.w();
                                    jZ2 = rVar.w();
                                } else {
                                    jZ = rVar.z();
                                    jZ2 = rVar.z();
                                }
                                long j13 = jZ2 + j12;
                                int i16 = A.f40996a;
                                long jL3 = A.L(jZ, 1000000L, jW2, RoundingMode.DOWN);
                                rVar.H(2);
                                int iA = rVar.A();
                                int[] iArr = new int[iA];
                                long[] jArr = new long[iA];
                                long[] jArr2 = new long[iA];
                                long[] jArr3 = new long[iA];
                                long jL4 = jL3;
                                long j14 = j13;
                                long j15 = jZ;
                                int i17 = 0;
                                while (i17 < iA) {
                                    int iH2 = rVar.h();
                                    if ((iH2 & Integer.MIN_VALUE) != 0) {
                                        throw ParserException.a(null, "Unhandled indirect reference");
                                    }
                                    long jW3 = rVar.w();
                                    iArr[i17] = iH2 & BrazeLogger.SUPPRESS;
                                    jArr[i17] = j14;
                                    jArr3[i17] = jL4;
                                    j15 += jW3;
                                    jL4 = A.L(j15, 1000000L, jW2, RoundingMode.DOWN);
                                    jArr2[i17] = jL4 - jArr3[i17];
                                    rVar.H(4);
                                    j14 += (long) iArr[i17];
                                    i17++;
                                    jW2 = jW2;
                                }
                                Pair pairCreate = Pair.create(Long.valueOf(jL3), new C0572g(iArr, jArr, jArr2, jArr3));
                                this.f6192y = ((Long) pairCreate.first).longValue();
                                this.f6165F.g((F) pairCreate.second);
                                this.f6168I = true;
                            } else if (i15 == 1701671783 && this.f6166G.length != 0) {
                                rVar.G(8);
                                int iC2 = U1.a.c(rVar.h());
                                if (iC2 == 0) {
                                    strP = rVar.p();
                                    strP.getClass();
                                    String strP3 = rVar.p();
                                    strP3.getClass();
                                    long jW4 = rVar.w();
                                    long jW5 = rVar.w();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    jL = A.L(jW5, 1000000L, jW4, roundingMode);
                                    long j16 = this.f6192y;
                                    long j17 = j16 != -9223372036854775807L ? j16 + jL : -9223372036854775807L;
                                    jL2 = A.L(rVar.w(), 1000L, jW4, roundingMode);
                                    j = j17;
                                    jW = rVar.w();
                                    strP2 = strP3;
                                } else if (iC2 != 1) {
                                    com.google.gson.internal.b.e(iC2, "Skipping unsupported emsg version: ");
                                } else {
                                    long jW6 = rVar.w();
                                    long jZ3 = rVar.z();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    long jL5 = A.L(jZ3, 1000000L, jW6, roundingMode2);
                                    jL2 = A.L(rVar.w(), 1000L, jW6, roundingMode2);
                                    jW = rVar.w();
                                    strP = rVar.p();
                                    strP.getClass();
                                    strP2 = rVar.p();
                                    strP2.getClass();
                                    jL = -9223372036854775807L;
                                    j = jL5;
                                }
                                byte[] bArr = new byte[rVar.a()];
                                rVar.f(bArr, 0, rVar.a());
                                L1.c cVar = this.j;
                                ByteArrayOutputStream byteArrayOutputStream = cVar.f4432a;
                                byteArrayOutputStream.reset();
                                DataOutputStream dataOutputStream = cVar.f4433b;
                                try {
                                    dataOutputStream.writeBytes(strP);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeBytes(strP2);
                                    dataOutputStream.writeByte(0);
                                    dataOutputStream.writeLong(jL2);
                                    dataOutputStream.writeLong(jW);
                                    dataOutputStream.write(bArr);
                                    dataOutputStream.flush();
                                    p114j1.r rVar2 = new p114j1.r(byteArrayOutputStream.toByteArray());
                                    int iA2 = rVar2.a();
                                    for (K k10 : this.f6166G) {
                                        rVar2.G(0);
                                        k10.a(iA2, rVar2);
                                    }
                                    long j18 = j;
                                    if (j18 == -9223372036854775807L) {
                                        arrayDeque.addLast(new a(iA2, jL, true));
                                        this.f6189v += iA2;
                                    } else if (arrayDeque.isEmpty()) {
                                        for (K k11 : this.f6166G) {
                                            k11.b(j18, 1, iA2, 0, null);
                                        }
                                    } else {
                                        arrayDeque.addLast(new a(iA2, j18, false));
                                        this.f6189v += iA2;
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            }
                        } else {
                            ((C0574i) qVar).i(i14);
                        }
                        e(((C0574i) qVar).f523d);
                        break;
                    }
                    long j19 = Long.MAX_VALUE;
                    if (i13 == 2) {
                        int size = sparseArray.size();
                        b bVarValueAt = null;
                        for (int i18 = 0; i18 < size; i18++) {
                            n nVar = sparseArray.valueAt(i18).f6198b;
                            if (nVar.f6286o) {
                                long j20 = nVar.f6275c;
                                if (j20 < j19) {
                                    bVarValueAt = sparseArray.valueAt(i18);
                                    j19 = j20;
                                }
                            }
                        }
                        if (bVarValueAt == null) {
                            this.f6183p = 3;
                            break;
                        }
                        int i19 = (int) (j19 - ((C0574i) qVar).f523d);
                        if (i19 < 0) {
                            throw ParserException.a(null, "Offset to encryption data was negative.");
                        }
                        C0574i c0574i = (C0574i) qVar;
                        c0574i.i(i19);
                        n nVar2 = bVarValueAt.f6198b;
                        p114j1.r rVar3 = nVar2.f6285n;
                        c0574i.a(rVar3.f41062a, 0, rVar3.f41064c, false);
                        rVar3.G(0);
                        nVar2.f6286o = false;
                        break;
                    }
                    bVar = this.f6193z;
                    if (bVar != null) {
                        break loop0;
                    }
                    int size2 = sparseArray.size();
                    long j21 = Long.MAX_VALUE;
                    b bVar2 = null;
                    for (int i20 = 0; i20 < size2; i20 += i10) {
                        b bVarValueAt2 = sparseArray.valueAt(i20);
                        boolean z10 = bVarValueAt2.f6208m;
                        if (z10 || bVarValueAt2.f6202f != bVarValueAt2.f6200d.f6290b) {
                            n nVar3 = bVarValueAt2.f6198b;
                            if (!z10 || bVarValueAt2.f6204h != nVar3.f6276d) {
                                long j22 = !z10 ? bVarValueAt2.f6200d.f6291c[bVarValueAt2.f6202f] : nVar3.f6278f[bVarValueAt2.f6204h];
                                if (j22 < j21) {
                                    bVar2 = bVarValueAt2;
                                    j21 = j22;
                                }
                            }
                        }
                    }
                    if (bVar2 != null) {
                        int i21 = (int) ((!bVar2.f6208m ? bVar2.f6200d.f6291c[bVar2.f6202f] : bVar2.f6198b.f6278f[bVar2.f6204h]) - ((C0574i) qVar).f523d);
                        if (i21 < 0) {
                            p114j1.k.f("Ignoring negative offset to sample data.");
                            i21 = 0;
                        }
                        ((C0574i) qVar).i(i21);
                        this.f6193z = bVar2;
                        bVar = bVar2;
                        break loop0;
                    }
                    int i22 = (int) (this.f6188u - ((C0574i) qVar).f523d);
                    if (i22 < 0) {
                        throw ParserException.a(null, "Offset to end of mdat was negative.");
                    }
                    ((C0574i) qVar).i(i22);
                    this.f6183p = 0;
                    this.f6186s = 0;
                } else {
                    int i23 = this.f6186s;
                    p114j1.r rVar4 = this.f6178k;
                    if (i23 == 0) {
                        if (!((C0574i) qVar).a(rVar4.f41062a, 0, 8, true)) {
                            gVar.b(0);
                            return -1;
                        }
                        this.f6186s = 8;
                        rVar4.G(0);
                        this.f6185r = rVar4.w();
                        this.f6184q = rVar4.h();
                    }
                    long j23 = this.f6185r;
                    if (j23 == 1) {
                        ((C0574i) qVar).a(rVar4.f41062a, 8, 8, false);
                        this.f6186s += 8;
                        this.f6185r = rVar4.z();
                    } else if (j23 == 0) {
                        long j24 = ((C0574i) qVar).f522c;
                        if (j24 == -1 && !arrayDeque2.isEmpty()) {
                            j24 = arrayDeque2.peek().f41390b;
                        }
                        if (j24 != -1) {
                            this.f6185r = (j24 - ((C0574i) qVar).f523d) + ((long) this.f6186s);
                        }
                    }
                    long j25 = this.f6185r;
                    int i24 = this.f6186s;
                    if (j25 < i24) {
                        throw ParserException.b("Atom size less than header length (unsupported).");
                    }
                    long j26 = ((C0574i) qVar).f523d - ((long) i24);
                    int i25 = this.f6184q;
                    if ((i25 == 1836019558 || i25 == 1835295092) && !this.f6168I) {
                        this.f6165F.g(new F.b(this.f6191x, j26));
                        this.f6168I = true;
                    }
                    if (this.f6184q == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i26 = 0; i26 < size3; i26++) {
                            n nVar4 = sparseArray.valueAt(i26).f6198b;
                            nVar4.getClass();
                            nVar4.f6275c = j26;
                            nVar4.f6274b = j26;
                        }
                    }
                    int i27 = this.f6184q;
                    if (i27 == 1835295092) {
                        this.f6193z = null;
                        this.f6188u = j26 + this.f6185r;
                        this.f6183p = 2;
                        i12 = 1;
                    } else if (i27 == 1836019574 || i27 == 1953653099 || i27 == 1835297121 || i27 == 1835626086 || i27 == 1937007212 || i27 == 1836019558 || i27 == 1953653094 || i27 == 1836475768 || i27 == 1701082227) {
                        i12 = 1;
                        long j27 = (((C0574i) qVar).f523d + this.f6185r) - 8;
                        arrayDeque2.push(new k1.b.a(i27, j27));
                        if (this.f6185r == this.f6186s) {
                            e(j27);
                        } else {
                            this.f6183p = 0;
                            this.f6186s = 0;
                        }
                    } else if (i27 == 1751411826 || i27 == 1835296868 || i27 == 1836476516 || i27 == 1936286840 || i27 == 1937011556 || i27 == 1937011827 || i27 == 1668576371 || i27 == 1937011555 || i27 == 1937011578 || i27 == 1937013298 || i27 == 1937007471 || i27 == 1668232756 || i27 == 1937011571 || i27 == 1952867444 || i27 == 1952868452 || i27 == 1953196132 || i27 == 1953654136 || i27 == 1953658222 || i27 == 1886614376 || i27 == 1935763834 || i27 == 1935763823 || i27 == 1936027235 || i27 == 1970628964 || i27 == 1935828848 || i27 == 1936158820 || i27 == 1701606260 || i27 == 1835362404 || i27 == 1701671783) {
                        if (this.f6186s != 8) {
                            throw ParserException.b("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f6185r > 2147483647L) {
                            throw ParserException.b("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        p114j1.r rVar5 = new p114j1.r((int) this.f6185r);
                        System.arraycopy(rVar4.f41062a, 0, rVar5.f41062a, 0, 8);
                        this.f6187t = rVar5;
                        i12 = 1;
                        this.f6183p = 1;
                    } else {
                        if (this.f6185r > 2147483647L) {
                            throw ParserException.b("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f6187t = null;
                        this.f6183p = 1;
                        i12 = 1;
                    }
                    i10 = i12;
                }
            }
        }
        int i28 = this.f6183p;
        K k12 = bVar.f6197a;
        char c11 = 6;
        String str2 = "video/avc";
        n nVar5 = bVar.f6198b;
        if (i28 == 3) {
            this.f6160A = !bVar.f6208m ? bVar.f6200d.f6292d[bVar.f6202f] : nVar5.f6280h[bVar.f6202f];
            p078g1.n nVar6 = bVar.f6200d.f6289a.f6263g;
            boolean zEquals = Objects.equals(nVar6.f35302n, "video/avc");
            int i29 = this.f6170b;
            this.f6163D = ((!zEquals ? !(!Objects.equals(nVar6.f35302n, "video/hevc") || (i29 & 128) == 0) : (i29 & 64) != 0) ? 0 : i10) ^ i10;
            if (bVar.f6202f < bVar.f6205i) {
                ((C0574i) qVar).i(this.f6160A);
                m mVarB = bVar.b();
                if (mVarB != null) {
                    p114j1.r rVar6 = nVar5.f6285n;
                    int i30 = mVarB.f6271d;
                    if (i30 != 0) {
                        rVar6.H(i30);
                    }
                    int i31 = bVar.f6202f;
                    if (nVar5.f6282k && nVar5.f6283l[i31]) {
                        rVar6.H(rVar6.A() * 6);
                    }
                }
                if (!bVar.c()) {
                    this.f6193z = null;
                }
                this.f6183p = 3;
                return 0;
            }
            if (bVar.f6200d.f6289a.f6264h == i10) {
                this.f6160A -= 8;
                ((C0574i) qVar).i(8);
            }
            if ("audio/ac4".equals(bVar.f6200d.f6289a.f6263g.f35302n)) {
                this.f6161B = bVar.d(this.f6160A, 7);
                int i32 = this.f6160A;
                p114j1.r rVar7 = this.f6177i;
                C0568c.a(i32, rVar7);
                k12.a(7, rVar7);
                this.f6161B += 7;
            } else {
                this.f6161B = bVar.d(this.f6160A, 0);
            }
            this.f6160A += this.f6161B;
            this.f6183p = 4;
            this.f6162C = 0;
        }
        o oVar = bVar.f6200d;
        long j28 = bVar.f6208m ? nVar5.f6281i[bVar.f6202f] : oVar.f6294f[bVar.f6202f];
        l lVar2 = oVar.f6289a;
        int i33 = lVar2.f6266k;
        if (i33 == 0) {
            j10 = j28;
            while (true) {
                int i34 = this.f6161B;
                int i35 = this.f6160A;
                if (i34 >= i35) {
                    break;
                }
                this.f6161B += k12.f(qVar, i35 - i34, false);
            }
        } else {
            p114j1.r rVar8 = this.f6174f;
            byte[] bArr2 = rVar8.f41062a;
            bArr2[0] = 0;
            bArr2[i10] = 0;
            bArr2[2] = 0;
            int i36 = 4 - i33;
            while (this.f6161B < this.f6160A) {
                int i37 = this.f6162C;
                p078g1.n nVar7 = lVar2.f6263g;
                if (i37 == 0) {
                    int length = this.f6167H.length;
                    int i38 = lVar2.f6266k;
                    if (length > 0 || !this.f6163D) {
                        int iD = p127k1.e.d(nVar7);
                        lVar = lVar2;
                        i11 = i38 + iD <= this.f6160A - this.f6161B ? iD : 0;
                        ((C0574i) qVar).a(bArr2, i36, i38 + i11, false);
                        rVar8.G(0);
                        iH = rVar8.h();
                        if (iH >= 0) {
                            throw ParserException.a(null, "Invalid NAL length");
                        }
                        this.f6162C = iH - i11;
                        p114j1.r rVar9 = this.f6173e;
                        rVar9.G(0);
                        k12.a(4, rVar9);
                        this.f6161B += 4;
                        this.f6160A += i36;
                        if (this.f6167H.length > 0 || i11 <= 0) {
                            str = str2;
                            c10 = 6;
                        } else {
                            byte b10 = bArr2[4];
                            boolean zEquals2 = Objects.equals(nVar7.f35302n, str2);
                            String str3 = nVar7.f35299k;
                            if (zEquals2 || t.b(str3, str2)) {
                                str = str2;
                                c10 = 6;
                                if ((b10 & 31) != 6) {
                                }
                                this.f6164E = z;
                                k12.a(i11, rVar8);
                                this.f6161B += i11;
                                if (i11 > 0 && !this.f6163D && p127k1.e.c(bArr2, i11, nVar7)) {
                                    this.f6163D = true;
                                }
                                c11 = c10;
                                str2 = str;
                                lVar2 = lVar;
                            } else {
                                str = str2;
                                c10 = 6;
                            }
                            boolean z11 = (Objects.equals(nVar7.f35302n, "video/hevc") || t.b(str3, "video/hevc")) && ((b10 & 126) >> 1) == 39;
                            this.f6164E = z11;
                            k12.a(i11, rVar8);
                            this.f6161B += i11;
                            if (i11 > 0) {
                                this.f6163D = true;
                            }
                            c11 = c10;
                            str2 = str;
                            lVar2 = lVar;
                        }
                        this.f6164E = z11;
                        k12.a(i11, rVar8);
                        this.f6161B += i11;
                        if (i11 > 0) {
                            this.f6163D = true;
                        }
                        c11 = c10;
                        str2 = str;
                        lVar2 = lVar;
                    } else {
                        lVar = lVar2;
                    }
                    ((C0574i) qVar).a(bArr2, i36, i38 + i11, false);
                    rVar8.G(0);
                    iH = rVar8.h();
                    if (iH >= 0) {
                        throw ParserException.a(null, "Invalid NAL length");
                    }
                    this.f6162C = iH - i11;
                    p114j1.r rVar10 = this.f6173e;
                    rVar10.G(0);
                    k12.a(4, rVar10);
                    this.f6161B += 4;
                    this.f6160A += i36;
                    if (this.f6167H.length > 0) {
                        str = str2;
                        c10 = 6;
                    } else {
                        str = str2;
                        c10 = 6;
                    }
                    this.f6164E = z11;
                    k12.a(i11, rVar8);
                    this.f6161B += i11;
                    if (i11 > 0) {
                        this.f6163D = true;
                    }
                    c11 = c10;
                    str2 = str;
                    lVar2 = lVar;
                } else {
                    l lVar3 = lVar2;
                    String str4 = str2;
                    if (this.f6164E) {
                        p114j1.r rVar11 = this.f6175g;
                        rVar11.D(i37);
                        ((C0574i) qVar).a(rVar11.f41062a, 0, this.f6162C, false);
                        k12.a(this.f6162C, rVar11);
                        iF = this.f6162C;
                        int iL = p127k1.e.l(rVar11.f41064c, rVar11.f41062a);
                        rVar11.G(0);
                        rVar11.F(iL);
                        int i39 = nVar7.f35304p;
                        if (i39 == -1) {
                            if (gVar.f41471e != 0) {
                                gVar.f41471e = 0;
                                gVar.b(0);
                            }
                        } else if (gVar.f41471e != i39) {
                            p241t7.b.k(i39 >= 0);
                            gVar.f41471e = i39;
                            gVar.b(i39);
                        }
                        j11 = j28;
                        gVar.a(j11, rVar11);
                        if ((bVar.a() & 4) != 0) {
                            gVar.b(0);
                        }
                    } else {
                        j11 = j28;
                        iF = k12.f(qVar, i37, false);
                    }
                    this.f6161B += iF;
                    this.f6162C -= iF;
                    j28 = j11;
                    str2 = str4;
                    lVar2 = lVar3;
                    c11 = 6;
                }
            }
            j10 = j28;
        }
        int iA3 = bVar.a();
        if (!this.f6163D) {
            iA3 |= 67108864;
        }
        int i40 = iA3;
        m mVarB2 = bVar.b();
        k12.b(j10, i40, this.f6160A, 0, mVarB2 != null ? mVarB2.f6270c : null);
        while (!arrayDeque.isEmpty()) {
            a aVarRemoveFirst = arrayDeque.removeFirst();
            this.f6189v -= aVarRemoveFirst.f6196c;
            boolean z12 = aVarRemoveFirst.f6195b;
            long j29 = aVarRemoveFirst.f6194a;
            if (z12) {
                j29 += j10;
            }
            for (K k13 : this.f6166G) {
                k13.b(j29, 1, aVarRemoveFirst.f6196c, this.f6189v, null);
            }
        }
        if (!bVar.c()) {
            this.f6193z = null;
        }
        this.f6183p = 3;
        return 0;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        J jB = k.b(qVar, true, false);
        this.f6182o = jB != null ? ImmutableList.M(jB) : ImmutableList.K();
        return jB == null;
    }

    @Override // A1.p
    public final void m(r rVar) {
        int i10;
        int i11 = this.f6170b;
        if ((i11 & 32) == 0) {
            rVar = new X1.m(rVar, this.f6169a);
        }
        this.f6165F = rVar;
        int i12 = 0;
        this.f6183p = 0;
        this.f6186s = 0;
        K[] kArr = new K[2];
        this.f6166G = kArr;
        int i13 = 100;
        if ((i11 & 4) != 0) {
            kArr[0] = rVar.p(100, 5);
            i10 = 1;
            i13 = R.styleable.AppCompatTheme_switchStyle;
        } else {
            i10 = 0;
        }
        K[] kArr2 = (K[]) A.H(i10, this.f6166G);
        this.f6166G = kArr2;
        for (K k10 : kArr2) {
            k10.d(f6159K);
        }
        List<p078g1.n> list = this.f6171c;
        this.f6167H = new K[list.size()];
        while (i12 < this.f6167H.length) {
            K kP = this.f6165F.p(i13, 3);
            kP.d(list.get(i12));
            this.f6167H[i12] = kP;
            i12++;
            i13++;
        }
    }

    @Override // A1.p
    public final void a() {
    }
}
