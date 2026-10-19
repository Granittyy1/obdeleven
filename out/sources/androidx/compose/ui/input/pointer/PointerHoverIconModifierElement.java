package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends H<l> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1151b f14033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14034c;

    public PointerHoverIconModifierElement(C1151b c1151b, boolean z10) {
        this.f14033b = c1151b;
        this.f14034c = z10;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new l(this.f14033b, this.f14034c);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        l lVar = (l) cVar;
        C1151b c1151b = lVar.f14026q;
        C1151b c1151b2 = this.f14033b;
        if (!kotlin.jvm.internal.i.a(c1151b, c1151b2)) {
            lVar.f14026q = c1151b2;
            if (lVar.f14028s) {
                lVar.S1();
            }
        }
        lVar.V1(this.f14034c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return kotlin.jvm.internal.i.a(this.f14033b, pointerHoverIconModifierElement.f14033b) && this.f14034c == pointerHoverIconModifierElement.f14034c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14034c) + (this.f14033b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerHoverIconModifierElement(icon=");
        sb2.append(this.f14033b);
        sb2.append(", overrideDescendants=");
        return Z3.o.d(sb2, this.f14034c, ')');
    }
}
