package androidx.compose.ui.draganddrop;

import I.h;
import Ia.l;
import Ia.q;
import android.view.DragEvent;
import android.view.View;
import androidx.collection.C0874b;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.H;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.Ref$BooleanRef;
import p293xa.r;

/* JADX INFO: compiled from: AndroidDragAndDropManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<g, h, l<? super J.e, r>, Boolean> f13349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DragAndDropNode f13350b = new DragAndDropNode(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0874b<f> f13351c = new C0874b<>(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f13352d = new H<DragAndDropNode>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.H
        public final androidx.compose.ui.h.c a() {
            return this.f13353b.f13350b;
        }

        @Override // androidx.compose.ui.node.H
        public final /* bridge */ /* synthetic */ void e(androidx.compose.ui.h.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f13353b.f13350b.hashCode();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public AndroidDragAndDropManager(q<? super g, ? super h, ? super l<? super J.e, r>, Boolean> qVar) {
        this.f13349a = qVar;
    }

    @Override // androidx.compose.ui.draganddrop.c
    public final void a(DragAndDropNode dragAndDropNode) {
        this.f13351c.add(dragAndDropNode);
    }

    @Override // androidx.compose.ui.draganddrop.c
    public final boolean b(DragAndDropNode dragAndDropNode) {
        return this.f13351c.contains(dragAndDropNode);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        final b bVar = new b(dragEvent);
        int action = dragEvent.getAction();
        C0874b<f> c0874b = this.f13351c;
        final DragAndDropNode dragAndDropNode = this.f13350b;
        switch (action) {
            case 1:
                dragAndDropNode.getClass();
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                l<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction> lVar = new l<DragAndDropNode, TraversableNode$Companion$TraverseDescendantsAction>() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final TraversableNode$Companion$TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode2) {
                        DragAndDropNode dragAndDropNode3 = dragAndDropNode2;
                        if (!dragAndDropNode3.f13997o) {
                            return TraversableNode$Companion$TraverseDescendantsAction.f14570c;
                        }
                        if (dragAndDropNode3.f13358t != null) {
                            R.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                        }
                        l<b, f> lVar2 = dragAndDropNode3.f13355q;
                        f fVarInvoke = lVar2 != null ? lVar2.invoke(bVar) : null;
                        dragAndDropNode3.f13358t = fVarInvoke;
                        boolean z10 = fVarInvoke != null;
                        if (z10) {
                            DragAndDropNode dragAndDropNode4 = dragAndDropNode;
                            dragAndDropNode4.getClass();
                            C1185f.g(dragAndDropNode4).getDragAndDropManager().a(dragAndDropNode3);
                        }
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        ref$BooleanRef2.element = ref$BooleanRef2.element || z10;
                        return TraversableNode$Companion$TraverseDescendantsAction.f14569b;
                    }
                };
                if (lVar.invoke(dragAndDropNode) == TraversableNode$Companion$TraverseDescendantsAction.f14569b) {
                    Cb.a.o(dragAndDropNode, lVar);
                }
                boolean z10 = ref$BooleanRef.element;
                c0874b.getClass();
                C0874b.a aVar = new C0874b.a();
                while (aVar.hasNext()) {
                    ((f) aVar.next()).H(bVar);
                }
                return z10;
            case 2:
                dragAndDropNode.I(bVar);
                return false;
            case 3:
                return dragAndDropNode.E(bVar);
            case 4:
                dragAndDropNode.B1(bVar);
                c0874b.clear();
                return false;
            case 5:
                dragAndDropNode.b1(bVar);
                return false;
            case 6:
                dragAndDropNode.l0(bVar);
                return false;
            default:
                return false;
        }
    }
}
