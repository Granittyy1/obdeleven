package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: LineHeightStyleSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7114g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7115h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7116i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7118l;

    public h(float f10, int i10, boolean z10, boolean z11, float f11, boolean z12) {
        this.f7108a = f10;
        this.f7109b = i10;
        this.f7110c = z10;
        this.f7111d = z11;
        this.f7112e = f11;
        this.f7113f = z12;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            Y.a.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == 0;
        boolean z11 = i11 == this.f7109b;
        boolean z12 = this.f7111d;
        boolean z13 = this.f7110c;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f7114g == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f7108a);
            int i17 = iCeil - i16;
            if (!this.f7113f || i17 > 0) {
                float fAbs = this.f7112e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = iCeil2 + i18;
                this.f7116i = i19;
                int i20 = i19 - iCeil;
                this.f7115h = i20;
                if (z13) {
                    i20 = fontMetricsInt.ascent;
                }
                this.f7114g = i20;
                if (z12) {
                    i19 = i18;
                }
                this.j = i19;
                this.f7117k = fontMetricsInt.ascent - i20;
                this.f7118l = i19 - i18;
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f7115h = i21;
                int i22 = fontMetricsInt.descent;
                this.f7116i = i22;
                this.f7114g = i21;
                this.j = i22;
                this.f7117k = 0;
                this.f7118l = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.f7114g : this.f7115h;
        fontMetricsInt.descent = z11 ? this.j : this.f7116i;
    }
}
