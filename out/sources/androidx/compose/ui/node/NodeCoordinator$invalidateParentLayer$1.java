package androidx.compose.ui.node;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NodeCoordinator$invalidateParentLayer$1 extends Lambda implements Ia.a<p293xa.r> {
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$invalidateParentLayer$1(NodeCoordinator nodeCoordinator) {
        super(0);
        this.this$0 = nodeCoordinator;
    }

    @Override // Ia.a
    public final p293xa.r invoke() {
        NodeCoordinator nodeCoordinator = this.this$0.f14529r;
        if (nodeCoordinator != null) {
            nodeCoordinator.G1();
        }
        return p293xa.r.f47939a;
    }
}
