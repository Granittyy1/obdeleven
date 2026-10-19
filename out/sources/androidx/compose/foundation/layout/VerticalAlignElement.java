package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class VerticalAlignElement extends androidx.compose.ui.node.H<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.f.b f10223b;

    public VerticalAlignElement(androidx.compose.ui.f.b bVar) {
        this.f10223b = bVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        Z z10 = new Z();
        z10.f10246p = this.f10223b;
        return z10;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((Z) cVar).f10246p = this.f10223b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10223b, verticalAlignElement.f10223b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10223b.f13405a);
    }
}
