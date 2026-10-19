package V;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidTextPaint f6618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f6619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6620c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public W.e f6623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Layout f6624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6626i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f6627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f6628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint.FontMetricsInt f6630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final X.h[] f6632p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t f6634r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6621d = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f6633q = new Rect();

    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r40v1, types: [boolean] */
    public G(CharSequence charSequence, float f10, AndroidTextPaint androidTextPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, boolean z10, int i12, int i13, int i14, int i15, int i16, int i17, v vVar) {
        boolean z11;
        Layout layoutA;
        int i18;
        long j;
        X.h[] hVarArr;
        Paint.FontMetricsInt fontMetricsInt;
        boolean zIsFallbackLineSpacingEnabled;
        this.f6618a = androidTextPaint;
        this.f6619b = truncateAt;
        this.f6620c = z10;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = I.a(i11);
        Layout.Alignment alignment = E.f6615a;
        Layout.Alignment alignment2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Layout.Alignment.ALIGN_NORMAL : E.f6616b : E.f6615a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z12 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, X.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = vVar.a();
            double d10 = f10;
            int iCeil = (int) Math.ceil(d10);
            if (metricsA == null || vVar.c() > f10 || z12) {
                z11 = true;
                this.f6629m = false;
                layoutA = D.a(charSequence, androidTextPaint, iCeil, 0, charSequence.length(), textDirectionHeuristicA, alignment2, i12, truncateAt, (int) Math.ceil(d10), 1.0f, 0.0f, i17, z10, true, i13, i14, i15, i16, null, null);
            } else {
                this.f6629m = true;
                if (iCeil < 0) {
                    Y.a.a("negative width");
                }
                if (iCeil < 0) {
                    Y.a.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    layoutA = C0825h.a(charSequence, androidTextPaint, iCeil, alignment2, metricsA, z10, truncateAt, iCeil, true);
                    z11 = true;
                } else {
                    z11 = true;
                    layoutA = new BoringLayout(charSequence, androidTextPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z10, truncateAt, iCeil);
                }
            }
            this.f6624g = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i12);
            this.f6625h = iMin;
            int i19 = iMin - 1;
            this.f6622e = iMin >= i12 && (layoutA.getEllipsisCount(i19) > 0 || layoutA.getLineEnd(i19) != charSequence.length());
            long j10 = I.f6636b;
            if (z10) {
                i18 = 0;
                j = j10;
            } else {
                if (this.f6629m) {
                    BoringLayout boringLayout = (BoringLayout) layoutA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        zIsFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
                    } else {
                        zIsFallbackLineSpacingEnabled = false;
                    }
                } else {
                    StaticLayout staticLayout = (StaticLayout) layoutA;
                    int i20 = Build.VERSION.SDK_INT;
                    if (i20 >= 33) {
                        zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i20 >= 28) {
                        zIsFallbackLineSpacingEnabled = z11;
                    } else {
                        zIsFallbackLineSpacingEnabled = false;
                    }
                }
                if (zIsFallbackLineSpacingEnabled) {
                    i18 = 0;
                } else {
                    TextPaint paint = layoutA.getPaint();
                    CharSequence text = layoutA.getText();
                    i18 = 0;
                    Rect rectA = w.a(paint, text, layoutA.getLineStart(0), layoutA.getLineEnd(0));
                    int lineAscent = layoutA.getLineAscent(0);
                    int i21 = rectA.top;
                    int topPadding = i21 < lineAscent ? lineAscent - i21 : layoutA.getTopPadding();
                    rectA = iMin != 1 ? w.a(paint, text, layoutA.getLineStart(i19), layoutA.getLineEnd(i19)) : rectA;
                    int lineDescent = layoutA.getLineDescent(i19);
                    int i22 = rectA.bottom;
                    int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layoutA.getBottomPadding();
                    j = (topPadding == 0 && bottomPadding == 0) ? j : (((long) bottomPadding) & 4294967295L) | (((long) topPadding) << 32);
                }
                j = j10;
            }
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text2 = layoutA.getText();
                kotlin.jvm.internal.i.c(text2, "null cannot be cast to non-null type android.text.Spanned");
                if (H3.c.i((Spanned) text2, X.h.class) || layoutA.getText().length() <= 0) {
                    CharSequence text3 = layoutA.getText();
                    kotlin.jvm.internal.i.c(text3, "null cannot be cast to non-null type android.text.Spanned");
                    hVarArr = (X.h[]) ((Spanned) text3).getSpans(i18, layoutA.getText().length(), X.h.class);
                } else {
                    hVarArr = null;
                }
            } else {
                hVarArr = null;
            }
            this.f6632p = hVarArr;
            if (hVarArr != null) {
                int length2 = hVarArr.length;
                int i23 = i18;
                int iMax = i23;
                int iMax2 = iMax;
                while (i23 < length2) {
                    X.h hVar = hVarArr[i23];
                    int i24 = hVar.f7117k;
                    iMax = i24 < 0 ? Math.max(iMax, Math.abs(i24)) : iMax;
                    int i25 = hVar.f7118l;
                    if (i25 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i25));
                    }
                    i23++;
                }
                j10 = (iMax == 0 && iMax2 == 0) ? I.f6636b : (((long) iMax) << 32) | (((long) iMax2) & 4294967295L);
            }
            this.f6626i = Math.max((int) (j >> 32), (int) (j10 >> 32));
            this.j = Math.max((int) (j & 4294967295L), (int) (j10 & 4294967295L));
            AndroidTextPaint androidTextPaint2 = this.f6618a;
            X.h[] hVarArr2 = this.f6632p;
            int i26 = this.f6625h - 1;
            Layout layout = this.f6624g;
            if (layout.getLineStart(i26) != layout.getLineEnd(i26) || hVarArr2 == null || hVarArr2.length == 0) {
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                X.h hVar2 = (X.h) kotlin.collections.k.P(hVarArr2);
                spannableString.setSpan(new X.h(hVar2.f7108a, spannableString.length(), (i26 == 0 || !hVar2.f7111d) ? hVar2.f7111d : i18, hVar2.f7111d, hVar2.f7112e, hVar2.f7113f), i18, spannableString.length(), 33);
                StaticLayout staticLayoutA = D.a(spannableString, androidTextPaint2, BrazeLogger.SUPPRESS, 0, spannableString.length(), textDirectionHeuristicA, s.f6644a, BrazeLogger.SUPPRESS, null, BrazeLogger.SUPPRESS, 1.0f, 0.0f, 0, this.f6620c, this.f6621d, 0, 0, 0, 0, null, null);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(i18);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(i18);
                fontMetricsInt.top = staticLayoutA.getLineTop(i18);
                fontMetricsInt.bottom = staticLayoutA.getLineBottom(i18);
            }
            this.f6631o = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i19) - g(i19))) : i18;
            this.f6630n = fontMetricsInt;
            Layout layout2 = this.f6624g;
            this.f6627k = X.d.a(layout2, i19, layout2.getPaint());
            Layout layout3 = this.f6624g;
            this.f6628l = X.d.b(layout3, i19, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z10 = this.f6622e;
        Layout layout = this.f6624g;
        return (z10 ? layout.getLineBottom(this.f6625h - 1) : layout.getHeight()) + this.f6626i + this.j + this.f6631o;
    }

    public final float b(int i10) {
        if (i10 == this.f6625h - 1) {
            return this.f6627k + this.f6628l;
        }
        return 0.0f;
    }

    public final t c() {
        t tVar = this.f6634r;
        if (tVar != null) {
            kotlin.jvm.internal.i.b(tVar);
            return tVar;
        }
        t tVar2 = new t(this.f6624g);
        this.f6634r = tVar2;
        return tVar2;
    }

    public final float d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f6626i + ((i10 != this.f6625h + (-1) || (fontMetricsInt = this.f6630n) == null) ? this.f6624g.getLineBaseline(i10) : g(i10) - fontMetricsInt.ascent);
    }

    public final float e(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f6625h;
        int i12 = i11 - 1;
        Layout layout = this.f6624g;
        if (i10 != i12 || (fontMetricsInt = this.f6630n) == null) {
            return this.f6626i + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.j : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i10) {
        F f10 = I.f6635a;
        Layout layout = this.f6624g;
        return (layout.getEllipsisCount(i10) <= 0 || this.f6619b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final float g(int i10) {
        return this.f6624g.getLineTop(i10) + (i10 == 0 ? 0 : this.f6626i);
    }

    public final float h(int i10, boolean z10) {
        return b(this.f6624g.getLineForOffset(i10)) + c().c(i10, true, z10);
    }

    public final float i(int i10, boolean z10) {
        return b(this.f6624g.getLineForOffset(i10)) + c().c(i10, false, z10);
    }

    public final W.e j() {
        W.e eVar = this.f6623f;
        if (eVar != null) {
            return eVar;
        }
        Layout layout = this.f6624g;
        W.e eVar2 = new W.e(layout.getText(), layout.getText().length(), this.f6618a.getTextLocale());
        this.f6623f = eVar2;
        return eVar2;
    }
}
