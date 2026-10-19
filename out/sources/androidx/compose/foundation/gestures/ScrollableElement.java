package androidx.compose.foundation.gestures;

import androidx.compose.animation.D;
import androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1;
import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
final class ScrollableElement extends H<ScrollableNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 f9960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Orientation f9961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f9964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.k f9965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f9966h;

    public ScrollableElement(TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, Orientation orientation, boolean z10, boolean z11, j jVar, androidx.compose.foundation.interaction.k kVar, c cVar) {
        this.f9960b = textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1;
        this.f9961c = orientation;
        this.f9962d = z10;
        this.f9963e = z11;
        this.f9964f = jVar;
        this.f9965g = kVar;
        this.f9966h = cVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        androidx.compose.foundation.interaction.k kVar = this.f9965g;
        return new ScrollableNode(null, this.f9966h, this.f9964f, this.f9961c, this.f9960b, kVar, this.f9962d, this.f9963e);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        androidx.compose.foundation.interaction.k kVar = this.f9965g;
        c cVar2 = this.f9966h;
        TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 = this.f9960b;
        ((ScrollableNode) cVar).c2(null, cVar2, this.f9964f, this.f9961c, textFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1, kVar, this.f9962d, this.f9963e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return kotlin.jvm.internal.i.a(this.f9960b, scrollableElement.f9960b) && this.f9961c == scrollableElement.f9961c && kotlin.jvm.internal.i.a(null, null) && this.f9962d == scrollableElement.f9962d && this.f9963e == scrollableElement.f9963e && kotlin.jvm.internal.i.a(this.f9964f, scrollableElement.f9964f) && kotlin.jvm.internal.i.a(this.f9965g, scrollableElement.f9965g) && kotlin.jvm.internal.i.a(this.f9966h, scrollableElement.f9966h);
    }

    public final int hashCode() {
        int iB = D.b(D.b((this.f9961c.hashCode() + (hashCode() * 31)) * 961, 31, this.f9962d), 31, this.f9963e);
        j jVar = this.f9964f;
        int iHashCode = (iB + (jVar != null ? jVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.k kVar = this.f9965g;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        c cVar = this.f9966h;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
