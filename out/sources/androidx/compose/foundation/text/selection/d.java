package androidx.compose.foundation.text.selection;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.compose.ui.window.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.d f11595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f11596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11597c = 0;

    public d(androidx.compose.ui.d dVar, f fVar) {
        this.f11595a = dVar;
        this.f11596b = fVar;
    }

    @Override // androidx.compose.ui.window.m
    public final long a(p013b0.k kVar, long j, LayoutDirection layoutDirection, long j10) {
        long jA = this.f11596b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f11597c;
        }
        this.f11597c = jA;
        return p013b0.j.d(p013b0.j.d(kVar.c(), Cb.a.l(jA)), this.f11595a.a(j10, 0L, layoutDirection));
    }
}
