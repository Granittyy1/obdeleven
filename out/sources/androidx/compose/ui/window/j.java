package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes.dex */
public interface j {
    void a(Rect rect, View view);

    void b(PopupLayout popupLayout, int i10, int i11);

    void c(WindowManager windowManager, PopupLayout popupLayout, WindowManager.LayoutParams layoutParams);
}
