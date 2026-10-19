package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;

/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D {
    public static final FocusTargetNode a(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeR = C1185f.g(focusTargetNode).getFocusOwner().r();
        if (focusTargetNodeR == null || !focusTargetNodeR.f13997o) {
            return null;
        }
        return focusTargetNodeR;
    }

    public static final I.f b(FocusTargetNode focusTargetNode) {
        NodeCoordinator nodeCoordinator = focusTargetNode.f13992i;
        return nodeCoordinator != null ? kotlin.jvm.internal.n.h(nodeCoordinator).H(nodeCoordinator, false) : I.f.f3756e;
    }

    public static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        int iOrdinal;
        boolean z10 = focusTargetNode.f13985b.f13997o;
        if (!z10) {
            return null;
        }
        if (!z10) {
            R.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.c cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
        androidx.compose.ui.h.c cVar2 = focusTargetNode.f13985b;
        androidx.compose.ui.h.c cVar3 = cVar2.f13990g;
        if (cVar3 == null) {
            C1185f.a(cVar, cVar2);
        } else {
            cVar.b(cVar3);
        }
        while (true) {
            int i10 = cVar.f12945d;
            if (i10 == 0) {
                return null;
            }
            androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar.p(i10 - 1);
            if ((cVarB.f13988e & 1024) == 0) {
                C1185f.a(cVar, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.f13987d & 1024) != 0) {
                        androidx.compose.runtime.collection.c cVar4 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarB;
                                if (focusTargetNode2.f13985b.f13997o && ((iOrdinal = focusTargetNode2.c0().ordinal()) == 0 || iOrdinal == 1 || iOrdinal == 2)) {
                                    return focusTargetNode2;
                                }
                            } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                int i11 = 0;
                                for (androidx.compose.ui.h.c cVar5 = ((AbstractC1187h) cVarB).f14585q; cVar5 != null; cVar5 = cVar5.f13990g) {
                                    if ((cVar5.f13987d & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarB = cVar5;
                                        } else {
                                            if (cVar4 == null) {
                                                cVar4 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                            }
                                            if (cVarB != null) {
                                                cVar4.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar4.b(cVar5);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarB = C1185f.b(cVar4);
                        }
                        break;
                    }
                    cVarB = cVarB.f13990g;
                }
            }
        }
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator nodeCoordinator;
        LayoutNode layoutNode2;
        NodeCoordinator nodeCoordinator2 = focusTargetNode.f13992i;
        return (nodeCoordinator2 == null || (layoutNode = nodeCoordinator2.f14525n) == null || !layoutNode.r() || (nodeCoordinator = focusTargetNode.f13992i) == null || (layoutNode2 = nodeCoordinator.f14525n) == null || !layoutNode2.c()) ? false : true;
    }
}
