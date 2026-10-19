package U1;

import A1.C0566a;
import A1.C0567b;
import A1.C0568c;
import A1.C0569d;
import A1.C0579n;
import A1.s;
import A1.z;
import android.util.Pair;
import androidx.media3.common.ParserException;
import com.braze.Constants;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p078g1.t;
import p114j1.A;
import p114j1.C2479a;
import p114j1.q;
import p114j1.r;

/* JADX INFO: compiled from: BoxParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6123a;

    /* JADX INFO: renamed from: U1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BoxParser.java */
    public static final class C0084a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f6127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final r f6129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final r f6130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6131h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6132i;

        public C0084a(r rVar, r rVar2, boolean z10) throws ParserException {
            this.f6130g = rVar;
            this.f6129f = rVar2;
            this.f6128e = z10;
            rVar2.G(12);
            this.f6124a = rVar2.y();
            rVar.G(12);
            this.f6132i = rVar.y();
            s.a("first_chunk must be 1", rVar.h() == 1);
            this.f6125b = -1;
        }

        public final boolean a() {
            int i10 = this.f6125b + 1;
            this.f6125b = i10;
            if (i10 == this.f6124a) {
                return false;
            }
            boolean z10 = this.f6128e;
            r rVar = this.f6129f;
            this.f6127d = z10 ? rVar.z() : rVar.w();
            if (this.f6125b == this.f6131h) {
                r rVar2 = this.f6130g;
                this.f6126c = rVar2.y();
                rVar2.H(4);
                int i11 = this.f6132i - 1;
                this.f6132i = i11;
                this.f6131h = i11 > 0 ? rVar2.y() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f6134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6136d;

        public b(String str, byte[] bArr, long j, long j10) {
            this.f6133a = str;
            this.f6134b = bArr;
            this.f6135c = j;
            this.f6136d = j10;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f6137a;

        public c(e eVar) {
            this.f6137a = eVar;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    public interface d {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: compiled from: BoxParser.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f6138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6140c;

        public e(boolean z10, boolean z11, boolean z12) {
            this.f6138a = z10;
            this.f6139b = z11;
            this.f6140c = z12;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m[] f6141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p078g1.n f6142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6144d = 0;

        public f(int i10) {
            this.f6141a = new m[i10];
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    public static final class g implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r f6147c;

        public g(p127k1.b.C0471b c0471b, p078g1.n nVar) {
            r rVar = c0471b.f41393b;
            this.f6147c = rVar;
            rVar.G(12);
            int iY = rVar.y();
            if ("audio/raw".equals(nVar.f35302n)) {
                int iP = A.p(nVar.f35281F) * nVar.f35279D;
                if (iY == 0 || iY % iP != 0) {
                    p114j1.k.f("Audio sample size mismatch. stsd sample size: " + iP + ", stsz sample size: " + iY);
                    iY = iP;
                }
            }
            this.f6145a = iY == 0 ? -1 : iY;
            this.f6146b = rVar.y();
        }

        @Override // U1.a.d
        public final int a() {
            return this.f6145a;
        }

        @Override // U1.a.d
        public final int b() {
            return this.f6146b;
        }

        @Override // U1.a.d
        public final int c() {
            int i10 = this.f6145a;
            return i10 == -1 ? this.f6147c.y() : i10;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    public static final class h implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f6148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6152e;

        public h(p127k1.b.C0471b c0471b) {
            r rVar = c0471b.f41393b;
            this.f6148a = rVar;
            rVar.G(12);
            this.f6150c = rVar.y() & 255;
            this.f6149b = rVar.y();
        }

        @Override // U1.a.d
        public final int a() {
            return -1;
        }

        @Override // U1.a.d
        public final int b() {
            return this.f6149b;
        }

        @Override // U1.a.d
        public final int c() {
            r rVar = this.f6148a;
            int i10 = this.f6150c;
            if (i10 == 8) {
                return rVar.u();
            }
            if (i10 == 16) {
                return rVar.A();
            }
            int i11 = this.f6151d;
            this.f6151d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f6152e & 15;
            }
            int iU = rVar.u();
            this.f6152e = iU;
            return (iU & 240) >> 4;
        }
    }

    /* JADX INFO: compiled from: BoxParser.java */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f6153a;

        public i(c cVar) {
            this.f6153a = cVar;
        }
    }

    static {
        int i10 = A.f40996a;
        f6123a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static b a(int i10, r rVar) {
        rVar.G(i10 + 12);
        rVar.H(1);
        b(rVar);
        rVar.H(2);
        int iU = rVar.u();
        if ((iU & 128) != 0) {
            rVar.H(2);
        }
        if ((iU & 64) != 0) {
            rVar.H(rVar.u());
        }
        if ((iU & 32) != 0) {
            rVar.H(2);
        }
        rVar.H(1);
        b(rVar);
        String strE = t.e(rVar.u());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new b(strE, null, -1L, -1L);
        }
        rVar.H(4);
        long jW = rVar.w();
        long jW2 = rVar.w();
        rVar.H(1);
        int iB = b(rVar);
        byte[] bArr = new byte[iB];
        rVar.f(bArr, 0, iB);
        return new b(strE, bArr, jW2 > 0 ? jW2 : -1L, jW > 0 ? jW : -1L);
    }

    public static int b(r rVar) {
        int iU = rVar.u();
        int i10 = iU & 127;
        while ((iU & 128) == 128) {
            iU = rVar.u();
            i10 = (i10 << 7) | (iU & 127);
        }
        return i10;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public static p127k1.d d(r rVar) {
        long jO;
        long jO2;
        rVar.G(8);
        if (c(rVar.h()) == 0) {
            jO = rVar.w();
            jO2 = rVar.w();
        } else {
            jO = rVar.o();
            jO2 = rVar.o();
        }
        return new p127k1.d(jO, jO2, rVar.w());
    }

    public static Pair<Integer, m> e(r rVar, int i10, int i11) throws ParserException {
        m mVar;
        Pair<Integer, m> pairCreate;
        int i12;
        int i13;
        byte[] bArr;
        int i14 = rVar.f41063b;
        while (i14 - i10 < i11) {
            rVar.G(i14);
            int iH = rVar.h();
            s.a("childAtomSize must be positive", iH > 0);
            if (rVar.h() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                String strS = null;
                Integer numValueOf = null;
                while (i15 - i14 < iH) {
                    rVar.G(i15);
                    int iH2 = rVar.h();
                    int iH3 = rVar.h();
                    if (iH3 == 1718775137) {
                        numValueOf = Integer.valueOf(rVar.h());
                    } else if (iH3 == 1935894637) {
                        rVar.H(4);
                        strS = rVar.s(4, StandardCharsets.UTF_8);
                    } else if (iH3 == 1935894633) {
                        i17 = i15;
                        i16 = iH2;
                    }
                    i15 += iH2;
                }
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    s.a("frma atom is mandatory", numValueOf != null);
                    s.a("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            mVar = null;
                            break;
                        }
                        rVar.G(i18);
                        int iH4 = rVar.h();
                        if (rVar.h() == 1952804451) {
                            int iC = c(rVar.h());
                            rVar.H(1);
                            if (iC == 0) {
                                rVar.H(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int iU = rVar.u();
                                int i19 = (iU & 240) >> 4;
                                i12 = iU & 15;
                                i13 = i19;
                            }
                            boolean z10 = rVar.u() == 1;
                            int iU2 = rVar.u();
                            byte[] bArr2 = new byte[16];
                            rVar.f(bArr2, 0, 16);
                            if (z10 && iU2 == 0) {
                                int iU3 = rVar.u();
                                byte[] bArr3 = new byte[iU3];
                                rVar.f(bArr3, 0, iU3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            mVar = new m(z10, strS, iU2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i18 += iH4;
                    }
                    s.a("tenc atom is mandatory", mVar != null);
                    int i20 = A.f40996a;
                    pairCreate = Pair.create(numValueOf, mVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iH;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:229:0x03db  */
    /* JADX WARN: Code duplicated, block: B:330:0x0657  */
    /* JADX WARN: Code duplicated, block: B:398:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:410:0x0821  */
    /* JADX WARN: Code duplicated, block: B:498:0x0943  */
    /* JADX WARN: Code duplicated, block: B:500:0x094d  */
    /* JADX WARN: Code duplicated, block: B:554:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:668:0x0952 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x0a40 A[SYNTHETIC] */
    public static f f(r rVar, int i10, int i11, String str, p078g1.k kVar, boolean z10) throws ParserException {
        char c10;
        char c11;
        boolean z11;
        String str2;
        int i12;
        int i13;
        int iA;
        int iY;
        int i14;
        int i15;
        int i16;
        String str3;
        int i17;
        char c12;
        int i18;
        p078g1.k kVar2;
        String str4;
        String str5;
        int i19;
        List<byte[]> listM;
        f fVar;
        int i20;
        int i21;
        int iIntValue;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean zF;
        int iG;
        boolean z12;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean zF2;
        int i31;
        int iG2;
        int i32;
        int iB;
        boolean z13;
        String str6;
        int i33;
        long j;
        ImmutableList immutableListM;
        r rVar2 = rVar;
        String str7 = str;
        int[] iArr = C0567b.f461d;
        int[] iArr2 = C0567b.f459b;
        String str8 = "audio/mhm1";
        rVar2.G(12);
        int iH = rVar.h();
        f fVar2 = new f(iH);
        int i34 = 0;
        while (i34 < iH) {
            int i35 = rVar2.f41063b;
            int iH2 = rVar.h();
            String str9 = "childAtomSize must be positive";
            s.a("childAtomSize must be positive", iH2 > 0);
            int iH3 = rVar.h();
            if (iH3 == 1635148593 || iH3 == 1635148595 || iH3 == 1701733238 || iH3 == 1831958048 || iH3 == 1836070006 || iH3 == 1752589105 || iH3 == 1751479857 || iH3 == 1932670515 || iH3 == 1211250227 || iH3 == 1748121139 || iH3 == 1987063864 || iH3 == 1987063865 || iH3 == 1635135537 || iH3 == 1685479798 || iH3 == 1685479729 || iH3 == 1685481573 || iH3 == 1685481521) {
                c10 = 7;
                c11 = 29812;
                z11 = true;
            } else {
                if (iH3 == 1634760241) {
                    z11 = true;
                    c10 = 7;
                    c11 = 29812;
                } else if (iH3 == 1836069985 || iH3 == 1701733217 || iH3 == 1633889587 || iH3 == 1700998451 || iH3 == 1633889588 || iH3 == 1835823201 || iH3 == 1685353315 || iH3 == 1685353317 || iH3 == 1685353320 || iH3 == 1685353324 || iH3 == 1685353336 || iH3 == 1935764850 || iH3 == 1935767394 || iH3 == 1819304813 || iH3 == 1936684916 || iH3 == 1953984371 || iH3 == 778924082 || iH3 == 778924083 || iH3 == 1835557169 || iH3 == 1835560241 || iH3 == 1634492771 || iH3 == 1634492791 || iH3 == 1970037111 || iH3 == 1332770163 || iH3 == 1716281667 || iH3 == 1767992678) {
                    char c13 = 29812;
                    rVar2.G(i35 + 16);
                    if (z10) {
                        iA = rVar.A();
                        rVar2.H(6);
                    } else {
                        rVar2.H(8);
                        iA = 0;
                    }
                    if (iA == 0 || iA == 1) {
                        int iA2 = rVar.A();
                        rVar2.H(6);
                        int iV = rVar.v();
                        rVar2.G(rVar2.f41063b - 4);
                        int iH4 = rVar.h();
                        if (iA == 1) {
                            rVar2.H(16);
                        }
                        iY = iA2;
                        i14 = iV;
                        i15 = iH4;
                        i16 = -1;
                    } else {
                        if (iA == 2) {
                            rVar2.H(16);
                            int iRound = (int) Math.round(Double.longBitsToDouble(rVar.o()));
                            iY = rVar.y();
                            rVar2.H(4);
                            int iY2 = rVar.y();
                            int iY3 = rVar.y();
                            boolean z14 = (iY3 & 1) != 0;
                            boolean z15 = (iY3 & 2) != 0;
                            if (z14) {
                                if (iY2 == 32) {
                                    i16 = 4;
                                } else {
                                    i16 = -1;
                                }
                                i33 = 8;
                            } else if (iY2 == 8) {
                                i33 = 8;
                                i16 = 3;
                            } else {
                                if (iY2 == 16) {
                                    i16 = z15 ? 268435456 : 2;
                                } else if (iY2 == 24) {
                                    i16 = z15 ? 1342177280 : 21;
                                } else if (iY2 == 32) {
                                    i16 = z15 ? 1610612736 : 22;
                                } else {
                                    i16 = -1;
                                }
                                i33 = 8;
                            }
                            rVar2.H(i33);
                            i14 = iRound;
                            i15 = 0;
                        } else {
                            iH = iH;
                            str3 = str8;
                            i17 = i34;
                            str7 = str7;
                            fVar2 = fVar2;
                            i35 = i35;
                            iH2 = iH2;
                            c12 = 7;
                            rVar2 = rVar2;
                        }
                        i12 = i17;
                        str2 = str3;
                        i13 = iH;
                    }
                    if (iH3 == 1767992678) {
                        iY = -1;
                        i14 = -1;
                    } else {
                        if (iH3 != 1935764850) {
                            i18 = iH3 == 1935767394 ? 16000 : 8000;
                            i12 = i17;
                            str2 = str3;
                            i13 = iH;
                        }
                        i14 = i18;
                        iY = 1;
                    }
                    int i36 = rVar2.f41063b;
                    int i37 = iY;
                    if (iH3 == 1701733217) {
                        Pair<Integer, m> pairE = e(rVar2, i35, iH2);
                        if (pairE != null) {
                            iH3 = ((Integer) pairE.first).intValue();
                            p078g1.k kVarA = kVar == 0 ? null : kVar.a(((m) pairE.second).f6269b);
                            fVar2.f6141a[i34] = (m) pairE.second;
                            kVar2 = kVarA;
                        } else {
                            iH = iH;
                            kVar2 = kVar;
                        }
                        rVar2.G(i36);
                    } else {
                        iH = iH;
                        kVar2 = kVar;
                    }
                    if (iH3 == 1633889587) {
                        str4 = "audio/ac3";
                    } else if (iH3 == 1700998451) {
                        str4 = "audio/eac3";
                    } else if (iH3 == 1633889588) {
                        str4 = "audio/ac4";
                    } else if (iH3 == 1685353315) {
                        str4 = "audio/vnd.dts";
                    } else if (iH3 == 1685353320 || iH3 == 1685353324) {
                        str4 = "audio/vnd.dts.hd";
                    } else if (iH3 == 1685353317) {
                        str4 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (iH3 == 1685353336) {
                        str4 = "audio/vnd.dts.uhd;profile=p2";
                    } else if (iH3 == 1935764850) {
                        str4 = "audio/3gpp";
                    } else if (iH3 == 1935767394) {
                        str4 = "audio/amr-wb";
                    } else if (iH3 == 1936684916) {
                        str4 = "audio/raw";
                        i16 = 2;
                    } else if (iH3 == 1953984371) {
                        str4 = "audio/raw";
                        i16 = 268435456;
                    } else if (iH3 == 1819304813) {
                        if (i16 == -1) {
                            str4 = "audio/raw";
                            i16 = 2;
                        } else {
                            str4 = "audio/raw";
                        }
                    } else if (iH3 == 778924082 || iH3 == 778924083) {
                        str4 = "audio/mpeg";
                    } else if (iH3 == 1835557169) {
                        str4 = "audio/mha1";
                    } else if (iH3 == 1835560241) {
                        str4 = str8;
                    } else if (iH3 == 1634492771) {
                        str4 = "audio/alac";
                    } else if (iH3 == 1634492791) {
                        str4 = "audio/g711-alaw";
                    } else if (iH3 == 1970037111) {
                        str4 = "audio/g711-mlaw";
                    } else if (iH3 == 1332770163) {
                        str4 = "audio/opus";
                    } else if (iH3 == 1716281667) {
                        str4 = "audio/flac";
                    } else if (iH3 == 1835823201) {
                        str4 = "audio/true-hd";
                    } else {
                        str4 = iH3 == 1767992678 ? "audio/iamf" : null;
                    }
                    i17 = i34;
                    int i38 = i36;
                    int i39 = i37;
                    String str10 = null;
                    List<byte[]> listM2 = null;
                    b bVarA = null;
                    while (i38 - i35 < iH2) {
                        rVar2.G(i38);
                        int iH5 = rVar.h();
                        int i40 = iH2;
                        s.a(str9, iH5 > 0);
                        int iH6 = rVar.h();
                        int i41 = i35;
                        if (iH6 == 1835557187) {
                            rVar2.G(i38 + 8);
                            rVar2.H(1);
                            int iU = rVar.u();
                            rVar2.H(1);
                            str10 = Objects.equals(str4, str8) ? String.format("mhm1.%02X", Integer.valueOf(iU)) : String.format("mha1.%02X", Integer.valueOf(iU));
                            int iA3 = rVar.A();
                            byte[] bArr = new byte[iA3];
                            str5 = str8;
                            rVar2.f(bArr, 0, iA3);
                            listM2 = listM2 == null ? ImmutableList.M(bArr) : ImmutableList.N(bArr, listM2.get(0));
                        } else {
                            str5 = str8;
                            if (iH6 == 1835557200) {
                                rVar2.G(i38 + 8);
                                int iU2 = rVar.u();
                                if (iU2 > 0) {
                                    byte[] bArr2 = new byte[iU2];
                                    rVar2.f(bArr2, 0, iU2);
                                    listM2 = listM2 == null ? ImmutableList.M(bArr2) : ImmutableList.N(listM2.get(0), bArr2);
                                }
                            } else if (iH6 == 1702061171 || (z10 && iH6 == 2002876005)) {
                                i15 = i15;
                                String str11 = str4;
                                String str12 = str9;
                                int i42 = i14;
                                i19 = i16;
                                int i43 = i38;
                                str10 = str10;
                                rVar2 = rVar2;
                                listM = listM2;
                                int i44 = iH5;
                                int i45 = i39;
                                str7 = str7;
                                fVar = fVar2;
                                if (iH6 == 1702061171) {
                                    str9 = str12;
                                    i20 = i43;
                                    i38 = i20;
                                    iH5 = i44;
                                } else {
                                    i20 = rVar2.f41063b;
                                    i38 = i43;
                                    s.a(null, i20 >= i38);
                                    while (true) {
                                        iH5 = i44;
                                        if (i20 - i38 < iH5) {
                                            rVar2.G(i20);
                                            int iH7 = rVar.h();
                                            str9 = str12;
                                            s.a(str9, iH7 > 0);
                                            if (rVar.h() != 1702061171) {
                                                i20 += iH7;
                                                i44 = iH5;
                                                str12 = str9;
                                            }
                                        } else {
                                            str9 = str12;
                                            i20 = -1;
                                        }
                                    }
                                }
                                if (i20 != -1) {
                                    bVarA = a(i20, rVar2);
                                    String str13 = bVarA.f6133a;
                                    byte[] bArr3 = bVarA.f6134b;
                                    if (bArr3 == null) {
                                        i21 = i45;
                                        i14 = i42;
                                    } else if ("audio/vorbis".equals(str13)) {
                                        r rVar3 = new r(bArr3);
                                        rVar3.H(1);
                                        int i46 = 0;
                                        while (rVar3.a() > 0 && (rVar3.f41062a[rVar3.f41063b] & 255) == 255) {
                                            i46 += 255;
                                            rVar3.H(1);
                                        }
                                        int iU3 = rVar3.u() + i46;
                                        int i47 = 0;
                                        while (true) {
                                            if (rVar3.a() > 0) {
                                                bVarA = bVarA;
                                                if ((rVar3.f41062a[rVar3.f41063b] & 255) == 255) {
                                                    i47 += 255;
                                                    rVar3.H(1);
                                                    bVarA = bVarA;
                                                }
                                            } else {
                                                bVarA = bVarA;
                                            }
                                        }
                                        int iU4 = rVar3.u() + i47;
                                        byte[] bArr4 = new byte[iU3];
                                        int i48 = rVar3.f41063b;
                                        System.arraycopy(bArr3, i48, bArr4, 0, iU3);
                                        int i49 = i48 + iU3 + iU4;
                                        int length = bArr3.length - i49;
                                        byte[] bArr5 = new byte[length];
                                        System.arraycopy(bArr3, i49, bArr5, 0, length);
                                        listM = ImmutableList.N(bArr4, bArr5);
                                        i21 = i45;
                                        i14 = i42;
                                        str4 = str13;
                                    } else {
                                        if ("audio/mp4a-latm".equals(str13)) {
                                            C0566a.C0000a c0000aB = C0566a.b(new q(bArr3.length, bArr3), false);
                                            i14 = c0000aB.f455a;
                                            i45 = c0000aB.f456b;
                                            str10 = c0000aB.f457c;
                                        } else {
                                            i14 = i42;
                                        }
                                        listM = ImmutableList.M(bArr3);
                                        i21 = i45;
                                    }
                                    str4 = str13;
                                } else {
                                    i21 = i45;
                                    i14 = i42;
                                    str4 = str11;
                                }
                                iIntValue = i21;
                            } else {
                                if (iH6 == 1684103987) {
                                    rVar2.G(i38 + 8);
                                    String string = Integer.toString(i10);
                                    q qVar = new q();
                                    qVar.l(rVar2);
                                    int i50 = iArr2[qVar.g(2)];
                                    listM = listM2;
                                    qVar.o(8);
                                    int i51 = iArr[qVar.g(3)];
                                    i19 = i16;
                                    if (qVar.g(1) != 0) {
                                        i51++;
                                    }
                                    int i52 = C0567b.f462e[qVar.g(5)] * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                                    qVar.c();
                                    rVar2.G(qVar.d());
                                    g1.n.a aVar = new g1.n.a();
                                    aVar.f35327a = string;
                                    aVar.f35338m = t.m("audio/ac3");
                                    aVar.f35317C = i51;
                                    aVar.f35318D = i50;
                                    aVar.f35342q = kVar2;
                                    aVar.f35330d = str7;
                                    aVar.f35334h = i52;
                                    aVar.f35335i = i52;
                                    fVar2.f6142b = new p078g1.n(aVar);
                                    str9 = str9;
                                    i22 = i14;
                                } else {
                                    i19 = i16;
                                    listM = listM2;
                                    if (iH6 == 1684366131) {
                                        rVar2.G(i38 + 8);
                                        String string2 = Integer.toString(i10);
                                        q qVar2 = new q();
                                        qVar2.l(rVar2);
                                        int iG3 = qVar2.g(13) * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                                        qVar2.o(3);
                                        int i53 = iArr2[qVar2.g(2)];
                                        qVar2.o(10);
                                        int i54 = iArr[qVar2.g(3)];
                                        if (qVar2.g(1) != 0) {
                                            i54++;
                                        }
                                        qVar2.o(3);
                                        int iG4 = qVar2.g(4);
                                        qVar2.o(1);
                                        if (iG4 > 0) {
                                            qVar2.o(6);
                                            if (qVar2.g(1) != 0) {
                                                i54 += 2;
                                            }
                                            qVar2.o(1);
                                        }
                                        int i55 = i14;
                                        if (qVar2.b() > 7) {
                                            qVar2.o(7);
                                            if (qVar2.g(1) != 0) {
                                                str6 = "audio/eac3-joc";
                                            } else {
                                                str6 = "audio/eac3";
                                            }
                                        } else {
                                            str6 = "audio/eac3";
                                        }
                                        qVar2.c();
                                        rVar2.G(qVar2.d());
                                        g1.n.a aVar2 = new g1.n.a();
                                        aVar2.f35327a = string2;
                                        aVar2.f35338m = t.m(str6);
                                        aVar2.f35317C = i54;
                                        aVar2.f35318D = i53;
                                        aVar2.f35342q = kVar2;
                                        aVar2.f35330d = str7;
                                        aVar2.f35335i = iG3;
                                        fVar2.f6142b = new p078g1.n(aVar2);
                                        i22 = i55;
                                    } else {
                                        str9 = str9;
                                        int i56 = i14;
                                        str10 = str10;
                                        int i57 = i39;
                                        if (iH6 == 1684103988) {
                                            rVar2.G(i38 + 8);
                                            String string3 = Integer.toString(i10);
                                            q qVar3 = new q();
                                            qVar3.l(rVar2);
                                            int iB2 = qVar3.b();
                                            int iG5 = qVar3.g(3);
                                            if (iG5 > 1) {
                                                throw ParserException.b("Unsupported AC-4 DSI version: " + iG5);
                                            }
                                            int iG6 = qVar3.g(7);
                                            int i58 = qVar3.f() ? 48000 : 44100;
                                            qVar3.o(4);
                                            int iG7 = qVar3.g(9);
                                            int i59 = 1;
                                            if (iG6 > 1) {
                                                if (iG5 == 0) {
                                                    throw ParserException.b("Invalid AC-4 DSI version: " + iG5);
                                                }
                                                if (qVar3.f()) {
                                                    qVar3.o(16);
                                                    if (qVar3.f()) {
                                                        qVar3.o(128);
                                                    }
                                                }
                                                i59 = 1;
                                            }
                                            if (iG5 == i59) {
                                                if (qVar3.b() < 66) {
                                                    throw ParserException.b("Invalid AC-4 DSI bitrate.");
                                                }
                                                qVar3.o(66);
                                                qVar3.c();
                                            }
                                            C0568c.a aVar3 = new C0568c.a();
                                            aVar3.f465a = true;
                                            aVar3.f466b = -1;
                                            aVar3.f467c = -1;
                                            aVar3.f468d = true;
                                            aVar3.f469e = 2;
                                            aVar3.f470f = 0;
                                            str4 = str4;
                                            int i60 = 0;
                                            while (true) {
                                                if (i60 < iG7) {
                                                    if (iG5 == 0) {
                                                        zF = qVar3.f();
                                                        int iG8 = qVar3.g(5);
                                                        iG = qVar3.g(5);
                                                        z12 = false;
                                                        i27 = 0;
                                                        i28 = iG8;
                                                        i29 = 0;
                                                    } else {
                                                        int i61 = iG7;
                                                        int iG9 = qVar3.g(8);
                                                        int iG10 = qVar3.g(8);
                                                        int iG11 = iG10 == 255 ? qVar3.g(16) + iG10 : iG10;
                                                        if (iG9 > 2) {
                                                            qVar3.o(iG11 * 8);
                                                            i60++;
                                                            iG7 = i61;
                                                        } else {
                                                            int iB3 = (iB2 - qVar3.b()) / 8;
                                                            int iG12 = qVar3.g(5);
                                                            z12 = iG12 == 31;
                                                            iG = iG9;
                                                            i29 = iB3;
                                                            i27 = iG11;
                                                            i28 = iG12;
                                                            zF = false;
                                                        }
                                                    }
                                                    if (zF || z12 || i28 != 6) {
                                                        aVar3.f470f = qVar3.g(3);
                                                        if (qVar3.f()) {
                                                            qVar3.o(5);
                                                        }
                                                        qVar3.o(2);
                                                        if (iG5 == 1 && (iG == 1 || iG == 2)) {
                                                            qVar3.o(2);
                                                        }
                                                        qVar3.o(5);
                                                        qVar3.o(10);
                                                        if (iG5 == 1) {
                                                            if (iG > 0) {
                                                                aVar3.f465a = qVar3.f();
                                                            }
                                                            if (aVar3.f465a) {
                                                                if (iG != 1) {
                                                                    i31 = 2;
                                                                    if (iG == 2) {
                                                                        iG2 = qVar3.g(5);
                                                                        if (iG2 >= 0 && iG2 <= 15) {
                                                                            aVar3.f466b = iG2;
                                                                        }
                                                                        if (iG2 >= 11 || iG2 > 14) {
                                                                            i31 = 2;
                                                                        } else {
                                                                            aVar3.f468d = qVar3.f();
                                                                            i31 = 2;
                                                                            aVar3.f469e = qVar3.g(2);
                                                                        }
                                                                    }
                                                                } else {
                                                                    iG2 = qVar3.g(5);
                                                                    if (iG2 >= 0) {
                                                                        aVar3.f466b = iG2;
                                                                    }
                                                                    if (iG2 >= 11) {
                                                                        i31 = 2;
                                                                    } else {
                                                                        i31 = 2;
                                                                    }
                                                                }
                                                                qVar3.o(24);
                                                            } else {
                                                                i31 = 2;
                                                            }
                                                            if (iG == 1 || iG == i31) {
                                                                if (qVar3.f() && qVar3.f()) {
                                                                    qVar3.o(i31);
                                                                }
                                                                if (qVar3.f()) {
                                                                    qVar3.n();
                                                                    int i62 = 8;
                                                                    int iG13 = qVar3.g(8);
                                                                    int i63 = 0;
                                                                    while (i63 < iG13) {
                                                                        qVar3.o(i62);
                                                                        i63++;
                                                                        i62 = 8;
                                                                    }
                                                                }
                                                            }
                                                            i30 = 1;
                                                        } else {
                                                            i30 = 1;
                                                        }
                                                        if (!zF && !z12) {
                                                            qVar3.n();
                                                            if (i28 == 0 || i28 == i30 || i28 == 2) {
                                                                if (iG == 0) {
                                                                    for (int i64 = 0; i64 < 2; i64 += i30) {
                                                                        C0568c.c(qVar3, aVar3);
                                                                    }
                                                                } else {
                                                                    int i65 = 0;
                                                                    for (int i66 = 2; i65 < i66; i66 = 2) {
                                                                        C0568c.d(qVar3, aVar3);
                                                                        i65 += i30;
                                                                    }
                                                                }
                                                            } else if (i28 == 3 || i28 == 4) {
                                                                if (iG == 0) {
                                                                    for (int i67 = 0; i67 < 3; i67 += i30) {
                                                                        C0568c.c(qVar3, aVar3);
                                                                    }
                                                                } else {
                                                                    int i68 = 0;
                                                                    for (int i69 = 3; i68 < i69; i69 = 3) {
                                                                        C0568c.d(qVar3, aVar3);
                                                                        i68 += i30;
                                                                    }
                                                                }
                                                            } else if (i28 != 5) {
                                                                int iG14 = qVar3.g(7);
                                                                for (int i70 = 0; i70 < iG14; i70 += i30) {
                                                                    qVar3.o(8);
                                                                }
                                                            } else if (iG == 0) {
                                                                C0568c.c(qVar3, aVar3);
                                                            } else {
                                                                int iG15 = qVar3.g(3);
                                                                for (int i71 = 0; i71 < iG15 + 2; i71 += i30) {
                                                                    C0568c.d(qVar3, aVar3);
                                                                }
                                                            }
                                                        } else if (iG == 0) {
                                                            C0568c.c(qVar3, aVar3);
                                                        } else {
                                                            C0568c.d(qVar3, aVar3);
                                                        }
                                                        qVar3.n();
                                                        zF2 = qVar3.f();
                                                    } else {
                                                        zF2 = true;
                                                    }
                                                    if (zF2) {
                                                        int iG16 = qVar3.g(7);
                                                        for (int i72 = 0; i72 < iG16; i72++) {
                                                            qVar3.o(15);
                                                        }
                                                    }
                                                    if (iG > 0) {
                                                        if (qVar3.f()) {
                                                            if (qVar3.b() < 66) {
                                                                z13 = false;
                                                            } else {
                                                                qVar3.o(66);
                                                                z13 = true;
                                                            }
                                                            if (!z13) {
                                                                throw ParserException.b("Can't parse bitrate DSI.");
                                                            }
                                                        }
                                                        if (qVar3.f()) {
                                                            qVar3.c();
                                                            qVar3.p(qVar3.g(16));
                                                            i23 = 5;
                                                            int iG17 = qVar3.g(5);
                                                            for (int i73 = 0; i73 < iG17; i73++) {
                                                                qVar3.o(3);
                                                                qVar3.o(8);
                                                            }
                                                            i32 = 8;
                                                        } else {
                                                            i32 = 8;
                                                        }
                                                        qVar3.c();
                                                        if (iG5 == 1) {
                                                            iB = ((iB2 - qVar3.b()) / i32) - i29;
                                                            if (i27 >= iB) {
                                                                throw ParserException.b("pres_bytes is smaller than presentation bytes read.");
                                                            }
                                                            qVar3.p(i27 - iB);
                                                        }
                                                        if (aVar3.f465a && aVar3.f466b == -1) {
                                                            throw ParserException.b("Can't determine channel mode of presentation " + i60);
                                                        }
                                                    } else {
                                                        i32 = 8;
                                                    }
                                                    i23 = 5;
                                                    qVar3.c();
                                                    if (iG5 == 1) {
                                                        iB = ((iB2 - qVar3.b()) / i32) - i29;
                                                        if (i27 >= iB) {
                                                            throw ParserException.b("pres_bytes is smaller than presentation bytes read.");
                                                        }
                                                        qVar3.p(i27 - iB);
                                                    }
                                                    if (aVar3.f465a) {
                                                        throw ParserException.b("Can't determine channel mode of presentation " + i60);
                                                    }
                                                } else {
                                                    i15 = i15;
                                                    i38 = i38;
                                                    fVar2 = fVar2;
                                                    iH5 = iH5;
                                                    i23 = 5;
                                                }
                                                if (aVar3.f465a) {
                                                    int i74 = aVar3.f466b;
                                                    boolean z16 = aVar3.f468d;
                                                    int i75 = aVar3.f469e;
                                                    switch (i74) {
                                                        case 0:
                                                            i26 = 11;
                                                            i25 = 1;
                                                            break;
                                                        case 1:
                                                            i26 = 11;
                                                            i25 = 2;
                                                            break;
                                                        case 2:
                                                            i26 = 11;
                                                            i25 = 3;
                                                            break;
                                                        case 3:
                                                            i25 = i23;
                                                            i26 = 11;
                                                            break;
                                                        case 4:
                                                            i26 = 11;
                                                            i25 = 6;
                                                            break;
                                                        case 5:
                                                        case 7:
                                                        case 9:
                                                            i26 = 11;
                                                            i25 = 7;
                                                            break;
                                                        case 6:
                                                        case 8:
                                                        case 10:
                                                            i26 = 11;
                                                            i25 = 8;
                                                            break;
                                                        case 11:
                                                            i26 = 11;
                                                            i25 = 11;
                                                            break;
                                                        case 12:
                                                            i26 = 11;
                                                            i25 = 12;
                                                            break;
                                                        case 13:
                                                            i26 = 11;
                                                            i25 = 13;
                                                            break;
                                                        case 14:
                                                            i26 = 11;
                                                            i25 = 14;
                                                            break;
                                                        case 15:
                                                            i26 = 11;
                                                            i25 = 24;
                                                            break;
                                                        default:
                                                            i26 = 11;
                                                            i25 = -1;
                                                            break;
                                                    }
                                                    if (i74 != i26 && i74 != 12) {
                                                        if (i74 == 13 || i74 == 14) {
                                                        }
                                                    }
                                                    if (!z16) {
                                                        i25 -= 2;
                                                    }
                                                    if (i75 == 0) {
                                                        i25 -= 4;
                                                    } else if (i75 == 1) {
                                                        i25 -= 2;
                                                    }
                                                } else {
                                                    i24 = aVar3.f467c + 1;
                                                    if (aVar3.f470f == 4) {
                                                        i25 = i24 == 17 ? 21 : i24;
                                                    }
                                                    if (i24 > 0) {
                                                        throw ParserException.b("Can't determine channel count of presentation.");
                                                    }
                                                    g1.n.a aVar4 = new g1.n.a();
                                                    aVar4.f35327a = string3;
                                                    aVar4.f35338m = t.m("audio/ac4");
                                                    aVar4.f35317C = i24;
                                                    aVar4.f35318D = i58;
                                                    aVar4.f35342q = kVar2;
                                                    str7 = str;
                                                    aVar4.f35330d = str7;
                                                    fVar = fVar2;
                                                    fVar.f6142b = new p078g1.n(aVar4);
                                                    i22 = i56;
                                                    i39 = i57;
                                                    rVar2 = rVar;
                                                }
                                                i24 = i25;
                                                if (i24 > 0) {
                                                    throw ParserException.b("Can't determine channel count of presentation.");
                                                }
                                                g1.n.a aVar5 = new g1.n.a();
                                                aVar5.f35327a = string3;
                                                aVar5.f35338m = t.m("audio/ac4");
                                                aVar5.f35317C = i24;
                                                aVar5.f35318D = i58;
                                                aVar5.f35342q = kVar2;
                                                str7 = str;
                                                aVar5.f35330d = str7;
                                                fVar = fVar2;
                                                fVar.f6142b = new p078g1.n(aVar5);
                                                i22 = i56;
                                                i39 = i57;
                                                rVar2 = rVar;
                                            }
                                        } else {
                                            i15 = i15;
                                            str4 = str4;
                                            iIntValue = i57;
                                            i38 = i38;
                                            str7 = str7;
                                            iH5 = iH5;
                                            fVar = fVar2;
                                            if (iH6 != 1684892784) {
                                                i15 = i15;
                                                if (iH6 == 1684305011 || iH6 == 1969517683) {
                                                    i15 = i15;
                                                    rVar2 = rVar;
                                                    g1.n.a aVar6 = new g1.n.a();
                                                    aVar6.f35327a = Integer.toString(i10);
                                                    aVar6.f35338m = t.m(str4);
                                                    i39 = iIntValue;
                                                    aVar6.f35317C = i39;
                                                    i22 = i56;
                                                    aVar6.f35318D = i22;
                                                    aVar6.f35342q = kVar2;
                                                    aVar6.f35330d = str7;
                                                    fVar.f6142b = new p078g1.n(aVar6);
                                                } else if (iH6 == 1682927731) {
                                                    int i76 = iH5 - 8;
                                                    byte[] bArr6 = f6123a;
                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i76);
                                                    rVar2 = rVar;
                                                    rVar2.G(i38 + 8);
                                                    rVar2.f(bArrCopyOf, bArr6.length, i76);
                                                    i15 = i15;
                                                    listM = C2479a.h(bArrCopyOf);
                                                    str9 = str9;
                                                    i14 = i56;
                                                } else {
                                                    rVar2 = rVar;
                                                    if (iH6 == 1684425825) {
                                                        byte[] bArr7 = new byte[iH5 - 8];
                                                        bArr7[0] = 102;
                                                        bArr7[1] = 76;
                                                        bArr7[2] = 97;
                                                        bArr7[3] = 67;
                                                        rVar2.G(i38 + 12);
                                                        rVar2.f(bArr7, 4, iH5 - 12);
                                                        listM = ImmutableList.M(bArr7);
                                                        i14 = i56;
                                                    } else if (iH6 == 1634492771) {
                                                        int i77 = iH5 - 12;
                                                        byte[] bArr8 = new byte[i77];
                                                        rVar2.G(i38 + 12);
                                                        rVar2.f(bArr8, 0, i77);
                                                        byte[] bArr9 = p114j1.d.f41012a;
                                                        r rVar4 = new r(bArr8);
                                                        rVar4.G(9);
                                                        int iU5 = rVar4.u();
                                                        rVar4.G(20);
                                                        Pair pairCreate = Pair.create(Integer.valueOf(rVar4.y()), Integer.valueOf(iU5));
                                                        int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                                        iIntValue = ((Integer) pairCreate.second).intValue();
                                                        i14 = iIntValue2;
                                                        listM = ImmutableList.M(bArr8);
                                                    } else {
                                                        if (iH6 == 1767990114) {
                                                            int i78 = 9;
                                                            rVar2.G(i38 + 9);
                                                            long j10 = 0;
                                                            int i79 = 0;
                                                            while (true) {
                                                                if (i79 >= i78) {
                                                                    i15 = i15;
                                                                } else {
                                                                    if (rVar2.f41063b == rVar2.f41064c) {
                                                                        throw new IllegalStateException("Attempting to read a byte over the limit.");
                                                                    }
                                                                    i15 = i15;
                                                                    long jU = rVar.u();
                                                                    j10 |= (jU & 127) << (i79 * 7);
                                                                    if ((jU & 128) != 0) {
                                                                        i79++;
                                                                        i15 = i15;
                                                                        i78 = 9;
                                                                    }
                                                                }
                                                            }
                                                            int iJ0 = Ints.j0(j10);
                                                            byte[] bArr10 = new byte[iJ0];
                                                            rVar2.f(bArr10, 0, iJ0);
                                                            listM = ImmutableList.M(bArr10);
                                                            str9 = str9;
                                                            i14 = i56;
                                                        } else {
                                                            i15 = i15;
                                                            i22 = i56;
                                                            i39 = iIntValue;
                                                        }
                                                        str4 = str4;
                                                        i38 = i38;
                                                        iH5 = iH5;
                                                    }
                                                }
                                            } else {
                                                if (i15 <= 0) {
                                                    throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + i15);
                                                }
                                                str9 = str9;
                                                str4 = str4;
                                                i38 = i38;
                                                iH5 = iH5;
                                                i14 = i15;
                                                iIntValue = 2;
                                                rVar2 = rVar;
                                            }
                                        }
                                        iIntValue = i39;
                                        i14 = i22;
                                        str9 = str9;
                                        str4 = str4;
                                        i38 = i38;
                                        iH5 = iH5;
                                    }
                                }
                                fVar = fVar2;
                                iIntValue = i39;
                                i14 = i22;
                                str9 = str9;
                                str4 = str4;
                                i38 = i38;
                                iH5 = iH5;
                            }
                            i38 += iH5;
                            str9 = str9;
                            str7 = str7;
                            fVar2 = fVar;
                            rVar2 = rVar2;
                            iH2 = i40;
                            i35 = i41;
                            str8 = str5;
                            listM2 = listM;
                            i16 = i19;
                            str10 = str10;
                            i39 = iIntValue;
                            i15 = i15;
                        }
                        i15 = i15;
                        i19 = i16;
                        i38 = i38;
                        str10 = str10;
                        rVar2 = rVar2;
                        listM = listM2;
                        iH5 = iH5;
                        iIntValue = i39;
                        str9 = str9;
                        str7 = str7;
                        fVar = fVar2;
                        i38 += iH5;
                        str9 = str9;
                        str7 = str7;
                        fVar2 = fVar;
                        rVar2 = rVar2;
                        iH2 = i40;
                        i35 = i41;
                        str8 = str5;
                        listM2 = listM;
                        i16 = i19;
                        str10 = str10;
                        i39 = iIntValue;
                        i15 = i15;
                    }
                    String str14 = str4;
                    int i80 = i14;
                    int i81 = i16;
                    str3 = str8;
                    String str15 = str10;
                    List<byte[]> list = listM2;
                    fVar2 = fVar2;
                    i35 = i35;
                    iH2 = iH2;
                    int i82 = i39;
                    c12 = 7;
                    rVar2 = rVar2;
                    str7 = str7;
                    if (fVar2.f6142b == null && str14 != null) {
                        g1.n.a aVar7 = new g1.n.a();
                        aVar7.f35327a = Integer.toString(i10);
                        aVar7.f35338m = t.m(str14);
                        aVar7.j = str15;
                        aVar7.f35317C = i82;
                        aVar7.f35318D = i80;
                        aVar7.f35319E = i81;
                        aVar7.f35341p = list;
                        aVar7.f35342q = kVar2;
                        aVar7.f35330d = str7;
                        if (bVarA != null) {
                            b bVar = bVarA;
                            aVar7.f35334h = Ints.k0(bVar.f6135c);
                            aVar7.f35335i = Ints.k0(bVar.f6136d);
                        }
                        fVar2.f6142b = new p078g1.n(aVar7);
                    }
                    i12 = i17;
                    str2 = str3;
                    i13 = iH;
                } else if (iH3 == 1414810956 || iH3 == 1954034535 || iH3 == 2004251764 || iH3 == 1937010800 || iH3 == 1664495672) {
                    rVar2.G(i35 + 16);
                    String str16 = "application/ttml+xml";
                    if (iH3 == 1414810956) {
                        j = Long.MAX_VALUE;
                        immutableListM = null;
                    } else if (iH3 == 1954034535) {
                        int i83 = iH2 - 16;
                        byte[] bArr11 = new byte[i83];
                        rVar2.f(bArr11, 0, i83);
                        immutableListM = ImmutableList.M(bArr11);
                        str16 = "application/x-quicktime-tx3g";
                        j = Long.MAX_VALUE;
                    } else {
                        if (iH3 == 2004251764) {
                            str16 = "application/x-mp4-vtt";
                        } else {
                            if (iH3 == 1937010800) {
                                j = 0;
                            } else {
                                if (iH3 != 1664495672) {
                                    throw new IllegalStateException();
                                }
                                fVar2.f6144d = 1;
                                str16 = "application/x-mp4-cea-608";
                            }
                            immutableListM = null;
                        }
                        j = Long.MAX_VALUE;
                        immutableListM = null;
                    }
                    g1.n.a aVar8 = new g1.n.a();
                    aVar8.f35327a = Integer.toString(i10);
                    aVar8.f35338m = t.m(str16);
                    aVar8.f35330d = str7;
                    aVar8.f35343r = j;
                    aVar8.f35341p = immutableListM;
                    fVar2.f6142b = new p078g1.n(aVar8);
                    i13 = iH;
                    str2 = str8;
                    i12 = i34;
                    str7 = str7;
                    fVar2 = fVar2;
                    i35 = i35;
                    iH2 = iH2;
                    rVar2 = rVar2;
                } else {
                    if (iH3 == 1835365492) {
                        rVar2.G(i35 + 16);
                        if (iH3 == 1835365492) {
                            rVar.p();
                            String strP = rVar.p();
                            if (strP != null) {
                                g1.n.a aVar9 = new g1.n.a();
                                aVar9.f35327a = Integer.toString(i10);
                                aVar9.f35338m = t.m(strP);
                                fVar2.f6142b = new p078g1.n(aVar9);
                            }
                        }
                    } else if (iH3 == 1667329389) {
                        g1.n.a aVar10 = new g1.n.a();
                        aVar10.f35327a = Integer.toString(i10);
                        aVar10.f35338m = t.m("application/x-camera-motion");
                        fVar2.f6142b = new p078g1.n(aVar10);
                    }
                    i13 = iH;
                    str2 = str8;
                    i12 = i34;
                    str7 = str7;
                    i35 = i35;
                    iH2 = iH2;
                    rVar2 = rVar2;
                    fVar2 = fVar2;
                }
                rVar2.G(i35 + iH2);
                i34 = i12 + 1;
                str7 = str7;
                fVar2 = fVar2;
                rVar2 = rVar2;
                iH = i13;
                str8 = str2;
            }
            i13 = iH;
            str2 = str8;
            i12 = i34;
            h(rVar, iH3, i35, iH2, i10, i11, kVar, fVar2, i12);
            rVar2.G(i35 + iH2);
            i34 = i12 + 1;
            str7 = str7;
            fVar2 = fVar2;
            rVar2 = rVar2;
            iH = i13;
            str8 = str2;
        }
        return fVar2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ba A[EDGE_INSN: B:103:0x01ba->B:106:0x01d5 BREAK  A[LOOP:17: B:93:0x0198->B:104:0x01ca]] */
    /* JADX WARN: Code duplicated, block: B:104:0x01ca A[LOOP:17: B:93:0x0198->B:104:0x01ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0208  */
    /* JADX WARN: Code duplicated, block: B:133:0x029d  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:208:0x0503  */
    /* JADX WARN: Code duplicated, block: B:210:0x0507  */
    /* JADX WARN: Code duplicated, block: B:212:0x050d A[LOOP:13: B:209:0x0505->B:212:0x050d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x0546 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x0548 A[ADDED_TO_REGION, LOOP:14: B:218:0x0548->B:220:0x054c, LOOP_START, PHI: r17 r49 r50
      0x0548: PHI (r17v7 int) = (r17v3 int), (r17v8 int) binds: [B:217:0x0546, B:220:0x054c] A[DONT_GENERATE, DONT_INLINE]
      0x0548: PHI (r49v4 int) = (r49v1 int), (r49v5 int) binds: [B:217:0x0546, B:220:0x054c] A[DONT_GENERATE, DONT_INLINE]
      0x0548: PHI (r50v3 int) = (r50v1 int), (r50v5 int) binds: [B:217:0x0546, B:220:0x054c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:219:0x054a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x0567  */
    /* JADX WARN: Code duplicated, block: B:227:0x056f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0571  */
    /* JADX WARN: Code duplicated, block: B:231:0x0576  */
    /* JADX WARN: Code duplicated, block: B:233:0x057d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0589  */
    /* JADX WARN: Code duplicated, block: B:238:0x0592 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x05c5 A[DONT_INVERT, LOOP:15: B:244:0x05c5->B:248:0x05d0, LOOP_START, PHI: r17
      0x05c5: PHI (r17v4 int) = (r17v3 int), (r17v5 int) binds: [B:243:0x05c3, B:248:0x05d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:248:0x05d0 A[LOOP:15: B:244:0x05c5->B:248:0x05d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:249:0x05d7 A[EDGE_INSN: B:249:0x05d7->B:250:0x05d9 BREAK  A[LOOP:15: B:244:0x05c5->B:248:0x05d0]] */
    /* JADX WARN: Code duplicated, block: B:251:0x05db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:262:0x0629  */
    /* JADX WARN: Code duplicated, block: B:263:0x062c  */
    /* JADX WARN: Code duplicated, block: B:268:0x0651  */
    /* JADX WARN: Code duplicated, block: B:269:0x0667  */
    /* JADX WARN: Code duplicated, block: B:298:0x073b  */
    /* JADX WARN: Code duplicated, block: B:301:0x074c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0753  */
    /* JADX WARN: Code duplicated, block: B:306:0x075c A[LOOP:5: B:304:0x0759->B:306:0x075c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:309:0x0797  */
    /* JADX WARN: Code duplicated, block: B:311:0x079b  */
    /* JADX WARN: Code duplicated, block: B:312:0x079d  */
    /* JADX WARN: Code duplicated, block: B:316:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:318:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:321:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:325:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:328:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:333:0x0807  */
    /* JADX WARN: Code duplicated, block: B:337:0x0816  */
    /* JADX WARN: Code duplicated, block: B:339:0x081e A[LOOP:9: B:335:0x080d->B:339:0x081e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:342:0x082a  */
    /* JADX WARN: Code duplicated, block: B:343:0x082c  */
    /* JADX WARN: Code duplicated, block: B:346:0x0833  */
    /* JADX WARN: Code duplicated, block: B:350:0x0850  */
    /* JADX WARN: Code duplicated, block: B:351:0x0852  */
    /* JADX WARN: Code duplicated, block: B:354:0x0856  */
    /* JADX WARN: Code duplicated, block: B:355:0x0859  */
    /* JADX WARN: Code duplicated, block: B:357:0x085d  */
    /* JADX WARN: Code duplicated, block: B:358:0x0860  */
    /* JADX WARN: Code duplicated, block: B:360:0x0864  */
    /* JADX WARN: Code duplicated, block: B:362:0x0868  */
    /* JADX WARN: Code duplicated, block: B:363:0x086b  */
    /* JADX WARN: Code duplicated, block: B:367:0x087b  */
    /* JADX WARN: Code duplicated, block: B:369:0x0887  */
    /* JADX WARN: Code duplicated, block: B:370:0x089d  */
    /* JADX WARN: Code duplicated, block: B:373:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:375:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:378:0x08da  */
    /* JADX WARN: Code duplicated, block: B:385:0x091f  */
    /* JADX WARN: Code duplicated, block: B:386:0x0963  */
    /* JADX WARN: Code duplicated, block: B:397:0x098d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x07f0 A[ADDED_TO_REGION, EDGE_INSN: B:406:0x07f0->B:324:0x07f0 BREAK  A[LOOP:7: B:319:0x07e1->B:323:0x07eb], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0804 A[ADDED_TO_REGION, EDGE_INSN: B:408:0x0804->B:331:0x0804 BREAK  A[LOOP:8: B:326:0x07f4->B:330:0x0800], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0821 A[EDGE_INSN: B:410:0x0821->B:340:0x0821 BREAK  A[LOOP:9: B:335:0x080d->B:339:0x081e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0821 A[EDGE_INSN: B:411:0x0821->B:340:0x0821 BREAK  A[LOOP:9: B:335:0x080d->B:339:0x081e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x08e0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x05b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x052a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x05a1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x0522 A[EDGE_INSN: B:423:0x0522->B:213:0x0522 BREAK  A[LOOP:13: B:209:0x0505->B:212:0x050d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x05d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0131  */
    /* JADX WARN: Code duplicated, block: B:81:0x013f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0145  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0182  */
    /* JADX WARN: Code duplicated, block: B:90:0x0191  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    /* JADX WARN: Code duplicated, block: B:94:0x019a  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v49 */
    public static ArrayList g(k1.b.a aVar, z zVar, long j, p078g1.k kVar, boolean z10, boolean z11, com.google.common.base.c cVar) throws ParserException {
        byte b10;
        long jW;
        int i10;
        int i11;
        long j10;
        long j11;
        long jL;
        r rVar;
        int iC;
        int i12;
        long jW2;
        int i13;
        int i14;
        int i15;
        long jL2;
        String str;
        p127k1.b.C0471b c0471bC;
        f fVarF;
        k1.b.a aVar2;
        long[] jArr;
        long[] jArr2;
        p078g1.n nVar;
        l lVar;
        k1.b.a aVarB;
        Pair pairCreate;
        int i16;
        long jZ;
        long j12;
        d hVar;
        boolean z12;
        int iY;
        int iY2;
        int iY3;
        int iA;
        p078g1.n nVar2;
        int i17;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        long j13;
        long j14;
        int i18;
        int i19;
        int i20;
        int iH;
        int iY4;
        int iY5;
        int i21;
        int i22;
        int iH2;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z13;
        int i27;
        l lVar2;
        String str2;
        int i28;
        int[] iArr;
        long[] jArr3;
        long j15;
        boolean zA;
        int i29;
        int iC2;
        int i30;
        int iY6;
        long jL3;
        long j16;
        long[] jArr4;
        int length;
        int i31;
        long[] jArr5;
        long j17;
        int i32;
        int[] iArr2;
        long[] jArr6;
        o oVar;
        o oVar2;
        int i33;
        int i34;
        int i35;
        int[] iArr3;
        int[] iArr4;
        int i36;
        int i37;
        int i38;
        int i39;
        ?? r10;
        long[] jArr7;
        int[] iArr5;
        long[] jArr8;
        int i40;
        int i41;
        long[] jArr9;
        int[] iArr6;
        int[] iArr7;
        long[] jArr10;
        long j18;
        int i42;
        int i43;
        boolean z14;
        int i44;
        boolean z15;
        l lVar3;
        long j19;
        int i45;
        int i46;
        int[] iArr8;
        int[] iArr9;
        long jL4;
        ?? r11;
        long j20;
        ?? r12;
        int i47;
        long j21;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        long j22;
        int i55;
        ArrayList arrayList;
        byte b11 = -1;
        ArrayList arrayList2 = new ArrayList();
        int i56 = 0;
        while (true) {
            ArrayList arrayList3 = aVar.f41392d;
            if (i56 >= arrayList3.size()) {
                return arrayList2;
            }
            k1.b.a aVar3 = (k1.b.a) arrayList3.get(i56);
            if (aVar3.f41389a != 1953653099) {
                arrayList = arrayList2;
                i56 = i56;
            } else {
                p127k1.b.C0471b c0471bC2 = aVar.c(1836476516);
                c0471bC2.getClass();
                k1.b.a aVarB2 = aVar3.b(1835297121);
                aVarB2.getClass();
                p127k1.b.C0471b c0471bC3 = aVarB2.c(1751411826);
                c0471bC3.getClass();
                r rVar2 = c0471bC3.f41393b;
                rVar2.G(16);
                int iH3 = rVar2.h();
                if (iH3 == 1936684398) {
                    b10 = 1;
                } else if (iH3 == 1986618469) {
                    b10 = 2;
                } else if (iH3 == 1952807028 || iH3 == 1935832172 || iH3 == 1937072756 || iH3 == 1668047728) {
                    b10 = 3;
                } else {
                    b10 = iH3 == 1835365473 ? (byte) 5 : b11;
                }
                if (b10 == b11) {
                    aVar2 = aVar3;
                    lVar = null;
                } else {
                    p127k1.b.C0471b c0471bC4 = aVar3.c(1953196132);
                    c0471bC4.getClass();
                    r rVar3 = c0471bC4.f41393b;
                    rVar3.G(8);
                    int iC3 = c(rVar3.h());
                    rVar3.H(iC3 != 0 ? 16 : 8);
                    int iH4 = rVar3.h();
                    rVar3.H(4);
                    int i57 = rVar3.f41063b;
                    int i58 = iC3 != 0 ? 8 : 4;
                    int i59 = 0;
                    while (true) {
                        if (i59 >= i58) {
                            rVar3.H(i58);
                        } else {
                            if (rVar3.f41062a[i57 + i59] != b11) {
                                jW = iC3 == 0 ? rVar3.w() : rVar3.z();
                                if (jW != 0) {
                                    break;
                                }
                                break;
                            }
                            i59++;
                        }
                        jW = -9223372036854775807L;
                        break;
                    }
                    rVar3.H(16);
                    int iH5 = rVar3.h();
                    int iH6 = rVar3.h();
                    rVar3.H(4);
                    int iH7 = rVar3.h();
                    int iH8 = rVar3.h();
                    if (iH5 == 0 && iH6 == 65536) {
                        i10 = -65536;
                        if (iH7 == -65536 && iH8 == 0) {
                            i11 = 90;
                        }
                        if (j == -9223372036854775807L) {
                            j10 = jW;
                        } else {
                            j10 = j;
                        }
                        j11 = d(c0471bC2.f41393b).f41398c;
                        if (j10 == -9223372036854775807L) {
                            jL = -9223372036854775807L;
                        } else {
                            int i60 = A.f40996a;
                            jL = A.L(j10, 1000000L, j11, RoundingMode.DOWN);
                        }
                        k1.b.a aVarB3 = aVarB2.b(1835626086);
                        aVarB3.getClass();
                        k1.b.a aVarB4 = aVarB3.b(1937007212);
                        aVarB4.getClass();
                        p127k1.b.C0471b c0471bC5 = aVarB2.c(1835296868);
                        c0471bC5.getClass();
                        rVar = c0471bC5.f41393b;
                        rVar.G(8);
                        iC = c(rVar.h());
                        if (iC == 0) {
                            i12 = 8;
                        } else {
                            i12 = 16;
                        }
                        rVar.H(i12);
                        jW2 = rVar.w();
                        i13 = rVar.f41063b;
                        if (iC == 0) {
                            i14 = 4;
                        } else {
                            i14 = 8;
                        }
                        i15 = 0;
                        while (true) {
                            if (i15 < i14) {
                                i16 = i13;
                                if (rVar.f41062a[i13 + i15] != -1) {
                                    if (iC == 0) {
                                        jZ = rVar.w();
                                    } else {
                                        jZ = rVar.z();
                                    }
                                    j12 = jZ;
                                    if (j12 == 0) {
                                        int i61 = A.f40996a;
                                        jL2 = A.L(j12, 1000000L, jW2, RoundingMode.DOWN);
                                        break;
                                    }
                                    break;
                                }
                                i15++;
                                i13 = i16;
                            } else {
                                rVar.H(i14);
                            }
                            jL2 = -9223372036854775807L;
                            break;
                        }
                        int iA2 = rVar.A();
                        str = "" + ((char) (((iA2 >> 10) & 31) + 96)) + ((char) (((iA2 >> 5) & 31) + 96)) + ((char) ((iA2 & 31) + 96));
                        c0471bC = aVarB4.c(1937011556);
                        if (c0471bC != null) {
                            throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        fVarF = f(c0471bC.f41393b, iH4, i11, str, kVar, z11);
                        if (!z10 || (aVarB = aVar3.b(1701082227)) == null) {
                            aVar2 = aVar3;
                        } else {
                            p127k1.b.C0471b c0471bC6 = aVarB.c(1701606260);
                            if (c0471bC6 == null) {
                                aVar2 = aVar3;
                                pairCreate = null;
                            } else {
                                r rVar4 = c0471bC6.f41393b;
                                rVar4.G(8);
                                int iC4 = c(rVar4.h());
                                int iY7 = rVar4.y();
                                long[] jArr11 = new long[iY7];
                                long[] jArr12 = new long[iY7];
                                int i62 = 0;
                                while (i62 < iY7) {
                                    jArr11[i62] = iC4 == 1 ? rVar4.z() : rVar4.w();
                                    jArr12[i62] = iC4 == 1 ? rVar4.o() : rVar4.h();
                                    if (rVar4.r() != 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    rVar4.H(2);
                                    i62++;
                                    iY7 = iY7;
                                    aVar3 = aVar3;
                                }
                                aVar2 = aVar3;
                                pairCreate = Pair.create(jArr11, jArr12);
                            }
                            if (pairCreate != null) {
                                jArr2 = (long[]) pairCreate.first;
                                jArr = (long[]) pairCreate.second;
                            }
                            nVar = fVarF.f6142b;
                            if (nVar == null) {
                                lVar = null;
                            } else {
                                lVar = new l(iH4, b10, jW2, j11, jL, jL2, nVar, fVarF.f6144d, fVarF.f6141a, fVarF.f6143c, jArr2, jArr);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        nVar = fVarF.f6142b;
                        if (nVar == null) {
                            lVar = null;
                        } else {
                            lVar = new l(iH4, b10, jW2, j11, jL, jL2, nVar, fVarF.f6144d, fVarF.f6141a, fVarF.f6143c, jArr2, jArr);
                        }
                    } else {
                        i10 = -65536;
                    }
                    if (iH5 == 0 && iH6 == i10) {
                        if (iH7 == 65536 && iH8 == 0) {
                            i11 = 270;
                        } else {
                            i10 = -65536;
                            if (iH5 != i10) {
                                i11 = 0;
                            } else {
                                i11 = 0;
                            }
                        }
                    } else if (iH5 != i10 && iH6 == 0 && iH7 == 0 && iH8 == i10) {
                        i11 = 180;
                    } else {
                        i11 = 0;
                    }
                    if (j == -9223372036854775807L) {
                        j10 = jW;
                    } else {
                        j10 = j;
                    }
                    j11 = d(c0471bC2.f41393b).f41398c;
                    if (j10 == -9223372036854775807L) {
                        jL = -9223372036854775807L;
                    } else {
                        int i63 = A.f40996a;
                        jL = A.L(j10, 1000000L, j11, RoundingMode.DOWN);
                    }
                    k1.b.a aVarB5 = aVarB2.b(1835626086);
                    aVarB5.getClass();
                    k1.b.a aVarB6 = aVarB5.b(1937007212);
                    aVarB6.getClass();
                    p127k1.b.C0471b c0471bC7 = aVarB2.c(1835296868);
                    c0471bC7.getClass();
                    rVar = c0471bC7.f41393b;
                    rVar.G(8);
                    iC = c(rVar.h());
                    if (iC == 0) {
                        i12 = 8;
                    } else {
                        i12 = 16;
                    }
                    rVar.H(i12);
                    jW2 = rVar.w();
                    i13 = rVar.f41063b;
                    if (iC == 0) {
                        i14 = 4;
                    } else {
                        i14 = 8;
                    }
                    i15 = 0;
                    while (true) {
                        if (i15 < i14) {
                            i16 = i13;
                            if (rVar.f41062a[i13 + i15] != -1) {
                                if (iC == 0) {
                                    jZ = rVar.w();
                                } else {
                                    jZ = rVar.z();
                                }
                                j12 = jZ;
                                if (j12 == 0) {
                                    int i64 = A.f40996a;
                                    jL2 = A.L(j12, 1000000L, jW2, RoundingMode.DOWN);
                                    break;
                                }
                                break;
                            }
                            i15++;
                            i13 = i16;
                        } else {
                            rVar.H(i14);
                        }
                        jL2 = -9223372036854775807L;
                        break;
                    }
                    int iA3 = rVar.A();
                    str = "" + ((char) (((iA3 >> 10) & 31) + 96)) + ((char) (((iA3 >> 5) & 31) + 96)) + ((char) ((iA3 & 31) + 96));
                    c0471bC = aVarB6.c(1937011556);
                    if (c0471bC != null) {
                        throw ParserException.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                    }
                    fVarF = f(c0471bC.f41393b, iH4, i11, str, kVar, z11);
                    if (z10) {
                        aVar2 = aVar3;
                        jArr = null;
                        jArr2 = null;
                    } else {
                        aVar2 = aVar3;
                        jArr = null;
                        jArr2 = null;
                    }
                    nVar = fVarF.f6142b;
                    if (nVar == null) {
                        lVar = null;
                    } else {
                        lVar = new l(iH4, b10, jW2, j11, jL, jL2, nVar, fVarF.f6144d, fVarF.f6141a, fVarF.f6143c, jArr2, jArr);
                    }
                }
                l lVar4 = (l) cVar.apply(lVar);
                if (lVar4 == null) {
                    arrayList = arrayList2;
                } else {
                    k1.b.a aVarB7 = aVar2.b(1835297121);
                    aVarB7.getClass();
                    k1.b.a aVarB8 = aVarB7.b(1835626086);
                    aVarB8.getClass();
                    k1.b.a aVarB9 = aVarB8.b(1937007212);
                    aVarB9.getClass();
                    p127k1.b.C0471b c0471bC8 = aVarB9.c(1937011578);
                    p078g1.n nVar3 = lVar4.f6263g;
                    if (c0471bC8 != null) {
                        hVar = new g(c0471bC8, nVar3);
                    } else {
                        p127k1.b.C0471b c0471bC9 = aVarB9.c(1937013298);
                        if (c0471bC9 == null) {
                            throw ParserException.a(null, "Track has no sample table size information");
                        }
                        hVar = new h(c0471bC9);
                    }
                    int iB = hVar.b();
                    if (iB == 0) {
                        oVar2 = new o(lVar4, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        if (lVar4.f6258b == 2) {
                            long j23 = lVar4.f6262f;
                            if (j23 > 0) {
                                g1.n.a aVarA = nVar3.a();
                                aVarA.f35347v = iB / (j23 / 1000000.0f);
                                lVar4 = new l(lVar4.f6257a, lVar4.f6258b, lVar4.f6259c, lVar4.f6260d, lVar4.f6261e, lVar4.f6262f, new p078g1.n(aVarA), lVar4.f6264h, lVar4.f6267l, lVar4.f6266k, lVar4.f6265i, lVar4.j);
                            }
                        }
                        p127k1.b.C0471b c0471bC10 = aVarB9.c(1937007471);
                        if (c0471bC10 == null) {
                            c0471bC10 = aVarB9.c(1668232756);
                            c0471bC10.getClass();
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        p127k1.b.C0471b c0471bC11 = aVarB9.c(1937011555);
                        c0471bC11.getClass();
                        p127k1.b.C0471b c0471bC12 = aVarB9.c(1937011827);
                        c0471bC12.getClass();
                        p127k1.b.C0471b c0471bC13 = aVarB9.c(1937011571);
                        r rVar5 = c0471bC13 != null ? c0471bC13.f41393b : null;
                        p127k1.b.C0471b c0471bC14 = aVarB9.c(1668576371);
                        r rVar6 = c0471bC14 != null ? c0471bC14.f41393b : null;
                        C0084a c0084a = new C0084a(c0471bC11.f41393b, c0471bC10.f41393b, z12);
                        r rVar7 = c0471bC12.f41393b;
                        rVar7.G(12);
                        int iY8 = rVar7.y() - 1;
                        int iY9 = rVar7.y();
                        int iY10 = rVar7.y();
                        if (rVar6 != null) {
                            rVar6.G(12);
                            iY = rVar6.y();
                        } else {
                            iY = 0;
                        }
                        if (rVar5 != null) {
                            rVar5.G(12);
                            iY2 = rVar5.y();
                            if (iY2 > 0) {
                                iY3 = rVar5.y() - 1;
                            } else {
                                rVar5 = null;
                            }
                            iA = hVar.a();
                            nVar2 = lVar4.f6263g;
                            String str3 = nVar2.f35302n;
                            i17 = iY3;
                            if (iA == -1 && (("audio/raw".equals(str3) || "audio/g711-mlaw".equals(str3) || "audio/g711-alaw".equals(str3)) && iY8 == 0 && iY == 0 && iY2 == 0)) {
                                int i65 = c0084a.f6124a;
                                long[] jArr13 = new long[i65];
                                int[] iArr10 = new int[i65];
                                while (c0084a.a()) {
                                    int i66 = c0084a.f6125b;
                                    jArr13[i66] = c0084a.f6127d;
                                    iArr10[i66] = c0084a.f6126c;
                                }
                                long j24 = iY10;
                                int i67 = 8192 / iA;
                                int iE = 0;
                                for (int i68 = 0; i68 < i65; i68++) {
                                    iE += A.e(iArr10[i68], i67);
                                }
                                long[] jArr14 = new long[iE];
                                int[] iArr11 = new int[iE];
                                long[] jArr15 = new long[iE];
                                int[] iArr12 = new int[iE];
                                int i69 = 0;
                                int i70 = 0;
                                int i71 = 0;
                                int i72 = 0;
                                while (i69 < i65) {
                                    int i73 = iArr10[i69];
                                    long j25 = jArr13[i69];
                                    int i74 = i72;
                                    int i75 = i65;
                                    int iMax = i71;
                                    int i76 = i74;
                                    long[] jArr16 = jArr13;
                                    int i77 = i73;
                                    while (i77 > 0) {
                                        int iMin = Math.min(i67, i77);
                                        jArr14[i76] = j25;
                                        int[] iArr13 = iArr10;
                                        int i78 = iA * iMin;
                                        iArr11[i76] = i78;
                                        iMax = Math.max(iMax, i78);
                                        jArr15[i76] = ((long) i70) * j24;
                                        iArr12[i76] = 1;
                                        j25 += (long) iArr11[i76];
                                        i70 += iMin;
                                        i77 -= iMin;
                                        i76++;
                                        i67 = i67;
                                        iArr10 = iArr13;
                                        jArr14 = jArr14;
                                    }
                                    i69++;
                                    i67 = i67;
                                    jArr13 = jArr16;
                                    iArr10 = iArr10;
                                    int i79 = i76;
                                    i71 = iMax;
                                    i65 = i75;
                                    i72 = i79;
                                }
                                j15 = j24 * ((long) i70);
                                iArr = iArr12;
                                iArrCopyOf = iArr11;
                                jArrCopyOf2 = jArr15;
                                i28 = i71;
                                jArr3 = jArr14;
                                lVar2 = lVar4;
                            } else {
                                jArrCopyOf = new long[iB];
                                iArrCopyOf = new int[iB];
                                jArrCopyOf2 = new long[iB];
                                int i80 = iY2;
                                iArrCopyOf2 = new int[iB];
                                l lVar5 = lVar4;
                                j13 = 0;
                                j14 = 0;
                                i18 = 0;
                                i19 = 0;
                                i20 = 0;
                                iH = 0;
                                iY4 = 0;
                                iY5 = i17;
                                i21 = iY;
                                i22 = iY9;
                                iH2 = iY10;
                                i23 = iY8;
                                i24 = i80;
                                while (true) {
                                    if (i18 >= iB) {
                                        i25 = i23;
                                        i26 = i22;
                                        break;
                                    }
                                    zA = true;
                                    while (i20 == 0) {
                                        zA = c0084a.a();
                                        if (!zA) {
                                            break;
                                        }
                                        int i81 = i23;
                                        long j26 = c0084a.f6127d;
                                        i20 = c0084a.f6126c;
                                        j14 = j26;
                                        i23 = i81;
                                        i22 = i22;
                                        iB = iB;
                                    }
                                    i29 = iB;
                                    i25 = i23;
                                    i26 = i22;
                                    if (!zA) {
                                        p114j1.k.f("Unexpected end of chunk data");
                                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i18);
                                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i18);
                                        iB = i18;
                                        break;
                                    }
                                    if (rVar6 != null) {
                                        while (iY4 == 0 && i21 > 0) {
                                            iY4 = rVar6.y();
                                            iH = rVar6.h();
                                            i21--;
                                        }
                                        iY4--;
                                    }
                                    int i82 = iH;
                                    jArrCopyOf[i18] = j14;
                                    iC2 = hVar.c();
                                    iArrCopyOf[i18] = iC2;
                                    if (iC2 > i19) {
                                        i19 = iC2;
                                    }
                                    jArrCopyOf2[i18] = j13 + ((long) i82);
                                    if (rVar5 == null) {
                                        i30 = 1;
                                    } else {
                                        i30 = 0;
                                    }
                                    iArrCopyOf2[i18] = i30;
                                    if (i18 == iY5) {
                                        iArrCopyOf2[i18] = 1;
                                        i24--;
                                        if (i24 > 0) {
                                            rVar5.getClass();
                                            iY5 = rVar5.y() - 1;
                                        }
                                    }
                                    int i83 = i19;
                                    d dVar = hVar;
                                    j13 += (long) iH2;
                                    iY6 = i26 - 1;
                                    if (iY6 != 0 && i25 > 0) {
                                        iY6 = rVar7.y();
                                        i25--;
                                        iH2 = rVar7.h();
                                    }
                                    int i84 = iY6;
                                    j14 += (long) iArrCopyOf[i18];
                                    i20--;
                                    i18++;
                                    iH = i82;
                                    hVar = dVar;
                                    i19 = i83;
                                    i23 = i25;
                                    i22 = i84;
                                    iB = i29;
                                }
                                int i85 = i20;
                                long j27 = j13 + ((long) iH);
                                if (rVar6 == null) {
                                    z13 = true;
                                    break;
                                }
                                while (true) {
                                    if (i21 <= 0) {
                                        z13 = true;
                                        break;
                                    }
                                    if (rVar6.y() != 0) {
                                        z13 = false;
                                        break;
                                    }
                                    rVar6.h();
                                    i21--;
                                }
                                if (i24 != 0 && i26 == 0 && i85 == 0 && i25 == 0) {
                                    i27 = iY4;
                                    if (i27 == 0 && z13) {
                                        lVar2 = lVar5;
                                    }
                                    i28 = i19;
                                    iArr = iArrCopyOf2;
                                    jArr3 = jArrCopyOf;
                                    j15 = j27;
                                } else {
                                    i27 = iY4;
                                }
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                lVar2 = lVar5;
                                sb2.append(lVar2.f6257a);
                                sb2.append(": remainingSynchronizationSamples ");
                                sb2.append(i24);
                                sb2.append(", remainingSamplesAtTimestampDelta ");
                                sb2.append(i26);
                                sb2.append(", remainingSamplesInChunk ");
                                sb2.append(i85);
                                sb2.append(", remainingTimestampDeltaChanges ");
                                sb2.append(i25);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(i27);
                                if (z13) {
                                    str2 = "";
                                } else {
                                    str2 = ", ctts invalid";
                                }
                                sb2.append(str2);
                                p114j1.k.f(sb2.toString());
                                i28 = i19;
                                iArr = iArrCopyOf2;
                                jArr3 = jArrCopyOf;
                                j15 = j27;
                            }
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jL3 = A.L(j15, 1000000L, lVar2.f6259c, roundingMode);
                            j16 = lVar2.f6259c;
                            jArr4 = lVar2.f6265i;
                            if (jArr4 == null) {
                                A.K(jArrCopyOf2, j16);
                                oVar2 = new o(lVar2, jArr3, iArrCopyOf, i28, jArrCopyOf2, iArr, jL3);
                            } else {
                                length = jArr4.length;
                                i31 = lVar2.f6258b;
                                jArr5 = lVar2.j;
                                if (length == 1 || i31 != 1 || jArrCopyOf2.length < 2) {
                                    j17 = j15;
                                    i32 = i31;
                                    iArr2 = iArr;
                                    jArr6 = jArr4;
                                } else {
                                    jArr5.getClass();
                                    long j28 = jArr5[0];
                                    i32 = i31;
                                    iArr2 = iArr;
                                    jArr6 = jArr4;
                                    long jL5 = j28 + A.L(jArr4[0], lVar2.f6259c, lVar2.f6260d, roundingMode);
                                    int length2 = jArrCopyOf2.length - 1;
                                    int iG = A.g(4, 0, length2);
                                    int iG2 = A.g(jArrCopyOf2.length - 4, 0, length2);
                                    long j29 = jArrCopyOf2[0];
                                    if (j29 <= j28 && j28 < jArrCopyOf2[iG] && jArrCopyOf2[iG2] < jL5 && jL5 <= j15) {
                                        long j30 = nVar2.f35280E;
                                        nVar2 = nVar2;
                                        long jL6 = A.L(j28 - j29, j30, lVar2.f6259c, roundingMode);
                                        j17 = j15;
                                        long jL7 = A.L(j15 - jL5, j30, lVar2.f6259c, roundingMode);
                                        if ((jL6 != 0 || jL7 != 0) && jL6 <= 2147483647L && jL7 <= 2147483647L) {
                                            zVar.f571a = (int) jL6;
                                            zVar.f572b = (int) jL7;
                                            A.K(jArrCopyOf2, j16);
                                            oVar = new o(lVar2, jArr3, iArrCopyOf, i28, jArrCopyOf2, iArr2, A.L(jArr6[0], 1000000L, lVar2.f6260d, roundingMode));
                                        }
                                        oVar2 = oVar;
                                    } else {
                                        j17 = j15;
                                    }
                                }
                                if (jArr6.length == 1) {
                                    i33 = 0;
                                    if (jArr6[0] == 0) {
                                        jArr5.getClass();
                                        j22 = jArr5[0];
                                        for (i55 = 0; i55 < jArrCopyOf2.length; i55++) {
                                            jArrCopyOf2[i55] = A.L(jArrCopyOf2[i55] - j22, 1000000L, lVar2.f6259c, RoundingMode.DOWN);
                                        }
                                        oVar = new o(lVar2, jArr3, iArrCopyOf, i28, jArrCopyOf2, iArr2, A.L(j17 - j22, 1000000L, lVar2.f6259c, RoundingMode.DOWN));
                                        oVar2 = oVar;
                                    }
                                } else {
                                    i33 = 0;
                                }
                                i34 = i32;
                                if (i34 == 1) {
                                    i35 = 1;
                                } else {
                                    i35 = i33;
                                }
                                iArr3 = new int[jArr6.length];
                                iArr4 = new int[jArr6.length];
                                jArr5.getClass();
                                i36 = i33;
                                i37 = i36;
                                i38 = i37;
                                i39 = i38;
                                r10 = i35;
                                while (i36 < jArr6.length) {
                                    r11 = r10;
                                    j20 = jArr5[i36];
                                    if (j20 != -1) {
                                        long jL8 = A.L(jArr6[i36], lVar2.f6259c, lVar2.f6260d, RoundingMode.DOWN);
                                        i47 = 1;
                                        iArr3[i36] = A.d(jArrCopyOf2, j20, true);
                                        j21 = j20 + jL8;
                                        boolean z16 = r11 == true ? 1 : 0;
                                        iArr4[i36] = A.a(jArrCopyOf2, j21, z16);
                                        i48 = iArr3[i36];
                                        while (true) {
                                            i49 = iArr3[i36];
                                            if (i49 >= 0 || (iArr2[i49] & 1) != 0) {
                                                break;
                                            }
                                            iArr3[i36] = i49 - i47;
                                            i47 = 1;
                                        }
                                        if (i49 < 0) {
                                            iArr3[i36] = i48;
                                            while (true) {
                                                i54 = iArr3[i36];
                                                if (i54 < iArr4[i36] || (iArr2[i54] & 1) != 0) {
                                                    break;
                                                }
                                                iArr3[i36] = i54 + 1;
                                            }
                                        }
                                        if (i34 == 2 && iArr3[i36] != iArr4[i36]) {
                                            while (true) {
                                                i52 = iArr4[i36];
                                                if (i52 >= jArrCopyOf2.length - 1) {
                                                    break;
                                                }
                                                i53 = i52 + 1;
                                                if (jArrCopyOf2[i53] > j21) {
                                                    break;
                                                }
                                                iArr4[i36] = i53;
                                            }
                                        }
                                        int i86 = iArr4[i36];
                                        i50 = iArr3[i36];
                                        int i87 = (i86 - i50) + i38;
                                        if (i39 != i50) {
                                            i51 = 1;
                                        } else {
                                            i51 = 0;
                                        }
                                        i39 = i86;
                                        i37 = i51 | i37;
                                        i38 = i87;
                                        r12 = z16;
                                    } else {
                                        r12 = r11;
                                    }
                                    i36++;
                                    r10 = r12;
                                    jArr3 = jArr3;
                                    iArrCopyOf = iArrCopyOf;
                                    jArr6 = jArr6;
                                }
                                jArr7 = jArr3;
                                iArr5 = iArrCopyOf;
                                jArr8 = jArr6;
                                if (i38 != iB) {
                                    i40 = 1;
                                } else {
                                    i40 = 0;
                                }
                                i41 = i40 | i37;
                                if (i41 != 0) {
                                    jArr9 = new long[i38];
                                } else {
                                    jArr9 = jArr7;
                                }
                                if (i41 != 0) {
                                    iArr6 = new int[i38];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i41 != 0) {
                                    i28 = 0;
                                }
                                if (i41 != 0) {
                                    iArr7 = new int[i38];
                                } else {
                                    iArr7 = iArr2;
                                }
                                jArr10 = new long[i38];
                                j18 = 0;
                                i42 = i28;
                                i43 = 0;
                                z14 = false;
                                i44 = 0;
                                while (i43 < jArr8.length) {
                                    j19 = jArr5[i43];
                                    i45 = iArr3[i43];
                                    int[] iArr14 = iArr3;
                                    i46 = iArr4[i43];
                                    int[] iArr15 = iArr4;
                                    if (i41 != 0) {
                                        int i88 = i46 - i45;
                                        System.arraycopy(jArr7, i45, jArr9, i44, i88);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i45, iArr6, i44, i88);
                                        iArr9 = iArr2;
                                        System.arraycopy(iArr9, i45, iArr7, i44, i88);
                                    } else {
                                        iArr8 = iArr5;
                                        iArr9 = iArr2;
                                    }
                                    int i89 = i42;
                                    while (i45 < i46) {
                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                        int i90 = i43;
                                        int[] iArr16 = iArr8;
                                        long jL9 = A.L(j18, 1000000L, lVar2.f6260d, roundingMode2);
                                        long j31 = j18;
                                        jL4 = A.L(jArrCopyOf2[i45] - j19, 1000000L, lVar2.f6259c, roundingMode2);
                                        if (jL4 < 0) {
                                            z14 = true;
                                        }
                                        jArr10[i44] = jL9 + jL4;
                                        if (i41 == 0 && iArr6[i44] > i89) {
                                            i89 = iArr16[i45];
                                        }
                                        i44++;
                                        i45++;
                                        i43 = i90;
                                        iArr8 = iArr16;
                                        j18 = j31;
                                    }
                                    int i91 = i43;
                                    int[] iArr17 = iArr8;
                                    j18 += jArr8[i91];
                                    i43 = i91 + 1;
                                    iArr2 = iArr9;
                                    i42 = i89;
                                    iArr3 = iArr14;
                                    jArr9 = jArr9;
                                    iArr4 = iArr15;
                                    z14 = z14;
                                    iArr5 = iArr17;
                                }
                                long[] jArr17 = jArr9;
                                z15 = z14;
                                long jL10 = A.L(j18, 1000000L, lVar2.f6260d, RoundingMode.DOWN);
                                if (z15) {
                                    g1.n.a aVarA2 = nVar2.a();
                                    aVarA2.f35344s = true;
                                    lVar3 = new l(lVar2.f6257a, lVar2.f6258b, lVar2.f6259c, lVar2.f6260d, lVar2.f6261e, lVar2.f6262f, new p078g1.n(aVarA2), lVar2.f6264h, lVar2.f6267l, lVar2.f6266k, lVar2.f6265i, lVar2.j);
                                } else {
                                    lVar3 = lVar2;
                                }
                                oVar2 = new o(lVar3, jArr17, iArr6, i42, jArr10, iArr7, jL10);
                            }
                        } else {
                            iY2 = 0;
                        }
                        iY3 = -1;
                        iA = hVar.a();
                        nVar2 = lVar4.f6263g;
                        String str4 = nVar2.f35302n;
                        i17 = iY3;
                        if (iA == -1) {
                            jArrCopyOf = new long[iB];
                            iArrCopyOf = new int[iB];
                            jArrCopyOf2 = new long[iB];
                            int i810 = iY2;
                            iArrCopyOf2 = new int[iB];
                            l lVar6 = lVar4;
                            j13 = 0;
                            j14 = 0;
                            i18 = 0;
                            i19 = 0;
                            i20 = 0;
                            iH = 0;
                            iY4 = 0;
                            iY5 = i17;
                            i21 = iY;
                            i22 = iY9;
                            iH2 = iY10;
                            i23 = iY8;
                            i24 = i810;
                            while (true) {
                                if (i18 >= iB) {
                                    i25 = i23;
                                    i26 = i22;
                                    break;
                                }
                                zA = true;
                                while (i20 == 0) {
                                    zA = c0084a.a();
                                    if (!zA) {
                                        break;
                                        break;
                                    }
                                    int i811 = i23;
                                    long j210 = c0084a.f6127d;
                                    i20 = c0084a.f6126c;
                                    j14 = j210;
                                    i23 = i811;
                                    i22 = i22;
                                    iB = iB;
                                }
                                i29 = iB;
                                i25 = i23;
                                i26 = i22;
                                if (!zA) {
                                    p114j1.k.f("Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i18);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i18);
                                    iB = i18;
                                    break;
                                }
                                if (rVar6 != null) {
                                    while (iY4 == 0) {
                                        iY4 = rVar6.y();
                                        iH = rVar6.h();
                                        i21--;
                                    }
                                    iY4--;
                                }
                                int i812 = iH;
                                jArrCopyOf[i18] = j14;
                                iC2 = hVar.c();
                                iArrCopyOf[i18] = iC2;
                                if (iC2 > i19) {
                                    i19 = iC2;
                                }
                                jArrCopyOf2[i18] = j13 + ((long) i812);
                                if (rVar5 == null) {
                                    i30 = 1;
                                } else {
                                    i30 = 0;
                                }
                                iArrCopyOf2[i18] = i30;
                                if (i18 == iY5) {
                                    iArrCopyOf2[i18] = 1;
                                    i24--;
                                    if (i24 > 0) {
                                        rVar5.getClass();
                                        iY5 = rVar5.y() - 1;
                                    }
                                }
                                int i813 = i19;
                                d dVar2 = hVar;
                                j13 += (long) iH2;
                                iY6 = i26 - 1;
                                if (iY6 != 0) {
                                }
                                int i814 = iY6;
                                j14 += (long) iArrCopyOf[i18];
                                i20--;
                                i18++;
                                iH = i812;
                                hVar = dVar2;
                                i19 = i813;
                                i23 = i25;
                                i22 = i814;
                                iB = i29;
                            }
                            int i815 = i20;
                            long j211 = j13 + ((long) iH);
                            if (rVar6 == null) {
                                z13 = true;
                                break;
                            }
                            while (true) {
                                if (i21 <= 0) {
                                    z13 = true;
                                    break;
                                }
                                if (rVar6.y() != 0) {
                                    z13 = false;
                                    break;
                                }
                                rVar6.h();
                                i21--;
                            }
                            if (i24 != 0) {
                                i27 = iY4;
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                lVar2 = lVar6;
                                sb3.append(lVar2.f6257a);
                                sb3.append(": remainingSynchronizationSamples ");
                                sb3.append(i24);
                                sb3.append(", remainingSamplesAtTimestampDelta ");
                                sb3.append(i26);
                                sb3.append(", remainingSamplesInChunk ");
                                sb3.append(i815);
                                sb3.append(", remainingTimestampDeltaChanges ");
                                sb3.append(i25);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(i27);
                                if (z13) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                p114j1.k.f(sb3.toString());
                            } else {
                                i27 = iY4;
                                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                lVar2 = lVar6;
                                sb4.append(lVar2.f6257a);
                                sb4.append(": remainingSynchronizationSamples ");
                                sb4.append(i24);
                                sb4.append(", remainingSamplesAtTimestampDelta ");
                                sb4.append(i26);
                                sb4.append(", remainingSamplesInChunk ");
                                sb4.append(i815);
                                sb4.append(", remainingTimestampDeltaChanges ");
                                sb4.append(i25);
                                sb4.append(", remainingSamplesAtTimestampOffset ");
                                sb4.append(i27);
                                if (z13) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb4.append(str2);
                                p114j1.k.f(sb4.toString());
                            }
                            i28 = i19;
                            iArr = iArrCopyOf2;
                            jArr3 = jArrCopyOf;
                            j15 = j211;
                        } else {
                            jArrCopyOf = new long[iB];
                            iArrCopyOf = new int[iB];
                            jArrCopyOf2 = new long[iB];
                            int i816 = iY2;
                            iArrCopyOf2 = new int[iB];
                            l lVar7 = lVar4;
                            j13 = 0;
                            j14 = 0;
                            i18 = 0;
                            i19 = 0;
                            i20 = 0;
                            iH = 0;
                            iY4 = 0;
                            iY5 = i17;
                            i21 = iY;
                            i22 = iY9;
                            iH2 = iY10;
                            i23 = iY8;
                            i24 = i816;
                            while (true) {
                                if (i18 >= iB) {
                                    i25 = i23;
                                    i26 = i22;
                                    break;
                                }
                                zA = true;
                                while (i20 == 0) {
                                    zA = c0084a.a();
                                    if (!zA) {
                                        break;
                                        break;
                                    }
                                    int i817 = i23;
                                    long j212 = c0084a.f6127d;
                                    i20 = c0084a.f6126c;
                                    j14 = j212;
                                    i23 = i817;
                                    i22 = i22;
                                    iB = iB;
                                }
                                i29 = iB;
                                i25 = i23;
                                i26 = i22;
                                if (!zA) {
                                    p114j1.k.f("Unexpected end of chunk data");
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i18);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i18);
                                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i18);
                                    iB = i18;
                                    break;
                                }
                                if (rVar6 != null) {
                                    while (iY4 == 0) {
                                        iY4 = rVar6.y();
                                        iH = rVar6.h();
                                        i21--;
                                    }
                                    iY4--;
                                }
                                int i818 = iH;
                                jArrCopyOf[i18] = j14;
                                iC2 = hVar.c();
                                iArrCopyOf[i18] = iC2;
                                if (iC2 > i19) {
                                    i19 = iC2;
                                }
                                jArrCopyOf2[i18] = j13 + ((long) i818);
                                if (rVar5 == null) {
                                    i30 = 1;
                                } else {
                                    i30 = 0;
                                }
                                iArrCopyOf2[i18] = i30;
                                if (i18 == iY5) {
                                    iArrCopyOf2[i18] = 1;
                                    i24--;
                                    if (i24 > 0) {
                                        rVar5.getClass();
                                        iY5 = rVar5.y() - 1;
                                    }
                                }
                                int i819 = i19;
                                d dVar3 = hVar;
                                j13 += (long) iH2;
                                iY6 = i26 - 1;
                                if (iY6 != 0) {
                                }
                                int i8110 = iY6;
                                j14 += (long) iArrCopyOf[i18];
                                i20--;
                                i18++;
                                iH = i818;
                                hVar = dVar3;
                                i19 = i819;
                                i23 = i25;
                                i22 = i8110;
                                iB = i29;
                            }
                            int i8111 = i20;
                            long j213 = j13 + ((long) iH);
                            if (rVar6 == null) {
                                z13 = true;
                                break;
                            }
                            while (true) {
                                if (i21 <= 0) {
                                    z13 = true;
                                    break;
                                }
                                if (rVar6.y() != 0) {
                                    z13 = false;
                                    break;
                                }
                                rVar6.h();
                                i21--;
                            }
                            if (i24 != 0) {
                                i27 = iY4;
                                StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                lVar2 = lVar7;
                                sb5.append(lVar2.f6257a);
                                sb5.append(": remainingSynchronizationSamples ");
                                sb5.append(i24);
                                sb5.append(", remainingSamplesAtTimestampDelta ");
                                sb5.append(i26);
                                sb5.append(", remainingSamplesInChunk ");
                                sb5.append(i8111);
                                sb5.append(", remainingTimestampDeltaChanges ");
                                sb5.append(i25);
                                sb5.append(", remainingSamplesAtTimestampOffset ");
                                sb5.append(i27);
                                if (z13) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb5.append(str2);
                                p114j1.k.f(sb5.toString());
                            } else {
                                i27 = iY4;
                                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                lVar2 = lVar7;
                                sb6.append(lVar2.f6257a);
                                sb6.append(": remainingSynchronizationSamples ");
                                sb6.append(i24);
                                sb6.append(", remainingSamplesAtTimestampDelta ");
                                sb6.append(i26);
                                sb6.append(", remainingSamplesInChunk ");
                                sb6.append(i8111);
                                sb6.append(", remainingTimestampDeltaChanges ");
                                sb6.append(i25);
                                sb6.append(", remainingSamplesAtTimestampOffset ");
                                sb6.append(i27);
                                if (z13) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb6.append(str2);
                                p114j1.k.f(sb6.toString());
                            }
                            i28 = i19;
                            iArr = iArrCopyOf2;
                            jArr3 = jArrCopyOf;
                            j15 = j213;
                        }
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        jL3 = A.L(j15, 1000000L, lVar2.f6259c, roundingMode3);
                        j16 = lVar2.f6259c;
                        jArr4 = lVar2.f6265i;
                        if (jArr4 == null) {
                            A.K(jArrCopyOf2, j16);
                            oVar2 = new o(lVar2, jArr3, iArrCopyOf, i28, jArrCopyOf2, iArr, jL3);
                        } else {
                            length = jArr4.length;
                            i31 = lVar2.f6258b;
                            jArr5 = lVar2.j;
                            if (length == 1) {
                                j17 = j15;
                                i32 = i31;
                                iArr2 = iArr;
                                jArr6 = jArr4;
                                if (jArr6.length == 1) {
                                    i33 = 0;
                                    if (jArr6[0] == 0) {
                                        jArr5.getClass();
                                        j22 = jArr5[0];
                                        while (i55 < jArrCopyOf2.length) {
                                            jArrCopyOf2[i55] = A.L(jArrCopyOf2[i55] - j22, 1000000L, lVar2.f6259c, RoundingMode.DOWN);
                                        }
                                        oVar = new o(lVar2, jArr3, iArrCopyOf, i28, jArrCopyOf2, iArr2, A.L(j17 - j22, 1000000L, lVar2.f6259c, RoundingMode.DOWN));
                                    }
                                } else {
                                    i33 = 0;
                                }
                                i34 = i32;
                                if (i34 == 1) {
                                    i35 = 1;
                                } else {
                                    i35 = i33;
                                }
                                iArr3 = new int[jArr6.length];
                                iArr4 = new int[jArr6.length];
                                jArr5.getClass();
                                i36 = i33;
                                i37 = i36;
                                i38 = i37;
                                i39 = i38;
                                r10 = i35;
                                while (i36 < jArr6.length) {
                                    r11 = r10;
                                    j20 = jArr5[i36];
                                    if (j20 != -1) {
                                        long jL11 = A.L(jArr6[i36], lVar2.f6259c, lVar2.f6260d, RoundingMode.DOWN);
                                        i47 = 1;
                                        iArr3[i36] = A.d(jArrCopyOf2, j20, true);
                                        j21 = j20 + jL11;
                                        boolean z17 = r11 == true ? 1 : 0;
                                        iArr4[i36] = A.a(jArrCopyOf2, j21, z17);
                                        i48 = iArr3[i36];
                                        while (true) {
                                            i49 = iArr3[i36];
                                            if (i49 >= 0) {
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i36] = i49 - i47;
                                            i47 = 1;
                                        }
                                        if (i49 < 0) {
                                            iArr3[i36] = i48;
                                            while (true) {
                                                i54 = iArr3[i36];
                                                if (i54 < iArr4[i36]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i36] = i54 + 1;
                                            }
                                        }
                                        if (i34 == 2) {
                                            while (true) {
                                                i52 = iArr4[i36];
                                                if (i52 >= jArrCopyOf2.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i53 = i52 + 1;
                                                if (jArrCopyOf2[i53] > j21) {
                                                    break;
                                                    break;
                                                }
                                                iArr4[i36] = i53;
                                            }
                                        }
                                        int i820 = iArr4[i36];
                                        i50 = iArr3[i36];
                                        int i821 = (i820 - i50) + i38;
                                        if (i39 != i50) {
                                            i51 = 1;
                                        } else {
                                            i51 = 0;
                                        }
                                        i39 = i820;
                                        i37 = i51 | i37;
                                        i38 = i821;
                                        r12 = z17;
                                    } else {
                                        r12 = r11;
                                    }
                                    i36++;
                                    r10 = r12;
                                    jArr3 = jArr3;
                                    iArrCopyOf = iArrCopyOf;
                                    jArr6 = jArr6;
                                }
                                jArr7 = jArr3;
                                iArr5 = iArrCopyOf;
                                jArr8 = jArr6;
                                if (i38 != iB) {
                                    i40 = 1;
                                } else {
                                    i40 = 0;
                                }
                                i41 = i40 | i37;
                                if (i41 != 0) {
                                    jArr9 = new long[i38];
                                } else {
                                    jArr9 = jArr7;
                                }
                                if (i41 != 0) {
                                    iArr6 = new int[i38];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i41 != 0) {
                                    i28 = 0;
                                }
                                if (i41 != 0) {
                                    iArr7 = new int[i38];
                                } else {
                                    iArr7 = iArr2;
                                }
                                jArr10 = new long[i38];
                                j18 = 0;
                                i42 = i28;
                                i43 = 0;
                                z14 = false;
                                i44 = 0;
                                while (i43 < jArr8.length) {
                                    j19 = jArr5[i43];
                                    i45 = iArr3[i43];
                                    int[] iArr18 = iArr3;
                                    i46 = iArr4[i43];
                                    int[] iArr19 = iArr4;
                                    if (i41 != 0) {
                                        int i822 = i46 - i45;
                                        System.arraycopy(jArr7, i45, jArr9, i44, i822);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i45, iArr6, i44, i822);
                                        iArr9 = iArr2;
                                        System.arraycopy(iArr9, i45, iArr7, i44, i822);
                                    } else {
                                        iArr8 = iArr5;
                                        iArr9 = iArr2;
                                    }
                                    int i823 = i42;
                                    while (i45 < i46) {
                                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                                        int i92 = i43;
                                        int[] iArr110 = iArr8;
                                        long jL12 = A.L(j18, 1000000L, lVar2.f6260d, roundingMode4);
                                        long j32 = j18;
                                        jL4 = A.L(jArrCopyOf2[i45] - j19, 1000000L, lVar2.f6259c, roundingMode4);
                                        if (jL4 < 0) {
                                            z14 = true;
                                        }
                                        jArr10[i44] = jL12 + jL4;
                                        if (i41 == 0) {
                                        }
                                        i44++;
                                        i45++;
                                        i43 = i92;
                                        iArr8 = iArr110;
                                        j18 = j32;
                                    }
                                    int i93 = i43;
                                    int[] iArr111 = iArr8;
                                    j18 += jArr8[i93];
                                    i43 = i93 + 1;
                                    iArr2 = iArr9;
                                    i42 = i823;
                                    iArr3 = iArr18;
                                    jArr9 = jArr9;
                                    iArr4 = iArr19;
                                    z14 = z14;
                                    iArr5 = iArr111;
                                }
                                long[] jArr18 = jArr9;
                                z15 = z14;
                                long jL13 = A.L(j18, 1000000L, lVar2.f6260d, RoundingMode.DOWN);
                                if (z15) {
                                    g1.n.a aVarA3 = nVar2.a();
                                    aVarA3.f35344s = true;
                                    lVar3 = new l(lVar2.f6257a, lVar2.f6258b, lVar2.f6259c, lVar2.f6260d, lVar2.f6261e, lVar2.f6262f, new p078g1.n(aVarA3), lVar2.f6264h, lVar2.f6267l, lVar2.f6266k, lVar2.f6265i, lVar2.j);
                                } else {
                                    lVar3 = lVar2;
                                }
                                oVar2 = new o(lVar3, jArr18, iArr6, i42, jArr10, iArr7, jL13);
                            } else {
                                j17 = j15;
                                i32 = i31;
                                iArr2 = iArr;
                                jArr6 = jArr4;
                                if (jArr6.length == 1) {
                                    i33 = 0;
                                    if (jArr6[0] == 0) {
                                        jArr5.getClass();
                                        j22 = jArr5[0];
                                        while (i55 < jArrCopyOf2.length) {
                                            jArrCopyOf2[i55] = A.L(jArrCopyOf2[i55] - j22, 1000000L, lVar2.f6259c, RoundingMode.DOWN);
                                        }
                                        oVar = new o(lVar2, jArr3, iArrCopyOf, i28, jArrCopyOf2, iArr2, A.L(j17 - j22, 1000000L, lVar2.f6259c, RoundingMode.DOWN));
                                    }
                                } else {
                                    i33 = 0;
                                }
                                i34 = i32;
                                if (i34 == 1) {
                                    i35 = 1;
                                } else {
                                    i35 = i33;
                                }
                                iArr3 = new int[jArr6.length];
                                iArr4 = new int[jArr6.length];
                                jArr5.getClass();
                                i36 = i33;
                                i37 = i36;
                                i38 = i37;
                                i39 = i38;
                                r10 = i35;
                                while (i36 < jArr6.length) {
                                    r11 = r10;
                                    j20 = jArr5[i36];
                                    if (j20 != -1) {
                                        long jL14 = A.L(jArr6[i36], lVar2.f6259c, lVar2.f6260d, RoundingMode.DOWN);
                                        i47 = 1;
                                        iArr3[i36] = A.d(jArrCopyOf2, j20, true);
                                        j21 = j20 + jL14;
                                        boolean z18 = r11 == true ? 1 : 0;
                                        iArr4[i36] = A.a(jArrCopyOf2, j21, z18);
                                        i48 = iArr3[i36];
                                        while (true) {
                                            i49 = iArr3[i36];
                                            if (i49 >= 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr3[i36] = i49 - i47;
                                            i47 = 1;
                                        }
                                        if (i49 < 0) {
                                            iArr3[i36] = i48;
                                            while (true) {
                                                i54 = iArr3[i36];
                                                if (i54 < iArr4[i36]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr3[i36] = i54 + 1;
                                            }
                                        }
                                        if (i34 == 2) {
                                            while (true) {
                                                i52 = iArr4[i36];
                                                if (i52 >= jArrCopyOf2.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i53 = i52 + 1;
                                                if (jArrCopyOf2[i53] > j21) {
                                                    break;
                                                    break;
                                                }
                                                iArr4[i36] = i53;
                                            }
                                        }
                                        int i824 = iArr4[i36];
                                        i50 = iArr3[i36];
                                        int i825 = (i824 - i50) + i38;
                                        if (i39 != i50) {
                                            i51 = 1;
                                        } else {
                                            i51 = 0;
                                        }
                                        i39 = i824;
                                        i37 = i51 | i37;
                                        i38 = i825;
                                        r12 = z18;
                                    } else {
                                        r12 = r11;
                                    }
                                    i36++;
                                    r10 = r12;
                                    jArr3 = jArr3;
                                    iArrCopyOf = iArrCopyOf;
                                    jArr6 = jArr6;
                                }
                                jArr7 = jArr3;
                                iArr5 = iArrCopyOf;
                                jArr8 = jArr6;
                                if (i38 != iB) {
                                    i40 = 1;
                                } else {
                                    i40 = 0;
                                }
                                i41 = i40 | i37;
                                if (i41 != 0) {
                                    jArr9 = new long[i38];
                                } else {
                                    jArr9 = jArr7;
                                }
                                if (i41 != 0) {
                                    iArr6 = new int[i38];
                                } else {
                                    iArr6 = iArr5;
                                }
                                if (i41 != 0) {
                                    i28 = 0;
                                }
                                if (i41 != 0) {
                                    iArr7 = new int[i38];
                                } else {
                                    iArr7 = iArr2;
                                }
                                jArr10 = new long[i38];
                                j18 = 0;
                                i42 = i28;
                                i43 = 0;
                                z14 = false;
                                i44 = 0;
                                while (i43 < jArr8.length) {
                                    j19 = jArr5[i43];
                                    i45 = iArr3[i43];
                                    int[] iArr112 = iArr3;
                                    i46 = iArr4[i43];
                                    int[] iArr113 = iArr4;
                                    if (i41 != 0) {
                                        int i826 = i46 - i45;
                                        System.arraycopy(jArr7, i45, jArr9, i44, i826);
                                        iArr8 = iArr5;
                                        System.arraycopy(iArr8, i45, iArr6, i44, i826);
                                        iArr9 = iArr2;
                                        System.arraycopy(iArr9, i45, iArr7, i44, i826);
                                    } else {
                                        iArr8 = iArr5;
                                        iArr9 = iArr2;
                                    }
                                    int i827 = i42;
                                    while (i45 < i46) {
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        int i94 = i43;
                                        int[] iArr114 = iArr8;
                                        long jL15 = A.L(j18, 1000000L, lVar2.f6260d, roundingMode5);
                                        long j33 = j18;
                                        jL4 = A.L(jArrCopyOf2[i45] - j19, 1000000L, lVar2.f6259c, roundingMode5);
                                        if (jL4 < 0) {
                                            z14 = true;
                                        }
                                        jArr10[i44] = jL15 + jL4;
                                        if (i41 == 0) {
                                        }
                                        i44++;
                                        i45++;
                                        i43 = i94;
                                        iArr8 = iArr114;
                                        j18 = j33;
                                    }
                                    int i95 = i43;
                                    int[] iArr115 = iArr8;
                                    j18 += jArr8[i95];
                                    i43 = i95 + 1;
                                    iArr2 = iArr9;
                                    i42 = i827;
                                    iArr3 = iArr112;
                                    jArr9 = jArr9;
                                    iArr4 = iArr113;
                                    z14 = z14;
                                    iArr5 = iArr115;
                                }
                                long[] jArr19 = jArr9;
                                z15 = z14;
                                long jL16 = A.L(j18, 1000000L, lVar2.f6260d, RoundingMode.DOWN);
                                if (z15) {
                                    g1.n.a aVarA4 = nVar2.a();
                                    aVarA4.f35344s = true;
                                    lVar3 = new l(lVar2.f6257a, lVar2.f6258b, lVar2.f6259c, lVar2.f6260d, lVar2.f6261e, lVar2.f6262f, new p078g1.n(aVarA4), lVar2.f6264h, lVar2.f6267l, lVar2.f6266k, lVar2.f6265i, lVar2.j);
                                } else {
                                    lVar3 = lVar2;
                                }
                                oVar2 = new o(lVar3, jArr19, iArr6, i42, jArr10, iArr7, jL16);
                            }
                            oVar2 = oVar;
                        }
                    }
                    arrayList = arrayList2;
                    arrayList.add(oVar2);
                }
            }
            i56++;
            arrayList2 = arrayList;
            b11 = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:284:0x0661  */
    /* JADX WARN: Code duplicated, block: B:285:0x0663  */
    public static void h(r rVar, int i10, int i11, int i12, int i13, int i14, p078g1.k kVar, f fVar, int i15) throws ParserException {
        String str;
        int iG;
        int i16;
        int i17;
        List<byte[]> list;
        p078g1.k kVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int iG2;
        int i25;
        int i26;
        int i27;
        int iG3;
        p078g1.h hVar;
        int i28;
        int iG4;
        int i29;
        int i30;
        int i31;
        String str2;
        c cVar;
        int i32;
        int i33 = i11;
        int i34 = i12;
        p078g1.k kVarA = kVar;
        f fVar2 = fVar;
        rVar.G(i33 + 16);
        rVar.H(16);
        int iA = rVar.A();
        int iA2 = rVar.A();
        rVar.H(50);
        int i35 = rVar.f41063b;
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, m> pairE = e(rVar, i33, i34);
            if (pairE != null) {
                iIntValue = ((Integer) pairE.first).intValue();
                kVarA = kVarA == null ? null : kVarA.a(((m) pairE.second).f6269b);
                fVar2.f6141a[i15] = (m) pairE.second;
            }
            rVar.G(i35);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fY = 1.0f;
        k1.e.k kVar3 = null;
        ByteBuffer byteBufferOrder = null;
        List<byte[]> listM = null;
        String str5 = null;
        byte[] bArrCopyOfRange = null;
        int i36 = -1;
        int i37 = -1;
        int i38 = -1;
        int iF = -1;
        int i39 = -1;
        int i40 = -1;
        int i41 = 8;
        int i42 = 8;
        b bVar = null;
        boolean z10 = false;
        while (i35 - i33 < i34) {
            rVar.G(i35);
            int i43 = rVar.f41063b;
            int iH = rVar.h();
            if (iH == 0 && rVar.f41063b - i33 == i34) {
                break;
            }
            String str6 = "childAtomSize must be positive";
            s.a("childAtomSize must be positive", iH > 0);
            int iH2 = rVar.h();
            if (iH2 == 1635148611) {
                s.a(null, str4 == null);
                rVar.G(i43 + 8);
                C0569d c0569dA = C0569d.a(rVar);
                fVar2.f6143c = c0569dA.f475b;
                if (!z10) {
                    fY = c0569dA.f483k;
                }
                ArrayList arrayList = c0569dA.f474a;
                String str7 = c0569dA.f484l;
                int i44 = c0569dA.j;
                int i45 = c0569dA.f480g;
                int i46 = c0569dA.f481h;
                int i47 = c0569dA.f482i;
                int i48 = c0569dA.f478e;
                kVar2 = kVarA;
                i18 = iA;
                i19 = iA2;
                i20 = i35;
                str = str3;
                iF = i45;
                i39 = i46;
                i21 = i36;
                iG = i47;
                i17 = c0569dA.f479f;
                listM = arrayList;
                str5 = str7;
                i37 = i44;
                i16 = i48;
                str4 = "video/avc";
            } else {
                if (iH2 == 1752589123) {
                    s.a(null, str4 == null);
                    rVar.G(i43 + 8);
                    A1.A a10 = A1.A.a(rVar, false, null);
                    fVar2.f6143c = a10.f385b;
                    if (!z10) {
                        fY = a10.j;
                    }
                    int i49 = a10.f392i;
                    if (i49 != -1) {
                        i36 = i49;
                    }
                    List<byte[]> list2 = a10.f384a;
                    int i50 = a10.f393k;
                    int i51 = a10.f386c;
                    String str8 = a10.f394l;
                    listM = list2;
                    kVar2 = kVarA;
                    i18 = iA;
                    i19 = iA2;
                    i20 = i35;
                    str = str3;
                    iIntValue = iIntValue;
                    iF = a10.f389f;
                    i39 = a10.f390g;
                    i21 = i36;
                    iG = a10.f391h;
                    i16 = a10.f387d;
                    i17 = a10.f388e;
                    kVar3 = a10.f395m;
                    i37 = i50;
                    i38 = i51;
                    str5 = str8;
                    str4 = "video/hevc";
                } else if (iH2 == 1818785347) {
                    s.a("lhvC must follow hvcC atom", "video/hevc".equals(str4));
                    s.a("must have at least two layers", kVar3 != null && kVar3.f41439a.size() >= 2);
                    rVar.G(i43 + 8);
                    kVar3.getClass();
                    A1.A a11 = A1.A.a(rVar, true, kVar3);
                    s.a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", fVar2.f6143c == a11.f385b);
                    int i52 = a11.f389f;
                    int i53 = iF;
                    if (i52 != -1) {
                        s.a("colorSpace must be the same for both views", i53 == i52);
                    }
                    int i54 = a11.f390g;
                    int i55 = i39;
                    if (i54 != -1) {
                        s.a("colorRange must be the same for both views", i55 == i54);
                    }
                    int i56 = a11.f391h;
                    if (i56 != -1) {
                        i32 = i40;
                        s.a("colorTransfer must be the same for both views", i32 == i56);
                    } else {
                        i32 = i40;
                    }
                    i16 = i41;
                    int i57 = i32;
                    s.a("bitdepthLuma must be the same for both views", i16 == a11.f387d);
                    int i58 = i42;
                    s.a("bitdepthChroma must be the same for both views", i58 == a11.f388e);
                    List<byte[]> list3 = listM;
                    if (list3 == null) {
                        throw ParserException.a(null, "initializationData must be already set from hvcC atom");
                    }
                    ImmutableList.b bVar2 = ImmutableList.f27874c;
                    ImmutableList.a aVar = new ImmutableList.a();
                    aVar.f(list3);
                    aVar.f(a11.f384a);
                    listM = aVar.h();
                    kVar2 = kVarA;
                    i18 = iA;
                    i19 = iA2;
                    i20 = i35;
                    i39 = i55;
                    str = str3;
                    iIntValue = iIntValue;
                    iG = i57;
                    i21 = i36;
                    i17 = i58;
                    str4 = "video/mv-hevc";
                    str5 = a11.f394l;
                    iF = i53;
                    kVar3 = kVar3;
                } else {
                    str = str3;
                    List<byte[]> list4 = listM;
                    iF = iF;
                    i39 = i39;
                    iG = i40;
                    i16 = i41;
                    i17 = i42;
                    if (iH2 == 1986361461) {
                        rVar.G(i43 + 8);
                        int i59 = rVar.f41063b;
                        kVar2 = kVarA;
                        c cVar2 = null;
                        while (i59 - i43 < iH) {
                            rVar.G(i59);
                            int iH3 = rVar.h();
                            List<byte[]> list5 = list4;
                            s.a(str6, iH3 > 0);
                            int i60 = iA2;
                            if (rVar.h() == 1702454643) {
                                rVar.G(i59 + 8);
                                int i61 = rVar.f41063b;
                                while (true) {
                                    if (i61 - i59 >= iH3) {
                                        str2 = str6;
                                        cVar = null;
                                        break;
                                    }
                                    rVar.G(i61);
                                    int iH4 = rVar.h();
                                    s.a(str6, iH4 > 0);
                                    str2 = str6;
                                    if (rVar.h() == 1937011305) {
                                        rVar.H(4);
                                        int iU = rVar.u();
                                        cVar = new c(new e((iU & 1) == 1, (iU & 2) == 2, (iU & 8) == 8));
                                        break;
                                    }
                                    i61 += iH4;
                                    str6 = str2;
                                }
                                cVar2 = cVar;
                            } else {
                                iA = iA;
                                str2 = str6;
                                i35 = i35;
                            }
                            i59 += iH3;
                            list4 = list5;
                            iA2 = i60;
                            str6 = str2;
                            iA = iA;
                            i35 = i35;
                        }
                        list = list4;
                        i18 = iA;
                        i19 = iA2;
                        i20 = i35;
                        i iVar = cVar2 == null ? null : new i(cVar2);
                        if (iVar != null) {
                            e eVar = iVar.f6153a.f6137a;
                            if (kVar3 == null || kVar3.f41439a.size() < 2) {
                                i30 = i36;
                                i31 = i30 == -1 ? eVar.f6140c ? 5 : 4 : i30;
                            } else {
                                s.a("both eye views must be marked as available", eVar.f6138a && eVar.f6139b);
                                s.a("for MV-HEVC, eye_views_reversed must be set to false", !eVar.f6140c);
                                i30 = i36;
                            }
                        } else {
                            i30 = i36;
                        }
                        iIntValue = iIntValue;
                        i21 = i31;
                        i16 = i16;
                        i17 = i17;
                        kVar3 = kVar3;
                    } else {
                        list = list4;
                        kVar2 = kVarA;
                        i18 = iA;
                        i19 = iA2;
                        i20 = i35;
                        i21 = i36;
                        if (iH2 == 1685480259 || iH2 == 1685485123) {
                            kVar3 = kVar3;
                            iIntValue = iIntValue;
                            C0579n c0579nI = C0579n.i(rVar);
                            if (c0579nI != null) {
                                str5 = (String) c0579nI.f539a;
                                str4 = "video/dolby-vision";
                            }
                        } else if (iH2 == 1987076931) {
                            s.a(null, str4 == null);
                            String str9 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            rVar.G(i43 + 12);
                            byte bU = (byte) rVar.u();
                            byte bU2 = (byte) rVar.u();
                            int iU2 = rVar.u();
                            int i62 = iU2 >> 4;
                            byte b10 = (byte) ((iU2 >> 1) & 7);
                            if (str9.equals("video/x-vnd.on2.vp9")) {
                                byte[] bArr = p114j1.d.f41012a;
                                listM = ImmutableList.M(new byte[]{1, 1, bU, 2, 1, bU2, 3, 1, (byte) i62, 4, 1, b10});
                            } else {
                                listM = list;
                            }
                            boolean z11 = (iU2 & 1) != 0;
                            int iU3 = rVar.u();
                            int iU4 = rVar.u();
                            iF = p078g1.h.f(iU3);
                            str4 = str9;
                            i39 = z11 ? 1 : 2;
                            iG = p078g1.h.g(iU4);
                            i16 = i62;
                            i17 = i16;
                        } else if (iH2 == 1635135811) {
                            int i63 = iH - 8;
                            byte[] bArr2 = new byte[i63];
                            rVar.f(bArr2, 0, i63);
                            listM = ImmutableList.M(bArr2);
                            rVar.G(i43 + 8);
                            byte[] bArr3 = rVar.f41062a;
                            q qVar = new q(bArr3.length, bArr3);
                            qVar.m(rVar.f41063b * 8);
                            qVar.p(1);
                            int iG5 = qVar.g(3);
                            qVar.o(6);
                            boolean zF = qVar.f();
                            boolean zF2 = qVar.f();
                            if (iG5 == 2 && zF) {
                                i22 = zF2 ? 12 : 10;
                                i23 = zF2 ? 12 : 10;
                            } else if (iG5 <= 2) {
                                int i64 = zF ? 10 : 8;
                                i23 = zF ? 10 : 8;
                                i22 = i64;
                            } else {
                                i22 = -1;
                                i23 = -1;
                            }
                            qVar.o(13);
                            qVar.n();
                            int iG6 = qVar.g(4);
                            if (iG6 != 1) {
                                p114j1.k.e("Unsupported obu_type: " + iG6);
                                hVar = new p078g1.h(-1, -1, -1, i22, i23, null);
                            } else if (qVar.f()) {
                                p114j1.k.e("Unsupported obu_extension_flag");
                                hVar = new p078g1.h(-1, -1, -1, i22, i23, null);
                            } else {
                                boolean zF3 = qVar.f();
                                qVar.n();
                                if (!zF3 || qVar.g(8) <= 127) {
                                    int iG7 = qVar.g(3);
                                    qVar.n();
                                    if (qVar.f()) {
                                        p114j1.k.e("Unsupported reduced_still_picture_header");
                                        hVar = new p078g1.h(-1, -1, -1, i22, i23, null);
                                    } else if (qVar.f()) {
                                        p114j1.k.e("Unsupported timing_info_present_flag");
                                        hVar = new p078g1.h(-1, -1, -1, i22, i23, null);
                                    } else {
                                        if (qVar.f()) {
                                            p114j1.k.e("Unsupported initial_display_delay_present_flag");
                                            hVar = new p078g1.h(-1, -1, -1, i22, i23, null);
                                        } else {
                                            int iG8 = qVar.g(5);
                                            for (int i65 = 0; i65 <= iG8; i65++) {
                                                qVar.o(12);
                                                if (qVar.g(5) > 7) {
                                                    qVar.n();
                                                }
                                            }
                                            int iG9 = qVar.g(4);
                                            int iG10 = qVar.g(4);
                                            qVar.o(iG9 + 1);
                                            qVar.o(iG10 + 1);
                                            if (qVar.f()) {
                                                qVar.o(7);
                                            }
                                            qVar.o(7);
                                            boolean zF4 = qVar.f();
                                            if (zF4) {
                                                qVar.o(2);
                                            }
                                            if (qVar.f()) {
                                                i24 = 1;
                                                iG2 = 2;
                                            } else {
                                                i24 = 1;
                                                iG2 = qVar.g(1);
                                            }
                                            if (iG2 > 0 && !qVar.f()) {
                                                qVar.o(i24);
                                            }
                                            if (zF4) {
                                                i25 = 3;
                                                qVar.o(3);
                                            } else {
                                                i25 = 3;
                                            }
                                            qVar.o(i25);
                                            boolean zF5 = qVar.f();
                                            if (iG7 == 2 && zF5) {
                                                qVar.n();
                                            }
                                            boolean z12 = iG7 != 1 && qVar.f();
                                            if (qVar.f()) {
                                                int iG11 = qVar.g(8);
                                                int iG12 = qVar.g(8);
                                                int iG13 = qVar.g(8);
                                                if (z12) {
                                                    i28 = 1;
                                                } else {
                                                    i28 = 1;
                                                    if (iG11 == 1 && iG12 == 13 && iG13 == 0) {
                                                        iG4 = 1;
                                                    }
                                                    int iF2 = p078g1.h.f(iG11);
                                                    if (iG4 == i28) {
                                                        i29 = 1;
                                                    } else {
                                                        i29 = 2;
                                                    }
                                                    i27 = i29;
                                                    iG3 = p078g1.h.g(iG12);
                                                    i26 = iF2;
                                                }
                                                iG4 = qVar.g(i28);
                                                int iF3 = p078g1.h.f(iG11);
                                                if (iG4 == i28) {
                                                    i29 = 1;
                                                } else {
                                                    i29 = 2;
                                                }
                                                i27 = i29;
                                                iG3 = p078g1.h.g(iG12);
                                                i26 = iF3;
                                            } else {
                                                i26 = -1;
                                                i27 = -1;
                                                iG3 = -1;
                                            }
                                            hVar = new p078g1.h(i26, i27, iG3, i22, i23, null);
                                        }
                                        int i66 = hVar.f35258e;
                                        int i67 = hVar.f35259f;
                                        int i68 = hVar.f35254a;
                                        int i69 = hVar.f35255b;
                                        iG = hVar.f35256c;
                                        i16 = i66;
                                        iF = i68;
                                        i39 = i69;
                                        kVar3 = kVar3;
                                        iIntValue = iIntValue;
                                        str4 = "video/av01";
                                        i17 = i67;
                                    }
                                } else {
                                    p114j1.k.e("Excessive obu_size");
                                    hVar = new p078g1.h(-1, -1, -1, i22, i23, null);
                                }
                            }
                            int i610 = hVar.f35258e;
                            int i611 = hVar.f35259f;
                            int i612 = hVar.f35254a;
                            int i613 = hVar.f35255b;
                            iG = hVar.f35256c;
                            i16 = i610;
                            iF = i612;
                            i39 = i613;
                            kVar3 = kVar3;
                            iIntValue = iIntValue;
                            str4 = "video/av01";
                            i17 = i611;
                        } else if (iH2 == 1668050025) {
                            if (byteBufferOrder == null) {
                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                            }
                            ByteBuffer byteBuffer = byteBufferOrder;
                            byteBuffer.position(21);
                            byteBuffer.putShort(rVar.r());
                            byteBuffer.putShort(rVar.r());
                            byteBufferOrder = byteBuffer;
                        } else if (iH2 == 1835295606) {
                            if (byteBufferOrder == null) {
                                byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                            }
                            ByteBuffer byteBuffer2 = byteBufferOrder;
                            short sR = rVar.r();
                            short sR2 = rVar.r();
                            short sR3 = rVar.r();
                            short sR4 = rVar.r();
                            short sR5 = rVar.r();
                            short sR6 = rVar.r();
                            short sR7 = rVar.r();
                            short sR8 = rVar.r();
                            long jW = rVar.w();
                            long jW2 = rVar.w();
                            byteBuffer2.position(1);
                            byteBuffer2.putShort(sR5);
                            byteBuffer2.putShort(sR6);
                            byteBuffer2.putShort(sR);
                            byteBuffer2.putShort(sR2);
                            byteBuffer2.putShort(sR3);
                            byteBuffer2.putShort(sR4);
                            byteBuffer2.putShort(sR7);
                            byteBuffer2.putShort(sR8);
                            byteBuffer2.putShort((short) (jW / 10000));
                            byteBuffer2.putShort((short) (jW2 / 10000));
                            byteBufferOrder = byteBuffer2;
                        } else {
                            kVar3 = kVar3;
                            iIntValue = iIntValue;
                            if (iH2 == 1681012275) {
                                s.a(null, str4 == null);
                                str4 = str;
                            } else if (iH2 == 1702061171) {
                                s.a(null, str4 == null);
                                b bVarA = a(i43, rVar);
                                byte[] bArr4 = bVarA.f6134b;
                                List<byte[]> listM2 = bArr4 != null ? ImmutableList.M(bArr4) : list;
                                bVar = bVarA;
                                str4 = bVarA.f6133a;
                                i16 = i16;
                                i17 = i17;
                                iF = iF;
                                i39 = i39;
                                listM = listM2;
                            } else if (iH2 == 1885434736) {
                                rVar.G(i43 + 8);
                                fY = rVar.y() / rVar.y();
                                i16 = i16;
                                i17 = i17;
                                z10 = true;
                            } else if (iH2 == 1937126244) {
                                int i70 = i43 + 8;
                                while (true) {
                                    if (i70 - i43 >= iH) {
                                        bArrCopyOfRange = null;
                                        break;
                                    }
                                    rVar.G(i70);
                                    int iH5 = rVar.h();
                                    if (rVar.h() == 1886547818) {
                                        bArrCopyOfRange = Arrays.copyOfRange(rVar.f41062a, i70, iH5 + i70);
                                        break;
                                    }
                                    i70 += iH5;
                                }
                            } else if (iH2 == 1936995172) {
                                int iU5 = rVar.u();
                                rVar.H(3);
                                if (iU5 == 0) {
                                    int iU6 = rVar.u();
                                    if (iU6 == 0) {
                                        i21 = 0;
                                    } else if (iU6 == 1) {
                                        i21 = 1;
                                    } else if (iU6 == 2) {
                                        i21 = 2;
                                    } else if (iU6 == 3) {
                                        i21 = 3;
                                    }
                                }
                                i16 = i16;
                                i17 = i17;
                            } else if (iH2 == 1634760259) {
                                int i71 = iH - 12;
                                byte[] bArr5 = new byte[i71];
                                rVar.G(i43 + 12);
                                rVar.f(bArr5, 0, i71);
                                listM = ImmutableList.M(bArr5);
                                r rVar2 = new r(bArr5);
                                q qVar2 = new q(i71, bArr5);
                                qVar2.m(rVar2.f41063b * 8);
                                int i72 = 1;
                                qVar2.p(1);
                                int iG14 = qVar2.g(8);
                                int i73 = 0;
                                iG = -1;
                                int i74 = -1;
                                i17 = -1;
                                iF = -1;
                                i39 = -1;
                                while (i73 < iG14) {
                                    qVar2.p(i72);
                                    int iG15 = qVar2.g(8);
                                    int i75 = i17;
                                    int i76 = i74;
                                    int iG16 = iG;
                                    int i77 = 0;
                                    while (i77 < iG15) {
                                        qVar2.o(6);
                                        boolean zF6 = qVar2.f();
                                        qVar2.n();
                                        qVar2.p(11);
                                        qVar2.o(4);
                                        int iG17 = qVar2.g(4) + 8;
                                        qVar2.p(1);
                                        if (zF6) {
                                            int iG18 = qVar2.g(8);
                                            int iG19 = qVar2.g(8);
                                            qVar2.p(1);
                                            boolean zF7 = qVar2.f();
                                            int iF4 = p078g1.h.f(iG18);
                                            int i78 = zF7 ? 1 : 2;
                                            iF = iF4;
                                            iG16 = p078g1.h.g(iG19);
                                            i39 = i78;
                                        }
                                        i77++;
                                        i76 = iG17;
                                        i75 = i76;
                                    }
                                    i73++;
                                    i72 = 1;
                                    iG = iG16;
                                    i74 = i76;
                                    i17 = i75;
                                }
                                str4 = "video/apv";
                                i16 = i74;
                            } else if (iH2 == 1668246642 && iF == -1 && iG == -1) {
                                int iH6 = rVar.h();
                                if (iH6 == 1852009592 || iH6 == 1852009571) {
                                    int iA3 = rVar.A();
                                    int iA4 = rVar.A();
                                    rVar.H(2);
                                    boolean z13 = iH == 19 && (rVar.u() & 128) != 0;
                                    listM = list;
                                    i16 = i16;
                                    i17 = i17;
                                    iF = p078g1.h.f(iA3);
                                    i39 = z13 ? 1 : 2;
                                    iG = p078g1.h.g(iA4);
                                } else {
                                    p114j1.k.f("Unsupported color type: " + p127k1.b.a(iH6));
                                }
                            }
                        }
                        i16 = i16;
                        i17 = i17;
                    }
                    listM = list;
                }
                i35 = i20 + iH;
                i33 = i11;
                i34 = i12;
                fVar2 = fVar;
                kVar3 = kVar3;
                iA2 = i19;
                iA = i18;
                i36 = i21;
                i41 = i16;
                kVarA = kVar2;
                i40 = iG;
                str3 = str;
                int i79 = iIntValue;
                i42 = i17;
                iIntValue = i79;
            }
            i35 = i20 + iH;
            i33 = i11;
            i34 = i12;
            fVar2 = fVar;
            kVar3 = kVar3;
            iA2 = i19;
            iA = i18;
            i36 = i21;
            i41 = i16;
            kVarA = kVar2;
            i40 = iG;
            str3 = str;
            int i710 = iIntValue;
            i42 = i17;
            iIntValue = i710;
        }
        int i80 = iA;
        List<byte[]> list6 = listM;
        int i81 = iF;
        int i82 = i39;
        int i83 = i40;
        int i84 = i41;
        int i85 = i42;
        p078g1.k kVar4 = kVarA;
        int i86 = iA2;
        int i87 = i36;
        if (str4 == null) {
            return;
        }
        g1.n.a aVar2 = new g1.n.a();
        aVar2.f35327a = Integer.toString(i13);
        aVar2.f35338m = t.m(str4);
        aVar2.j = str5;
        aVar2.f35345t = i80;
        aVar2.f35346u = i86;
        aVar2.f35349x = fY;
        aVar2.f35348w = i14;
        aVar2.f35350y = bArrCopyOfRange;
        aVar2.f35351z = i87;
        aVar2.f35341p = list6;
        aVar2.f35340o = i37;
        aVar2.f35316B = i38;
        aVar2.f35342q = kVar4;
        aVar2.f35315A = new p078g1.h(i81, i82, i83, i84, i85, byteBufferOrder != null ? byteBufferOrder.array() : null);
        b bVar3 = bVar;
        if (bVar3 != null) {
            aVar2.f35334h = Ints.k0(bVar3.f6135c);
            aVar2.f35335i = Ints.k0(bVar3.f6136d);
        }
        fVar.f6142b = new p078g1.n(aVar2);
    }
}
