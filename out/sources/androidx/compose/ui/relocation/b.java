package androidx.compose.ui.relocation;

import A8.A;
import I.f;
import androidx.compose.runtime.collection.c;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1184e;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p293xa.r;

/* JADX INFO: compiled from: BringIntoViewModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final Object a(InterfaceC1184e interfaceC1184e, final Ia.a aVar, ContinuationImpl continuationImpl) {
        Object obj;
        K k10;
        if (!interfaceC1184e.getNode().f13997o) {
            return r.f47939a;
        }
        if (!interfaceC1184e.getNode().f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        h.c cVar = interfaceC1184e.getNode().f13989f;
        LayoutNode layoutNodeF = C1185f.f(interfaceC1184e);
        loop0: while (true) {
            obj = null;
            if (layoutNodeF == null) {
                break;
            }
            if ((layoutNodeF.f14389G.f14368e.f13988e & 524288) != 0) {
                while (cVar != null) {
                    if ((cVar.f13987d & 524288) != 0) {
                        h.c cVarB = cVar;
                        c cVar2 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof a) {
                                obj = cVarB;
                                break loop0;
                            }
                            if ((cVarB.f13987d & 524288) != 0 && (cVarB instanceof AbstractC1187h)) {
                                int i10 = 0;
                                for (h.c cVar3 = ((AbstractC1187h) cVarB).f14585q; cVar3 != null; cVar3 = cVar3.f13990g) {
                                    if ((cVar3.f13987d & 524288) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarB = cVar3;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new c(new h.c[16]);
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
                    }
                    cVar = cVar.f13989f;
                }
            }
            layoutNodeF = layoutNodeF.G();
            cVar = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
        }
        a aVar2 = (a) obj;
        if (aVar2 == null) {
            return r.f47939a;
        }
        final NodeCoordinator nodeCoordinatorE = C1185f.e(interfaceC1184e);
        Object objG1 = aVar2.g1(nodeCoordinatorE, new Ia.a<f>() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final f invoke() {
                f fVarInvoke;
                Ia.a<f> aVar3 = aVar;
                if (aVar3 != null && (fVarInvoke = aVar3.invoke()) != null) {
                    return fVarInvoke;
                }
                InterfaceC1170p interfaceC1170p = nodeCoordinatorE;
                if (!interfaceC1170p.c()) {
                    interfaceC1170p = null;
                }
                if (interfaceC1170p != null) {
                    return p111ia.c.a(0L, A.k(interfaceC1170p.a()));
                }
                return null;
            }
        }, continuationImpl);
        return objG1 == CoroutineSingletons.f43038b ? objG1 : r.f47939a;
    }
}
