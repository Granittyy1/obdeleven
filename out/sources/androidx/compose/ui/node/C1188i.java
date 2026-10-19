package androidx.compose.ui.node;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.ui.node.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1188i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14586a = new a();

    /* JADX INFO: renamed from: androidx.compose.ui.node.i$a */
    /* JADX INFO: compiled from: DepthSortedSet.kt */
    public static final class a implements Comparator<LayoutNode> {
        @Override // java.util.Comparator
        public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            LayoutNode layoutNode3 = layoutNode;
            LayoutNode layoutNode4 = layoutNode2;
            int iG = kotlin.jvm.internal.i.g(layoutNode3.f14414q, layoutNode4.f14414q);
            return iG != 0 ? iG : kotlin.jvm.internal.i.g(layoutNode3.hashCode(), layoutNode4.hashCode());
        }
    }
}
