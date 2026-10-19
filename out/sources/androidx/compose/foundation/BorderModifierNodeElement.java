package androidx.compose.foundation;

import androidx.compose.ui.graphics.l0;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends androidx.compose.ui.node.H<BorderModifierNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.graphics.C f9722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f9723d;

    public BorderModifierNodeElement(float f10, androidx.compose.ui.graphics.C c10, l0 l0Var) {
        this.f9721b = f10;
        this.f9722c = c10;
        this.f9723d = l0Var;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new BorderModifierNode(this.f9721b, this.f9722c, this.f9723d);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        BorderModifierNode borderModifierNode = (BorderModifierNode) cVar;
        float f10 = borderModifierNode.f9717s;
        float f11 = this.f9721b;
        boolean zA = p013b0.f.a(f10, f11);
        androidx.compose.ui.draw.b bVar = borderModifierNode.f9720v;
        if (!zA) {
            borderModifierNode.f9717s = f11;
            bVar.V();
        }
        androidx.compose.ui.graphics.C c10 = borderModifierNode.f9718t;
        androidx.compose.ui.graphics.C c11 = this.f9722c;
        if (!kotlin.jvm.internal.i.a(c10, c11)) {
            borderModifierNode.f9718t = c11;
            bVar.V();
        }
        l0 l0Var = borderModifierNode.f9719u;
        l0 l0Var2 = this.f9723d;
        if (kotlin.jvm.internal.i.a(l0Var, l0Var2)) {
            return;
        }
        borderModifierNode.f9719u = l0Var2;
        bVar.V();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return p013b0.f.a(this.f9721b, borderModifierNodeElement.f9721b) && kotlin.jvm.internal.i.a(this.f9722c, borderModifierNodeElement.f9722c) && kotlin.jvm.internal.i.a(this.f9723d, borderModifierNodeElement.f9723d);
    }

    public final int hashCode() {
        return this.f9723d.hashCode() + ((this.f9722c.hashCode() + (Float.hashCode(this.f9721b) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) p013b0.f.b(this.f9721b)) + ", brush=" + this.f9722c + ", shape=" + this.f9723d + ')';
    }
}
