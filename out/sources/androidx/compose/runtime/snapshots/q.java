package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f13226b;

    public q(long j) {
        this.f13225a = j;
    }

    public abstract void a(q qVar);

    public abstract q b();

    public q c(long j) {
        q qVarB = b();
        qVarB.f13225a = j;
        return qVarB;
    }

    public q() {
        this(SnapshotKt.k().g());
    }
}
