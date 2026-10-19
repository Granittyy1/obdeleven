package R0;

import android.text.TextPaint;

/* JADX INFO: compiled from: DefaultGlyphChecker.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f5145b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f5146a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f5146a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
