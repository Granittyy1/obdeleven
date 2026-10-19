package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: PlaceholderSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint.FontMetricsInt f7125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7127i;
    public boolean j;

    public i(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f7119a = f10;
        this.f7120b = i10;
        this.f7121c = f11;
        this.f7122d = i11;
        this.f7123e = f12;
        this.f7124f = i12;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f7125g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        kotlin.jvm.internal.i.m("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.j) {
            Y.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f7127i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        double dCeil;
        this.j = true;
        float textSize = paint.getTextSize();
        this.f7125g = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            Y.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        float f11 = this.f7123e;
        float f12 = this.f7119a;
        int i12 = this.f7120b;
        if (i12 == 0) {
            f10 = f12 * f11;
        } else {
            if (i12 != 1) {
                Y.a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f10 = f12 * textSize;
        }
        this.f7126h = (int) Math.ceil(f10);
        float f13 = this.f7121c;
        int i13 = this.f7122d;
        if (i13 == 0) {
            dCeil = Math.ceil(f13 * f11);
        } else {
            if (i13 != 1) {
                Y.a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            dCeil = Math.ceil(f13 * textSize);
        }
        this.f7127i = (int) dCeil;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f7124f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    Y.a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.j) {
            Y.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f7126h;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
