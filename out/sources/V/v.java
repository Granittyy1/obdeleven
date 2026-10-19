package V;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: LayoutIntrinsics.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f6654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f6655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6657d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6658e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f6659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f6661h;

    public v(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f6654a = charSequence;
        this.f6655b = textPaint;
        this.f6656c = i10;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.f6660g) {
            TextDirectionHeuristic textDirectionHeuristicA = I.a(this.f6656c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f6654a;
            TextPaint textPaint = this.f6655b;
            if (i10 >= 33) {
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicA, true, null);
            } else {
                metricsIsBoring = !textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f6659f = metricsIsBoring;
            this.f6660g = true;
        }
        return this.f6659f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f6661h;
        if (charSequence == null) {
            charSequence = this.f6654a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (H3.c.i(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.f6661h = charSequence;
        } else {
            kotlin.jvm.internal.i.b(charSequence);
        }
        return charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    public final float c() {
        if (!Float.isNaN(this.f6657d)) {
            return this.f6657d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f6655b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f6654a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (H3.c.i(spanned, X.f.class) || H3.c.i(spanned, X.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f6657d = fCeil;
        return fCeil;
    }
}
