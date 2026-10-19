package androidx.compose.ui.layout;

import androidx.compose.ui.node.InterfaceC1197s;

/* JADX INFO: compiled from: OnRemeasuredModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class U extends androidx.compose.ui.h.c implements InterfaceC1197s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ia.l<? super p013b0.l, p293xa.r> f14216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14217q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f14218r;

    public U(Ia.l<? super p013b0.l, p293xa.r> lVar) {
        this.f14216p = lVar;
        long j = Integer.MIN_VALUE;
        this.f14218r = (j & 4294967295L) | (j << 32);
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return this.f14217q;
    }

    @Override // androidx.compose.ui.node.InterfaceC1197s
    public final void T(long j) {
        if (p013b0.l.b(this.f14218r, j)) {
            return;
        }
        this.f14216p.invoke(new p013b0.l(j));
        this.f14218r = j;
    }
}
