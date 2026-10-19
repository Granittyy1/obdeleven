package V;

import android.graphics.RectF;
import android.text.Layout;
import java.text.Bidi;

/* JADX INFO: compiled from: TextLayoutGetRangeForRectExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H {
    public static final float a(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0266 A[EDGE_INSN: B:145:0x0266->B:172:0x02c3 BREAK  A[LOOP:5: B:155:0x0282->B:204:0x0282]] */
    public static final int b(G g10, Layout layout, t tVar, int i10, RectF rectF, W.d dVar, Ia.p<? super RectF, ? super RectF, Boolean> pVar, boolean z10) {
        t.a[] aVarArr;
        int i11;
        t.a[] aVarArr2;
        int i12;
        int i13;
        int iZ;
        int i14;
        int iY;
        Bidi bidiCreateLineBidi;
        boolean z11;
        float fA;
        float fA2;
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        int lineStart = layout.getLineStart(i10);
        int lineEnd = layout.getLineEnd(i10);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i15 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i15];
        Layout layout2 = g10.f6624g;
        int lineStart2 = layout2.getLineStart(i10);
        int iF = g10.f(i10);
        if (i15 < (iF - lineStart2) * 2) {
            Y.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        r rVar = new r(g10);
        boolean z12 = false;
        boolean z13 = layout2.getParagraphDirection(i10) == 1;
        int i16 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z13 && !zIsRtlCharAt) {
                fA = rVar.a(lineStart2, z12, z12, true);
                fA2 = rVar.a(lineStart2 + 1, true, true, true);
                z11 = z13;
            } else if (z13 && zIsRtlCharAt) {
                z11 = z13;
                fA2 = rVar.a(lineStart2, false, false, false);
                fA = rVar.a(lineStart2 + 1, true, true, false);
            } else {
                z11 = z13;
                if (zIsRtlCharAt) {
                    float fA3 = rVar.a(lineStart2, false, false, true);
                    fA = rVar.a(lineStart2 + 1, true, true, true);
                    fA2 = fA3;
                } else {
                    fA = rVar.a(lineStart2, false, false, false);
                    fA2 = rVar.a(lineStart2 + 1, true, true, false);
                }
            }
            fArr[i16] = fA;
            fArr[i16 + 1] = fA2;
            i16 += 2;
            lineStart2++;
            z13 = z11;
            z12 = false;
        }
        Layout layout3 = tVar.f6645a;
        int lineStart3 = layout3.getLineStart(i10);
        int lineEnd2 = layout3.getLineEnd(i10);
        int iD = tVar.d(lineStart3, false);
        int iE = tVar.e(iD);
        int i17 = lineStart3 - iE;
        int i18 = lineEnd2 - iE;
        Bidi bidiA = tVar.a(iD);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i17, i18)) == null) {
            aVarArr = new t.a[]{new t.a(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            aVarArr = new t.a[runCount];
            int i19 = 0;
            while (i19 < runCount) {
                int i20 = runCount;
                aVarArr[i19] = new t.a(bidiCreateLineBidi.getRunStart(i19) + lineStart3, bidiCreateLineBidi.getRunLimit(i19) + lineStart3, bidiCreateLineBidi.getRunLevel(i19) % 2 == 1);
                i19++;
                runCount = i20;
            }
        }
        Na.g iVar = z10 ? new Na.i(0, aVarArr.length - 1, 1) : new Na.g(aVarArr.length - 1, 0, -1);
        int i21 = iVar.f4687b;
        int i22 = iVar.f4688c;
        int i23 = iVar.f4689d;
        if ((i23 <= 0 || i21 > i22) && (i23 >= 0 || i22 > i21)) {
            return -1;
        }
        while (true) {
            t.a aVar = aVarArr[i21];
            boolean z14 = aVar.f6652c;
            int iP = aVar.f6650a;
            int iQ = aVar.f6651b;
            float f10 = z14 ? fArr[((iQ - 1) - lineStart) * 2] : fArr[(iP - lineStart) * 2];
            float fA4 = z14 ? a(iP, lineStart, fArr) : a(iQ - 1, lineStart, fArr);
            boolean z15 = aVar.f6652c;
            if (z10) {
                float f11 = rectF.left;
                if (fA4 >= f11) {
                    aVarArr2 = aVarArr;
                    float f12 = rectF.right;
                    if (f10 <= f12) {
                        if ((z15 || f11 > f10) && (!z15 || f12 < fA4)) {
                            int i24 = iP;
                            i14 = iQ;
                            while (true) {
                                i11 = i23;
                                if (i14 - i24 <= 1) {
                                    break;
                                }
                                int i25 = (i14 + i24) / 2;
                                float f13 = fArr[(i25 - lineStart) * 2];
                                if ((z15 || f13 <= rectF.left) && (!z15 || f13 >= rectF.right)) {
                                    i24 = i25;
                                } else {
                                    i14 = i25;
                                }
                                i23 = i11;
                            }
                            if (!z15) {
                                i14 = i24;
                            }
                        } else {
                            i11 = i23;
                            i14 = iP;
                        }
                        int iZ2 = dVar.z(i14);
                        if (iZ2 != -1 && (iY = dVar.y(iZ2)) < iQ) {
                            if (iY >= iP) {
                                iP = iY;
                            }
                            if (iZ2 > iQ) {
                                iZ2 = iQ;
                            }
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iZ3 = iZ2;
                            while (true) {
                                rectF2.left = z15 ? fArr[((iZ3 - 1) - lineStart) * 2] : fArr[(iP - lineStart) * 2];
                                rectF2.right = z15 ? a(iP, lineStart, fArr) : a(iZ3 - 1, lineStart, fArr);
                                if (pVar.invoke(rectF2, rectF).booleanValue()) {
                                    break;
                                }
                                iP = dVar.p(iP);
                                if (iP != -1 && iP < iQ) {
                                    iZ3 = dVar.z(iP);
                                    if (iZ3 > iQ) {
                                        iZ3 = iQ;
                                    }
                                }
                            }
                        }
                    } else {
                        i11 = i23;
                    }
                } else {
                    i11 = i23;
                    aVarArr2 = aVarArr;
                }
                iP = -1;
                break;
            } else {
                i11 = i23;
                aVarArr2 = aVarArr;
                float f14 = rectF.left;
                if (fA4 < f14) {
                    i12 = -1;
                    break;
                }
                float f15 = rectF.right;
                if (f10 <= f15) {
                    if ((z15 || f15 < fA4) && (!z15 || f14 > f10)) {
                        int i26 = iP;
                        int i27 = iQ;
                        while (i27 - i26 > 1) {
                            int i28 = (i27 + i26) / 2;
                            float f16 = fArr[(i28 - lineStart) * 2];
                            int i29 = i27;
                            if ((z15 || f16 <= rectF.right) && (!z15 || f16 >= rectF.left)) {
                                i27 = i29;
                                i26 = i28;
                            } else {
                                i27 = i28;
                            }
                        }
                        i13 = z15 ? i27 : i26;
                    } else {
                        i13 = iQ - 1;
                    }
                    int iY2 = dVar.y(i13 + 1);
                    if (iY2 == -1 || (iZ = dVar.z(iY2)) <= iP) {
                        i12 = -1;
                        break;
                    }
                    if (iY2 < iP) {
                        iY2 = iP;
                    }
                    if (iZ <= iQ) {
                        iQ = iZ;
                    }
                    RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iY3 = iY2;
                    while (true) {
                        rectF3.left = z15 ? fArr[((iQ - 1) - lineStart) * 2] : fArr[(iY3 - lineStart) * 2];
                        rectF3.right = z15 ? a(iY3, lineStart, fArr) : a(iQ - 1, lineStart, fArr);
                        if (pVar.invoke(rectF3, rectF).booleanValue()) {
                            i12 = iQ;
                            break;
                        }
                        iQ = dVar.q(iQ);
                        if (iQ == -1 || iQ <= iP) {
                            i12 = -1;
                            break;
                        }
                        iY3 = dVar.y(iQ);
                        if (iY3 < iP) {
                            iY3 = iP;
                        }
                    }
                } else {
                    i12 = -1;
                    break;
                }
                iP = i12;
            }
            if (iP >= 0) {
                return iP;
            }
            if (i21 == i22) {
                return -1;
            }
            i21 += i11;
            aVarArr = aVarArr2;
            i23 = i11;
        }
    }
}
