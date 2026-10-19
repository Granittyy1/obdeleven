package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;

/* JADX INFO: compiled from: SystemForegroundService.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Notification f20414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f20416e;

    public a(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f20416e = systemForegroundService;
        this.f20413b = i10;
        this.f20414c = notification;
        this.f20415d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f20415d;
        Notification notification = this.f20414c;
        int i12 = this.f20413b;
        SystemForegroundService systemForegroundService = this.f20416e;
        if (i10 >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i12, notification, i11);
        } else if (i10 >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i12, notification, i11);
        } else {
            systemForegroundService.startForeground(i12, notification);
        }
    }
}
