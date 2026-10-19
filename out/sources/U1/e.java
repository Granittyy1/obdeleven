package U1;

import com.google.common.collect.ImmutableList;
import p078g1.s;
import p114j1.r;

/* JADX INFO: compiled from: MetadataUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static p127k1.a a(s sVar, String str) {
        int i10 = 0;
        while (true) {
            s.a[] aVarArr = sVar.f35445a;
            if (i10 >= aVarArr.length) {
                return null;
            }
            s.a aVar = aVarArr[i10];
            if (aVar instanceof p127k1.a) {
                p127k1.a aVar2 = (p127k1.a) aVar;
                if (aVar2.f41385a.equals(str)) {
                    return aVar2;
                }
            }
            i10++;
        }
    }

    public static O1.a b(r rVar) {
        String str;
        int iH = rVar.h();
        if (rVar.h() != 1684108385) {
            p114j1.k.f("Failed to parse cover art attribute");
            return null;
        }
        int iH2 = rVar.h();
        byte[] bArr = a.f6123a;
        int i10 = iH2 & 16777215;
        if (i10 == 13) {
            str = "image/jpeg";
        } else {
            str = i10 == 14 ? "image/png" : null;
        }
        if (str == null) {
            com.google.gson.internal.b.e(i10, "Unrecognized cover art flags: ");
            return null;
        }
        rVar.H(4);
        int i11 = iH - 16;
        byte[] bArr2 = new byte[i11];
        rVar.f(bArr2, 0, i11);
        return new O1.a(str, null, 3, bArr2);
    }

    public static O1.m c(int i10, r rVar, String str) {
        int iH = rVar.h();
        if (rVar.h() == 1684108385 && iH >= 22) {
            rVar.H(10);
            int iA = rVar.A();
            if (iA > 0) {
                String strB = J4.i.b(iA, "");
                int iA2 = rVar.A();
                if (iA2 > 0) {
                    strB = strB + "/" + iA2;
                }
                return new O1.m(str, null, ImmutableList.M(strB));
            }
        }
        p114j1.k.f("Failed to parse index/count attribute: " + p127k1.b.a(i10));
        return null;
    }

    public static int d(r rVar) {
        int iH = rVar.h();
        if (rVar.h() == 1684108385) {
            rVar.H(8);
            int i10 = iH - 16;
            if (i10 == 1) {
                return rVar.u();
            }
            if (i10 == 2) {
                return rVar.A();
            }
            if (i10 == 3) {
                return rVar.x();
            }
            if (i10 == 4 && (rVar.f41062a[rVar.f41063b] & 128) == 0) {
                return rVar.y();
            }
        }
        p114j1.k.f("Failed to parse data atom to int");
        return -1;
    }

    public static O1.h e(int i10, String str, r rVar, boolean z10, boolean z11) {
        int iD = d(rVar);
        if (z11) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            return z10 ? new O1.m(str, null, ImmutableList.M(Integer.toString(iD))) : new O1.e("und", str, Integer.toString(iD));
        }
        p114j1.k.f("Failed to parse uint8 attribute: " + p127k1.b.a(i10));
        return null;
    }

    public static O1.m f(int i10, r rVar, String str) {
        int iH = rVar.h();
        if (rVar.h() == 1684108385) {
            rVar.H(8);
            return new O1.m(str, null, ImmutableList.M(rVar.q(iH - 16)));
        }
        p114j1.k.f("Failed to parse text attribute: " + p127k1.b.a(i10));
        return null;
    }
}
