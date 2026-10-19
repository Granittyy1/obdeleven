package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.h;
import androidx.compose.ui.node.H;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends H<NestedScrollNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NestedScrollDispatcher f14006c;

    public NestedScrollElement(a aVar, NestedScrollDispatcher nestedScrollDispatcher) {
        this.f14005b = aVar;
        this.f14006c = nestedScrollDispatcher;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        return new NestedScrollNode(this.f14005b, this.f14006c);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) cVar;
        nestedScrollNode.f14007p = this.f14005b;
        NestedScrollDispatcher nestedScrollDispatcher = nestedScrollNode.f14008q;
        if (nestedScrollDispatcher.f14001a == nestedScrollNode) {
            nestedScrollDispatcher.f14001a = null;
        }
        NestedScrollDispatcher nestedScrollDispatcher2 = this.f14006c;
        if (nestedScrollDispatcher2 == null) {
            nestedScrollNode.f14008q = new NestedScrollDispatcher();
        } else if (!nestedScrollDispatcher2.equals(nestedScrollDispatcher)) {
            nestedScrollNode.f14008q = nestedScrollDispatcher2;
        }
        if (nestedScrollNode.f13997o) {
            NestedScrollDispatcher nestedScrollDispatcher3 = nestedScrollNode.f14008q;
            nestedScrollDispatcher3.f14001a = nestedScrollNode;
            nestedScrollDispatcher3.f14002b = null;
            nestedScrollNode.f14009r = null;
            nestedScrollDispatcher3.f14003c = new NestedScrollNode$updateDispatcherFields$1(nestedScrollNode);
            nestedScrollNode.f14008q.f14004d = nestedScrollNode.E1();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return i.a(nestedScrollElement.f14005b, this.f14005b) && i.a(nestedScrollElement.f14006c, this.f14006c);
    }

    public final int hashCode() {
        int iHashCode = this.f14005b.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.f14006c;
        return iHashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }
}
