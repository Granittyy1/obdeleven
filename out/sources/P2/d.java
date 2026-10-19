package P2;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: SystemForegroundService.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f4911c;

    public d(SystemForegroundService systemForegroundService, int i10) {
        this.f4911c = systemForegroundService;
        this.f4910b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4911c.f20412f.cancel(this.f4910b);
    }
}
