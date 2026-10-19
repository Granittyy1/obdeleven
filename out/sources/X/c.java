package X;

import V.F;
import V.I;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: IndentationFixSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1) {
            return;
        }
        F f10 = I.f6635a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fB = d.b(layout, lineForOffset, paint) + d.a(layout, lineForOffset, paint);
            if (fB == 0.0f) {
                return;
            }
            kotlin.jvm.internal.i.b(canvas);
            canvas.translate(fB, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
