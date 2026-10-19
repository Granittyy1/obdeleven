package androidx.compose.animation;

import androidx.compose.animation.core.C0912l;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.d0;
import androidx.compose.animation.core.e0;
import androidx.compose.ui.graphics.H;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ColorVectorConverter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements Ia.l<androidx.compose.ui.graphics.colorspace.c, d0<H, C0912l>> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ColorVectorConverterKt$ColorToVector$1 f9266h = new ColorVectorConverterKt$ColorToVector$1();

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // Ia.l
    public final d0<H, C0912l> invoke(androidx.compose.ui.graphics.colorspace.c cVar) {
        final androidx.compose.ui.graphics.colorspace.c cVar2 = cVar;
        Ia.l<C0912l, H> lVar = new Ia.l<C0912l, H>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
            {
                super(1);
            }

            @Override // Ia.l
            public final H invoke(C0912l c0912l) {
                C0912l c0912l2 = c0912l;
                float f10 = c0912l2.f9567b;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = c0912l2.f9568c;
                if (f11 < -0.5f) {
                    f11 = -0.5f;
                }
                if (f11 > 0.5f) {
                    f11 = 0.5f;
                }
                float f12 = c0912l2.f9569d;
                float f13 = f12 >= -0.5f ? f12 : -0.5f;
                float f14 = f13 <= 0.5f ? f13 : 0.5f;
                float f15 = c0912l2.f9566a;
                float f16 = f15 >= 0.0f ? f15 : 0.0f;
                return new H(H.a(Q3.d.c(f10, f11, f14, f16 <= 1.0f ? f16 : 1.0f, androidx.compose.ui.graphics.colorspace.f.f13589x), cVar2));
            }
        };
        e0 e0Var = VectorConvertersKt.f9477a;
        return new e0(new Ia.l<H, C0912l>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
            @Override // Ia.l
            public final C0912l invoke(H h8) {
                long jA = H.a(h8.f13506a, androidx.compose.ui.graphics.colorspace.f.f13589x);
                return new C0912l(H.d(jA), H.h(jA), H.g(jA), H.e(jA));
            }
        }, lVar);
    }
}
