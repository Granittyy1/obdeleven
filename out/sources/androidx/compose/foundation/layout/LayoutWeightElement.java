package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends androidx.compose.ui.node.H<I> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10166c;

    public LayoutWeightElement(boolean z10, float f10) {
        this.f10165b = f10;
        this.f10166c = z10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        I i10 = new I();
        i10.f10147p = this.f10165b;
        i10.f10148q = this.f10166c;
        return i10;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        I i10 = (I) cVar;
        i10.f10147p = this.f10165b;
        i10.f10148q = this.f10166c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f10165b == layoutWeightElement.f10165b && this.f10166c == layoutWeightElement.f10166c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10166c) + (Float.hashCode(this.f10165b) * 31);
    }
}
