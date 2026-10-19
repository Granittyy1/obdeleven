package androidx.compose.ui.node;

import java.util.Comparator;

/* JADX INFO: compiled from: OnPositionedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Q implements Comparator<LayoutNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q f14568b = new Q();

    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode layoutNode3 = layoutNode;
        LayoutNode layoutNode4 = layoutNode2;
        int iG = kotlin.jvm.internal.i.g(layoutNode4.f14414q, layoutNode3.f14414q);
        return iG != 0 ? iG : kotlin.jvm.internal.i.g(layoutNode3.hashCode(), layoutNode4.hashCode());
    }
}
