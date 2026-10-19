package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.layout.X;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.InterfaceC1193n;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.O;
import androidx.compose.ui.node.P;
import androidx.compose.ui.node.b0;
import androidx.compose.ui.node.e0;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FocusableNode extends AbstractC1187h implements b0, InterfaceC1193n, InterfaceC1182c, O, e0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f9759y = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.foundation.interaction.k f9760r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Ia.l<Boolean, p293xa.r> f9761s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.compose.foundation.interaction.d f9762t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public X.a f9763u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public NodeCoordinator f9764v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.compose.ui.focus.z f9765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Ia.a<Boolean> f9766x;

    /* JADX INFO: compiled from: Focusable.kt */
    public static final class a {
    }

    public FocusableNode() {
        throw null;
    }

    public FocusableNode(androidx.compose.foundation.interaction.k kVar, int i10, Ia.l lVar) {
        this.f9760r = kVar;
        this.f9761s = lVar;
        FocusTargetNode focusTargetNode = new FocusTargetNode(i10, new FocusableNode$focusTargetNode$1(2, this, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 4);
        Q1(focusTargetNode);
        this.f9765w = focusTargetNode;
    }

    @Override // androidx.compose.ui.node.e0
    public final Object J() {
        return f9759y;
    }

    @Override // androidx.compose.ui.h.c
    public final void K1() {
        X.a aVar = this.f9763u;
        if (aVar != null) {
            aVar.a();
        }
        this.f9763u = null;
    }

    public final void T1(final androidx.compose.foundation.interaction.k kVar, final androidx.compose.foundation.interaction.i iVar) {
        if (!this.f13997o) {
            kVar.a(iVar);
            return;
        }
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) ((kotlinx.coroutines.internal.f) E1()).f43473b.get(InterfaceC2694i0.b.f43449b);
        C2680e.c(E1(), null, null, new FocusableNode$emitWithFallback$1(kVar, iVar, interfaceC2694i0 != null ? interfaceC2694i0.B(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.foundation.FocusableNode$emitWithFallback$handler$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th) {
                kVar.a(iVar);
                return p293xa.r.f47939a;
            }
        }) : null, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final q U1() {
        e0 e0Var;
        androidx.compose.ui.node.K k10;
        if (!this.f13997o) {
            return null;
        }
        q.a aVar = q.f11018r;
        if (!this.f13985b.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.h.c cVar = this.f13985b.f13989f;
        LayoutNode layoutNodeF = C1185f.f(this);
        loop0: while (true) {
            if (layoutNodeF == null) {
                e0Var = null;
                break;
            }
            if ((layoutNodeF.f14389G.f14368e.f13988e & 262144) != 0) {
                while (cVar != null) {
                    if ((cVar.f13987d & 262144) != 0) {
                        ?? cVar2 = 0;
                        ?? B10 = cVar;
                        while (B10 != 0) {
                            if (B10 instanceof e0) {
                                e0Var = (e0) B10;
                                if (aVar.equals(e0Var.J())) {
                                    break loop0;
                                }
                            } else if ((B10.f13987d & 262144) != 0 && (B10 instanceof AbstractC1187h)) {
                                androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                                int i10 = 0;
                                B10 = B10;
                                cVar2 = cVar2;
                                while (cVar3 != null) {
                                    if ((cVar3.f13987d & 262144) != 0) {
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
        if (e0Var instanceof q) {
            return (q) e0Var;
        }
        return null;
    }

    public final void V1(androidx.compose.foundation.interaction.k kVar) {
        androidx.compose.foundation.interaction.d dVar;
        if (kotlin.jvm.internal.i.a(this.f9760r, kVar)) {
            return;
        }
        androidx.compose.foundation.interaction.k kVar2 = this.f9760r;
        if (kVar2 != null && (dVar = this.f9762t) != null) {
            kVar2.a(new androidx.compose.foundation.interaction.e(dVar));
        }
        this.f9762t = null;
        this.f9760r = kVar;
    }

    @Override // androidx.compose.ui.node.O
    public final void a1() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        P.a(this, new FocusableNode$retrievePinnableContainer$1(ref$ObjectRef, this));
        X x10 = (X) ref$ObjectRef.element;
        if (this.f9765w.c0().b()) {
            X.a aVar = this.f9763u;
            if (aVar != null) {
                aVar.a();
            }
            this.f9763u = x10 != null ? x10.b() : null;
        }
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(androidx.compose.ui.semantics.w wVar) {
        boolean zB = this.f9765w.c0().b();
        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
        androidx.compose.ui.semantics.v<Boolean> vVar = SemanticsProperties.f15157k;
        Oa.l<Object> lVar = androidx.compose.ui.semantics.t.f15251a[4];
        Boolean boolValueOf = Boolean.valueOf(zB);
        vVar.getClass();
        wVar.e(vVar, boolValueOf);
        if (this.f9766x == null) {
            this.f9766x = new Ia.a<Boolean>() { // from class: androidx.compose.foundation.FocusableNode$applySemantics$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final Boolean invoke() {
                    return Boolean.valueOf(this.this$0.f9765w.D(7));
                }
            };
        }
        wVar.e(androidx.compose.ui.semantics.k.f15229v, new androidx.compose.ui.semantics.a(null, this.f9766x));
    }

    @Override // androidx.compose.ui.node.InterfaceC1193n
    public final void w1(NodeCoordinator nodeCoordinator) {
        q qVarU1;
        this.f9764v = nodeCoordinator;
        if (this.f9765w.c0().b()) {
            if (!nodeCoordinator.v1().f13997o) {
                q qVarU2 = U1();
                if (qVarU2 != null) {
                    qVarU2.Q1(null);
                    return;
                }
                return;
            }
            NodeCoordinator nodeCoordinator2 = this.f9764v;
            if (nodeCoordinator2 == null || !nodeCoordinator2.v1().f13997o || (qVarU1 = U1()) == null) {
                return;
            }
            qVarU1.Q1(this.f9764v);
        }
    }
}
