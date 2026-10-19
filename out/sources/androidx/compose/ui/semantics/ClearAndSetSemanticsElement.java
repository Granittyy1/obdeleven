package androidx.compose.ui.semantics;

import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends H<d> implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<w, p293xa.r> f15132b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(Ia.l<? super w, p293xa.r> lVar) {
        this.f15132b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new d(false, true, this.f15132b);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((d) cVar).f15196r = this.f15132b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && kotlin.jvm.internal.i.a(this.f15132b, ((ClearAndSetSemanticsElement) obj).f15132b);
    }

    @Override // androidx.compose.ui.semantics.o
    public final l f() {
        l lVar = new l();
        lVar.f15236d = false;
        lVar.f15237e = true;
        this.f15132b.invoke(lVar);
        return lVar;
    }

    public final int hashCode() {
        return this.f15132b.hashCode();
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f15132b + ')';
    }
}
