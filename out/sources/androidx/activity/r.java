package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f8252a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8253b = Color.argb(128, 27, 27, 27);

    public static final void a(ComponentActivity componentActivity, D statusBarStyle, D navigationBarStyle) {
        s uVar;
        kotlin.jvm.internal.i.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.i.e(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        Resources resources = decorView.getResources();
        kotlin.jvm.internal.i.d(resources, "view.resources");
        boolean zBooleanValue = statusBarStyle.f8182d.invoke(resources).booleanValue();
        Resources resources2 = decorView.getResources();
        kotlin.jvm.internal.i.d(resources2, "view.resources");
        boolean zBooleanValue2 = navigationBarStyle.f8182d.invoke(resources2).booleanValue();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            uVar = new w();
        } else if (i10 >= 29) {
            uVar = new v();
        } else {
            uVar = i10 >= 28 ? new u() : new s();
        }
        Window window = componentActivity.getWindow();
        kotlin.jvm.internal.i.d(window, "window");
        uVar.b(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        kotlin.jvm.internal.i.d(window2, "window");
        uVar.a(window2);
    }

    public static void b(ComponentActivity componentActivity) {
        SystemBarStyle$Companion$auto$1 detectDarkMode = new Ia.l<Resources, Boolean>() { // from class: androidx.activity.SystemBarStyle$Companion$auto$1
            @Override // Ia.l
            public final Boolean invoke(Resources resources) {
                Resources resources2 = resources;
                kotlin.jvm.internal.i.e(resources2, "resources");
                return Boolean.valueOf((resources2.getConfiguration().uiMode & 48) == 32);
            }
        };
        kotlin.jvm.internal.i.e(detectDarkMode, "detectDarkMode");
        D d10 = new D(0, 0, 0, detectDarkMode);
        kotlin.jvm.internal.i.e(detectDarkMode, "detectDarkMode");
        a(componentActivity, d10, new D(f8252a, f8253b, 0, detectDarkMode));
    }
}
