package A1;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HevcConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f392i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k1.e.k f395m;

    public A(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, String str, k1.e.k kVar) {
        this.f384a = list;
        this.f385b = i10;
        this.f386c = i11;
        this.f387d = i12;
        this.f388e = i13;
        this.f389f = i14;
        this.f390g = i15;
        this.f391h = i16;
        this.f392i = i17;
        this.j = f10;
        this.f393k = i18;
        this.f394l = str;
        this.f395m = kVar;
    }

    public static A a(p114j1.r rVar, boolean z10, k1.e.k kVar) throws ParserException {
        k1.e.g gVarG;
        int i10 = 4;
        try {
            if (z10) {
                rVar.H(4);
            } else {
                rVar.H(21);
            }
            int iU = rVar.u() & 3;
            int iU2 = rVar.u();
            int iC = rVar.c();
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iU2; i13++) {
                rVar.H(1);
                int iA = rVar.A();
                for (int i14 = 0; i14 < iA; i14++) {
                    int iA2 = rVar.A();
                    i12 += iA2 + 4;
                    rVar.H(iA2);
                }
            }
            rVar.G(iC);
            byte[] bArr = new byte[i12];
            k1.e.k kVar2 = kVar;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            float f10 = 1.0f;
            String strA = null;
            int i23 = 0;
            int i24 = 0;
            while (i23 < iU2) {
                int iU3 = rVar.u() & 63;
                int iA3 = rVar.A();
                int i25 = i11;
                k1.e.k kVarI = kVar2;
                while (i25 < iA3) {
                    int iA4 = rVar.A();
                    int i26 = iU2;
                    System.arraycopy(p127k1.e.f41399a, i11, bArr, i24, i10);
                    int i27 = i24 + 4;
                    System.arraycopy(rVar.f41062a, rVar.c(), bArr, i27, iA4);
                    if (iU3 == 32 && i25 == 0) {
                        kVarI = p127k1.e.i(bArr, i27, i27 + iA4);
                        iA3 = iA3;
                    } else if (iU3 == 33 && i25 == 0) {
                        k1.e.h hVarH = p127k1.e.h(bArr, i27, i27 + iA4, kVarI);
                        int i28 = hVarH.f41424a + 1;
                        int i29 = hVarH.f41426c + 8;
                        i17 = hVarH.f41427d + 8;
                        int i30 = hVarH.f41432i;
                        int i31 = hVarH.j;
                        int i32 = hVarH.f41433k;
                        float f11 = hVarH.f41430g;
                        int i33 = hVarH.f41431h;
                        k1.e.c cVar = hVarH.f41425b;
                        if (cVar != null) {
                            strA = p114j1.d.a(cVar.f41408a, cVar.f41409b, cVar.f41410c, cVar.f41411d, cVar.f41412e, cVar.f41413f);
                        }
                        i15 = i28;
                        i16 = i29;
                        i11 = 0;
                        i20 = i32;
                        i18 = i30;
                        i22 = i33;
                        f10 = f11;
                        i19 = i31;
                    } else {
                        iA3 = iA3;
                        if (iU3 != 39 || i25 != 0 || (gVarG = p127k1.e.g(bArr, i27, i27 + iA4)) == null || kVarI == null) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            i21 = gVarG.f41423a == kVarI.f41439a.get(0).f41404b ? 4 : 5;
                        }
                    }
                    i24 = i27 + iA4;
                    rVar.H(iA4);
                    i25++;
                    iU2 = i26;
                    iA3 = iA3;
                    i10 = 4;
                }
                i23++;
                kVar2 = kVarI;
                i10 = 4;
            }
            return new A(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iU + 1, i15, i16, i17, i18, i19, i20, i21, f10, i22, strA, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a(e10, "Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
