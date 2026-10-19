package T4;

import S4.C0764f;
import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: renamed from: T4.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0785s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f5996b;

    public RunnableC0785s(C c10) {
        this.f5996b = c10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C c10 = this.f5996b;
        com.google.android.gms.common.a aVar = c10.f5824d;
        Context context = c10.f5823c;
        aVar.getClass();
        if (C0764f.f5539a.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }
}
