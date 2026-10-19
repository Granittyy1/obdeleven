package androidx.compose.ui.text;

import V.C0818a;
import V.C0820c;
import V.C0821d;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidParagraph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidParagraphIntrinsics f15285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V.G f15288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f15289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15290f;

    /* JADX WARN: Code duplicated, block: B:132:0x029c  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r27v0, types: [androidx.compose.ui.text.AndroidParagraph] */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i10, int i11, long j) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TextUtils.TruncateAt truncateAt;
        ?? r10;
        int i18;
        ?? r12;
        ShaderBrushSpan[] shaderBrushSpanArr;
        Object obj;
        I.f fVar;
        float fE;
        float fD;
        int iB;
        float fG;
        float fB;
        float fD2;
        this.f15285a = androidParagraphIntrinsics;
        this.f15286b = i10;
        this.f15287c = j;
        if (p013b0.a.i(j) != 0 || p013b0.a.j(j) != 0) {
            Y.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i10 < 1) {
            Y.a.a("maxLines should be greater than 0");
        }
        boolean zA = androidx.compose.ui.text.style.m.a(i11, 2);
        F f10 = androidParagraphIntrinsics.f15606b;
        CharSequence charSequence = androidParagraphIntrinsics.f15612h;
        CharSequence charSequence2 = charSequence;
        if (zA && !p013b0.n.a(f10.f15318a.f15697h, G0.a.g(0)) && !p013b0.n.a(f10.f15318a.f15697h, p013b0.n.f20493c)) {
            n nVar = f10.f15319b;
            if (!androidx.compose.ui.text.style.g.a(nVar.f15592a, Integer.MIN_VALUE)) {
                int i19 = nVar.f15592a;
                if (!androidx.compose.ui.text.style.g.a(i19, 5) && !androidx.compose.ui.text.style.g.a(i19, 4) && charSequence.length() != 0) {
                    Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
                    if (spannableString == null) {
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        charSequence2 = charSequence;
                        spannableString = new SpannableString(charSequence);
                    }
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    charSequence2 = charSequence;
                    Spannable spannable = spannableString;
                    boolean zI = H3.c.i(spannable, X.c.class);
                    charSequence2 = spannable;
                    if (!zI) {
                        spannable.setSpan(new X.c(), spannable.length() - 1, spannable.length() - 1, 33);
                        charSequence2 = spannable;
                    }
                }
            }
        }
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        charSequence2 = charSequence;
        CharSequence charSequence3 = charSequence2;
        this.f15289e = charSequence3;
        int i20 = f10.f15319b.f15592a;
        int i21 = androidx.compose.ui.text.style.g.a(i20, 1) ? 3 : androidx.compose.ui.text.style.g.a(i20, 2) ? 4 : androidx.compose.ui.text.style.g.a(i20, 3) ? 2 : (!androidx.compose.ui.text.style.g.a(i20, 5) && androidx.compose.ui.text.style.g.a(i20, 6)) ? 1 : 0;
        n nVar2 = f10.f15319b;
        boolean zA2 = androidx.compose.ui.text.style.g.a(nVar2.f15592a, 4);
        int i22 = androidx.compose.ui.text.style.d.a(nVar2.f15599h, 2) ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
        int i23 = nVar2.f15598g;
        int i24 = i23 & 255;
        if (androidx.compose.ui.text.style.e.a.a(i24, 1)) {
            i12 = 0;
        } else if (androidx.compose.ui.text.style.e.a.a(i24, 2)) {
            i12 = 1;
        } else if (androidx.compose.ui.text.style.e.a.a(i24, 3)) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        int i25 = (i23 >> 8) & 255;
        if (androidx.compose.ui.text.style.e.b.a(i25, 1)) {
            i13 = 0;
        } else if (androidx.compose.ui.text.style.e.b.a(i25, 2)) {
            i13 = 1;
        } else if (androidx.compose.ui.text.style.e.b.a(i25, 3)) {
            i13 = 2;
        } else if (androidx.compose.ui.text.style.e.b.a(i25, 4)) {
            i13 = 3;
        } else {
            i13 = 0;
        }
        int i26 = (i23 >> 16) & 255;
        if (i26 == 1) {
            i15 = 0;
            i14 = 2;
        } else {
            i14 = 2;
            i15 = i26 == 2 ? 1 : 0;
        }
        if (androidx.compose.ui.text.style.m.a(i11, i14)) {
            truncateAt = TextUtils.TruncateAt.END;
            i17 = 4;
            i16 = 5;
        } else {
            i16 = 5;
            if (androidx.compose.ui.text.style.m.a(i11, 5)) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
                i17 = 4;
            } else {
                i17 = 4;
                truncateAt = androidx.compose.ui.text.style.m.a(i11, 4) ? TextUtils.TruncateAt.START : null;
            }
        }
        int i27 = i17;
        int i28 = i16;
        V.G gA = a(i21, zA2 ? 1 : 0, truncateAt, i10, i22, i12, i13, i15, charSequence3);
        if (Build.VERSION.SDK_INT >= 35 || androidParagraphIntrinsics.f15611g.getLetterSpacing() == 0.0f || !(androidx.compose.ui.text.style.m.a(i11, i27) || androidx.compose.ui.text.style.m.a(i11, i28))) {
            r10 = 1;
            i18 = 2;
        } else {
            Layout layout = gA.f6624g;
            if (layout.getEllipsisCount(0) > 0) {
                int ellipsisStart = layout.getEllipsisStart(0);
                int ellipsisCount = layout.getEllipsisCount(0) + ellipsisStart;
                CharSequence charSequenceSubSequence = charSequence3.subSequence(0, ellipsisStart);
                CharSequence charSequenceSubSequence2 = charSequence3.subSequence(ellipsisCount, charSequence3.length());
                r10 = 1;
                i18 = 2;
                gA = a(i21, zA2 ? 1 : 0, truncateAt, i10, i22, i12, i13, i15, TextUtils.concat(charSequenceSubSequence, "…", charSequenceSubSequence2));
            } else {
                r10 = 1;
                i18 = 2;
            }
        }
        if (!androidx.compose.ui.text.style.m.a(i11, i18) || gA.a() <= p013b0.a.g(j) || i10 <= r10) {
            ?? r13 = this;
            r13.f15288d = gA;
            r12 = r13;
        } else {
            int iG = p013b0.a.g(j);
            int i29 = 0;
            while (true) {
                int i30 = gA.f6625h;
                if (i29 >= i30) {
                    i29 = i30;
                    break;
                } else if (gA.e(i29) > iG) {
                    break;
                } else {
                    i29 += r10;
                }
            }
            ?? r14 = this;
            if (i29 >= 0 && i29 != r14.f15286b) {
                gA = a(i21, zA2 ? 1 : 0, truncateAt, i29 < r10 ? r10 : i29, i22, i12, i13, i15, r14.f15289e);
            }
            r14.f15288d = gA;
            r12 = r14;
        }
        AndroidParagraphIntrinsics androidParagraphIntrinsics2 = r12.f15285a;
        v vVar = f10.f15318a;
        androidParagraphIntrinsics2.f15611g.c(vVar.f15690a.e(), (((long) Float.floatToRawIntBits(d())) & 4294967295L) | (((long) Float.floatToRawIntBits(i())) << 32), vVar.f15690a.a());
        V.G g10 = r12.f15288d;
        if (g10.f6624g.getText() instanceof Spanned) {
            Layout layout2 = g10.f6624g;
            CharSequence text = layout2.getText();
            kotlin.jvm.internal.i.c(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            if (spanned.nextSpanTransition(-1, spanned.length(), ShaderBrushSpan.class) != spanned.length()) {
                CharSequence text2 = layout2.getText();
                kotlin.jvm.internal.i.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) text2).getSpans(0, layout2.getText().length(), ShaderBrushSpan.class);
            } else {
                shaderBrushSpanArr = null;
            }
        } else {
            shaderBrushSpanArr = null;
        }
        if (shaderBrushSpanArr != null) {
            kotlin.jvm.internal.a aVarM = I2.e.m(shaderBrushSpanArr);
            while (aVarM.hasNext()) {
                ((ShaderBrushSpan) aVarM.next()).f15644c.setValue(new I.h((((long) Float.floatToRawIntBits(d())) & 4294967295L) | (((long) Float.floatToRawIntBits(i())) << 32)));
            }
        }
        CharSequence charSequence4 = r12.f15289e;
        if (charSequence4 instanceof Spanned) {
            Spanned spanned2 = (Spanned) charSequence4;
            Object[] spans = spanned2.getSpans(0, charSequence4.length(), X.i.class);
            ArrayList arrayList = new ArrayList(spans.length);
            int length = spans.length;
            for (int i31 = 0; i31 < length; i31 += r10) {
                X.i iVar = (X.i) spans[i31];
                int spanStart = spanned2.getSpanStart(iVar);
                int spanEnd = spanned2.getSpanEnd(iVar);
                int lineForOffset = r12.f15288d.f6624g.getLineForOffset(spanStart);
                ?? r15 = lineForOffset >= r12.f15286b ? r10 : 0;
                ?? r16 = (r12.f15288d.f6624g.getEllipsisCount(lineForOffset) <= 0 || spanEnd <= r12.f15288d.f6624g.getEllipsisStart(lineForOffset)) ? 0 : r10;
                ?? r11 = spanEnd > r12.f15288d.f(lineForOffset) ? r10 : 0;
                if (r16 == 0 && r11 == 0 && r15 == 0) {
                    int iOrdinal = r12.b(spanStart).ordinal();
                    if (iOrdinal == 0) {
                        fE = r12.e(spanStart, r10);
                    } else {
                        if (iOrdinal != r10) {
                            throw new NoWhenBranchMatchedException();
                        }
                        float fE2 = r12.e(spanStart, r10);
                        if (!iVar.j) {
                            Y.a.c("PlaceholderSpan is not laid out yet.");
                        }
                        fE = fE2 - iVar.f7126h;
                    }
                    if (!iVar.j) {
                        Y.a.c("PlaceholderSpan is not laid out yet.");
                    }
                    float f11 = iVar.f7126h + fE;
                    V.G g11 = r12.f15288d;
                    switch (iVar.f7124f) {
                        case 0:
                            fD = g11.d(lineForOffset);
                            iB = iVar.b();
                            fG = fD - iB;
                            fVar = new I.f(fE, fG, f11, iVar.b() + fG);
                            break;
                        case 1:
                            fG = g11.g(lineForOffset);
                            fVar = new I.f(fE, fG, f11, iVar.b() + fG);
                            break;
                        case 2:
                            fD = g11.e(lineForOffset);
                            iB = iVar.b();
                            fG = fD - iB;
                            fVar = new I.f(fE, fG, f11, iVar.b() + fG);
                            break;
                        case 3:
                            fG = ((g11.e(lineForOffset) + g11.g(lineForOffset)) - iVar.b()) / i18;
                            fVar = new I.f(fE, fG, f11, iVar.b() + fG);
                            break;
                        case 4:
                            fB = iVar.a().ascent;
                            fD2 = g11.d(lineForOffset);
                            fG = fD2 + fB;
                            fVar = new I.f(fE, fG, f11, iVar.b() + fG);
                            break;
                        case 5:
                            fD = g11.d(lineForOffset) + iVar.a().descent;
                            iB = iVar.b();
                            fG = fD - iB;
                            fVar = new I.f(fE, fG, f11, iVar.b() + fG);
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetricsIntA = iVar.a();
                            fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - iVar.b()) / i18;
                            fD2 = g11.d(lineForOffset);
                            fG = fD2 + fB;
                            fVar = new I.f(fE, fG, f11, iVar.b() + fG);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                } else {
                    fVar = null;
                }
                arrayList.add(fVar);
            }
            obj = arrayList;
        } else {
            obj = EmptyList.f42983b;
        }
        r12.f15290f = obj;
    }

    public final V.G a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        r rVar;
        float fI = i();
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.f15285a;
        androidx.compose.ui.text.platform.a.C0164a c0164a = androidx.compose.ui.text.platform.a.f15625a;
        t tVar = androidParagraphIntrinsics.f15606b.f15320c;
        return new V.G(charSequence, fI, androidParagraphIntrinsics.f15611g, i10, truncateAt, androidParagraphIntrinsics.f15615l, (tVar == null || (rVar = tVar.f15687b) == null) ? false : rVar.f15648a, i12, i14, i15, i16, i13, i11, androidParagraphIntrinsics.f15613i);
    }

    public final ResolvedTextDirection b(int i10) {
        return this.f15288d.f6624g.isRtlCharAt(i10) ? ResolvedTextDirection.f15651c : ResolvedTextDirection.f15650b;
    }

    public final float c() {
        return this.f15288d.d(0);
    }

    public final float d() {
        return this.f15288d.a();
    }

    public final float e(int i10, boolean z10) {
        V.G g10 = this.f15288d;
        return z10 ? g10.h(i10, false) : g10.i(i10, false);
    }

    public final float f() {
        V.G g10 = this.f15288d;
        return g10.d(g10.f6625h - 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<I.f>] */
    public final List<I.f> g() {
        return this.f15290f;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Type inference failed for: r0v35, types: [V.e] */
    public final long h(I.f fVar, int i10, final y yVar) {
        W.d bVar;
        int lineForVertical;
        int i11;
        int i12;
        char c10;
        int[] rangeForRect;
        SegmentFinder segmentFinderA;
        RectF rectFC = g0.c(fVar);
        boolean z10 = !(i10 == 0) && i10 == 1;
        final Ia.p<RectF, RectF, Boolean> pVar = new Ia.p<RectF, RectF, Boolean>() { // from class: androidx.compose.ui.text.AndroidParagraph$getRangeForRect$range$1
            {
                super(2);
            }

            @Override // Ia.p
            public final Boolean invoke(RectF rectF, RectF rectF2) {
                return Boolean.valueOf(yVar.a(g0.e(rectF), g0.e(rectF2)));
            }
        };
        int i13 = Build.VERSION.SDK_INT;
        V.G g10 = this.f15288d;
        AndroidTextPaint androidTextPaint = g10.f6618a;
        Layout layout = g10.f6624g;
        if (i13 >= 34) {
            if (z10) {
                segmentFinderA = new W.a(new W.f(layout.getText(), g10.j()));
            } else {
                C0821d.b();
                segmentFinderA = C0818a.a(C0820c.a(layout.getText(), androidTextPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFC, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: V.e
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) pVar.invoke(rectF, rectF2)).booleanValue();
                }
            });
            c10 = 1;
        } else {
            V.t tVarC = g10.c();
            if (z10) {
                bVar = new W.f(layout.getText(), g10.j());
            } else {
                CharSequence text = layout.getText();
                bVar = i13 >= 29 ? new W.b(text, androidTextPaint) : new W.c(text);
            }
            W.d dVar = bVar;
            int lineForVertical2 = layout.getLineForVertical((int) rectFC.top);
            if (rectFC.top <= g10.e(lineForVertical2) || (lineForVertical2 = lineForVertical2 + 1) < g10.f6625h) {
                int i14 = lineForVertical2;
                lineForVertical = layout.getLineForVertical((int) rectFC.bottom);
                if (lineForVertical != 0 || rectFC.bottom >= g10.g(0)) {
                    int iB = V.H.b(g10, layout, tVarC, i14, rectFC, dVar, pVar, true);
                    while (true) {
                        i11 = i14;
                        if (iB != -1 || i11 >= lineForVertical) {
                            break;
                        }
                        i14 = i11 + 1;
                        iB = V.H.b(g10, layout, tVarC, i14, rectFC, dVar, pVar, true);
                    }
                    if (iB == -1) {
                        c10 = 1;
                        rangeForRect = null;
                    } else {
                        int i15 = i11;
                        int i16 = iB;
                        int iB2 = V.H.b(g10, layout, tVarC, lineForVertical, rectFC, dVar, pVar, false);
                        while (iB2 == -1) {
                            int i17 = i15;
                            if (i17 >= i12) {
                                break;
                            }
                            i12 = lineForVertical;
                            int i18 = i12 - 1;
                            iB2 = V.H.b(g10, layout, tVarC, i18, rectFC, dVar, pVar, false);
                            i15 = i17;
                            i12 = i18;
                        }
                        if (iB2 == -1) {
                            i12 = lineForVertical;
                            rangeForRect = null;
                            c10 = 1;
                        } else {
                            i12 = lineForVertical;
                            c10 = 1;
                            rangeForRect = new int[]{dVar.y(i16 + 1), dVar.z(iB2 - 1)};
                        }
                    }
                } else {
                    c10 = 1;
                    rangeForRect = null;
                }
            } else {
                c10 = 1;
                rangeForRect = null;
            }
        }
        if (rangeForRect == null) {
            i12 = lineForVertical;
            i12 = lineForVertical;
            return E.f15314b;
        }
        i12 = lineForVertical;
        i12 = lineForVertical;
        return O.h.b(rangeForRect[0], rangeForRect[c10]);
    }

    public final float i() {
        return p013b0.a.h(this.f15287c);
    }

    public final void j(androidx.compose.ui.graphics.E e10) {
        Canvas canvasA = C1139o.a(e10);
        V.G g10 = this.f15288d;
        if (g10.f6622e) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, i(), d());
        }
        if (canvasA.getClipBounds(g10.f6633q)) {
            int i10 = g10.f6626i;
            if (i10 != 0) {
                canvasA.translate(0.0f, i10);
            }
            V.F f10 = V.I.f6635a;
            f10.f6617a = canvasA;
            g10.f6624g.draw(f10);
            if (i10 != 0) {
                canvasA.translate(0.0f, (-1) * i10);
            }
        }
        if (g10.f6622e) {
            canvasA.restore();
        }
    }

    public final void k(androidx.compose.ui.graphics.E e10, long j, k0 k0Var, androidx.compose.ui.text.style.h hVar, J.f fVar, int i10) {
        AndroidParagraphIntrinsics androidParagraphIntrinsics = this.f15285a;
        AndroidTextPaint androidTextPaint = androidParagraphIntrinsics.f15611g;
        int i11 = androidTextPaint.f15618c;
        androidTextPaint.d(j);
        androidTextPaint.f(k0Var);
        androidTextPaint.g(hVar);
        androidTextPaint.e(fVar);
        androidTextPaint.b(i10);
        j(e10);
        androidParagraphIntrinsics.f15611g.b(i11);
    }

    public final void l(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.C c10, float f10, k0 k0Var, androidx.compose.ui.text.style.h hVar, J.f fVar, int i10) {
        AndroidTextPaint androidTextPaint = this.f15285a.f15611g;
        int i11 = androidTextPaint.f15618c;
        float fI = i();
        androidTextPaint.c(c10, (((long) Float.floatToRawIntBits(d())) & 4294967295L) | (Float.floatToRawIntBits(fI) << 32), f10);
        androidTextPaint.f(k0Var);
        androidTextPaint.g(hVar);
        androidTextPaint.e(fVar);
        androidTextPaint.b(i10);
        j(e10);
        androidTextPaint.b(i11);
    }
}
