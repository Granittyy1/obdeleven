package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;

/* JADX INFO: compiled from: FocusRequesterModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final void a(v vVar) {
        androidx.compose.ui.h.c node = vVar.getNode();
        androidx.compose.runtime.collection.c cVar = null;
        while (true) {
            FocusRequesterModifierNodeKt$requestFocus$1$1 focusRequesterModifierNodeKt$requestFocus$1$1 = new Ia.l<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequesterModifierNodeKt$requestFocus$1$1
                @Override // Ia.l
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.valueOf(focusTargetNode.D(7));
                }
            };
            int i10 = 0;
            if (node == null) {
                if (!vVar.getNode().f13997o) {
                    R.a.b("visitChildren called on an unattached node");
                }
                androidx.compose.runtime.collection.c cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                androidx.compose.ui.h.c cVar3 = vVar.getNode().f13990g;
                if (cVar3 == null) {
                    C1185f.a(cVar2, vVar.getNode());
                } else {
                    cVar2.b(cVar3);
                }
                while (true) {
                    int i11 = cVar2.f12945d;
                    if (i11 == 0) {
                        return;
                    }
                    androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar2.p(i11 - 1);
                    if ((cVarB.f13988e & 1024) == 0) {
                        C1185f.a(cVar2, cVarB);
                    } else {
                        while (cVarB != null) {
                            if ((cVarB.f13987d & 1024) != 0) {
                                androidx.compose.runtime.collection.c cVar4 = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                                        if (focusTargetNode.R1().f13459a) {
                                            focusTargetNode.D(7);
                                            return;
                                        } else {
                                            F.e(focusTargetNode, 7, focusRequesterModifierNodeKt$requestFocus$1$1);
                                            return;
                                        }
                                    }
                                    if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                        int i12 = 0;
                                        for (androidx.compose.ui.h.c cVar5 = ((AbstractC1187h) cVarB).f14585q; cVar5 != null; cVar5 = cVar5.f13990g) {
                                            if ((cVar5.f13987d & 1024) != 0) {
                                                i12++;
                                                if (i12 == 1) {
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
                                        if (i12 == 1) {
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
            } else {
                if (node instanceof FocusTargetNode) {
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                    if (focusTargetNode2.R1().f13459a) {
                        focusTargetNode2.D(7);
                        return;
                    } else {
                        F.e(focusTargetNode2, 7, focusRequesterModifierNodeKt$requestFocus$1$1);
                        return;
                    }
                }
                if ((node.f13987d & 1024) != 0 && (node instanceof AbstractC1187h)) {
                    for (androidx.compose.ui.h.c cVar6 = ((AbstractC1187h) node).f14585q; cVar6 != null; cVar6 = cVar6.f13990g) {
                        if ((cVar6.f13987d & 1024) != 0) {
                            i10++;
                            if (i10 == 1) {
                                node = cVar6;
                            } else {
                                if (cVar == null) {
                                    cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                }
                                if (node != null) {
                                    cVar.b(node);
                                    node = null;
                                }
                                cVar.b(cVar6);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                node = C1185f.b(cVar);
            }
        }
    }
}
