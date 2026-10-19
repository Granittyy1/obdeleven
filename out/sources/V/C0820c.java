package V;

import android.text.GraphemeClusterSegmentFinder;
import android.view.inputmethod.SelectGesture;
import androidx.compose.ui.text.platform.AndroidTextPaint;

/* JADX INFO: renamed from: V.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0820c {
    public static /* synthetic */ GraphemeClusterSegmentFinder a(CharSequence charSequence, AndroidTextPaint androidTextPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, androidTextPaint);
    }

    public static /* bridge */ /* synthetic */ SelectGesture b(Object obj) {
        return (SelectGesture) obj;
    }
}
