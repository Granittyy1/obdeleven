package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1190k;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.Y;
import androidx.compose.ui.node.d0;
import androidx.compose.ui.node.e0;
import java.util.Collection;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class HoverIconModifierNode extends androidx.compose.ui.h.c implements e0, Y, InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1190k f14025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1151b f14026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14028s;

    public HoverIconModifierNode(C1151b c1151b, boolean z10, C1190k c1190k) {
        this.f14025p = c1190k;
        this.f14026q = c1151b;
        this.f14027r = z10;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        U1();
    }

    @Override // androidx.compose.ui.node.Y
    public final long Q() {
        C1190k c1190k = this.f14025p;
        if (c1190k == null) {
            return d0.f14579a;
        }
        p013b0.c cVar = C1185f.f(this).f14423z;
        int i10 = d0.f14580b;
        return d0.a.b(cVar.e1(c1190k.f14587a), cVar.e1(c1190k.f14588b), cVar.e1(c1190k.f14589c), cVar.e1(c1190k.f14590d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q1() {
        C1151b c1151b;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Cb.a.n(this, new Ia.l<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.input.pointer.HoverIconModifierNode] */
            @Override // Ia.l
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                HoverIconModifierNode hoverIconModifierNode2 = hoverIconModifierNode;
                if (hoverIconModifierNode2.f14027r && hoverIconModifierNode2.f14028s) {
                    ref$ObjectRef.element = hoverIconModifierNode2;
                }
                return Boolean.TRUE;
            }
        });
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) ref$ObjectRef.element;
        if (hoverIconModifierNode == null || (c1151b = hoverIconModifierNode.f14026q) == null) {
            c1151b = this.f14026q;
        }
        R1(c1151b);
    }

    public abstract void R1(m mVar);

    public final void S1() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        if (!this.f14027r) {
            Cb.a.o(this, new Ia.l<HoverIconModifierNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final TraversableNode$Companion$TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                    if (!hoverIconModifierNode.f14028s) {
                        return TraversableNode$Companion$TraverseDescendantsAction.f14569b;
                    }
                    ref$BooleanRef.element = false;
                    return TraversableNode$Companion$TraverseDescendantsAction.f14571d;
                }
            });
        }
        if (ref$BooleanRef.element) {
            Q1();
        }
    }

    public abstract boolean T1(int i10);

    /* JADX WARN: Multi-variable type inference failed */
    public final void U1() {
        p293xa.r rVar;
        if (this.f14028s) {
            this.f14028s = false;
            if (this.f13997o) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Cb.a.n(this, new Ia.l<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.ui.input.pointer.HoverIconModifierNode] */
                    @Override // Ia.l
                    public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                        HoverIconModifierNode hoverIconModifierNode2 = hoverIconModifierNode;
                        Ref$ObjectRef<HoverIconModifierNode> ref$ObjectRef2 = ref$ObjectRef;
                        HoverIconModifierNode hoverIconModifierNode3 = ref$ObjectRef2.element;
                        if (hoverIconModifierNode3 == null && hoverIconModifierNode2.f14028s) {
                            ref$ObjectRef2.element = hoverIconModifierNode2;
                        } else if (hoverIconModifierNode3 != null && hoverIconModifierNode2.f14027r && hoverIconModifierNode2.f14028s) {
                            ref$ObjectRef2.element = hoverIconModifierNode2;
                        }
                        return Boolean.TRUE;
                    }
                });
                HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) ref$ObjectRef.element;
                if (hoverIconModifierNode != null) {
                    hoverIconModifierNode.Q1();
                    rVar = p293xa.r.f47939a;
                } else {
                    rVar = null;
                }
                if (rVar == null) {
                    R1(null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void V1(boolean z10) {
        HoverIconModifierNode hoverIconModifierNode;
        if (this.f14027r != z10) {
            this.f14027r = z10;
            if (z10) {
                if (this.f14028s) {
                    Q1();
                    return;
                }
                return;
            }
            boolean z11 = this.f14028s;
            if (z11 && z11) {
                if (z10) {
                    hoverIconModifierNode = this;
                } else {
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Cb.a.o(this, new Ia.l<HoverIconModifierNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.input.pointer.HoverIconModifierNode] */
                        @Override // Ia.l
                        public final TraversableNode$Companion$TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode2) {
                            HoverIconModifierNode hoverIconModifierNode3 = hoverIconModifierNode2;
                            TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = TraversableNode$Companion$TraverseDescendantsAction.f14569b;
                            if (!hoverIconModifierNode3.f14028s) {
                                return traversableNode$Companion$TraverseDescendantsAction;
                            }
                            ref$ObjectRef.element = hoverIconModifierNode3;
                            return hoverIconModifierNode3.f14027r ? TraversableNode$Companion$TraverseDescendantsAction.f14570c : traversableNode$Companion$TraverseDescendantsAction;
                        }
                    });
                    hoverIconModifierNode = (HoverIconModifierNode) ref$ObjectRef.element;
                    if (hoverIconModifierNode == null) {
                        hoverIconModifierNode = this;
                    }
                }
                hoverIconModifierNode.Q1();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.Y
    public final void q0(j jVar, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.f14030c) {
            ?? r10 = jVar.f14091a;
            int size = ((Collection) r10).size();
            for (int i10 = 0; i10 < size; i10++) {
                if (T1(((q) r10.get(i10)).f14108i)) {
                    if (k.a(jVar.f14094d, 4)) {
                        this.f14028s = true;
                        S1();
                        return;
                    } else {
                        if (k.a(jVar.f14094d, 5)) {
                            U1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.Y
    public final void u0() {
        U1();
    }
}
