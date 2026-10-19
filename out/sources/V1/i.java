package V1;

import A1.M;
import A1.N;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p078g1.n;
import p078g1.s;
import p078g1.t;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f6714n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N.c f6717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public N.a f6718r;

    /* JADX INFO: compiled from: VorbisReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final N.c f6719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final N.a f6720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f6721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final N.b[] f6722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6723e;

        public a(N.c cVar, N.a aVar, byte[] bArr, N.b[] bVarArr, int i10) {
            this.f6719a = cVar;
            this.f6720b = aVar;
            this.f6721c = bArr;
            this.f6722d = bVarArr;
            this.f6723e = i10;
        }
    }

    @Override // V1.h
    public final void a(long j) {
        this.f6706g = j;
        this.f6716p = j != 0;
        N.c cVar = this.f6717q;
        this.f6715o = cVar != null ? cVar.f450e : 0;
    }

    @Override // V1.h
    public final long b(r rVar) {
        byte b10 = rVar.f41062a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        a aVar = this.f6714n;
        p241t7.b.l(aVar);
        boolean z10 = aVar.f6722d[(b10 >> 1) & (255 >>> (8 - aVar.f6723e))].f445a;
        N.c cVar = aVar.f6719a;
        int i10 = !z10 ? cVar.f450e : cVar.f451f;
        long j = this.f6716p ? (this.f6715o + i10) / 4 : 0;
        byte[] bArr = rVar.f41062a;
        int length = bArr.length;
        int i11 = rVar.f41064c + 4;
        if (length < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
            rVar.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            rVar.F(i11);
        }
        byte[] bArr2 = rVar.f41062a;
        int i12 = rVar.f41064c;
        bArr2[i12 - 4] = (byte) (j & 255);
        bArr2[i12 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j >>> 24) & 255);
        this.f6716p = true;
        this.f6715o = i10;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0363 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:154:0x0364  */
    @Override // V1.h
    public final boolean c(r rVar, long j, h.a aVar) throws IOException {
        a aVar2;
        if (this.f6714n != null) {
            aVar.f6712a.getClass();
            return false;
        }
        N.c cVar = this.f6717q;
        int i10 = 4;
        if (cVar != null) {
            N.a aVar3 = this.f6718r;
            if (aVar3 == null) {
                this.f6718r = N.c(rVar, true, true);
            } else {
                int i11 = rVar.f41064c;
                byte[] bArr = new byte[i11];
                System.arraycopy(rVar.f41062a, 0, bArr, 0, i11);
                int i12 = 5;
                N.d(5, rVar, false);
                int iU = rVar.u() + 1;
                M m7 = new M(rVar.f41062a);
                m7.c(rVar.f41063b * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 16;
                    if (i13 >= iU) {
                        int i15 = 6;
                        int iB = m7.b(6) + 1;
                        for (int i16 = 0; i16 < iB; i16++) {
                            if (m7.b(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iB2 = m7.b(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 >= iB2) {
                                int iB3 = m7.b(i15) + 1;
                                int i19 = 0;
                                while (i19 < iB3) {
                                    if (m7.b(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    m7.c(24);
                                    m7.c(24);
                                    m7.c(24);
                                    int iB4 = m7.b(i15) + 1;
                                    int i20 = 8;
                                    m7.c(8);
                                    int[] iArr = new int[iB4];
                                    for (int i21 = 0; i21 < iB4; i21++) {
                                        iArr[i21] = ((m7.a() ? m7.b(5) : 0) * 8) + m7.b(3);
                                    }
                                    int i22 = 0;
                                    while (i22 < iB4) {
                                        int i23 = 0;
                                        while (i23 < i20) {
                                            if ((iArr[i22] & (1 << i23)) != 0) {
                                                m7.c(i20);
                                            }
                                            i23++;
                                            i20 = 8;
                                        }
                                        i22++;
                                        i20 = 8;
                                    }
                                    i19++;
                                    i15 = 6;
                                }
                                int iB5 = m7.b(i15) + 1;
                                for (int i24 = 0; i24 < iB5; i24++) {
                                    int iB6 = m7.b(16);
                                    if (iB6 != 0) {
                                        k.c("VorbisUtil", "mapping type other than 0 not supported: " + iB6);
                                    } else {
                                        int iB7 = m7.a() ? m7.b(4) + 1 : 1;
                                        boolean zA = m7.a();
                                        int i25 = cVar.f446a;
                                        if (zA) {
                                            int iB8 = m7.b(8) + 1;
                                            for (int i26 = 0; i26 < iB8; i26++) {
                                                int i27 = i25 - 1;
                                                m7.c(N.a(i27));
                                                m7.c(N.a(i27));
                                            }
                                        }
                                        if (m7.b(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iB7 > 1) {
                                            for (int i28 = 0; i28 < i25; i28++) {
                                                m7.c(4);
                                            }
                                        }
                                        for (int i29 = 0; i29 < iB7; i29++) {
                                            m7.c(8);
                                            m7.c(8);
                                            m7.c(8);
                                        }
                                    }
                                }
                                int iB9 = m7.b(6);
                                int i30 = iB9 + 1;
                                N.b[] bVarArr = new N.b[i30];
                                for (int i31 = 0; i31 < i30; i31++) {
                                    boolean zA2 = m7.a();
                                    m7.b(16);
                                    m7.b(16);
                                    m7.b(8);
                                    bVarArr[i31] = new N.b(zA2);
                                }
                                if (!m7.a()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                aVar2 = new a(cVar, aVar3, bArr, bVarArr, N.a(iB9));
                                break;
                            }
                            int iB10 = m7.b(i14);
                            if (iB10 == 0) {
                                int i32 = 8;
                                m7.c(8);
                                m7.c(16);
                                m7.c(16);
                                m7.c(6);
                                m7.c(8);
                                int iB11 = m7.b(4) + 1;
                                int i33 = 0;
                                while (i33 < iB11) {
                                    m7.c(i32);
                                    i33++;
                                    i32 = 8;
                                }
                            } else {
                                if (iB10 != 1) {
                                    throw ParserException.a(null, "floor type greater than 1 not decodable: " + iB10);
                                }
                                int iB12 = m7.b(i12);
                                int[] iArr2 = new int[iB12];
                                int i34 = -1;
                                for (int i35 = 0; i35 < iB12; i35++) {
                                    int iB13 = m7.b(i10);
                                    iArr2[i35] = iB13;
                                    if (iB13 > i34) {
                                        i34 = iB13;
                                    }
                                }
                                int i36 = i34 + 1;
                                int[] iArr3 = new int[i36];
                                int i37 = 0;
                                while (i37 < i36) {
                                    iArr3[i37] = m7.b(i18) + 1;
                                    int iB14 = m7.b(2);
                                    int i38 = 8;
                                    if (iB14 > 0) {
                                        m7.c(8);
                                    }
                                    int i39 = i36;
                                    int i40 = 0;
                                    while (i40 < (1 << iB14)) {
                                        m7.c(i38);
                                        i40++;
                                        i38 = 8;
                                    }
                                    i37++;
                                    i36 = i39;
                                    i18 = 3;
                                }
                                m7.c(2);
                                int iB15 = m7.b(4);
                                int i41 = 0;
                                int i42 = 0;
                                for (int i43 = 0; i43 < iB12; i43++) {
                                    i41 += iArr3[iArr2[i43]];
                                    while (i42 < i41) {
                                        m7.c(iB15);
                                        i42++;
                                    }
                                }
                            }
                            i17++;
                            i15 = 6;
                            i10 = 4;
                            i14 = 16;
                            i12 = 5;
                        }
                    } else {
                        if (m7.b(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((m7.f442c * 8) + m7.f443d));
                        }
                        int iB16 = m7.b(16);
                        int iB17 = m7.b(24);
                        if (m7.a()) {
                            m7.c(5);
                            for (int iB18 = 0; iB18 < iB17; iB18 += m7.b(N.a(iB17 - iB18))) {
                            }
                        } else {
                            boolean zA3 = m7.a();
                            for (int i44 = 0; i44 < iB17; i44++) {
                                if (!zA3) {
                                    m7.c(5);
                                } else if (m7.a()) {
                                    m7.c(5);
                                }
                            }
                        }
                        int iB19 = m7.b(4);
                        if (iB19 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + iB19);
                        }
                        if (iB19 == 1 || iB19 == 2) {
                            m7.c(32);
                            m7.c(32);
                            int iB20 = m7.b(4) + 1;
                            m7.c(1);
                            m7.c((int) ((iB19 == 1 ? iB16 != 0 ? (long) Math.floor(Math.pow(iB17, 1.0d / ((double) iB16))) : 0L : ((long) iB16) * ((long) iB17)) * ((long) iB20)));
                        }
                        i13++;
                    }
                }
            }
            this.f6714n = aVar2;
            if (aVar2 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            N.c cVar2 = aVar2.f6719a;
            arrayList.add(cVar2.f452g);
            arrayList.add(aVar2.f6721c);
            s sVarB = N.b(ImmutableList.I(aVar2.f6720b.f444a));
            n.a aVar4 = new n.a();
            aVar4.f35337l = t.m("audio/ogg");
            aVar4.f35338m = t.m("audio/vorbis");
            aVar4.f35334h = cVar2.f449d;
            aVar4.f35335i = cVar2.f448c;
            aVar4.f35317C = cVar2.f446a;
            aVar4.f35318D = cVar2.f447b;
            aVar4.f35341p = arrayList;
            aVar4.f35336k = sVarB;
            aVar.f6712a = new n(aVar4);
            return true;
        }
        N.d(1, rVar, false);
        rVar.m();
        int iU2 = rVar.u();
        int iM = rVar.m();
        int iJ = rVar.j();
        int i45 = iJ <= 0 ? -1 : iJ;
        int iJ2 = rVar.j();
        int i46 = iJ2 <= 0 ? -1 : iJ2;
        rVar.j();
        int iU3 = rVar.u();
        int iPow = (int) Math.pow(2.0d, iU3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iU3 & 240) >> 4);
        rVar.u();
        this.f6717q = new N.c(iU2, iM, i45, i46, iPow, iPow2, Arrays.copyOf(rVar.f41062a, rVar.f41064c));
        aVar2 = null;
        this.f6714n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        N.c cVar3 = aVar2.f6719a;
        arrayList2.add(cVar3.f452g);
        arrayList2.add(aVar2.f6721c);
        s sVarB2 = N.b(ImmutableList.I(aVar2.f6720b.f444a));
        n.a aVar5 = new n.a();
        aVar5.f35337l = t.m("audio/ogg");
        aVar5.f35338m = t.m("audio/vorbis");
        aVar5.f35334h = cVar3.f449d;
        aVar5.f35335i = cVar3.f448c;
        aVar5.f35317C = cVar3.f446a;
        aVar5.f35318D = cVar3.f447b;
        aVar5.f35341p = arrayList2;
        aVar5.f35336k = sVarB2;
        aVar.f6712a = new n(aVar5);
        return true;
    }

    @Override // V1.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f6714n = null;
            this.f6717q = null;
            this.f6718r = null;
        }
        this.f6715o = 0;
        this.f6716p = false;
    }
}
