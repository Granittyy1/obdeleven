package androidx.compose.material3;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.C1165k;
import androidx.compose.ui.layout.C1171q;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarKt$OneRowSnackbar$2$1 implements androidx.compose.ui.layout.E {
    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        androidx.compose.ui.layout.D d10;
        androidx.compose.ui.layout.D d11;
        int iMax;
        final int i10;
        final int i11;
        int iV;
        List<? extends androidx.compose.ui.layout.D> list2 = list;
        int iMin = Math.min(p013b0.a.h(j), h8.e1(SnackbarKt.f12311a));
        int size = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                d10 = null;
                break;
            }
            d10 = list2.get(i12);
            if (kotlin.jvm.internal.i.a(C1171q.a(d10), "action")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.D d12 = d10;
        androidx.compose.ui.layout.Y yQ = d12 != null ? d12.Q(j) : null;
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                d11 = null;
                break;
            }
            d11 = list2.get(i13);
            if (kotlin.jvm.internal.i.a(C1171q.a(d11), "dismissAction")) {
                break;
            }
            i13++;
        }
        androidx.compose.ui.layout.D d13 = d11;
        final androidx.compose.ui.layout.Y yQ2 = d13 != null ? d13.Q(j) : null;
        int i14 = yQ != null ? yQ.f14220b : 0;
        int i15 = yQ != null ? yQ.f14221c : 0;
        int i16 = yQ2 != null ? yQ2.f14220b : 0;
        int i17 = yQ2 != null ? yQ2.f14221c : 0;
        int iE1 = ((iMin - i14) - i16) - (i16 == 0 ? h8.e1(SnackbarKt.f12317g) : 0);
        int iJ = p013b0.a.j(j);
        if (iE1 >= iJ) {
            iJ = iE1;
        }
        int size3 = list.size();
        int i18 = 0;
        while (i18 < size3) {
            androidx.compose.ui.layout.D d14 = list2.get(i18);
            if (kotlin.jvm.internal.i.a(C1171q.a(d14), AttributeType.TEXT)) {
                final androidx.compose.ui.layout.Y yQ3 = d14.Q(p013b0.a.a(j, 0, iJ, 0, 0, 9));
                C1165k c1165k = AlignmentLineKt.f14165a;
                int iV2 = yQ3.V(c1165k);
                int iV3 = yQ3.V(AlignmentLineKt.f14166b);
                boolean z10 = true;
                boolean z11 = (iV2 == Integer.MIN_VALUE || iV3 == Integer.MIN_VALUE) ? false : true;
                if (iV2 != iV3 && z11) {
                    z10 = false;
                }
                final int i19 = iMin - i16;
                final int i20 = i19 - i14;
                if (z10) {
                    iMax = Math.max(h8.e1(B.w.f1382f), Math.max(i15, i17));
                    int i21 = (iMax - yQ3.f14221c) / 2;
                    i11 = (yQ == null || (iV = yQ.V(c1165k)) == Integer.MIN_VALUE) ? 0 : (iV2 + i21) - iV;
                    i10 = i21;
                } else {
                    int iE2 = h8.e1(SnackbarKt.f12312b) - iV2;
                    iMax = Math.max(h8.e1(B.w.f1383g), yQ3.f14221c + iE2);
                    i10 = iE2;
                    i11 = yQ != null ? (iMax - yQ.f14221c) / 2 : 0;
                }
                final androidx.compose.ui.layout.Y y10 = yQ;
                final int i22 = yQ2 != null ? (iMax - yQ2.f14221c) / 2 : 0;
                return h8.y1(iMin, iMax, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                        androidx.compose.ui.layout.Y.a aVar2 = aVar;
                        androidx.compose.ui.layout.Y.a.g(aVar2, yQ3, 0, i10);
                        androidx.compose.ui.layout.Y y11 = yQ2;
                        if (y11 != null) {
                            androidx.compose.ui.layout.Y.a.g(aVar2, y11, i19, i22);
                        }
                        androidx.compose.ui.layout.Y y12 = y10;
                        if (y12 != null) {
                            androidx.compose.ui.layout.Y.a.g(aVar2, y12, i20, i11);
                        }
                        return p293xa.r.f47939a;
                    }
                });
            }
            i18++;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
