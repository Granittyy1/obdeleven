package Q0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: DrawerLayout.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z10 = false;
        boolean z11 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f17321y = windowInsets;
        drawerLayout.f17322z = z11;
        if (!z11 && drawerLayout.getBackground() == null) {
            z10 = true;
        }
        drawerLayout.setWillNotDraw(z10);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
