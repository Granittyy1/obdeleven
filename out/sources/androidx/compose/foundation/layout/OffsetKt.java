package androidx.compose.foundation.layout;

import B8.E0;
import androidx.compose.ui.platform.C1235n0;
import androidx.compose.ui.platform.T0;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OffsetKt {
    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, final Ia.l<? super p013b0.c, p013b0.j> lVar) {
        return hVar.i(new OffsetPxElement(lVar, new Ia.l<C1235n0, p293xa.r>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(C1235n0 c1235n0) {
                C1235n0 c1235n1 = c1235n0;
                c1235n1.getClass();
                c1235n1.f15072a.b(lVar, "offset");
                return p293xa.r.f47939a;
            }
        }));
    }

    public static final androidx.compose.ui.h b(final float f10, final float f11, androidx.compose.ui.h hVar) {
        return hVar.i(new OffsetElement(f10, f11, new Ia.l<C1235n0, p293xa.r>() { // from class: androidx.compose.foundation.layout.OffsetKt$offset$1
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
                t8.b(fVar, "x");
                E0.b(f11, t8, "y");
                return p293xa.r.f47939a;
            }
        }));
    }
}
