package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.node.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1201w extends AlignmentLines {
    @Override // androidx.compose.ui.node.AlignmentLines
    public final long b(NodeCoordinator nodeCoordinator, long j) {
        T t8 = nodeCoordinator.f14523J;
        if (t8 != null) {
            j = t8.e(j, false);
        }
        return Cb.a.k(j, nodeCoordinator.f14514A);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final Map<AbstractC1155a, Integer> c(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.F0().o();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final int d(NodeCoordinator nodeCoordinator, AbstractC1155a abstractC1155a) {
        return nodeCoordinator.V(abstractC1155a);
    }
}
