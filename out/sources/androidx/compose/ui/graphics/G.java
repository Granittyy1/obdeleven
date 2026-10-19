package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: CanvasUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f13477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f13478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13479c;

    public static void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f13479c) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f13477a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f13478b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f13477a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f13478b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f13477a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f13478b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f13479c = true;
        }
        if (z10) {
            try {
                Method method4 = f13477a;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f13478b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
