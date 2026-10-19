package D2;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewGroupUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f2568a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2570c;

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (f2568a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f2568a = false;
            }
        }
    }
}
