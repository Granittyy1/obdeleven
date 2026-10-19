package androidx.compose.ui.node;

import androidx.compose.ui.graphics.i0;

/* JADX INFO: compiled from: OwnedLayer.kt */
/* JADX INFO: loaded from: classes.dex */
public interface T {
    void a(float[] fArr);

    void b();

    boolean c(long j);

    void d(i0 i0Var);

    long e(long j, boolean z10);

    void f(long j);

    void g(Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar);

    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo4getUnderlyingMatrixsQKQjiQ();

    void h(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar);

    void i(I.c cVar, boolean z10);

    void invalidate();

    void j(float[] fArr);

    void k(long j);

    void l();
}
