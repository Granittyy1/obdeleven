package androidx.compose.ui.text;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: renamed from: androidx.compose.ui.text.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1268i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiParagraphIntrinsics f15470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f15476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15477h;

    public C1268i(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i10, int i11) {
        boolean z10;
        int i12;
        int iG;
        int i13;
        this.f15470a = multiParagraphIntrinsics;
        this.f15471b = i10;
        if (p013b0.a.j(j) != 0 || p013b0.a.i(j) != 0) {
            Y.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = multiParagraphIntrinsics.f15327e;
        int size = arrayList2.size();
        float f10 = 0.0f;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= size) {
                z10 = false;
                break;
            }
            k kVar = (k) arrayList2.get(i14);
            AndroidParagraphIntrinsics androidParagraphIntrinsics = kVar.f15589a;
            int iH = p013b0.a.h(j);
            if (p013b0.a.c(j)) {
                i12 = i14;
                iG = p013b0.a.g(j) - ((int) Math.ceil(f10));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i12 = i14;
                iG = p013b0.a.g(j);
            }
            AndroidParagraph androidParagraph = new AndroidParagraph(androidParagraphIntrinsics, this.f15471b - i15, i11, p013b0.b.b(iH, iG, 5));
            float fD = androidParagraph.d() + f10;
            V.G g10 = androidParagraph.f15288d;
            int i16 = i15 + g10.f6625h;
            arrayList.add(new C1274j(androidParagraph, kVar.f15590b, kVar.f15591c, i15, i16, f10, fD));
            if (!g10.f6622e) {
                if (i16 == this.f15471b) {
                    i13 = i12;
                    if (i13 != kotlin.collections.l.r(this.f15470a.f15327e)) {
                    }
                } else {
                    i13 = i12;
                }
                f10 = fD;
                i15 = i16;
                i14 = i13 + 1;
            }
            z10 = true;
            f10 = fD;
            i15 = i16;
            break;
        }
        this.f15474e = f10;
        this.f15475f = i15;
        this.f15472c = z10;
        this.f15477h = arrayList;
        this.f15473d = p013b0.a.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i17 = 0; i17 < size2; i17++) {
            C1274j c1274j = (C1274j) arrayList.get(i17);
            List<I.f> listG = c1274j.f15582a.g();
            ArrayList arrayList4 = new ArrayList(listG.size());
            int size3 = listG.size();
            for (int i18 = 0; i18 < size3; i18++) {
                I.f fVar = listG.get(i18);
                arrayList4.add(fVar != null ? c1274j.a(fVar) : null);
            }
            kotlin.collections.p.z(arrayList3, arrayList4);
        }
        if (arrayList3.size() < this.f15470a.f15324b.size()) {
            int size4 = this.f15470a.f15324b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i19 = 0; i19 < size4; i19++) {
                arrayList5.add(null);
            }
            arrayList3 = kotlin.collections.q.c0(arrayList3, arrayList5);
        }
        this.f15476g = arrayList3;
    }

    public static void i(C1268i c1268i, androidx.compose.ui.graphics.E e10, long j, k0 k0Var, androidx.compose.ui.text.style.h hVar, J.f fVar) {
        e10.g();
        ArrayList arrayList = c1268i.f15477h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1274j c1274j = (C1274j) arrayList.get(i10);
            c1274j.f15582a.k(e10, j, k0Var, hVar, fVar, 3);
            e10.m(0.0f, c1274j.f15582a.d());
        }
        e10.o();
    }

    public static void j(C1268i c1268i, androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.C c10, float f10, k0 k0Var, androidx.compose.ui.text.style.h hVar, J.f fVar) {
        e10.g();
        ArrayList arrayList = c1268i.f15477h;
        if (arrayList.size() <= 1 || (c10 instanceof m0)) {
            P3.d.f(c1268i, e10, c10, f10, k0Var, hVar, fVar, 3);
        } else if (c10 instanceof j0) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fD = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                C1274j c1274j = (C1274j) arrayList.get(i10);
                fD += c1274j.f15582a.d();
                fMax = Math.max(fMax, c1274j.f15582a.i());
            }
            Shader shaderB = ((j0) c10).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C1274j c1274j2 = (C1274j) arrayList.get(i11);
                c1274j2.f15582a.l(e10, new androidx.compose.ui.graphics.D(shaderB), f10, k0Var, hVar, fVar, 3);
                AndroidParagraph androidParagraph = c1274j2.f15582a;
                e10.m(0.0f, androidParagraph.d());
                matrix.setTranslate(0.0f, -androidParagraph.d());
                shaderB.setLocalMatrix(matrix);
            }
        }
        e10.o();
    }

    public final void a(final long j, final float[] fArr) {
        k(E.e(j));
        l(E.d(j));
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        q.e(this.f15477h, j, new Ia.l<C1274j, p293xa.r>() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(C1274j c1274j) {
                int i10;
                V.G g10;
                boolean z10;
                float fA;
                float fA2;
                C1274j c1274j2 = c1274j;
                long j10 = j;
                float[] fArr2 = fArr;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                int iE = c1274j2.f15583b > E.e(j10) ? c1274j2.f15583b : E.e(j10);
                int iD = E.d(j10);
                int iD2 = c1274j2.f15584c;
                if (iD2 >= iD) {
                    iD2 = E.d(j10);
                }
                long jB = O.h.b(c1274j2.d(iE), c1274j2.d(iD2));
                int i11 = ref$IntRef2.element;
                AndroidParagraph androidParagraph = c1274j2.f15582a;
                int iE2 = E.e(jB);
                int iD3 = E.d(jB);
                V.G g11 = androidParagraph.f15288d;
                Layout layout = g11.f6624g;
                int length = layout.getText().length();
                if (iE2 < 0) {
                    Y.a.a("startOffset must be > 0");
                }
                if (iE2 >= length) {
                    Y.a.a("startOffset must be less than text length");
                }
                if (iD3 <= iE2) {
                    Y.a.a("endOffset must be greater than startOffset");
                }
                if (iD3 > length) {
                    Y.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i11 < (iD3 - iE2) * 4) {
                    Y.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iE2);
                int lineForOffset2 = layout.getLineForOffset(iD3 - 1);
                V.r rVar = new V.r(g11);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF = g11.f(lineForOffset);
                        int iMax = Math.max(iE2, lineStart);
                        int iMin = Math.min(iD3, iF);
                        float fG = g11.g(lineForOffset);
                        float fE = g11.e(lineForOffset);
                        int i12 = i11;
                        int i13 = iE2;
                        int i14 = iD3;
                        boolean z11 = false;
                        boolean z12 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i15 = iMax;
                        int i16 = i12;
                        while (i15 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i15);
                            if (!z12 || zIsRtlCharAt) {
                                i10 = iMin;
                                if (z12 && zIsRtlCharAt) {
                                    z10 = false;
                                    float fA3 = rVar.a(i15, false, false, false);
                                    g10 = g11;
                                    fA = rVar.a(i15 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    g10 = g11;
                                    z10 = false;
                                    if (z12 || !zIsRtlCharAt) {
                                        fA = rVar.a(i15, false, false, false);
                                        fA2 = rVar.a(i15 + 1, true, true, false);
                                    } else {
                                        fA2 = rVar.a(i15, false, false, true);
                                        fA = rVar.a(i15 + 1, true, true, true);
                                        z10 = false;
                                    }
                                }
                            } else {
                                i10 = iMin;
                                fA = rVar.a(i15, z11, z11, true);
                                fA2 = rVar.a(i15 + 1, true, true, true);
                                g10 = g11;
                                z10 = false;
                            }
                            fArr2[i16] = fA;
                            fArr2[i16 + 1] = fG;
                            fArr2[i16 + 2] = fA2;
                            fArr2[i16 + 3] = fE;
                            i16 += 4;
                            i15++;
                            z11 = z10;
                            iMin = i10;
                            g11 = g10;
                        }
                        V.G g12 = g11;
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        i11 = i16;
                        iE2 = i13;
                        iD3 = i14;
                        g11 = g12;
                    }
                }
                int iC = (E.c(jB) * 4) + ref$IntRef2.element;
                for (int i17 = ref$IntRef2.element; i17 < iC; i17 += 4) {
                    int i18 = i17 + 1;
                    float f10 = fArr2[i18];
                    float f11 = ref$FloatRef2.element;
                    fArr2[i18] = f10 + f11;
                    int i19 = i17 + 3;
                    fArr2[i19] = fArr2[i19] + f11;
                }
                ref$IntRef2.element = iC;
                ref$FloatRef2.element = androidParagraph.d() + ref$FloatRef2.element;
                return p293xa.r.f47939a;
            }
        });
    }

    public final float b(int i10) {
        m(i10);
        ArrayList arrayList = this.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(q.c(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        return androidParagraph.f15288d.e(i10 - c1274j.f15585d) + c1274j.f15587f;
    }

    public final int c(int i10, boolean z10) {
        int iF;
        m(i10);
        ArrayList arrayList = this.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(q.c(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        int i11 = i10 - c1274j.f15585d;
        V.G g10 = androidParagraph.f15288d;
        if (z10) {
            Layout layout = g10.f6624g;
            V.F f10 = V.I.f6635a;
            if (layout.getEllipsisCount(i11) <= 0 || g10.f6619b != TextUtils.TruncateAt.END) {
                V.t tVarC = g10.c();
                Layout layout2 = tVarC.f6645a;
                iF = tVarC.f(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iF = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iF = g10.f(i11);
        }
        return iF + c1274j.f15583b;
    }

    public final int d(int i10) {
        int iB;
        int length = this.f15470a.f15323a.f15408c.length();
        ArrayList arrayList = this.f15477h;
        if (i10 >= length) {
            iB = kotlin.collections.l.r(arrayList);
        } else {
            iB = i10 < 0 ? 0 : q.b(i10, arrayList);
        }
        C1274j c1274j = (C1274j) arrayList.get(iB);
        return c1274j.f15582a.f15288d.f6624g.getLineForOffset(c1274j.d(i10)) + c1274j.f15585d;
    }

    public final int e(float f10) {
        ArrayList arrayList = this.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(q.d(arrayList, f10));
        int i10 = c1274j.f15584c - c1274j.f15583b;
        int i11 = c1274j.f15585d;
        if (i10 == 0) {
            return i11;
        }
        float f11 = f10 - c1274j.f15587f;
        V.G g10 = c1274j.f15582a.f15288d;
        return i11 + g10.f6624g.getLineForVertical(((int) f11) - g10.f6626i);
    }

    public final float f(int i10) {
        m(i10);
        ArrayList arrayList = this.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(q.c(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        return androidParagraph.f15288d.g(i10 - c1274j.f15585d) + c1274j.f15587f;
    }

    public final int g(long j) {
        ArrayList arrayList = this.f15477h;
        int i10 = (int) (j & 4294967295L);
        C1274j c1274j = (C1274j) arrayList.get(q.d(arrayList, Float.intBitsToFloat(i10)));
        int i11 = c1274j.f15584c;
        int i12 = c1274j.f15583b;
        if (i11 - i12 == 0) {
            return i12;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i10) - c1274j.f15587f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        AndroidParagraph androidParagraph = c1274j.f15582a;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        V.G g10 = androidParagraph.f15288d;
        int i13 = iIntBitsToFloat - g10.f6626i;
        Layout layout = g10.f6624g;
        int lineForVertical = layout.getLineForVertical(i13);
        return i12 + layout.getOffsetForHorizontal(lineForVertical, (g10.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
    }

    public final long h(I.f fVar, int i10, y yVar) {
        long jB;
        long j;
        ArrayList arrayList = this.f15477h;
        int iD = q.d(arrayList, fVar.f3758b);
        float f10 = ((C1274j) arrayList.get(iD)).f15588g;
        float f11 = fVar.f3760d;
        if (f10 >= f11 || iD == kotlin.collections.l.r(arrayList)) {
            C1274j c1274j = (C1274j) arrayList.get(iD);
            return c1274j.b(c1274j.f15582a.h(c1274j.c(fVar), i10, yVar), true);
        }
        int iD2 = q.d(arrayList, f11);
        long jB2 = E.f15314b;
        while (true) {
            jB = E.f15314b;
            if (!E.a(jB2, jB) || iD > iD2) {
                break;
            }
            C1274j c1274j2 = (C1274j) arrayList.get(iD);
            jB2 = c1274j2.b(c1274j2.f15582a.h(c1274j2.c(fVar), i10, yVar), true);
            iD++;
        }
        if (E.a(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = E.f15314b;
            if (!E.a(jB, j) || iD > iD2) {
                break;
            }
            C1274j c1274j3 = (C1274j) arrayList.get(iD2);
            jB = c1274j3.b(c1274j3.f15582a.h(c1274j3.c(fVar), i10, yVar), true);
            iD2--;
        }
        return E.a(jB, j) ? jB2 : O.h.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i10) {
        boolean z10 = false;
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f15470a;
        if (i10 >= 0 && i10 < multiParagraphIntrinsics.f15323a.f15408c.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbE = A8.f.e(i10, "offset(", ") is out of bounds [0, ");
        sbE.append(multiParagraphIntrinsics.f15323a.f15408c.length());
        sbE.append(')');
        Y.a.a(sbE.toString());
    }

    public final void l(int i10) {
        boolean z10 = false;
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f15470a;
        if (i10 >= 0 && i10 <= multiParagraphIntrinsics.f15323a.f15408c.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbE = A8.f.e(i10, "offset(", ") is out of bounds [0, ");
        sbE.append(multiParagraphIntrinsics.f15323a.f15408c.length());
        sbE.append(']');
        Y.a.a(sbE.toString());
    }

    public final void m(int i10) {
        boolean z10 = false;
        int i11 = this.f15475f;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        Y.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }
}
