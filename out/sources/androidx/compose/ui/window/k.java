package androidx.compose.ui.window;

import android.graphics.Rect;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {
    @Override // androidx.compose.ui.window.l, androidx.compose.ui.window.j
    public final void b(PopupLayout popupLayout, int i10, int i11) {
        popupLayout.setSystemGestureExclusionRects(kotlin.collections.l.t(new Rect(0, 0, i10, i11)));
    }
}
