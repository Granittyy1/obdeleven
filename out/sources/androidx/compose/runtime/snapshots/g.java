package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SnapshotIdSet f13204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13207d;

    /* JADX INFO: compiled from: Snapshot.kt */
    public static final class a {
        public static g a() {
            return (g) SnapshotKt.f13153b.a();
        }

        public static g b(g gVar) {
            if (gVar instanceof s) {
                s sVar = (s) gVar;
                if (sVar.f13238t == I.b.f()) {
                    sVar.f13236r = null;
                    return gVar;
                }
            }
            if (gVar instanceof t) {
                t tVar = (t) gVar;
                if (tVar.f13242h == I.b.f()) {
                    tVar.f13241g = null;
                    return gVar;
                }
            }
            g gVarH = SnapshotKt.h(gVar, null, false);
            gVarH.j();
            return gVarH;
        }

        public static Object c(Ia.a aVar, Ia.l lVar) {
            g sVar;
            if (lVar == null) {
                return aVar.invoke();
            }
            g gVar = (g) SnapshotKt.f13153b.a();
            if (gVar instanceof s) {
                s sVar2 = (s) gVar;
                if (sVar2.f13238t == I.b.f()) {
                    Ia.l<Object, p293xa.r> lVar2 = sVar2.f13236r;
                    Ia.l<Object, p293xa.r> lVar3 = sVar2.f13237s;
                    try {
                        ((s) gVar).f13236r = SnapshotKt.l(lVar, lVar2, true);
                        ((s) gVar).f13237s = SnapshotKt.b(null, lVar3);
                        return aVar.invoke();
                    } finally {
                        sVar2.f13236r = lVar2;
                        sVar2.f13237s = lVar3;
                    }
                }
            }
            if (gVar == null || (gVar instanceof androidx.compose.runtime.snapshots.a)) {
                sVar = new s(gVar instanceof androidx.compose.runtime.snapshots.a ? (androidx.compose.runtime.snapshots.a) gVar : null, lVar, null, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                sVar = gVar.u(lVar);
            }
            try {
                g gVarJ = sVar.j();
                try {
                    Object objInvoke = aVar.invoke();
                    g.q(gVarJ);
                    sVar.c();
                    return objInvoke;
                } catch (Throwable th) {
                    g.q(gVarJ);
                    throw th;
                }
            } catch (Throwable th2) {
                sVar.c();
                throw th2;
            }
        }

        public static void d(g gVar, g gVar2, Ia.l lVar) {
            if (gVar != gVar2) {
                gVar2.getClass();
                g.q(gVar);
                gVar2.c();
            } else if (gVar instanceof s) {
                ((s) gVar).f13236r = lVar;
            } else if (gVar instanceof t) {
                ((t) gVar).f13241g = lVar;
            } else {
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
            }
        }
    }

    public g(long j, SnapshotIdSet snapshotIdSet) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f13204a = snapshotIdSet;
        this.f13205b = j;
        Ia.l<SnapshotIdSet, p293xa.r> lVar = SnapshotKt.f13152a;
        if (j != 0) {
            SnapshotIdSet snapshotIdSetD = d();
            long[] jArr = snapshotIdSetD.f13151e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j10 = snapshotIdSetD.f13149c;
                long j11 = snapshotIdSetD.f13150d;
                if (j10 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                } else {
                    long j12 = snapshotIdSetD.f13148b;
                    if (j12 != 0) {
                        j11 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j11;
            }
            synchronized (SnapshotKt.f13154c) {
                iA = SnapshotKt.f13157f.a(j);
            }
        } else {
            iA = -1;
        }
        this.f13207d = iA;
    }

    public static void q(g gVar) {
        SnapshotKt.f13153b.b(gVar);
    }

    public final void a() {
        synchronized (SnapshotKt.f13154c) {
            b();
            p();
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    public void b() {
        SnapshotKt.f13155d = SnapshotKt.f13155d.k(g());
    }

    public void c() {
        this.f13206c = true;
        synchronized (SnapshotKt.f13154c) {
            o();
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    public SnapshotIdSet d() {
        return this.f13204a;
    }

    public abstract Ia.l<Object, p293xa.r> e();

    public abstract boolean f();

    public long g() {
        return this.f13205b;
    }

    public int h() {
        return 0;
    }

    public abstract Ia.l<Object, p293xa.r> i();

    public final g j() {
        androidx.compose.runtime.internal.f fVar = SnapshotKt.f13153b;
        g gVar = (g) fVar.a();
        fVar.b(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(o oVar);

    public final void o() {
        int i10 = this.f13207d;
        if (i10 >= 0) {
            SnapshotKt.u(i10);
            this.f13207d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(SnapshotIdSet snapshotIdSet) {
        this.f13204a = snapshotIdSet;
    }

    public void s(long j) {
        this.f13205b = j;
    }

    public void t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g u(Ia.l<Object, p293xa.r> lVar);
}
