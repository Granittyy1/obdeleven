package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
public class G0 extends androidx.compose.runtime.snapshots.p implements W, androidx.compose.runtime.snapshots.k<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f12843c;

    /* JADX INFO: compiled from: SnapshotLongState.kt */
    public static final class a extends androidx.compose.runtime.snapshots.q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f12844c;

        public a(long j, long j10) {
            super(j);
            this.f12844c = j10;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final void a(androidx.compose.runtime.snapshots.q qVar) {
            kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f12844c = ((a) qVar).f12844c;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q b() {
            return c(SnapshotKt.k().g());
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q c(long j) {
            return new a(j, this.f12844c);
        }
    }

    @Override // androidx.compose.runtime.snapshots.k
    public final I0<Long> a() {
        return Q0.f12888a;
    }

    @Override // androidx.compose.runtime.W
    public final long b() {
        return ((a) SnapshotKt.t(this.f12843c, this)).f12844c;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final void e(androidx.compose.runtime.snapshots.q qVar) {
        this.f12843c = (a) qVar;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q k() {
        return this.f12843c;
    }

    @Override // androidx.compose.runtime.W
    public final void t(long j) {
        androidx.compose.runtime.snapshots.g gVarK;
        a aVar = (a) SnapshotKt.i(this.f12843c);
        if (aVar.f12844c != j) {
            a aVar2 = this.f12843c;
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                ((a) SnapshotKt.o(aVar2, this, gVarK, aVar)).f12844c = j;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            SnapshotKt.n(gVarK, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((a) SnapshotKt.i(this.f12843c)).f12844c + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q v(androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.snapshots.q qVar2, androidx.compose.runtime.snapshots.q qVar3) {
        if (((a) qVar2).f12844c == ((a) qVar3).f12844c) {
            return qVar2;
        }
        return null;
    }
}
