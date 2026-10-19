package androidx.compose.ui.node;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.ui.node.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1200v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        LayoutNode layoutNode = (LayoutNode) obj;
        LayoutNode layoutNode2 = (LayoutNode) obj2;
        float f10 = layoutNode.f14390H.f14641p.f14476G;
        float f11 = layoutNode2.f14390H.f14641p.f14476G;
        return f10 == f11 ? kotlin.jvm.internal.i.g(layoutNode.H(), layoutNode2.H()) : Float.compare(f10, f11);
    }
}
