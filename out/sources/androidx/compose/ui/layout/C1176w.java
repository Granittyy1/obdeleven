package androidx.compose.ui.layout;

import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: renamed from: androidx.compose.ui.layout.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1176w extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ia.q<? super H, ? super D, ? super p013b0.a, ? extends F> f14258p;

    public C1176w() {
        throw null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final F B(H h8, D d10, long j) {
        return this.f14258p.invoke(h8, d10, new p013b0.a(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f14258p + ')';
    }
}
