package androidx.core.app;

import android.app.Application;

/* JADX INFO: renamed from: androidx.core.app.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1280e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f16721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1282g.a f16722c;

    public RunnableC1280e(Application application, C1282g.a aVar) {
        this.f16721b = application;
        this.f16722c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16721b.unregisterActivityLifecycleCallbacks(this.f16722c);
    }
}
