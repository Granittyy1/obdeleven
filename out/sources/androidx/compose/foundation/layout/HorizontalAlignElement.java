package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends androidx.compose.ui.node.H<B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.d.b f10146b;

    public HorizontalAlignElement(androidx.compose.ui.d.b bVar) {
        this.f10146b = bVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        B b10 = new B();
        b10.f10091p = this.f10146b;
        return b10;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((B) cVar).f10091p = this.f10146b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10146b, horizontalAlignElement.f10146b);
    }

    public final int hashCode() {
        return this.f10146b.hashCode();
    }
}
