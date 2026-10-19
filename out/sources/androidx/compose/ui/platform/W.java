package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class W implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f14998a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14999b = new int[2];

    @Override // androidx.compose.ui.platform.V
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f14998a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f14999b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        L4.b.i(fArr, matrix);
    }
}
