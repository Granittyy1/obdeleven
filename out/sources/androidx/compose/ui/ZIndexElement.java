package androidx.compose.ui;

import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: ZIndexModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ZIndexElement extends H<ZIndexNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13276b;

    public ZIndexElement(float f10) {
        this.f13276b = f10;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        ZIndexNode zIndexNode = new ZIndexNode();
        zIndexNode.f13277p = this.f13276b;
        return zIndexNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        ((ZIndexNode) cVar).f13277p = this.f13276b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f13276b, ((ZIndexElement) obj).f13276b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13276b);
    }

    public final String toString() {
        return B7.b.d(new StringBuilder("ZIndexElement(zIndex="), this.f13276b, ')');
    }
}
