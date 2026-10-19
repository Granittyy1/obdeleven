package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: LazyLayoutItemAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutAnimateItemElement extends androidx.compose.ui.node.H<C0972g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.animation.core.P f10596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.animation.core.P f10597c;

    public LazyLayoutAnimateItemElement(androidx.compose.animation.core.P p10, androidx.compose.animation.core.P p11) {
        this.f10596b = p10;
        this.f10597c = p11;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        C0972g c0972g = new C0972g();
        c0972g.f10718p = this.f10596b;
        c0972g.f10719q = this.f10597c;
        return c0972g;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        C0972g c0972g = (C0972g) cVar;
        c0972g.f10718p = this.f10596b;
        c0972g.f10719q = this.f10597c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return kotlin.jvm.internal.i.a(this.f10596b, lazyLayoutAnimateItemElement.f10596b) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f10597c, lazyLayoutAnimateItemElement.f10597c);
    }

    public final int hashCode() {
        androidx.compose.animation.core.P p10 = this.f10596b;
        int iHashCode = (p10 == null ? 0 : p10.hashCode()) * 961;
        androidx.compose.animation.core.P p11 = this.f10597c;
        return iHashCode + (p11 != null ? p11.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f10596b + ", placementSpec=null, fadeOutSpec=" + this.f10597c + ')';
    }
}
