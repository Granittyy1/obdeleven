package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: ShadowSpan.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7131d;

    public j(int i10, float f10, float f11, float f12) {
        this.f7128a = i10;
        this.f7129b = f10;
        this.f7130c = f11;
        this.f7131d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f7131d, this.f7129b, this.f7130c, this.f7128a);
    }
}
