package androidx.compose.animation;

import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.layout.Y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnimatedEnterExitMeasurePolicy implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f9253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9254b;

    public AnimatedEnterExitMeasurePolicy(g gVar) {
        this.f9253a = gVar;
    }

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Y yQ = list.get(i10).Q(j);
            iMax = Math.max(iMax, yQ.f14220b);
            iMax2 = Math.max(iMax2, yQ.f14221c);
            arrayList.add(yQ);
        }
        boolean zS0 = h8.S0();
        g gVar = this.f9253a;
        if (zS0) {
            this.f9254b = true;
            gVar.f9640a.setValue(new p013b0.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f9254b) {
            gVar.f9640a.setValue(new p013b0.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return h8.y1(iMax, iMax2, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                List<Y> list2 = arrayList;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    aVar2.d(list2.get(i11), 0, 0, 0.0f);
                }
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.layout.E
    public final int h(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iJ = list.get(0).J(i10);
        int iR = kotlin.collections.l.r(list);
        int i11 = 1;
        if (1 <= iR) {
            while (true) {
                int iJ2 = list.get(i11).J(i10);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return iJ;
    }

    @Override // androidx.compose.ui.layout.E
    public final int i(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iK0 = list.get(0).k0(i10);
        int iR = kotlin.collections.l.r(list);
        int i11 = 1;
        if (1 <= iR) {
            while (true) {
                int iK1 = list.get(i11).k0(i10);
                if (iK1 > iK0) {
                    iK0 = iK1;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return iK0;
    }

    @Override // androidx.compose.ui.layout.E
    public final int j(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int I10 = list.get(0).I(i10);
        int iR = kotlin.collections.l.r(list);
        int i11 = 1;
        if (1 <= iR) {
            while (true) {
                int I11 = list.get(i11).I(i10);
                if (I11 > I10) {
                    I10 = I11;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return I10;
    }

    @Override // androidx.compose.ui.layout.E
    public final int m(InterfaceC1167m interfaceC1167m, List<? extends InterfaceC1166l> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iS = list.get(0).s(i10);
        int iR = kotlin.collections.l.r(list);
        int i11 = 1;
        if (1 <= iR) {
            while (true) {
                int iS2 = list.get(i11).s(i10);
                if (iS2 > iS) {
                    iS = iS2;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return iS;
    }
}
