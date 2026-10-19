package androidx.compose.ui.layout;

/* JADX INFO: compiled from: OnRemeasuredModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class OnSizeChangedModifier extends androidx.compose.ui.node.H<U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<p013b0.l, p293xa.r> f14201b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(Ia.l<? super p013b0.l, p293xa.r> lVar) {
        this.f14201b = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new U(this.f14201b);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        U u10 = (U) cVar;
        u10.f14216p = this.f14201b;
        long j = Integer.MIN_VALUE;
        u10.f14218r = (j & 4294967295L) | (j << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f14201b == ((OnSizeChangedModifier) obj).f14201b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14201b.hashCode();
    }
}
