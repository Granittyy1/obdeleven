package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.C1165k;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.Y;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarKt$OneRowSnackbar$2$1 implements androidx.compose.ui.layout.E {
    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        int iMax;
        final int i10;
        final int i11;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.D d10 = list.get(i12);
            if (kotlin.jvm.internal.i.a(C1171q.a(d10), "action")) {
                final Y yQ = d10.Q(j);
                int iH = (p013b0.a.h(j) - yQ.f14220b) - h8.e1(SnackbarKt.f11815f);
                int iJ = p013b0.a.j(j);
                int i13 = iH < iJ ? iJ : iH;
                int size2 = list.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    androidx.compose.ui.layout.D d11 = list.get(i14);
                    if (kotlin.jvm.internal.i.a(C1171q.a(d11), AttributeType.TEXT)) {
                        final Y yQ2 = d11.Q(p013b0.a.a(j, 0, i13, 0, 0, 9));
                        C1165k c1165k = AlignmentLineKt.f14165a;
                        int iV = yQ2.V(c1165k);
                        int iV2 = yQ2.V(AlignmentLineKt.f14166b);
                        boolean z10 = true;
                        boolean z11 = (iV == Integer.MIN_VALUE || iV2 == Integer.MIN_VALUE) ? false : true;
                        if (iV != iV2 && z11) {
                            z10 = false;
                        }
                        final int iH2 = p013b0.a.h(j) - yQ.f14220b;
                        if (z10) {
                            iMax = Math.max(h8.e1(SnackbarKt.f11817h), yQ.f14221c);
                            int i15 = (iMax - yQ2.f14221c) / 2;
                            int iV3 = yQ.V(c1165k);
                            i11 = iV3 != Integer.MIN_VALUE ? (iV + i15) - iV3 : 0;
                            i10 = i15;
                        } else {
                            int iE1 = h8.e1(SnackbarKt.f11810a) - iV;
                            iMax = Math.max(h8.e1(SnackbarKt.f11818i), yQ2.f14221c + iE1);
                            i10 = iE1;
                            i11 = (iMax - yQ.f14221c) / 2;
                        }
                        return h8.y1(p013b0.a.h(j), iMax, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(Y.a aVar) {
                                Y.a aVar2 = aVar;
                                Y.a.g(aVar2, yQ2, 0, i10);
                                Y.a.g(aVar2, yQ, iH2, i11);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
