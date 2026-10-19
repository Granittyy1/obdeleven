package D2;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi23.java */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends Z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f2586k = true;

    @Override // D2.V
    public void r(int i10, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.r(i10, view);
        } else if (f2586k) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f2586k = false;
            }
        }
    }
}
