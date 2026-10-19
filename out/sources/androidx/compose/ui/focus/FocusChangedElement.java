package androidx.compose.ui.focus;

import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: FocusChangedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends H<C1122d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<y, p293xa.r> f13411b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(Ia.l<? super y, p293xa.r> lVar) {
        this.f13411b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        C1122d c1122d = new C1122d();
        c1122d.f13447p = this.f13411b;
        return c1122d;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((C1122d) cVar).f13447p = this.f13411b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && kotlin.jvm.internal.i.a(this.f13411b, ((FocusChangedElement) obj).f13411b);
    }

    public final int hashCode() {
        return this.f13411b.hashCode();
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f13411b + ')';
    }
}
