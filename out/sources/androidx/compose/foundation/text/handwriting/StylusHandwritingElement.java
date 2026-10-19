package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.h;
import androidx.compose.ui.node.H;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: StylusHandwriting.kt */
/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElement extends H<StylusHandwritingNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.a<r> f11255b;

    public StylusHandwritingElement(Ia.a<r> aVar) {
        this.f11255b = aVar;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        return new StylusHandwritingNode(this.f11255b);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        ((StylusHandwritingNode) cVar).f11256r = this.f11255b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && i.a(this.f11255b, ((StylusHandwritingElement) obj).f11255b);
    }

    public final int hashCode() {
        return this.f11255b.hashCode();
    }

    public final String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.f11255b + ')';
    }
}
