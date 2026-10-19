package androidx.compose.foundation.gestures;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.platform.AndroidComposeView_androidKt;
import androidx.compose.ui.platform.V;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10032b;

    public n() {
        this.f10031a = new VelocityTracker1D(0);
        this.f10032b = new VelocityTracker1D(0);
    }

    @Override // androidx.compose.ui.platform.V
    public void a(View view, float[] fArr) {
        a0.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = (float[]) this.f10031a;
        if (z10) {
            b((View) parent, fArr);
            float f10 = -view.getScrollX();
            float f11 = -view.getScrollY();
            Ia.l<? super androidx.compose.ui.text.input.t, ? extends androidx.compose.ui.text.input.t> lVar = AndroidComposeView_androidKt.f14790a;
            a0.d(fArr2);
            a0.f(fArr2, f10, f11, 0.0f);
            AndroidComposeView_androidKt.b(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            a0.d(fArr2);
            a0.f(fArr2, left, top, 0.0f);
            AndroidComposeView_androidKt.b(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f10032b;
            view.getLocationInWindow(iArr);
            float f12 = -view.getScrollX();
            float f13 = -view.getScrollY();
            Ia.l<? super androidx.compose.ui.text.input.t, ? extends androidx.compose.ui.text.input.t> lVar2 = AndroidComposeView_androidKt.f14790a;
            a0.d(fArr2);
            a0.f(fArr2, f12, f13, 0.0f);
            AndroidComposeView_androidKt.b(fArr, fArr2);
            float f14 = iArr[0];
            float f15 = iArr[1];
            a0.d(fArr2);
            a0.f(fArr2, f14, f15, 0.0f);
            AndroidComposeView_androidKt.b(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        L4.b.i(fArr2, matrix);
        AndroidComposeView_androidKt.b(fArr, fArr2);
    }

    public n(float[] fArr) {
        this.f10031a = fArr;
        this.f10032b = new int[2];
    }
}
