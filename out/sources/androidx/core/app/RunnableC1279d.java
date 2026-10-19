package androidx.core.app;

/* JADX INFO: renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1279d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1282g.a f16719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16720c;

    public RunnableC1279d(C1282g.a aVar, Object obj) {
        this.f16719b = aVar;
        this.f16720c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16719b.f16732b = this.f16720c;
    }
}
