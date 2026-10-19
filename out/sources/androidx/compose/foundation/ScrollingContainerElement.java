package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: compiled from: ScrollingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
final class ScrollingContainerElement extends androidx.compose.ui.node.H<ScrollingContainerNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.u f9834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Orientation f9835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.j f9838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.l f9839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.c f9840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9841i;
    public final E j;

    public ScrollingContainerElement(E e10, androidx.compose.foundation.gestures.c cVar, androidx.compose.foundation.gestures.j jVar, Orientation orientation, androidx.compose.foundation.gestures.u uVar, androidx.compose.foundation.interaction.l lVar, boolean z10, boolean z11, boolean z12) {
        this.f9834b = uVar;
        this.f9835c = orientation;
        this.f9836d = z10;
        this.f9837e = z11;
        this.f9838f = jVar;
        this.f9839g = lVar;
        this.f9840h = cVar;
        this.f9841i = z12;
        this.j = e10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        ScrollingContainerNode scrollingContainerNode = new ScrollingContainerNode();
        scrollingContainerNode.f9847r = this.f9834b;
        scrollingContainerNode.f9848s = this.f9835c;
        scrollingContainerNode.f9849t = this.f9836d;
        scrollingContainerNode.f9850u = this.f9837e;
        scrollingContainerNode.f9851v = this.f9838f;
        scrollingContainerNode.f9852w = this.f9839g;
        scrollingContainerNode.f9853x = this.f9840h;
        scrollingContainerNode.f9854y = this.f9841i;
        scrollingContainerNode.f9855z = this.j;
        return scrollingContainerNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        androidx.compose.foundation.interaction.l lVar = this.f9839g;
        androidx.compose.foundation.gestures.c cVar2 = this.f9840h;
        androidx.compose.foundation.gestures.u uVar = this.f9834b;
        Orientation orientation = this.f9835c;
        boolean z10 = this.f9841i;
        ((ScrollingContainerNode) cVar).W1(this.j, cVar2, this.f9838f, orientation, uVar, lVar, z10, this.f9836d, this.f9837e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return kotlin.jvm.internal.i.a(this.f9834b, scrollingContainerElement.f9834b) && this.f9835c == scrollingContainerElement.f9835c && this.f9836d == scrollingContainerElement.f9836d && this.f9837e == scrollingContainerElement.f9837e && kotlin.jvm.internal.i.a(this.f9838f, scrollingContainerElement.f9838f) && kotlin.jvm.internal.i.a(this.f9839g, scrollingContainerElement.f9839g) && kotlin.jvm.internal.i.a(this.f9840h, scrollingContainerElement.f9840h) && this.f9841i == scrollingContainerElement.f9841i && kotlin.jvm.internal.i.a(this.j, scrollingContainerElement.j);
    }

    public final int hashCode() {
        int iB = androidx.compose.animation.D.b(androidx.compose.animation.D.b((this.f9835c.hashCode() + (this.f9834b.hashCode() * 31)) * 31, 31, this.f9836d), 31, this.f9837e);
        androidx.compose.foundation.gestures.j jVar = this.f9838f;
        int iHashCode = (iB + (jVar != null ? jVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.l lVar = this.f9839g;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.gestures.c cVar = this.f9840h;
        int iB2 = androidx.compose.animation.D.b((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f9841i);
        E e10 = this.j;
        return iB2 + (e10 != null ? e10.hashCode() : 0);
    }
}
