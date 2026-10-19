package androidx.compose.ui.node;

import androidx.compose.ui.layout.InterfaceC1167m;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: MeasureScopeWithLayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G {
    public static final ArrayList a(InterfaceC1167m interfaceC1167m) {
        kotlin.jvm.internal.i.c(interfaceC1167m, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNodeN1 = ((F) interfaceC1167m).n1();
        boolean zB = b(layoutNodeN1);
        List<LayoutNode> listB = layoutNodeN1.B();
        androidx.compose.runtime.collection.c.a aVar = (androidx.compose.runtime.collection.c.a) listB;
        ArrayList arrayList = new ArrayList(aVar.f12946b.f12945d);
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode = (LayoutNode) aVar.get(i10);
            arrayList.add(zB ? layoutNode.y() : layoutNode.z());
        }
        return arrayList;
    }

    public static final boolean b(LayoutNode layoutNode) {
        int iOrdinal = layoutNode.f14390H.f14630d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return true;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return true;
                }
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                LayoutNode layoutNodeG = layoutNode.G();
                if (layoutNodeG != null) {
                    return b(layoutNodeG);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return false;
    }
}
