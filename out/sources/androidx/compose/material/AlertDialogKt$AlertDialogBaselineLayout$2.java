package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.layout.Y;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;

/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogBaselineLayout$2 implements androidx.compose.ui.layout.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AlertDialogKt$AlertDialogBaselineLayout$2 f11662a = new AlertDialogKt$AlertDialogBaselineLayout$2();

    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    @Override // androidx.compose.ui.layout.E
    public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List<? extends androidx.compose.ui.layout.D> list, long j) {
        androidx.compose.ui.layout.D d10;
        androidx.compose.ui.layout.D d11;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        final int i10;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                d10 = null;
                break;
            }
            d10 = list.get(i12);
            if (kotlin.jvm.internal.i.a(C1171q.a(d10), "title")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.D d12 = d10;
        final Y yQ = d12 != null ? d12.Q(p013b0.a.a(j, 0, 0, 0, 0, 11)) : null;
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                d11 = null;
                break;
            }
            d11 = list.get(i13);
            if (kotlin.jvm.internal.i.a(C1171q.a(d11), AttributeType.TEXT)) {
                break;
            }
            i13++;
        }
        androidx.compose.ui.layout.D d13 = d11;
        final Y yQ2 = d13 != null ? d13.Q(p013b0.a.a(j, 0, 0, 0, 0, 11)) : null;
        int iMax = Math.max(yQ != null ? yQ.f14220b : 0, yQ2 != null ? yQ2.f14220b : 0);
        if (yQ == null) {
            iIntValue = 0;
        } else {
            int iV = yQ.V(AlignmentLineKt.f14165a);
            Integer numValueOf = iV == Integer.MIN_VALUE ? null : Integer.valueOf(iV);
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
        }
        if (yQ == null) {
            iIntValue2 = 0;
        } else {
            int iV2 = yQ.V(AlignmentLineKt.f14166b);
            Integer numValueOf2 = iV2 == Integer.MIN_VALUE ? null : Integer.valueOf(iV2);
            if (numValueOf2 != null) {
                iIntValue2 = numValueOf2.intValue();
            } else {
                iIntValue2 = 0;
            }
        }
        final int iZ0 = h8.Z0(AlertDialogKt.f11659c) - iIntValue;
        if (yQ2 == null) {
            iIntValue3 = 0;
        } else {
            int iV3 = yQ2.V(AlignmentLineKt.f14165a);
            Integer numValueOf3 = iV3 != Integer.MIN_VALUE ? Integer.valueOf(iV3) : null;
            if (numValueOf3 != null) {
                iIntValue3 = numValueOf3.intValue();
            } else {
                iIntValue3 = 0;
            }
        }
        int iZ1 = yQ == null ? h8.Z0(AlertDialogKt.f11661e) : h8.Z0(AlertDialogKt.f11660d);
        int i14 = yQ != null ? yQ.f14221c + iZ0 : 0;
        if (yQ == null) {
            i10 = iZ1 - iIntValue3;
        } else {
            i10 = (iIntValue2 == 0 ? i14 - iIntValue3 : (iZ0 + iIntValue2) - iIntValue3) + iZ1;
        }
        if (yQ2 != null) {
            if (iIntValue2 == 0) {
                i11 = (yQ2.f14221c + iZ1) - iIntValue3;
            } else {
                i11 = ((yQ2.f14221c + iZ1) - iIntValue3) - ((yQ != null ? yQ.f14221c : 0) - iIntValue2);
            }
        }
        return h8.y1(iMax, i14 + i11, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                Y.a aVar2 = aVar;
                Y y10 = yQ;
                if (y10 != null) {
                    aVar2.d(y10, 0, iZ0, 0.0f);
                }
                Y y11 = yQ2;
                if (y11 != null) {
                    aVar2.d(y11, 0, i10, 0.0f);
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
