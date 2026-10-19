package androidx.compose.foundation;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends androidx.compose.ui.node.H<HoverableNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.k f9767b;

    public HoverableElement(androidx.compose.foundation.interaction.k kVar) {
        this.f9767b = kVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        HoverableNode hoverableNode = new HoverableNode();
        hoverableNode.f9768p = this.f9767b;
        return hoverableNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        HoverableNode hoverableNode = (HoverableNode) cVar;
        androidx.compose.foundation.interaction.k kVar = hoverableNode.f9768p;
        androidx.compose.foundation.interaction.k kVar2 = this.f9767b;
        if (kotlin.jvm.internal.i.a(kVar, kVar2)) {
            return;
        }
        hoverableNode.S1();
        hoverableNode.f9768p = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && kotlin.jvm.internal.i.a(((HoverableElement) obj).f9767b, this.f9767b);
    }

    public final int hashCode() {
        return this.f9767b.hashCode() * 31;
    }
}
