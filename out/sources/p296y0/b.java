package p296y0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.compose.foundation.L;
import androidx.compose.ui.contentcapture.e;
import androidx.compose.ui.contentcapture.f;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.presentation.startup.StartupActivity;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SplashScreen.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f48024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StartupActivity f48025c;

    public b(a.b bVar, StartupActivity startupActivity) {
        this.f48024b = bVar;
        this.f48025c = startupActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (e.e(view2)) {
            SplashScreenView child = f.d(view2);
            this.f48024b.getClass();
            i.e(child, "child");
            WindowInsets windowInsetsBuild = L.b().build();
            i.d(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, BrazeLogger.SUPPRESS, BrazeLogger.SUPPRESS);
            if (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.f48025c.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
