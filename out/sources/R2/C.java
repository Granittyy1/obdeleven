package R2;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: WorkForegroundUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S2.b f5204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K2.r f5205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q2.A f5206c;

    static {
        androidx.work.k.d("WMFgUpdater");
    }

    public C(WorkDatabase workDatabase, K2.r rVar, S2.b bVar) {
        this.f5205b = rVar;
        this.f5204a = bVar;
        this.f5206c = workDatabase.t();
    }
}
