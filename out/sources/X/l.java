package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: TextDecorationSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7134b;

    public l(boolean z10, boolean z11) {
        this.f7133a = z10;
        this.f7134b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f7133a);
        textPaint.setStrikeThruText(this.f7134b);
    }
}
