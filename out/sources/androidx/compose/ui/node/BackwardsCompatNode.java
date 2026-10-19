package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1175v;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashSet;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BackwardsCompatNode extends androidx.compose.ui.h.c implements InterfaceC1198t, InterfaceC1191l, b0, Y, androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.g, W, InterfaceC1197s, InterfaceC1193n, androidx.compose.ui.focus.i, androidx.compose.ui.focus.s, androidx.compose.ui.focus.v, V, androidx.compose.ui.draw.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.compose.ui.h.b f14319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.ui.modifier.a f14321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public HashSet<androidx.compose.ui.modifier.c<?>> f14322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NodeCoordinator f14323t;

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    public static final class a implements U.a {
        public a() {
        }

        @Override // androidx.compose.ui.node.U.a
        public final void b() {
            BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
            if (backwardsCompatNode.f14323t == null) {
                backwardsCompatNode.o0(C1185f.d(backwardsCompatNode, 128));
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1175v) bVar).B(h8, d10, j);
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void E0() {
        this.f14320q = true;
        C1192m.a(this);
    }

    @Override // androidx.compose.ui.node.Y
    public final void G0() {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.v) bVar).p().getClass();
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        Q1(true);
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        R1();
    }

    @Override // androidx.compose.ui.modifier.e
    public final C.g N0() {
        androidx.compose.ui.modifier.a aVar = this.f14321r;
        return aVar != null ? aVar : androidx.compose.ui.modifier.b.f14301c;
    }

    public final void Q1(boolean z10) {
        if (!this.f13997o) {
            R.a.b("initializeModifier called on unattached node");
        }
        androidx.compose.ui.h.b bVar = this.f14319p;
        if ((this.f13987d & 32) != 0) {
            if (bVar instanceof androidx.compose.ui.modifier.d) {
                ((AndroidComposeView) C1185f.g(this)).O(new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        this.this$0.S1();
                        return p293xa.r.f47939a;
                    }
                });
            }
            if (bVar instanceof androidx.compose.ui.modifier.f) {
                androidx.compose.ui.modifier.f<?> fVar = (androidx.compose.ui.modifier.f) bVar;
                androidx.compose.ui.modifier.a aVar = this.f14321r;
                if (aVar == null || !aVar.I(fVar.getKey())) {
                    androidx.compose.ui.modifier.a aVar2 = new androidx.compose.ui.modifier.a();
                    aVar2.f14300c = fVar;
                    this.f14321r = aVar2;
                    if (BackwardsCompatNodeKt.a(this)) {
                        ModifierLocalManager modifierLocalManager = C1185f.g(this).getModifierLocalManager();
                        androidx.compose.ui.modifier.h<?> key = fVar.getKey();
                        modifierLocalManager.f14295b.b(this);
                        modifierLocalManager.f14296c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f14300c = fVar;
                    ModifierLocalManager modifierLocalManager2 = C1185f.g(this).getModifierLocalManager();
                    androidx.compose.ui.modifier.h<?> key2 = fVar.getKey();
                    modifierLocalManager2.f14295b.b(this);
                    modifierLocalManager2.f14296c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f13987d & 4) != 0) {
            if (bVar instanceof androidx.compose.ui.draw.d) {
                this.f14320q = true;
            }
            if (!z10) {
                C1185f.d(this, 2).G1();
            }
        }
        if ((this.f13987d & 2) != 0) {
            if (BackwardsCompatNodeKt.a(this)) {
                NodeCoordinator nodeCoordinator = this.f13992i;
                kotlin.jvm.internal.i.b(nodeCoordinator);
                ((C1199u) nodeCoordinator).Z1(this);
                T t8 = nodeCoordinator.f14523J;
                if (t8 != null) {
                    t8.invalidate();
                }
            }
            if (!z10) {
                C1185f.d(this, 2).G1();
                C1185f.f(this).O();
            }
        }
        if (bVar instanceof androidx.compose.ui.layout.a0) {
            ((androidx.compose.ui.layout.a0) bVar).s(C1185f.f(this));
        }
        if ((this.f13987d & 128) != 0) {
            if ((bVar instanceof androidx.compose.ui.layout.S) && BackwardsCompatNodeKt.a(this)) {
                C1185f.f(this).O();
            }
            if (bVar instanceof androidx.compose.ui.layout.Q) {
                this.f14323t = null;
                if (BackwardsCompatNodeKt.a(this)) {
                    U uG = C1185f.g(this);
                    AndroidComposeView androidComposeView = (AndroidComposeView) uG;
                    androidComposeView.f14676P.f14355f.b(new a());
                    androidComposeView.R(null);
                }
            }
        }
        if ((this.f13987d & 256) != 0 && (bVar instanceof androidx.compose.ui.layout.N) && BackwardsCompatNodeKt.a(this)) {
            C1185f.f(this).O();
        }
        if (bVar instanceof androidx.compose.ui.focus.t) {
            ((androidx.compose.ui.focus.t) bVar).n().f13431a.b(this);
        }
        if ((this.f13987d & 16) != 0 && (bVar instanceof androidx.compose.ui.input.pointer.v)) {
            ((androidx.compose.ui.input.pointer.v) bVar).p().f3048c = this.f13992i;
        }
        if ((this.f13987d & 8) != 0) {
            ((AndroidComposeView) C1185f.g(this)).K();
        }
    }

    public final void R1() {
        if (!this.f13997o) {
            R.a.b("unInitializeModifier called on unattached node");
        }
        androidx.compose.ui.h.b bVar = this.f14319p;
        if ((this.f13987d & 32) != 0) {
            if (bVar instanceof androidx.compose.ui.modifier.f) {
                ModifierLocalManager modifierLocalManager = C1185f.g(this).getModifierLocalManager();
                androidx.compose.ui.modifier.h key = ((androidx.compose.ui.modifier.f) bVar).getKey();
                modifierLocalManager.f14297d.b(C1185f.f(this));
                modifierLocalManager.f14298e.b(key);
                modifierLocalManager.a();
            }
            if (bVar instanceof androidx.compose.ui.modifier.d) {
                ((androidx.compose.ui.modifier.d) bVar).m(BackwardsCompatNodeKt.f14325a);
            }
        }
        if ((this.f13987d & 8) != 0) {
            ((AndroidComposeView) C1185f.g(this)).K();
        }
        if (bVar instanceof androidx.compose.ui.focus.t) {
            ((androidx.compose.ui.focus.t) bVar).n().f13431a.m(this);
        }
    }

    public final void S1() {
        if (this.f13997o) {
            this.f14322s.clear();
            C1185f.g(this).getSnapshotObserver().b(this, BackwardsCompatNodeKt.f14327c, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    androidx.compose.ui.h.b bVar = this.this$0.f14319p;
                    kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((androidx.compose.ui.modifier.d) bVar).m(this.this$0);
                    return p293xa.r.f47939a;
                }
            });
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1197s
    public final void T(long j) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        if (bVar instanceof androidx.compose.ui.layout.S) {
            ((androidx.compose.ui.layout.S) bVar).w();
        }
    }

    @Override // androidx.compose.ui.focus.i
    public final void V0(FocusStateImpl focusStateImpl) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        if (!(bVar instanceof androidx.compose.ui.focus.g)) {
            R.a.b("onFocusEvent called on wrong node");
        }
        ((androidx.compose.ui.focus.g) bVar).t();
    }

    @Override // androidx.compose.ui.node.V
    public final boolean a0() {
        return this.f13997o;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1175v) bVar).c(lookaheadCapablePlaceable, interfaceC1166l, i10);
    }

    @Override // androidx.compose.ui.focus.s
    public final void g0(androidx.compose.ui.focus.q qVar) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        if (!(bVar instanceof androidx.compose.ui.focus.o)) {
            R.a.b("applyFocusProperties called on wrong node");
        }
        ((androidx.compose.ui.focus.o) bVar).z();
    }

    @Override // androidx.compose.ui.draw.a
    public final p013b0.c getDensity() {
        return C1185f.f(this).f14423z;
    }

    @Override // androidx.compose.ui.draw.a
    public final LayoutDirection getLayoutDirection() {
        return C1185f.f(this).f14383A;
    }

    @Override // androidx.compose.ui.draw.a
    public final long j() {
        return A8.A.k(C1185f.d(this, 128).f14222d);
    }

    @Override // androidx.compose.ui.node.Y
    public final boolean l1() {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.v) bVar).p().getClass();
        return true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1175v) bVar).o(lookaheadCapablePlaceable, interfaceC1166l, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1197s
    public final void o0(NodeCoordinator nodeCoordinator) {
        this.f14323t = nodeCoordinator;
        androidx.compose.ui.h.b bVar = this.f14319p;
        if (bVar instanceof androidx.compose.ui.layout.Q) {
            ((androidx.compose.ui.layout.Q) bVar).h();
        }
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(androidx.compose.ui.semantics.w wVar) {
        int i10;
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        androidx.compose.ui.semantics.l lVarF = ((androidx.compose.ui.semantics.o) bVar).f();
        kotlin.jvm.internal.i.c(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        androidx.compose.ui.semantics.l lVar = (androidx.compose.ui.semantics.l) wVar;
        if (lVarF.f15236d) {
            lVar.f15236d = true;
        }
        if (lVarF.f15237e) {
            lVar.f15237e = true;
        }
        androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k10 = lVarF.f15234b;
        Object[] objArr = k10.f9128b;
        Object[] objArr2 = k10.f9129c;
        long[] jArr = k10.f9127a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j = jArr[i11];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        androidx.compose.ui.semantics.v<?> vVar = (androidx.compose.ui.semantics.v) obj;
                        androidx.collection.K<androidx.compose.ui.semantics.v<?>, Object> k11 = lVar.f15234b;
                        if (!k11.a(vVar)) {
                            k11.l(vVar, obj2);
                        } else if (obj2 instanceof androidx.compose.ui.semantics.a) {
                            Object objD = k11.d(vVar);
                            kotlin.jvm.internal.i.c(objD, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            androidx.compose.ui.semantics.a aVar = (androidx.compose.ui.semantics.a) objD;
                            String str = aVar.f15190a;
                            if (str == null) {
                                str = ((androidx.compose.ui.semantics.a) obj2).f15190a;
                            }
                            p293xa.e eVar = aVar.f15191b;
                            if (eVar == null) {
                                eVar = ((androidx.compose.ui.semantics.a) obj2).f15191b;
                            }
                            k11.l(vVar, new androidx.compose.ui.semantics.a(str, eVar));
                        }
                        i10 = 8;
                    } else {
                        i10 = i12;
                    }
                    j >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1175v) bVar).q(lookaheadCapablePlaceable, interfaceC1166l, i10);
    }

    @Override // androidx.compose.ui.node.Y
    public final void q0(androidx.compose.ui.input.pointer.j jVar, PointerEventPass pointerEventPass, long j) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.v) bVar).p().J(jVar, pointerEventPass);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1175v) bVar).r(lookaheadCapablePlaceable, interfaceC1166l, i10);
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
    @Override // androidx.compose.ui.modifier.e, androidx.compose.ui.modifier.g
    public final Object s(androidx.compose.ui.modifier.h hVar) {
        K k10;
        this.f14322s.add(hVar);
        if (!this.f13985b.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.h.c cVar = this.f13985b.f13989f;
        LayoutNode layoutNodeF = C1185f.f(this);
        while (layoutNodeF != null) {
            if ((layoutNodeF.f14389G.f14368e.f13988e & 32) != 0) {
                while (cVar != null) {
                    if ((cVar.f13987d & 32) != 0) {
                        ?? B10 = cVar;
                        ?? cVar2 = 0;
                        while (B10 != 0) {
                            if (B10 instanceof androidx.compose.ui.modifier.e) {
                                androidx.compose.ui.modifier.e eVar = (androidx.compose.ui.modifier.e) B10;
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

    public final String toString() {
        return this.f14319p.toString();
    }

    @Override // androidx.compose.ui.node.Y
    public final void u0() {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((androidx.compose.ui.input.pointer.v) bVar).p().I();
    }

    @Override // androidx.compose.ui.node.W
    public final Object u1(p013b0.c cVar, Object obj) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((androidx.compose.ui.layout.W) bVar).v();
    }

    @Override // androidx.compose.ui.node.InterfaceC1184e, androidx.compose.ui.node.Y
    public final void w() {
        if (this.f14319p instanceof androidx.compose.ui.input.pointer.v) {
            u0();
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1193n
    public final void w1(NodeCoordinator nodeCoordinator) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((androidx.compose.ui.layout.N) bVar).y();
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        androidx.compose.ui.h.b bVar = this.f14319p;
        kotlin.jvm.internal.i.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        androidx.compose.ui.draw.e eVar = (androidx.compose.ui.draw.e) bVar;
        if (this.f14320q && (bVar instanceof androidx.compose.ui.draw.d)) {
            final androidx.compose.ui.h.b bVar2 = this.f14319p;
            if (bVar2 instanceof androidx.compose.ui.draw.d) {
                C1185f.g(this).getSnapshotObserver().b(this, BackwardsCompatNodeKt.f14326b, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        ((androidx.compose.ui.draw.d) bVar2).u();
                        return p293xa.r.f47939a;
                    }
                });
            }
            this.f14320q = false;
        }
        eVar.x(c1202x);
    }
}
