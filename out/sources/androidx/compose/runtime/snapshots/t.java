package androidx.compose.runtime.snapshots;

import com.google.android.gms.internal.measurement.Y;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f13239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Ia.l<Object, p293xa.r> f13241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13242h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g gVar, Ia.l lVar, boolean z10) {
        Ia.l<Object, p293xa.r> lVarE;
        super(0L, SnapshotIdSet.f13147f);
        Ia.l<SnapshotIdSet, p293xa.r> lVar2 = SnapshotKt.f13152a;
        this.f13239e = gVar;
        this.f13240f = z10;
        this.f13241g = SnapshotKt.l(lVar, (gVar == null || (lVarE = gVar.e()) == null) ? SnapshotKt.j.f13189e : lVarE, false);
        this.f13242h = I.b.f();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void c() {
        g gVar;
        this.f13206c = true;
        if (!this.f13240f || (gVar = this.f13239e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final SnapshotIdSet d() {
        return v().d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final Ia.l e() {
        return this.f13241g;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final boolean f() {
        return v().f();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final long g() {
        return v().g();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final Ia.l<Object, p293xa.r> i() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void k() {
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void l() {
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void m() {
        v().m();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void n(o oVar) {
        v().n(oVar);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final g u(Ia.l<Object, p293xa.r> lVar) {
        return SnapshotKt.h(v().u(null), SnapshotKt.l(lVar, this.f13241g, true), true);
    }

    public final g v() {
        g gVar = this.f13239e;
        return gVar == null ? SnapshotKt.j : gVar;
    }
}
