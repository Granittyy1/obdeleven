package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
public class l implements j {
    @Override // androidx.compose.ui.window.j
    public final void a(Rect rect, View view) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // androidx.compose.ui.window.j
    public final void c(WindowManager windowManager, PopupLayout popupLayout, WindowManager.LayoutParams layoutParams) {
        windowManager.updateViewLayout(popupLayout, layoutParams);
    }

    @Override // androidx.compose.ui.window.j
    public void b(PopupLayout popupLayout, int i10, int i11) {
    }
}
