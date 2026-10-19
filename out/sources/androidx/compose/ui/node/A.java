package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import java.util.Map;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A extends AlignmentLines {
    @Override // androidx.compose.ui.node.AlignmentLines
    public final long b(NodeCoordinator nodeCoordinator, long j) {
        D dR1 = nodeCoordinator.r1();
        kotlin.jvm.internal.i.b(dR1);
        long j10 = dR1.f14345o;
        return I.d.g((((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L), j);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final Map<AbstractC1155a, Integer> c(NodeCoordinator nodeCoordinator) {
        D dR1 = nodeCoordinator.r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.F0().o();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final int d(NodeCoordinator nodeCoordinator, AbstractC1155a abstractC1155a) {
        D dR1 = nodeCoordinator.r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.V(abstractC1155a);
    }
}
