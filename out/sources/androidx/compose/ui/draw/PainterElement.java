package androidx.compose.ui.draw;

import androidx.compose.animation.D;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1192m;
import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends H<PainterNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Painter f13375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.d f13377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1161g f13378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final I f13380g;

    public PainterElement(Painter painter, boolean z10, androidx.compose.ui.d dVar, InterfaceC1161g interfaceC1161g, float f10, I i10) {
        this.f13375b = painter;
        this.f13376c = z10;
        this.f13377d = dVar;
        this.f13378e = interfaceC1161g;
        this.f13379f = f10;
        this.f13380g = i10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        PainterNode painterNode = new PainterNode();
        painterNode.f13381p = this.f13375b;
        painterNode.f13382q = this.f13376c;
        painterNode.f13383r = this.f13377d;
        painterNode.f13384s = this.f13378e;
        painterNode.f13385t = this.f13379f;
        painterNode.f13386u = this.f13380g;
        return painterNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        PainterNode painterNode = (PainterNode) cVar;
        boolean z10 = painterNode.f13382q;
        Painter painter = this.f13375b;
        boolean z11 = this.f13376c;
        boolean z12 = z10 != z11 || (z11 && !I.h.a(painterNode.f13381p.h(), painter.h()));
        painterNode.f13381p = painter;
        painterNode.f13382q = z11;
        painterNode.f13383r = this.f13377d;
        painterNode.f13384s = this.f13378e;
        painterNode.f13385t = this.f13379f;
        painterNode.f13386u = this.f13380g;
        if (z12) {
            C1185f.f(painterNode).O();
        }
        C1192m.a(painterNode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return kotlin.jvm.internal.i.a(this.f13375b, painterElement.f13375b) && this.f13376c == painterElement.f13376c && kotlin.jvm.internal.i.a(this.f13377d, painterElement.f13377d) && kotlin.jvm.internal.i.a(this.f13378e, painterElement.f13378e) && Float.compare(this.f13379f, painterElement.f13379f) == 0 && kotlin.jvm.internal.i.a(this.f13380g, painterElement.f13380g);
    }

    public final int hashCode() {
        int iD = O.a.d(this.f13379f, (this.f13378e.hashCode() + ((this.f13377d.hashCode() + D.b(this.f13375b.hashCode() * 31, 31, this.f13376c)) * 31)) * 31, 31);
        I i10 = this.f13380g;
        return iD + (i10 == null ? 0 : i10.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f13375b + ", sizeToIntrinsics=" + this.f13376c + ", alignment=" + this.f13377d + ", contentScale=" + this.f13378e + ", alpha=" + this.f13379f + ", colorFilter=" + this.f13380g + ')';
    }
}
