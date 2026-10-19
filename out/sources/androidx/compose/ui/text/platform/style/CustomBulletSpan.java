package androidx.compose.ui.text.platform.style;

import J.h;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.i;
import p013b0.c;
import p293xa.r;

/* JADX INFO: compiled from: BulletSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f15639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15641e;

    public CustomBulletSpan(float f10, float f11, float f12, c cVar, float f13) {
        this.f15637a = f10;
        this.f15638b = f11;
        this.f15639c = cVar;
        int iB = Ka.a.b(f10 + f12);
        this.f15640d = iB;
        this.f15641e = Ka.a.b(f13) - iB;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i10, final int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f10 = (i12 + i14) / 2.0f;
        int i17 = i10 - this.f15640d;
        if (i17 < 0) {
            i17 = 0;
        }
        final int i18 = i17;
        i.c(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i15 || paint == null) {
            return;
        }
        paint.getStyle();
        if (i.a(null, h.f3954a)) {
            paint.setStyle(Paint.Style.FILL);
        }
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f15638b)) & 4294967295L) | (Float.floatToRawIntBits(this.f15637a) << 32);
        Ia.a<r> aVar = new Ia.a<r>() { // from class: androidx.compose.ui.text.platform.style.CustomBulletSpan$drawLeadingMargin$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                this.this$0.getClass();
                int i19 = i11;
                LayoutDirection layoutDirection = LayoutDirection.f15717b;
                throw null;
            }
        };
        if (!Float.isNaN(0.0f)) {
            paint.getAlpha();
            paint.setAlpha((int) Math.rint(0.0f));
        }
        aVar.invoke();
        throw null;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        int i10 = this.f15641e;
        if (i10 >= 0) {
            return 0;
        }
        return Math.abs(i10);
    }
}
