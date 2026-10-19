package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;

/* JADX INFO: compiled from: SnapshotIntState.kt */
/* JADX INFO: loaded from: classes.dex */
public class F0 extends androidx.compose.runtime.snapshots.p implements V, androidx.compose.runtime.snapshots.k<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f12837c;

    /* JADX INFO: compiled from: SnapshotIntState.kt */
    public static final class a extends androidx.compose.runtime.snapshots.q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12838c;

        public a(int i10, long j) {
            super(j);
            this.f12838c = i10;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final void a(androidx.compose.runtime.snapshots.q qVar) {
            kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f12838c = ((a) qVar).f12838c;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q b() {
            return c(SnapshotKt.k().g());
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q c(long j) {
            return new a(this.f12838c, j);
        }
    }

    @Override // androidx.compose.runtime.snapshots.k
    public final I0<Integer> a() {
        return Q0.f12888a;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final void e(androidx.compose.runtime.snapshots.q qVar) {
        this.f12837c = (a) qVar;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q k() {
        return this.f12837c;
    }

    @Override // androidx.compose.runtime.V
    public final void m(int i10) {
        androidx.compose.runtime.snapshots.g gVarK;
        a aVar = (a) SnapshotKt.i(this.f12837c);
        if (aVar.f12838c != i10) {
            a aVar2 = this.f12837c;
            synchronized (SnapshotKt.f13154c) {
                gVarK = SnapshotKt.k();
                ((a) SnapshotKt.o(aVar2, this, gVarK, aVar)).f12838c = i10;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            SnapshotKt.n(gVarK, this);
        }
    }

    @Override // androidx.compose.runtime.V
    public final int o() {
        return ((a) SnapshotKt.t(this.f12837c, this)).f12838c;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((a) SnapshotKt.i(this.f12837c)).f12838c + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q v(androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.snapshots.q qVar2, androidx.compose.runtime.snapshots.q qVar3) {
        if (((a) qVar2).f12838c == ((a) qVar3).f12838c) {
            return qVar2;
        }
        return null;
    }
}
