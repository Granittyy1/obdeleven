package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.H;
import kotlin.Pair;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends H<DraggableAnchorsNode<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<T> f12486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.p<p013b0.l, p013b0.a, Pair<q<T>, T>> f12487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Orientation f12488d;

    public DraggableAnchorsElement(i iVar, Ia.p pVar) {
        Orientation orientation = Orientation.f9957b;
        this.f12486b = iVar;
        this.f12487c = pVar;
        this.f12488d = orientation;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        DraggableAnchorsNode draggableAnchorsNode = new DraggableAnchorsNode();
        draggableAnchorsNode.f12489p = this.f12486b;
        draggableAnchorsNode.f12490q = this.f12487c;
        draggableAnchorsNode.f12491r = this.f12488d;
        return draggableAnchorsNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        DraggableAnchorsNode draggableAnchorsNode = (DraggableAnchorsNode) cVar;
        draggableAnchorsNode.f12489p = this.f12486b;
        draggableAnchorsNode.f12490q = this.f12487c;
        draggableAnchorsNode.f12491r = this.f12488d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return kotlin.jvm.internal.i.a(this.f12486b, draggableAnchorsElement.f12486b) && this.f12487c == draggableAnchorsElement.f12487c && this.f12488d == draggableAnchorsElement.f12488d;
    }

    public final int hashCode() {
        return this.f12488d.hashCode() + ((this.f12487c.hashCode() + (this.f12486b.hashCode() * 31)) * 31);
    }
}
