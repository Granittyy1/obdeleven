package androidx.compose.foundation.layout;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
final class OffsetPxElement extends androidx.compose.ui.node.H<OffsetPxNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<p013b0.c, p013b0.j> f10181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10182c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10183d;

    public OffsetPxElement(Ia.l lVar, Ia.l lVar2) {
        this.f10181b = lVar;
        this.f10183d = lVar2;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        OffsetPxNode offsetPxNode = new OffsetPxNode();
        offsetPxNode.f10184p = this.f10181b;
        offsetPxNode.f10185q = this.f10182c;
        return offsetPxNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        OffsetPxNode offsetPxNode = (OffsetPxNode) cVar;
        Ia.l<? super p013b0.c, p013b0.j> lVar = offsetPxNode.f10184p;
        Ia.l<p013b0.c, p013b0.j> lVar2 = this.f10181b;
        boolean z10 = this.f10182c;
        if (lVar != lVar2 || offsetPxNode.f10185q != z10) {
            LayoutNode layoutNodeF = C1185f.f(offsetPxNode);
            LayoutNode.b bVar = LayoutNode.f14379R;
            layoutNodeF.e0(false);
        }
        offsetPxNode.f10184p = lVar2;
        offsetPxNode.f10185q = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return this.f10181b == offsetPxElement.f10181b && this.f10182c == offsetPxElement.f10182c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10182c) + (this.f10181b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetPxModifier(offset=");
        sb2.append(this.f10181b);
        sb2.append(", rtlAware=");
        return Z3.o.d(sb2, this.f10182c, ')');
    }
}
