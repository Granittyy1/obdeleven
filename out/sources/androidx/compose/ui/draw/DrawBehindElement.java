package androidx.compose.ui.draw;

import Ia.l;
import androidx.compose.ui.node.H;
import p293xa.r;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends H<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<J.e, r> f13372b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(l<? super J.e, r> lVar) {
        this.f13372b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        c cVar = new c();
        cVar.f13392p = this.f13372b;
        return cVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((c) cVar).f13392p = this.f13372b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && kotlin.jvm.internal.i.a(this.f13372b, ((DrawBehindElement) obj).f13372b);
    }

    public final int hashCode() {
        return this.f13372b.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f13372b + ')';
    }
}
