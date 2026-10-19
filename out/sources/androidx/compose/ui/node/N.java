package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.InterfaceC1157c;
import androidx.compose.ui.layout.InterfaceC1175v;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.collection.H<Object> f14506a = androidx.collection.P.a();

    public static final void a(androidx.compose.ui.h.c cVar, int i10, int i11) {
        if (!(cVar instanceof AbstractC1187h)) {
            b(cVar, i10 & cVar.f13987d, i11);
            return;
        }
        AbstractC1187h abstractC1187h = (AbstractC1187h) cVar;
        b(cVar, abstractC1187h.f14584p & i10, i11);
        int i12 = (~abstractC1187h.f14584p) & i10;
        for (androidx.compose.ui.h.c cVar2 = abstractC1187h.f14585q; cVar2 != null; cVar2 = cVar2.f13990g) {
            a(cVar2, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(androidx.compose.ui.h.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.F1()) {
            if ((i10 & 2) != 0 && (cVar instanceof InterfaceC1198t)) {
                C1185f.f((InterfaceC1198t) cVar).O();
                if (i11 == 2) {
                    NodeCoordinator nodeCoordinatorD = C1185f.d(cVar, 2);
                    nodeCoordinatorD.f14530s = true;
                    ((NodeCoordinator$invalidateParentLayer$1) nodeCoordinatorD.f14521H).invoke();
                    if (nodeCoordinatorD.f14523J != null) {
                        if (nodeCoordinatorD.f14524K != null) {
                            nodeCoordinatorD.f14524K = null;
                        }
                        nodeCoordinatorD.V1(null, false);
                        nodeCoordinatorD.f14525n.e0(false);
                    }
                }
            }
            if ((i10 & 128) != 0 && (cVar instanceof InterfaceC1197s) && i11 != 2) {
                C1185f.f(cVar).O();
            }
            if ((i10 & 256) != 0 && (cVar instanceof InterfaceC1193n) && i11 != 2) {
                LayoutNode layoutNodeF = C1185f.f(cVar);
                if (!layoutNodeF.C() && !layoutNodeF.D() && !layoutNodeF.f14398P) {
                    ((AndroidComposeView) C1203y.a(layoutNodeF)).Q(layoutNodeF);
                }
            }
            if ((i10 & 4) != 0 && (cVar instanceof InterfaceC1191l)) {
                C1192m.a((InterfaceC1191l) cVar);
            }
            if ((i10 & 8) != 0 && (cVar instanceof b0)) {
                C1185f.f(cVar).f14416s = true;
            }
            if ((i10 & 64) != 0 && (cVar instanceof W)) {
                C1204z c1204z = C1185f.f((W) cVar).f14390H;
                c1204z.f14641p.f14495s = true;
                LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.f14460x = true;
                }
            }
            if ((i10 & 2048) != 0 && (cVar instanceof androidx.compose.ui.focus.s)) {
                androidx.compose.ui.focus.s sVar = (androidx.compose.ui.focus.s) cVar;
                C1181b.f14577b = null;
                sVar.g0(C1181b.f14576a);
                if (C1181b.f14577b != null) {
                    if (!sVar.getNode().f13997o) {
                        R.a.b("visitChildren called on an unattached node");
                    }
                    androidx.compose.runtime.collection.c cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                    androidx.compose.ui.h.c cVar3 = sVar.getNode().f13990g;
                    if (cVar3 == null) {
                        C1185f.a(cVar2, sVar.getNode());
                    } else {
                        cVar2.b(cVar3);
                    }
                    while (true) {
                        int i12 = cVar2.f12945d;
                        if (i12 == 0) {
                            break;
                        }
                        androidx.compose.ui.h.c cVarB = (androidx.compose.ui.h.c) cVar2.p(i12 - 1);
                        if ((cVarB.f13988e & 1024) == 0) {
                            C1185f.a(cVar2, cVarB);
                        } else {
                            while (cVarB != null) {
                                if ((cVarB.f13987d & 1024) != 0) {
                                    androidx.compose.runtime.collection.c cVar4 = null;
                                    while (cVarB != null) {
                                        if (cVarB instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                                            C1185f.g(focusTargetNode).getFocusOwner().b(focusTargetNode);
                                        } else if ((cVarB.f13987d & 1024) != 0 && (cVarB instanceof AbstractC1187h)) {
                                            int i13 = 0;
                                            for (androidx.compose.ui.h.c cVar5 = ((AbstractC1187h) cVarB).f14585q; cVar5 != null; cVar5 = cVar5.f13990g) {
                                                if ((cVar5.f13987d & 1024) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
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
                                            if (i13 == 1) {
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
            }
            if ((i10 & 4096) == 0 || !(cVar instanceof androidx.compose.ui.focus.i)) {
                return;
            }
            androidx.compose.ui.focus.i iVar = (androidx.compose.ui.focus.i) cVar;
            C1185f.g(iVar).getFocusOwner().a(iVar);
        }
    }

    public static final void c(androidx.compose.ui.h.c cVar) {
        if (!cVar.f13997o) {
            R.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(cVar, -1, 0);
    }

    public static final int d(androidx.compose.ui.h.b bVar) {
        int i10 = bVar instanceof InterfaceC1175v ? 3 : 1;
        if (bVar instanceof androidx.compose.ui.draw.e) {
            i10 |= 4;
        }
        if (bVar instanceof androidx.compose.ui.semantics.o) {
            i10 |= 8;
        }
        if (bVar instanceof androidx.compose.ui.input.pointer.v) {
            i10 |= 16;
        }
        if ((bVar instanceof androidx.compose.ui.modifier.d) || (bVar instanceof androidx.compose.ui.modifier.f)) {
            i10 |= 32;
        }
        if (bVar instanceof androidx.compose.ui.focus.g) {
            i10 |= 4096;
        }
        if (bVar instanceof androidx.compose.ui.focus.o) {
            i10 |= 2048;
        }
        if (bVar instanceof androidx.compose.ui.layout.N) {
            i10 |= 256;
        }
        if (bVar instanceof androidx.compose.ui.layout.W) {
            i10 |= 64;
        }
        if ((bVar instanceof androidx.compose.ui.layout.Q) || (bVar instanceof androidx.compose.ui.layout.S)) {
            i10 |= 128;
        }
        return bVar instanceof androidx.compose.ui.relocation.a ? i10 | 524288 : i10;
    }

    public static final int e(androidx.compose.ui.h.c cVar) {
        int i10 = cVar.f13987d;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = cVar.getClass();
        androidx.collection.H<Object> h8 = f14506a;
        int iA = h8.a(cls);
        if (iA >= 0) {
            return h8.f9105c[iA];
        }
        int i11 = cVar instanceof InterfaceC1198t ? 3 : 1;
        if (cVar instanceof InterfaceC1191l) {
            i11 |= 4;
        }
        if (cVar instanceof b0) {
            i11 |= 8;
        }
        if (cVar instanceof Y) {
            i11 |= 16;
        }
        if (cVar instanceof androidx.compose.ui.modifier.e) {
            i11 |= 32;
        }
        if (cVar instanceof W) {
            i11 |= 64;
        }
        if (cVar instanceof InterfaceC1197s) {
            i11 |= 128;
        }
        if (cVar instanceof InterfaceC1193n) {
            i11 |= 256;
        }
        if (cVar instanceof InterfaceC1157c) {
            i11 |= 512;
        }
        if (cVar instanceof FocusTargetNode) {
            i11 |= 1024;
        }
        if (cVar instanceof androidx.compose.ui.focus.s) {
            i11 |= 2048;
        }
        if (cVar instanceof androidx.compose.ui.focus.i) {
            i11 |= 4096;
        }
        if (cVar instanceof O.f) {
            i11 |= 8192;
        }
        if (cVar instanceof Q.a) {
            i11 |= 16384;
        }
        if (cVar instanceof InterfaceC1182c) {
            i11 |= 32768;
        }
        if (cVar instanceof O.i) {
            i11 |= 131072;
        }
        if (cVar instanceof e0) {
            i11 |= 262144;
        }
        if (cVar instanceof androidx.compose.ui.relocation.a) {
            i11 |= 524288;
        }
        int i12 = cVar instanceof S ? 1048576 | i11 : i11;
        h8.g(i12, cls);
        return i12;
    }

    public static final int f(androidx.compose.ui.h.c cVar) {
        if (!(cVar instanceof AbstractC1187h)) {
            return e(cVar);
        }
        AbstractC1187h abstractC1187h = (AbstractC1187h) cVar;
        int iF = abstractC1187h.f14584p;
        for (androidx.compose.ui.h.c cVar2 = abstractC1187h.f14585q; cVar2 != null; cVar2 = cVar2.f13990g) {
            iF |= f(cVar2);
        }
        return iF;
    }

    public static final boolean g(int i10) {
        return (i10 & 128) != 0;
    }
}
