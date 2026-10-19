package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0963x extends P {
    @Override // androidx.compose.foundation.layout.P
    default void a(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.H h8) {
        if (n()) {
            k().a(h8, i10, iArr, h8.getLayoutDirection(), iArr2);
        } else {
            l().arrange(h8, i10, iArr, iArr2);
        }
    }

    @Override // androidx.compose.foundation.layout.P
    default long b(int i10, int i11, int i12, boolean z10) {
        if (n()) {
            T t8 = S.f10202a;
            return !z10 ? p013b0.b.a(i10, i11, 0, i12) : p013b0.a.C0206a.b(i10, i11, 0, i12);
        }
        C0953m c0953m = C0952l.f10307a;
        return !z10 ? p013b0.b.a(0, i12, i10, i11) : p013b0.a.C0206a.a(0, i12, i10, i11);
    }

    @Override // androidx.compose.foundation.layout.P
    default int c(androidx.compose.ui.layout.Y y10) {
        return n() ? y10.o0() : y10.l0();
    }

    @Override // androidx.compose.foundation.layout.P
    default androidx.compose.ui.layout.F d(final androidx.compose.ui.layout.Y[] yArr, androidx.compose.ui.layout.H h8, final int[] iArr, int i10, final int i11, final int[] iArr2, final int i12, final int i13, final int i14) {
        int i15;
        int i16;
        if (n()) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
        }
        final LayoutDirection layoutDirection = n() ? LayoutDirection.f15717b : h8.getLayoutDirection();
        return h8.y1(i16, i15, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$placeHelper$1$1
            final /* synthetic */ int $beforeCrossAxisAlignmentLine = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                r rVarF;
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                int[] iArr3 = iArr2;
                int i17 = iArr3 != null ? iArr3[i12] : 0;
                for (int i18 = i13; i18 < i14; i18++) {
                    androidx.compose.ui.layout.Y y10 = yArr[i18];
                    kotlin.jvm.internal.i.b(y10);
                    InterfaceC0963x interfaceC0963x = this;
                    int i19 = i11;
                    LayoutDirection layoutDirection2 = layoutDirection;
                    interfaceC0963x.getClass();
                    Object objQ = y10.q();
                    Q q10 = objQ instanceof Q ? (Q) objQ : null;
                    if (q10 == null || (rVarF = q10.f10201c) == null) {
                        rVarF = interfaceC0963x.f();
                    }
                    int iA = rVarF.a(i19 - interfaceC0963x.e(y10), layoutDirection2) + i17;
                    if (this.n()) {
                        aVar2.d(y10, iArr[i18 - i13], iA, 0.0f);
                    } else {
                        aVar2.d(y10, iA, iArr[i18 - i13], 0.0f);
                    }
                }
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.P
    default int e(androidx.compose.ui.layout.Y y10) {
        return n() ? y10.l0() : y10.o0();
    }

    r f();

    C0945e.InterfaceC0129e k();

    C0945e.l l();

    boolean n();
}
