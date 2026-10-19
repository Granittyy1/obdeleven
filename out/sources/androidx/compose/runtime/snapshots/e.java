package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<Object, p293xa.r> f13201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13202f;

    public e(long j, SnapshotIdSet snapshotIdSet, Ia.l<Object, p293xa.r> lVar) {
        super(j, snapshotIdSet);
        this.f13201e = lVar;
        this.f13202f = 1;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void c() {
        if (this.f13206c) {
            return;
        }
        l();
        super.c();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final Ia.l e() {
        return this.f13201e;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final boolean f() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final Ia.l<Object, p293xa.r> i() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void k() {
        this.f13202f++;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void l() {
        int i10 = this.f13202f - 1;
        this.f13202f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void n(o oVar) {
        Ia.l<SnapshotIdSet, p293xa.r> lVar = SnapshotKt.f13152a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final g u(Ia.l<Object, p293xa.r> lVar) {
        SnapshotKt.d(this);
        return new c(this.f13205b, this.f13204a, SnapshotKt.l(lVar, this.f13201e, true), this);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void m() {
    }
}
