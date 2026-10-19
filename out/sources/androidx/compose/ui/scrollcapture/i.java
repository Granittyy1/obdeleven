package androidx.compose.ui.scrollcapture;

import A8.p;
import Ia.l;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.j;
import androidx.compose.ui.semantics.q;
import androidx.compose.ui.semantics.v;
import java.util.List;
import kotlin.jvm.internal.n;
import p013b0.k;
import p293xa.r;

/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    /* JADX WARN: Type inference failed for: r3v3, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public static final void a(q qVar, int i10, l<? super h, r> lVar) {
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new q[16]);
        List<q> listG = qVar.g(false, false, false);
        while (true) {
            cVar.e(cVar.f12945d, listG);
            while (true) {
                int i11 = cVar.f12945d;
                if (i11 == 0) {
                    return;
                }
                q qVar2 = (q) cVar.p(i11 - 1);
                if (!K0.e(qVar2)) {
                    v<r> vVar = SemanticsProperties.f15156i;
                    androidx.compose.ui.semantics.l lVar2 = qVar2.f15242d;
                    if (lVar2.f15234b.b(vVar)) {
                        continue;
                    } else {
                        NodeCoordinator nodeCoordinatorC = qVar2.c();
                        if (nodeCoordinatorC == null) {
                            throw C4.v.g("Expected semantics node to have a coordinator.");
                        }
                        k kVarD = p.D(n.c(nodeCoordinatorC));
                        if (kVarD.f20486a < kVarD.f20488c && kVarD.f20487b < kVarD.f20489d) {
                            Ia.p pVar = (Ia.p) SemanticsConfigurationKt.a(lVar2, androidx.compose.ui.semantics.k.f15213e);
                            j jVar = (j) SemanticsConfigurationKt.a(lVar2, SemanticsProperties.f15166t);
                            if (pVar == null || jVar == null || ((Number) jVar.f15205b.invoke()).floatValue() <= 0.0f) {
                                listG = qVar2.g(false, false, false);
                            } else {
                                int i12 = i10 + 1;
                                ((ScrollCapture$onScrollCaptureSearch$1) lVar).invoke(new h(qVar2, i12, kVarD, nodeCoordinatorC));
                                a(qVar2, i12, lVar);
                            }
                        }
                    }
                }
            }
        }
    }
}
