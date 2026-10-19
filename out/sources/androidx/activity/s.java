package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.b0;
import androidx.core.view.v0;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
public class s {
    public void b(D statusBarStyle, D navigationBarStyle, Window window, View view, boolean z10, boolean z11) {
        v0.e cVar;
        kotlin.jvm.internal.i.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.i.e(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.i.e(window, "window");
        kotlin.jvm.internal.i.e(view, "view");
        b0.a(window, false);
        window.setStatusBarColor(z10 ? statusBarStyle.f8180b : statusBarStyle.f8179a);
        window.setNavigationBarColor(z11 ? navigationBarStyle.f8180b : navigationBarStyle.f8179a);
        androidx.core.view.D d10 = new androidx.core.view.D(view);
        if (Build.VERSION.SDK_INT >= 30) {
            v0.d dVar = new v0.d(window.getInsetsController(), d10);
            dVar.f16996b = window;
            cVar = dVar;
        } else {
            cVar = new v0.c(window, d10);
        }
        cVar.c(!z10);
        cVar.b(!z11);
    }

    public void a(Window window) {
    }
}
