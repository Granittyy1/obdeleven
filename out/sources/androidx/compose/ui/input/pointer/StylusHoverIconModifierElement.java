package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.C1190k;
import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends H<A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1151b f14045b = androidx.compose.foundation.text.D.f11094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1190k f14046c;

    public StylusHoverIconModifierElement(C1190k c1190k) {
        this.f14046c = c1190k;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new A(this.f14045b, this.f14046c);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        A a10 = (A) cVar;
        C1151b c1151b = a10.f14026q;
        C1151b c1151b2 = this.f14045b;
        if (!kotlin.jvm.internal.i.a(c1151b, c1151b2)) {
            a10.f14026q = c1151b2;
            if (a10.f14028s) {
                a10.S1();
            }
        }
        a10.V1(false);
        a10.f14025p = this.f14046c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return kotlin.jvm.internal.i.a(this.f14045b, stylusHoverIconModifierElement.f14045b) && kotlin.jvm.internal.i.a(this.f14046c, stylusHoverIconModifierElement.f14046c);
    }

    public final int hashCode() {
        int iB = androidx.compose.animation.D.b(this.f14045b.f14069b * 31, 31, false);
        C1190k c1190k = this.f14046c;
        return iB + (c1190k != null ? c1190k.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.f14045b + ", overrideDescendants=false, touchBoundsExpansion=" + this.f14046c + ')';
    }
}
