package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.C1185f;

/* JADX INFO: compiled from: LazyLayoutSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends androidx.compose.ui.node.H<LazyLayoutSemanticsModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Oa.i f10647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f10648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Orientation f10649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10651f;

    public LazyLayoutSemanticsModifier(Oa.i iVar, M m7, Orientation orientation, boolean z10, boolean z11) {
        this.f10647b = iVar;
        this.f10648c = m7;
        this.f10649d = orientation;
        this.f10650e = z10;
        this.f10651f = z11;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new LazyLayoutSemanticsModifierNode(this.f10647b, this.f10648c, this.f10649d, this.f10650e, this.f10651f);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = (LazyLayoutSemanticsModifierNode) cVar;
        lazyLayoutSemanticsModifierNode.f10652p = this.f10647b;
        lazyLayoutSemanticsModifierNode.f10653q = this.f10648c;
        Orientation orientation = lazyLayoutSemanticsModifierNode.f10654r;
        Orientation orientation2 = this.f10649d;
        if (orientation != orientation2) {
            lazyLayoutSemanticsModifierNode.f10654r = orientation2;
            C1185f.f(lazyLayoutSemanticsModifierNode).P();
        }
        boolean z10 = lazyLayoutSemanticsModifierNode.f10655s;
        boolean z11 = this.f10650e;
        boolean z12 = this.f10651f;
        if (z10 == z11 && lazyLayoutSemanticsModifierNode.f10656t == z12) {
            return;
        }
        lazyLayoutSemanticsModifierNode.f10655s = z11;
        lazyLayoutSemanticsModifierNode.f10656t = z12;
        lazyLayoutSemanticsModifierNode.Q1();
        C1185f.f(lazyLayoutSemanticsModifierNode).P();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f10647b == lazyLayoutSemanticsModifier.f10647b && kotlin.jvm.internal.i.a(this.f10648c, lazyLayoutSemanticsModifier.f10648c) && this.f10649d == lazyLayoutSemanticsModifier.f10649d && this.f10650e == lazyLayoutSemanticsModifier.f10650e && this.f10651f == lazyLayoutSemanticsModifier.f10651f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10651f) + androidx.compose.animation.D.b((this.f10649d.hashCode() + ((this.f10648c.hashCode() + (this.f10647b.hashCode() * 31)) * 31)) * 31, 31, this.f10650e);
    }
}
