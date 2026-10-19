package androidx.compose.foundation.layout;

import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
final class OffsetElement extends androidx.compose.ui.node.H<OffsetNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10177e;

    public OffsetElement() {
        throw null;
    }

    public OffsetElement(float f10, float f11, Ia.l lVar) {
        this.f10174b = f10;
        this.f10175c = f11;
        this.f10176d = true;
        this.f10177e = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        OffsetNode offsetNode = new OffsetNode();
        offsetNode.f10178p = this.f10174b;
        offsetNode.f10179q = this.f10175c;
        offsetNode.f10180r = this.f10176d;
        return offsetNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        OffsetNode offsetNode = (OffsetNode) cVar;
        float f10 = offsetNode.f10178p;
        float f11 = this.f10174b;
        boolean zA = p013b0.f.a(f10, f11);
        float f12 = this.f10175c;
        boolean z10 = this.f10176d;
        if (!zA || !p013b0.f.a(offsetNode.f10179q, f12) || offsetNode.f10180r != z10) {
            LayoutNode layoutNodeF = C1185f.f(offsetNode);
            LayoutNode.b bVar = LayoutNode.f14379R;
            layoutNodeF.e0(false);
        }
        offsetNode.f10178p = f11;
        offsetNode.f10179q = f12;
        offsetNode.f10180r = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return p013b0.f.a(this.f10174b, offsetElement.f10174b) && p013b0.f.a(this.f10175c, offsetElement.f10175c) && this.f10176d == offsetElement.f10176d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10176d) + O.a.d(this.f10175c, Float.hashCode(this.f10174b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetModifierElement(x=");
        sb2.append((Object) p013b0.f.b(this.f10174b));
        sb2.append(", y=");
        sb2.append((Object) p013b0.f.b(this.f10175c));
        sb2.append(", rtlAware=");
        return Z3.o.d(sb2, this.f10176d, ')');
    }
}
