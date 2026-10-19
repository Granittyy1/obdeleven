package R0;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: EmojiSpan.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f5168b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f5167a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f5169c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5170d = 1.0f;

    public i(n nVar) {
        A0.f.f(nVar, "rasterizer cannot be null");
        this.f5168b = nVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5167a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        n nVar = this.f5168b;
        S0.a aVarC = nVar.c();
        int iA = aVarC.a(14);
        this.f5170d = fAbs / (iA != 0 ? aVarC.f5345b.getShort(iA + aVarC.f5344a) : (short) 0);
        S0.a aVarC2 = nVar.c();
        int iA2 = aVarC2.a(14);
        if (iA2 != 0) {
            aVarC2.f5345b.getShort(iA2 + aVarC2.f5344a);
        }
        S0.a aVarC3 = nVar.c();
        int iA3 = aVarC3.a(12);
        short s10 = (short) ((iA3 != 0 ? aVarC3.f5345b.getShort(iA3 + aVarC3.f5344a) : (short) 0) * this.f5170d);
        this.f5169c = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
