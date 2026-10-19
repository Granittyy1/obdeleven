package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0923x;
import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class SizeAnimationModifierElement extends H<SizeAnimationModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0923x<p013b0.l> f9316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.f f9317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.p<p013b0.l, p013b0.l, p293xa.r> f9318d;

    public SizeAnimationModifierElement(InterfaceC0923x interfaceC0923x, Ia.p pVar) {
        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
        this.f9316b = interfaceC0923x;
        this.f9317c = fVar;
        this.f9318d = pVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new SizeAnimationModifierNode(this.f9316b, this.f9317c, this.f9318d);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        SizeAnimationModifierNode sizeAnimationModifierNode = (SizeAnimationModifierNode) cVar;
        sizeAnimationModifierNode.f9319p = this.f9316b;
        sizeAnimationModifierNode.f9321r = this.f9318d;
        sizeAnimationModifierNode.f9320q = this.f9317c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return kotlin.jvm.internal.i.a(this.f9316b, sizeAnimationModifierElement.f9316b) && kotlin.jvm.internal.i.a(this.f9317c, sizeAnimationModifierElement.f9317c) && kotlin.jvm.internal.i.a(this.f9318d, sizeAnimationModifierElement.f9318d);
    }

    public final int hashCode() {
        int iHashCode = (this.f9317c.hashCode() + (this.f9316b.hashCode() * 31)) * 31;
        Ia.p<p013b0.l, p013b0.l, p293xa.r> pVar = this.f9318d;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f9316b + ", alignment=" + this.f9317c + ", finishedListener=" + this.f9318d + ')';
    }
}
