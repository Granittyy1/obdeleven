package androidx.compose.runtime.snapshots;

import com.google.android.gms.internal.measurement.Y;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GlobalSnapshot extends a {
    @Override // androidx.compose.runtime.snapshots.a
    public final a C(final Ia.l<Object, p293xa.r> lVar, final Ia.l<Object, p293xa.r> lVar2) {
        return (a) ((g) SnapshotKt.f(new SnapshotKt$takeNewSnapshot$1(new Ia.l<SnapshotIdSet, a>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final a invoke(SnapshotIdSet snapshotIdSet) {
                long j;
                SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
                synchronized (SnapshotKt.f13154c) {
                    j = SnapshotKt.f13156e;
                    SnapshotKt.f13156e = 1 + j;
                }
                return new a(j, snapshotIdSet2, lVar, lVar2);
            }
        })));
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final void c() {
        synchronized (SnapshotKt.f13154c) {
            o();
            p293xa.r rVar = p293xa.r.f47939a;
        }
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
        SnapshotKt.a();
    }

    @Override // androidx.compose.runtime.snapshots.a, androidx.compose.runtime.snapshots.g
    public final g u(final Ia.l<Object, p293xa.r> lVar) {
        return (e) ((g) SnapshotKt.f(new SnapshotKt$takeNewSnapshot$1(new Ia.l<SnapshotIdSet, e>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final e invoke(SnapshotIdSet snapshotIdSet) {
                long j;
                SnapshotIdSet snapshotIdSet2 = snapshotIdSet;
                synchronized (SnapshotKt.f13154c) {
                    j = SnapshotKt.f13156e;
                    SnapshotKt.f13156e = 1 + j;
                }
                return new e(j, snapshotIdSet2, lVar);
            }
        })));
    }

    @Override // androidx.compose.runtime.snapshots.a
    public final h w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
