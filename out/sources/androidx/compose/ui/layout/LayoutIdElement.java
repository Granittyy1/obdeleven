package androidx.compose.ui.layout;

/* JADX INFO: compiled from: LayoutId.kt */
/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends androidx.compose.ui.node.H<r> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14192b;

    public LayoutIdElement(Object obj) {
        this.f14192b = obj;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        r rVar = new r();
        rVar.f14257p = this.f14192b;
        return rVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((r) cVar).f14257p = this.f14192b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && kotlin.jvm.internal.i.a(this.f14192b, ((LayoutIdElement) obj).f14192b);
    }

    public final int hashCode() {
        return this.f14192b.hashCode();
    }

    public final String toString() {
        return B6.c.e(new StringBuilder("LayoutIdElement(layoutId="), this.f14192b, ')');
    }
}
