package W;

import C.g;
import androidx.compose.ui.text.platform.AndroidTextPaint;

/* JADX INFO: compiled from: SegmentFinder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f6989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidTextPaint f6990d;

    public b(CharSequence charSequence, AndroidTextPaint androidTextPaint) {
        this.f6989c = charSequence;
        this.f6990d = androidTextPaint;
    }

    @Override // C.g
    public final int Y(int i10) {
        CharSequence charSequence = this.f6989c;
        return this.f6990d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // C.g
    public final int f0(int i10) {
        CharSequence charSequence = this.f6989c;
        return this.f6990d.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
