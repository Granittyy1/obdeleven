package androidx.compose.foundation;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends androidx.compose.ui.node.H<ScrollNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScrollState f9856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9858d = true;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z10) {
        this.f9856b = scrollState;
        this.f9857c = z10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        ScrollNode scrollNode = new ScrollNode();
        scrollNode.f9820p = this.f9856b;
        scrollNode.f9821q = this.f9857c;
        scrollNode.f9822r = this.f9858d;
        return scrollNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ScrollNode scrollNode = (ScrollNode) cVar;
        scrollNode.f9820p = this.f9856b;
        scrollNode.f9821q = this.f9857c;
        scrollNode.f9822r = this.f9858d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return kotlin.jvm.internal.i.a(this.f9856b, scrollingLayoutElement.f9856b) && this.f9857c == scrollingLayoutElement.f9857c && this.f9858d == scrollingLayoutElement.f9858d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9858d) + androidx.compose.animation.D.b(this.f9856b.hashCode() * 31, 31, this.f9857c);
    }
}
