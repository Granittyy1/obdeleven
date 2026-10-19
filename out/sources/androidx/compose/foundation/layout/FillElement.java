package androidx.compose.foundation.layout;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends androidx.compose.ui.node.H<FillNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Direction f10119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10120c;

    public FillElement(Direction direction, float f10) {
        this.f10119b = direction;
        this.f10120c = f10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        FillNode fillNode = new FillNode();
        fillNode.f10121p = this.f10119b;
        fillNode.f10122q = this.f10120c;
        return fillNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        FillNode fillNode = (FillNode) cVar;
        fillNode.f10121p = this.f10119b;
        fillNode.f10122q = this.f10120c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f10119b == fillElement.f10119b && this.f10120c == fillElement.f10120c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10120c) + (this.f10119b.hashCode() * 31);
    }
}
