package androidx.compose.runtime.snapshots;

import com.google.android.gms.internal.measurement.Y;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<Object, p293xa.r> f13199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f13200f;

    public c(long j, SnapshotIdSet snapshotIdSet, Ia.l<Object, p293xa.r> lVar, g gVar) {
        super(j, snapshotIdSet);
        this.f13199e = lVar;
        this.f13200f = gVar;
        gVar.k();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void c() {
        if (this.f13206c) {
            return;
        }
        long j = this.f13205b;
        g gVar = this.f13200f;
        if (j != gVar.g()) {
            a();
        }
        gVar.l();
        super.c();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final Ia.l e() {
        return this.f13199e;
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
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void l() {
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void n(o oVar) {
        Ia.l<SnapshotIdSet, p293xa.r> lVar = SnapshotKt.f13152a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final g u(Ia.l lVar) {
        return new c(this.f13205b, this.f13204a, SnapshotKt.l(lVar, this.f13199e, true), this.f13200f);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void m() {
    }
}
