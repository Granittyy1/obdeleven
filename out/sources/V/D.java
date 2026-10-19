package V;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import androidx.compose.ui.text.platform.AndroidTextPaint;

/* JADX INFO: compiled from: StaticLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D {
    public static StaticLayout a(CharSequence charSequence, AndroidTextPaint androidTextPaint, int i10, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        if (i11 < 0 || i11 > i12) {
            Y.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i12 < 0 || i12 > length) {
            Y.a.a("invalid end value");
        }
        if (i13 < 0) {
            Y.a.a("invalid maxLines value");
        }
        if (i10 < 0) {
            Y.a.a("invalid width value");
        }
        if (i14 < 0) {
            Y.a.a("invalid ellipsizedWidth value");
        }
        if (f10 < 0.0f) {
            Y.a.a("invalid lineSpacingMultiplier value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, i11, i12, androidTextPaint, i10);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i13);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i14);
        builderObtain.setLineSpacing(f11, f10);
        builderObtain.setIncludePad(z10);
        builderObtain.setBreakStrategy(i16);
        builderObtain.setHyphenationFrequency(i19);
        builderObtain.setIndents(iArr, iArr2);
        int i20 = Build.VERSION.SDK_INT;
        builderObtain.setJustificationMode(i15);
        if (i20 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(z11);
        }
        if (i20 >= 33) {
            builderObtain.setLineBreakConfig(B.b().setLineBreakStyle(i17).setLineBreakWordStyle(i18).build());
        }
        if (i20 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }
}
