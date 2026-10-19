package androidx.compose.ui.input.rotary;

import Ia.l;
import Q.b;
import Q.c;
import androidx.compose.ui.h;
import androidx.compose.ui.node.H;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: RotaryInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends H<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<c, Boolean> f14151b;

    public RotaryInputElement(l lVar) {
        this.f14151b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        b bVar = new b();
        bVar.f4980p = this.f14151b;
        return bVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        ((b) cVar).f4980p = this.f14151b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return i.a(this.f14151b, ((RotaryInputElement) obj).f14151b) && i.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        l<c, Boolean> lVar = this.f14151b;
        return (lVar == null ? 0 : lVar.hashCode()) * 31;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f14151b + ", onPreRotaryScrollEvent=null)";
    }
}
