package S1;

import A1.C0566a;
import A1.C0569d;
import A1.C0572g;
import A1.C0574i;
import A1.C0579n;
import A1.E;
import A1.F;
import A1.K;
import A1.L;
import A1.p;
import A1.q;
import A1.r;
import T4.o0;
import U1.f;
import X1.l;
import X1.m;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.t;
import com.braze.Constants;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.g;
import p078g1.h;
import p078g1.k;
import p078g1.n;
import p114j1.A;
import p127k1.e;

/* JADX INFO: compiled from: MatroskaExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f5357f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f5358g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final byte[] f5359h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final byte[] f5360i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final UUID f5361j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final Map<String, Integer> f5362k0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f5363A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f5364B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f5365C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f5366D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f5367E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public o0 f5368F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public o0 f5369G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f5370H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5371I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f5372J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f5373K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f5374L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f5375M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f5376N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int[] f5377O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f5378P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f5379Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f5380R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f5381S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f5382T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f5383U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f5384V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f5385W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f5386X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f5387Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f5388Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.a f5389a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f5390a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5391b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f5392b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<C0077b> f5393c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public byte f5394c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5395d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f5396d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5397e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public r f5398e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l.a f5399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p114j1.r f5400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p114j1.r f5401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p114j1.r f5402i;
    public final p114j1.r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p114j1.r f5403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p114j1.r f5404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p114j1.r f5405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p114j1.r f5406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p114j1.r f5407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p114j1.r f5408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f5409q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f5410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5413u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0077b f5416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f5417y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5418z;

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public final class a {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:124:0x02a2  */
        public final void a(int i10, int i11, C0574i c0574i) throws IOException {
            C0077b c0077b;
            C0077b c0077b2;
            C0077b c0077b3;
            long j;
            int i12;
            int i13;
            int i14;
            int i15;
            b bVar = b.this;
            SparseArray<C0077b> sparseArray = bVar.f5393c;
            int i16 = 4;
            int i17 = 0;
            int i18 = 1;
            if (i10 != 161 && i10 != 163) {
                if (i10 == 165) {
                    if (bVar.f5372J != 2) {
                        return;
                    }
                    C0077b c0077b4 = sparseArray.get(bVar.f5378P);
                    if (bVar.f5381S != 4 || !"V_VP9".equals(c0077b4.f5449c)) {
                        c0574i.i(i11);
                        return;
                    }
                    p114j1.r rVar = bVar.f5408p;
                    rVar.D(i11);
                    c0574i.a(rVar.f41062a, 0, i11, false);
                    return;
                }
                if (i10 == 16877) {
                    bVar.d(i10);
                    C0077b c0077b5 = bVar.f5416x;
                    int i19 = c0077b5.f5454h;
                    if (i19 != 1685485123 && i19 != 1685480259) {
                        c0574i.i(i11);
                        return;
                    }
                    byte[] bArr = new byte[i11];
                    c0077b5.f5435P = bArr;
                    c0574i.a(bArr, 0, i11, false);
                    return;
                }
                if (i10 == 16981) {
                    bVar.d(i10);
                    byte[] bArr2 = new byte[i11];
                    bVar.f5416x.j = bArr2;
                    c0574i.a(bArr2, 0, i11, false);
                    return;
                }
                if (i10 == 18402) {
                    byte[] bArr3 = new byte[i11];
                    c0574i.a(bArr3, 0, i11, false);
                    bVar.d(i10);
                    bVar.f5416x.f5456k = new K.a(1, 0, 0, bArr3);
                    return;
                }
                if (i10 == 21419) {
                    p114j1.r rVar2 = bVar.f5403k;
                    Arrays.fill(rVar2.f41062a, (byte) 0);
                    c0574i.a(rVar2.f41062a, 4 - i11, i11, false);
                    rVar2.G(0);
                    bVar.f5418z = (int) rVar2.w();
                    return;
                }
                if (i10 == 25506) {
                    bVar.d(i10);
                    byte[] bArr4 = new byte[i11];
                    bVar.f5416x.f5457l = bArr4;
                    c0574i.a(bArr4, 0, i11, false);
                    return;
                }
                if (i10 != 30322) {
                    throw ParserException.a(null, "Unexpected id: " + i10);
                }
                bVar.d(i10);
                byte[] bArr5 = new byte[i11];
                bVar.f5416x.f5469x = bArr5;
                c0574i.a(bArr5, 0, i11, false);
                return;
            }
            int i20 = bVar.f5372J;
            p114j1.r rVar3 = bVar.f5402i;
            if (i20 == 0) {
                d dVar = bVar.f5391b;
                bVar.f5378P = (int) dVar.c(c0574i, false, true, 8);
                bVar.f5379Q = dVar.f5477c;
                bVar.f5374L = -9223372036854775807L;
                bVar.f5372J = 1;
                rVar3.D(0);
            }
            C0077b c0077b6 = sparseArray.get(bVar.f5378P);
            if (c0077b6 == null) {
                c0574i.i(i11 - bVar.f5379Q);
                bVar.f5372J = 0;
                return;
            }
            c0077b6.f5445Z.getClass();
            if (bVar.f5372J == 1) {
                bVar.j(c0574i, 3);
                int i21 = (rVar3.f41062a[2] & 6) >> 1;
                byte b10 = 255;
                if (i21 == 0) {
                    bVar.f5376N = 1;
                    int[] iArr = bVar.f5377O;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    bVar.f5377O = iArr;
                    iArr[0] = (i11 - bVar.f5379Q) - 3;
                } else {
                    bVar.j(c0574i, 4);
                    int i22 = (rVar3.f41062a[3] & 255) + 1;
                    bVar.f5376N = i22;
                    int[] iArr2 = bVar.f5377O;
                    if (iArr2 == null) {
                        iArr2 = new int[i22];
                    } else if (iArr2.length < i22) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                    }
                    bVar.f5377O = iArr2;
                    if (i21 == 2) {
                        int i23 = (i11 - bVar.f5379Q) - 4;
                        int i24 = bVar.f5376N;
                        Arrays.fill(iArr2, 0, i24, i23 / i24);
                    } else {
                        if (i21 == 1) {
                            int i25 = 0;
                            int i26 = 0;
                            while (true) {
                                i12 = bVar.f5376N - 1;
                                if (i25 >= i12) {
                                    break;
                                }
                                bVar.f5377O[i25] = 0;
                                while (true) {
                                    i13 = i16 + 1;
                                    bVar.j(c0574i, i13);
                                    int i27 = rVar3.f41062a[i16] & 255;
                                    int[] iArr3 = bVar.f5377O;
                                    i14 = iArr3[i25] + i27;
                                    iArr3[i25] = i14;
                                    if (i27 != 255) {
                                        break;
                                    } else {
                                        i16 = i13;
                                    }
                                }
                                i26 += i14;
                                i25++;
                                i16 = i13;
                            }
                            bVar.f5377O[i12] = ((i11 - bVar.f5379Q) - i16) - i26;
                        } else {
                            if (i21 != 3) {
                                throw ParserException.a(null, "Unexpected lacing value: " + i21);
                            }
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                int i30 = bVar.f5376N - i18;
                                if (i28 >= i30) {
                                    c0077b2 = c0077b6;
                                    bVar.f5377O[i30] = ((i11 - bVar.f5379Q) - i16) - i29;
                                    break;
                                }
                                bVar.f5377O[i28] = i17;
                                int i31 = i16 + 1;
                                bVar.j(c0574i, i31);
                                if (rVar3.f41062a[i16] == 0) {
                                    throw ParserException.a(null, "No valid varint length mask found");
                                }
                                int i32 = i17;
                                while (true) {
                                    if (i32 >= 8) {
                                        c0077b3 = c0077b6;
                                        j = 0;
                                        i16 = i31;
                                        break;
                                    }
                                    int i33 = i18 << (7 - i32);
                                    if ((rVar3.f41062a[i16] & i33) != 0) {
                                        int i34 = i31 + i32;
                                        bVar.j(c0574i, i34);
                                        C0077b c0077b7 = c0077b6;
                                        j = rVar3.f41062a[i16] & b10 & (~i33);
                                        while (i31 < i34) {
                                            j = (j << 8) | ((long) (rVar3.f41062a[i31] & 255));
                                            i31++;
                                            i34 = i34;
                                            c0077b7 = c0077b7;
                                        }
                                        c0077b3 = c0077b7;
                                        int i35 = i34;
                                        if (i28 > 0) {
                                            j -= (1 << ((i32 * 7) + 6)) - 1;
                                        }
                                        i16 = i35;
                                        break;
                                    }
                                    i32++;
                                    b10 = 255;
                                    i18 = 1;
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    throw ParserException.a(null, "EBML lacing sample size out of range.");
                                }
                                int i36 = (int) j;
                                int[] iArr4 = bVar.f5377O;
                                if (i28 != 0) {
                                    i36 += iArr4[i28 - 1];
                                }
                                iArr4[i28] = i36;
                                i29 += i36;
                                i28++;
                                c0077b6 = c0077b3;
                                b10 = 255;
                                i17 = 0;
                                i18 = 1;
                            }
                        }
                        byte[] bArr6 = rVar3.f41062a;
                        bVar.f5373K = bVar.n((bArr6[1] & 255) | (bArr6[0] << 8)) + bVar.f5367E;
                        c0077b = c0077b2;
                        if (c0077b.f5451e != 2 || (i10 == 163 && (rVar3.f41062a[2] & 128) == 128)) {
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                        bVar.f5380R = i15;
                        bVar.f5372J = 2;
                        bVar.f5375M = 0;
                    }
                }
                c0077b2 = c0077b6;
                byte[] bArr7 = rVar3.f41062a;
                bVar.f5373K = bVar.n((bArr7[1] & 255) | (bArr7[0] << 8)) + bVar.f5367E;
                c0077b = c0077b2;
                if (c0077b.f5451e != 2) {
                    i15 = 1;
                } else {
                    i15 = 1;
                }
                bVar.f5380R = i15;
                bVar.f5372J = 2;
                bVar.f5375M = 0;
            } else {
                c0077b = c0077b6;
            }
            if (i10 == 163) {
                while (true) {
                    int i37 = bVar.f5375M;
                    if (i37 >= bVar.f5376N) {
                        bVar.f5372J = 0;
                        return;
                    }
                    bVar.e(c0077b, ((long) ((bVar.f5375M * c0077b.f5452f) / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS)) + bVar.f5373K, bVar.f5380R, bVar.o(c0574i, c0077b, bVar.f5377O[i37], false), 0);
                    bVar.f5375M++;
                    c0077b = c0077b;
                }
            } else {
                C0077b c0077b8 = c0077b;
                while (true) {
                    int i38 = bVar.f5375M;
                    if (i38 >= bVar.f5376N) {
                        return;
                    }
                    int[] iArr5 = bVar.f5377O;
                    iArr5[i38] = bVar.o(c0574i, c0077b8, iArr5[i38], true);
                    bVar.f5375M++;
                }
            }
        }

        public final void b(int i10, long j) throws ParserException {
            b bVar = b.this;
            bVar.getClass();
            if (i10 == 20529) {
                if (j == 0) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
            }
            if (i10 == 20530) {
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
            }
            switch (i10) {
                case 131:
                    bVar.d(i10);
                    bVar.f5416x.f5451e = (int) j;
                    return;
                case 136:
                    bVar.d(i10);
                    bVar.f5416x.f5443X = j == 1;
                    return;
                case 155:
                    bVar.f5374L = bVar.n(j);
                    return;
                case 159:
                    bVar.d(i10);
                    bVar.f5416x.f5436Q = (int) j;
                    return;
                case 176:
                    bVar.d(i10);
                    bVar.f5416x.f5459n = (int) j;
                    return;
                case 179:
                    bVar.c(i10);
                    bVar.f5368F.a(bVar.n(j));
                    return;
                case 186:
                    bVar.d(i10);
                    bVar.f5416x.f5460o = (int) j;
                    return;
                case 215:
                    bVar.d(i10);
                    bVar.f5416x.f5450d = (int) j;
                    return;
                case 231:
                    bVar.f5367E = bVar.n(j);
                    return;
                case 238:
                    bVar.f5381S = (int) j;
                    return;
                case 241:
                    if (bVar.f5370H) {
                        return;
                    }
                    bVar.c(i10);
                    bVar.f5369G.a(j);
                    bVar.f5370H = true;
                    return;
                case 251:
                    bVar.f5382T = true;
                    return;
                case 16871:
                    bVar.d(i10);
                    bVar.f5416x.f5454h = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    bVar.f5363A = j + bVar.f5411s;
                    return;
                case 21432:
                    int i11 = (int) j;
                    bVar.d(i10);
                    if (i11 == 0) {
                        bVar.f5416x.f5470y = 0;
                        return;
                    }
                    if (i11 == 1) {
                        bVar.f5416x.f5470y = 2;
                        return;
                    } else if (i11 == 3) {
                        bVar.f5416x.f5470y = 1;
                        return;
                    } else {
                        if (i11 != 15) {
                            return;
                        }
                        bVar.f5416x.f5470y = 3;
                        return;
                    }
                case 21680:
                    bVar.d(i10);
                    bVar.f5416x.f5462q = (int) j;
                    return;
                case 21682:
                    bVar.d(i10);
                    bVar.f5416x.f5464s = (int) j;
                    return;
                case 21690:
                    bVar.d(i10);
                    bVar.f5416x.f5463r = (int) j;
                    return;
                case 21930:
                    bVar.d(i10);
                    bVar.f5416x.f5442W = j == 1;
                    return;
                case 21938:
                    bVar.d(i10);
                    C0077b c0077b = bVar.f5416x;
                    c0077b.f5471z = true;
                    c0077b.f5461p = (int) j;
                    return;
                case 21998:
                    bVar.d(i10);
                    bVar.f5416x.f5453g = (int) j;
                    return;
                case 22186:
                    bVar.d(i10);
                    bVar.f5416x.f5439T = j;
                    return;
                case 22203:
                    bVar.d(i10);
                    bVar.f5416x.f5440U = j;
                    return;
                case 25188:
                    bVar.d(i10);
                    bVar.f5416x.f5437R = (int) j;
                    return;
                case 30114:
                    bVar.f5383U = j;
                    return;
                case 30321:
                    bVar.d(i10);
                    int i12 = (int) j;
                    if (i12 == 0) {
                        bVar.f5416x.f5465t = 0;
                        return;
                    }
                    if (i12 == 1) {
                        bVar.f5416x.f5465t = 1;
                        return;
                    } else if (i12 == 2) {
                        bVar.f5416x.f5465t = 2;
                        return;
                    } else {
                        if (i12 != 3) {
                            return;
                        }
                        bVar.f5416x.f5465t = 3;
                        return;
                    }
                case 2352003:
                    bVar.d(i10);
                    bVar.f5416x.f5452f = (int) j;
                    return;
                case 2807729:
                    bVar.f5412t = j;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            bVar.d(i10);
                            int i13 = (int) j;
                            if (i13 == 1) {
                                bVar.f5416x.f5422C = 2;
                                return;
                            } else {
                                if (i13 != 2) {
                                    return;
                                }
                                bVar.f5416x.f5422C = 1;
                                return;
                            }
                        case 21946:
                            bVar.d(i10);
                            int iG = h.g((int) j);
                            if (iG != -1) {
                                bVar.f5416x.f5421B = iG;
                                return;
                            }
                            return;
                        case 21947:
                            bVar.d(i10);
                            bVar.f5416x.f5471z = true;
                            int iF = h.f((int) j);
                            if (iF != -1) {
                                bVar.f5416x.f5420A = iF;
                                return;
                            }
                            return;
                        case 21948:
                            bVar.d(i10);
                            bVar.f5416x.f5423D = (int) j;
                            return;
                        case 21949:
                            bVar.d(i10);
                            bVar.f5416x.f5424E = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }

        public final void c(int i10, long j, long j10) throws ParserException {
            b bVar = b.this;
            p241t7.b.l(bVar.f5398e0);
            if (i10 == 160) {
                bVar.f5382T = false;
                bVar.f5383U = 0L;
                return;
            }
            if (i10 == 174) {
                C0077b c0077b = new C0077b();
                bVar.f5416x = c0077b;
                c0077b.f5446a = bVar.f5415w;
                return;
            }
            if (i10 == 187) {
                bVar.f5370H = false;
                return;
            }
            if (i10 == 19899) {
                bVar.f5418z = -1;
                bVar.f5363A = -1L;
                return;
            }
            if (i10 == 20533) {
                bVar.d(i10);
                bVar.f5416x.f5455i = true;
                return;
            }
            if (i10 == 21968) {
                bVar.d(i10);
                bVar.f5416x.f5471z = true;
                return;
            }
            if (i10 == 408125543) {
                long j11 = bVar.f5411s;
                if (j11 != -1 && j11 != j) {
                    throw ParserException.a(null, "Multiple Segment elements not supported");
                }
                bVar.f5411s = j;
                bVar.f5410r = j10;
                return;
            }
            if (i10 == 475249515) {
                bVar.f5368F = new o0(2, false);
                bVar.f5369G = new o0(2, false);
            } else if (i10 == 524531317 && !bVar.f5417y) {
                if (bVar.f5395d && bVar.f5365C != -1) {
                    bVar.f5364B = true;
                } else {
                    bVar.f5398e0.g(new F.b(bVar.f5414v));
                    bVar.f5417y = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: S1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class C0077b {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public byte[] f5435P;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public L f5441V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public boolean f5442W;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public K f5445Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5446a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f5447a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5454h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f5455i;
        public byte[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public K.a f5456k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f5457l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public k f5458m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5459n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f5460o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f5461p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f5462q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f5463r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f5464s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5465t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f5466u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f5467v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f5468w = 0.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f5469x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f5470y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f5471z = false;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f5420A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f5421B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f5422C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f5423D = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f5424E = t.d.DEFAULT_DRAG_ANIMATION_DURATION;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f5425F = -1.0f;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public float f5426G = -1.0f;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public float f5427H = -1.0f;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f5428I = -1.0f;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public float f5429J = -1.0f;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public float f5430K = -1.0f;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f5431L = -1.0f;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public float f5432M = -1.0f;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public float f5433N = -1.0f;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f5434O = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f5436Q = 1;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f5437R = -1;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f5438S = 8000;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public long f5439T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public long f5440U = 0;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f5443X = true;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public String f5444Y = "eng";

        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.f5457l;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        int i10 = A.f40996a;
        f5358g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f5359h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f5360i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f5361j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        f.b(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        f.b(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f5362k0 = Collections.unmodifiableMap(map);
    }

    public b(l.a aVar, int i10) {
        S1.a aVar2 = new S1.a();
        this.f5411s = -1L;
        this.f5412t = -9223372036854775807L;
        this.f5413u = -9223372036854775807L;
        this.f5414v = -9223372036854775807L;
        this.f5365C = -1L;
        this.f5366D = -1L;
        this.f5367E = -9223372036854775807L;
        this.f5389a = aVar2;
        aVar2.f5351d = new a();
        this.f5399f = aVar;
        this.f5395d = (i10 & 1) == 0;
        this.f5397e = (i10 & 2) == 0;
        this.f5391b = new d();
        this.f5393c = new SparseArray<>();
        this.f5402i = new p114j1.r(4);
        this.j = new p114j1.r(ByteBuffer.allocate(4).putInt(-1).array());
        this.f5403k = new p114j1.r(4);
        this.f5400g = new p114j1.r(e.f41399a);
        this.f5401h = new p114j1.r(4);
        this.f5404l = new p114j1.r();
        this.f5405m = new p114j1.r();
        this.f5406n = new p114j1.r(8);
        this.f5407o = new p114j1.r();
        this.f5408p = new p114j1.r();
        this.f5377O = new int[1];
    }

    public static byte[] i(String str, long j, long j10) {
        p241t7.b.e(j != -9223372036854775807L);
        int i10 = (int) (j / 3600000000L);
        long j11 = j - (((long) i10) * 3600000000L);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - (((long) i11) * 60000000);
        int i12 = (int) (j12 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (((long) i12) * 1000000)) / j10)));
        int i13 = A.f40996a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final void c(int i10) throws ParserException {
        if (this.f5368F == null || this.f5369G == null) {
            throw ParserException.a(null, "Element " + i10 + " must be in a Cues");
        }
    }

    public final void d(int i10) throws ParserException {
        if (this.f5416x != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void e(C0077b c0077b, long j, int i10, int i11, int i12) {
        byte[] bArrI;
        int i13;
        int i14;
        L l10 = c0077b.f5441V;
        if (l10 != null) {
            l10.b(c0077b.f5445Z, j, i10, i11, i12, c0077b.f5456k);
        } else {
            if ("S_TEXT/UTF8".equals(c0077b.f5449c) || "S_TEXT/ASS".equals(c0077b.f5449c) || "S_TEXT/WEBVTT".equals(c0077b.f5449c)) {
                if (this.f5376N > 1) {
                    p114j1.k.f("Skipping subtitle sample in laced block.");
                } else {
                    long j10 = this.f5374L;
                    if (j10 == -9223372036854775807L) {
                        p114j1.k.f("Skipping subtitle sample with no duration.");
                    } else {
                        String str = c0077b.f5449c;
                        p114j1.r rVar = this.f5405m;
                        byte[] bArr = rVar.f41062a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrI = i("%01d:%02d:%02d:%02d", j10, 10000L);
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrI = i("%02d:%02d:%02d.%03d", j10, 1000L);
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrI = i("%02d:%02d:%02d,%03d", j10, 1000L);
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrI, 0, bArr, i13, bArrI.length);
                        for (int i15 = rVar.f41063b; i15 < rVar.f41064c; i15++) {
                            if (rVar.f41062a[i15] == 0) {
                                rVar.F(i15);
                                c0077b.f5445Z.a(rVar.f41064c, rVar);
                                i14 = i11 + rVar.f41064c;
                            }
                        }
                        c0077b.f5445Z.a(rVar.f41064c, rVar);
                        i14 = i11 + rVar.f41064c;
                    }
                }
                i14 = i11;
            } else {
                i14 = i11;
            }
            if ((i10 & 268435456) != 0) {
                int i16 = this.f5376N;
                p114j1.r rVar2 = this.f5408p;
                if (i16 > 1) {
                    rVar2.D(0);
                } else {
                    int i17 = rVar2.f41064c;
                    c0077b.f5445Z.c(rVar2, i17, 2);
                    i14 += i17;
                }
            }
            c0077b.f5445Z.b(j, i10, i14, i12, c0077b.f5456k);
        }
        this.f5371I = true;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f5367E = -9223372036854775807L;
        this.f5372J = 0;
        S1.a aVar = this.f5389a;
        aVar.f5352e = 0;
        aVar.f5349b.clear();
        d dVar = aVar.f5350c;
        dVar.f5476b = 0;
        dVar.f5477c = 0;
        d dVar2 = this.f5391b;
        dVar2.f5476b = 0;
        dVar2.f5477c = 0;
        k();
        int i10 = 0;
        while (true) {
            SparseArray<C0077b> sparseArray = this.f5393c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            L l10 = sparseArray.valueAt(i10).f5441V;
            if (l10 != null) {
                l10.f434b = false;
                l10.f435c = 0;
            }
            i10++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:243:0x049b A[PHI: r34
      0x049b: PHI (r34v37 java.lang.String) = 
      (r34v3 java.lang.String)
      (r34v4 java.lang.String)
      (r34v5 java.lang.String)
      (r34v6 java.lang.String)
      (r34v7 java.lang.String)
      (r34v8 java.lang.String)
      (r34v9 java.lang.String)
      (r34v10 java.lang.String)
      (r34v11 java.lang.String)
      (r34v12 java.lang.String)
      (r34v13 java.lang.String)
      (r34v14 java.lang.String)
      (r34v15 java.lang.String)
      (r34v16 java.lang.String)
      (r34v17 java.lang.String)
      (r34v18 java.lang.String)
      (r34v19 java.lang.String)
      (r34v20 java.lang.String)
      (r34v21 java.lang.String)
      (r34v22 java.lang.String)
      (r34v23 java.lang.String)
      (r34v24 java.lang.String)
      (r34v25 java.lang.String)
      (r34v26 java.lang.String)
      (r34v27 java.lang.String)
      (r34v28 java.lang.String)
      (r34v29 java.lang.String)
      (r34v30 java.lang.String)
      (r34v31 java.lang.String)
      (r34v32 java.lang.String)
      (r34v33 java.lang.String)
      (r34v34 java.lang.String)
      (r34v38 java.lang.String)
     binds: [B:373:0x0682, B:369:0x0677, B:365:0x066c, B:361:0x0661, B:357:0x0656, B:353:0x064b, B:349:0x0640, B:345:0x0633, B:341:0x0623, B:337:0x0613, B:333:0x0603, B:329:0x05f3, B:325:0x05e3, B:321:0x05d3, B:317:0x05c3, B:313:0x05b3, B:309:0x05a3, B:305:0x0593, B:301:0x0583, B:297:0x0573, B:293:0x0563, B:289:0x0553, B:285:0x0543, B:281:0x0533, B:277:0x0523, B:273:0x0513, B:269:0x0503, B:265:0x04f3, B:261:0x04e3, B:257:0x04d3, B:253:0x04c3, B:249:0x04b3, B:242:0x0499] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:543:0x0af9  */
    /* JADX WARN: Code duplicated, block: B:548:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:553:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:555:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:557:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:562:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:564:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:567:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:570:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:573:0x0b6b  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:593:0x0ba7  */
    /* JADX WARN: Code duplicated, block: B:597:0x0c59  */
    /* JADX WARN: Code duplicated, block: B:600:0x0c5e  */
    /* JADX WARN: Code duplicated, block: B:603:0x0c71  */
    /* JADX WARN: Code duplicated, block: B:606:0x0c76  */
    /* JADX WARN: Code duplicated, block: B:612:0x0c8f  */
    /* JADX WARN: Code duplicated, block: B:613:0x0c91  */
    /* JADX WARN: Code duplicated, block: B:615:0x0c9b  */
    /* JADX WARN: Code duplicated, block: B:616:0x0c9e  */
    /* JADX WARN: Code duplicated, block: B:618:0x0ca8  */
    /* JADX WARN: Code duplicated, block: B:624:0x0cc0  */
    /* JADX WARN: Code duplicated, block: B:626:0x0cdc  */
    /* JADX WARN: Code duplicated, block: B:628:0x0ce4  */
    /* JADX WARN: Code duplicated, block: B:644:0x0d14  */
    /* JADX WARN: Code duplicated, block: B:649:0x0d28  */
    /* JADX WARN: Code duplicated, block: B:650:0x0d2b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v87, types: [A1.i, A1.q] */
    /* JADX WARN: Type inference failed for: r0v96, types: [S1.b$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [S1.d] */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        ArrayDeque<S1.a.C0076a> arrayDeque;
        String str;
        boolean z10;
        b bVar;
        E e11;
        boolean z11;
        int i10;
        String str2;
        int iB;
        int iA;
        String str3;
        boolean z12;
        byte b10;
        byte b11;
        byte b12;
        List<byte[]> listSingletonList;
        int iT;
        String str4;
        int i11;
        RuntimeException runtimeException;
        Pair pair;
        String str5;
        List<byte[]> listM;
        int iT2;
        int i12;
        n.a aVar;
        boolean zI;
        int i13;
        int i14;
        int i15;
        float f10;
        h hVar;
        String str6;
        int iIntValue;
        byte[] bArr;
        int i16;
        int i17;
        int i18;
        String str7;
        String str8;
        b bVar2;
        C0077b c0077b;
        C0579n c0579nI;
        String str9;
        String str10;
        String str11;
        F bVar3;
        int i19;
        b bVar4 = this;
        String str12 = "A_MPEG/L2";
        String str13 = "A_VORBIS";
        String str14 = "A_TRUEHD";
        String str15 = "A_MS/ACM";
        String str16 = "V_MPEG4/ISO/SP";
        String str17 = "V_MPEG4/ISO/AP";
        String str18 = "A_OPUS";
        bVar4.f5371I = false;
        boolean z13 = true;
        while (z13 && !bVar4.f5371I) {
            S1.a aVar2 = bVar4.f5389a;
            p241t7.b.l(aVar2.f5351d);
            while (true) {
                ArrayDeque<S1.a.C0076a> arrayDeque2 = aVar2.f5349b;
                S1.a.C0076a c0076aPeek = arrayDeque2.peek();
                if (c0076aPeek != null) {
                    arrayDeque = arrayDeque2;
                    if (((C0574i) qVar).f523d >= c0076aPeek.f5356b) {
                        a aVar3 = aVar2.f5351d;
                        int i20 = arrayDeque.pop().f5355a;
                        b bVar5 = b.this;
                        p241t7.b.l(bVar5.f5398e0);
                        SparseArray sparseArray = bVar5.f5393c;
                        if (i20 == 160) {
                            str12 = str12;
                            str14 = str14;
                            str15 = str15;
                            str16 = str16;
                            str3 = str18;
                            str = str13;
                            if (bVar5.f5372J != 2) {
                                str18 = str3;
                                z12 = false;
                            } else {
                                C0077b c0077b2 = (C0077b) sparseArray.get(bVar5.f5378P);
                                c0077b2.f5445Z.getClass();
                                if (bVar5.f5383U > 0) {
                                    str18 = str3;
                                    if (str18.equals(c0077b2.f5449c)) {
                                        byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(bVar5.f5383U).array();
                                        p114j1.r rVar = bVar5.f5408p;
                                        rVar.getClass();
                                        rVar.E(bArrArray.length, bArrArray);
                                    }
                                } else {
                                    str18 = str3;
                                }
                                int i21 = 0;
                                for (int i22 = 0; i22 < bVar5.f5376N; i22++) {
                                    i21 += bVar5.f5377O[i22];
                                }
                                for (int i23 = 0; i23 < bVar5.f5376N; i23++) {
                                    long j = bVar5.f5373K + ((long) ((c0077b2.f5452f * i23) / Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
                                    int i24 = bVar5.f5380R;
                                    if (i23 == 0 && !bVar5.f5382T) {
                                        i24 |= 1;
                                    }
                                    int i25 = bVar5.f5377O[i23];
                                    i21 -= i25;
                                    bVar5.e(c0077b2, j, i24, i25, i21);
                                }
                                z12 = false;
                                bVar5.f5372J = 0;
                            }
                        } else if (i20 != 174) {
                            if (i20 == 19899) {
                                str9 = str14;
                                str10 = str15;
                                str11 = str16;
                                str17 = str17;
                                str = str13;
                                int i26 = bVar5.f5418z;
                                if (i26 != -1) {
                                    long j10 = bVar5.f5363A;
                                    if (j10 != -1) {
                                        if (i26 == 475249515) {
                                            bVar5.f5365C = j10;
                                        }
                                    }
                                }
                                throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i20 == 25152) {
                                str9 = str14;
                                str10 = str15;
                                str11 = str16;
                                str17 = str17;
                                str = str13;
                                bVar5.d(i20);
                                C0077b c0077b3 = bVar5.f5416x;
                                if (c0077b3.f5455i) {
                                    K.a aVar4 = c0077b3.f5456k;
                                    if (aVar4 == null) {
                                        throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    c0077b3.f5458m = new k(null, true, new k.b(g.f35248a, null, "video/webm", aVar4.f430b));
                                }
                            } else if (i20 == 28032) {
                                str9 = str14;
                                str10 = str15;
                                str11 = str16;
                                str17 = str17;
                                str = str13;
                                bVar5.d(i20);
                                C0077b c0077b4 = bVar5.f5416x;
                                if (c0077b4.f5455i && c0077b4.j != null) {
                                    throw ParserException.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i20 == 357149030) {
                                str9 = str14;
                                str10 = str15;
                                str11 = str16;
                                str17 = str17;
                                str = str13;
                                if (bVar5.f5412t == -9223372036854775807L) {
                                    bVar5.f5412t = 1000000L;
                                }
                                long j11 = bVar5.f5413u;
                                if (j11 != -9223372036854775807L) {
                                    bVar5.f5414v = bVar5.n(j11);
                                }
                            } else if (i20 == 374648427) {
                                str9 = str14;
                                str10 = str15;
                                str11 = str16;
                                str17 = str17;
                                str = str13;
                                if (sparseArray.size() == 0) {
                                    throw ParserException.a(null, "No valid tracks were found");
                                }
                                bVar5.f5398e0.j();
                            } else if (i20 != 475249515) {
                                str12 = str12;
                                str14 = str14;
                                str15 = str15;
                                str16 = str16;
                                str18 = str18;
                                str = str13;
                                z12 = false;
                            } else {
                                if (bVar5.f5417y) {
                                    str9 = str14;
                                    str10 = str15;
                                    str11 = str16;
                                    str17 = str17;
                                    str = str13;
                                } else {
                                    r rVar2 = bVar5.f5398e0;
                                    o0 o0Var = bVar5.f5368F;
                                    o0 o0Var2 = bVar5.f5369G;
                                    if (bVar5.f5411s == -1 || bVar5.f5414v == -9223372036854775807L || o0Var == null || (i19 = o0Var.f5989a) == 0 || o0Var2 == null || o0Var2.f5989a != i19) {
                                        str9 = str14;
                                        str10 = str15;
                                        str11 = str16;
                                        str = str13;
                                        bVar3 = new F.b(bVar5.f5414v);
                                    } else {
                                        int[] iArrCopyOf = new int[i19];
                                        long[] jArrCopyOf = new long[i19];
                                        long[] jArrCopyOf2 = new long[i19];
                                        long[] jArrCopyOf3 = new long[i19];
                                        int i27 = 0;
                                        while (i27 < i19) {
                                            jArrCopyOf3[i27] = o0Var.c(i27);
                                            jArrCopyOf[i27] = o0Var2.c(i27) + bVar5.f5411s;
                                            i27++;
                                            str15 = str15;
                                            str16 = str16;
                                        }
                                        str10 = str15;
                                        str11 = str16;
                                        int i28 = 0;
                                        while (true) {
                                            int i29 = i19 - 1;
                                            if (i28 < i29) {
                                                int i30 = i28 + 1;
                                                iArrCopyOf[i28] = (int) (jArrCopyOf[i30] - jArrCopyOf[i28]);
                                                jArrCopyOf2[i28] = jArrCopyOf3[i30] - jArrCopyOf3[i28];
                                                i19 = i19;
                                                i28 = i30;
                                            } else {
                                                int i31 = i29;
                                                while (true) {
                                                    if (i31 > 0) {
                                                        str = str13;
                                                        str9 = str14;
                                                        if (jArrCopyOf3[i31] > bVar5.f5414v) {
                                                            i31--;
                                                            str13 = str;
                                                            str14 = str9;
                                                        }
                                                    } else {
                                                        str = str13;
                                                        str9 = str14;
                                                    }
                                                }
                                                iArrCopyOf[i31] = (int) ((bVar5.f5411s + bVar5.f5410r) - jArrCopyOf[i31]);
                                                jArrCopyOf2[i31] = bVar5.f5414v - jArrCopyOf3[i31];
                                                if (i31 < i29) {
                                                    p114j1.k.f("Discarding trailing cue points with timestamps greater than total duration");
                                                    int i32 = i31 + 1;
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i32);
                                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i32);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i32);
                                                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i32);
                                                }
                                                bVar3 = new C0572g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                            }
                                        }
                                    }
                                    rVar2.g(bVar3);
                                    bVar5.f5417y = true;
                                }
                                bVar5.f5368F = null;
                                bVar5.f5369G = null;
                            }
                            str18 = str18;
                            str17 = str17;
                            str15 = str10;
                            str16 = str11;
                            z12 = false;
                            str12 = str12;
                            str14 = str9;
                        } else {
                            String str19 = str14;
                            String str20 = str15;
                            String str21 = str16;
                            String str22 = str17;
                            str = str13;
                            ?? r10 = bVar5.f5416x;
                            p241t7.b.l(r10);
                            String str23 = r10.f5449c;
                            if (str23 == null) {
                                throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str23.hashCode()) {
                                case -2095576542:
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    b10 = str23.equals(str17) ? (byte) 0 : (byte) -1;
                                    break;
                                case -2095575984:
                                    str14 = str19;
                                    str15 = str20;
                                    str16 = str21;
                                    if (str23.equals(str16)) {
                                        str17 = str22;
                                        b10 = 1;
                                    } else {
                                        str17 = str22;
                                    }
                                    break;
                                case -1985379776:
                                    str14 = str19;
                                    str15 = str20;
                                    str17 = str22;
                                    if (str23.equals(str15)) {
                                        str16 = str21;
                                        b10 = 2;
                                    } else {
                                        str16 = str21;
                                    }
                                    break;
                                case -1784763192:
                                    str14 = str19;
                                    str17 = str22;
                                    if (str23.equals(str14)) {
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 3;
                                    } else {
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case -1730367663:
                                    if (str23.equals(str)) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 4;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case -1482641358:
                                    if (str23.equals(str12)) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 5;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case -1482641357:
                                    if (str23.equals("A_MPEG/L3")) {
                                        b11 = 6;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case -1373388978:
                                    if (str23.equals("V_MS/VFW/FOURCC")) {
                                        b11 = 7;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case -933872740:
                                    if (str23.equals("S_DVBSUB")) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 8;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case -538363189:
                                    if (str23.equals("V_MPEG4/ISO/ASP")) {
                                        b11 = 9;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case -538363109:
                                    if (str23.equals("V_MPEG4/ISO/AVC")) {
                                        b11 = 10;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case -425012669:
                                    if (str23.equals("S_VOBSUB")) {
                                        b11 = 11;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case -356037306:
                                    if (str23.equals("A_DTS/LOSSLESS")) {
                                        b11 = 12;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 62923557:
                                    if (str23.equals("A_AAC")) {
                                        b11 = 13;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 62923603:
                                    if (str23.equals("A_AC3")) {
                                        b11 = 14;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 62927045:
                                    if (str23.equals("A_DTS")) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 15;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case 82318131:
                                    if (str23.equals("V_AV1")) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 16;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case 82338133:
                                    if (str23.equals("V_VP8")) {
                                        b11 = 17;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 82338134:
                                    if (str23.equals("V_VP9")) {
                                        b11 = 18;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 99146302:
                                    if (str23.equals("S_HDMV/PGS")) {
                                        b11 = 19;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 444813526:
                                    if (str23.equals("V_THEORA")) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 20;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case 542569478:
                                    if (str23.equals("A_DTS/EXPRESS")) {
                                        b11 = 21;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 635596514:
                                    if (str23.equals("A_PCM/FLOAT/IEEE")) {
                                        b11 = 22;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 725948237:
                                    if (str23.equals("A_PCM/INT/BIG")) {
                                        b11 = 23;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 725957860:
                                    if (str23.equals("A_PCM/INT/LIT")) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 24;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case 738597099:
                                    if (str23.equals("S_TEXT/ASS")) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 25;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                case 855502857:
                                    if (str23.equals("V_MPEGH/ISO/HEVC")) {
                                        b11 = 26;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 1045209816:
                                    if (str23.equals("S_TEXT/WEBVTT")) {
                                        b11 = 27;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 1422270023:
                                    if (str23.equals("S_TEXT/UTF8")) {
                                        b11 = 28;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 1809237540:
                                    if (str23.equals("V_MPEG2")) {
                                        b11 = 29;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 1950749482:
                                    if (str23.equals("A_EAC3")) {
                                        b11 = 30;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 1950789798:
                                    if (str23.equals("A_FLAC")) {
                                        b11 = 31;
                                        b10 = b11;
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                                case 1951062397:
                                    if (str23.equals(str18)) {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                        b10 = 32;
                                    } else {
                                        str14 = str19;
                                        str17 = str22;
                                        str15 = str20;
                                        str16 = str21;
                                    }
                                    break;
                                default:
                                    str14 = str19;
                                    str17 = str22;
                                    str15 = str20;
                                    str16 = str21;
                                    break;
                            }
                            switch (b10) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                    r rVar3 = bVar5.f5398e0;
                                    int i33 = r10.f5450d;
                                    String str24 = "video/x-unknown";
                                    String str25 = "text/vtt";
                                    switch (str23.hashCode()) {
                                        case -2095576542:
                                            str3 = str18;
                                            if (str23.equals(str17)) {
                                                b12 = 0;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2095575984:
                                            str3 = str18;
                                            if (str23.equals(str16)) {
                                                b12 = 1;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1985379776:
                                            str3 = str18;
                                            if (str23.equals(str15)) {
                                                b12 = 2;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1784763192:
                                            str3 = str18;
                                            if (str23.equals(str14)) {
                                                b12 = 3;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1730367663:
                                            str3 = str18;
                                            if (str23.equals(str)) {
                                                b12 = 4;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1482641358:
                                            str3 = str18;
                                            if (str23.equals(str12)) {
                                                b12 = 5;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1482641357:
                                            str3 = str18;
                                            if (str23.equals("A_MPEG/L3")) {
                                                b12 = 6;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1373388978:
                                            str3 = str18;
                                            if (str23.equals("V_MS/VFW/FOURCC")) {
                                                b12 = 7;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -933872740:
                                            str3 = str18;
                                            if (str23.equals("S_DVBSUB")) {
                                                b12 = 8;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -538363189:
                                            str3 = str18;
                                            if (str23.equals("V_MPEG4/ISO/ASP")) {
                                                b12 = 9;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -538363109:
                                            str3 = str18;
                                            if (str23.equals("V_MPEG4/ISO/AVC")) {
                                                b12 = 10;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -425012669:
                                            str3 = str18;
                                            if (str23.equals("S_VOBSUB")) {
                                                b12 = 11;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -356037306:
                                            str3 = str18;
                                            if (str23.equals("A_DTS/LOSSLESS")) {
                                                b12 = 12;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 62923557:
                                            str3 = str18;
                                            if (str23.equals("A_AAC")) {
                                                b12 = 13;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 62923603:
                                            str3 = str18;
                                            if (str23.equals("A_AC3")) {
                                                b12 = 14;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 62927045:
                                            str3 = str18;
                                            if (str23.equals("A_DTS")) {
                                                b12 = 15;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 82318131:
                                            str3 = str18;
                                            if (str23.equals("V_AV1")) {
                                                b12 = 16;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 82338133:
                                            str3 = str18;
                                            if (str23.equals("V_VP8")) {
                                                b12 = 17;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 82338134:
                                            str3 = str18;
                                            if (str23.equals("V_VP9")) {
                                                b12 = 18;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 99146302:
                                            str3 = str18;
                                            if (str23.equals("S_HDMV/PGS")) {
                                                b12 = 19;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 444813526:
                                            str3 = str18;
                                            if (str23.equals("V_THEORA")) {
                                                b12 = 20;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 542569478:
                                            str3 = str18;
                                            if (str23.equals("A_DTS/EXPRESS")) {
                                                b12 = 21;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 635596514:
                                            str3 = str18;
                                            if (str23.equals("A_PCM/FLOAT/IEEE")) {
                                                b12 = 22;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 725948237:
                                            str3 = str18;
                                            if (str23.equals("A_PCM/INT/BIG")) {
                                                b12 = 23;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 725957860:
                                            str3 = str18;
                                            if (str23.equals("A_PCM/INT/LIT")) {
                                                b12 = 24;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 738597099:
                                            str3 = str18;
                                            if (str23.equals("S_TEXT/ASS")) {
                                                b12 = 25;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 855502857:
                                            str3 = str18;
                                            if (str23.equals("V_MPEGH/ISO/HEVC")) {
                                                b12 = 26;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1045209816:
                                            str3 = str18;
                                            if (str23.equals("S_TEXT/WEBVTT")) {
                                                b12 = 27;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1422270023:
                                            str3 = str18;
                                            if (str23.equals("S_TEXT/UTF8")) {
                                                b12 = 28;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1809237540:
                                            str3 = str18;
                                            if (str23.equals("V_MPEG2")) {
                                                b12 = 29;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1950749482:
                                            str3 = str18;
                                            if (str23.equals("A_EAC3")) {
                                                b12 = 30;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1950789798:
                                            str3 = str18;
                                            if (str23.equals("A_FLAC")) {
                                                b12 = 31;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1951062397:
                                            if (str23.equals(str18)) {
                                                str3 = str18;
                                                b12 = 32;
                                                break;
                                            }
                                        default:
                                            str3 = str18;
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            str12 = str12;
                                            str14 = str14;
                                            str25 = "text/vtt";
                                            byte[] bArr2 = r10.f5457l;
                                            str24 = "video/mp4v-es";
                                            listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                            iT = -1;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null && (c0579nI = C0579n.i(new p114j1.r(r10.f5435P))) != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z14 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i34 = (z14 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14 || (i16 = r10.f5463r) == i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = (r10.f5460o * i15) / (r10.f5459n * i16);
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f && r10.f5426G != -1.0f && r10.f5427H != -1.0f && r10.f5428I != -1.0f && r10.f5429J != -1.0f && r10.f5430K != -1.0f && r10.f5431L != -1.0f && r10.f5432M != -1.0f && r10.f5433N != -1.0f && r10.f5434O != -1.0f) {
                                                        byte[] bArr3 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((r10.f5425F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f5426G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f5427H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f5428I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f5429J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f5430K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f5431L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r10.f5432M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (r10.f5433N + 0.5f));
                                                        byteBufferOrder.putShort((short) (r10.f5434O + 0.5f));
                                                        byteBufferOrder.putShort((short) r10.f5423D);
                                                        byteBufferOrder.putShort((short) r10.f5424E);
                                                        bArr = bArr3;
                                                    }
                                                    int i35 = r10.f5420A;
                                                    int i36 = r10.f5422C;
                                                    int i37 = r10.f5421B;
                                                    int i38 = r10.f5461p;
                                                    hVar = new h(i35, i36, i37, i38, i38, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null && map.containsKey(str6)) {
                                                    iIntValue = map.get(r10.f5448b).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0 && Float.compare(r10.f5466u, 0.0f) == 0 && Float.compare(r10.f5467v, 0.0f) == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0 || Float.compare(r10.f5468w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(r10.f5468w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24) && !"text/x-ssa".equals(str24) && !str25.equals(str24) && !"application/vobsub".equals(str24) && !"application/pgs".equals(str24) && !"application/dvbsubs".equals(str24)) {
                                                    throw ParserException.a(null, "Unexpected MIME type.");
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null && !map.containsKey(str7)) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i34;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar = new n(aVar);
                                            K kP = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP;
                                            kP.d(nVar);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 2:
                                            str12 = str12;
                                            str14 = str14;
                                            str25 = "text/vtt";
                                            p114j1.r rVar4 = new p114j1.r(r10.a(r10.f5449c));
                                            try {
                                                int iN = rVar4.n();
                                                if (iN != 1) {
                                                    if (iN == 65534) {
                                                        rVar4.G(24);
                                                        long jO = rVar4.o();
                                                        UUID uuid = f5361j0;
                                                        if (jO != uuid.getMostSignificantBits() || rVar4.o() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str24 = "audio/x-unknown";
                                                        iT = -1;
                                                        listSingletonList = null;
                                                        str4 = null;
                                                        i11 = -1;
                                                        if (r10.f5435P != null) {
                                                            str4 = (String) c0579nI.f539a;
                                                            str24 = "video/dolby-vision";
                                                        }
                                                        boolean z15 = r10.f5443X;
                                                        if (r10.f5442W) {
                                                            i12 = 2;
                                                        } else {
                                                            i12 = 0;
                                                        }
                                                        int i39 = (z15 ? 1 : 0) | i12;
                                                        aVar = new n.a();
                                                        zI = p078g1.t.i(str24);
                                                        Map<String, Integer> map2 = f5362k0;
                                                        if (zI) {
                                                            aVar.f35317C = r10.f5436Q;
                                                            aVar.f35318D = r10.f5438S;
                                                            aVar.f35319E = iT;
                                                            i13 = 1;
                                                        } else if (p078g1.t.l(str24)) {
                                                            if (r10.f5464s == 0) {
                                                                i17 = r10.f5462q;
                                                                i14 = -1;
                                                                if (i17 == -1) {
                                                                    i17 = r10.f5459n;
                                                                }
                                                                r10.f5462q = i17;
                                                                i18 = r10.f5463r;
                                                                if (i18 == -1) {
                                                                    i18 = r10.f5460o;
                                                                }
                                                                r10.f5463r = i18;
                                                            } else {
                                                                i14 = -1;
                                                            }
                                                            i15 = r10.f5462q;
                                                            if (i15 != i14) {
                                                                f10 = -1.0f;
                                                            } else {
                                                                f10 = -1.0f;
                                                            }
                                                            if (r10.f5471z) {
                                                                bArr = r10.f5425F == -1.0f ? null : null;
                                                                int i310 = r10.f5420A;
                                                                int i311 = r10.f5422C;
                                                                int i312 = r10.f5421B;
                                                                int i313 = r10.f5461p;
                                                                hVar = new h(i310, i311, i312, i313, i313, bArr);
                                                            } else {
                                                                hVar = null;
                                                            }
                                                            str6 = r10.f5448b;
                                                            if (str6 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (r10.f5465t == 0) {
                                                                if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            aVar.f35345t = r10.f5459n;
                                                            aVar.f35346u = r10.f5460o;
                                                            aVar.f35349x = f10;
                                                            aVar.f35348w = iIntValue;
                                                            aVar.f35350y = r10.f5469x;
                                                            aVar.f35351z = r10.f5470y;
                                                            aVar.f35315A = hVar;
                                                            i13 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str24)) {
                                                            }
                                                            i13 = 3;
                                                        }
                                                        str7 = r10.f5448b;
                                                        if (str7 != null) {
                                                            aVar.f35328b = r10.f5448b;
                                                        }
                                                        aVar.f35327a = Integer.toString(i33);
                                                        if (r10.f5446a) {
                                                            str8 = "video/webm";
                                                        } else {
                                                            str8 = "video/x-matroska";
                                                        }
                                                        aVar.f35337l = p078g1.t.m(str8);
                                                        aVar.f35338m = p078g1.t.m(str24);
                                                        aVar.f35339n = i11;
                                                        aVar.f35330d = r10.f5444Y;
                                                        aVar.f35331e = i39;
                                                        aVar.f35341p = listSingletonList;
                                                        aVar.j = str4;
                                                        aVar.f35342q = r10.f5458m;
                                                        n nVar2 = new n(aVar);
                                                        K kP2 = rVar3.p(r10.f5450d, i13);
                                                        r10.f5445Z = kP2;
                                                        kP2.d(nVar2);
                                                        sparseArray.put(r10.f5450d, r10);
                                                        bVar2 = bVar5;
                                                        c0077b = null;
                                                        break;
                                                    }
                                                    p114j1.k.f("Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str24 = "audio/x-unknown";
                                                    iT = -1;
                                                    listSingletonList = null;
                                                    str4 = null;
                                                    i11 = -1;
                                                    if (r10.f5435P != null) {
                                                        str4 = (String) c0579nI.f539a;
                                                        str24 = "video/dolby-vision";
                                                    }
                                                    boolean z16 = r10.f5443X;
                                                    if (r10.f5442W) {
                                                        i12 = 2;
                                                    } else {
                                                        i12 = 0;
                                                    }
                                                    int i314 = (z16 ? 1 : 0) | i12;
                                                    aVar = new n.a();
                                                    zI = p078g1.t.i(str24);
                                                    Map<String, Integer> map3 = f5362k0;
                                                    if (zI) {
                                                        aVar.f35317C = r10.f5436Q;
                                                        aVar.f35318D = r10.f5438S;
                                                        aVar.f35319E = iT;
                                                        i13 = 1;
                                                    } else if (p078g1.t.l(str24)) {
                                                        if (r10.f5464s == 0) {
                                                            i17 = r10.f5462q;
                                                            i14 = -1;
                                                            if (i17 == -1) {
                                                                i17 = r10.f5459n;
                                                            }
                                                            r10.f5462q = i17;
                                                            i18 = r10.f5463r;
                                                            if (i18 == -1) {
                                                                i18 = r10.f5460o;
                                                            }
                                                            r10.f5463r = i18;
                                                        } else {
                                                            i14 = -1;
                                                        }
                                                        i15 = r10.f5462q;
                                                        if (i15 != i14) {
                                                            f10 = -1.0f;
                                                        } else {
                                                            f10 = -1.0f;
                                                        }
                                                        if (r10.f5471z) {
                                                            if (r10.f5425F == -1.0f) {
                                                            }
                                                            int i315 = r10.f5420A;
                                                            int i316 = r10.f5422C;
                                                            int i317 = r10.f5421B;
                                                            int i318 = r10.f5461p;
                                                            hVar = new h(i315, i316, i317, i318, i318, bArr);
                                                        } else {
                                                            hVar = null;
                                                        }
                                                        str6 = r10.f5448b;
                                                        if (str6 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r10.f5465t == 0) {
                                                            if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        aVar.f35345t = r10.f5459n;
                                                        aVar.f35346u = r10.f5460o;
                                                        aVar.f35349x = f10;
                                                        aVar.f35348w = iIntValue;
                                                        aVar.f35350y = r10.f5469x;
                                                        aVar.f35351z = r10.f5470y;
                                                        aVar.f35315A = hVar;
                                                        i13 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str24)) {
                                                        }
                                                        i13 = 3;
                                                    }
                                                    str7 = r10.f5448b;
                                                    if (str7 != null) {
                                                        aVar.f35328b = r10.f5448b;
                                                    }
                                                    aVar.f35327a = Integer.toString(i33);
                                                    if (r10.f5446a) {
                                                        str8 = "video/webm";
                                                    } else {
                                                        str8 = "video/x-matroska";
                                                    }
                                                    aVar.f35337l = p078g1.t.m(str8);
                                                    aVar.f35338m = p078g1.t.m(str24);
                                                    aVar.f35339n = i11;
                                                    aVar.f35330d = r10.f5444Y;
                                                    aVar.f35331e = i314;
                                                    aVar.f35341p = listSingletonList;
                                                    aVar.j = str4;
                                                    aVar.f35342q = r10.f5458m;
                                                    n nVar3 = new n(aVar);
                                                    K kP3 = rVar3.p(r10.f5450d, i13);
                                                    r10.f5445Z = kP3;
                                                    kP3.d(nVar3);
                                                    sparseArray.put(r10.f5450d, r10);
                                                    bVar2 = bVar5;
                                                    c0077b = null;
                                                    break;
                                                }
                                                iT = A.t(r10.f5437R);
                                                if (iT == 0) {
                                                    p114j1.k.f("Unsupported PCM bit depth: " + r10.f5437R + ". Setting mimeType to audio/x-unknown");
                                                    str24 = "audio/x-unknown";
                                                    iT = -1;
                                                } else {
                                                    str24 = "audio/raw";
                                                }
                                                listSingletonList = null;
                                                str4 = null;
                                                i11 = -1;
                                                if (r10.f5435P != null) {
                                                    str4 = (String) c0579nI.f539a;
                                                    str24 = "video/dolby-vision";
                                                }
                                                boolean z17 = r10.f5443X;
                                                if (r10.f5442W) {
                                                    i12 = 2;
                                                } else {
                                                    i12 = 0;
                                                }
                                                int i319 = (z17 ? 1 : 0) | i12;
                                                aVar = new n.a();
                                                zI = p078g1.t.i(str24);
                                                Map<String, Integer> map4 = f5362k0;
                                                if (zI) {
                                                    aVar.f35317C = r10.f5436Q;
                                                    aVar.f35318D = r10.f5438S;
                                                    aVar.f35319E = iT;
                                                    i13 = 1;
                                                } else if (p078g1.t.l(str24)) {
                                                    if (r10.f5464s == 0) {
                                                        i17 = r10.f5462q;
                                                        i14 = -1;
                                                        if (i17 == -1) {
                                                            i17 = r10.f5459n;
                                                        }
                                                        r10.f5462q = i17;
                                                        i18 = r10.f5463r;
                                                        if (i18 == -1) {
                                                            i18 = r10.f5460o;
                                                        }
                                                        r10.f5463r = i18;
                                                    } else {
                                                        i14 = -1;
                                                    }
                                                    i15 = r10.f5462q;
                                                    if (i15 != i14) {
                                                        f10 = -1.0f;
                                                    } else {
                                                        f10 = -1.0f;
                                                    }
                                                    if (r10.f5471z) {
                                                        if (r10.f5425F == -1.0f) {
                                                        }
                                                        int i3110 = r10.f5420A;
                                                        int i3111 = r10.f5422C;
                                                        int i3112 = r10.f5421B;
                                                        int i3113 = r10.f5461p;
                                                        hVar = new h(i3110, i3111, i3112, i3113, i3113, bArr);
                                                    } else {
                                                        hVar = null;
                                                    }
                                                    str6 = r10.f5448b;
                                                    if (str6 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r10.f5465t == 0) {
                                                        if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    aVar.f35345t = r10.f5459n;
                                                    aVar.f35346u = r10.f5460o;
                                                    aVar.f35349x = f10;
                                                    aVar.f35348w = iIntValue;
                                                    aVar.f35350y = r10.f5469x;
                                                    aVar.f35351z = r10.f5470y;
                                                    aVar.f35315A = hVar;
                                                    i13 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str24)) {
                                                    }
                                                    i13 = 3;
                                                }
                                                str7 = r10.f5448b;
                                                if (str7 != null) {
                                                    aVar.f35328b = r10.f5448b;
                                                }
                                                aVar.f35327a = Integer.toString(i33);
                                                if (r10.f5446a) {
                                                    str8 = "video/webm";
                                                } else {
                                                    str8 = "video/x-matroska";
                                                }
                                                aVar.f35337l = p078g1.t.m(str8);
                                                aVar.f35338m = p078g1.t.m(str24);
                                                aVar.f35339n = i11;
                                                aVar.f35330d = r10.f5444Y;
                                                aVar.f35331e = i319;
                                                aVar.f35341p = listSingletonList;
                                                aVar.j = str4;
                                                aVar.f35342q = r10.f5458m;
                                                n nVar4 = new n(aVar);
                                                K kP4 = rVar3.p(r10.f5450d, i13);
                                                r10.f5445Z = kP4;
                                                kP4.d(nVar4);
                                                sparseArray.put(r10.f5450d, r10);
                                                bVar2 = bVar5;
                                                c0077b = null;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            str12 = str12;
                                            str14 = str14;
                                            str25 = "text/vtt";
                                            r10.f5441V = new L();
                                            str24 = "audio/true-hd";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z18 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i3114 = (z18 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map5 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i3115 = r10.f5420A;
                                                    int i3116 = r10.f5422C;
                                                    int i3117 = r10.f5421B;
                                                    int i3118 = r10.f5461p;
                                                    hVar = new h(i3115, i3116, i3117, i3118, i3118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i3114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar5 = new n(aVar);
                                            K kP5 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP5;
                                            kP5.d(nVar5);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 4:
                                            str25 = "text/vtt";
                                            byte[] bArrA = r10.a(str23);
                                            try {
                                                try {
                                                    if (bArrA[0] != 2) {
                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i40 = 0;
                                                    int i41 = 1;
                                                    while (true) {
                                                        str12 = str12;
                                                        int i42 = bArrA[i41] & 255;
                                                        if (i42 != 255) {
                                                            int i43 = i41 + 1;
                                                            int i44 = i40 + i42;
                                                            int i45 = 0;
                                                            while (true) {
                                                                str14 = str14;
                                                                int i46 = bArrA[i43] & 255;
                                                                if (i46 != 255) {
                                                                    int i47 = i43 + 1;
                                                                    int i48 = i45 + i46;
                                                                    if (bArrA[i47] != 1) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr4 = new byte[i44];
                                                                    System.arraycopy(bArrA, i47, bArr4, 0, i44);
                                                                    int i49 = i47 + i44;
                                                                    if (bArrA[i49] != 3) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i50 = i49 + i48;
                                                                    if (bArrA[i50] != 5) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr5 = new byte[bArrA.length - i50];
                                                                    System.arraycopy(bArrA, i50, bArr5, 0, bArrA.length - i50);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr4);
                                                                    arrayList.add(bArr5);
                                                                    str24 = "audio/vorbis";
                                                                    listSingletonList = arrayList;
                                                                    i11 = 8192;
                                                                    iT = -1;
                                                                    str4 = null;
                                                                    if (r10.f5435P != null) {
                                                                        str4 = (String) c0579nI.f539a;
                                                                        str24 = "video/dolby-vision";
                                                                    }
                                                                    boolean z19 = r10.f5443X;
                                                                    if (r10.f5442W) {
                                                                        i12 = 2;
                                                                    } else {
                                                                        i12 = 0;
                                                                    }
                                                                    int i3119 = (z19 ? 1 : 0) | i12;
                                                                    aVar = new n.a();
                                                                    zI = p078g1.t.i(str24);
                                                                    Map<String, Integer> map6 = f5362k0;
                                                                    if (zI) {
                                                                        aVar.f35317C = r10.f5436Q;
                                                                        aVar.f35318D = r10.f5438S;
                                                                        aVar.f35319E = iT;
                                                                        i13 = 1;
                                                                    } else if (p078g1.t.l(str24)) {
                                                                        if (r10.f5464s == 0) {
                                                                            i17 = r10.f5462q;
                                                                            i14 = -1;
                                                                            if (i17 == -1) {
                                                                                i17 = r10.f5459n;
                                                                            }
                                                                            r10.f5462q = i17;
                                                                            i18 = r10.f5463r;
                                                                            if (i18 == -1) {
                                                                                i18 = r10.f5460o;
                                                                            }
                                                                            r10.f5463r = i18;
                                                                        } else {
                                                                            i14 = -1;
                                                                        }
                                                                        i15 = r10.f5462q;
                                                                        if (i15 != i14) {
                                                                            f10 = -1.0f;
                                                                        } else {
                                                                            f10 = -1.0f;
                                                                        }
                                                                        if (r10.f5471z) {
                                                                            if (r10.f5425F == -1.0f) {
                                                                            }
                                                                            int i31110 = r10.f5420A;
                                                                            int i31111 = r10.f5422C;
                                                                            int i31112 = r10.f5421B;
                                                                            int i31113 = r10.f5461p;
                                                                            hVar = new h(i31110, i31111, i31112, i31113, i31113, bArr);
                                                                        } else {
                                                                            hVar = null;
                                                                        }
                                                                        str6 = r10.f5448b;
                                                                        if (str6 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (r10.f5465t == 0) {
                                                                            if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        aVar.f35345t = r10.f5459n;
                                                                        aVar.f35346u = r10.f5460o;
                                                                        aVar.f35349x = f10;
                                                                        aVar.f35348w = iIntValue;
                                                                        aVar.f35350y = r10.f5469x;
                                                                        aVar.f35351z = r10.f5470y;
                                                                        aVar.f35315A = hVar;
                                                                        i13 = 2;
                                                                    } else {
                                                                        if ("application/x-subrip".equals(str24)) {
                                                                        }
                                                                        i13 = 3;
                                                                    }
                                                                    str7 = r10.f5448b;
                                                                    if (str7 != null) {
                                                                        aVar.f35328b = r10.f5448b;
                                                                    }
                                                                    aVar.f35327a = Integer.toString(i33);
                                                                    if (r10.f5446a) {
                                                                        str8 = "video/webm";
                                                                    } else {
                                                                        str8 = "video/x-matroska";
                                                                    }
                                                                    aVar.f35337l = p078g1.t.m(str8);
                                                                    aVar.f35338m = p078g1.t.m(str24);
                                                                    aVar.f35339n = i11;
                                                                    aVar.f35330d = r10.f5444Y;
                                                                    aVar.f35331e = i3119;
                                                                    aVar.f35341p = listSingletonList;
                                                                    aVar.j = str4;
                                                                    aVar.f35342q = r10.f5458m;
                                                                    n nVar6 = new n(aVar);
                                                                    K kP6 = rVar3.p(r10.f5450d, i13);
                                                                    r10.f5445Z = kP6;
                                                                    kP6.d(nVar6);
                                                                    sparseArray.put(r10.f5450d, r10);
                                                                    bVar2 = bVar5;
                                                                    c0077b = null;
                                                                } else {
                                                                    i45 += 255;
                                                                    i43++;
                                                                    str14 = str14;
                                                                }
                                                            }
                                                        } else {
                                                            i40 += 255;
                                                            i41++;
                                                            str12 = str12;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.a(r10, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r10 = 0;
                                            }
                                            break;
                                        case 5:
                                            str24 = "audio/mpeg-L2";
                                            str12 = str12;
                                            str14 = str14;
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = 4096;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z110 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31114 = (z110 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map7 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31115 = r10.f5420A;
                                                    int i31116 = r10.f5422C;
                                                    int i31117 = r10.f5421B;
                                                    int i31118 = r10.f5461p;
                                                    hVar = new h(i31115, i31116, i31117, i31118, i31118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar7 = new n(aVar);
                                            K kP7 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP7;
                                            kP7.d(nVar7);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 6:
                                            str24 = "audio/mpeg";
                                            str12 = str12;
                                            str14 = str14;
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = 4096;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z111 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31119 = (z111 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map8 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311110 = r10.f5420A;
                                                    int i311111 = r10.f5422C;
                                                    int i311112 = r10.f5421B;
                                                    int i311113 = r10.f5461p;
                                                    hVar = new h(i311110, i311111, i311112, i311113, i311113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar8 = new n(aVar);
                                            K kP8 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP8;
                                            kP8.d(nVar8);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 7:
                                            str25 = "text/vtt";
                                            p114j1.r rVar5 = new p114j1.r(r10.a(r10.f5449c));
                                            try {
                                                rVar5.H(16);
                                                long jL = rVar5.l();
                                                if (jL == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str5 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else if (jL == 859189832) {
                                                    pair = new Pair("video/3gpp", null);
                                                    str5 = null;
                                                } else {
                                                    if (jL == 826496599) {
                                                        int i51 = rVar5.f41063b + 20;
                                                        byte[] bArr6 = rVar5.f41062a;
                                                        while (true) {
                                                            if (i51 < bArr6.length - 4) {
                                                                if (bArr6[i51] == 0 && bArr6[i51 + 1] == 0 && bArr6[i51 + 2] == 1) {
                                                                    if (bArr6[i51 + 3] == 15) {
                                                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i51, bArr6.length)));
                                                                        str5 = null;
                                                                    }
                                                                }
                                                                i51++;
                                                            } else {
                                                                try {
                                                                    throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                                } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    runtimeException = null;
                                                                }
                                                            }
                                                            throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                        }
                                                    }
                                                    p114j1.k.f("Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str5 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                }
                                                str24 = (String) pair.first;
                                                str12 = str12;
                                                str14 = str14;
                                                str4 = str5;
                                                listSingletonList = (List) pair.second;
                                                iT = -1;
                                                i11 = -1;
                                                if (r10.f5435P != null) {
                                                    str4 = (String) c0579nI.f539a;
                                                    str24 = "video/dolby-vision";
                                                }
                                                boolean z112 = r10.f5443X;
                                                if (r10.f5442W) {
                                                    i12 = 2;
                                                } else {
                                                    i12 = 0;
                                                }
                                                int i311114 = (z112 ? 1 : 0) | i12;
                                                aVar = new n.a();
                                                zI = p078g1.t.i(str24);
                                                Map<String, Integer> map9 = f5362k0;
                                                if (zI) {
                                                    aVar.f35317C = r10.f5436Q;
                                                    aVar.f35318D = r10.f5438S;
                                                    aVar.f35319E = iT;
                                                    i13 = 1;
                                                } else if (p078g1.t.l(str24)) {
                                                    if (r10.f5464s == 0) {
                                                        i17 = r10.f5462q;
                                                        i14 = -1;
                                                        if (i17 == -1) {
                                                            i17 = r10.f5459n;
                                                        }
                                                        r10.f5462q = i17;
                                                        i18 = r10.f5463r;
                                                        if (i18 == -1) {
                                                            i18 = r10.f5460o;
                                                        }
                                                        r10.f5463r = i18;
                                                    } else {
                                                        i14 = -1;
                                                    }
                                                    i15 = r10.f5462q;
                                                    if (i15 != i14) {
                                                        f10 = -1.0f;
                                                    } else {
                                                        f10 = -1.0f;
                                                    }
                                                    if (r10.f5471z) {
                                                        if (r10.f5425F == -1.0f) {
                                                        }
                                                        int i311115 = r10.f5420A;
                                                        int i311116 = r10.f5422C;
                                                        int i311117 = r10.f5421B;
                                                        int i311118 = r10.f5461p;
                                                        hVar = new h(i311115, i311116, i311117, i311118, i311118, bArr);
                                                    } else {
                                                        hVar = null;
                                                    }
                                                    str6 = r10.f5448b;
                                                    if (str6 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r10.f5465t == 0) {
                                                        if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    aVar.f35345t = r10.f5459n;
                                                    aVar.f35346u = r10.f5460o;
                                                    aVar.f35349x = f10;
                                                    aVar.f35348w = iIntValue;
                                                    aVar.f35350y = r10.f5469x;
                                                    aVar.f35351z = r10.f5470y;
                                                    aVar.f35315A = hVar;
                                                    i13 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str24)) {
                                                    }
                                                    i13 = 3;
                                                }
                                                str7 = r10.f5448b;
                                                if (str7 != null) {
                                                    aVar.f35328b = r10.f5448b;
                                                }
                                                aVar.f35327a = Integer.toString(i33);
                                                if (r10.f5446a) {
                                                    str8 = "video/webm";
                                                } else {
                                                    str8 = "video/x-matroska";
                                                }
                                                aVar.f35337l = p078g1.t.m(str8);
                                                aVar.f35338m = p078g1.t.m(str24);
                                                aVar.f35339n = i11;
                                                aVar.f35330d = r10.f5444Y;
                                                aVar.f35331e = i311114;
                                                aVar.f35341p = listSingletonList;
                                                aVar.j = str4;
                                                aVar.f35342q = r10.f5458m;
                                                n nVar9 = new n(aVar);
                                                K kP9 = rVar3.p(r10.f5450d, i13);
                                                r10.f5445Z = kP9;
                                                kP9.d(nVar9);
                                                sparseArray.put(r10.f5450d, r10);
                                                bVar2 = bVar5;
                                                c0077b = null;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            str25 = "text/vtt";
                                            byte[] bArr7 = new byte[4];
                                            System.arraycopy(r10.a(str23), 0, bArr7, 0, 4);
                                            listSingletonList = ImmutableList.M(bArr7);
                                            str24 = "application/dvbsubs";
                                            iT = -1;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z113 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i311119 = (z113 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map10 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i3111110 = r10.f5420A;
                                                    int i3111111 = r10.f5422C;
                                                    int i3111112 = r10.f5421B;
                                                    int i3111113 = r10.f5461p;
                                                    hVar = new h(i3111110, i3111111, i3111112, i3111113, i3111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i311119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar10 = new n(aVar);
                                            K kP10 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP10;
                                            kP10.d(nVar10);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 10:
                                            str25 = "text/vtt";
                                            C0569d c0569dA = C0569d.a(new p114j1.r(r10.a(r10.f5449c)));
                                            r10.f5447a0 = c0569dA.f475b;
                                            str12 = str12;
                                            str14 = str14;
                                            listSingletonList = c0569dA.f474a;
                                            str24 = "video/avc";
                                            iT = -1;
                                            i11 = -1;
                                            str4 = c0569dA.f484l;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z114 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i3111114 = (z114 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map11 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i3111115 = r10.f5420A;
                                                    int i3111116 = r10.f5422C;
                                                    int i3111117 = r10.f5421B;
                                                    int i3111118 = r10.f5461p;
                                                    hVar = new h(i3111115, i3111116, i3111117, i3111118, i3111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i3111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar11 = new n(aVar);
                                            K kP11 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP11;
                                            kP11.d(nVar11);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 11:
                                            str25 = "text/vtt";
                                            listSingletonList = ImmutableList.M(r10.a(str23));
                                            str24 = "application/vobsub";
                                            iT = -1;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z115 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i3111119 = (z115 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map12 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31111110 = r10.f5420A;
                                                    int i31111111 = r10.f5422C;
                                                    int i31111112 = r10.f5421B;
                                                    int i31111113 = r10.f5461p;
                                                    hVar = new h(i31111110, i31111111, i31111112, i31111113, i31111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i3111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar12 = new n(aVar);
                                            K kP12 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP12;
                                            kP12.d(nVar12);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 12:
                                            str24 = "audio/vnd.dts.hd";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z116 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31111114 = (z116 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map13 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31111115 = r10.f5420A;
                                                    int i31111116 = r10.f5422C;
                                                    int i31111117 = r10.f5421B;
                                                    int i31111118 = r10.f5461p;
                                                    hVar = new h(i31111115, i31111116, i31111117, i31111118, i31111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar13 = new n(aVar);
                                            K kP13 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP13;
                                            kP13.d(nVar13);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 13:
                                            List<byte[]> listSingletonList2 = Collections.singletonList(r10.a(str23));
                                            byte[] bArr8 = r10.f5457l;
                                            C0566a.C0000a c0000aB = C0566a.b(new p114j1.q(bArr8.length, bArr8), false);
                                            r10.f5438S = c0000aB.f455a;
                                            r10.f5436Q = c0000aB.f456b;
                                            str24 = "audio/mp4a-latm";
                                            str4 = c0000aB.f457c;
                                            listSingletonList = listSingletonList2;
                                            str12 = str12;
                                            str14 = str14;
                                            iT = -1;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z117 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31111119 = (z117 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map14 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311111110 = r10.f5420A;
                                                    int i311111111 = r10.f5422C;
                                                    int i311111112 = r10.f5421B;
                                                    int i311111113 = r10.f5461p;
                                                    hVar = new h(i311111110, i311111111, i311111112, i311111113, i311111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar14 = new n(aVar);
                                            K kP14 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP14;
                                            kP14.d(nVar14);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 14:
                                            str24 = "audio/ac3";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z118 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i311111114 = (z118 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map15 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311111115 = r10.f5420A;
                                                    int i311111116 = r10.f5422C;
                                                    int i311111117 = r10.f5421B;
                                                    int i311111118 = r10.f5461p;
                                                    hVar = new h(i311111115, i311111116, i311111117, i311111118, i311111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i311111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar15 = new n(aVar);
                                            K kP15 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP15;
                                            kP15.d(nVar15);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 15:
                                        case 21:
                                            str24 = "audio/vnd.dts";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z119 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i311111119 = (z119 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map16 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i3111111110 = r10.f5420A;
                                                    int i3111111111 = r10.f5422C;
                                                    int i3111111112 = r10.f5421B;
                                                    int i3111111113 = r10.f5461p;
                                                    hVar = new h(i3111111110, i3111111111, i3111111112, i3111111113, i3111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i311111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar16 = new n(aVar);
                                            K kP16 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP16;
                                            kP16.d(nVar16);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 16:
                                            byte[] bArr9 = r10.f5457l;
                                            listM = bArr9 == null ? null : ImmutableList.M(bArr9);
                                            str24 = "video/av01";
                                            listSingletonList = listM;
                                            iT = -1;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1110 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i3111111114 = (z1110 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map17 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i3111111115 = r10.f5420A;
                                                    int i3111111116 = r10.f5422C;
                                                    int i3111111117 = r10.f5421B;
                                                    int i3111111118 = r10.f5461p;
                                                    hVar = new h(i3111111115, i3111111116, i3111111117, i3111111118, i3111111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i3111111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar17 = new n(aVar);
                                            K kP17 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP17;
                                            kP17.d(nVar17);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 17:
                                            str24 = "video/x-vnd.on2.vp8";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1111 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i3111111119 = (z1111 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map18 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31111111110 = r10.f5420A;
                                                    int i31111111111 = r10.f5422C;
                                                    int i31111111112 = r10.f5421B;
                                                    int i31111111113 = r10.f5461p;
                                                    hVar = new h(i31111111110, i31111111111, i31111111112, i31111111113, i31111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i3111111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar18 = new n(aVar);
                                            K kP18 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP18;
                                            kP18.d(nVar18);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 18:
                                            byte[] bArr10 = r10.f5457l;
                                            listM = bArr10 == null ? null : ImmutableList.M(bArr10);
                                            str24 = "video/x-vnd.on2.vp9";
                                            listSingletonList = listM;
                                            iT = -1;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1112 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31111111114 = (z1112 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map19 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31111111115 = r10.f5420A;
                                                    int i31111111116 = r10.f5422C;
                                                    int i31111111117 = r10.f5421B;
                                                    int i31111111118 = r10.f5461p;
                                                    hVar = new h(i31111111115, i31111111116, i31111111117, i31111111118, i31111111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31111111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar19 = new n(aVar);
                                            K kP19 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP19;
                                            kP19.d(nVar19);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 19:
                                            str25 = "text/vtt";
                                            str24 = "application/pgs";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1113 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31111111119 = (z1113 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map110 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311111111110 = r10.f5420A;
                                                    int i311111111111 = r10.f5422C;
                                                    int i311111111112 = r10.f5421B;
                                                    int i311111111113 = r10.f5461p;
                                                    hVar = new h(i311111111110, i311111111111, i311111111112, i311111111113, i311111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31111111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar110 = new n(aVar);
                                            K kP110 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP110;
                                            kP110.d(nVar110);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 20:
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1114 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i311111111114 = (z1114 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map111 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311111111115 = r10.f5420A;
                                                    int i311111111116 = r10.f5422C;
                                                    int i311111111117 = r10.f5421B;
                                                    int i311111111118 = r10.f5461p;
                                                    hVar = new h(i311111111115, i311111111116, i311111111117, i311111111118, i311111111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i311111111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar111 = new n(aVar);
                                            K kP111 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP111;
                                            kP111.d(nVar111);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 22:
                                            str25 = "text/vtt";
                                            if (r10.f5437R == 32) {
                                                str12 = str12;
                                                str14 = str14;
                                                str24 = "audio/raw";
                                                iT = 4;
                                            } else {
                                                p114j1.k.f("Unsupported floating point PCM bit depth: " + r10.f5437R + ". Setting mimeType to audio/x-unknown");
                                                str24 = "audio/x-unknown";
                                                iT = -1;
                                            }
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1115 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i311111111119 = (z1115 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map112 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i3111111111110 = r10.f5420A;
                                                    int i3111111111111 = r10.f5422C;
                                                    int i3111111111112 = r10.f5421B;
                                                    int i3111111111113 = r10.f5461p;
                                                    hVar = new h(i3111111111110, i3111111111111, i3111111111112, i3111111111113, i3111111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i311111111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar112 = new n(aVar);
                                            K kP112 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP112;
                                            kP112.d(nVar112);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 23:
                                            str25 = "text/vtt";
                                            int i52 = r10.f5437R;
                                            if (i52 != 8) {
                                                if (i52 == 16) {
                                                    iT2 = 268435456;
                                                } else if (i52 == 24) {
                                                    iT2 = 1342177280;
                                                } else if (i52 == 32) {
                                                    iT2 = 1610612736;
                                                } else {
                                                    p114j1.k.f("Unsupported big endian PCM bit depth: " + r10.f5437R + ". Setting mimeType to audio/x-unknown");
                                                    str24 = "audio/x-unknown";
                                                    iT = -1;
                                                }
                                                str12 = str12;
                                                str14 = str14;
                                                str24 = "audio/raw";
                                                listSingletonList = null;
                                                str4 = null;
                                                i11 = -1;
                                                iT = iT2;
                                                if (r10.f5435P != null) {
                                                    str4 = (String) c0579nI.f539a;
                                                    str24 = "video/dolby-vision";
                                                }
                                                boolean z1116 = r10.f5443X;
                                                if (r10.f5442W) {
                                                    i12 = 2;
                                                } else {
                                                    i12 = 0;
                                                }
                                                int i3111111111114 = (z1116 ? 1 : 0) | i12;
                                                aVar = new n.a();
                                                zI = p078g1.t.i(str24);
                                                Map<String, Integer> map113 = f5362k0;
                                                if (zI) {
                                                    aVar.f35317C = r10.f5436Q;
                                                    aVar.f35318D = r10.f5438S;
                                                    aVar.f35319E = iT;
                                                    i13 = 1;
                                                } else if (p078g1.t.l(str24)) {
                                                    if (r10.f5464s == 0) {
                                                        i17 = r10.f5462q;
                                                        i14 = -1;
                                                        if (i17 == -1) {
                                                            i17 = r10.f5459n;
                                                        }
                                                        r10.f5462q = i17;
                                                        i18 = r10.f5463r;
                                                        if (i18 == -1) {
                                                            i18 = r10.f5460o;
                                                        }
                                                        r10.f5463r = i18;
                                                    } else {
                                                        i14 = -1;
                                                    }
                                                    i15 = r10.f5462q;
                                                    if (i15 != i14) {
                                                        f10 = -1.0f;
                                                    } else {
                                                        f10 = -1.0f;
                                                    }
                                                    if (r10.f5471z) {
                                                        if (r10.f5425F == -1.0f) {
                                                        }
                                                        int i3111111111115 = r10.f5420A;
                                                        int i3111111111116 = r10.f5422C;
                                                        int i3111111111117 = r10.f5421B;
                                                        int i3111111111118 = r10.f5461p;
                                                        hVar = new h(i3111111111115, i3111111111116, i3111111111117, i3111111111118, i3111111111118, bArr);
                                                    } else {
                                                        hVar = null;
                                                    }
                                                    str6 = r10.f5448b;
                                                    if (str6 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r10.f5465t == 0) {
                                                        if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    aVar.f35345t = r10.f5459n;
                                                    aVar.f35346u = r10.f5460o;
                                                    aVar.f35349x = f10;
                                                    aVar.f35348w = iIntValue;
                                                    aVar.f35350y = r10.f5469x;
                                                    aVar.f35351z = r10.f5470y;
                                                    aVar.f35315A = hVar;
                                                    i13 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str24)) {
                                                    }
                                                    i13 = 3;
                                                }
                                                str7 = r10.f5448b;
                                                if (str7 != null) {
                                                    aVar.f35328b = r10.f5448b;
                                                }
                                                aVar.f35327a = Integer.toString(i33);
                                                if (r10.f5446a) {
                                                    str8 = "video/webm";
                                                } else {
                                                    str8 = "video/x-matroska";
                                                }
                                                aVar.f35337l = p078g1.t.m(str8);
                                                aVar.f35338m = p078g1.t.m(str24);
                                                aVar.f35339n = i11;
                                                aVar.f35330d = r10.f5444Y;
                                                aVar.f35331e = i3111111111114;
                                                aVar.f35341p = listSingletonList;
                                                aVar.j = str4;
                                                aVar.f35342q = r10.f5458m;
                                                n nVar113 = new n(aVar);
                                                K kP113 = rVar3.p(r10.f5450d, i13);
                                                r10.f5445Z = kP113;
                                                kP113.d(nVar113);
                                                sparseArray.put(r10.f5450d, r10);
                                                bVar2 = bVar5;
                                                c0077b = null;
                                            } else {
                                                str12 = str12;
                                                str14 = str14;
                                                str24 = "audio/raw";
                                                iT = 3;
                                            }
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1117 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i3111111111119 = (z1117 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map114 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31111111111110 = r10.f5420A;
                                                    int i31111111111111 = r10.f5422C;
                                                    int i31111111111112 = r10.f5421B;
                                                    int i31111111111113 = r10.f5461p;
                                                    hVar = new h(i31111111111110, i31111111111111, i31111111111112, i31111111111113, i31111111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i3111111111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar114 = new n(aVar);
                                            K kP114 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP114;
                                            kP114.d(nVar114);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 24:
                                            str25 = "text/vtt";
                                            iT2 = A.t(r10.f5437R);
                                            if (iT2 == 0) {
                                                p114j1.k.f("Unsupported little endian PCM bit depth: " + r10.f5437R + ". Setting mimeType to audio/x-unknown");
                                                str24 = "audio/x-unknown";
                                                iT = -1;
                                                listSingletonList = null;
                                                str4 = null;
                                                i11 = -1;
                                            } else {
                                                str12 = str12;
                                                str14 = str14;
                                                str24 = "audio/raw";
                                                listSingletonList = null;
                                                str4 = null;
                                                i11 = -1;
                                                iT = iT2;
                                            }
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1118 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31111111111114 = (z1118 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map115 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31111111111115 = r10.f5420A;
                                                    int i31111111111116 = r10.f5422C;
                                                    int i31111111111117 = r10.f5421B;
                                                    int i31111111111118 = r10.f5461p;
                                                    hVar = new h(i31111111111115, i31111111111116, i31111111111117, i31111111111118, i31111111111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31111111111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar115 = new n(aVar);
                                            K kP115 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP115;
                                            kP115.d(nVar115);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 25:
                                            str25 = "text/vtt";
                                            listSingletonList = ImmutableList.N(f5358g0, r10.a(str23));
                                            str24 = "text/x-ssa";
                                            iT = -1;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z1119 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31111111111119 = (z1119 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map116 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311111111111110 = r10.f5420A;
                                                    int i311111111111111 = r10.f5422C;
                                                    int i311111111111112 = r10.f5421B;
                                                    int i311111111111113 = r10.f5461p;
                                                    hVar = new h(i311111111111110, i311111111111111, i311111111111112, i311111111111113, i311111111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31111111111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar116 = new n(aVar);
                                            K kP116 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP116;
                                            kP116.d(nVar116);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 26:
                                            A1.A a10 = A1.A.a(new p114j1.r(r10.a(r10.f5449c)), false, null);
                                            r10.f5447a0 = a10.f385b;
                                            str24 = "video/hevc";
                                            listSingletonList = a10.f384a;
                                            str4 = a10.f394l;
                                            str12 = str12;
                                            str14 = str14;
                                            iT = -1;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z11110 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i311111111111114 = (z11110 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map117 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311111111111115 = r10.f5420A;
                                                    int i311111111111116 = r10.f5422C;
                                                    int i311111111111117 = r10.f5421B;
                                                    int i311111111111118 = r10.f5461p;
                                                    hVar = new h(i311111111111115, i311111111111116, i311111111111117, i311111111111118, i311111111111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i311111111111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar117 = new n(aVar);
                                            K kP117 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP117;
                                            kP117.d(nVar117);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 27:
                                            str25 = "text/vtt";
                                            str24 = str25;
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z11111 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i311111111111119 = (z11111 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map118 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i3111111111111110 = r10.f5420A;
                                                    int i3111111111111111 = r10.f5422C;
                                                    int i3111111111111112 = r10.f5421B;
                                                    int i3111111111111113 = r10.f5461p;
                                                    hVar = new h(i3111111111111110, i3111111111111111, i3111111111111112, i3111111111111113, i3111111111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i311111111111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar118 = new n(aVar);
                                            K kP118 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP118;
                                            kP118.d(nVar118);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 28:
                                            str25 = "text/vtt";
                                            str24 = "application/x-subrip";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z11112 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i3111111111111114 = (z11112 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map119 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i3111111111111115 = r10.f5420A;
                                                    int i3111111111111116 = r10.f5422C;
                                                    int i3111111111111117 = r10.f5421B;
                                                    int i3111111111111118 = r10.f5461p;
                                                    hVar = new h(i3111111111111115, i3111111111111116, i3111111111111117, i3111111111111118, i3111111111111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i3111111111111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar119 = new n(aVar);
                                            K kP119 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP119;
                                            kP119.d(nVar119);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case 29:
                                            str24 = "video/mpeg2";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z11113 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i3111111111111119 = (z11113 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map1110 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31111111111111110 = r10.f5420A;
                                                    int i31111111111111111 = r10.f5422C;
                                                    int i31111111111111112 = r10.f5421B;
                                                    int i31111111111111113 = r10.f5461p;
                                                    hVar = new h(i31111111111111110, i31111111111111111, i31111111111111112, i31111111111111113, i31111111111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i3111111111111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar1110 = new n(aVar);
                                            K kP1110 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP1110;
                                            kP1110.d(nVar1110);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                            str24 = "audio/eac3";
                                            iT = -1;
                                            listSingletonList = null;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z11114 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31111111111111114 = (z11114 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map1111 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i31111111111111115 = r10.f5420A;
                                                    int i31111111111111116 = r10.f5422C;
                                                    int i31111111111111117 = r10.f5421B;
                                                    int i31111111111111118 = r10.f5461p;
                                                    hVar = new h(i31111111111111115, i31111111111111116, i31111111111111117, i31111111111111118, i31111111111111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31111111111111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar1111 = new n(aVar);
                                            K kP1111 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP1111;
                                            kP1111.d(nVar1111);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                            listM = Collections.singletonList(r10.a(str23));
                                            str24 = "audio/flac";
                                            listSingletonList = listM;
                                            iT = -1;
                                            str4 = null;
                                            i11 = -1;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z11115 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i31111111111111119 = (z11115 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map1112 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311111111111111110 = r10.f5420A;
                                                    int i311111111111111111 = r10.f5422C;
                                                    int i311111111111111112 = r10.f5421B;
                                                    int i311111111111111113 = r10.f5461p;
                                                    hVar = new h(i311111111111111110, i311111111111111111, i311111111111111112, i311111111111111113, i311111111111111113, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i31111111111111119;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar1112 = new n(aVar);
                                            K kP1112 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP1112;
                                            kP1112.d(nVar1112);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(r10.a(r10.f5449c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            str25 = "text/vtt";
                                            arrayList2.add(byteBufferAllocate.order(byteOrder).putLong(r10.f5439T).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r10.f5440U).array());
                                            str24 = "audio/opus";
                                            str12 = str12;
                                            str14 = str14;
                                            i11 = 5760;
                                            iT = -1;
                                            str4 = null;
                                            listSingletonList = arrayList2;
                                            if (r10.f5435P != null) {
                                                str4 = (String) c0579nI.f539a;
                                                str24 = "video/dolby-vision";
                                            }
                                            boolean z11116 = r10.f5443X;
                                            if (r10.f5442W) {
                                                i12 = 2;
                                            } else {
                                                i12 = 0;
                                            }
                                            int i311111111111111114 = (z11116 ? 1 : 0) | i12;
                                            aVar = new n.a();
                                            zI = p078g1.t.i(str24);
                                            Map<String, Integer> map1113 = f5362k0;
                                            if (zI) {
                                                aVar.f35317C = r10.f5436Q;
                                                aVar.f35318D = r10.f5438S;
                                                aVar.f35319E = iT;
                                                i13 = 1;
                                            } else if (p078g1.t.l(str24)) {
                                                if (r10.f5464s == 0) {
                                                    i17 = r10.f5462q;
                                                    i14 = -1;
                                                    if (i17 == -1) {
                                                        i17 = r10.f5459n;
                                                    }
                                                    r10.f5462q = i17;
                                                    i18 = r10.f5463r;
                                                    if (i18 == -1) {
                                                        i18 = r10.f5460o;
                                                    }
                                                    r10.f5463r = i18;
                                                } else {
                                                    i14 = -1;
                                                }
                                                i15 = r10.f5462q;
                                                if (i15 != i14) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (r10.f5471z) {
                                                    if (r10.f5425F == -1.0f) {
                                                    }
                                                    int i311111111111111115 = r10.f5420A;
                                                    int i311111111111111116 = r10.f5422C;
                                                    int i311111111111111117 = r10.f5421B;
                                                    int i311111111111111118 = r10.f5461p;
                                                    hVar = new h(i311111111111111115, i311111111111111116, i311111111111111117, i311111111111111118, i311111111111111118, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str6 = r10.f5448b;
                                                if (str6 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r10.f5465t == 0) {
                                                    if (Float.compare(r10.f5468w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r10.f5468w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r10.f5468w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.f35345t = r10.f5459n;
                                                aVar.f35346u = r10.f5460o;
                                                aVar.f35349x = f10;
                                                aVar.f35348w = iIntValue;
                                                aVar.f35350y = r10.f5469x;
                                                aVar.f35351z = r10.f5470y;
                                                aVar.f35315A = hVar;
                                                i13 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str24)) {
                                                }
                                                i13 = 3;
                                            }
                                            str7 = r10.f5448b;
                                            if (str7 != null) {
                                                aVar.f35328b = r10.f5448b;
                                            }
                                            aVar.f35327a = Integer.toString(i33);
                                            if (r10.f5446a) {
                                                str8 = "video/webm";
                                            } else {
                                                str8 = "video/x-matroska";
                                            }
                                            aVar.f35337l = p078g1.t.m(str8);
                                            aVar.f35338m = p078g1.t.m(str24);
                                            aVar.f35339n = i11;
                                            aVar.f35330d = r10.f5444Y;
                                            aVar.f35331e = i311111111111111114;
                                            aVar.f35341p = listSingletonList;
                                            aVar.j = str4;
                                            aVar.f35342q = r10.f5458m;
                                            n nVar1113 = new n(aVar);
                                            K kP1113 = rVar3.p(r10.f5450d, i13);
                                            r10.f5445Z = kP1113;
                                            kP1113.d(nVar1113);
                                            sparseArray.put(r10.f5450d, r10);
                                            bVar2 = bVar5;
                                            c0077b = null;
                                            break;
                                        default:
                                            throw ParserException.a(null, "Unrecognized codec identifier.");
                                    }
                                    break;
                                default:
                                    str12 = str12;
                                    str14 = str14;
                                    bVar2 = bVar5;
                                    str3 = str18;
                                    c0077b = null;
                                    break;
                            }
                            bVar2.f5416x = c0077b;
                            str18 = str3;
                            z12 = false;
                        }
                        z10 = z12;
                    }
                    z13 = true;
                } else {
                    arrayDeque = arrayDeque2;
                }
                str = str13;
                ?? r11 = 0;
                int i53 = aVar2.f5352e;
                ?? r12 = aVar2.f5350c;
                if (i53 == 0) {
                    ?? r13 = (C0574i) qVar;
                    int i54 = 4;
                    long jC = r12.c(r13, true, false, 4);
                    if (jC == -2) {
                        r13.h();
                        while (true) {
                            byte[] bArr11 = aVar2.f5348a;
                            r13.j(bArr11, r11, i54);
                            iB = d.b(bArr11[r11]);
                            if (iB != -1 && iB <= i54) {
                                iA = (int) d.a(bArr11, iB, r11);
                                b.this.getClass();
                                if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                }
                            }
                            r13.i(1);
                            r11 = 0;
                            i54 = 4;
                        }
                        r13.i(iB);
                        jC = iA;
                    }
                    z11 = true;
                    if (jC == -1) {
                        z10 = false;
                        z13 = false;
                    } else {
                        aVar2.f5353f = (int) jC;
                        aVar2.f5352e = 1;
                    }
                } else {
                    z11 = true;
                }
                if (aVar2.f5352e == z11) {
                    aVar2.f5354g = r12.c((C0574i) qVar, false, z11, 8);
                    aVar2.f5352e = 2;
                }
                a aVar5 = aVar2.f5351d;
                int i55 = aVar2.f5353f;
                b.this.getClass();
                switch (i55) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        i10 = 2;
                        break;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        i10 = 3;
                        break;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        i10 = 1;
                        break;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        i10 = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        i10 = 5;
                        break;
                    default:
                        i10 = 0;
                        break;
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        long position = ((C0574i) qVar).getPosition();
                        arrayDeque.push(new S1.a.C0076a(aVar2.f5353f, position + aVar2.f5354g));
                        aVar2.f5351d.c(aVar2.f5353f, position, aVar2.f5354g);
                        z10 = false;
                        aVar2.f5352e = 0;
                    } else if (i10 == 2) {
                        long j12 = aVar2.f5354g;
                        if (j12 > 8) {
                            throw ParserException.a(null, "Invalid integer size: " + aVar2.f5354g);
                        }
                        aVar2.f5351d.b(aVar2.f5353f, aVar2.a((C0574i) qVar, (int) j12));
                        z10 = false;
                        aVar2.f5352e = 0;
                    } else if (i10 == 3) {
                        long j13 = aVar2.f5354g;
                        if (j13 > 2147483647L) {
                            throw ParserException.a(null, "String element size: " + aVar2.f5354g);
                        }
                        a aVar6 = aVar2.f5351d;
                        int i56 = aVar2.f5353f;
                        int i57 = (int) j13;
                        if (i57 == 0) {
                            str2 = "";
                        } else {
                            byte[] bArr12 = new byte[i57];
                            ((C0574i) qVar).readFully(bArr12, 0, i57);
                            while (i57 > 0 && bArr12[i57 - 1] == 0) {
                                i57--;
                            }
                            str2 = new String(bArr12, 0, i57);
                        }
                        b bVar6 = b.this;
                        bVar6.getClass();
                        if (i56 == 134) {
                            bVar6.d(i56);
                            bVar6.f5416x.f5449c = str2;
                        } else if (i56 == 17026) {
                            if (!"webm".equals(str2) && !"matroska".equals(str2)) {
                                throw ParserException.a(null, "DocType " + str2 + " not supported");
                            }
                            bVar6.f5415w = str2.equals("webm");
                        } else if (i56 == 21358) {
                            bVar6.d(i56);
                            bVar6.f5416x.f5448b = str2;
                        } else if (i56 == 2274716) {
                            bVar6.d(i56);
                            bVar6.f5416x.f5444Y = str2;
                        }
                        z10 = false;
                        aVar2.f5352e = 0;
                    } else if (i10 == 4) {
                        aVar2.f5351d.a(aVar2.f5353f, (int) aVar2.f5354g, (C0574i) qVar);
                        z10 = false;
                        aVar2.f5352e = 0;
                    } else {
                        if (i10 != 5) {
                            throw ParserException.a(null, "Invalid element type " + i10);
                        }
                        long j14 = aVar2.f5354g;
                        if (j14 != 4 && j14 != 8) {
                            throw ParserException.a(null, "Invalid float size: " + aVar2.f5354g);
                        }
                        a aVar7 = aVar2.f5351d;
                        int i58 = aVar2.f5353f;
                        int i59 = (int) j14;
                        long jA = aVar2.a((C0574i) qVar, i59);
                        double dIntBitsToFloat = i59 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                        b bVar7 = b.this;
                        if (i58 == 181) {
                            bVar7.d(i58);
                            bVar7.f5416x.f5438S = (int) dIntBitsToFloat;
                        } else if (i58 != 17545) {
                            switch (i58) {
                                case 21969:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5425F = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5426G = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5427H = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5428I = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5429J = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5430K = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5431L = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5432M = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5433N = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    bVar7.d(i58);
                                    bVar7.f5416x.f5434O = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i58) {
                                        case 30323:
                                            bVar7.d(i58);
                                            bVar7.f5416x.f5466u = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            bVar7.d(i58);
                                            bVar7.f5416x.f5467v = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            bVar7.d(i58);
                                            bVar7.f5416x.f5468w = (float) dIntBitsToFloat;
                                            break;
                                        default:
                                            bVar7.getClass();
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            bVar7.f5413u = (long) dIntBitsToFloat;
                        }
                        z10 = false;
                        aVar2.f5352e = 0;
                    }
                    z13 = true;
                } else {
                    ((C0574i) qVar).i((int) aVar2.f5354g);
                    aVar2.f5352e = 0;
                    str13 = str;
                    str12 = str12;
                    str18 = str18;
                    str16 = str16;
                    str14 = str14;
                    str15 = str15;
                }
            }
            if (z13) {
                long position2 = ((C0574i) qVar).getPosition();
                bVar = this;
                if (bVar.f5364B) {
                    bVar.f5366D = position2;
                    e10.f414a = bVar.f5365C;
                    bVar.f5364B = z10;
                    return 1;
                }
                e11 = e10;
                if (bVar.f5417y) {
                    long j15 = bVar.f5366D;
                    if (j15 != -1) {
                        e11.f414a = j15;
                        bVar.f5366D = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                bVar = this;
                e11 = e10;
            }
            bVar4 = bVar;
            str13 = str;
            str12 = str12;
            str18 = str18;
            str16 = str16;
            str14 = str14;
            str15 = str15;
        }
        b bVar8 = bVar4;
        if (z13) {
            return 0;
        }
        int i60 = 0;
        while (true) {
            SparseArray<C0077b> sparseArray2 = bVar8.f5393c;
            if (i60 >= sparseArray2.size()) {
                return -1;
            }
            C0077b c0077bValueAt = sparseArray2.valueAt(i60);
            c0077bValueAt.f5445Z.getClass();
            L l10 = c0077bValueAt.f5441V;
            if (l10 != null) {
                l10.a(c0077bValueAt.f5445Z, c0077bValueAt.f5456k);
            }
            i60++;
        }
    }

    public final void j(C0574i c0574i, int i10) throws IOException {
        p114j1.r rVar = this.f5402i;
        if (rVar.f41064c >= i10) {
            return;
        }
        byte[] bArr = rVar.f41062a;
        if (bArr.length < i10) {
            rVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = rVar.f41062a;
        int i11 = rVar.f41064c;
        c0574i.a(bArr2, i11, i10 - i11, false);
        rVar.F(i10);
    }

    public final void k() {
        this.f5384V = 0;
        this.f5385W = 0;
        this.f5386X = 0;
        this.f5387Y = false;
        this.f5388Z = false;
        this.f5390a0 = false;
        this.f5392b0 = 0;
        this.f5394c0 = (byte) 0;
        this.f5396d0 = false;
        this.f5404l.D(0);
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        c cVar = new c();
        C0574i c0574i = (C0574i) qVar;
        long j = c0574i.f522c;
        long j10 = 1024;
        if (j != -1 && j <= 1024) {
            j10 = j;
        }
        int i10 = (int) j10;
        p114j1.r rVar = cVar.f5472a;
        c0574i.c(rVar.f41062a, 0, 4, false);
        cVar.f5473b = 4;
        for (long jW = rVar.w(); jW != 440786851; jW = ((jW << 8) & (-256)) | ((long) (rVar.f41062a[0] & 255))) {
            int i11 = cVar.f5473b + 1;
            cVar.f5473b = i11;
            if (i11 == i10) {
                return false;
            }
            c0574i.c(rVar.f41062a, 0, 1, false);
        }
        long jA = cVar.a(c0574i);
        long j11 = cVar.f5473b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j11 + jA >= j) {
            return false;
        }
        while (true) {
            long j12 = cVar.f5473b;
            long j13 = j11 + jA;
            if (j12 >= j13) {
                return j12 == j13;
            }
            if (cVar.a(c0574i) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = cVar.a(c0574i);
            if (jA2 < 0 || jA2 > 2147483647L) {
                return false;
            }
            if (jA2 != 0) {
                int i12 = (int) jA2;
                c0574i.k(i12, false);
                cVar.f5473b += i12;
            }
        }
    }

    @Override // A1.p
    public final void m(r rVar) {
        if (this.f5397e) {
            rVar = new m(rVar, this.f5399f);
        }
        this.f5398e0 = rVar;
    }

    public final long n(long j) throws ParserException {
        long j10 = this.f5412t;
        if (j10 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i10 = A.f40996a;
        return A.L(j, j10, 1000L, RoundingMode.DOWN);
    }

    public final int o(C0574i c0574i, C0077b c0077b, int i10, boolean z10) throws IOException {
        int iF;
        int iF2;
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(c0077b.f5449c)) {
            p(c0574i, f5357f0, i10);
            int i12 = this.f5385W;
            k();
            return i12;
        }
        if ("S_TEXT/ASS".equals(c0077b.f5449c)) {
            p(c0574i, f5359h0, i10);
            int i13 = this.f5385W;
            k();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(c0077b.f5449c)) {
            p(c0574i, f5360i0, i10);
            int i14 = this.f5385W;
            k();
            return i14;
        }
        K k10 = c0077b.f5445Z;
        boolean z12 = this.f5387Y;
        p114j1.r rVar = this.f5404l;
        if (!z12) {
            boolean z13 = c0077b.f5455i;
            p114j1.r rVar2 = this.f5402i;
            if (z13) {
                this.f5380R &= -1073741825;
                if (!this.f5388Z) {
                    c0574i.a(rVar2.f41062a, 0, 1, false);
                    this.f5384V++;
                    byte b10 = rVar2.f41062a[0];
                    if ((b10 & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.f5394c0 = b10;
                    this.f5388Z = true;
                }
                byte b11 = this.f5394c0;
                if ((b11 & 1) == 1) {
                    boolean z14 = (b11 & 2) == 2;
                    this.f5380R |= 1073741824;
                    if (!this.f5396d0) {
                        p114j1.r rVar3 = this.f5406n;
                        c0574i.a(rVar3.f41062a, 0, 8, false);
                        this.f5384V += 8;
                        this.f5396d0 = true;
                        rVar2.f41062a[0] = (byte) ((z14 ? 128 : 0) | 8);
                        rVar2.G(0);
                        k10.c(rVar2, 1, 1);
                        this.f5385W++;
                        rVar3.G(0);
                        k10.c(rVar3, 8, 1);
                        this.f5385W += 8;
                    }
                    if (z14) {
                        if (!this.f5390a0) {
                            c0574i.a(rVar2.f41062a, 0, 1, false);
                            this.f5384V++;
                            rVar2.G(0);
                            this.f5392b0 = rVar2.u();
                            this.f5390a0 = true;
                        }
                        int i15 = this.f5392b0 * 4;
                        rVar2.D(i15);
                        c0574i.a(rVar2.f41062a, 0, i15, false);
                        this.f5384V += i15;
                        short s10 = (short) ((this.f5392b0 / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f5409q;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f5409q = ByteBuffer.allocate(i16);
                        }
                        this.f5409q.position(0);
                        this.f5409q.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.f5392b0;
                            if (i17 >= i11) {
                                break;
                            }
                            int iY = rVar2.y();
                            if (i17 % 2 == 0) {
                                this.f5409q.putShort((short) (iY - i18));
                            } else {
                                this.f5409q.putInt(iY - i18);
                            }
                            i17++;
                            i18 = iY;
                        }
                        int i19 = (i10 - this.f5384V) - i18;
                        if (i11 % 2 == 1) {
                            this.f5409q.putInt(i19);
                        } else {
                            this.f5409q.putShort((short) i19);
                            this.f5409q.putInt(0);
                        }
                        byte[] bArrArray = this.f5409q.array();
                        p114j1.r rVar4 = this.f5407o;
                        rVar4.E(i16, bArrArray);
                        k10.c(rVar4, i16, 1);
                        this.f5385W += i16;
                    }
                }
            } else {
                byte[] bArr = c0077b.j;
                if (bArr != null) {
                    rVar.E(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c0077b.f5449c)) {
                z11 = z10;
            } else {
                z11 = c0077b.f5453g > 0;
            }
            if (z11) {
                this.f5380R |= 268435456;
                this.f5408p.D(0);
                int i20 = (rVar.f41064c + i10) - this.f5384V;
                rVar2.D(4);
                byte[] bArr2 = rVar2.f41062a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                k10.c(rVar2, 4, 2);
                this.f5385W += 4;
            }
            this.f5387Y = true;
        }
        int i21 = i10 + rVar.f41064c;
        if (!"V_MPEG4/ISO/AVC".equals(c0077b.f5449c) && !"V_MPEGH/ISO/HEVC".equals(c0077b.f5449c)) {
            if (c0077b.f5441V != null) {
                p241t7.b.k(rVar.f41064c == 0);
                c0077b.f5441V.c(c0574i);
            }
            while (true) {
                int i22 = this.f5384V;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int iA = rVar.a();
                if (iA > 0) {
                    iF2 = Math.min(i23, iA);
                    k10.a(iF2, rVar);
                } else {
                    iF2 = k10.f(c0574i, i23, false);
                }
                this.f5384V += iF2;
                this.f5385W += iF2;
            }
        } else {
            p114j1.r rVar5 = this.f5401h;
            byte[] bArr3 = rVar5.f41062a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = c0077b.f5447a0;
            int i25 = 4 - i24;
            while (this.f5384V < i21) {
                int i26 = this.f5386X;
                if (i26 == 0) {
                    int iMin = Math.min(i24, rVar.a());
                    c0574i.a(bArr3, i25 + iMin, i24 - iMin, false);
                    if (iMin > 0) {
                        rVar.f(bArr3, i25, iMin);
                    }
                    this.f5384V += i24;
                    rVar5.G(0);
                    this.f5386X = rVar5.y();
                    p114j1.r rVar6 = this.f5400g;
                    rVar6.G(0);
                    k10.a(4, rVar6);
                    this.f5385W += 4;
                } else {
                    int iA2 = rVar.a();
                    if (iA2 > 0) {
                        iF = Math.min(i26, iA2);
                        k10.a(iF, rVar);
                    } else {
                        iF = k10.f(c0574i, i26, false);
                    }
                    this.f5384V += iF;
                    this.f5385W += iF;
                    this.f5386X -= iF;
                }
            }
        }
        if ("A_VORBIS".equals(c0077b.f5449c)) {
            p114j1.r rVar7 = this.j;
            rVar7.G(0);
            k10.a(4, rVar7);
            this.f5385W += 4;
        }
        int i27 = this.f5385W;
        k();
        return i27;
    }

    public final void p(C0574i c0574i, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        p114j1.r rVar = this.f5405m;
        byte[] bArr2 = rVar.f41062a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            rVar.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c0574i.a(rVar.f41062a, bArr.length, i10, false);
        rVar.G(0);
        rVar.F(length);
    }

    @Override // A1.p
    public final void a() {
    }
}
