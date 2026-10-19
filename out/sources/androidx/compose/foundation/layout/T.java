package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.List;

/* JADX INFO: compiled from: Row.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T implements androidx.compose.ui.layout.E, P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0945e.InterfaceC0129e f10216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.f.b f10217b;

    public T(C0945e.InterfaceC0129e interfaceC0129e, androidx.compose.ui.f.b bVar) {
        this.f10216a = interfaceC0129e;
        this.f10217b = bVar;
    }

    @Override // androidx.compose.foundation.layout.P
    public final void a(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.H h8) {
        this.f10216a.a(h8, i10, iArr, h8.getLayoutDirection(), iArr2);
    }

    @Override // androidx.compose.foundation.layout.P
    public final long b(int i10, int i11, int i12, boolean z10) {
        T t8 = S.f10202a;
        return !z10 ? p013b0.b.a(i10, i11, 0, i12) : p013b0.a.C0206a.b(i10, i11, 0, i12);
    }

    @Override // androidx.compose.foundation.layout.P
    public final int c(androidx.compose.ui.layout.Y y10) {
        return y10.f14220b;
    }

    @Override // androidx.compose.foundation.layout.P
    public final androidx.compose.ui.layout.F d(final androidx.compose.ui.layout.Y[] yArr, androidx.compose.ui.layout.H h8, final int[] iArr, int i10, final int i11, int[] iArr2, int i12, int i13, int i14) {
        return h8.y1(i10, i11, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.RowMeasurePolicy$placeHelper$1$1
            final /* synthetic */ int $beforeCrossAxisAlignmentLine = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                androidx.compose.ui.layout.Y[] yArr2 = yArr;
                T t8 = this;
                int i15 = i11;
                int[] iArr3 = iArr;
                int length = yArr2.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length) {
                    androidx.compose.ui.layout.Y y10 = yArr2[i16];
                    int i18 = i17 + 1;
                    kotlin.jvm.internal.i.b(y10);
                    Object objQ = y10.q();
                    Q q10 = objQ instanceof Q ? (Q) objQ : null;
                    t8.getClass();
                    r rVar = q10 != null ? q10.f10201c : null;
                    aVar2.d(y10, iArr3[i17], rVar != null ? rVar.a(i15 - y10.f14221c, LayoutDirection.f15717b) : t8.f10217b.a(0, i15 - y10.f14221c), 0.0f);
                    i16++;
                    i17 = i18;
                }
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.P
    public final int e(androidx.compose.ui.layout.Y y10) {
        return y10.f14221c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t8 = (T) obj;
        return kotlin.jvm.internal.i.a(this.f10216a, t8.f10216a) && kotlin.jvm.internal.i.a(this.f10217b, t8.f10217b);
    }

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        return C1787c0.o(this, p013b0.a.j(j), p013b0.a.i(j), p013b0.a.h(j), p013b0.a.g(j), h8.e1(this.f10216a.mo1getSpacingD9Ej5fM()), h8, list, new androidx.compose.ui.layout.Y[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int iE1 = interfaceC1167m.e1(this.f10216a.mo1getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC1166l interfaceC1166l = list.get(i12);
            float fH = com.google.android.gms.internal.measurement.Y.h(com.google.android.gms.internal.measurement.Y.g(interfaceC1166l));
            int iJ = interfaceC1166l.J(i10);
            if (fH == 0.0f) {
                i11 += iJ;
            } else if (fH > 0.0f) {
                f10 += fH;
                iMax = Math.max(iMax, Math.round(iJ / fH));
            }
        }
        return ((list.size() - 1) * iE1) + Math.round(iMax * f10) + i11;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10217b.f13405a) + (this.f10216a.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int iE1 = interfaceC1167m.e1(this.f10216a.mo1getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iE1, i10);
        List<? extends InterfaceC1166l> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC1166l interfaceC1166l = list.get(i11);
            float fH = com.google.android.gms.internal.measurement.Y.h(com.google.android.gms.internal.measurement.Y.g(interfaceC1166l));
            if (fH == 0.0f) {
                int iMin2 = Math.min(interfaceC1166l.J(BrazeLogger.SUPPRESS), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1166l.k0(iMin2));
            } else if (fH > 0.0f) {
                f10 += fH;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC1166l interfaceC1166l2 = list.get(i12);
            float fH2 = com.google.android.gms.internal.measurement.Y.h(com.google.android.gms.internal.measurement.Y.g(interfaceC1166l2));
            if (fH2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC1166l2.k0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fH2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int iE1 = interfaceC1167m.e1(this.f10216a.mo1getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC1166l interfaceC1166l = list.get(i12);
            float fH = com.google.android.gms.internal.measurement.Y.h(com.google.android.gms.internal.measurement.Y.g(interfaceC1166l));
            int I10 = interfaceC1166l.I(i10);
            if (fH == 0.0f) {
                i11 += I10;
            } else if (fH > 0.0f) {
                f10 += fH;
                iMax = Math.max(iMax, Math.round(I10 / fH));
            }
        }
        return ((list.size() - 1) * iE1) + Math.round(iMax * f10) + i11;
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int iE1 = interfaceC1167m.e1(this.f10216a.mo1getSpacingD9Ej5fM());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iE1, i10);
        List<? extends InterfaceC1166l> list2 = list;
        int size = list2.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC1166l interfaceC1166l = list.get(i11);
            float fH = com.google.android.gms.internal.measurement.Y.h(com.google.android.gms.internal.measurement.Y.g(interfaceC1166l));
            if (fH == 0.0f) {
                int iMin2 = Math.min(interfaceC1166l.J(BrazeLogger.SUPPRESS), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1166l.s(iMin2));
            } else if (fH > 0.0f) {
                f10 += fH;
            }
        }
        int iRound = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f10);
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC1166l interfaceC1166l2 = list.get(i12);
            float fH2 = com.google.android.gms.internal.measurement.Y.h(com.google.android.gms.internal.measurement.Y.g(interfaceC1166l2));
            if (fH2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC1166l2.s(iRound != Integer.MAX_VALUE ? Math.round(iRound * fH2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f10216a + ", verticalAlignment=" + this.f10217b + ')';
    }
}
