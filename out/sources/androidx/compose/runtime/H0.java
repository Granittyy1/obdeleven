package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;

/* JADX INFO: compiled from: SnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
public class H0<T> extends androidx.compose.runtime.snapshots.p implements androidx.compose.runtime.snapshots.k<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0<T> f12846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a<T> f12847d;

    /* JADX INFO: compiled from: SnapshotState.kt */
    public static final class a<T> extends androidx.compose.runtime.snapshots.q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f12848c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, long j) {
            super(j);
            this.f12848c = obj;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final void a(androidx.compose.runtime.snapshots.q qVar) {
            kotlin.jvm.internal.i.c(qVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f12848c = ((a) qVar).f12848c;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q b() {
            return new a(this.f12848c, SnapshotKt.k().g());
        }

        @Override // androidx.compose.runtime.snapshots.q
        public final androidx.compose.runtime.snapshots.q c(long j) {
            return new a(this.f12848c, SnapshotKt.k().g());
        }
    }

    public H0(T t8, I0<T> i10) {
        this.f12846c = i10;
        androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
        a<T> aVar = new a<>(t8, gVarK.g());
        if (!(gVarK instanceof GlobalSnapshot)) {
            aVar.f13226b = new a(t8, 1);
        }
        this.f12847d = aVar;
    }

    @Override // androidx.compose.runtime.snapshots.k
    public final I0<T> a() {
        return this.f12846c;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final void e(androidx.compose.runtime.snapshots.q qVar) {
        this.f12847d = (a) qVar;
    }

    @Override // androidx.compose.runtime.N0
    public final T getValue() {
        return ((a) SnapshotKt.t(this.f12847d, this)).f12848c;
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q k() {
        return this.f12847d;
    }

    @Override // androidx.compose.runtime.X
    public final void setValue(T t8) {
        androidx.compose.runtime.snapshots.g gVarK;
        a aVar = (a) SnapshotKt.i(this.f12847d);
        if (this.f12846c.a(aVar.f12848c, t8)) {
            return;
        }
        a<T> aVar2 = this.f12847d;
        synchronized (SnapshotKt.f13154c) {
            gVarK = SnapshotKt.k();
            ((a) SnapshotKt.o(aVar2, this, gVarK, aVar)).f12848c = t8;
            p293xa.r rVar = p293xa.r.f47939a;
        }
        SnapshotKt.n(gVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a) SnapshotKt.i(this.f12847d)).f12848c + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.snapshots.o
    public final androidx.compose.runtime.snapshots.q v(androidx.compose.runtime.snapshots.q qVar, androidx.compose.runtime.snapshots.q qVar2, androidx.compose.runtime.snapshots.q qVar3) {
        if (this.f12846c.a(((a) qVar2).f12848c, ((a) qVar3).f12848c)) {
            return qVar2;
        }
        return null;
    }
}
