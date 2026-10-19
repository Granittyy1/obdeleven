package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.braze.support.BrazeLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class StaticLayoutBuilderCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f27254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f27255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27257d;
    public boolean j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f27258e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27259f = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f27260g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27261h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27262i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f27263k = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f27254a = charSequence;
        this.f27255b = textPaint;
        this.f27256c = i10;
        this.f27257d = charSequence.length();
    }

    public final StaticLayout a() throws StaticLayoutBuilderCompatException {
        if (this.f27254a == null) {
            this.f27254a = "";
        }
        int iMax = Math.max(0, this.f27256c);
        CharSequence charSequenceEllipsize = this.f27254a;
        int i10 = this.f27259f;
        TextPaint textPaint = this.f27255b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f27263k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f27257d);
        this.f27257d = iMin;
        if (this.j && this.f27259f == 1) {
            this.f27258e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f27258e);
        builderObtain.setIncludePad(this.f27262i);
        builderObtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f27263k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f27259f);
        float f10 = this.f27260g;
        if (f10 != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f10);
        }
        if (this.f27259f > 1) {
            builderObtain.setHyphenationFrequency(this.f27261h);
        }
        return builderObtain.build();
    }
}
