package androidx.compose.ui.draganddrop;

import Ia.l;
import Ia.p;
import androidx.compose.ui.h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1197s;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.e0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C;
import p293xa.r;

/* JADX INFO: compiled from: DragAndDropNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropNode extends h.c implements e0, f, InterfaceC1197s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p<Object, ? super I.d, r> f13354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l<b, f> f13355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f13356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DragAndDropNode f13357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f13358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13359u;

    public DragAndDropNode() {
        this(null);
    }

    @Override // androidx.compose.ui.draganddrop.f
    public final void B1(final b bVar) {
        l<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction> lVar = new l<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1
            {
                super(1);
            }

            @Override // Ia.l
            public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
                DragAndDropNode dragAndDropNode2 = dragAndDropNode;
                if (!dragAndDropNode2.f13985b.f13997o) {
                    return TraversableNode$Companion$TraverseDescendantsAction.f14570c;
                }
                f fVar = dragAndDropNode2.f13358t;
                if (fVar != null) {
                    fVar.B1(bVar);
                }
                dragAndDropNode2.f13358t = null;
                dragAndDropNode2.f13357s = null;
                return TraversableNode$Companion$TraverseDescendantsAction.f14569b;
            }
        };
        if (lVar.invoke(this) != TraversableNode$Companion$TraverseDescendantsAction.f14569b) {
            return;
        }
        Cb.a.o(this, lVar);
    }

    @Override // androidx.compose.ui.draganddrop.f
    public final boolean E(b bVar) {
        DragAndDropNode dragAndDropNode = this.f13357s;
        if (dragAndDropNode != null) {
            return dragAndDropNode.E(bVar);
        }
        f fVar = this.f13358t;
        if (fVar != null) {
            return fVar.E(bVar);
        }
        return false;
    }

    @Override // androidx.compose.ui.draganddrop.f
    public final void H(b bVar) {
        f fVar = this.f13358t;
        if (fVar != null) {
            fVar.H(bVar);
            return;
        }
        DragAndDropNode dragAndDropNode = this.f13357s;
        if (dragAndDropNode != null) {
            dragAndDropNode.H(bVar);
        }
    }

    @Override // androidx.compose.ui.draganddrop.f
    public final void I(final b bVar) {
        e0 e0Var;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.f13357s;
        if (dragAndDropNode2 == null || !e.a(dragAndDropNode2, C.m(bVar))) {
            if (this.f13985b.f13997o) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Cb.a.o(this, new l<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.ui.node.e0] */
                    @Override // Ia.l
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode3) {
                        DragAndDropNode dragAndDropNode4 = dragAndDropNode3;
                        DragAndDropNode dragAndDropNode5 = dragAndDropNode4;
                        DragAndDropNode dragAndDropNode6 = this;
                        dragAndDropNode6.getClass();
                        if (!C1185f.g(dragAndDropNode6).getDragAndDropManager().b(dragAndDropNode5) || !e.a(dragAndDropNode5, C.m(bVar))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.f14569b;
                        }
                        ref$ObjectRef.element = dragAndDropNode4;
                        return TraversableNode$Companion$TraverseDescendantsAction.f14571d;
                    }
                });
                e0Var = (e0) ref$ObjectRef.element;
            } else {
                e0Var = null;
            }
            dragAndDropNode = (DragAndDropNode) e0Var;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            dragAndDropNode.b1(bVar);
            dragAndDropNode.I(bVar);
            f fVar = this.f13358t;
            if (fVar != null) {
                fVar.l0(bVar);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            f fVar2 = this.f13358t;
            if (fVar2 != null) {
                fVar2.b1(bVar);
                fVar2.I(bVar);
            }
            dragAndDropNode2.l0(bVar);
        } else if (!i.a(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                dragAndDropNode.b1(bVar);
                dragAndDropNode.I(bVar);
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.l0(bVar);
            }
        } else if (dragAndDropNode != null) {
            dragAndDropNode.I(bVar);
        } else {
            f fVar3 = this.f13358t;
            if (fVar3 != null) {
                fVar3.I(bVar);
            }
        }
        this.f13357s = dragAndDropNode;
    }

    @Override // androidx.compose.ui.node.e0
    public final Object J() {
        return this.f13356r;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        this.f13358t = null;
        this.f13357s = null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1197s
    public final void T(long j) {
        this.f13359u = j;
    }

    @Override // androidx.compose.ui.draganddrop.f
    public final void b1(b bVar) {
        f fVar = this.f13358t;
        if (fVar != null) {
            fVar.b1(bVar);
            return;
        }
        DragAndDropNode dragAndDropNode = this.f13357s;
        if (dragAndDropNode != null) {
            dragAndDropNode.b1(bVar);
        }
    }

    @Override // androidx.compose.ui.draganddrop.f
    public final void l0(b bVar) {
        f fVar = this.f13358t;
        if (fVar != null) {
            fVar.l0(bVar);
        }
        DragAndDropNode dragAndDropNode = this.f13357s;
        if (dragAndDropNode != null) {
            dragAndDropNode.l0(bVar);
        }
        this.f13357s = null;
    }

    public DragAndDropNode(Object obj) {
        this.f13355q = null;
        this.f13356r = d.f13364a;
        this.f13359u = 0L;
    }
}
