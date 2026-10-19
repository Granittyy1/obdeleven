package androidx.compose.ui.layout;

/* JADX INFO: compiled from: OnGloballyPositionedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends androidx.compose.ui.node.H<P> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<InterfaceC1170p, p293xa.r> f14200b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(Ia.l<? super InterfaceC1170p, p293xa.r> lVar) {
        this.f14200b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        P p10 = new P();
        p10.f14202p = this.f14200b;
        return p10;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((P) cVar).f14202p = this.f14200b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f14200b == ((OnGloballyPositionedElement) obj).f14200b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14200b.hashCode();
    }
}
