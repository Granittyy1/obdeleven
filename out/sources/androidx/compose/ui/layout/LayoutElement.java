package androidx.compose.ui.layout;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends androidx.compose.ui.node.H<C1176w> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.q<H, D, p013b0.a, F> f14191b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(Ia.q<? super H, ? super D, ? super p013b0.a, ? extends F> qVar) {
        this.f14191b = qVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        C1176w c1176w = new C1176w();
        c1176w.f14258p = this.f14191b;
        return c1176w;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((C1176w) cVar).f14258p = this.f14191b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && kotlin.jvm.internal.i.a(this.f14191b, ((LayoutElement) obj).f14191b);
    }

    public final int hashCode() {
        return this.f14191b.hashCode();
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f14191b + ')';
    }
}
