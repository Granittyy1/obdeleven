package androidx.compose.ui.text.platform.style;

import J.f;
import J.h;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.graphics.o0;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DrawStyleSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15646a;

    public a(f fVar) {
        this.f15646a = fVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            h hVar = h.f3954a;
            f fVar = this.f15646a;
            if (i.a(fVar, hVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (fVar instanceof J.i) {
                textPaint.setStyle(Paint.Style.STROKE);
                J.i iVar = (J.i) fVar;
                textPaint.setStrokeWidth(iVar.f3955a);
                textPaint.setStrokeMiter(iVar.f3956b);
                int i10 = iVar.f3958d;
                if (o0.a(i10, 0)) {
                    join = Paint.Join.MITER;
                } else if (o0.a(i10, 1)) {
                    join = Paint.Join.ROUND;
                } else {
                    join = o0.a(i10, 2) ? Paint.Join.BEVEL : Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i11 = iVar.f3957c;
                if (n0.a(i11, 0)) {
                    cap = Paint.Cap.BUTT;
                } else if (n0.a(i11, 1)) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = n0.a(i11, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
            }
        }
    }
}
