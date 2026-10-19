package p103i2;

import A1.C0574i;
import A1.E;
import A1.K;
import A1.p;
import A1.q;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.k;
import java.io.IOException;
import java.math.RoundingMode;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: WavExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f36562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f36563b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f36566e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36564c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36565d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36567f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f36568g = -1;

    /* JADX INFO: renamed from: i2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class C0383a implements b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int[] f36569m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int[] f36570n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_windowActionBarOverlay, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f36571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f36572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p103i2.b f36573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f36575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final r f36576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f36577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final n f36578h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f36579i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f36580k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f36581l;

        public C0383a(k kVar, K k10, p103i2.b bVar) throws ParserException {
            this.f36571a = kVar;
            this.f36572b = k10;
            this.f36573c = bVar;
            int i10 = bVar.f36591b;
            int iMax = Math.max(1, i10 / 10);
            this.f36577g = iMax;
            r rVar = new r(bVar.f36594e);
            rVar.n();
            int iN = rVar.n();
            this.f36574d = iN;
            int i11 = bVar.f36590a;
            int i12 = bVar.f36592c;
            int i13 = (((i12 - (i11 * 4)) * 8) / (bVar.f36593d * i11)) + 1;
            if (iN != i13) {
                throw ParserException.a(null, "Expected frames per block: " + i13 + "; got: " + iN);
            }
            int iE = A.e(iMax, iN);
            this.f36575e = new byte[iE * i12];
            this.f36576f = new r(iN * 2 * i11 * iE);
            int i14 = ((i12 * i10) * 8) / iN;
            n.a aVar = new n.a();
            aVar.f35338m = t.m("audio/raw");
            aVar.f35334h = i14;
            aVar.f35335i = i14;
            aVar.f35339n = iMax * 2 * i11;
            aVar.f35317C = i11;
            aVar.f35318D = i10;
            aVar.f35319E = 2;
            this.f36578h = new n(aVar);
        }

        @Override // i2.a.b
        public final void a(long j) {
            this.f36579i = 0;
            this.j = j;
            this.f36580k = 0;
            this.f36581l = 0L;
        }

        @Override // i2.a.b
        public final void b(int i10, long j) {
            this.f36571a.g(new d(this.f36573c, this.f36574d, i10, j));
            this.f36572b.d(this.f36578h);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x004f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0054  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:37:0x0143  */
        /* JADX WARN: Code duplicated, block: B:38:0x0147  */
        /* JADX WARN: Code duplicated, block: B:44:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x0117 A[EDGE_INSN: B:48:0x0117->B:35:0x0117 BREAK  A[LOOP:1: B:17:0x004b->B:34:0x010b], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
        @Override // i2.a.b
        public final boolean c(C0574i c0574i, long j) throws IOException {
            byte[] bArr;
            int i10;
            boolean z10;
            int i11;
            int i12;
            r rVar;
            int i13;
            int i14;
            int i15;
            int i16;
            byte[] bArr2;
            int i17;
            int i18;
            int iG;
            int[] iArr;
            int i19;
            int i20;
            int iG2;
            int i21;
            byte b10;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27 = this.f36580k;
            p103i2.b bVar = this.f36573c;
            int i28 = i27 / (bVar.f36590a * 2);
            int i29 = this.f36577g;
            int i30 = this.f36574d;
            int iE = A.e(i29 - i28, i30);
            int i31 = bVar.f36592c;
            int i32 = iE * i31;
            boolean z11 = j == 0;
            while (true) {
                bArr = this.f36575e;
                if (z11 && (i25 = this.f36579i) < i32) {
                    i26 = c0574i.read(bArr, this.f36579i, (int) Math.min(i32 - i25, j));
                    if (i26 == -1) {
                        break;
                    }
                    this.f36579i += i26;
                    bArr = this.f36575e;
                    if (z11) {
                    }
                }
                i10 = this.f36579i / i31;
                if (i10 > 0) {
                    i12 = 0;
                    while (true) {
                        rVar = this.f36576f;
                        if (i12 < i10) {
                            break;
                        }
                        i15 = 0;
                        while (true) {
                            i16 = bVar.f36590a;
                            if (i15 < i16) {
                                bArr2 = rVar.f41062a;
                                int i33 = (i15 * 4) + (i12 * i31);
                                i17 = (i16 * 4) + i33;
                                i18 = (i31 / i16) - 4;
                                iG = (short) ((bArr[i33] & 255) | ((bArr[i33 + 1] & 255) << 8));
                                int i34 = bArr[i33 + 2] & 255;
                                boolean z12 = z11;
                                int iMin = Math.min(i34, 88);
                                iArr = f36570n;
                                i19 = iArr[iMin];
                                i20 = ((i12 * i30 * i16) + i15) * 2;
                                bArr2[i20] = (byte) (iG & 255);
                                bArr2[i20 + 1] = (byte) (iG >> 8);
                                iG2 = iMin;
                                int i35 = i29;
                                i21 = 0;
                                while (i21 < i18 * 2) {
                                    b10 = bArr[((i21 / 8) * i16 * 4) + i17 + ((i21 / 2) % 4)];
                                    byte[] bArr3 = bArr;
                                    i22 = b10 & 255;
                                    if (i21 % 2 == 0) {
                                        i23 = b10 & 15;
                                    } else {
                                        i23 = i22 >> 4;
                                    }
                                    i24 = ((((i23 & 7) * 2) + 1) * i19) >> 3;
                                    if ((i23 & 8) != 0) {
                                        i24 = -i24;
                                    }
                                    iG = A.g(iG + i24, -32768, 32767);
                                    i20 = (i16 * 2) + i20;
                                    bArr2[i20] = (byte) (iG & 255);
                                    bArr2[i20 + 1] = (byte) (iG >> 8);
                                    iG2 = A.g(iG2 + f36569m[i23], 0, 88);
                                    i19 = iArr[iG2];
                                    i21++;
                                    i17 = i17;
                                    bArr = bArr3;
                                }
                                i15++;
                                z11 = z12;
                                i29 = i35;
                            }
                        }
                        i12++;
                    }
                    i13 = i29;
                    z10 = z11;
                    int i36 = i30 * i10 * 2 * bVar.f36590a;
                    rVar.G(0);
                    rVar.F(i36);
                    this.f36579i -= i10 * i31;
                    int i37 = rVar.f41064c;
                    this.f36572b.a(i37, rVar);
                    i14 = this.f36580k + i37;
                    this.f36580k = i14;
                    if (i14 / (bVar.f36590a * 2) >= i13) {
                        d(i13);
                    }
                } else {
                    z10 = z11;
                }
                if (z10 && (i11 = this.f36580k / (bVar.f36590a * 2)) > 0) {
                    d(i11);
                }
                return z10;
            }
            while (true) {
                bArr = this.f36575e;
                if (z11) {
                }
                i10 = this.f36579i / i31;
                if (i10 > 0) {
                    i12 = 0;
                    while (true) {
                        rVar = this.f36576f;
                        if (i12 < i10) {
                            break;
                            break;
                        }
                        i15 = 0;
                        while (true) {
                            i16 = bVar.f36590a;
                            if (i15 < i16) {
                                bArr2 = rVar.f41062a;
                                int i38 = (i15 * 4) + (i12 * i31);
                                i17 = (i16 * 4) + i38;
                                i18 = (i31 / i16) - 4;
                                iG = (short) ((bArr[i38] & 255) | ((bArr[i38 + 1] & 255) << 8));
                                int i39 = bArr[i38 + 2] & 255;
                                boolean z13 = z11;
                                int iMin2 = Math.min(i39, 88);
                                iArr = f36570n;
                                i19 = iArr[iMin2];
                                i20 = ((i12 * i30 * i16) + i15) * 2;
                                bArr2[i20] = (byte) (iG & 255);
                                bArr2[i20 + 1] = (byte) (iG >> 8);
                                iG2 = iMin2;
                                int i310 = i29;
                                i21 = 0;
                                while (i21 < i18 * 2) {
                                    b10 = bArr[((i21 / 8) * i16 * 4) + i17 + ((i21 / 2) % 4)];
                                    byte[] bArr4 = bArr;
                                    i22 = b10 & 255;
                                    if (i21 % 2 == 0) {
                                        i23 = b10 & 15;
                                    } else {
                                        i23 = i22 >> 4;
                                    }
                                    i24 = ((((i23 & 7) * 2) + 1) * i19) >> 3;
                                    if ((i23 & 8) != 0) {
                                        i24 = -i24;
                                    }
                                    iG = A.g(iG + i24, -32768, 32767);
                                    i20 = (i16 * 2) + i20;
                                    bArr2[i20] = (byte) (iG & 255);
                                    bArr2[i20 + 1] = (byte) (iG >> 8);
                                    iG2 = A.g(iG2 + f36569m[i23], 0, 88);
                                    i19 = iArr[iG2];
                                    i21++;
                                    i17 = i17;
                                    bArr = bArr4;
                                }
                                i15++;
                                z11 = z13;
                                i29 = i310;
                            }
                        }
                        i12++;
                    }
                    i13 = i29;
                    z10 = z11;
                    int i311 = i30 * i10 * 2 * bVar.f36590a;
                    rVar.G(0);
                    rVar.F(i311);
                    this.f36579i -= i10 * i31;
                    int i312 = rVar.f41064c;
                    this.f36572b.a(i312, rVar);
                    i14 = this.f36580k + i312;
                    this.f36580k = i14;
                    if (i14 / (bVar.f36590a * 2) >= i13) {
                        d(i13);
                    }
                } else {
                    z10 = z11;
                }
                if (z10) {
                    d(i11);
                }
                return z10;
                this.f36579i += i26;
            }
        }

        public final void d(int i10) {
            long j = this.j;
            long j10 = this.f36581l;
            p103i2.b bVar = this.f36573c;
            long j11 = bVar.f36591b;
            int i11 = A.f40996a;
            long jL = j + A.L(j10, 1000000L, j11, RoundingMode.DOWN);
            int i12 = i10 * 2 * bVar.f36590a;
            this.f36572b.b(jL, 1, i12, this.f36580k - i12, null);
            this.f36581l += (long) i10;
            this.f36580k -= i12;
        }
    }

    /* JADX INFO: compiled from: WavExtractor.java */
    public interface b {
        void a(long j);

        void b(int i10, long j) throws ParserException;

        boolean c(C0574i c0574i, long j) throws IOException;
    }

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f36582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f36583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p103i2.b f36584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n f36585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f36587f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36588g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f36589h;

        public c(k kVar, K k10, p103i2.b bVar, String str, int i10) throws ParserException {
            this.f36582a = kVar;
            this.f36583b = k10;
            this.f36584c = bVar;
            int i11 = bVar.f36593d;
            int i12 = bVar.f36590a;
            int i13 = (i11 * i12) / 8;
            int i14 = bVar.f36592c;
            if (i14 != i13) {
                throw ParserException.a(null, "Expected block size: " + i13 + "; got: " + i14);
            }
            int i15 = bVar.f36591b;
            int i16 = i15 * i13;
            int i17 = i16 * 8;
            int iMax = Math.max(i13, i16 / 10);
            this.f36586e = iMax;
            n.a aVar = new n.a();
            aVar.f35337l = t.m("audio/wav");
            aVar.f35338m = t.m(str);
            aVar.f35334h = i17;
            aVar.f35335i = i17;
            aVar.f35339n = iMax;
            aVar.f35317C = i12;
            aVar.f35318D = i15;
            aVar.f35319E = i10;
            this.f36585d = new n(aVar);
        }

        @Override // i2.a.b
        public final void a(long j) {
            this.f36587f = j;
            this.f36588g = 0;
            this.f36589h = 0L;
        }

        @Override // i2.a.b
        public final void b(int i10, long j) {
            this.f36582a.g(new d(this.f36584c, 1, i10, j));
            this.f36583b.d(this.f36585d);
        }

        @Override // i2.a.b
        public final boolean c(C0574i c0574i, long j) throws IOException {
            int i10;
            int i11;
            long j10 = j;
            while (j10 > 0 && (i10 = this.f36588g) < (i11 = this.f36586e)) {
                int iF = this.f36583b.f(c0574i, (int) Math.min(i11 - i10, j10), true);
                if (iF == -1) {
                    j10 = 0;
                } else {
                    this.f36588g += iF;
                    j10 -= (long) iF;
                }
            }
            p103i2.b bVar = this.f36584c;
            int i12 = this.f36588g;
            int i13 = bVar.f36592c;
            int i14 = i12 / i13;
            if (i14 > 0) {
                long j11 = this.f36587f;
                long j12 = this.f36589h;
                long j13 = bVar.f36591b;
                int i15 = A.f40996a;
                long jL = j11 + A.L(j12, 1000000L, j13, RoundingMode.DOWN);
                int i16 = i14 * i13;
                int i17 = this.f36588g - i16;
                this.f36583b.b(jL, 1, i16, i17, null);
                this.f36589h += (long) i14;
                this.f36588g = i17;
            }
            return j10 <= 0;
        }
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f36564c = j == 0 ? 0 : 4;
        b bVar = this.f36566e;
        if (bVar != null) {
            bVar.a(j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0197  */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        byte[] bArr;
        int iT;
        p241t7.b.l(this.f36563b);
        int i10 = A.f40996a;
        int i11 = this.f36564c;
        if (i11 == 0) {
            p241t7.b.k(((C0574i) qVar).f523d == 0);
            int i12 = this.f36567f;
            if (i12 != -1) {
                ((C0574i) qVar).i(i12);
                this.f36564c = 4;
            } else {
                C0574i c0574i = (C0574i) qVar;
                if (!p103i2.c.a(c0574i)) {
                    throw ParserException.a(null, "Unsupported or unrecognized wav file type.");
                }
                c0574i.i((int) (c0574i.d() - c0574i.f523d));
                this.f36564c = 1;
            }
            return 0;
        }
        long jK = -1;
        if (i11 == 1) {
            r rVar = new r(8);
            C0574i c0574i2 = (C0574i) qVar;
            i2.c.a aVarA = i2.c.a.a(c0574i2, rVar);
            if (aVarA.f36595a != 1685272116) {
                c0574i2.f525f = 0;
            } else {
                c0574i2.k(8, false);
                rVar.G(0);
                C0574i c0574i3 = (C0574i) qVar;
                c0574i3.c(rVar.f41062a, 0, 8, false);
                jK = rVar.k();
                c0574i3.i(((int) aVarA.f36596b) + 8);
            }
            this.f36565d = jK;
            this.f36564c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                p241t7.b.k(this.f36568g != -1);
                long j = this.f36568g - ((C0574i) qVar).f523d;
                b bVar = this.f36566e;
                bVar.getClass();
                return bVar.c((C0574i) qVar, j) ? -1 : 0;
            }
            ((C0574i) qVar).f525f = 0;
            C0574i c0574i4 = (C0574i) qVar;
            i2.c.a aVarB = p103i2.c.b(1684108385, c0574i4, new r(8));
            c0574i4.i(8);
            Pair pairCreate = Pair.create(Long.valueOf(c0574i4.f523d), Long.valueOf(aVarB.f36596b));
            this.f36567f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j10 = this.f36565d;
            if (j10 != -1 && jLongValue == 4294967295L) {
                jLongValue = j10;
            }
            long j11 = ((long) this.f36567f) + jLongValue;
            this.f36568g = j11;
            long j12 = c0574i4.f522c;
            if (j12 != -1 && j11 > j12) {
                p114j1.k.f("Data exceeds input length: " + this.f36568g + ", " + j12);
                this.f36568g = j12;
            }
            b bVar2 = this.f36566e;
            bVar2.getClass();
            bVar2.b(this.f36567f, this.f36568g);
            this.f36564c = 4;
            return 0;
        }
        r rVar2 = new r(16);
        C0574i c0574i5 = (C0574i) qVar;
        long j13 = p103i2.c.b(1718449184, c0574i5, rVar2).f36596b;
        p241t7.b.k(j13 >= 16);
        c0574i5.c(rVar2.f41062a, 0, 16, false);
        rVar2.G(0);
        int iN = rVar2.n();
        int iN2 = rVar2.n();
        int iM = rVar2.m();
        rVar2.m();
        int iN3 = rVar2.n();
        int iN4 = rVar2.n();
        int i13 = ((int) j13) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            ((C0574i) qVar).c(bArr, 0, i13, false);
        } else {
            bArr = A.f40998c;
        }
        byte[] bArr2 = bArr;
        C0574i c0574i6 = (C0574i) qVar;
        c0574i6.i((int) (c0574i6.d() - c0574i6.f523d));
        p103i2.b bVar3 = new p103i2.b(iN, iN2, iM, iN3, iN4, bArr2);
        if (iN == 17) {
            this.f36566e = new C0383a(this.f36562a, this.f36563b, bVar3);
        } else if (iN == 6) {
            this.f36566e = new c(this.f36562a, this.f36563b, bVar3, "audio/g711-alaw", -1);
        } else if (iN == 7) {
            this.f36566e = new c(this.f36562a, this.f36563b, bVar3, "audio/g711-mlaw", -1);
        } else {
            if (iN == 1) {
                iT = A.t(iN4);
            } else if (iN == 3) {
                iT = iN4 != 32 ? 0 : 4;
            } else if (iN != 65534) {
                iT = 0;
            } else {
                iT = A.t(iN4);
            }
            if (iT == 0) {
                throw ParserException.b("Unsupported WAV format type: " + iN);
            }
            this.f36566e = new c(this.f36562a, this.f36563b, bVar3, "audio/raw", iT);
        }
        this.f36564c = 3;
        return 0;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        return p103i2.c.a((C0574i) qVar);
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        k kVar = (k) rVar;
        this.f36562a = kVar;
        this.f36563b = kVar.p(0, 1);
        kVar.j();
    }

    @Override // A1.p
    public final void a() {
    }
}
