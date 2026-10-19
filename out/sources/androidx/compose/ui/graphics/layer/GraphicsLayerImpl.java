package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.unit.LayoutDirection;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public interface GraphicsLayerImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f13657a = Companion.f13658a;

    /* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f13658a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Ia.l<J.e, r> f13659b = new Ia.l<J.e, r>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            @Override // Ia.l
            public final r invoke(J.e eVar) {
                J.e.s0(eVar, H.f13503k, 0L, 0L, 0.0f, R.styleable.AppCompatTheme_windowNoTitle);
                return r.f47939a;
            }
        };
    }

    void A(long j);

    void B(long j, int i10, int i11);

    float C();

    float D();

    void E(int i10);

    Matrix F();

    void G(p013b0.c cVar, LayoutDirection layoutDirection, b bVar, Ia.l<? super J.e, r> lVar);

    float H();

    float I();

    int J();

    void K(E e10);

    float a();

    void b(float f10);

    void c();

    void d(float f10);

    void e();

    void f(float f10);

    void g(float f10);

    void h(float f10);

    void i(float f10);

    default boolean j() {
        return true;
    }

    void k(float f10);

    void l(float f10);

    void m(float f10);

    void n(float f10);

    float o();

    void p(Outline outline, long j);

    int q();

    float r();

    float s();

    void t(long j);

    long u();

    float v();

    long w();

    float x();

    void y(long j);

    void z(boolean z10);
}
