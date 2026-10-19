package androidx.compose.ui.focus;

import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: FocusEventModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class FocusEventElement extends H<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<y, p293xa.r> f13412b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusEventElement(Ia.l<? super y, p293xa.r> lVar) {
        this.f13412b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        j jVar = new j();
        jVar.f13450p = this.f13412b;
        return jVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((j) cVar).f13450p = this.f13412b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && kotlin.jvm.internal.i.a(this.f13412b, ((FocusEventElement) obj).f13412b);
    }

    public final int hashCode() {
        return this.f13412b.hashCode();
    }

    public final String toString() {
        return "FocusEventElement(onFocusEvent=" + this.f13412b + ')';
    }
}
