package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.C1165k;
import androidx.compose.ui.layout.Y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarKt$TextOnlySnackbar$2 implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SnackbarKt$TextOnlySnackbar$2 f11819a = new SnackbarKt$TextOnlySnackbar$2();

    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z10 = false;
        int iV = Integer.MIN_VALUE;
        int iV2 = Integer.MIN_VALUE;
        int iMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Y yQ = list.get(i10).Q(j);
            arrayList.add(yQ);
            C1165k c1165k = AlignmentLineKt.f14165a;
            if (yQ.V(c1165k) != Integer.MIN_VALUE && (iV == Integer.MIN_VALUE || yQ.V(c1165k) < iV)) {
                iV = yQ.V(c1165k);
            }
            C1165k c1165k2 = AlignmentLineKt.f14166b;
            if (yQ.V(c1165k2) != Integer.MIN_VALUE && (iV2 == Integer.MIN_VALUE || yQ.V(c1165k2) > iV2)) {
                iV2 = yQ.V(c1165k2);
            }
            iMax = Math.max(iMax, yQ.f14221c);
        }
        if (iV != Integer.MIN_VALUE && iV2 != Integer.MIN_VALUE) {
            z10 = true;
        }
        final int iMax2 = Math.max(h8.e1((iV == iV2 || !z10) ? SnackbarKt.f11817h : SnackbarKt.f11818i), iMax);
        return h8.y1(p013b0.a.h(j), iMax2, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                ArrayList<Y> arrayList2 = arrayList;
                int i11 = iMax2;
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Y y10 = arrayList2.get(i12);
                    Y.a.g(aVar2, y10, 0, (i11 - y10.f14221c) / 2);
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
