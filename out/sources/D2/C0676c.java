package D2;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: D2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CanvasUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0676c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f2587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2589c;

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
        if (i10 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f2589c) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f2587a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                f2588b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2589c = true;
        }
        if (z10) {
            try {
                Method method2 = f2587a;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        if (z10 || (method = f2588b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
