package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: renamed from: androidx.compose.ui.platform.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1215d0 {
    boolean A();

    int B();

    void C(int i10);

    void D(androidx.compose.ui.graphics.F f10, Path path, Ia.l<? super androidx.compose.ui.graphics.E, p293xa.r> lVar);

    int E();

    boolean F();

    void G(boolean z10);

    void H(int i10);

    void I(Matrix matrix);

    float J();

    float a();

    void b(float f10);

    void c();

    void d(float f10);

    void e();

    void f(float f10);

    void g(float f10);

    int getHeight();

    int getWidth();

    void h(float f10);

    void i(float f10);

    boolean j();

    void k(float f10);

    void l(float f10);

    void m(float f10);

    boolean n();

    void o(int i10);

    int p();

    void q(Canvas canvas);

    int r();

    void s(float f10);

    void t(int i10);

    void u(boolean z10);

    boolean v(int i10, int i11, int i12, int i13);

    void w(float f10);

    void x(float f10);

    void y(int i10);

    void z(Outline outline);
}
