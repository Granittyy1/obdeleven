package androidx.compose.ui.graphics;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.NodeCoordinator;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class BlockGraphicsLayerElement extends androidx.compose.ui.node.H<BlockGraphicsLayerModifier> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<U, p293xa.r> f13473b;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(Ia.l<? super U, p293xa.r> lVar) {
        this.f13473b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new BlockGraphicsLayerModifier(this.f13473b);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) cVar;
        blockGraphicsLayerModifier.f13474p = this.f13473b;
        NodeCoordinator nodeCoordinator = C1185f.d(blockGraphicsLayerModifier, 2).f14528q;
        if (nodeCoordinator != null) {
            nodeCoordinator.V1(blockGraphicsLayerModifier.f13474p, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && kotlin.jvm.internal.i.a(this.f13473b, ((BlockGraphicsLayerElement) obj).f13473b);
    }

    public final int hashCode() {
        return this.f13473b.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f13473b + ')';
    }
}
