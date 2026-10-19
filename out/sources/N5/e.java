package N5;

import K5.g;
import K5.x;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: NavigationView.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationView f4652b;

    public e(NavigationView navigationView) {
        this.f4652b = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f4652b;
        navigationView.getLocationOnScreen(navigationView.f27327m);
        int[] iArr = navigationView.f27327m;
        boolean z10 = true;
        boolean z11 = iArr[1] == 0;
        g gVar = navigationView.j;
        if (gVar.f4321y != z11) {
            gVar.f4321y = z11;
            int i10 = (gVar.f4300c.getChildCount() <= 0 && gVar.f4321y) ? gVar.f4295A : 0;
            NavigationMenuView navigationMenuView = gVar.f4299b;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        navigationView.setDrawTopInsetForeground(z11 && navigationView.f27330p);
        int i11 = iArr[0];
        navigationView.setDrawLeftInsetForeground(i11 == 0 || navigationView.getWidth() + i11 == 0);
        Context context = navigationView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            Rect rectA = x.a(activity);
            navigationView.setDrawBottomInsetForeground((rectA.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f27331q);
            if (rectA.width() != iArr[0] && rectA.width() - navigationView.getWidth() != iArr[0]) {
                z10 = false;
            }
            navigationView.setDrawRightInsetForeground(z10);
        }
    }
}
