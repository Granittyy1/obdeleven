package androidx.compose.ui.semantics;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1184e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.h.c f15239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutNode f15241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f15242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f15244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15245g;

    /* JADX INFO: compiled from: SemanticsNode.kt */
    public static final class a extends androidx.compose.ui.h.c implements b0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Lambda f15246p;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l<? super w, p293xa.r> lVar) {
            this.f15246p = (Lambda) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.compose.ui.node.b0
        public final void p1(w wVar) {
            this.f15246p.invoke(wVar);
        }
    }

    public q(androidx.compose.ui.h.c cVar, boolean z10, LayoutNode layoutNode, l lVar) {
        this.f15239a = cVar;
        this.f15240b = z10;
        this.f15241c = layoutNode;
        this.f15242d = lVar;
        this.f15245g = layoutNode.f14401c;
    }

    public static /* synthetic */ List h(q qVar, boolean z10, int i10) {
        boolean z11 = (i10 & 1) != 0 ? !qVar.f15240b : false;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return qVar.g(z11, z10, false);
    }

    public final q a(i iVar, Ia.l<? super w, p293xa.r> lVar) {
        l lVar2 = new l();
        lVar2.f15236d = false;
        lVar2.f15237e = false;
        lVar.invoke(lVar2);
        q qVar = new q(new a(lVar), false, new LayoutNode(this.f15245g + (iVar != null ? 1000000000 : 2000000000), true), lVar2);
        qVar.f15243e = true;
        qVar.f15244f = this;
        return qVar;
    }

    public final void b(LayoutNode layoutNode, List<q> list, boolean z10) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarI = layoutNode.I();
        LayoutNode[] layoutNodeArr = cVarI.f12943b;
        int i10 = cVarI.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (layoutNode2.c() && (z10 || !layoutNode2.f14399Q)) {
                if (layoutNode2.f14389G.d(8)) {
                    list.add(r.a(layoutNode2, this.f15240b));
                } else {
                    b(layoutNode2, list, z10);
                }
            }
        }
    }

    public final NodeCoordinator c() {
        if (this.f15243e) {
            q qVarJ = j();
            if (qVarJ != null) {
                return qVarJ.c();
            }
            return null;
        }
        InterfaceC1184e interfaceC1184eB = r.b(this.f15241c);
        if (interfaceC1184eB == null) {
            interfaceC1184eB = this.f15239a;
        }
        return C1185f.d(interfaceC1184eB, 8);
    }

    public final void d(ArrayList arrayList, List list) {
        o(arrayList, false, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            q qVar = (q) arrayList.get(size2);
            if (qVar.l()) {
                list.add(qVar);
            } else if (!qVar.f15242d.f15237e) {
                qVar.d(arrayList, list);
            }
        }
    }

    public final I.f e() {
        NodeCoordinator nodeCoordinatorC = c();
        if (nodeCoordinatorC != null) {
            if (!nodeCoordinatorC.v1().f13997o) {
                nodeCoordinatorC = null;
            }
            if (nodeCoordinatorC != null) {
                return kotlin.jvm.internal.n.h(nodeCoordinatorC).H(nodeCoordinatorC, true);
            }
        }
        return I.f.f3756e;
    }

    public final I.f f() {
        NodeCoordinator nodeCoordinatorC = c();
        if (nodeCoordinatorC != null) {
            if (!nodeCoordinatorC.v1().f13997o) {
                nodeCoordinatorC = null;
            }
            if (nodeCoordinatorC != null) {
                return kotlin.jvm.internal.n.c(nodeCoordinatorC);
            }
        }
        return I.f.f3756e;
    }

    public final List<q> g(boolean z10, boolean z11, boolean z12) {
        if (!z10 && this.f15242d.f15237e) {
            return EmptyList.f42983b;
        }
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return o(arrayList, z11, z12);
        }
        List arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    public final l i() {
        boolean zL = l();
        l lVar = this.f15242d;
        if (!zL) {
            return lVar;
        }
        l lVarK = lVar.k();
        n(new ArrayList(), lVarK);
        return lVarK;
    }

    public final q j() {
        LayoutNode layoutNodeG;
        q qVar = this.f15244f;
        if (qVar != null) {
            return qVar;
        }
        LayoutNode layoutNode = this.f15241c;
        boolean z10 = this.f15240b;
        if (!z10) {
            layoutNodeG = null;
            break;
        }
        layoutNodeG = layoutNode.G();
        while (true) {
            if (layoutNodeG == null) {
                layoutNodeG = null;
                break;
            }
            l lVarF = layoutNodeG.f();
            if (lVarF != null && lVarF.f15236d) {
                break;
            }
            layoutNodeG = layoutNodeG.G();
        }
        if (layoutNodeG == null) {
            for (LayoutNode layoutNodeG2 = layoutNode.G(); layoutNodeG2 != null; layoutNodeG2 = layoutNodeG2.G()) {
                if (layoutNodeG2.f14389G.d(8)) {
                    layoutNodeG = layoutNodeG2;
                }
            }
            layoutNodeG = null;
        }
        if (layoutNodeG == null) {
            return null;
        }
        return r.a(layoutNodeG, z10);
    }

    public final l k() {
        return this.f15242d;
    }

    public final boolean l() {
        return this.f15240b && this.f15242d.f15236d;
    }

    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    public final boolean m() {
        if (!this.f15243e && h(this, true, 4).isEmpty()) {
            LayoutNode layoutNodeG = this.f15241c.G();
            while (layoutNodeG != null) {
                l lVarF = layoutNodeG.f();
                if (lVarF == null || !lVarF.f15236d) {
                    layoutNodeG = layoutNodeG.G();
                } else if (layoutNodeG == null) {
                    return true;
                }
            }
            layoutNodeG = null;
            if (layoutNodeG == null) {
                return true;
            }
        }
        return false;
    }

    public final void n(ArrayList arrayList, l lVar) {
        if (this.f15242d.f15237e) {
            return;
        }
        o(arrayList, false, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            q qVar = (q) arrayList.get(size2);
            if (!qVar.l()) {
                lVar.A(qVar.f15242d);
                qVar.n(arrayList, lVar);
            }
        }
    }

    public final List<q> o(List<q> list, boolean z10, boolean z11) {
        if (this.f15243e) {
            return EmptyList.f42983b;
        }
        b(this.f15241c, list, z11);
        if (z10) {
            v<i> vVar = SemanticsProperties.f15169w;
            l lVar = this.f15242d;
            final i iVar = (i) SemanticsConfigurationKt.a(lVar, vVar);
            if (iVar != null && lVar.f15236d && !list.isEmpty()) {
                list.add(a(iVar, new Ia.l<w, p293xa.r>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(w wVar) {
                        t.k(wVar, iVar.f15203a);
                        return p293xa.r.f47939a;
                    }
                }));
            }
            v<List<String>> vVar2 = SemanticsProperties.f15148a;
            if (lVar.f15234b.b(vVar2) && !list.isEmpty() && lVar.f15236d) {
                List list2 = (List) SemanticsConfigurationKt.a(lVar, vVar2);
                final String str = list2 != null ? (String) kotlin.collections.q.P(list2) : null;
                if (str != null) {
                    list.add(0, a(null, new Ia.l<w, p293xa.r>() { // from class: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(w wVar) {
                            t.g(str, wVar);
                            return p293xa.r.f47939a;
                        }
                    }));
                }
            }
        }
        return list;
    }
}
