package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends androidx.compose.ui.node.H<Y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f10696b;

    public TraversablePrefetchStateModifierElement(H h8) {
        this.f10696b = h8;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new Y(this.f10696b);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((Y) cVar).f10699p = this.f10696b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && kotlin.jvm.internal.i.a(this.f10696b, ((TraversablePrefetchStateModifierElement) obj).f10696b);
    }

    public final int hashCode() {
        return this.f10696b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f10696b + ')';
    }
}
