package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Column.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0953m implements androidx.compose.ui.layout.E, P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0945e.l f10308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.d.b f10309b;

    public C0953m(C0945e.l lVar, androidx.compose.ui.d.b bVar) {
        this.f10308a = lVar;
        this.f10309b = bVar;
    }

    @Override // androidx.compose.foundation.layout.P
    public final void a(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.H h8) {
        this.f10308a.arrange(h8, i10, iArr, iArr2);
    }

    @Override // androidx.compose.foundation.layout.P
    public final long b(int i10, int i11, int i12, boolean z10) {
        C0953m c0953m = C0952l.f10307a;
        return !z10 ? p013b0.b.a(0, i12, i10, i11) : p013b0.a.C0206a.a(0, i12, i10, i11);
    }

    @Override // androidx.compose.foundation.layout.P
    public final int c(androidx.compose.ui.layout.Y y10) {
        return y10.f14221c;
    }

    @Override // androidx.compose.foundation.layout.P
    public final androidx.compose.ui.layout.F d(final androidx.compose.ui.layout.Y[] yArr, final androidx.compose.ui.layout.H h8, final int[] iArr, int i10, final int i11, int[] iArr2, int i12, int i13, int i14) {
        return h8.y1(i11, i10, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.ColumnMeasurePolicy$placeHelper$1$1
            final /* synthetic */ int $beforeCrossAxisAlignmentLine = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                androidx.compose.ui.layout.Y[] yArr2 = yArr;
                C0953m c0953m = this;
                int i15 = i11;
                androidx.compose.ui.layout.H h10 = h8;
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
                    LayoutDirection layoutDirection = h10.getLayoutDirection();
                    c0953m.getClass();
                    r rVar = q10 != null ? q10.f10201c : null;
                    aVar2.d(y10, rVar != null ? rVar.a(i15 - y10.f14220b, layoutDirection) : c0953m.f10309b.a(0, i15 - y10.f14220b, layoutDirection), iArr3[i17], 0.0f);
                    i16++;
                    i17 = i18;
                }
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.P
    public final int e(androidx.compose.ui.layout.Y y10) {
        return y10.f14220b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0953m)) {
            return false;
        }
        C0953m c0953m = (C0953m) obj;
        return kotlin.jvm.internal.i.a(this.f10308a, c0953m.f10308a) && kotlin.jvm.internal.i.a(this.f10309b, c0953m.f10309b);
    }

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        return C1787c0.o(this, p013b0.a.i(j), p013b0.a.j(j), p013b0.a.g(j), p013b0.a.h(j), h8.e1(this.f10308a.mo1getSpacingD9Ej5fM()), h8, list, new androidx.compose.ui.layout.Y[list.size()], 0, list.size(), null, 0);
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int iE1 = interfaceC1167m.e1(this.f10308a.mo1getSpacingD9Ej5fM());
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
                int iMin2 = Math.min(interfaceC1166l.s(BrazeLogger.SUPPRESS), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1166l.J(iMin2));
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
                iMax = Math.max(iMax, interfaceC1166l2.J(iRound != Integer.MAX_VALUE ? Math.round(iRound * fH2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int hashCode() {
        return this.f10309b.hashCode() + (this.f10308a.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int iE1 = interfaceC1167m.e1(this.f10308a.mo1getSpacingD9Ej5fM());
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
            int iK0 = interfaceC1166l.k0(i10);
            if (fH == 0.0f) {
                i11 += iK0;
            } else if (fH > 0.0f) {
                f10 += fH;
                iMax = Math.max(iMax, Math.round(iK0 / fH));
            }
        }
        return ((list.size() - 1) * iE1) + Math.round(iMax * f10) + i11;
    }

    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int iE1 = interfaceC1167m.e1(this.f10308a.mo1getSpacingD9Ej5fM());
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
                int iMin2 = Math.min(interfaceC1166l.s(BrazeLogger.SUPPRESS), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1166l.I(iMin2));
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
                iMax = Math.max(iMax, interfaceC1166l2.I(iRound != Integer.MAX_VALUE ? Math.round(iRound * fH2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        int iE1 = interfaceC1167m.e1(this.f10308a.mo1getSpacingD9Ej5fM());
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
            int iS = interfaceC1166l.s(i10);
            if (fH == 0.0f) {
                i11 += iS;
            } else if (fH > 0.0f) {
                f10 += fH;
                iMax = Math.max(iMax, Math.round(iS / fH));
            }
        }
        return ((list.size() - 1) * iE1) + Math.round(iMax * f10) + i11;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f10308a + ", horizontalAlignment=" + this.f10309b + ')';
    }
}
