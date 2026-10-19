package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends androidx.compose.ui.node.H<UnspecifiedConstraintsNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10219c;

    public UnspecifiedConstraintsElement(float f10, float f11) {
        this.f10218b = f10;
        this.f10219c = f11;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        UnspecifiedConstraintsNode unspecifiedConstraintsNode = new UnspecifiedConstraintsNode();
        unspecifiedConstraintsNode.f10220p = this.f10218b;
        unspecifiedConstraintsNode.f10221q = this.f10219c;
        return unspecifiedConstraintsNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        UnspecifiedConstraintsNode unspecifiedConstraintsNode = (UnspecifiedConstraintsNode) cVar;
        unspecifiedConstraintsNode.f10220p = this.f10218b;
        unspecifiedConstraintsNode.f10221q = this.f10219c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return p013b0.f.a(this.f10218b, unspecifiedConstraintsElement.f10218b) && p013b0.f.a(this.f10219c, unspecifiedConstraintsElement.f10219c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10219c) + (Float.hashCode(this.f10218b) * 31);
    }
}
