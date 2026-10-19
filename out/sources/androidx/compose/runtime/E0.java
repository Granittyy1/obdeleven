package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;

/* JADX INFO: compiled from: SnapshotFloatState.kt */
/* JADX INFO: loaded from: classes.dex */
public class E0 extends androidx.compose.runtime.snapshots.p implements U, androidx.compose.runtime.snapshots.k<Float> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f12832c;

    /* JADX INFO: compiled from: SnapshotFloatState.kt */
    public static final class a extends androidx.compose.runtime.snapshots.q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f12833c;

        public a(float f10, long j) {
            super(j);
            this.f12833c = f10;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final void a(androidx.compose.runtime.snapshots.q qVar) {
            kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f12833c = ((a) qVar).f12833c;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q b() {
            return c(SnapshotKt.k().g());
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q c(long j) {
            return new a(this.f12833c, j);
        }
    }

    @Override // androidx.compose.runtime.snapshots.k
    public final I0<Float> a() {
        return Q0.f12888a;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final void e(androidx.compose.runtime.snapshots.q qVar) {
        this.f12832c = (a) qVar;
    }

    @Override // androidx.compose.runtime.U
    public final void f(float f10) {
        androidx.compose.runtime.snapshots.g gVarK;
        a aVar = (a) SnapshotKt.i(this.f12832c);
        if (aVar.f12833c == f10) {
            return;
        }
        a aVar2 = this.f12832c;
        synchronized (SnapshotKt.f13154c) {
            gVarK = SnapshotKt.k();
            ((a) SnapshotKt.o(aVar2, this, gVarK, aVar)).f12833c = f10;
            p293xa.r rVar = p293xa.r.f47939a;
        }
        SnapshotKt.n(gVarK, this);
    }

    @Override // androidx.compose.runtime.U
    public final float j() {
        return ((a) SnapshotKt.t(this.f12832c, this)).f12833c;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q k() {
        return this.f12832c;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((a) SnapshotKt.i(this.f12832c)).f12833c + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q v(androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.snapshots.q qVar2, androidx.compose.runtime.snapshots.q qVar3) {
        if (((a) qVar2).f12833c == ((a) qVar3).f12833c) {
            return qVar2;
        }
        return null;
    }
}
