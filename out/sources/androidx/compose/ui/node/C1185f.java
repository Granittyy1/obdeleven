package androidx.compose.ui.node;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: androidx.compose.ui.node.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DelegatableNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1185f {
    public static final void a(androidx.compose.runtime.collection.c cVar, androidx.compose.ui.h.c cVar2) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = f(cVar2).J();
        int i10 = cVarJ.f12945d - 1;
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        if (i10 < layoutNodeArr.length) {
            while (i10 >= 0) {
                cVar.b(layoutNodeArr[i10].f14389G.f14368e);
                i10--;
            }
        }
    }

    public static final androidx.compose.ui.h.c b(androidx.compose.runtime.collection.c cVar) {
        int i10;
        if (cVar == null || (i10 = cVar.f12945d) == 0) {
            return null;
        }
        return (androidx.compose.ui.h.c) cVar.p(i10 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1198t c(androidx.compose.ui.h.c cVar) {
        if ((cVar.f13987d & 2) != 0) {
            if (cVar instanceof InterfaceC1198t) {
                return (InterfaceC1198t) cVar;
            }
            if (cVar instanceof AbstractC1187h) {
                androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) cVar).f14585q;
                while (cVar2 != 0) {
                    if (cVar2 instanceof InterfaceC1198t) {
                        return (InterfaceC1198t) cVar2;
                    }
                    cVar2 = (!(cVar2 instanceof AbstractC1187h) || (cVar2.f13987d & 2) == 0) ? cVar2.f13990g : ((AbstractC1187h) cVar2).f14585q;
                }
            }
        }
        return null;
    }

    public static final NodeCoordinator d(InterfaceC1184e interfaceC1184e, int i10) {
        NodeCoordinator nodeCoordinator = interfaceC1184e.getNode().f13992i;
        kotlin.jvm.internal.i.b(nodeCoordinator);
        if (nodeCoordinator.v1() != interfaceC1184e || !N.g(i10)) {
            return nodeCoordinator;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f14528q;
        kotlin.jvm.internal.i.b(nodeCoordinator2);
        return nodeCoordinator2;
    }

    public static final NodeCoordinator e(InterfaceC1184e interfaceC1184e) {
        if (!interfaceC1184e.getNode().f13997o) {
            R.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        NodeCoordinator nodeCoordinatorD = d(interfaceC1184e, 2);
        if (!nodeCoordinatorD.v1().f13997o) {
            R.a.b("LayoutCoordinates is not attached.");
        }
        return nodeCoordinatorD;
    }

    public static final LayoutNode f(InterfaceC1184e interfaceC1184e) {
        NodeCoordinator nodeCoordinator = interfaceC1184e.getNode().f13992i;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f14525n;
        }
        throw C4.v.g("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final U g(InterfaceC1184e interfaceC1184e) {
        AndroidComposeView androidComposeView = f(interfaceC1184e).f14412o;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        throw C4.v.g("This node does not have an owner.");
    }
}
