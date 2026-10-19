package androidx.compose.ui.semantics;

import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends H<d> implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<w, p293xa.r> f15131c;

    public AppendedSemanticsElement(Ia.l lVar, boolean z10) {
        this.f15130b = z10;
        this.f15131c = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new d(this.f15130b, false, this.f15131c);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        d dVar = (d) cVar;
        dVar.f15194p = this.f15130b;
        dVar.f15196r = this.f15131c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f15130b == appendedSemanticsElement.f15130b && kotlin.jvm.internal.i.a(this.f15131c, appendedSemanticsElement.f15131c);
    }

    @Override // androidx.compose.ui.semantics.o
    public final l f() {
        l lVar = new l();
        lVar.f15236d = this.f15130b;
        this.f15131c.invoke(lVar);
        return lVar;
    }

    public final int hashCode() {
        return this.f15131c.hashCode() + (Boolean.hashCode(this.f15130b) * 31);
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f15130b + ", properties=" + this.f15131c + ')';
    }
}
