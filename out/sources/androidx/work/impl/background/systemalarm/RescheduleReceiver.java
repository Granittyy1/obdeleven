package androidx.work.impl.background.systemalarm;

import K2.K;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.k;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20377a = k.d("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        k kVarC = k.c();
        Objects.toString(intent);
        kVarC.getClass();
        try {
            K kB = K.b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            kB.getClass();
            synchronized (K.f4143m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = kB.f4152i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    kB.f4152i = pendingResultGoAsync;
                    if (kB.f4151h) {
                        pendingResultGoAsync.finish();
                        kB.f4152i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e10) {
            k.c().b(f20377a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
