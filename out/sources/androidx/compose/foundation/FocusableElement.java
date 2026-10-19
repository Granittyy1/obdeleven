package androidx.compose.foundation;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends androidx.compose.ui.node.H<FocusableNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.k f9758b;

    public FocusableElement(androidx.compose.foundation.interaction.k kVar) {
        this.f9758b = kVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new FocusableNode(this.f9758b, 1, null);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((FocusableNode) cVar).V1(this.f9758b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return kotlin.jvm.internal.i.a(this.f9758b, ((FocusableElement) obj).f9758b);
        }
        return false;
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.f9758b;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }
}
