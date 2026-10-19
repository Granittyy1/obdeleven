package P2;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: SystemForegroundService.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Notification f4908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f4909d;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f4909d = systemForegroundService;
        this.f4907b = i10;
        this.f4908c = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4909d.f20412f.notify(this.f4907b, this.f4908c);
    }
}
