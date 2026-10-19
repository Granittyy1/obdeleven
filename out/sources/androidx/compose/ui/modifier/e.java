package androidx.compose.ui.modifier;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1184e;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public interface e extends g, InterfaceC1184e {
    default C.g N0() {
        return b.f14301c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // androidx.compose.ui.modifier.g
    default Object s(h hVar) {
        K k10;
        if (!getNode().f13997o) {
            R.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!getNode().f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.h.c cVar = getNode().f13989f;
        LayoutNode layoutNodeF = C1185f.f(this);
        while (layoutNodeF != null) {
            if ((layoutNodeF.f14389G.f14368e.f13988e & 32) != 0) {
                while (cVar != null) {
                    if ((cVar.f13987d & 32) != 0) {
                        ?? B10 = cVar;
                        ?? cVar2 = 0;
                        while (B10 != 0) {
                            if (B10 instanceof e) {
                                e eVar = (e) B10;
                                if (eVar.N0().I(hVar)) {
                                    return eVar.N0().M(hVar);
                                }
                            } else if ((B10.f13987d & 32) != 0 && (B10 instanceof AbstractC1187h)) {
                                androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                                int i10 = 0;
                                B10 = B10;
                                cVar2 = cVar2;
                                while (cVar3 != null) {
                                    if ((cVar3.f13987d & 32) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar2 = cVar2;
                                            B10 = cVar3;
                                        } else {
                                            if (cVar2 == 0) {
                                                cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                            }
                                            if (B10 != 0) {
                                                cVar2.b(B10);
                                                B10 = 0;
                                            }
                                            cVar2.b(cVar3);
                                        }
                                    }
                                    cVar3 = cVar3.f13990g;
                                    B10 = B10;
                                    cVar2 = cVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            B10 = C1185f.b(cVar2);
                        }
                    }
                    cVar = cVar.f13989f;
                }
            }
            layoutNodeF = layoutNodeF.G();
            cVar = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
        }
        return hVar.f14302a.invoke();
    }
}
