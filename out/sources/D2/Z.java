package D2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi22.java */
/* JADX INFO: loaded from: classes.dex */
public class Z extends V {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f2579g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f2580h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f2581i = true;
    public static boolean j = true;

    public void v(View view, Matrix matrix) {
        if (f2579g) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f2579g = false;
            }
        }
    }

    public void w(View view, int i10, int i11, int i12, int i13) {
        if (j) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }

    public void x(View view, Matrix matrix) {
        if (f2580h) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2580h = false;
            }
        }
    }

    public void y(View view, Matrix matrix) {
        if (f2581i) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2581i = false;
            }
        }
    }
}
