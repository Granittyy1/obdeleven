package androidx.compose.foundation.layout;

import B8.E0;
import androidx.compose.ui.platform.C1235n0;
import androidx.compose.ui.platform.T0;
import androidx.compose.ui.unit.LayoutDirection;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PaddingKt {
    public static N a() {
        float f10 = 0;
        float f11 = 0;
        return new N(f10, f11, f10, f11);
    }

    public static N b(float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return new N(f10, f11, f12, f13);
    }

    public static final float c(L l10, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f15717b ? l10.c(layoutDirection) : l10.b(layoutDirection);
    }

    public static final float d(L l10, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f15717b ? l10.b(layoutDirection) : l10.c(layoutDirection);
    }

    public static final androidx.compose.ui.h e(androidx.compose.ui.h hVar, final L l10) {
        return hVar.i(new PaddingValuesElement(l10, new Ia.l<C1235n0, p293xa.r>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$4
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(C1235n0 c1235n0) {
                C1235n0 c1235n1 = c1235n0;
                c1235n1.getClass();
                c1235n1.f15072a.b(l10, "paddingValues");
                return p293xa.r.f47939a;
            }
        }));
    }

    public static final androidx.compose.ui.h f(androidx.compose.ui.h hVar, final float f10) {
        return hVar.i(new PaddingElement(f10, f10, f10, f10, new Ia.l<C1235n0, p293xa.r>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(C1235n0 c1235n0) {
                c1235n0.getClass();
                return p293xa.r.f47939a;
            }
        }));
    }

    public static final androidx.compose.ui.h g(final float f10, final float f11, androidx.compose.ui.h hVar) {
        return hVar.i(new PaddingElement(f10, f11, f10, f11, new Ia.l<C1235n0, p293xa.r>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(C1235n0 c1235n0) {
                C1235n0 c1235n1 = c1235n0;
                c1235n1.getClass();
                p013b0.f fVar = new p013b0.f(f10);
                T0 t8 = c1235n1.f15072a;
                t8.b(fVar, "horizontal");
                E0.b(f11, t8, "vertical");
                return p293xa.r.f47939a;
            }
        }));
    }

    public static androidx.compose.ui.h h(androidx.compose.ui.h hVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return g(f10, f11, hVar);
    }

    public static final androidx.compose.ui.h i(androidx.compose.ui.h hVar, final float f10, final float f11, final float f12, final float f13) {
        return hVar.i(new PaddingElement(f10, f11, f12, f13, new Ia.l<C1235n0, p293xa.r>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(C1235n0 c1235n0) {
                C1235n0 c1235n1 = c1235n0;
                c1235n1.getClass();
                p013b0.f fVar = new p013b0.f(f10);
                T0 t8 = c1235n1.f15072a;
                t8.b(fVar, OpsMetricTracker.START);
                E0.b(f11, t8, VerticalAlignment.TOP);
                E0.b(f12, t8, "end");
                E0.b(f13, t8, VerticalAlignment.BOTTOM);
                return p293xa.r.f47939a;
            }
        }));
    }

    public static androidx.compose.ui.h j(androidx.compose.ui.h hVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return i(hVar, f10, f11, f12, f13);
    }
}
