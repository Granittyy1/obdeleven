package androidx.compose.ui.semantics;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.b0;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    public static final q a(LayoutNode layoutNode, boolean z10) {
        androidx.compose.ui.h.c cVar = layoutNode.f14389G.f14368e;
        Object obj = null;
        if ((cVar.f13988e & 8) != 0) {
            loop0: while (cVar != null) {
                if ((cVar.f13987d & 8) == 0) {
                    if ((cVar.f13988e & 8) != 0) {
                        break;
                        break;
                    }
                    cVar = cVar.f13990g;
                } else {
                    androidx.compose.ui.h.c cVarB = cVar;
                    androidx.compose.runtime.collection.c cVar2 = null;
                    while (cVarB != null) {
                        if (cVarB instanceof b0) {
                            obj = cVarB;
                            break loop0;
                        }
                        if ((cVarB.f13987d & 8) != 0 && (cVarB instanceof AbstractC1187h)) {
                            int i10 = 0;
                            for (androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) cVarB).f14585q; cVar3 != null; cVar3 = cVar3.f13990g) {
                                if ((cVar3.f13987d & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarB = cVar3;
                                    } else {
                                        if (cVar2 == null) {
                                            cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                        }
                                        if (cVarB != null) {
                                            cVar2.b(cVarB);
                                            cVarB = null;
                                        }
                                        cVar2.b(cVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarB = C1185f.b(cVar2);
                    }
                    if ((cVar.f13988e & 8) != 0) {
                        break;
                    }
                    cVar = cVar.f13990g;
                }
            }
        }
        kotlin.jvm.internal.i.b(obj);
        androidx.compose.ui.h.c node = ((b0) obj).getNode();
        l lVarF = layoutNode.f();
        if (lVarF == null) {
            lVarF = new l();
        }
        return new q(node, z10, layoutNode, lVarF);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006a A[LOOP:0: B:4:0x000b->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x006d A[EDGE_INSN: B:42:0x006d->B:38:0x006d BREAK  A[LOOP:0: B:4:0x000b->B:37:0x006a], SYNTHETIC] */
    public static final b0 b(LayoutNode layoutNode) {
        androidx.compose.ui.h.c cVar = layoutNode.f14389G.f14368e;
        Object obj = null;
        if ((cVar.f13988e & 8) != 0) {
            loop0: while (cVar != null) {
                if ((cVar.f13987d & 8) == 0) {
                    if ((cVar.f13988e & 8) != 0) {
                        break;
                        break;
                    }
                    cVar = cVar.f13990g;
                } else {
                    androidx.compose.ui.h.c cVarB = cVar;
                    androidx.compose.runtime.collection.c cVar2 = null;
                    while (cVarB != null) {
                        if (cVarB instanceof b0) {
                            if (((b0) cVarB).v1()) {
                                obj = cVarB;
                                break loop0;
                            }
                        } else if ((cVarB.f13987d & 8) != 0 && (cVarB instanceof AbstractC1187h)) {
                            int i10 = 0;
                            for (androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) cVarB).f14585q; cVar3 != null; cVar3 = cVar3.f13990g) {
                                if ((cVar3.f13987d & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarB = cVar3;
                                    } else {
                                        if (cVar2 == null) {
                                            cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                        }
                                        if (cVarB != null) {
                                            cVar2.b(cVarB);
                                            cVarB = null;
                                        }
                                        cVar2.b(cVar3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarB = C1185f.b(cVar2);
                    }
                    if ((cVar.f13988e & 8) != 0) {
                        break;
                    }
                    cVar = cVar.f13990g;
                }
            }
        }
        return (b0) obj;
    }
}
