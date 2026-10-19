package androidx.compose.ui.draw;

import Ia.l;
import androidx.compose.ui.node.H;
import p293xa.r;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends H<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<J.c, r> f13374b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(l<? super J.c, r> lVar) {
        this.f13374b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        h hVar = new h();
        hVar.f13394p = this.f13374b;
        return hVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((h) cVar).f13394p = this.f13374b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && kotlin.jvm.internal.i.a(this.f13374b, ((DrawWithContentElement) obj).f13374b);
    }

    public final int hashCode() {
        return this.f13374b.hashCode();
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f13374b + ')';
    }
}
