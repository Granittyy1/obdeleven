package androidx.compose.runtime.snapshots;

import androidx.collection.L;
import com.google.android.gms.internal.measurement.Y;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f13233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f13235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ia.l<Object, p293xa.r> f13236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Ia.l<Object, p293xa.r> f13237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f13238t;

    /* JADX WARN: Illegal instructions before constructor call */
    public s(a aVar, Ia.l<Object, p293xa.r> lVar, Ia.l<Object, p293xa.r> lVar2, boolean z10, boolean z11) {
        Ia.l<Object, p293xa.r> lVarI;
        Ia.l<Object, p293xa.r> lVarE;
        Ia.l<SnapshotIdSet, p293xa.r> lVar3 = SnapshotKt.f13152a;
        super(0L, SnapshotIdSet.f13147f, SnapshotKt.l(lVar, (aVar == null || (lVarE = aVar.e()) == null) ? SnapshotKt.j.f13189e : lVarE, z10), SnapshotKt.b(lVar2, (aVar == null || (lVarI = aVar.i()) == null) ? SnapshotKt.j.f13190f : lVarI));
        this.f13233o = aVar;
        this.f13234p = z10;
        this.f13235q = z11;
        this.f13236r = this.f13189e;
        this.f13237s = this.f13190f;
        this.f13238t = I.b.f();
    }

    @Override // androidx.compose.runtime.snapshots.a
    public final void B(L<o> l10) {
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.a
    public final a C(Ia.l<Object, p293xa.r> lVar, Ia.l<Object, p293xa.r> lVar2) {
        Ia.l<Object, p293xa.r> lVarL = SnapshotKt.l(lVar, this.f13236r, true);
        Ia.l<Object, p293xa.r> lVarB = SnapshotKt.b(lVar2, this.f13237s);
        return !this.f13234p ? new s(D().C(null, lVarB), lVarL, lVarB, false, true) : D().C(lVarL, lVarB);
    }

    public final a D() {
        a aVar = this.f13233o;
        return aVar == null ? SnapshotKt.j : aVar;
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final void c() {
        a aVar;
        this.f13206c = true;
        if (!this.f13235q || (aVar = this.f13233o) == null) {
            return;
        }
        aVar.c();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final SnapshotIdSet d() {
        return D().d();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final Ia.l e() {
        return this.f13236r;
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final boolean f() {
        return D().f();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final long g() {
        return D().g();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final int h() {
        return D().h();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final Ia.l<Object, p293xa.r> i() {
        return this.f13237s;
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final void k() {
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final void l() {
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final void m() {
        D().m();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final void n(o oVar) {
        D().n(oVar);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void r(SnapshotIdSet snapshotIdSet) {
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void s(long j) {
        Y.n();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final void t(int i10) {
        D().t(i10);
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final g u(Ia.l<Object, p293xa.r> lVar) {
        Ia.l<Object, p293xa.r> lVarL = SnapshotKt.l(lVar, this.f13236r, true);
        return !this.f13234p ? SnapshotKt.h(D().u(null), lVarL, true) : D().u(lVarL);
    }

    @Override // androidx.compose.runtime.snapshots.a
    public final h w() {
        return D().w();
    }

    @Override // androidx.compose.runtime.snapshots.a
    public final L<o> x() {
        return D().x();
    }

    @Override // androidx.compose.runtime.snapshots.a
    /* JADX INFO: renamed from: y */
    public final Ia.l<Object, p293xa.r> e() {
        return this.f13236r;
    }
}
