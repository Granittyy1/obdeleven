package p127k1;

import com.google.common.collect.ImmutableList;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p078g1.n;
import p078g1.t;

/* JADX INFO: compiled from: NalUnitUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f41399a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f41400b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f41401c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f41402d = new int[10];

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41404b;

        public a(int i10, int i11) {
            this.f41403a = i10;
            this.f41404b = i11;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41407c;

        public b(int i10, int i11, int i12) {
            this.f41405a = i10;
            this.f41406b = i11;
            this.f41407c = i12;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f41409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f41411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f41412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f41413f;

        public c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
            this.f41408a = i10;
            this.f41409b = z10;
            this.f41410c = i11;
            this.f41411d = i12;
            this.f41412e = iArr;
            this.f41413f = i13;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<c> f41414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f41415b;

        public d(List<c> list, int[] iArr) {
            this.f41414a = ImmutableList.G(list);
            this.f41415b = iArr;
        }
    }

    /* JADX INFO: renamed from: k1.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class C0472e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f41419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41420e;

        public C0472e(int i10, int i11, int i12, int i13, int i14) {
            this.f41416a = i10;
            this.f41417b = i11;
            this.f41418c = i12;
            this.f41419d = i13;
            this.f41420e = i14;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<C0472e> f41421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f41422b;

        public f(List<C0472e> list, int[] iArr) {
            this.f41421a = ImmutableList.G(list);
            this.f41422b = iArr;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41423a;

        public g(int i10) {
            this.f41423a = i10;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f41425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f41427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f41429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f41430g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f41431h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f41432i;
        public final int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f41433k;

        public h(int i10, c cVar, int i11, int i12, int i13, int i14, float f10, int i15, int i16, int i17, int i18) {
            this.f41424a = i10;
            this.f41425b = cVar;
            this.f41426c = i11;
            this.f41427d = i12;
            this.f41428e = i13;
            this.f41429f = i14;
            this.f41430g = f10;
            this.f41431h = i15;
            this.f41432i = i16;
            this.j = i17;
            this.f41433k = i18;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41436c;

        public i(int i10, int i11, int i12) {
            this.f41434a = i10;
            this.f41435b = i11;
            this.f41436c = i12;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<i> f41437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f41438b;

        public j(List<i> list, int[] iArr) {
            this.f41437a = ImmutableList.G(list);
            this.f41438b = iArr;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<a> f41439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f41440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f41441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j f41442d;

        public k(List list, d dVar, f fVar, j jVar) {
            this.f41439a = list != null ? ImmutableList.G(list) : ImmutableList.K();
            this.f41440b = dVar;
            this.f41441c = fVar;
            this.f41442d = jVar;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f41444b;

        public l(int i10, int i11, boolean z10) {
            this.f41443a = i11;
            this.f41444b = z10;
        }
    }

    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f41447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f41448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f41450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f41451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f41452h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f41453i;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f41454k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f41455l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f41456m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f41457n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f41458o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f41459p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f41460q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f41461r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f41462s;

        public m(int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16, int i17, boolean z10, boolean z11, int i18, int i19, int i20, boolean z12, int i21, int i22, int i23, int i24) {
            this.f41445a = i10;
            this.f41446b = i11;
            this.f41447c = i12;
            this.f41448d = i13;
            this.f41449e = i14;
            this.f41450f = i15;
            this.f41451g = f10;
            this.f41452h = i16;
            this.f41453i = i17;
            this.j = z10;
            this.f41454k = z11;
            this.f41455l = i18;
            this.f41456m = i19;
            this.f41457n = i20;
            this.f41458o = z12;
            this.f41459p = i21;
            this.f41460q = i22;
            this.f41461r = i23;
            this.f41462s = i24;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        p241t7.b.k(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static boolean c(byte[] bArr, int i10, n nVar) {
        int i11;
        if (Objects.equals(nVar.f35302n, "video/avc")) {
            byte b10 = bArr[4];
            return (((b10 & 96) >> 5) == 0 && ((i11 = b10 & 31) == 1 || i11 == 9 || i11 == 14)) ? false : true;
        }
        if (!Objects.equals(nVar.f35302n, "video/hevc")) {
            return true;
        }
        b bVarE = e(new p127k1.f(bArr, 4, i10 + 4));
        int i12 = bVarE.f41405a;
        if (i12 == 35) {
            return false;
        }
        if (i12 <= 14 && i12 % 2 == 0) {
            if (bVarE.f41407c == nVar.f35278C - 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(n nVar) {
        if (Objects.equals(nVar.f35302n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(nVar.f35302n, "video/hevc") || t.b(nVar.f35299k, "video/hevc")) ? 2 : 0;
    }

    public static b e(p127k1.f fVar) {
        fVar.k();
        return new b(fVar.f(6), fVar.f(6), fVar.f(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static c f(p127k1.f fVar, boolean z10, int i10, c cVar) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean zE;
        int iF;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (!z10) {
            if (cVar != null) {
                int i16 = cVar.f41408a;
                zE = cVar.f41409b;
                iF = cVar.f41410c;
                i14 = cVar.f41411d;
                iArr2 = cVar.f41412e;
                i11 = i16;
            } else {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
            }
            int iF2 = fVar.f(8);
            i15 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (fVar.e()) {
                    i15 += 88;
                }
                if (fVar.e()) {
                    i15 += 8;
                }
            }
            fVar.l(i15);
            if (i10 > 0) {
                fVar.l((8 - i10) * 2);
            }
            return new c(i11, z11, i12, i13, iArr, iF2);
        }
        int iF3 = fVar.f(2);
        zE = fVar.e();
        iF = fVar.f(5);
        i14 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (fVar.e()) {
                i14 |= 1 << i18;
            }
        }
        for (int i19 = 0; i19 < 6; i19++) {
            iArr2[i19] = fVar.f(8);
        }
        i11 = iF3;
        iArr = iArr2;
        z11 = zE;
        i12 = iF;
        i13 = i14;
        int iF4 = fVar.f(8);
        i15 = 0;
        while (i17 < i10) {
            if (fVar.e()) {
                i15 += 88;
            }
            if (fVar.e()) {
                i15 += 8;
            }
        }
        fVar.l(i15);
        if (i10 > 0) {
            fVar.l((8 - i10) * 2);
        }
        return new c(i11, z11, i12, i13, iArr, iF4);
    }

    public static g g(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 != 0 && i11 > i12) {
            p127k1.f fVar = new p127k1.f(bArr, i12, i11 + 1);
            while (fVar.c(16)) {
                int iF = fVar.f(8);
                int i13 = 0;
                while (iF == 255) {
                    i13 += 255;
                    iF = fVar.f(8);
                }
                int i14 = i13 + iF;
                int iF2 = fVar.f(8);
                int i15 = 0;
                while (iF2 == 255) {
                    i15 += 255;
                    iF2 = fVar.f(8);
                }
                int i16 = i15 + iF2;
                if (i16 == 0 || !fVar.c(i16)) {
                    break;
                }
                if (i14 == 176) {
                    int iG = fVar.g();
                    boolean zE = fVar.e();
                    int iG2 = zE ? fVar.g() : 0;
                    int iG3 = fVar.g();
                    int iG4 = -1;
                    for (int i17 = 0; i17 <= iG3; i17++) {
                        iG4 = fVar.g();
                        fVar.g();
                        int iF3 = fVar.f(6);
                        if (iF3 == 63) {
                            return null;
                        }
                        fVar.f(iF3 == 0 ? Math.max(0, iG - 30) : Math.max(0, (iF3 + iG) - 31));
                        if (zE) {
                            int iF4 = fVar.f(6);
                            if (iF4 == 63) {
                                return null;
                            }
                            fVar.f(iF4 == 0 ? Math.max(0, iG2 - 30) : Math.max(0, (iF4 + iG2) - 31));
                        }
                        if (fVar.e()) {
                            fVar.l(10);
                        }
                    }
                    return new g(iG4);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    public static h h(byte[] bArr, int i10, int i11, k kVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f10;
        int i18;
        int i19;
        int i20;
        int i21;
        int iG;
        int i22;
        j jVar;
        int iF;
        int[] iArrCopyOf;
        f fVar;
        b bVarE = e(new p127k1.f(bArr, i10, i11));
        p127k1.f fVar2 = new p127k1.f(bArr, i10 + 2, i11);
        int i23 = 4;
        fVar2.l(4);
        int iF2 = fVar2.f(3);
        int i24 = bVarE.f41406b;
        boolean z10 = i24 != 0 && iF2 == 7;
        if (kVar != null) {
            ImmutableList<a> immutableList = kVar.f41439a;
            if (immutableList.isEmpty()) {
                i12 = 0;
            } else {
                i12 = immutableList.get(Math.min(i24, immutableList.size() - 1)).f41403a;
            }
        } else {
            i12 = 0;
        }
        c cVarF = null;
        if (!z10) {
            fVar2.k();
            cVarF = f(fVar2, true, iF2, null);
        } else if (kVar != null) {
            d dVar = kVar.f41440b;
            int i25 = dVar.f41415b[i12];
            ImmutableList<c> immutableList2 = dVar.f41414a;
            if (immutableList2.size() > i25) {
                cVarF = immutableList2.get(i25);
            }
        }
        fVar2.i();
        if (z10) {
            int iF3 = fVar2.e() ? fVar2.f(8) : -1;
            if (kVar == null || (fVar = kVar.f41441c) == null) {
                i14 = 0;
                i16 = 0;
                i15 = 0;
                i13 = 0;
            } else {
                if (iF3 == -1) {
                    iF3 = fVar.f41422b[i12];
                }
                if (iF3 != -1) {
                    ImmutableList<C0472e> immutableList3 = fVar.f41421a;
                    if (immutableList3.size() > iF3) {
                        C0472e c0472e = immutableList3.get(iF3);
                        int i26 = c0472e.f41416a;
                        i15 = c0472e.f41419d;
                        i13 = c0472e.f41420e;
                        i14 = c0472e.f41417b;
                        i16 = c0472e.f41418c;
                    } else {
                        i14 = 0;
                        i16 = 0;
                        i15 = 0;
                        i13 = 0;
                    }
                } else {
                    i14 = 0;
                    i16 = 0;
                    i15 = 0;
                    i13 = 0;
                }
            }
        } else {
            int i27 = fVar2.i();
            if (i27 == 3) {
                fVar2.k();
            }
            int i28 = fVar2.i();
            int i29 = fVar2.i();
            if (fVar2.e()) {
                int i30 = fVar2.i();
                int i31 = fVar2.i();
                int i32 = fVar2.i();
                int i33 = fVar2.i();
                i28 -= (i30 + i31) * ((i27 == 1 || i27 == 2) ? 2 : 1);
                i29 -= (i32 + i33) * (i27 == 1 ? 2 : 1);
            }
            i13 = i29;
            i14 = fVar2.i();
            i15 = i28;
            i16 = fVar2.i();
        }
        int i34 = fVar2.i();
        if (z10) {
            i17 = -1;
        } else {
            int iMax = -1;
            for (int i35 = fVar2.e() ? 0 : iF2; i35 <= iF2; i35++) {
                fVar2.i();
                iMax = Math.max(fVar2.i(), iMax);
                fVar2.i();
            }
            i17 = iMax;
        }
        fVar2.i();
        fVar2.i();
        fVar2.i();
        fVar2.i();
        fVar2.i();
        fVar2.i();
        if (fVar2.e()) {
            boolean zE = z10 ? fVar2.e() : false;
            int i36 = 6;
            if (zE) {
                fVar2.l(6);
            } else if (fVar2.e()) {
                int i37 = 0;
                while (i37 < i23) {
                    int i38 = 0;
                    while (i38 < i36) {
                        if (fVar2.e()) {
                            int iMin = Math.min(64, 1 << ((i37 << 1) + 4));
                            if (i37 > 1) {
                                fVar2.h();
                            }
                            for (int i39 = 0; i39 < iMin; i39++) {
                                fVar2.h();
                            }
                        } else {
                            fVar2.g();
                        }
                        i38 += i37 == 3 ? 3 : 1;
                        i36 = 6;
                    }
                    i37++;
                    i23 = 4;
                    i36 = 6;
                }
            }
        }
        fVar2.l(2);
        if (fVar2.e()) {
            fVar2.l(8);
            fVar2.i();
            fVar2.i();
            fVar2.k();
        }
        int iG2 = fVar2.g();
        int i40 = 0;
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i41 = -1;
        int i42 = -1;
        while (i40 < iG2) {
            if (i40 == 0 || !fVar2.e()) {
                int iG3 = fVar2.g();
                int iG4 = fVar2.g();
                int[] iArr3 = new int[iG3];
                int i43 = 0;
                while (i43 < iG3) {
                    iArr3[i43] = (i43 > 0 ? iArr3[i43 - 1] : 0) - (fVar2.g() + 1);
                    fVar2.k();
                    i43++;
                }
                iArrCopyOf = new int[iG4];
                int i44 = 0;
                while (i44 < iG4) {
                    iArrCopyOf[i44] = fVar2.g() + 1 + (i44 > 0 ? iArrCopyOf[i44 - 1] : 0);
                    fVar2.k();
                    i44++;
                }
                iArr = iArr3;
                i42 = iG4;
                i41 = iG3;
            } else {
                int i45 = i41 + i42;
                int iG5 = (1 - ((fVar2.e() ? 1 : 0) * 2)) * (fVar2.g() + 1);
                int i46 = i45 + 1;
                boolean[] zArr = new boolean[i46];
                for (int i47 = 0; i47 <= i45; i47++) {
                    if (fVar2.e()) {
                        zArr[i47] = true;
                    } else {
                        zArr[i47] = fVar2.e();
                    }
                }
                int[] iArr4 = new int[i46];
                int[] iArr5 = new int[i46];
                int i48 = 0;
                for (int i49 = i42 - 1; i49 >= 0; i49--) {
                    int i50 = iArr2[i49] + iG5;
                    if (i50 < 0 && zArr[i41 + i49]) {
                        iArr4[i48] = i50;
                        i48++;
                    }
                }
                if (iG5 < 0 && zArr[i45]) {
                    iArr4[i48] = iG5;
                    i48++;
                }
                int i51 = i48;
                for (int i52 = 0; i52 < i41; i52++) {
                    int i53 = iArr[i52] + iG5;
                    if (i53 < 0 && zArr[i52]) {
                        iArr4[i51] = i53;
                        i51++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i51);
                int i54 = 0;
                for (int i55 = i41 - 1; i55 >= 0; i55--) {
                    int i56 = iArr[i55] + iG5;
                    if (i56 > 0 && zArr[i55]) {
                        iArr5[i54] = i56;
                        i54++;
                    }
                }
                if (iG5 > 0 && zArr[i45]) {
                    iArr5[i54] = iG5;
                    i54++;
                }
                int i57 = i54;
                for (int i58 = 0; i58 < i42; i58++) {
                    int i59 = iArr2[i58] + iG5;
                    if (i59 > 0 && zArr[i41 + i58]) {
                        iArr5[i57] = i59;
                        i57++;
                    }
                }
                i42 = i57;
                iArrCopyOf = Arrays.copyOf(iArr5, i57);
                iArr = iArrCopyOf2;
                i41 = i51;
            }
            i40++;
            iArr2 = iArrCopyOf;
            iG2 = iG2;
            i17 = i17;
            i15 = i15;
            i16 = i16;
            i14 = i14;
            cVarF = cVarF;
        }
        int i60 = i17;
        c cVar = cVarF;
        int i61 = i14;
        int i62 = i16;
        int i63 = i15;
        if (fVar2.e()) {
            int i64 = fVar2.i();
            for (int i65 = 0; i65 < i64; i65++) {
                fVar2.l(i34 + 5);
            }
        }
        fVar2.l(2);
        float f11 = 1.0f;
        if (fVar2.e()) {
            if (fVar2.e()) {
                int iF4 = fVar2.f(8);
                if (iF4 == 255) {
                    int iF5 = fVar2.f(16);
                    int iF6 = fVar2.f(16);
                    if (iF5 != 0 && iF6 != 0) {
                        f11 = iF5 / iF6;
                    }
                } else if (iF4 < 17) {
                    f11 = f41400b[iF4];
                } else {
                    com.google.gson.internal.b.e(iF4, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (fVar2.e()) {
                fVar2.k();
            }
            if (fVar2.e()) {
                fVar2.l(3);
                i22 = fVar2.e() ? 1 : 2;
                if (fVar2.e()) {
                    int iF7 = fVar2.f(8);
                    int iF8 = fVar2.f(8);
                    fVar2.l(8);
                    iF = p078g1.h.f(iF7);
                    iG = p078g1.h.g(iF8);
                } else {
                    iG = -1;
                    iF = -1;
                }
            } else {
                if (kVar != null && (jVar = kVar.f41442d) != null) {
                    int i66 = jVar.f41438b[i12];
                    ImmutableList<i> immutableList4 = jVar.f41437a;
                    if (immutableList4.size() > i66) {
                        i iVar = immutableList4.get(i66);
                        iF = iVar.f41434a;
                        int i67 = iVar.f41435b;
                        iG = iVar.f41436c;
                        i22 = i67;
                    }
                }
                iG = -1;
                i22 = -1;
                iF = -1;
            }
            if (fVar2.e()) {
                fVar2.i();
                fVar2.i();
            }
            fVar2.k();
            if (fVar2.e()) {
                i13 *= 2;
            }
            i21 = iG;
            f10 = f11;
            i20 = i22;
            i19 = iF;
            i18 = i13;
        } else {
            f10 = 1.0f;
            i18 = i13;
            i19 = -1;
            i20 = -1;
            i21 = -1;
        }
        return new h(iF2, cVar, i61, i62, i63, i18, f10, i60, i19, i20, i21);
    }

    /* JADX WARN: Code duplicated, block: B:457:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0147  */
    /* JADX WARN: Multi-variable type inference failed */
    public static k i(byte[] bArr, int i10, int i11) {
        int[][] iArr;
        int i12;
        j jVar;
        int iF;
        int iF2;
        int iF3;
        int i13;
        int i14;
        boolean[][] zArr;
        int i15;
        boolean[][] zArr2;
        int[] iArr2;
        boolean z10;
        boolean z11;
        boolean zE;
        int i16;
        int i17;
        int i18;
        boolean zE2;
        boolean zE3;
        int iG;
        int i19;
        int i20;
        int i21;
        boolean z12;
        boolean z13;
        p127k1.f fVar = new p127k1.f(bArr, i10, i11);
        e(fVar);
        fVar.l(4);
        boolean zE4 = fVar.e();
        boolean zE5 = fVar.e();
        int iF4 = fVar.f(6);
        int i22 = iF4 + 1;
        int iF5 = fVar.f(3);
        fVar.l(17);
        int i23 = 1;
        c cVarF = f(fVar, true, iF5, null);
        int i24 = 0;
        for (int i25 = fVar.e() ? 0 : iF5; i25 <= iF5; i25++) {
            fVar.i();
            fVar.i();
            fVar.i();
        }
        int iF6 = fVar.f(6);
        int i26 = fVar.i() + 1;
        d dVar = new d(ImmutableList.M(cVarF), new int[1]);
        boolean z14 = i22 >= 2 && i26 >= 2;
        boolean z15 = zE4 && zE5;
        int i27 = iF6 + 1;
        boolean z16 = i27 >= i22;
        if (!z14 || !z15 || !z16) {
            return new k(null, dVar, null, null);
        }
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i26, i27);
        int[] iArr4 = new int[i26];
        int[] iArr5 = new int[i26];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        while (i23 < i26) {
            int i28 = i24;
            while (i24 <= iF6) {
                if (fVar.e()) {
                    iArr3[i23][i28] = i24;
                    iArr5[i23] = i24;
                    i28++;
                }
                iArr4[i23] = i28;
                i24++;
            }
            i23++;
            i24 = 0;
        }
        int i29 = 8;
        if (fVar.e()) {
            fVar.l(64);
            if (fVar.e()) {
                fVar.i();
            }
            int i30 = fVar.i();
            int i31 = 0;
            while (i31 < i30) {
                fVar.i();
                if (i31 == 0 || fVar.e()) {
                    boolean zE6 = fVar.e();
                    boolean zE7 = fVar.e();
                    z13 = zE6;
                    z12 = zE7;
                    if (zE6 || zE7) {
                        zE = fVar.e();
                        if (zE) {
                            fVar.l(19);
                        }
                        fVar.l(i29);
                        if (zE) {
                            fVar.l(4);
                        }
                        fVar.l(15);
                        i17 = zE6;
                        i16 = zE7;
                    }
                    i18 = 0;
                    while (i18 <= iF5) {
                        zE2 = fVar.e();
                        if (!zE2) {
                            zE2 = fVar.e();
                        }
                        if (zE2) {
                            fVar.g();
                            zE3 = false;
                        } else {
                            zE3 = fVar.e();
                        }
                        if (zE3) {
                            iG = 0;
                        } else {
                            iG = fVar.g();
                        }
                        i19 = i17 + i16;
                        int[] iArr6 = iArr5;
                        i20 = 0;
                        while (i20 < i19) {
                            int i32 = i19;
                            for (i21 = 0; i21 <= iG; i21++) {
                                fVar.g();
                                fVar.g();
                                if (zE) {
                                    fVar.g();
                                    fVar.g();
                                }
                                fVar.k();
                            }
                            i20++;
                            i19 = i32;
                        }
                        i18++;
                        i30 = i30;
                        iArr5 = iArr6;
                    }
                    i31++;
                    i29 = 8;
                } else {
                    z13 = false;
                    z12 = false;
                }
                zE = false;
                i17 = z13;
                i16 = z12;
                i18 = 0;
                while (i18 <= iF5) {
                    zE2 = fVar.e();
                    if (!zE2) {
                        zE2 = fVar.e();
                    }
                    if (zE2) {
                        fVar.g();
                        zE3 = false;
                    } else {
                        zE3 = fVar.e();
                    }
                    if (zE3) {
                        iG = fVar.g();
                    } else {
                        iG = 0;
                    }
                    i19 = i17 + i16;
                    int[] iArr7 = iArr5;
                    i20 = 0;
                    while (i20 < i19) {
                        int i33 = i19;
                        while (i21 <= iG) {
                            fVar.g();
                            fVar.g();
                            if (zE) {
                                fVar.g();
                                fVar.g();
                            }
                            fVar.k();
                        }
                        i20++;
                        i19 = i33;
                    }
                    i18++;
                    i30 = i30;
                    iArr5 = iArr7;
                }
                i31++;
                i29 = 8;
            }
        }
        int[] iArr8 = iArr5;
        if (!fVar.e()) {
            return new k(null, dVar, null, null);
        }
        fVar.b();
        c cVarF2 = f(fVar, false, iF5, cVarF);
        boolean zE8 = fVar.e();
        boolean[] zArr3 = new boolean[16];
        int i34 = 0;
        for (int i35 = 0; i35 < 16; i35++) {
            boolean zE9 = fVar.e();
            zArr3[i35] = zE9;
            if (zE9) {
                i34++;
            }
        }
        if (i34 == 0 || !zArr3[1]) {
            return new k(null, dVar, null, null);
        }
        int[] iArr9 = new int[i34];
        for (int i36 = 0; i36 < i34 - (zE8 ? 1 : 0); i36++) {
            iArr9[i36] = fVar.f(3);
        }
        int[] iArr10 = new int[i34 + 1];
        if (zE8) {
            int i37 = 1;
            while (i37 < i34) {
                int[][] iArr11 = iArr3;
                for (int i38 = 0; i38 < i37; i38++) {
                    iArr10[i37] = iArr9[i38] + 1 + iArr10[i37];
                }
                i37++;
                iArr3 = iArr11;
            }
            iArr = iArr3;
            iArr10[i34] = 6;
        } else {
            iArr = iArr3;
        }
        int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i22, i34);
        int[] iArr13 = new int[i22];
        iArr13[0] = 0;
        boolean zE10 = fVar.e();
        int i39 = 1;
        while (i39 < i22) {
            if (zE10) {
                iArr13[i39] = fVar.f(6);
            } else {
                iArr13[i39] = i39;
            }
            if (zE8) {
                z11 = zE8 ? 1 : 0;
                int i40 = 0;
                while (i40 < i34) {
                    int i41 = i40 + 1;
                    iArr12[i39][i40] = (iArr13[i39] & ((1 << iArr10[i41]) - 1)) >> iArr10[i40];
                    i40 = i41;
                }
            } else {
                int i42 = 0;
                while (i42 < i34) {
                    iArr12[i39][i42] = fVar.f(iArr9[i42] + 1);
                    i42++;
                    zE8 = zE8 ? 1 : 0;
                }
                z11 = zE8;
            }
            i39++;
            iF5 = iF5;
            zE8 = z11;
        }
        int i43 = iF5;
        int[] iArr14 = new int[i27];
        int i44 = 1;
        for (int i45 = 0; i45 < i22; i45++) {
            iArr14[iArr13[i45]] = -1;
            int i46 = 0;
            for (int i47 = 0; i47 < 16; i47++) {
                if (zArr3[i47]) {
                    if (i47 == 1) {
                        iArr14[iArr13[i45]] = iArr12[i45][i46];
                    }
                    i46++;
                }
            }
            if (i45 > 0) {
                int i48 = 0;
                while (true) {
                    if (i48 >= i45) {
                        z10 = true;
                        break;
                    }
                    if (iArr14[iArr13[i45]] == iArr14[iArr13[i48]]) {
                        z10 = false;
                        break;
                    }
                    i48++;
                }
                if (z10) {
                    i44++;
                }
            }
        }
        int iF7 = fVar.f(4);
        if (i44 < 2 || iF7 == 0) {
            return new k(null, dVar, null, null);
        }
        int[] iArr15 = new int[i44];
        for (int i49 = 0; i49 < i44; i49++) {
            iArr15[i49] = fVar.f(iF7);
        }
        int[] iArr16 = new int[i27];
        for (int i50 = 0; i50 < i22; i50++) {
            iArr16[Math.min(iArr13[i50], iF6)] = i50;
        }
        ImmutableList.a aVarB = ImmutableList.B();
        int i51 = 0;
        while (i51 <= iF6) {
            int iMin = Math.min(iArr14[i51], i44 - 1);
            aVarB.e(new a(iArr16[i51], iMin >= 0 ? iArr15[iMin] : -1));
            i51++;
            iArr14 = iArr14;
        }
        ImmutableList immutableListH = aVarB.h();
        if (((a) immutableListH.get(0)).f41404b == -1) {
            return new k(null, dVar, null, null);
        }
        int i52 = 1;
        while (true) {
            if (i52 > iF6) {
                i52 = -1;
                break;
            }
            if (((a) immutableListH.get(i52)).f41404b != -1) {
                break;
            }
            i52++;
        }
        if (i52 == -1) {
            return new k(null, dVar, null, null);
        }
        Class cls = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls, i22, i22);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls, i22, i22);
        for (int i53 = 1; i53 < i22; i53++) {
            for (int i54 = 0; i54 < i53; i54++) {
                boolean[] zArr6 = zArr4[i53];
                boolean[] zArr7 = zArr5[i53];
                boolean zE11 = fVar.e();
                zArr7[i54] = zE11;
                zArr6[i54] = zE11;
            }
        }
        for (int i55 = 1; i55 < i22; i55++) {
            for (int i56 = 0; i56 < iF4; i56++) {
                for (int i57 = 0; i57 < i55; i57++) {
                    boolean[] zArr8 = zArr5[i55];
                    if (zArr8[i57] && zArr5[i57][i56]) {
                        zArr8[i56] = true;
                        break;
                    }
                }
            }
        }
        int[] iArr17 = new int[i27];
        for (int i58 = 0; i58 < i22; i58++) {
            int i59 = 0;
            for (int i60 = 0; i60 < i58; i60++) {
                i59 += zArr4[i58][i60] ? 1 : 0;
            }
            iArr17[iArr13[i58]] = i59;
        }
        int i61 = 0;
        for (int i62 = 0; i62 < i22; i62++) {
            if (iArr17[iArr13[i62]] == 0) {
                i61++;
            }
        }
        if (i61 > 1) {
            return new k(null, dVar, null, null);
        }
        int[] iArr18 = new int[i22];
        int[] iArr19 = new int[i26];
        if (fVar.e()) {
            for (int i63 = 0; i63 < i22; i63++) {
                iArr18[i63] = fVar.f(3);
            }
            i12 = i43;
        } else {
            i12 = i43;
            Arrays.fill(iArr18, 0, i22, i12);
        }
        int i64 = 0;
        while (i64 < i26) {
            boolean[][] zArr9 = zArr5;
            int[] iArr20 = iArr17;
            int[] iArr21 = iArr13;
            int iMax = 0;
            for (int i65 = 0; i65 < iArr4[i64]; i65++) {
                iMax = Math.max(iMax, iArr18[((a) immutableListH.get(iArr[i64][i65])).f41403a]);
            }
            iArr19[i64] = iMax + 1;
            i64++;
            zArr5 = zArr9;
            iArr13 = iArr21;
            iArr17 = iArr20;
        }
        boolean[][] zArr10 = zArr5;
        int[] iArr22 = iArr17;
        int[] iArr23 = iArr13;
        if (fVar.e()) {
            int i66 = 0;
            while (i66 < iF4) {
                int i67 = i66 + 1;
                for (int i68 = i67; i68 < i22; i68++) {
                    if (zArr4[i68][i66]) {
                        fVar.l(3);
                    }
                }
                i66 = i67;
            }
        }
        fVar.k();
        int i69 = fVar.i() + 1;
        ImmutableList.a aVarB2 = ImmutableList.B();
        aVarB2.e(cVarF);
        if (i69 > 1) {
            aVarB2.e(cVarF2);
            c cVarF3 = cVarF2;
            for (int i70 = 2; i70 < i69; i70++) {
                cVarF3 = f(fVar, fVar.e(), i12, cVarF3);
                aVarB2.e(cVarF3);
            }
        }
        ImmutableList immutableListH2 = aVarB2.h();
        int i71 = fVar.i() + i26;
        if (i71 > i26) {
            return new k(null, dVar, null, null);
        }
        int iF8 = fVar.f(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i71, i27);
        int[] iArr24 = new int[i71];
        int[] iArr25 = new int[i71];
        int i72 = 0;
        while (i72 < i26) {
            int i73 = i26;
            iArr24[i72] = 0;
            iArr25[i72] = iArr8[i72];
            if (iF8 == 0) {
                zArr2 = zArr4;
                iArr2 = iArr19;
                i15 = i22;
                Arrays.fill(zArr11[i72], 0, iArr4[i72], true);
                iArr24[i72] = iArr4[i72];
            } else {
                i15 = i22;
                zArr2 = zArr4;
                iArr2 = iArr19;
                if (iF8 == 1) {
                    int i74 = iArr8[i72];
                    for (int i75 = 0; i75 < iArr4[i72]; i75++) {
                        zArr11[i72][i75] = iArr[i72][i75] == i74;
                    }
                    iArr24[i72] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr24[0] = 1;
                }
                i72++;
                i26 = i73;
                zArr4 = zArr2;
                iArr19 = iArr2;
                i22 = i15;
            }
            i72++;
            i26 = i73;
            zArr4 = zArr2;
            iArr19 = iArr2;
            i22 = i15;
        }
        int i76 = i22;
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = iArr19;
        int i77 = i26;
        int[] iArr27 = new int[i27];
        int i78 = 2;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i71, i27);
        int i79 = 0;
        int i80 = 1;
        while (i80 < i71) {
            if (iF8 == i78) {
                for (int i81 = 0; i81 < iArr4[i80]; i81++) {
                    zArr11[i80][i81] = fVar.e();
                    int i82 = iArr24[i80];
                    boolean z17 = zArr11[i80][i81];
                    iArr24[i80] = i82 + (z17 ? 1 : 0);
                    if (z17) {
                        iArr25[i80] = iArr[i80][i81];
                    }
                }
            }
            if (i79 == 0 && iArr[i80][0] == 0 && zArr11[i80][0]) {
                for (int i83 = 1; i83 < iArr4[i80]; i83++) {
                    if (iArr[i80][i83] == i52 && zArr11[i80][i52]) {
                        i79 = i80;
                    }
                }
            }
            int i84 = 0;
            while (i84 < iArr4[i80]) {
                if (i69 > 1) {
                    zArr13[i80][i84] = zArr11[i80][i84];
                    zArr = zArr11;
                    i13 = i52;
                    int iC = p095h6.a.c(i69, RoundingMode.CEILING);
                    if (zArr13[i80][i84]) {
                        i14 = i69;
                        break;
                    }
                    int i85 = ((a) immutableListH.get(iArr[i80][i84])).f41403a;
                    int i86 = 0;
                    while (true) {
                        if (i86 >= i84) {
                            i14 = i69;
                            break;
                        }
                        i14 = i69;
                        if (zArr10[i85][((a) immutableListH.get(iArr[i80][i86])).f41403a]) {
                            zArr13[i80][i84] = true;
                            break;
                        }
                        i86++;
                        i69 = i14;
                    }
                    if (zArr13[i80][i84]) {
                        if (i79 <= 0 || i80 != i79) {
                            fVar.l(iC);
                        } else {
                            iArr27[i84] = fVar.f(iC);
                        }
                    }
                } else {
                    i13 = i52;
                    i14 = i69;
                    zArr = zArr11;
                }
                i84++;
                zArr11 = zArr;
                i52 = i13;
                i69 = i14;
            }
            int i87 = i52;
            int i88 = i69;
            boolean[][] zArr14 = zArr11;
            if (iArr24[i80] == 1 && iArr22[iArr25[i80]] > 0) {
                fVar.k();
            }
            i80++;
            zArr11 = zArr14;
            i52 = i87;
            i69 = i88;
            i78 = 2;
        }
        if (i79 == 0) {
            return new k(null, dVar, null, null);
        }
        int iG2 = fVar.g();
        int i89 = iG2 + 1;
        ImmutableList.a aVarC = ImmutableList.C(i89);
        int[] iArr28 = new int[i76];
        for (int i90 = 0; i90 < i89; i90++) {
            int iF9 = fVar.f(16);
            int iF10 = fVar.f(16);
            if (fVar.e()) {
                iF = fVar.f(2);
                if (iF == 3) {
                    fVar.k();
                }
                iF2 = fVar.f(4);
                iF3 = fVar.f(4);
            } else {
                iF = 0;
                iF2 = 0;
                iF3 = 0;
            }
            if (fVar.e()) {
                int iG3 = fVar.g();
                int iG4 = fVar.g();
                int iG5 = fVar.g();
                int iG6 = fVar.g();
                iF9 -= (iG3 + iG4) * ((iF == 1 || iF == 2) ? 2 : 1);
                iF10 -= (iG5 + iG6) * (iF == 1 ? 2 : 1);
            }
            aVarC.c(new C0472e(iF, iF2, iF3, iF9, iF10));
        }
        if (i89 <= 1 || !fVar.e()) {
            for (int i91 = 1; i91 < i76; i91++) {
                iArr28[i91] = Math.min(i91, iG2);
            }
        } else {
            int iC2 = p095h6.a.c(i89, RoundingMode.CEILING);
            for (int i92 = 1; i92 < i76; i92++) {
                iArr28[i92] = fVar.f(iC2);
            }
        }
        f fVar2 = new f(aVarC.h(), iArr28);
        fVar.l(2);
        for (int i93 = 1; i93 < i76; i93++) {
            if (iArr22[iArr23[i93]] == 0) {
                fVar.k();
            }
        }
        for (int i94 = 1; i94 < i71; i94++) {
            boolean zE12 = fVar.e();
            int i95 = 0;
            while (i95 < iArr26[i94]) {
                if ((i95 <= 0 || !zE12) ? i95 == 0 : fVar.e()) {
                    for (int i96 = 0; i96 < iArr4[i94]; i96++) {
                        if (zArr13[i94][i96]) {
                            fVar.g();
                        }
                    }
                    fVar.g();
                    fVar.g();
                }
                i95++;
            }
        }
        int iG7 = fVar.g() + 2;
        if (fVar.e()) {
            fVar.l(iG7);
        } else {
            for (int i97 = 1; i97 < i76; i97++) {
                for (int i98 = 0; i98 < i97; i98++) {
                    if (zArr12[i97][i98]) {
                        fVar.l(iG7);
                    }
                }
            }
        }
        int iG8 = fVar.g();
        for (int i99 = 1; i99 <= iG8; i99++) {
            fVar.l(8);
        }
        if (fVar.e()) {
            fVar.b();
            if (!fVar.e() ? fVar.e() : true) {
                fVar.k();
            }
            boolean zE13 = fVar.e();
            boolean zE14 = fVar.e();
            if (zE13 || zE14) {
                for (int i100 = 0; i100 < i77; i100++) {
                    for (int i101 = 0; i101 < iArr26[i100]; i101++) {
                        boolean zE15 = zE13 ? fVar.e() : false;
                        boolean zE16 = zE14 ? fVar.e() : false;
                        if (zE15) {
                            fVar.l(32);
                        }
                        if (zE16) {
                            fVar.l(18);
                        }
                    }
                }
            }
            boolean zE17 = fVar.e();
            int iF11 = zE17 ? fVar.f(4) + 1 : i76;
            ImmutableList.a aVarC2 = ImmutableList.C(iF11);
            int[] iArr29 = new int[i76];
            for (int i102 = 0; i102 < iF11; i102++) {
                fVar.l(3);
                int i103 = fVar.e() ? 1 : 2;
                int iF12 = p078g1.h.f(fVar.f(8));
                int iG9 = p078g1.h.g(fVar.f(8));
                fVar.l(8);
                aVarC2.c(new i(iF12, i103, iG9));
            }
            if (zE17 && iF11 > 1) {
                for (int i104 = 0; i104 < i76; i104++) {
                    iArr29[i104] = fVar.f(4);
                }
            }
            jVar = new j(aVarC2.h(), iArr29);
        } else {
            jVar = null;
        }
        return new k(immutableListH, new d(immutableListH2, iArr27), fVar2, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:124:0x0206  */
    /* JADX WARN: Code duplicated, block: B:127:0x0211  */
    /* JADX WARN: Code duplicated, block: B:130:0x021a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0221  */
    /* JADX WARN: Code duplicated, block: B:136:0x022d  */
    /* JADX WARN: Code duplicated, block: B:137:0x024e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0259  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x018a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0194  */
    public static m j(byte[] bArr, int i10, int i11) {
        int iG;
        boolean z10;
        int i12;
        int i13;
        int iG2;
        boolean z11;
        boolean zE;
        int i14;
        int i15;
        int i16;
        int iF;
        float f10;
        int i17;
        int i18;
        int i19;
        int i20;
        float f11;
        int i21;
        int iG3;
        int i22;
        boolean zE2;
        boolean zE3;
        int iF2;
        int iF3;
        int iF4;
        int i23;
        int i24;
        int i25;
        int i26;
        p127k1.f fVar = new p127k1.f(bArr, i10 + 1, i11);
        int iF5 = fVar.f(8);
        int iF6 = fVar.f(8);
        int iF7 = fVar.f(8);
        int iG4 = fVar.g();
        if (iF5 == 100 || iF5 == 110 || iF5 == 122 || iF5 == 244 || iF5 == 44 || iF5 == 83 || iF5 == 86 || iF5 == 118 || iF5 == 128 || iF5 == 138) {
            iG = fVar.g();
            boolean zE4 = iG == 3 ? fVar.e() : false;
            int iG5 = fVar.g();
            int iG6 = fVar.g();
            fVar.k();
            if (fVar.e()) {
                int i27 = iG == 3 ? 12 : 8;
                int i28 = 0;
                while (i28 < i27) {
                    if (fVar.e()) {
                        int i29 = i28 < 6 ? 16 : 64;
                        int iH = 8;
                        int i30 = 8;
                        for (int i31 = 0; i31 < i29; i31++) {
                            if (iH != 0) {
                                iH = ((fVar.h() + i30) + 256) % 256;
                            }
                            if (iH != 0) {
                                i30 = iH;
                            }
                        }
                    }
                    i28++;
                }
            }
            z10 = zE4;
            i12 = iG5;
            i13 = iG6;
        } else {
            iG = 1;
            i12 = 0;
            i13 = 0;
            z10 = false;
        }
        int iG7 = fVar.g() + 4;
        int iG8 = fVar.g();
        if (iG8 != 0) {
            if (iG8 == 1) {
                boolean zE5 = fVar.e();
                fVar.h();
                fVar.h();
                iG8 = iG8;
                long jG = fVar.g();
                iG = iG;
                for (int i32 = 0; i32 < jG; i32++) {
                    fVar.g();
                }
                z11 = zE5;
                iG2 = 0;
            } else {
                iG2 = 0;
            }
            fVar.g();
            fVar.k();
            int iG9 = fVar.g() + 1;
            int iG10 = fVar.g() + 1;
            zE = fVar.e();
            i14 = 2 - (zE ? 1 : 0);
            int i33 = iG10 * i14;
            if (!zE) {
                fVar.k();
            }
            fVar.k();
            i15 = iG9 * 16;
            i16 = i33 * 16;
            if (fVar.e()) {
                int iG11 = fVar.g();
                int iG12 = fVar.g();
                int iG13 = fVar.g();
                int iG14 = fVar.g();
                if (iG == 0) {
                    i24 = 1;
                } else {
                    i23 = iG;
                    if (i23 == 3) {
                        i25 = 1;
                        i24 = 1;
                    } else {
                        i24 = 2;
                        i25 = 1;
                    }
                    if (i23 == i25) {
                        i26 = 2;
                    } else {
                        i26 = i25;
                    }
                    i14 *= i26;
                }
                i15 -= (iG11 + iG12) * i24;
                i16 -= (iG13 + iG14) * i14;
            }
            int i34 = ((iF5 != 44 || iF5 == 86 || iF5 == 100 || iF5 == 110 || iF5 == 122 || iF5 == 244) && (iF6 & 16) != 0) ? 0 : 16;
            iF = -1;
            f10 = 1.0f;
            if (fVar.e()) {
                if (fVar.e()) {
                    iF2 = fVar.f(8);
                    if (iF2 == 255) {
                        iF3 = fVar.f(16);
                        iF4 = fVar.f(16);
                        if (iF3 != 0 && iF4 != 0) {
                            f10 = iF3 / iF4;
                        }
                    } else if (iF2 < 17) {
                        f10 = f41400b[iF2];
                    } else {
                        com.google.gson.internal.b.e(iF2, "Unexpected aspect_ratio_idc value: ");
                    }
                }
                if (fVar.e()) {
                    fVar.k();
                }
                if (fVar.e()) {
                    fVar.l(3);
                    if (fVar.e()) {
                        i21 = 1;
                    } else {
                        i21 = 2;
                    }
                    if (fVar.e()) {
                        int iF8 = fVar.f(8);
                        int iF9 = fVar.f(8);
                        fVar.l(8);
                        iF = p078g1.h.f(iF8);
                        iG3 = p078g1.h.g(iF9);
                    } else {
                        iG3 = -1;
                    }
                } else {
                    i21 = -1;
                    iG3 = -1;
                }
                if (fVar.e()) {
                    fVar.g();
                    fVar.g();
                }
                i22 = i21;
                if (fVar.e()) {
                    fVar.l(65);
                }
                zE2 = fVar.e();
                if (zE2) {
                    k(fVar);
                }
                zE3 = fVar.e();
                if (zE3) {
                    k(fVar);
                }
                if (zE2 || zE3) {
                    fVar.k();
                }
                fVar.k();
                if (fVar.e()) {
                    fVar.k();
                    fVar.g();
                    fVar.g();
                    fVar.g();
                    fVar.g();
                    int iG15 = fVar.g();
                    fVar.g();
                    i20 = iG15;
                    i19 = iG3;
                    i18 = iF;
                    f11 = f10;
                    i17 = i22;
                } else {
                    i17 = i22;
                    i19 = iG3;
                    i18 = iF;
                }
                return new m(iF5, iF6, iF7, iG4, i15, i16, f11, i12, i13, z10, zE, iG7, iG8, iG2, z11, i18, i17, i19, i20);
            }
            i17 = -1;
            i18 = -1;
            i19 = -1;
            i20 = i34;
            f11 = f10;
            return new m(iF5, iF6, iF7, iG4, i15, i16, f11, i12, i13, z10, zE, iG7, iG8, iG2, z11, i18, i17, i19, i20);
        }
        iG2 = fVar.g() + 4;
        z11 = false;
        fVar.g();
        fVar.k();
        int iG16 = fVar.g() + 1;
        int iG17 = fVar.g() + 1;
        zE = fVar.e();
        i14 = 2 - (zE ? 1 : 0);
        int i35 = iG17 * i14;
        if (!zE) {
            fVar.k();
        }
        fVar.k();
        i15 = iG16 * 16;
        i16 = i35 * 16;
        if (fVar.e()) {
            int iG18 = fVar.g();
            int iG19 = fVar.g();
            int iG110 = fVar.g();
            int iG111 = fVar.g();
            if (iG == 0) {
                i24 = 1;
            } else {
                i23 = iG;
                if (i23 == 3) {
                    i25 = 1;
                    i24 = 1;
                } else {
                    i24 = 2;
                    i25 = 1;
                }
                if (i23 == i25) {
                    i26 = 2;
                } else {
                    i26 = i25;
                }
                i14 *= i26;
            }
            i15 -= (iG18 + iG19) * i24;
            i16 -= (iG110 + iG111) * i14;
        }
        if (iF5 != 44) {
        }
        iF = -1;
        f10 = 1.0f;
        if (fVar.e()) {
            if (fVar.e()) {
                iF2 = fVar.f(8);
                if (iF2 == 255) {
                    iF3 = fVar.f(16);
                    iF4 = fVar.f(16);
                    if (iF3 != 0) {
                        f10 = iF3 / iF4;
                    }
                } else if (iF2 < 17) {
                    f10 = f41400b[iF2];
                } else {
                    com.google.gson.internal.b.e(iF2, "Unexpected aspect_ratio_idc value: ");
                }
            }
            if (fVar.e()) {
                fVar.k();
            }
            if (fVar.e()) {
                fVar.l(3);
                if (fVar.e()) {
                    i21 = 1;
                } else {
                    i21 = 2;
                }
                if (fVar.e()) {
                    int iF10 = fVar.f(8);
                    int iF11 = fVar.f(8);
                    fVar.l(8);
                    iF = p078g1.h.f(iF10);
                    iG3 = p078g1.h.g(iF11);
                } else {
                    iG3 = -1;
                }
            } else {
                i21 = -1;
                iG3 = -1;
            }
            if (fVar.e()) {
                fVar.g();
                fVar.g();
            }
            i22 = i21;
            if (fVar.e()) {
                fVar.l(65);
            }
            zE2 = fVar.e();
            if (zE2) {
                k(fVar);
            }
            zE3 = fVar.e();
            if (zE3) {
                k(fVar);
            }
            if (zE2) {
                fVar.k();
            } else {
                fVar.k();
            }
            fVar.k();
            if (fVar.e()) {
                fVar.k();
                fVar.g();
                fVar.g();
                fVar.g();
                fVar.g();
                int iG112 = fVar.g();
                fVar.g();
                i20 = iG112;
                i19 = iG3;
                i18 = iF;
                f11 = f10;
                i17 = i22;
            } else {
                i17 = i22;
                i19 = iG3;
                i18 = iF;
            }
            return new m(iF5, iF6, iF7, iG4, i15, i16, f11, i12, i13, z10, zE, iG7, iG8, iG2, z11, i18, i17, i19, i20);
        }
        i17 = -1;
        i18 = -1;
        i19 = -1;
        i20 = i34;
        f11 = f10;
        return new m(iF5, iF6, iF7, iG4, i15, i16, f11, i12, i13, z10, zE, iG7, iG8, iG2, z11, i18, i17, i19, i20);
    }

    public static void k(p127k1.f fVar) {
        int iG = fVar.g() + 1;
        fVar.l(8);
        for (int i10 = 0; i10 < iG; i10++) {
            fVar.g();
            fVar.g();
            fVar.k();
        }
        fVar.l(20);
    }

    public static int l(int i10, byte[] bArr) {
        int i11;
        synchronized (f41401c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f41402d;
                    if (iArr.length <= i13) {
                        f41402d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f41402d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f41402d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
