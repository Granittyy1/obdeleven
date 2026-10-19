package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* JADX INFO: compiled from: AndroidWindowInfo.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class P implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f14941a = new P();

    @Override // androidx.compose.ui.platform.O
    public final Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i10 = rect.bottom + dimensionPixelSize;
            if (i10 == point.y) {
                rect.bottom = i10;
            } else {
                int i11 = rect.right + dimensionPixelSize;
                if (i11 == point.x) {
                    rect.right = i11;
                }
            }
        }
        return rect;
    }
}
