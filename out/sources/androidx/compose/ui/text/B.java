package androidx.compose.ui.text;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;

/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f15300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1268i f15301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f15305f;

    public B(A a10, C1268i c1268i, long j) {
        this.f15300a = a10;
        this.f15301b = c1268i;
        this.f15302c = j;
        ArrayList arrayList = c1268i.f15477h;
        float f10 = 0.0f;
        this.f15303d = arrayList.isEmpty() ? 0.0f : ((C1274j) arrayList.get(0)).f15582a.c();
        if (!arrayList.isEmpty()) {
            C1274j c1274j = (C1274j) kotlin.collections.q.V(arrayList);
            f10 = c1274j.f15582a.f() + c1274j.f15587f;
        }
        this.f15304e = f10;
        this.f15305f = c1268i.f15476g;
    }

    public final ResolvedTextDirection a(int i10) {
        C1268i c1268i = this.f15301b;
        c1268i.l(i10);
        int length = c1268i.f15470a.f15323a.f15408c.length();
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(i10 == length ? kotlin.collections.l.r(arrayList) : q.b(i10, arrayList));
        return c1274j.f15582a.b(c1274j.d(i10));
    }

    public final I.f b(int i10) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        C1268i c1268i = this.f15301b;
        c1268i.k(i10);
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(q.b(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        int iD = c1274j.d(i10);
        CharSequence charSequence = androidParagraph.f15289e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbE = A8.f.e(iD, "offset(", ") is out of bounds [0,");
            sbE.append(charSequence.length());
            sbE.append(')');
            Y.a.a(sbE.toString());
        }
        V.G g10 = androidParagraph.f15288d;
        Layout layout = g10.f6624g;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = g10.g(lineForOffset);
        float fE = g10.e(lineForOffset);
        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fH = g10.i(iD, false);
                fH2 = g10.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = g10.h(iD, false);
                fH2 = g10.h(iD + 1, true);
            } else {
                fI = g10.i(iD, false);
                fI2 = g10.i(iD + 1, true);
            }
            float f10 = fH;
            fI = fH2;
            fI2 = f10;
        } else {
            fI = g10.h(iD, false);
            fI2 = g10.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return c1274j.a(new I.f(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final I.f c(int i10) {
        C1268i c1268i = this.f15301b;
        c1268i.l(i10);
        int length = c1268i.f15470a.f15323a.f15408c.length();
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(i10 == length ? kotlin.collections.l.r(arrayList) : q.b(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        int iD = c1274j.d(i10);
        CharSequence charSequence = androidParagraph.f15289e;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbE = A8.f.e(iD, "offset(", ") is out of bounds [0,");
            sbE.append(charSequence.length());
            sbE.append(']');
            Y.a.a(sbE.toString());
        }
        V.G g10 = androidParagraph.f15288d;
        float fH = g10.h(iD, false);
        int lineForOffset = g10.f6624g.getLineForOffset(iD);
        return c1274j.a(new I.f(fH, g10.g(lineForOffset), fH, g10.e(lineForOffset)));
    }

    public final boolean d() {
        long j = this.f15302c;
        float f10 = (int) (j >> 32);
        C1268i c1268i = this.f15301b;
        return f10 < c1268i.f15473d || c1268i.f15472c || ((float) ((int) (j & 4294967295L))) < c1268i.f15474e;
    }

    public final float e(int i10) {
        C1268i c1268i = this.f15301b;
        c1268i.m(i10);
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(q.c(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        int i11 = i10 - c1274j.f15585d;
        V.G g10 = androidParagraph.f15288d;
        return g10.f6624g.getLineLeft(i11) + (i11 == g10.f6625h + (-1) ? g10.f6627k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return kotlin.jvm.internal.i.a(this.f15300a, b10.f15300a) && this.f15301b.equals(b10.f15301b) && p013b0.l.b(this.f15302c, b10.f15302c) && this.f15303d == b10.f15303d && this.f15304e == b10.f15304e && kotlin.jvm.internal.i.a(this.f15305f, b10.f15305f);
    }

    public final float f(int i10) {
        C1268i c1268i = this.f15301b;
        c1268i.m(i10);
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(q.c(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        int i11 = i10 - c1274j.f15585d;
        V.G g10 = androidParagraph.f15288d;
        return g10.f6624g.getLineRight(i11) + (i11 == g10.f6625h + (-1) ? g10.f6628l : 0.0f);
    }

    public final int g(int i10) {
        C1268i c1268i = this.f15301b;
        c1268i.m(i10);
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(q.c(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        return androidParagraph.f15288d.f6624g.getLineStart(i10 - c1274j.f15585d) + c1274j.f15583b;
    }

    public final ResolvedTextDirection h(int i10) {
        C1268i c1268i = this.f15301b;
        c1268i.l(i10);
        int length = c1268i.f15470a.f15323a.f15408c.length();
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(i10 == length ? kotlin.collections.l.r(arrayList) : q.b(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        int iD = c1274j.d(i10);
        V.G g10 = androidParagraph.f15288d;
        return g10.f6624g.getParagraphDirection(g10.f6624g.getLineForOffset(iD)) == 1 ? ResolvedTextDirection.f15650b : ResolvedTextDirection.f15651c;
    }

    public final int hashCode() {
        return this.f15305f.hashCode() + O.a.d(this.f15304e, O.a.d(this.f15303d, C4.b.c(this.f15302c, (this.f15301b.hashCode() + (this.f15300a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final C1144u i(final int i10, final int i11) {
        C1268i c1268i = this.f15301b;
        C1260a c1260a = c1268i.f15470a.f15323a;
        if (i10 < 0 || i10 > i11 || i11 > c1260a.f15408c.length()) {
            StringBuilder sbA = B6.a.a("Start(", ") or End(", ") is out of range [0..", i10, i11);
            sbA.append(c1260a.f15408c.length());
            sbA.append("), or start > end!");
            Y.a.a(sbA.toString());
        }
        if (i10 == i11) {
            return C1146w.a();
        }
        final C1144u c1144uA = C1146w.a();
        q.e(c1268i.f15477h, O.h.b(i10, i11), new Ia.l<C1274j, p293xa.r>() { // from class: androidx.compose.ui.text.MultiParagraph$getPathForRange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(C1274j c1274j) {
                C1274j c1274j2 = c1274j;
                Path path = c1144uA;
                int i12 = i10;
                int i13 = i11;
                AndroidParagraph androidParagraph = c1274j2.f15582a;
                int iD = c1274j2.d(i12);
                int iD2 = c1274j2.d(i13);
                CharSequence charSequence = androidParagraph.f15289e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbA2 = B6.a.a("start(", ") or end(", ") is out of range [0..", iD, iD2);
                    sbA2.append(charSequence.length());
                    sbA2.append("], or start > end!");
                    Y.a.a(sbA2.toString());
                }
                android.graphics.Path path2 = new android.graphics.Path();
                V.G g10 = androidParagraph.f15288d;
                g10.f6624g.getSelectionPath(iD, iD2, path2);
                int i14 = g10.f6626i;
                if (i14 != 0 && !path2.isEmpty()) {
                    path2.offset(0.0f, i14);
                }
                C1144u c1144u = new C1144u(path2);
                c1144u.v((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c1274j2.f15587f)) & 4294967295L));
                path.s(c1144u, 0L);
                return p293xa.r.f47939a;
            }
        });
        return c1144uA;
    }

    public final long j(int i10) {
        int i11;
        int iH;
        int iH2;
        C1268i c1268i = this.f15301b;
        c1268i.l(i10);
        int length = c1268i.f15470a.f15323a.f15408c.length();
        ArrayList arrayList = c1268i.f15477h;
        C1274j c1274j = (C1274j) arrayList.get(i10 == length ? kotlin.collections.l.r(arrayList) : q.b(i10, arrayList));
        AndroidParagraph androidParagraph = c1274j.f15582a;
        int iD = c1274j.d(i10);
        W.e eVarJ = androidParagraph.f15288d.j();
        if (eVarJ.g(eVarJ.i(iD))) {
            eVarJ.a(iD);
            i11 = iD;
            while (i11 != -1 && (!eVarJ.g(i11) || eVarJ.c(i11))) {
                i11 = eVarJ.i(i11);
            }
        } else {
            eVarJ.a(iD);
            if (eVarJ.f(iD)) {
                i11 = (!eVarJ.d(iD) || eVarJ.b(iD)) ? eVarJ.i(iD) : iD;
            } else {
                i11 = eVarJ.b(iD) ? eVarJ.i(iD) : -1;
            }
        }
        if (i11 == -1) {
            i11 = iD;
        }
        if (eVarJ.c(eVarJ.h(iD))) {
            eVarJ.a(iD);
            iH = iD;
            while (iH != -1 && (eVarJ.g(iH) || !eVarJ.c(iH))) {
                iH = eVarJ.h(iH);
            }
        } else {
            eVarJ.a(iD);
            if (eVarJ.b(iD)) {
                iH2 = (!eVarJ.d(iD) || eVarJ.f(iD)) ? eVarJ.h(iD) : iD;
            } else if (eVarJ.f(iD)) {
                iH2 = eVarJ.h(iD);
            } else {
                iH = -1;
            }
            iH = iH2;
        }
        if (iH != -1) {
            iD = iH;
        }
        return c1274j.b(O.h.b(i11, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f15300a + ", multiParagraph=" + this.f15301b + ", size=" + ((Object) p013b0.l.c(this.f15302c)) + ", firstBaseline=" + this.f15303d + ", lastBaseline=" + this.f15304e + ", placeholderRects=" + this.f15305f + ')';
    }
}
