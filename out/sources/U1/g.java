package U1;

import A1.C0568c;
import A1.C0576k;
import A1.E;
import A1.F;
import A1.G;
import A1.J;
import A1.K;
import A1.L;
import A1.p;
import A1.q;
import A1.z;
import androidx.core.view.C1293h;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.s;
import p078g1.t;
import p114j1.A;
import p114j1.r;

/* JADX INFO: compiled from: Mp4Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements p, F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a[] f6211A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long[][] f6212B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6213C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f6214D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f6215E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public P1.a f6216F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X1.l.a f6217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f6219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f6220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f6221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f6222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<k1.b.a> f6223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f6224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f6225i;
    public ImmutableList<J> j = ImmutableList.K();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r f6230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f6238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f6240y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public A1.r f6241z;

    /* JADX INFO: compiled from: Mp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f6242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f6243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final K f6244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final L f6245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6246e;

        public a(l lVar, o oVar, K k10) {
            this.f6242a = lVar;
            this.f6243b = oVar;
            this.f6244c = k10;
            this.f6245d = "audio/true-hd".equals(lVar.f6263g.f35302n) ? new L() : null;
        }
    }

    public g(X1.l.a aVar, int i10) {
        this.f6217a = aVar;
        this.f6218b = i10;
        this.f6226k = (i10 & 4) != 0 ? 3 : 0;
        this.f6224h = new j();
        this.f6225i = new ArrayList();
        this.f6222f = new r(16);
        this.f6223g = new ArrayDeque<>();
        this.f6219c = new r(p127k1.e.f41399a);
        this.f6220d = new r(6);
        this.f6221e = new r();
        this.f6231p = -1;
        this.f6241z = A1.r.f552a0;
        this.f6211A = new a[0];
    }

    @Override // A1.F
    public final boolean d() {
        return true;
    }

    @Override // A1.p
    public final void f(long j, long j10) {
        this.f6223g.clear();
        this.f6229n = 0;
        this.f6231p = -1;
        this.f6232q = 0;
        this.f6233r = 0;
        this.f6234s = 0;
        this.f6235t = false;
        if (j == 0) {
            if (this.f6226k != 3) {
                this.f6226k = 0;
                this.f6229n = 0;
                return;
            } else {
                j jVar = this.f6224h;
                jVar.f6251a.clear();
                jVar.f6252b = 0;
                this.f6225i.clear();
                return;
            }
        }
        for (a aVar : this.f6211A) {
            o oVar = aVar.f6243b;
            int iD = A.d(oVar.f6294f, j10, false);
            while (true) {
                if (iD < 0) {
                    iD = -1;
                    break;
                } else if ((oVar.f6295g[iD] & 1) != 0) {
                    break;
                } else {
                    iD--;
                }
            }
            if (iD == -1) {
                iD = oVar.a(j10);
            }
            aVar.f6246e = iD;
            L l10 = aVar.f6245d;
            if (l10 != null) {
                l10.f434b = false;
                l10.f435c = 0;
            }
        }
    }

    @Override // A1.p
    public final List g() {
        return this.j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x038b  */
    /* JADX WARN: Code duplicated, block: B:193:0x039e  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:264:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:269:0x0510  */
    /* JADX WARN: Code duplicated, block: B:386:0x071e A[LOOP:1: B:4:0x000d->B:386:0x071e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:394:0x071c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x03af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x03af A[SYNTHETIC] */
    @Override // A1.p
    public final int h(q qVar, E e10) throws IOException {
        int i10;
        ArrayDeque<k1.b.a> arrayDeque;
        r rVar;
        int i11;
        char c10;
        int i12;
        int[] iArr;
        int i13;
        int iD;
        int iH;
        int i14;
        char c11;
        boolean z10;
        boolean z11;
        k1.b.a aVarPeek;
        boolean z12;
        int i15;
        int i16;
        int i17;
        boolean z13;
        do {
            int i18 = 0;
            int i19 = 8;
            int i20 = 4;
            int i21 = 2;
            boolean z14 = true;
            while (true) {
                i10 = this.f6226k;
                arrayDeque = this.f6223g;
                rVar = this.f6221e;
                i11 = this.f6218b;
                if (i10 != 0) {
                    break;
                }
                boolean z15 = z14;
                int i22 = this.f6229n;
                r rVar2 = this.f6222f;
                if (i22 == 0) {
                    if (qVar.a(rVar2.f41062a, 0, 8, z15)) {
                        this.f6229n = 8;
                        rVar2.G(0);
                        this.f6228m = rVar2.w();
                        this.f6227l = rVar2.h();
                    } else {
                        if (this.f6215E == 2 && (i11 & 2) != 0) {
                            K kP = this.f6241z.p(0, 4);
                            P1.a aVar = this.f6216F;
                            s sVar = aVar == null ? null : new s(aVar);
                            g1.n.a aVar2 = new g1.n.a();
                            aVar2.f35336k = sVar;
                            C0576k.b(aVar2, kP);
                            this.f6241z.j();
                            this.f6241z.g(new F.b(-9223372036854775807L));
                        }
                        i15 = 8;
                        i17 = 0;
                        i16 = 4;
                        z12 = true;
                        z13 = false;
                    }
                    if (!z13) {
                        return -1;
                    }
                    i18 = i17;
                    i20 = i16;
                    z14 = z12;
                    i21 = 2;
                    i19 = i15;
                }
                long j = this.f6228m;
                if (j == 1) {
                    qVar.readFully(rVar2.f41062a, 8, 8);
                    this.f6229n += 8;
                    this.f6228m = rVar2.z();
                } else if (j == 0) {
                    long length = qVar.getLength();
                    if (length == -1 && (aVarPeek = arrayDeque.peek()) != null) {
                        length = aVarPeek.f41390b;
                    }
                    if (length != -1) {
                        this.f6228m = (length - qVar.getPosition()) + ((long) this.f6229n);
                    }
                }
                long j10 = this.f6228m;
                int i23 = this.f6229n;
                if (j10 < i23) {
                    throw ParserException.b("Atom size less than header length (unsupported).");
                }
                int i24 = this.f6227l;
                if (i24 == 1836019574 || i24 == 1953653099 || i24 == 1835297121 || i24 == 1835626086 || i24 == 1937007212 || i24 == 1701082227 || i24 == 1835365473 || i24 == 1635284069) {
                    z12 = true;
                    long position = qVar.getPosition();
                    long j11 = this.f6228m;
                    long j12 = this.f6229n;
                    long j13 = (position + j11) - j12;
                    if (j11 == j12 || this.f6227l != 1835365473) {
                        i15 = 8;
                        i16 = 4;
                    } else {
                        i15 = 8;
                        rVar.D(8);
                        qVar.j(rVar.f41062a, 0, 8);
                        byte[] bArr = U1.a.f6123a;
                        int i25 = rVar.f41063b;
                        i16 = 4;
                        rVar.H(4);
                        if (rVar.h() != 1751411826) {
                            i25 += 4;
                        }
                        rVar.G(i25);
                        qVar.i(rVar.f41063b);
                        qVar.h();
                    }
                    arrayDeque.push(new k1.b.a(this.f6227l, j13));
                    if (this.f6228m == this.f6229n) {
                        n(j13);
                        i17 = 0;
                    } else {
                        i17 = 0;
                        this.f6226k = 0;
                        this.f6229n = 0;
                    }
                } else {
                    if (i24 == 1835296868 || i24 == 1836476516 || i24 == 1751411826 || i24 == 1937011556 || i24 == 1937011827 || i24 == 1937011571 || i24 == 1668576371 || i24 == 1701606260 || i24 == 1937011555 || i24 == 1937011578 || i24 == 1937013298 || i24 == 1937007471 || i24 == 1668232756 || i24 == 1953196132 || i24 == 1718909296 || i24 == 1969517665 || i24 == 1801812339 || i24 == 1768715124) {
                        p241t7.b.k(i23 == 8);
                        p241t7.b.k(this.f6228m <= 2147483647L);
                        r rVar3 = new r((int) this.f6228m);
                        System.arraycopy(rVar2.f41062a, 0, rVar3.f41062a, 0, 8);
                        this.f6230o = rVar3;
                        z12 = true;
                        this.f6226k = 1;
                    } else {
                        long position2 = qVar.getPosition();
                        long j14 = this.f6229n;
                        long j15 = position2 - j14;
                        if (this.f6227l == 1836086884) {
                            this.f6216F = new P1.a(0L, j15, -9223372036854775807L, j15 + j14, this.f6228m - j14);
                        }
                        this.f6230o = null;
                        this.f6226k = 1;
                        z12 = true;
                    }
                    i15 = 8;
                    i17 = 0;
                    i16 = 4;
                }
                z13 = z12;
                if (!z13) {
                    return -1;
                }
                i18 = i17;
                i20 = i16;
                z14 = z12;
                i21 = 2;
                i19 = i15;
            }
            if (i10 != z14) {
                if (i10 != i21) {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    ArrayList arrayList = this.f6225i;
                    j jVar = this.f6224h;
                    int i26 = jVar.f6252b;
                    if (i26 != 0) {
                        if (i26 != z14) {
                            ArrayList arrayList2 = jVar.f6251a;
                            short s10 = 2192;
                            if (i26 == i21) {
                                long length2 = qVar.getLength();
                                int i27 = jVar.f6253c - 20;
                                r rVar4 = new r(i27);
                                qVar.readFully(rVar4.f41062a, 0, i27);
                                int i28 = 0;
                                while (i28 < i27 / 12) {
                                    rVar4.H(2);
                                    byte[] bArr2 = rVar4.f41062a;
                                    int i29 = rVar4.f41063b;
                                    int i30 = i29 + 1;
                                    rVar4.f41063b = i30;
                                    int i31 = bArr2[i29] & 255;
                                    rVar4.f41063b = i29 + 2;
                                    short s11 = (short) (((bArr2[i30] & 255) << i19) | i31);
                                    if (s11 != s10 && s11 != 2816) {
                                        if (s11 != 2817) {
                                            if (s11 != 2819 && s11 != 2820) {
                                                rVar4.H(i19);
                                            }
                                            i28++;
                                            length2 = length2;
                                            i19 = 8;
                                            s10 = 2192;
                                        }
                                        arrayList2.add(new j.a(rVar4.j(), (length2 - ((long) jVar.f6253c)) - ((long) rVar4.j())));
                                        i28++;
                                        length2 = length2;
                                        i19 = 8;
                                        s10 = 2192;
                                    }
                                    arrayList2.add(new j.a(rVar4.j(), (length2 - ((long) jVar.f6253c)) - ((long) rVar4.j())));
                                    i28++;
                                    length2 = length2;
                                    i19 = 8;
                                    s10 = 2192;
                                }
                                if (arrayList2.isEmpty()) {
                                    e10.f414a = 0L;
                                } else {
                                    jVar.f6252b = 3;
                                    e10.f414a = ((j.a) arrayList2.get(0)).f6254a;
                                }
                            } else {
                                if (i26 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position3 = qVar.getPosition();
                                int length3 = (int) ((qVar.getLength() - qVar.getPosition()) - ((long) jVar.f6253c));
                                r rVar5 = new r(length3);
                                qVar.readFully(rVar5.f41062a, i18, length3);
                                int i32 = i18;
                                while (i32 < arrayList2.size()) {
                                    j.a aVar3 = (j.a) arrayList2.get(i32);
                                    rVar5.G((int) (aVar3.f6254a - position3));
                                    rVar5.H(i20);
                                    int iJ = rVar5.j();
                                    Charset charset = StandardCharsets.UTF_8;
                                    switch (rVar5.s(iJ, charset)) {
                                        case "SlowMotion_Data":
                                            c11 = 2192;
                                            break;
                                        case "Super_SlowMotion_Edit_Data":
                                            c11 = 2819;
                                            break;
                                        case "Super_SlowMotion_Data":
                                            c11 = 2816;
                                            break;
                                        case "Super_SlowMotion_Deflickering_On":
                                            c11 = 2820;
                                            break;
                                        case "Super_SlowMotion_BGM":
                                            c11 = 2817;
                                            break;
                                        default:
                                            throw ParserException.a(null, "Invalid SEF name");
                                    }
                                    int i33 = aVar3.f6255b - (iJ + i19);
                                    if (c11 == 2192) {
                                        ArrayList arrayList3 = new ArrayList();
                                        List<String> listB = j.f6250e.b(rVar5.s(i33, charset));
                                        for (int i34 = 0; i34 < listB.size(); i34++) {
                                            List<String> listB2 = j.f6249d.b(listB.get(i34));
                                            if (listB2.size() != 3) {
                                                throw ParserException.a(null, null);
                                            }
                                            try {
                                                arrayList3.add(new P1.b.a(1 << (Integer.parseInt(listB2.get(2)) - 1), Long.parseLong(listB2.get(0)), Long.parseLong(listB2.get(1))));
                                            } catch (NumberFormatException e11) {
                                                throw ParserException.a(e11, null);
                                            }
                                        }
                                        arrayList.add(new P1.b(arrayList3));
                                    } else if (c11 != 2816 && c11 != 2817 && c11 != 2819 && c11 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                    i32++;
                                    i20 = 4;
                                }
                                e10.f414a = 0L;
                            }
                        } else {
                            r rVar6 = new r(8);
                            qVar.readFully(rVar6.f41062a, i18, 8);
                            jVar.f6253c = rVar6.j() + 8;
                            if (rVar6.h() != 1397048916) {
                                e10.f414a = 0L;
                            } else {
                                e10.f414a = qVar.getPosition() - ((long) (jVar.f6253c - 12));
                                jVar.f6252b = 2;
                            }
                        }
                        i14 = 1;
                    } else {
                        long length4 = qVar.getLength();
                        e10.f414a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                        i14 = 1;
                        jVar.f6252b = 1;
                    }
                    if (e10.f414a == 0) {
                        this.f6226k = 0;
                        this.f6229n = 0;
                    }
                    return i14;
                }
                long position4 = qVar.getPosition();
                if (this.f6231p == -1) {
                    int i35 = -1;
                    int i36 = -1;
                    boolean z16 = true;
                    boolean z17 = true;
                    int i37 = 0;
                    long j16 = Long.MAX_VALUE;
                    long j17 = Long.MAX_VALUE;
                    long j18 = Long.MAX_VALUE;
                    while (true) {
                        a[] aVarArr = this.f6211A;
                        if (i37 >= aVarArr.length) {
                            break;
                        }
                        a aVar4 = aVarArr[i37];
                        int i38 = aVar4.f6246e;
                        o oVar = aVar4.f6243b;
                        if (i38 != oVar.f6290b) {
                            long j19 = oVar.f6291c[i38];
                            long[][] jArr = this.f6212B;
                            int i39 = A.f40996a;
                            long j20 = jArr[i37][i38];
                            long j21 = j19 - position4;
                            boolean z18 = j21 < 0 || j21 >= 262144;
                            if ((!z18 && z17) || (z18 == z17 && j21 < j18)) {
                                z17 = z18;
                                j17 = j20;
                                i36 = i37;
                                j18 = j21;
                            }
                            if (j20 < j16) {
                                z16 = z18;
                                j16 = j20;
                                i35 = i37;
                            }
                        }
                        i37++;
                    }
                    if (j16 == Long.MAX_VALUE || !z16 || j17 < j16 + 10485760) {
                        i35 = i36;
                    }
                    this.f6231p = i35;
                    if (i35 == -1) {
                        return -1;
                    }
                }
                a aVar5 = this.f6211A[this.f6231p];
                K k10 = aVar5.f6244c;
                int i40 = aVar5.f6246e;
                o oVar2 = aVar5.f6243b;
                long j22 = oVar2.f6291c[i40] + this.f6240y;
                int[] iArr2 = oVar2.f6292d;
                int i41 = iArr2[i40];
                long j23 = (j22 - position4) + ((long) this.f6232q);
                if (j23 < 0 || j23 >= 262144) {
                    e10.f414a = j22;
                    return 1;
                }
                l lVar = aVar5.f6242a;
                if (lVar.f6264h == 1) {
                    j23 += 8;
                    i41 -= 8;
                }
                qVar.i((int) j23);
                p078g1.n nVar = lVar.f6263g;
                boolean zEquals = Objects.equals(nVar.f35302n, "video/avc");
                String str = nVar.f35302n;
                if (!zEquals ? !Objects.equals(str, "video/hevc") || (i11 & 128) == 0 : (i11 & 32) == 0) {
                    c10 = 1;
                    this.f6235t = true;
                } else {
                    c10 = 1;
                }
                int i42 = lVar.f6266k;
                L l10 = aVar5.f6245d;
                if (i42 == 0) {
                    if ("audio/ac4".equals(str)) {
                        if (this.f6233r == 0) {
                            C0568c.a(i41, rVar);
                            i12 = 7;
                            k10.a(7, rVar);
                            this.f6233r += 7;
                        } else {
                            i12 = 7;
                        }
                        i41 += i12;
                    } else if (l10 != null) {
                        l10.c(qVar);
                    }
                    while (true) {
                        int i43 = this.f6233r;
                        if (i43 >= i41) {
                            break;
                        }
                        int iF = k10.f(qVar, i41 - i43, false);
                        this.f6232q += iF;
                        this.f6233r += iF;
                        this.f6234s -= iF;
                    }
                } else {
                    r rVar7 = this.f6220d;
                    byte[] bArr3 = rVar7.f41062a;
                    bArr3[0] = 0;
                    bArr3[c10] = 0;
                    bArr3[2] = 0;
                    int i44 = 4 - i42;
                    i41 += i44;
                    while (this.f6233r < i41) {
                        int i45 = this.f6234s;
                        if (i45 == 0) {
                            if (this.f6235t) {
                                iArr = iArr2;
                            } else {
                                iArr = iArr2;
                                if (p127k1.e.d(nVar) + i42 <= iArr2[i40] - this.f6232q) {
                                    iD = p127k1.e.d(nVar);
                                    i13 = i42 + iD;
                                }
                                qVar.readFully(bArr3, i44, i13);
                                this.f6232q += i13;
                                rVar7.G(0);
                                iH = rVar7.h();
                                if (iH >= 0) {
                                    throw ParserException.a(null, "Invalid NAL length");
                                }
                                this.f6234s = iH - iD;
                                r rVar8 = this.f6219c;
                                rVar8.G(0);
                                k10.a(4, rVar8);
                                this.f6233r += 4;
                                if (iD > 0) {
                                    k10.a(iD, rVar7);
                                    this.f6233r += iD;
                                    if (p127k1.e.c(bArr3, iD, nVar)) {
                                        this.f6235t = true;
                                    }
                                }
                            }
                            i13 = i42;
                            iD = 0;
                            qVar.readFully(bArr3, i44, i13);
                            this.f6232q += i13;
                            rVar7.G(0);
                            iH = rVar7.h();
                            if (iH >= 0) {
                                throw ParserException.a(null, "Invalid NAL length");
                            }
                            this.f6234s = iH - iD;
                            r rVar9 = this.f6219c;
                            rVar9.G(0);
                            k10.a(4, rVar9);
                            this.f6233r += 4;
                            if (iD > 0) {
                                k10.a(iD, rVar7);
                                this.f6233r += iD;
                                if (p127k1.e.c(bArr3, iD, nVar)) {
                                    this.f6235t = true;
                                }
                            }
                        } else {
                            iArr = iArr2;
                            int iF2 = k10.f(qVar, i45, false);
                            this.f6232q += iF2;
                            this.f6233r += iF2;
                            this.f6234s -= iF2;
                        }
                        iArr2 = iArr;
                    }
                }
                int i46 = i41;
                long j24 = oVar2.f6294f[i40];
                int i47 = oVar2.f6295g[i40];
                if (!this.f6235t) {
                    i47 |= 67108864;
                }
                if (l10 != null) {
                    l10.b(k10, j24, i47, i46, 0, null);
                    if (i40 + 1 == oVar2.f6290b) {
                        l10.a(k10, null);
                    }
                } else {
                    k10.b(j24, i47, i46, 0, null);
                }
                aVar5.f6246e++;
                this.f6231p = -1;
                this.f6232q = 0;
                this.f6233r = 0;
                this.f6234s = 0;
                this.f6235t = false;
                return 0;
            }
            long j25 = this.f6228m - ((long) this.f6229n);
            long position5 = qVar.getPosition() + j25;
            r rVar10 = this.f6230o;
            if (rVar10 != null) {
                qVar.readFully(rVar10.f41062a, this.f6229n, (int) j25);
                if (this.f6227l == 1718909296) {
                    this.f6236u = true;
                    rVar10.G(8);
                    int iH2 = rVar10.h();
                    int i48 = iH2 != 1751476579 ? iH2 != 1903435808 ? 0 : 1 : 2;
                    if (i48 == 0) {
                        rVar10.H(4);
                        do {
                            if (rVar10.a() <= 0) {
                                i48 = 0;
                                break;
                            }
                            int iH3 = rVar10.h();
                            i48 = iH3 != 1751476579 ? iH3 != 1903435808 ? 0 : 1 : 2;
                        } while (i48 == 0);
                    }
                    this.f6215E = i48;
                } else if (!arrayDeque.isEmpty()) {
                    arrayDeque.peek().f41391c.add(new p127k1.b.C0471b(this.f6227l, rVar10));
                }
            } else {
                if (!this.f6236u && this.f6227l == 1835295092) {
                    this.f6215E = 1;
                }
                if (j25 < 262144) {
                    qVar.i((int) j25);
                } else {
                    e10.f414a = qVar.getPosition() + j25;
                    z10 = true;
                }
                n(position5);
                if (this.f6237v) {
                    this.f6239x = true;
                    e10.f414a = this.f6238w;
                    this.f6237v = false;
                    z10 = true;
                }
                if (z10 || this.f6226k == 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            z10 = false;
            n(position5);
            if (this.f6237v) {
                this.f6239x = true;
                e10.f414a = this.f6238w;
                this.f6237v = false;
                z10 = true;
            }
            if (z10) {
                z11 = false;
            } else {
                z11 = false;
            }
        } while (!z11);
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c A[LOOP:2: B:34:0x007f->B:39:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[LOOP:3: B:50:0x00b0->B:54:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df A[EDGE_INSN: B:72:0x00df->B:64:0x00df BREAK  A[LOOP:1: B:29:0x006c->B:63:0x00d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b8 A[SYNTHETIC] */
    @Override // A1.F
    public final F.a i(long j) {
        long j10;
        long j11;
        long j12;
        long jMin;
        int i10;
        long jMin2;
        a[] aVarArr;
        G g10;
        F.a aVar;
        boolean z10;
        int i11;
        o oVar;
        long[] jArr;
        int iD;
        int[] iArr;
        int iA;
        long[] jArr2;
        int iD2;
        int iA2;
        a[] aVarArr2 = this.f6211A;
        int length = aVarArr2.length;
        G g11 = G.f419c;
        if (length == 0) {
            return new F.a(g11, g11);
        }
        int i12 = this.f6213C;
        boolean z11 = false;
        int i13 = -1;
        if (i12 != -1) {
            o oVar2 = aVarArr2[i12].f6243b;
            long[] jArr3 = oVar2.f6294f;
            int iD3 = A.d(jArr3, j, false);
            while (true) {
                if (iD3 < 0) {
                    iD3 = -1;
                    break;
                }
                if ((oVar2.f6295g[iD3] & 1) != 0) {
                    break;
                }
                iD3--;
            }
            if (iD3 == -1) {
                iD3 = oVar2.a(j);
            }
            if (iD3 == -1) {
                return new F.a(g11, g11);
            }
            j11 = jArr3[iD3];
            long[] jArr4 = oVar2.f6291c;
            j10 = jArr4[iD3];
            if (j11 < j && iD3 < oVar2.f6290b - 1 && (iA2 = oVar2.a(j)) != -1 && iA2 != iD3) {
                j12 = jArr3[iA2];
                jMin = jArr4[iA2];
            }
            i10 = 0;
            jMin2 = j10;
            while (true) {
                aVarArr = this.f6211A;
                if (i10 < aVarArr.length) {
                    break;
                }
                if (i10 != this.f6213C) {
                    oVar = aVarArr[i10].f6243b;
                    jArr = oVar.f6294f;
                    iD = A.d(jArr, j11, z11);
                    while (true) {
                        iArr = oVar.f6295g;
                        if (iD >= 0) {
                            iA = i13;
                            break;
                        }
                        if ((iArr[iD] & 1) != 0) {
                            iA = iD;
                            break;
                        }
                        iD--;
                    }
                    if (iA == i13) {
                        iA = oVar.a(j11);
                    }
                    jArr2 = oVar.f6291c;
                    if (iA != i13) {
                        jMin2 = Math.min(jArr2[iA], jMin2);
                    }
                    if (j12 != -9223372036854775807L) {
                        z10 = false;
                        iD2 = A.d(jArr, j12, false);
                        while (true) {
                            if (iD2 >= 0) {
                                i11 = -1;
                                iD2 = -1;
                                break;
                            }
                            if ((iArr[iD2] & 1) != 0) {
                                i11 = -1;
                                break;
                            }
                            iD2--;
                        }
                        if (iD2 == i11) {
                            iD2 = oVar.a(j12);
                        }
                        if (iD2 == i11) {
                            jMin = Math.min(jArr2[iD2], jMin);
                        }
                    } else {
                        i11 = -1;
                        z10 = false;
                    }
                } else {
                    int i14 = i13;
                    z10 = z11;
                    i11 = i14;
                }
                i10++;
                boolean z12 = z10;
                i13 = i11;
                z11 = z12;
            }
            g10 = new G(j11, jMin2);
            if (j12 == -9223372036854775807L) {
                aVar = new F.a(g10, g10);
            } else {
                aVar = new F.a(g10, new G(j12, jMin));
            }
            return aVar;
        }
        j10 = Long.MAX_VALUE;
        j11 = j;
        j12 = -9223372036854775807L;
        jMin = -1;
        i10 = 0;
        jMin2 = j10;
        while (true) {
            aVarArr = this.f6211A;
            if (i10 < aVarArr.length) {
                break;
                break;
            }
            if (i10 != this.f6213C) {
                oVar = aVarArr[i10].f6243b;
                jArr = oVar.f6294f;
                iD = A.d(jArr, j11, z11);
                while (true) {
                    iArr = oVar.f6295g;
                    if (iD >= 0) {
                        iA = i13;
                        break;
                    }
                    if ((iArr[iD] & 1) != 0) {
                        iA = iD;
                        break;
                    }
                    iD--;
                }
                if (iA == i13) {
                    iA = oVar.a(j11);
                }
                jArr2 = oVar.f6291c;
                if (iA != i13) {
                    jMin2 = Math.min(jArr2[iA], jMin2);
                }
                if (j12 != -9223372036854775807L) {
                    z10 = false;
                    iD2 = A.d(jArr, j12, false);
                    while (true) {
                        if (iD2 >= 0) {
                            i11 = -1;
                            iD2 = -1;
                            break;
                        }
                        if ((iArr[iD2] & 1) != 0) {
                            i11 = -1;
                            break;
                        }
                        iD2--;
                    }
                    if (iD2 == i11) {
                        iD2 = oVar.a(j12);
                    }
                    if (iD2 == i11) {
                        jMin = Math.min(jArr2[iD2], jMin);
                    }
                } else {
                    i11 = -1;
                    z10 = false;
                }
            } else {
                int i15 = i13;
                z10 = z11;
                i11 = i15;
            }
            i10++;
            boolean z13 = z10;
            i13 = i11;
            z11 = z13;
        }
        g10 = new G(j11, jMin2);
        if (j12 == -9223372036854775807L) {
            aVar = new F.a(g10, g10);
        } else {
            aVar = new F.a(g10, new G(j12, jMin));
        }
        return aVar;
    }

    @Override // A1.F
    public final long k() {
        return this.f6214D;
    }

    @Override // A1.p
    public final boolean l(q qVar) throws IOException {
        J jB = k.b(qVar, false, (this.f6218b & 2) != 0);
        this.j = jB != null ? ImmutableList.M(jB) : ImmutableList.K();
        return jB == null;
    }

    @Override // A1.p
    public final void m(A1.r rVar) {
        if ((this.f6218b & 16) == 0) {
            rVar = new X1.m(rVar, this.f6217a);
        }
        this.f6241z = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x0584 A[EDGE_INSN: B:293:0x0584->B:296:0x05a4 BREAK  A[LOOP:9: B:252:0x0507->B:294:0x0597]] */
    /* JADX WARN: Code duplicated, block: B:421:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:437:0x08d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    public final void n(long j) throws ParserException {
        int i10;
        int i11;
        g gVar;
        int i12;
        ArrayList arrayList;
        s sVar;
        ArrayDeque<k1.b.a> arrayDeque;
        s sVar2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        s sVar3;
        int i13;
        String str;
        ArrayList arrayList4;
        s sVar4;
        s sVar5;
        s sVar6;
        char c10;
        ArrayList arrayList5;
        int i14;
        s sVar7;
        int i15;
        s sVarA;
        int i16;
        int i17;
        int i18;
        s sVar8;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayDeque<k1.b.a> arrayDeque2;
        s sVar9;
        s sVarB;
        s sVar10;
        int iV;
        int i19;
        s sVar11;
        ArrayList arrayList8;
        s.a aVarF;
        s.a mVar;
        p127k1.a aVarA;
        int i20;
        int i21;
        p127k1.a aVar;
        g gVar2 = this;
        int i22 = 4;
        int i23 = 8;
        int i24 = 16;
        int i25 = 12;
        int i26 = 1;
        while (true) {
            ArrayDeque<k1.b.a> arrayDeque3 = gVar2.f6223g;
            if (arrayDeque3.isEmpty() || arrayDeque3.peek().f41390b != j) {
                break;
            }
            k1.b.a aVarPop = arrayDeque3.pop();
            if (aVarPop.f41389a == 1836019574) {
                k1.b.a aVarB = aVarPop.b(1835365473);
                ArrayList arrayList9 = new ArrayList();
                int i27 = 1684108385;
                long j10 = 0;
                int i28 = gVar2.f6218b;
                if (aVarB != null) {
                    byte[] bArr = U1.a.f6123a;
                    p127k1.b.C0471b c0471bC = aVarB.c(1751411826);
                    p127k1.b.C0471b c0471bC2 = aVarB.c(1801812339);
                    p127k1.b.C0471b c0471bC3 = aVarB.c(1768715124);
                    if (c0471bC == null || c0471bC2 == null || c0471bC3 == null) {
                        sVar = null;
                    } else {
                        r rVar = c0471bC.f41393b;
                        rVar.G(i24);
                        if (rVar.h() != 1835299937) {
                            sVar = null;
                        } else {
                            r rVar2 = c0471bC2.f41393b;
                            rVar2.G(i25);
                            int iH = rVar2.h();
                            String[] strArr = new String[iH];
                            int i29 = 0;
                            while (i29 < iH) {
                                int iH2 = rVar2.h();
                                rVar2.H(i22);
                                strArr[i29] = rVar2.s(iH2 - 8, StandardCharsets.UTF_8);
                                i29 += i26;
                                i22 = 4;
                            }
                            r rVar3 = c0471bC3.f41393b;
                            rVar3.G(i23);
                            ArrayList arrayList10 = new ArrayList();
                            while (rVar3.a() > i23) {
                                int i30 = rVar3.f41063b;
                                int iH3 = rVar3.h();
                                int iH4 = rVar3.h() - i26;
                                if (iH4 < 0 || iH4 >= iH) {
                                    com.google.gson.internal.b.e(iH4, "Skipped metadata with unknown key index: ");
                                } else {
                                    String str2 = strArr[iH4];
                                    int i31 = i30 + iH3;
                                    while (true) {
                                        int i32 = rVar3.f41063b;
                                        if (i32 >= i31) {
                                            aVar = null;
                                            break;
                                        }
                                        int iH5 = rVar3.h();
                                        if (rVar3.h() == i27) {
                                            int iH6 = rVar3.h();
                                            int iH7 = rVar3.h();
                                            int i33 = iH5 - 16;
                                            byte[] bArr2 = new byte[i33];
                                            rVar3.f(bArr2, 0, i33);
                                            aVar = new p127k1.a(str2, bArr2, iH7, iH6);
                                            break;
                                        }
                                        rVar3.G(i32 + iH5);
                                        i27 = 1684108385;
                                    }
                                    if (aVar != null) {
                                        arrayList10.add(aVar);
                                    }
                                }
                                rVar3.G(i30 + iH3);
                                i23 = 8;
                                i26 = 1;
                                i27 = 1684108385;
                            }
                            if (arrayList10.isEmpty()) {
                                sVar = null;
                            } else {
                                sVar = new s(arrayList10);
                            }
                        }
                    }
                    if (gVar2.f6239x) {
                        p241t7.b.l(sVar);
                        p127k1.a aVarA2 = e.a(sVar, "auxiliary.tracks.interleaved");
                        if (aVarA2 != null && aVarA2.f41386b[0] == 0) {
                            gVar2.f6240y = gVar2.f6238w + 16;
                        }
                        p127k1.a aVarA3 = e.a(sVar, "auxiliary.tracks.map");
                        p241t7.b.l(aVarA3);
                        ArrayList arrayListD = aVarA3.d();
                        ArrayList arrayList11 = new ArrayList(arrayListD.size());
                        int i34 = 0;
                        while (i34 < arrayListD.size()) {
                            int iIntValue = ((Integer) arrayListD.get(i34)).intValue();
                            if (iIntValue != 0) {
                                i20 = 1;
                                if (iIntValue == 1) {
                                    i21 = 2;
                                } else if (iIntValue != 2) {
                                    i21 = iIntValue != 3 ? 0 : 4;
                                } else {
                                    i21 = 3;
                                }
                            } else {
                                i20 = 1;
                                i21 = 1;
                            }
                            arrayList11.add(Integer.valueOf(i21));
                            i34 += i20;
                        }
                        arrayList = arrayList11;
                        i12 = 1;
                    } else {
                        if (sVar != null && (i28 & 64) != 0 && (aVarA = e.a(sVar, "auxiliary.tracks.offset")) != null) {
                            long jZ = new r(aVarA.f41386b).z();
                            if (jZ > 0) {
                                gVar2.f6238w = jZ;
                                gVar2.f6237v = true;
                                i11 = 1;
                                arrayDeque = arrayDeque3;
                                i10 = 16;
                                gVar = gVar2;
                            }
                            arrayDeque.clear();
                            if (!gVar.f6237v) {
                                gVar.f6226k = 2;
                            }
                        }
                        i12 = 1;
                        arrayList = arrayList9;
                    }
                } else {
                    i12 = i26;
                    arrayList = arrayList9;
                    sVar = null;
                }
                ArrayList arrayList12 = new ArrayList();
                boolean z10 = gVar2.f6215E == i12;
                z zVar = new z();
                p127k1.b.C0471b c0471bC4 = aVarPop.c(1969517665);
                if (c0471bC4 != null) {
                    byte[] bArr3 = U1.a.f6123a;
                    r rVar4 = c0471bC4.f41393b;
                    int i35 = 8;
                    rVar4.G(8);
                    s sVar12 = new s(new s.a[0]);
                    while (rVar4.a() >= i35) {
                        int i36 = rVar4.f41063b;
                        int iH8 = rVar4.h();
                        int iH9 = rVar4.h();
                        if (iH9 == 1835365473) {
                            rVar4.G(i36);
                            int i37 = i36 + iH8;
                            rVar4.H(i35);
                            int i38 = rVar4.f41063b;
                            rVar4.H(4);
                            arrayDeque2 = arrayDeque3;
                            if (rVar4.h() != 1751411826) {
                                i38 += 4;
                            }
                            rVar4.G(i38);
                            while (true) {
                                int i39 = rVar4.f41063b;
                                if (i39 < i37) {
                                    int iH10 = rVar4.h();
                                    if (rVar4.h() == 1768715124) {
                                        rVar4.G(i39);
                                        int i40 = i39 + iH10;
                                        rVar4.H(8);
                                        ArrayList arrayList13 = new ArrayList();
                                        while (true) {
                                            int i41 = rVar4.f41063b;
                                            if (i41 >= i40) {
                                                break;
                                            }
                                            int iH11 = rVar4.h() + i41;
                                            int iH12 = rVar4.h();
                                            int i42 = i40;
                                            int i43 = (iH12 >> 24) & 255;
                                            ArrayList arrayList14 = arrayList12;
                                            s sVar13 = sVar;
                                            if (i43 == 169 || i43 == 253) {
                                                arrayList8 = arrayList;
                                                int i44 = 16777215 & iH12;
                                                if (i44 == 6516084) {
                                                    int iH13 = rVar4.h();
                                                    if (rVar4.h() == 1684108385) {
                                                        rVar4.H(8);
                                                        String strQ = rVar4.q(iH13 - 16);
                                                        aVarF = new O1.e("und", strQ, strQ);
                                                    } else {
                                                        p114j1.k.f("Failed to parse comment attribute: " + p127k1.b.a(iH12));
                                                        aVarF = null;
                                                    }
                                                } else if (i44 == 7233901 || i44 == 7631467) {
                                                    aVarF = e.f(iH12, rVar4, "TIT2");
                                                } else if (i44 == 6516589 || i44 == 7828084) {
                                                    aVarF = e.f(iH12, rVar4, "TCOM");
                                                } else if (i44 == 6578553) {
                                                    aVarF = e.f(iH12, rVar4, "TDRC");
                                                } else if (i44 == 4280916) {
                                                    aVarF = e.f(iH12, rVar4, "TPE1");
                                                } else if (i44 == 7630703) {
                                                    aVarF = e.f(iH12, rVar4, "TSSE");
                                                } else if (i44 == 6384738) {
                                                    aVarF = e.f(iH12, rVar4, "TALB");
                                                } else if (i44 == 7108978) {
                                                    aVarF = e.f(iH12, rVar4, "USLT");
                                                } else if (i44 == 6776174) {
                                                    aVarF = e.f(iH12, rVar4, "TCON");
                                                } else if (i44 == 6779504) {
                                                    aVarF = e.f(iH12, rVar4, "TIT1");
                                                } else {
                                                    p114j1.k.b("Skipped unknown metadata entry: " + p127k1.b.a(iH12));
                                                    rVar4.G(iH11);
                                                    aVarF = null;
                                                }
                                                rVar4.G(iH11);
                                            } else if (iH12 == 1735291493) {
                                                try {
                                                    String strA = O1.i.a(e.d(rVar4) - 1);
                                                    if (strA != null) {
                                                        mVar = new O1.m("TCON", null, ImmutableList.M(strA));
                                                    } else {
                                                        p114j1.k.f("Failed to parse standard genre code");
                                                        mVar = null;
                                                    }
                                                    rVar4.G(iH11);
                                                    arrayList8 = arrayList;
                                                    aVarF = mVar;
                                                } catch (Throwable th) {
                                                    rVar4.G(iH11);
                                                    throw th;
                                                }
                                            } else {
                                                if (iH12 == 1684632427) {
                                                    aVarF = e.c(iH12, rVar4, "TPOS");
                                                } else if (iH12 == 1953655662) {
                                                    aVarF = e.c(iH12, rVar4, "TRCK");
                                                } else if (iH12 == 1953329263) {
                                                    aVarF = e.e(iH12, "TBPM", rVar4, true, false);
                                                } else if (iH12 == 1668311404) {
                                                    aVarF = e.e(iH12, "TCMP", rVar4, true, true);
                                                } else if (iH12 == 1668249202) {
                                                    aVarF = e.b(rVar4);
                                                } else if (iH12 == 1631670868) {
                                                    aVarF = e.f(iH12, rVar4, "TPE2");
                                                } else if (iH12 == 1936682605) {
                                                    aVarF = e.f(iH12, rVar4, "TSOT");
                                                } else if (iH12 == 1936679276) {
                                                    aVarF = e.f(iH12, rVar4, "TSOA");
                                                } else if (iH12 == 1936679282) {
                                                    aVarF = e.f(iH12, rVar4, "TSOP");
                                                } else if (iH12 == 1936679265) {
                                                    aVarF = e.f(iH12, rVar4, "TSO2");
                                                } else if (iH12 == 1936679791) {
                                                    aVarF = e.f(iH12, rVar4, "TSOC");
                                                } else if (iH12 == 1920233063) {
                                                    aVarF = e.e(iH12, "ITUNESADVISORY", rVar4, false, false);
                                                } else if (iH12 == 1885823344) {
                                                    aVarF = e.e(iH12, "ITUNESGAPLESS", rVar4, false, true);
                                                } else if (iH12 == 1936683886) {
                                                    aVarF = e.f(iH12, rVar4, "TVSHOWSORT");
                                                } else if (iH12 == 1953919848) {
                                                    aVarF = e.f(iH12, rVar4, "TVSHOW");
                                                } else if (iH12 == 757935405) {
                                                    String strQ2 = null;
                                                    String strQ3 = null;
                                                    int i45 = -1;
                                                    int i46 = -1;
                                                    while (true) {
                                                        int i47 = rVar4.f41063b;
                                                        if (i47 >= iH11) {
                                                            break;
                                                        }
                                                        int iH14 = rVar4.h();
                                                        int iH15 = rVar4.h();
                                                        ArrayList arrayList15 = arrayList;
                                                        rVar4.H(4);
                                                        if (iH15 == 1835360622) {
                                                            strQ3 = rVar4.q(iH14 - 12);
                                                        } else if (iH15 == 1851878757) {
                                                            strQ2 = rVar4.q(iH14 - 12);
                                                        } else {
                                                            if (iH15 == 1684108385) {
                                                                i46 = iH14;
                                                                i45 = i47;
                                                            }
                                                            rVar4.H(iH14 - 12);
                                                        }
                                                        arrayList = arrayList15;
                                                    }
                                                    arrayList8 = arrayList;
                                                    if (strQ3 == null || strQ2 == null || i45 == -1) {
                                                        aVarF = null;
                                                    } else {
                                                        rVar4.G(i45);
                                                        rVar4.H(16);
                                                        aVarF = new O1.j(strQ3, strQ2, rVar4.q(i46 - 16));
                                                    }
                                                    rVar4.G(iH11);
                                                } else {
                                                    arrayList8 = arrayList;
                                                    p114j1.k.b("Skipped unknown metadata entry: " + p127k1.b.a(iH12));
                                                    rVar4.G(iH11);
                                                    aVarF = null;
                                                }
                                                rVar4.G(iH11);
                                                arrayList8 = arrayList;
                                            }
                                            if (aVarF != null) {
                                                arrayList13.add(aVarF);
                                            }
                                            i40 = i42;
                                            arrayList12 = arrayList14;
                                            sVar = sVar13;
                                            arrayList = arrayList8;
                                        }
                                        sVar8 = sVar;
                                        arrayList6 = arrayList;
                                        arrayList7 = arrayList12;
                                        if (!arrayList13.isEmpty()) {
                                            sVar11 = new s(arrayList13);
                                            break;
                                        }
                                        break;
                                    }
                                    rVar4.G(i39 + iH10);
                                    arrayList = arrayList;
                                } else {
                                    sVar8 = sVar;
                                    arrayList6 = arrayList;
                                    arrayList7 = arrayList12;
                                }
                                sVar11 = null;
                                break;
                            }
                            sVar12 = sVar12.b(sVar11);
                        } else {
                            sVar8 = sVar;
                            arrayList6 = arrayList;
                            arrayList7 = arrayList12;
                            arrayDeque2 = arrayDeque3;
                            if (iH9 == 1936553057) {
                                rVar4.G(i36);
                                int i48 = i36 + iH8;
                                rVar4.H(12);
                                while (true) {
                                    int i49 = rVar4.f41063b;
                                    if (i49 < i48) {
                                        int iH16 = rVar4.h();
                                        if (rVar4.h() == 1935766900) {
                                            if (iH16 >= 16) {
                                                rVar4.H(4);
                                                int i50 = -1;
                                                int i51 = 0;
                                                int i52 = 0;
                                                while (i51 < 2) {
                                                    int iU = rVar4.u();
                                                    int iU2 = rVar4.u();
                                                    if (iU == 0) {
                                                        i50 = iU2;
                                                        i19 = 1;
                                                    } else {
                                                        i19 = 1;
                                                        if (iU == 1) {
                                                            i52 = iU2;
                                                        }
                                                    }
                                                    i51 += i19;
                                                }
                                                if (i50 != 12) {
                                                    if (i50 != 13) {
                                                        if (i50 != 21) {
                                                            iV = -2147483647;
                                                        } else {
                                                            if (rVar4.a() >= 8 && rVar4.f41063b + 8 <= i48) {
                                                                int iH17 = rVar4.h();
                                                                int iH18 = rVar4.h();
                                                                if (iH17 >= 12 && iH18 == 1936877170) {
                                                                    iV = rVar4.v();
                                                                }
                                                            }
                                                            iV = -2147483647;
                                                        }
                                                        if (iV == -2147483647) {
                                                            sVar10 = new s(new P1.c(iV, i52));
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    iV = R.styleable.AppCompatTheme_windowFixedHeightMajor;
                                                } else {
                                                    iV = 240;
                                                }
                                                if (iV == -2147483647) {
                                                    sVar10 = new s(new P1.c(iV, i52));
                                                    break;
                                                }
                                                break;
                                            }
                                            sVar10 = null;
                                            break;
                                        }
                                        rVar4.G(i49 + iH16);
                                    }
                                    sVar10 = null;
                                    break;
                                }
                                sVarB = sVar12.b(sVar10);
                            } else if (iH9 == -1451722374) {
                                short sR = rVar4.r();
                                rVar4.H(2);
                                String strS = rVar4.s(sR, StandardCharsets.UTF_8);
                                int iMax = Math.max(strS.lastIndexOf(43), strS.lastIndexOf(45));
                                try {
                                    sVar9 = new s(new p127k1.c(Float.parseFloat(strS.substring(0, iMax)), Float.parseFloat(strS.substring(iMax, strS.length() - 1))));
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    sVar9 = null;
                                }
                                sVarB = sVar12.b(sVar9);
                            }
                            sVar12 = sVarB;
                        }
                        rVar4.G(i36 + iH8);
                        i35 = 8;
                        arrayDeque3 = arrayDeque2;
                        arrayList12 = arrayList7;
                        sVar = sVar8;
                        arrayList = arrayList6;
                    }
                    sVar2 = sVar;
                    arrayList2 = arrayList;
                    arrayList3 = arrayList12;
                    arrayDeque = arrayDeque3;
                    zVar.b(sVar12);
                    sVar3 = sVar12;
                } else {
                    sVar2 = sVar;
                    arrayList2 = arrayList;
                    arrayList3 = arrayList12;
                    arrayDeque = arrayDeque3;
                    sVar3 = null;
                }
                p127k1.b.C0471b c0471bC5 = aVarPop.c(1836476516);
                c0471bC5.getClass();
                s sVar14 = new s(U1.a.d(c0471bC5.f41393b));
                ArrayList arrayListG = U1.a.g(aVarPop, zVar, -9223372036854775807L, null, (i28 & 1) != 0, z10, new Q8.d());
                gVar = this;
                if (gVar.f6239x) {
                    boolean z11 = arrayList2.size() == arrayListG.size();
                    Locale locale = Locale.US;
                    p241t7.b.i(C1293h.h("The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")", arrayList2.size(), arrayListG.size()), z11);
                }
                String strG = I.b.g(arrayListG);
                long j11 = -9223372036854775807L;
                int size = -1;
                int i53 = 0;
                int i54 = 0;
                while (i53 < arrayListG.size()) {
                    o oVar = (o) arrayListG.get(i53);
                    if (oVar.f6290b == 0) {
                        sVar4 = sVar3;
                        i28 = i28;
                        i13 = i54;
                        arrayList5 = arrayList3;
                        sVar5 = sVar2;
                        arrayList4 = arrayList2;
                        i14 = 1;
                        sVar6 = sVar14;
                        str = strG;
                        c10 = 3;
                    } else {
                        A1.r rVar5 = gVar.f6241z;
                        i13 = i54 + 1;
                        l lVar = oVar.f6289a;
                        K kP = rVar5.p(i54, lVar.f6258b);
                        a aVar2 = new a(lVar, oVar, kP);
                        str = strG;
                        long j12 = lVar.f6261e;
                        if (j12 == -9223372036854775807L) {
                            j12 = oVar.f6296h;
                        }
                        kP.getClass();
                        long jMax = Math.max(j11, j12);
                        p078g1.n nVar = lVar.f6263g;
                        boolean zEquals = "audio/true-hd".equals(nVar.f35302n);
                        int i55 = oVar.f6293e;
                        int i56 = zEquals ? i55 * 16 : i55 + 30;
                        g1.n.a aVarA4 = nVar.a();
                        aVarA4.f35339n = i56;
                        int i57 = lVar.f6258b;
                        if (i57 == 2) {
                            int i58 = i28 & 8;
                            int i59 = nVar.f35295f;
                            if (i58 != 0) {
                                i59 |= size == -1 ? 1 : 2;
                            }
                            if (nVar.f35311w == -1.0f && j12 > 0 && (i18 = oVar.f6290b) > 0) {
                                aVarA4.f35347v = i18 / (j12 / 1000000.0f);
                            }
                            if (gVar.f6239x) {
                                i59 |= 32768;
                                arrayList4 = arrayList2;
                                aVarA4.f35333g = ((Integer) arrayList4.get(i53)).intValue();
                            } else {
                                arrayList4 = arrayList2;
                            }
                            aVarA4.f35332f = i59;
                        } else {
                            i28 = i28;
                            arrayList4 = arrayList2;
                        }
                        if (i57 == 1 && (i16 = zVar.f571a) != -1 && (i17 = zVar.f572b) != -1) {
                            aVarA4.f35320F = i16;
                            aVarA4.f35321G = i17;
                        }
                        ArrayList arrayList16 = gVar.f6225i;
                        s[] sVarArr = {arrayList16.isEmpty() ? null : new s(arrayList16), sVar3, sVar14};
                        s sVar15 = new s(new s.a[0]);
                        if (sVar2 != null) {
                            sVar5 = sVar2;
                            int i60 = 0;
                            while (true) {
                                s.a[] aVarArr = sVar5.f35445a;
                                sVar4 = sVar3;
                                if (i60 >= aVarArr.length) {
                                    break;
                                }
                                s.a aVar3 = aVarArr[i60];
                                if (aVar3 instanceof p127k1.a) {
                                    p127k1.a aVar4 = (p127k1.a) aVar3;
                                    sVar7 = sVar14;
                                    if (aVar4.f41385a.equals("com.android.capture.fps")) {
                                        if (i57 == 2) {
                                            i15 = 1;
                                            sVarA = sVar15.a(aVar4);
                                        }
                                        i60 += i15;
                                        sVar3 = sVar4;
                                        sVar14 = sVar7;
                                    } else {
                                        i15 = 1;
                                        sVarA = sVar15.a(aVar4);
                                    }
                                    sVar15 = sVarA;
                                    i60 += i15;
                                    sVar3 = sVar4;
                                    sVar14 = sVar7;
                                } else {
                                    sVar7 = sVar14;
                                }
                                i15 = 1;
                                i60 += i15;
                                sVar3 = sVar4;
                                sVar14 = sVar7;
                            }
                        } else {
                            sVar4 = sVar3;
                            sVar5 = sVar2;
                        }
                        sVar6 = sVar14;
                        c10 = 3;
                        for (int i61 = 0; i61 < 3; i61++) {
                            sVar15 = sVar15.b(sVarArr[i61]);
                        }
                        if (sVar15.f35445a.length > 0) {
                            aVarA4.f35336k = sVar15;
                        }
                        aVarA4.f35337l = t.m(str);
                        aVar2.f6244c.d(new p078g1.n(aVarA4));
                        if (i57 == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList5 = arrayList3;
                        arrayList5.add(aVar2);
                        j11 = jMax;
                        i14 = 1;
                    }
                    i53 += i14;
                    arrayList3 = arrayList5;
                    arrayList2 = arrayList4;
                    strG = str;
                    i54 = i13;
                    arrayListG = arrayListG;
                    i28 = i28;
                    sVar3 = sVar4;
                    sVar14 = sVar6;
                    sVar2 = sVar5;
                }
                i10 = 16;
                gVar.f6213C = size;
                gVar.f6214D = j11;
                a[] aVarArr2 = (a[]) arrayList3.toArray(new a[0]);
                gVar.f6211A = aVarArr2;
                long[][] jArr = new long[aVarArr2.length][];
                int[] iArr = new int[aVarArr2.length];
                long[] jArr2 = new long[aVarArr2.length];
                boolean[] zArr = new boolean[aVarArr2.length];
                for (int i62 = 0; i62 < aVarArr2.length; i62++) {
                    jArr[i62] = new long[aVarArr2[i62].f6243b.f6290b];
                    jArr2[i62] = aVarArr2[i62].f6243b.f6294f[0];
                }
                int i63 = 0;
                while (i63 < aVarArr2.length) {
                    long j13 = Long.MAX_VALUE;
                    int i64 = -1;
                    for (int i65 = 0; i65 < aVarArr2.length; i65++) {
                        if (!zArr[i65]) {
                            long j14 = jArr2[i65];
                            if (j14 <= j13) {
                                i64 = i65;
                                j13 = j14;
                            }
                        }
                    }
                    int i66 = iArr[i64];
                    long[] jArr3 = jArr[i64];
                    jArr3[i66] = j10;
                    o oVar2 = aVarArr2[i64].f6243b;
                    j10 += (long) oVar2.f6292d[i66];
                    int i67 = i66 + 1;
                    iArr[i64] = i67;
                    if (i67 < jArr3.length) {
                        jArr2[i64] = oVar2.f6294f[i67];
                    } else {
                        zArr[i64] = true;
                        i63++;
                    }
                }
                i11 = 1;
                gVar.f6212B = jArr;
                gVar.f6241z.j();
                gVar.f6241z.g(gVar);
                arrayDeque.clear();
                if (!gVar.f6237v) {
                    gVar.f6226k = 2;
                }
            } else {
                i10 = i24;
                i11 = i26;
                gVar = gVar2;
                if (!arrayDeque3.isEmpty()) {
                    arrayDeque3.peek().f41392d.add(aVarPop);
                }
            }
            gVar2 = gVar;
            i26 = i11;
            i24 = i10;
            i22 = 4;
            i23 = 8;
            i25 = 12;
        }
        g gVar3 = gVar2;
        if (gVar3.f6226k != 2) {
            gVar3.f6226k = 0;
            gVar3.f6229n = 0;
        }
    }

    @Override // A1.p
    public final void a() {
    }
}
