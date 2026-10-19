package D2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi29.java */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b0 {
    @Override // D2.V
    public final float m(View view) {
        return view.getTransitionAlpha();
    }

    @Override // D2.V
    public final void q(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // D2.b0, D2.V
    public final void r(int i10, View view) {
        view.setTransitionVisibility(i10);
    }

    @Override // D2.Z
    public final void v(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // D2.Z
    public final void w(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // D2.Z
    public final void x(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // D2.Z
    public final void y(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
