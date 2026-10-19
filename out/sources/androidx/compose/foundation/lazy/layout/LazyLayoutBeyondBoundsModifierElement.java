package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends androidx.compose.ui.node.H<LazyLayoutBeyondBoundsModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0976k f10598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0973h f10599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Orientation f10601e;

    public LazyLayoutBeyondBoundsModifierElement(InterfaceC0976k interfaceC0976k, C0973h c0973h, boolean z10, Orientation orientation) {
        this.f10598b = interfaceC0976k;
        this.f10599c = c0973h;
        this.f10600d = z10;
        this.f10601e = orientation;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode = new LazyLayoutBeyondBoundsModifierNode();
        lazyLayoutBeyondBoundsModifierNode.f10603p = this.f10598b;
        lazyLayoutBeyondBoundsModifierNode.f10604q = this.f10599c;
        lazyLayoutBeyondBoundsModifierNode.f10605r = this.f10600d;
        lazyLayoutBeyondBoundsModifierNode.f10606s = this.f10601e;
        return lazyLayoutBeyondBoundsModifierNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode = (LazyLayoutBeyondBoundsModifierNode) cVar;
        lazyLayoutBeyondBoundsModifierNode.f10603p = this.f10598b;
        lazyLayoutBeyondBoundsModifierNode.f10604q = this.f10599c;
        lazyLayoutBeyondBoundsModifierNode.f10605r = this.f10600d;
        lazyLayoutBeyondBoundsModifierNode.f10606s = this.f10601e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return kotlin.jvm.internal.i.a(this.f10598b, lazyLayoutBeyondBoundsModifierElement.f10598b) && kotlin.jvm.internal.i.a(this.f10599c, lazyLayoutBeyondBoundsModifierElement.f10599c) && this.f10600d == lazyLayoutBeyondBoundsModifierElement.f10600d && this.f10601e == lazyLayoutBeyondBoundsModifierElement.f10601e;
    }

    public final int hashCode() {
        return this.f10601e.hashCode() + androidx.compose.animation.D.b((this.f10599c.hashCode() + (this.f10598b.hashCode() * 31)) * 31, 31, this.f10600d);
    }
}
