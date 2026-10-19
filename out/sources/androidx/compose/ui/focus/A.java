package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: FocusTargetNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {
    public static final void a(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        AndroidComposeView androidComposeView;
        NodeCoordinator nodeCoordinator = focusTargetNode.f13985b.f13992i;
        if (nodeCoordinator == null || (layoutNode = nodeCoordinator.f14525n) == null || (androidComposeView = layoutNode.f14412o) == null) {
            return;
        }
        androidComposeView.getFocusOwner();
    }
}
