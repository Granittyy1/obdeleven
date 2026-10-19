package androidx.compose.animation;

import androidx.compose.animation.core.C0910j;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends H<EnterExitTransitionModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transition<EnterExitState> f9280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Transition<EnterExitState>.a<p013b0.l, C0910j> f9281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transition<EnterExitState>.a<p013b0.j, C0910j> f9282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Transition<EnterExitState>.a<p013b0.j, C0910j> f9283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f9284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f9285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ia.a<Boolean> f9286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f9287i;

    public EnterExitTransitionElement(Transition<EnterExitState> transition, Transition<EnterExitState>.a<p013b0.l, C0910j> aVar, Transition<EnterExitState>.a<p013b0.j, C0910j> aVar2, Transition<EnterExitState>.a<p013b0.j, C0910j> aVar3, m mVar, o oVar, Ia.a<Boolean> aVar4, t tVar) {
        this.f9280b = transition;
        this.f9281c = aVar;
        this.f9282d = aVar2;
        this.f9283e = aVar3;
        this.f9284f = mVar;
        this.f9285g = oVar;
        this.f9286h = aVar4;
        this.f9287i = tVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new EnterExitTransitionModifierNode(this.f9280b, this.f9281c, this.f9282d, this.f9283e, this.f9284f, this.f9285g, this.f9286h, this.f9287i);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        EnterExitTransitionModifierNode enterExitTransitionModifierNode = (EnterExitTransitionModifierNode) cVar;
        enterExitTransitionModifierNode.f9304p = this.f9280b;
        enterExitTransitionModifierNode.f9305q = this.f9281c;
        enterExitTransitionModifierNode.f9306r = this.f9282d;
        enterExitTransitionModifierNode.f9307s = this.f9283e;
        enterExitTransitionModifierNode.f9308t = this.f9284f;
        enterExitTransitionModifierNode.f9309u = this.f9285g;
        enterExitTransitionModifierNode.f9310v = this.f9286h;
        enterExitTransitionModifierNode.f9311w = this.f9287i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return kotlin.jvm.internal.i.a(this.f9280b, enterExitTransitionElement.f9280b) && kotlin.jvm.internal.i.a(this.f9281c, enterExitTransitionElement.f9281c) && kotlin.jvm.internal.i.a(this.f9282d, enterExitTransitionElement.f9282d) && kotlin.jvm.internal.i.a(this.f9283e, enterExitTransitionElement.f9283e) && kotlin.jvm.internal.i.a(this.f9284f, enterExitTransitionElement.f9284f) && kotlin.jvm.internal.i.a(this.f9285g, enterExitTransitionElement.f9285g) && kotlin.jvm.internal.i.a(this.f9286h, enterExitTransitionElement.f9286h) && kotlin.jvm.internal.i.a(this.f9287i, enterExitTransitionElement.f9287i);
    }

    public final int hashCode() {
        int iHashCode = this.f9280b.hashCode() * 31;
        Transition<EnterExitState>.a<p013b0.l, C0910j> aVar = this.f9281c;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Transition<EnterExitState>.a<p013b0.j, C0910j> aVar2 = this.f9282d;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Transition<EnterExitState>.a<p013b0.j, C0910j> aVar3 = this.f9283e;
        return this.f9287i.hashCode() + ((this.f9286h.hashCode() + ((this.f9285g.hashCode() + ((this.f9284f.hashCode() + ((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f9280b + ", sizeAnimation=" + this.f9281c + ", offsetAnimation=" + this.f9282d + ", slideAnimation=" + this.f9283e + ", enter=" + this.f9284f + ", exit=" + this.f9285g + ", isEnabled=" + this.f9286h + ", graphicsLayerBlock=" + this.f9287i + ')';
    }
}
