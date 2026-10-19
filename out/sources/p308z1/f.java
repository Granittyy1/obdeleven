package p308z1;

import java.util.ArrayList;
import java.util.zip.Inflater;
import p114j1.A;
import p114j1.q;
import p114j1.r;

/* JADX INFO: compiled from: ProjectionDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    public static ArrayList<e.a> a(r rVar) {
        ArrayList<e.a> arrayList;
        boolean z10;
        int i10;
        ArrayList<e.a> arrayList2;
        e.a aVar;
        r rVar2 = rVar;
        e.a aVar2 = null;
        if (rVar.u() != 0) {
            return null;
        }
        rVar2.H(7);
        int iH = rVar.h();
        boolean z11 = true;
        if (iH == 1684433976) {
            r rVar3 = new r();
            Inflater inflater = new Inflater(true);
            try {
                if (!A.A(rVar2, rVar3, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                rVar2 = rVar3;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iH != 1918990112) {
            return null;
        }
        ArrayList<e.a> arrayList3 = new ArrayList<>();
        int i11 = rVar2.f41063b;
        int i12 = rVar2.f41064c;
        while (i11 < i12) {
            int iH2 = rVar2.h() + i11;
            if (iH2 > i11 && iH2 <= i12) {
                if (rVar2.h() == 1835365224) {
                    int iH3 = rVar2.h();
                    if (iH3 > 10000) {
                        aVar = aVar2;
                        arrayList2 = arrayList3;
                        z10 = z11;
                        i10 = i12;
                    } else {
                        float[] fArr = new float[iH3];
                        for (int i13 = 0; i13 < iH3; i13++) {
                            fArr[i13] = Float.intBitsToFloat(rVar2.h());
                        }
                        int iH4 = rVar2.h();
                        if (iH4 > 32000) {
                            aVar = aVar2;
                            arrayList2 = arrayList3;
                            z10 = z11;
                            i10 = i12;
                        } else {
                            double dLog = Math.log(2.0d);
                            arrayList2 = arrayList3;
                            int iCeil = (int) Math.ceil(Math.log(((double) iH3) * 2.0d) / dLog);
                            byte[] bArr = rVar2.f41062a;
                            q qVar = new q(bArr.length, bArr);
                            qVar.m(rVar2.f41063b * 8);
                            float[] fArr2 = new float[iH4 * 5];
                            int i14 = 5;
                            int[] iArr = new int[5];
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 < iH4) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < i14) {
                                            int i18 = iArr[i17];
                                            int iG = qVar.g(iCeil);
                                            int i19 = ((iG >> 1) ^ (-(iG & 1))) + i18;
                                            if (i19 < iH3 && i19 >= 0) {
                                                fArr2[i16] = fArr[i19];
                                                iArr[i17] = i19;
                                                i17++;
                                                i16++;
                                                i14 = 5;
                                            }
                                        } else {
                                            i15++;
                                            i14 = 5;
                                        }
                                    }
                                } else {
                                    qVar.m((qVar.e() + 7) & (-8));
                                    int i20 = 32;
                                    int iG2 = qVar.g(32);
                                    e.b[] bVarArr = new e.b[iG2];
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < iG2) {
                                            int iG3 = qVar.g(8);
                                            int iG4 = qVar.g(8);
                                            int iG5 = qVar.g(i20);
                                            if (iG5 <= 128000) {
                                                i10 = i12;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iH4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[iG5 * 3];
                                                float[] fArr4 = new float[iG5 * 2];
                                                int i22 = 0;
                                                int i23 = 0;
                                                while (true) {
                                                    if (i22 < iG5) {
                                                        int iG6 = qVar.g(iCeil2);
                                                        q qVar2 = qVar;
                                                        float[] fArr5 = fArr4;
                                                        int i24 = iG2;
                                                        int i25 = ((iG6 >> 1) ^ (-(iG6 & 1))) + i23;
                                                        if (i25 < 0 || i25 >= iH4) {
                                                            z10 = true;
                                                        } else {
                                                            int i26 = i22 * 3;
                                                            int i27 = i25 * 5;
                                                            fArr3[i26] = fArr2[i27];
                                                            fArr3[i26 + 1] = fArr2[i27 + 1];
                                                            fArr3[i26 + 2] = fArr2[i27 + 2];
                                                            int i28 = i22 * 2;
                                                            fArr5[i28] = fArr2[i27 + 3];
                                                            fArr5[i28 + 1] = fArr2[i27 + 4];
                                                            i22++;
                                                            i23 = i25;
                                                            qVar = qVar2;
                                                            fArr4 = fArr5;
                                                            iG2 = i24;
                                                        }
                                                    } else {
                                                        bVarArr[i21] = new e.b(iG3, iG4, fArr3, fArr4);
                                                        i21++;
                                                        i12 = i10;
                                                        z11 = true;
                                                        iG2 = iG2;
                                                        i20 = 32;
                                                    }
                                                }
                                            }
                                            aVar = null;
                                        } else {
                                            z10 = z11;
                                            i10 = i12;
                                            aVar = new e.a(bVarArr);
                                        }
                                    }
                                }
                                z10 = z11;
                                i10 = i12;
                                aVar = null;
                            }
                        }
                    }
                    if (aVar != null) {
                        arrayList = arrayList2;
                        arrayList.add(aVar);
                    }
                } else {
                    arrayList = arrayList3;
                    z10 = z11;
                    i10 = i12;
                }
                rVar2.G(iH2);
                arrayList3 = arrayList;
                i11 = iH2;
                i12 = i10;
                z11 = z10;
                aVar2 = null;
            }
            return null;
        }
        return arrayList3;
    }
}
