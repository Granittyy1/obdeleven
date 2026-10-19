package androidx.compose.ui.semantics;

import androidx.compose.ui.node.b0;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.compose.ui.h.c implements b0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f15195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ia.l<? super w, p293xa.r> f15196r;

    public d(boolean z10, boolean z11, Ia.l<? super w, p293xa.r> lVar) {
        this.f15194p = z10;
        this.f15195q = z11;
        this.f15196r = lVar;
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(w wVar) {
        this.f15196r.invoke(wVar);
    }

    @Override // androidx.compose.ui.node.b0
    public final boolean v0() {
        return this.f15195q;
    }

    @Override // androidx.compose.ui.node.b0
    public final boolean v1() {
        return this.f15194p;
    }
}
